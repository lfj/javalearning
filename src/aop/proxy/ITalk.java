package aop.proxy;

/**
 * 抽象主题角色，声明了真实主题和代理主题的共同接口
 */
public interface ITalk {
    public void talk(String msg);
}
