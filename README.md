## 描述
此项目所有 java 代码

## 目录结构
```sh
du-api/                    对外接口模块，提供所有对前端、客户端等外部 API 接口
du-api/src/main/resources/db/migration  sql文件存放目录，基于 flyway 维护
du-sdk/                    sdk模块，提供所有模块通用的常量、枚举、数据库映射等
pom.xml
```

## 项目依赖关系
* 所有模块依赖于 du-sdk
* springboot 模块不允许再被其他模块依赖
* 所有数据库操作都存放在 du-sdk 中

## flyway使用说明
* 只有 du-api 工程使用了 flyway
* V1用于初始化sql，后续增加的 sql 从 V11开始
* 如果所开发的业务对 sql 依赖性不强，想关闭 flyway 检查，可以在本地开发环境将 application.properties 中的 spring.flyway.enabled 改为 false。注意此文件不允许以 false 的方式提交到代码库，只可本地使用
