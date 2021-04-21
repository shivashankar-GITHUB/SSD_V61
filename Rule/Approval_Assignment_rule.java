package com.bs;

import sailpoint.object.Workflow.Approval;

import java.util.ArrayList;
import java.util.List;

import sailpoint.object.ApprovalItem;
import sailpoint.object.ApprovalSet;    
import sailpoint.object.ManagedAttribute;
import sailpoint.object.Filter;
import sailpoint.tools.Util;

public class Approval_Assignment_rule {
	
	//public static  String Common_method(ApprovalSet approvalSetObj) {
		/*String approvalLevel =null;
		 List approvalItems = approvalSetObj.getItems();
	        for ( ApprovalItem approvalItemObj : approvalItems ) {
	            String groupName = approvalItemObj.getDisplayValue();
		        String appName = approvalItemObj.getApplication();
             Filter maFilter1 = Filter.or(Filter.eq("displayName", groupName), Filter.eq("value", groupName));
             Filter maFilter2 = Filter.eq("application.name", appName);
             Filter maFilter = Filter.and(maFilter1, maFilter2); 
             ManagedAttribute ma = context.getUniqueObject(ManagedAttribute.class, maFilter);
	            if(null != ma){
	               approvalLevel = (String) ma.getAttribute("extensionAttribute2");
	            }else{
	                System.out.println("Error : There is no managedAttribute :");
	            }
	}
	        return approvalLevel;
	}
	public static void main(String[] args) {
	    
	    List newApprovals = new ArrayList();
	    List newChildApprovals = new ArrayList();
	    
	    String securityAssuranceName = getCustomData("assuranceTeamName", "LIN-Custom-Group-Configurations");
	    if ( approvals != null ) {
	        for ( Approval approval : approvals ) {
				if ( approval != null ) {
					 String ownerName = approval.getOwner();
				    List childApprovalList = approval.getChildren();
				    if(childApprovalList!=null){
					    for ( Approval childApproval : childApprovalList ){
					    	String ownerName = childApproval.getOwner();
						    ApprovalSet approvalSetObj = childApproval.getApprovalSet();
					    	String approvalLevel = Common_method(approvalSetObj);
					                if(Util.isNotNullOrEmpty(approvalLevel) &amp;&amp; "1".equals(approvalLevel)){
					                    if(ownerName.equals(securityAssuranceName)){
					                       childApproval.setComplete(true);
					                       newChildApprovals.add(childApproval);
					                    }else{
					                       newChildApprovals.add(childApproval);	                       
					                    }
					                }else{
					                   newChildApprovals.add(childApproval);
					                }
					           
					        }
				        }
				        Approval newApprovalObj = new Approval();
				        newApprovalObj.setChildren(newChildApprovals);
				        newApprovalObj.setMode(approval.getMode());
				        newApprovals.add(newApprovalObj);
			        }else{
			                ApprovalSet newApprovalSetOBj= new ApprovalSet();
	                        ApprovalSet approvalSetObj = approval.getApprovalSet();
	                        String approvalLevel = Common_method(approvalSetObj);
	                                if(Util.isNotNullOrEmpty(approvalLevel) &amp;&amp; "1".equals(approvalLevel)){
	                                    if(ownerName.equals(securityAssuranceName)){
	                                       approvalItemObj.approve();
	                                    }else{
	                                       newApprovalSetOBj.add(approvalItemObj);                         
	                                    }
	                                }else{
	                                   newApprovalSetOBj.add(approvalItemObj);
	                                }
	                          
	                        
	                     Approval newApprovalObj = new Approval();
	                     if(!newApprovalSetOBj.isEmpty()){
		                     newApprovalObj.setApprovalSet(newApprovalSetOBj);
		                     newApprovalObj.setOwner(approval.getOwner());
		                     newApprovalObj.setDescription(approval.getDescription());
		                     newApprovalObj.setArgs(approval.getArgs());
		                     newApprovals.add(newApprovalObj);
	                     }else{
	                     	System.out.println("Empy Approval set don't add to LIST:" );
	                     }                     
	                     System.out.println("Finished processing not a child approval new approval is:" + newApprovalObj.toXml());	        
			       
				}            
	        }
	    }
	     if ( newApprovals != null ) {
	        System.out.println("New Approval is :"+newApprovals);
	     }
	    System.out.println("End  LIN-Rule-ApprovalAssignment:"); 
	    return newApprovals;*/
	//}

}
