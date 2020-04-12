package com.yuezhiming.ribbonRule.myrule;/**
 * Created by ASUSon 2019/12/11 21:17
 */

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: microservicecloud
 * @description: ribbon自定义策略, 光放文档明确给出警告：这个自定类不能放在@ComPonentScan所扫描的当前包下以及子包，
 * 否则这个自定义的配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的。
 * @author: yuezm
 * @create: 2019-12-11 21:17
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();

        return new RandomRule_SelfDfine();
    }


}
