# keycloak-service-social-lark

Keycloak social identity provider for Lark(飞书).

## Build

Requires Java 21 and Maven 3.9+. Dependencies target Keycloak 26.8.1, matching the parent Docker image.

```bash
mvn clean package
```

## Install

添加 jar 包到 Keycloak 服务并重新构建:

```bash
cp target/keycloak-service-social-lark-*.jar "${KEYCLOAK_HOME}/providers/"
"${KEYCLOAK_HOME}/bin/kc.sh" build
```

## Others

based on https://github.com/zh417233956/keycloak-services-social-dingtalk  
based on https://github.com/litianzhong/keycloak-social-ding
