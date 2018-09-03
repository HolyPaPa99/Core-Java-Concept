## Java简介
Java是由Sun Microsystem公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称。由James Gosling和同事们共同研发，并在1995年正式推出。

Java分为三个体系：
* JavaSE(J2SE) (Java2 Platform Standard Edition, java平台标准版）
* JavaEE(J2EE) (Java2 Platform,Enterprise Edition, java平台企业版）
* JavaME(J2ME) (Java2 Platform Micro Edition, java平台微型版）


## Java面向对象
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/java.jpeg)

Java 是面向对象的高级编程语言，类和对象是 Java 程序的构成核心。Java语言提供类，接口和继承等面向对象特性，为了简单起见，只支持类之间的单继承，但支持接口间的多继承，并支持类与接口之间的实现机制。面向对象是一种常见的思想，比较符合人们的思考习惯；面向对象可以将复杂的业务逻辑简单化，增强代码复用性。从理论上讲，只要对象能够实现业务功能，其具体的实现细节不必特别关心。
围绕着 Java 类和 Java 对象，有三大基本特性：
* 封装（Java 类的编写规范）
* 继承（类与类之间联系的一种形式）
* 多态（为系统组件或模块之间解耦提供了解决方案）

现实世界中，随处可见的一种事物就是对象，对象是事物存在的实体，如人类、书桌、计算机、高楼大厦等。人类解决问题的方式总是将复杂的事物简单化，于是就会思考这些对象都是由哪些部分组成的。通常都会将对象划分为两个部分，即动态部分与静态部分。 静态部分，顾名思义就是不能动的部分，这个部分被称为“属性”，任何对象都会具备其自身属性，如一个人，它包括高矮、胖瘦、性别、年龄等属性。然而具有这些属性的人会执行哪些动作也是一个值得探讨的部分，这个人可以哭泣、微笑、说话、行走，这些是这个人具备的行为（动态部分）即方法，人类通过探讨对象的属性和观察对象的行为了解对象。

面向对象编程是当今主流的程序设计思想，已经取代了过程化程序开发技术。

## 类
对某类事物的普遍一致性特征和功能的抽象描述和封装，是构造对象的模板或蓝图。类之间主要有：依赖，聚合，继承等关系。

例如：人的抽象，每个人都有性别，年龄，身高，体重和名字等属性。人会吃东西会睡觉。
```$xslt

/**
 * person class
 */
public class Person {
    /**
     * the gender of this person
     */
    private String gender;
    /**
     * the age of this person
     */
    private int age;
    /**
     * the height of this person
     */
    private int height;
    /**
     * the weight of this person
     */
    private int weight;
    /**
     * the name of this person
     */
    private String name;

    /**
     * Constractor
     * @param gender
     * @param age
     * @param high
     * @param weight
     * @param name
     */
    public Person(String gender, int age, int high, int weight, String name){
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;

    }

    /**
     * person can eat
     */
    public void eat(){
        System.out.println(this.name + "is eating...");

    }

    /**
     * person can sleep
     */
    public void sleep(){
        System.out.println(this.name + "is sleeping...");

    }
}
```

```$xslt
 public static void main(String[] args){
         Person sean = new Person("male",33,162,60,"Sean");
         sean.eat();
         sean.sleep();
 
         Person jany = new Person("female",24,168,50,"Jany");
         jany.eat();
         jany.sleep();
 }
```

## 封装
将对象不需要让外界访问的成员变量和方法私有化，只提供符合开发者意愿的公共方法来访问这些数据和逻辑，保证了数据的安全和程序的稳定。封装以隐藏细节，数据安全和程序稳定为目的。

| 修饰符         | 本类           | 同包           | 子类          | 全局          |
| ------------- |:-------------:|:-------------:|:-------------:|--------------:|
| private       | yes           | no            | no            | no            |
| default       | yes           | yes           | no            | no            |
| protected     | yes           | yes           | yes           | no            |
| public        | yes           | yes           | yes           | yes           |


## 继承
Java只支持类之间的单继承，但支持接口间的多继承。子类继承父类，同时拥有父类对子类公开的属性和方法。

## 多态
不同的类对象对同一消息做出的响应。多态的实现分为方法的重载(Over Load)和覆盖(Over Write)。

## 面向接口编程
面向接口编程是指在面向对向系统中所有的类或模块之间的交互由接口来完成。面向接口编程大大的降低了类之间的耦合度提高程序的扩展性。接口和实现分离了，适于团队的协作开发。 接口本质上就是由制定者来协调实现者和调用者之间的关系。 只有实现者和调用者都遵循“面向接口编程”这个准则，制定者的协调目的才能达到。 

* 在项目中的意义：接口在项目就是一个业务逻辑，面向接口编程就是先把客户的业务提取出来，作为接口。业务具体实现通过该接口的实现类来完成。当客户需求变化时，只需编写该业务逻辑的新的实现类，通过更改配置文件(例如Spring框架)中该接口的实现类就可以完成需求，不需要改写现有代码，减少对系统的影响。 采用基于接口编程的项目，业务逻辑清晰，代码易懂，方便扩展，可维护性强。即使更换一批人员，新来的人依然可以快速上手。对于公司来说，意义更大。
* 在Java中的意义：Java本身也是一个不断完善的语言，他也在频繁的改动他的系统API来完善，他的API是一个庞大的体系，互相关联，如果不采用接口，而都是用实现类的话，那么API的改动就会给整个体系带来不稳定。而且如果改动API，那么就会有大量采用旧API的项目因无法正常运行，会损失大量客户。换句话说，JDK已经发布的API是一种承诺，一经发布就不能更改，即使原来API存在各种各样的问题（例如java.util.Properties类就是一个失败的例子）也必须保留，于是在Java里就出现了不建议使用的方法，但JDK依然提供该方法。而且Java语言本身是一个跨平台的语言，为了满足在各个平台下运行，就必须把各种操作做成接口，在编写各个平台下的实现类。
* 设计模式的体现：在设计模式的原则里的开闭原则，其实就是要使用接口来实现对扩展开放，对修改关闭。在设计模式的其他原则里也有关于基于接口编程的原则，即依赖倒转的设计原则(DIP)----高层模块不应该依赖于底层模块。二者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象(注：来自《敏捷软件开发--原则、模式与实践》Robert C.Martin著)。在使用面向接口的编程过程中，将具体逻辑与实现分开，减少了各个类之间的相互依赖，当各个类变化时，不需要对已经编写的系统进行改动，添加新的实现类就可以了，不在担心新改动的类对系统的其他模块造成影响。 
 
优点： 
* 接口和实现分离了，适于团队的协作开发。 
* 主要为了实现松散耦合的系统，便于以后升级，扩展。

缺点： 
* 设计难了，在你没有写实现的时候，就得想好接口，接口一变，全部乱套，这就是所谓的设计比实现难。 


在设计程序时应当根据具体的分析来确定是使用抽象类还是接口。abstract类除了提供重要的需要重写的abstract方法外，也提供了子类可以继承的变量和非abstract方法。如果某个重要问题需要使用继承才能更好地解决，比如，子类需要重写父类的abstract方法，还需要从父类继承一些变量或继承一些重要的非abstract方法，就可以考虑用abstract类。如果某个问题不需要继承，只是需要若干个类给出某些重要的abstract方法的实现细节，就可以考虑使用接口。

## I/O流
流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输的特性将流抽象为各种类，方便更直观的进行数据操作。
* 根据处理数据类型的不同分为：字符流和字节流
* 根据数据流向不同分为：输入流和输出流

字符流的由来： 因为数据编码的不同，而有了对字符进行高效操作的流对象。本质其实就是基于字节流读取时，去查了指定的码表。 字节流和字符流的区别：
* 读写单位不同：字节流以字节（8bit）为单位，字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
* 处理对象不同：字节流能处理所有类型的数据（如图片、avi等），而字符流只能处理字符类型的数据。
* 字节流：一次读入或读出是8位二进制。
* 字符流：一次读入或读出是16位二进制。

设备上的数据无论是图片或者视频，文字，它们都以二进制存储的。二进制的最终都是以一个8位为数据单元进行体现，所以计算机中的最小数据单元就是字节。意味着，字节流可以处理设备上的所有数据，所以字节流一样可以处理字符数据。

结论：只要是处理纯文本数据，就优先考虑使用字符流。 除此之外都使用字节流。

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/io.jpeg)

**_在使用流的时候必须确保在最后关闭流。_**
```
         BufferedReader br = null;
         try{
             //open input stream
             br = new BufferedReader(new InputStreamReader(IOPractice.class.getResourceAsStream("io.txt"),"UTF-8"));
             String line = null;
             while((line = br.readLine()) != null){
                 System.out.println(line);
             }
         }catch(Exception e){
             e.printStackTrace();
         }finally{
             if(br != null){
                 try {
                     //close input stream
                     br.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
         }
```

## 多线程


## Tcp/IP



## JVM


## 设计模式

