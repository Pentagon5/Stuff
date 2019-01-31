package com.verizon.repo;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.verizon.model.Vast;

public interface VastRepository extends PagingAndSortingRepository<Vast, Long>{
	
	Vast findByVastApplID(String vastApplID);
	
	
	Vast findByVastID(String vastID); 
	
	Vast findByVastAcronym(String vastAcronym);
	
/*	List<Vast> findByVastBusinessUnit(String bunit);
	
	@Query(value="{ 'vastApplID' : {$exists:?0}}", fields = "{'vastApplID' : 1,'vastAcronym':1,'vastAppName':1,'vastBusinessUnit':1}")
	List<Vast> getbunit(boolean vastAppIdPresent);
	
	@Query(value="{ $or: [ {'vastCustodianContactEid' : ?0},{'vastTierFiveContactEid' : ?0 },{'vastTierFourContactEid' : ?0},{'vastTierThreeContactEid' : ?0} ] }", fields = "{'vastApplID' : 1,'vastBusinessUnit':1}")
	List<Vast> getExecutiveApplications(String eid);

	@Query(value="{ 'vastApplID' : {$exists:?0}}", fields = "{'vastApplID' : 1,'vastAcronym':1,'vastAppName':1,'vastBusinessUnit':1}")
	List<Vast> getAllVastInfo(boolean vastAppIdPresent);
	
	@Query(value="{ 'vastApplID' : ?0 }")
	Vast getBusinessUnitByAppId(String vastAppId);*/

}