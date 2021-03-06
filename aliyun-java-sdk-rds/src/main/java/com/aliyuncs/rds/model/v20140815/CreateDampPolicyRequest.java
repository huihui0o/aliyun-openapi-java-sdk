/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDampPolicyRequest extends RpcAcsRequest<CreateDampPolicyResponse> {
	
	public CreateDampPolicyRequest() {
		super("Rds", "2014-08-15", "CreateDampPolicy", "rds");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer priority;

	private String timeRules;

	private String actionRules;

	private String securityToken;

	private String handlers;

	private String dBInstanceId;

	private String policyName;

	private String sourceRules;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getTimeRules() {
		return this.timeRules;
	}

	public void setTimeRules(String timeRules) {
		this.timeRules = timeRules;
		if(timeRules != null){
			putQueryParameter("TimeRules", timeRules);
		}
	}

	public String getActionRules() {
		return this.actionRules;
	}

	public void setActionRules(String actionRules) {
		this.actionRules = actionRules;
		if(actionRules != null){
			putQueryParameter("ActionRules", actionRules);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getHandlers() {
		return this.handlers;
	}

	public void setHandlers(String handlers) {
		this.handlers = handlers;
		if(handlers != null){
			putQueryParameter("Handlers", handlers);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putQueryParameter("PolicyName", policyName);
		}
	}

	public String getSourceRules() {
		return this.sourceRules;
	}

	public void setSourceRules(String sourceRules) {
		this.sourceRules = sourceRules;
		if(sourceRules != null){
			putQueryParameter("SourceRules", sourceRules);
		}
	}

	@Override
	public Class<CreateDampPolicyResponse> getResponseClass() {
		return CreateDampPolicyResponse.class;
	}

}
