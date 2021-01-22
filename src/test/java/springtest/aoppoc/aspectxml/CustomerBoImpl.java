package springtest.aoppoc.aspectxml;

public class CustomerBoImpl implements CustomerBo {

	public void addCustomer(){
		System.out.println("==========> CustomerBoImpl::addCustomer");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("==========> CustomerBoImpl::addCustomerReturnValue");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("==========> CustomerBoImpl::addCustomerThrowException");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name){
		System.out.println("==========> CustomerBoImpl::addCustomerAround");
	}

	@Override
	public void testFunction() {
		System.out.println("==========> CustomerBoImpl::testFunction");
	}
}