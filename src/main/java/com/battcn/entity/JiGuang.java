package com.battcn.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "t_mp_jiguang")
public class JiGuang implements Serializable {

	private static final long serialVersionUID = -6701809944876314699L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "APPKEY")
	private String APPKEY;
	@Column(name = "Secret")
	private String Secret;
	@Column(name = "appId")
	private String appId;
	@Column(name = "appName")
	private String appName;
	@Column(name = "agentId")
	private String agentId;
	@Column(name = "institutionId")
	private String institutionId;
	
	public JiGuang() {
		super();
	}
	
	public JiGuang(String aPPKEY, String secret, String appId, String appName) {
		super();
		APPKEY = aPPKEY;
		Secret = secret;
		this.appId = appId;
		this.appName = appName;
	}

	public JiGuang(Long id, String aPPKEY, String secret, String appId,
			String agentId, String institutionId) {
		super();
		this.id = id;
		APPKEY = aPPKEY;
		Secret = secret;
		this.appId = appId;
		this.agentId = agentId;
		this.institutionId = institutionId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAPPKEY() {
		return APPKEY;
	}

	public void setAPPKEY(String aPPKEY) {
		APPKEY = aPPKEY;
	}

	public String getSecret() {
		return Secret;
	}

	public void setSecret(String secret) {
		Secret = secret;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	
}
