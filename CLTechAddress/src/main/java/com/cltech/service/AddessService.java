package com.cltech.service;

import com.cltech.crud.bean.*;
import com.cltech.model.AddressModel;



import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface AddessService {

	ResponseBean saveAddress(AddressModel address_model);

	ResponseBean getAllAddress();
	
	AddressModel updateAddress(AddressModel address_model);
	
	ResponseBean DeleteById(Long id);
	
	ResponseBean getAddressById(Long id);


	// get by id
//	update 
//	delete by id

	// get by employee id optional

}
