# keycloak-service-social-lark

Keycloak social identity provider for Lark(飞书).

## Run with Jboss

1. 添加jar包到Keycloak服务:

```bash
cp target/keycloak-service-social-lark-${version}.jar ${KEYCLOAK_HOME}/providers
```

1. 添加模板文件到Keycloak服务:

```bash
cp templates/realm-identity-provider-lark.html ${KEYCLOAK_HOME}/themes/base/admin/resources/partials/
cp templates/realm-identity-provider-lark-ext.html ${KEYCLOAK_HOME}/themes/base/admin/resources/partials/
```

## Others

based on https://github.com/zh417233956/keycloak-services-social-dingtalk  
based on https://github.com/litianzhong/keycloak-social-ding
