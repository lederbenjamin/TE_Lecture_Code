-- left join (get all of the doughnuts and their associated filling, even if they aren't filled)
select d.name, f.name
from doughnut d
left join filling f
on d.filling_id = f.id;

-- right join (get all of the fillings and their associated doughnuts, even if the filling is not used)
select d.name, f.name
from doughnut d 
right join filling f
on d.filling_id = f.id;

-- inner join (only get the dougnuts and fillings that are an exact match)
select d.name, f.name
from doughnut d
join filling f
on d.filling_id = f.id;

-- left outer join (only the doughnuts that don't have a filling)
select d.name, f.name
from doughnut d
left join filling f
on d.filling_id = f.id
where f.id is null;

-- right outer join (only the fillings that aren't used in a doughnut)
select d.name, f.name
from doughnut d
right join filling f
on d.filling_id = f.id
where d.id is null;

-- full outer join (get all of the doughnuts and all of the fillings regardless of whether they are filled or the filling is used)
select d.name, f.name
from doughnut d
full outer join filling f
on d.filling_id = f.id;

-- outer join (get all of the doughnuts that don't have a filling, and any fillings that aren't being used)
select d.name, f.name
from doughnut d
full outer join filling f
on d.filling_id = f.id
where d.id is null
or f.id is null;

