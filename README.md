# sunshine

## 服务架构图
```mermaid
graph TD
    sunshine-web-->sunshine-gateway
    sunshine-gateway-->sunshine-server
    sunshine-server-->sunshine-common-service
    sunshine-server-->sunshine-user-service
    sunshine-server-->sunshine-team-service
    sunshine-server-->sunshine-project-service
    sunshine-server-->sunshine-test-service
    sunshine-server-->sunshine-wiki-service
    sunshine-server-->sunshine-devops-service
    sunshine-server-->sunshine-report-service
```