获取配置中心配置数据时，需要两个两个配置文件
application.yml 配置文件 用于基本的springcloud配置
bootstrap。yml用于指定需要获取配置中心对应的配置文件信息

配置文件变更刷新方式

http://ip:port/bus/refresh 不带参数表示刷新所有
http://ip:port/bus/refresh?destination=conf-client:8772 表示刷新 conf-client服务实例端口为8772的服务 用于灰度升级验证

http://ip:port/bus/refresh?destination=conf-client:**表示刷新所有conf-client服务的实例


服务配置更新方式
1.模式一、通过请求服务实例/bus/refresh方法实例之间相互通知更新配置    
	缺点:
		•打破了微服务的职责单一性。微服务本身是业务模块，它本不应该承担配置刷新的职责。
		•破坏了微服务各节点的对等性。
		•有一定的局限性。例如，微服务在迁移时，它的网络地址常常会发生变化，此时如果想要做到自动刷新，那就不得不修改WebHook的配置。
		
2.模式二、通过在confserver端配置消息总线 配置更新 向confserver端发起请求 然后将消息传递给mq 再由mq发送到对应的服务完成配置文件更新