### 工厂模式

工厂设计模式的思考：

#### 简单工厂和工厂方法差异？

- 工厂方法只会返回一种类型的实例，最好具有父类或者共同实现的接口。
- 简单工厂：用来生产同一等级结构的任意产品（对于任意新增的产品，无能为力）
- 工厂方法：用来生产同一等级结构中的固定产品（支持增加任意产品）
- 抽象工厂：用来生产不同产品族的全部产品。（对于新增的产品，无能为力，只是多种实现定义好的产品生成，实例的组合，支持添加产品族，就是产品的下线由谁生产，但是生产什么是事先固定好的）

#### 工厂方法和抽象工厂差异？

- 抽象工厂关键在于产品之间的抽象关系，所以至少要两个产品，工厂方法在于生成产品，不关注产品键的关系，所以可以只生成一个产品。
- 抽象工厂中客户端把产品的抽象关系理清楚，在最终使用的时候，一般使用客户端和（其接口），产品之间的关系是被封装固定的；而工厂方法是在最终使用的时候，使用产品本身。
- 抽象工厂更像一个复杂版本的策略模式，策略模式通过更换策略来改变处理方式或者结果，而抽象工厂的客户端，通过更改工厂来改变结果，所以在使用的时候，就使用客户端和更换工厂，而看不到产品本身。
- 工厂方法的目的是生产商品，所以能看到商品，而且还是要使用商品，当然如果产品在创建者内部使用，那么工厂方法就是为了完善创建者，从而可以使用创建者，另外创建者本身是不能更换所生成的产品的。
- 抽象工厂的工厂是类，工厂方法的工厂是方法。

#### 客户和工厂之间还是有耦合，如何进一步优化？

- 依赖反转原理（dependency inversion principle）
- 控制反转（inversion of control）
- 依赖注入（dependency injection）

### 单例模式

- 单例模式限制类的实例化，保证JVM中的类的实例只有一个
- 单例类提供一个可以全局访问单例的入口
- 常用于
  - 日志logging
  - 配置设置类
  - 驱动程序对象
  - 缓存对象
  - 线程池对象
- 其中会涉及JAVA面试题
  - 提前和延迟（lazy）
  - 静态初始化块
  - 多线程安全
  - 双重检查锁定（double checked locking）
  - JVM、JIT指令优化重排
  - 反射（reflection）
  - 序列化（serialization）
  - 克隆（clone）

单例模式：

- 普通的懒汉模式
- 饿汉模式
- 同步饿汉模式
- 比尔普夫模式
- 枚举模式

破坏单例模式：

- 反射破坏
- 防止，就是构造方法抛异常

单例模式的应用：

- Core Java
  - java.lang.Runtime
  - java.awt.Desktop
- Spring 容器
  - Singleton Scope（per container）

破坏单例模式的方法：

