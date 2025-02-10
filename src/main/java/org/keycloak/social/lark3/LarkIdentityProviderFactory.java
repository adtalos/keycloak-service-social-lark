package org.keycloak.social.lark3;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

/**
 * {@code @Author:} guanxiatao
 * {@code @Date:} 2021/3/15 5:14 下午
 */

public class LarkIdentityProviderFactory extends AbstractIdentityProviderFactory<org.keycloak.social.lark3.LarkIdentityProvider> implements SocialIdentityProviderFactory<org.keycloak.social.lark3.LarkIdentityProvider> {

    public static final String PROVIDER_ID = "lark3";

    @Override
    public String getName() {
        return "飞书-爆量无忧";
    }

    @Override
    public org.keycloak.social.lark3.LarkIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new LarkIdentityProvider(session, new org.keycloak.social.lark3.LarkIdentityProviderConfig(model));
    }

    @Override
    public org.keycloak.social.lark3.LarkIdentityProviderConfig createConfig() {
        return new LarkIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}
