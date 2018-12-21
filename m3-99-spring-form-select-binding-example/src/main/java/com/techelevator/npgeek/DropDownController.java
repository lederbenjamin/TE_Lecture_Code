package com.techelevator.npgeek;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.npgeek.model.State;

@Controller
public class DropDownController {

	/*
	 * GET method to show the form. 
	 */
	@RequestMapping(path={"/","/stateSelect"}, method=RequestMethod.GET)
	public String showDropDownExample(Model modelHolder, ModelMap map) {
		
		/*
		 * Since this is using a Spring Form the Java Bean being bound to the form
		 * needs to be placed in the model.   The key here must be the key used in the ModelAttributes attribute 
		 * 
		 * Setting the value in the Java Bean that is associated with the select field (drop down) will
		 * cause the value to be selected when the page is displayed.   
		 * 
		 * It is set to blank which has a key in the state map to show "-- Select a State --" to the user.  
		 * The key is empty string so if the user does not make selection, then the validators @NotBlank annotation 
		 * on the bean will generate an error.
		 */
		if(! modelHolder.containsAttribute("selectedState")) {
			State state = new State();  
			state.setState("");
			modelHolder.addAttribute("selectedState", state);
		}
		
		/*
		 * Put the map to bind to the Drop Down list in RequestScope (using ModelMap) so it is available on the JSP
		 * The key here must be unique to the list
		 */
		map.put("stateList", getStateMap());
		
		/*
		 * Return the logical view name of the JSP to display
		 */
		return "dropDownExample";
			
	}
	
	
	/*
	 * POST method for the form to submit to.
	 * 
	 * The @Valid and @ModelAttribute binds the form to the bean with the key "selectedState" and will call the validators
	 * on the Java Bean.   The BindingResult will hold the result of the validation.   The RedirectAttributes is so a FlashAttribute
	 * can be used for any validation errors.   This is not required, but if it is not used then the state map for the drop down list
	 * will need to be put back into the RequestScope.  By using a redirect the original GET can be the sole source of that list. 
	 */
	@RequestMapping(path="/stateSelect", method=RequestMethod.POST)
	public String handleSelectState(@Valid @ModelAttribute("selectedState") State state, BindingResult result, RedirectAttributes attr) {
		
		/*
		 *  Put the recieved state object into a flash attribute with the selectedState key.
		 *  This is not required unless a redirect back to the GET is used and the state that was selected is needed.
		 *  
		 *  This could also be in the if (result.hasErrors()) block, but in this case we want it there so when the page
		 *  redisplays after the redirect it will have access to the selected state with or without errors so it can 
		 *  keep the users selection in the drop down and display the selected state page.   On an actual page this may or may not be
		 *  needed, depending on the designed workflow of the controllers.
		 */
		
		attr.addFlashAttribute("selectedState", state);
		if (result.hasErrors()) {
			
			/*
			 * If the BindingResult has errors then validation has failed, so add the BindingResult as a flash Attribute with a 
			 * key that is the BindingResult.MODEL_KEY_PREFIX + the path on the form, so it can show the errors after the redirect
			 */
			attr.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "selectedState", result);
			
			/*
			 *  Redirect to the original GET.  Everything needed is in a FlashAttribute so the error will display and the users
			 *  selection will remain selected in the drop down field.
			 */
			return "redirect:/stateSelect";
		}
	
		
		/*
		 * The form is valid, so here is where you would do anything you need with the form, like save it to a database or call
		 * other methods in the model.  
		 */
		
		/*
		 * Redirect to the next controller.  In this case it is going back to the original GET so it will demonstrate that the users
		 * selection is still selected in the drop down field and show the value that was recieved on the form post (the state code)
		 */
		return "redirect:/stateSelect";
	}
	
	
	
	/*
	 * Private method to create out list.
	 * The Key in the map (e.g. AK) will be the value (what is returned by the form) in the HTML Select option
	 * The Value in the map (e.g. Alaska) will be the text (what is shown to the user) in the HTML select option
	 */
	private Map<String, String> getStateMap() {
		Map<String, String> states = new LinkedHashMap<String, String>();
		states.put("", "-- Select a State --");
	    states.put("AK", "Alaska");
	    states.put("AL", "Alabama");
	    states.put("AR", "Arkansas");
	    states.put("AZ", "Arizona");
	    states.put("CA", "California");
	    states.put("CO", "Colorado");
	    states.put("CT", "Connecticut");
	    states.put("DC", "District of Columbia");
	    states.put("DE", "Delaware");
	    states.put("FL", "Florida");
	    states.put("GA", "Georgia");
	    states.put("HI", "Hawaii");
	    states.put("IA", "Iowa");
	    states.put("ID", "Idaho");
	    states.put("IL", "Illinois");
	    states.put("IN", "Indiana");
	    states.put("KS", "Kansas");
	    states.put("KY", "Kentucky");
	    states.put("LA", "Louisiana");
	    states.put("MA", "Massachusetts");
	    states.put("MD", "Maryland");
	    states.put("ME", "Maine");
	    states.put("MI", "Michigan");
	    states.put("MN", "Minnesota");
	    states.put("MO", "Missouri");
	    states.put("MS", "Mississippi");
	    states.put("MT", "Montana");
	    states.put("NC", "North Carolina");
	    states.put("ND", "North Dakota");
	    states.put("NE", "Nebraska");
	    states.put("NH", "New Hampshire");
	    states.put("NJ", "New Jersey");
	    states.put("NM", "New Mexico");
	    states.put("NV", "Nevada");
	    states.put("NY", "New York");
	    states.put("OH", "Ohio");
	    states.put("OK", "Oklahoma");
	    states.put("OR", "Oregon");
	    states.put("PA", "Pennsylvania");
	    states.put("RI", "Rhode Island");
	    states.put("SC", "South Carolina");
	    states.put("SD", "South Dakota");
	    states.put("TN", "Tennessee");
	    states.put("TX", "Texas");
	    states.put("UT", "Utah");
	    states.put("VA", "Virginia");
	    states.put("VT", "Vermont");
	    states.put("WA", "Washington");
	    states.put("WI", "Wisconsin");
	    states.put("WV", "West Virginia");
	    states.put("WY", "Wyoming");
	    states.put("GU", "Guam");
	    states.put("VI", "Virgin Islands");
	    states.put("PR", "Puerto Rico");
	    states.put("AE", "Armed forces - Europe");
	    states.put("AA", "Armed forces - America");
	    states.put("AP", "Armed forces - Pacific");
		return states;
	}
	
	
}
