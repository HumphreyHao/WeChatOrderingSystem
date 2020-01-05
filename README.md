# WeChatOrderingSystem
  仅包含后端部分，前端部分由其他人负责实现。
  使用虚拟机进行开发，最后部署到阿里云上。
  
## 微信配置
https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxc41c02d541cd07b5&redirect_uri=http://humphreyhao.natapp1.cc/sell/weixin/auth&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect

获取code后，请求以下链接获取access_token： 
https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxc41c02d541cd07b5&secret=SECRET&code=CODE&grant_type=authorization_code
