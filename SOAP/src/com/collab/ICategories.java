package com.collab;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="CatName", targetNamespace="http://tblns.com")
@SOAPBinding(style = Style.RPC)
public interface ICategories {
	
	@WebMethod(action="CatFetchAction", operationName="CatFetchOprnNm")
	@WebResult(partName="CatOutput")
	Category getCategory(int categoryId);
}


