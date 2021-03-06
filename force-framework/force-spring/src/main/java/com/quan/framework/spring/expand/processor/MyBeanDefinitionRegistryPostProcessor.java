package com.quan.framework.spring.expand.processor;

import com.quan.common.util.AtomicUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author heyq
 * @Date 2021-03-03
 **/
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(@NonNull BeanDefinitionRegistry beanDefinitionRegistry)
            throws BeansException {
        AtomicUtils.print("BeanDefinitionRegistryPostProcessor ==> postProcessBeanDefinitionRegistry," +
                "在这里可以增加修改删除bean的定义");
    }

    @Override
    public void postProcessBeanFactory(@NonNull ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        AtomicUtils.print("BeanFactoryPostProcessor ==> postProcessBeanFactory,在这里可以对beanFactory做一些操作");
    }
}
