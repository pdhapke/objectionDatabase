
CREATE DATABASE objection_database; 

use objection_database; 

--this will create the context table 
--primary key is the case_ID, no foregin keys. 
--one to many relationship with witnesses


--this will create the witness table
--primary key is the witness_ID, foregin key is case_ID. 
--one to many relationship with questions




--this will create the questions table
--primary key is the question_ID, foregin key is witness_ID. 
--one to many relationship with correct_objection


--this will create the correct_objection table
--primary key is the correct_objection_ID, functions also as a bridging table using two foreign keys question_id and objection_id. 
--one to many relationship with witnesses



--this will create the objection table


