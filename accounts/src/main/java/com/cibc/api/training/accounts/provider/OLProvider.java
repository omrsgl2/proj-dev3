package com.cibc.api.training.accounts.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.mfrpc.openlegacy.MfRpcApplication;

/**
 * Singleton to use OL SDK
 * <p>
 * Example:
 * <pre>
 * OLProvider.INSTANCE.getApplicationContext().getBean(org.openlegacy.core.rpc.RpcSession.class);
 * </pre>
 */
public enum OLProvider {
	INSTANCE;

	private ApplicationContext applicationContext;

	public void initApplicationContext() {
		this.applicationContext = SpringApplication.run(MfRpcApplication.class);
	}

	public ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}
}
