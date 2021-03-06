package edu.fiu.ffqr.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.fiu.ffqr.models.Admin;
import edu.fiu.ffqr.models.ResearchInstitution;

@Repository
public interface ResearchInstitutionRepository extends MongoRepository<ResearchInstitution, String> {

  ResearchInstitution getObjectBy_id(ObjectId _id);

  ResearchInstitution getByResearchInstitutionId(String researchInstitutionId);
	
  ResearchInstitution findByInstitutionName(String institutionName);
  
    
}