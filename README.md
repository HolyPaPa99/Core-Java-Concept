## 1 Java简介
Java是由Sun Microsystem公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称。由James Gosling和同事们共同研发，并在1995年正式推出。

Java分为三个体系：
* JavaSE(J2SE) (Java2 Platform Standard Edition, java平台标准版）
* JavaEE(J2EE) (Java2 Platform,Enterprise Edition, java平台企业版）
* JavaME(J2ME) (Java2 Platform Micro Edition, java平台微型版）


## 2 Java面向对象
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/java.jpeg)

Java 是面向对象的高级编程语言，类和对象是 Java 程序的构成核心。Java语言提供类，接口和继承等面向对象特性，为了简单起见，只支持类之间的单继承，但支持接口间的多继承，并支持类与接口之间的实现机制。面向对象是一种常见的思想，比较符合人们的思考习惯；面向对象可以将复杂的业务逻辑简单化，增强代码复用性。从理论上讲，只要对象能够实现业务功能，其具体的实现细节不必特别关心。
围绕着 Java 类和 Java 对象，有三大基本特性：
* 封装（Java 类的编写规范）
* 继承（类与类之间联系的一种形式）
* 多态（为系统组件或模块之间解耦提供了解决方案）

现实世界中，随处可见的一种事物就是对象，对象是事物存在的实体，如人类、书桌、计算机、高楼大厦等。人类解决问题的方式总是将复杂的事物简单化，于是就会思考这些对象都是由哪些部分组成的。通常都会将对象划分为两个部分，即动态部分与静态部分。 静态部分，顾名思义就是不能动的部分，这个部分被称为“属性”，任何对象都会具备其自身属性，如一个人，它包括高矮、胖瘦、性别、年龄等属性。然而具有这些属性的人会执行哪些动作也是一个值得探讨的部分，这个人可以哭泣、微笑、说话、行走，这些是这个人具备的行为（动态部分）即方法，人类通过探讨对象的属性和观察对象的行为了解对象。

面向对象编程是当今主流的程序设计思想，已经取代了过程化程序开发技术。

## 3 类
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

## 4 封装
将对象不需要让外界访问的成员变量和方法私有化，只提供符合开发者意愿的公共方法来访问这些数据和逻辑，保证了数据的安全和程序的稳定。封装以隐藏细节，数据安全和程序稳定为目的。

| 修饰符         | 本类           | 同包           | 子类          | 全局          |
| ------------- |:-------------:|:-------------:|:-------------:|--------------:|
| private       | yes           | no            | no            | no            |
| default       | yes           | yes           | no            | no            |
| protected     | yes           | yes           | yes           | no            |
| public        | yes           | yes           | yes           | yes           |


## 5 继承
Java只支持类之间的单继承，但支持接口间的多继承。子类继承父类，同时拥有父类对子类公开的属性和方法。

## 6 多态
不同的类对象对同一消息做出的响应。多态的实现分为方法的重载(Over Load)和覆盖(Over Write)。

## 7 反射
JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
要想解剖一个类,必须先要获取到该类的字节码文件对象。而解剖使用的就是Class类中的方法.所以先要获取到每一个字节码文件对应的Class类型的对象.

Class 类与 java.lang.reflect 类库一起对反射的概念进行了支持，该类库包含了 Field,Method,Constructor 类 (每个类都实现了 Member 接口)。这些类型的对象时由 JVM 在运行时创建的，用以表示未知类里对应的成员。

这样你就可以使用 Constructor 创建新的对象，用 get() 和 set() 方法读取和修改与 Field 对象关联的字段，用 invoke() 方法调用与 Method 对象关联的方法。另外，还可以调用 getFields() getMethods() 和 getConstructors() 等很便利的方法，以返回表示字段，方法，以及构造器的对象的数组。这样匿名对象的信息就能在运行时被完全确定下来，而在编译时不需要知道任何事情。

### 7.1 反射的具体实现
获取class的三种方法：

>> * 通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object
```$xslt
//  类型的对象，而我不知道你具体是什么类，用这种方法
Person p1 = new Person();
Class c1 = p1.getClass();
```
       
>> * 直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
```$xslt
//  这说明任何一个类都有一个隐含的静态成员变量 class
Class c2 = Person.class;
```

>> * 通过 Class 对象的 forName() 静态方法来获取，用的最多，
```$xslt
//   但可能抛出 ClassNotFoundException 异常
Class c3 = Class.forName("com.ys.reflex.Person");
```

通过 Class 类获取成员变量、成员方法、接口、超类、构造方法等:
>> * getName()：获得类的完整名字。
>> * getFields()：获得类的public类型的属性。
>> * getDeclaredFields()：获得类的所有属性。包括private 声明的和继承类
>> * getMethods()：获得类的public类型的方法。
>> * getDeclaredMethods()：获得类的所有方法。包括private 声明的和继承类
>> * getMethod(String name, Class[] parameterTypes)：获得类的特定方法，name参数指定方法的名字，parameterTypes 参数指定方法的参数类型。
>> * getConstructors()：获得类的public类型的构造方法。
>> * getConstructor(Class[] parameterTypes)：获得类的特定构造方法，parameterTypes 参数指定构造方法的参数类型。
>> * newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。

获取constructor：
```$xslt
        try {
            Class clazz = Person.class;
            Constructor<Person> constructor1 = clazz.getConstructor();
            Constructor<Person> constructor2 = clazz.getConstructor(String.class, int.class, int.class, int.class, String.class);
            Person person1 = constructor1.newInstance();
            Person person2 = constructor2.newInstance("male",33,162,60,"Sean");
        }catch(Exception e){
            e.printStackTrace();
        }
```
获取field:
```$xslt
        try {
            Class clazz = Person.class;
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getName());
            }
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true);
            Person person = (Person)clazz.newInstance();
            nameField.set(person,"sean");
            Object name = nameField.get(person);
            System.out.println("name:"+name);

        }catch(Exception e){
            e.printStackTrace();
        }
```
获取method并执行：
```$xslt
        try {
            Class clazz = Person.class;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                System.out.println(method.getName());
            }
            Method setName = clazz.getMethod("setName",String.class);
            Person person = (Person)clazz.newInstance();
            setName.invoke(person,"Sean");
            System.out.println("name:"+person.getName());

        }catch(Exception e){
            e.printStackTrace();
        }
```


## 8 面向接口编程
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

## 9 I/O流
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

## 10 多线程


## 11 Tcp/IP



## 12.JVM
Java是一门解释性语言，宣传口号是：一次编译，到处运行。
java程序经过一次编译之后，将java代码编译为字节码也就是class文件，然后在不同的操作系统上依靠不同的java虚拟机进行解释，最后再转换为不同平台的机器码，最终得到执行。这样我们是不是可以推演，不管在Windows、Linux或mac系统上运行，是不是只需要安装java虚拟机就行了。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/runanywhere.gif)

运行期环境代表着Java平台，开发人员编写Java代码(.java文件)，然后将之编译成字节码(.class文件)，再然后字节码被装入内存，一旦字节码进入虚拟机，它就会被解释器解释执行，或者是被即时代码发生器有选择的转换成机器码执行。

Java平台由Java虚拟机和Java应用程序接口搭建，Java语言则是进入这个平台的通道，用Java语言编写并编译的程序可以运行在这个平台上。这个平台的结构如下图所示：

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/structure.gif)

在Java平台的结构中, 可以看出，Java虚拟机(JVM) 处在核心的位置，是程序与底层操作系统和硬件无关的关键。它的下方是移植接口，移植接口由两部分组成：适配器和Java操作系统, 其中依赖于平台的部分称为适配器；JVM 通过移植接口在具体的平台和操作系统上实现；在JVM 的上方是Java的基本类库和扩展类库以及它们的API， 利用Java API编写的应用程序(application) 和小程序(Java applet) 可以在任何Java平台上运行而无需考虑底层平台, 就是因为有Java虚拟机(JVM)实现了程序与操作系统的分离，从而实现了Java 的平台无关性。 

JVM在它的生存周期中有一个明确的任务，那就是运行Java程序，因此当Java程序启动的时候，就产生JVM的一个实例；当程序运行结束的时候，该实例也跟着消失了。

例如我们有一个HelloWorld.java，执行这个程序的步骤如下，java通过jvm.cfg文件找到对应的jvm.dll，jvm.dll则是java虚拟机的主要实现。接下来会初始化JVM,并且获取JNI接口，什么是JNI接口，就是java本地接口，你想啊java被编译成了class文件，JVM怎么从硬盘上找到这个文件并装载到JVM里呢，就是通过JNI接口（它还常用于java与操作系统、硬件交互），找到class文件后并装载进JVM，然后找到main方法，最后执行。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/executeclass.png)

### 12.1 JVM基本结构：

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/jvm.png)
 
### 12.2 JVM内存空间包含：方法区、java堆、java栈、本地方法栈。
#### **_方法区_** 是各个线程共享的区域，存放类信息、常量、静态变量。
#### **_堆_** 这块区域是JVM中最大的，应用的对象和数据都是存在这个区域，这块区域也是线程共享的，也是 gc 主要的回收区，一个 JVM 实例只存在一个堆类存，堆内存的大小是可以调节的。类加载器读取了类文件后，需要把类、方法、常变量放到堆内存中，以方便执行器执行，堆内存分为三部分：新生区、养老区、永久区/元空间

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/heap.jpeg)

>> ① 新生区

>> 新生区是类的诞生、成长、消亡的区域，一个类在这里产生，应用，最后被垃圾回收器收集，结束生命。新生区又分为两部分：伊甸区（Eden space）和幸存者区（Survivor pace），所有的类都是在伊甸区被new出来的。幸存区有两个：0区（Survivor 0 space）和1区（Survivor 1 space）。当伊甸园的空间用完时，程序又需要创建对象，JVM的垃圾回收器将对伊甸园进行垃圾回收（Minor GC）,将伊甸园中的剩余对象移动到幸存0区。若幸存0区也满了，再对该区进行垃圾回收，然后移动到1区。那如果1去也满了呢？再移动到养老区。若养老区也满了，那么这个时候将产生Major GC（FullGCC），进行养老区的内存清理。若养老区执行Full GC 之后发现依然无法进行对象的保存，就会产生OOM异常“OutOfMemoryError”。

>> 如果出现java.lang.OutOfMemoryError: Java heap space异常，说明Java虚拟机的堆内存不够。原因有二：

>>> a.Java虚拟机的堆内存设置不够，可以通过参数-Xms、-Xmx来调整。

>>> b.代码中创建了大量大对象，并且长时间不能被垃圾收集器收集（存在被引用）。

>> ② 养老区

>> 养老区用于保存从新生区筛选出来的 JAVA 对象，一般池对象都在这个区域活跃。

>> ③ 永久区

>> 永久存储区是一个常驻内存区域，用于存放JDK自身所携带的 Class,Interface 的元数据，也就是说它存储的是运行环境必须的类信息，被装载进此区域的数据是不会被垃圾回收器回收掉的，关闭 JVM 才会释放此区域所占用的内存。

>> 如果出现java.lang.OutOfMemoryError: PermGen space，说明是Java虚拟机对永久代Perm内存设置不够。原因有二：

>>> a. 程序启动需要加载大量的第三方jar包。例如：在一个Tomcat下部署了太多的应用。

>>> b. 大量动态反射生成的类不断被加载，最终导致Perm区被占满。

>> 说明：
 
>>> Jdk1.6及之前：常量池分配在永久代 。

>>> Jdk1.7：有，但已经逐步“去永久代” 。

>>> Jdk1.8及之后：无(java.lang.OutOfMemoryError: PermGen space,这种错误将不会出现在JDK1.8中)。

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/heap1.8.jpeg)

>> 堆内存分配：

>> VM初始分配的内存由-Xms指定，默认是物理内存的1/64；JVM最大分配的内存由-Xmx指 定，默认是物理内存的1/4。默认空余堆内存小于40%时，JVM就会增大堆直到-Xmx的最大限制；空余堆内存大于70%时，JVM会减少堆直到 -Xms的最小限制。因此服务器一般设置-Xms、-Xmx相等以避免在每次GC 后调整堆的大小。对象的堆内存由称为垃圾回收器的自动内存管理系统回收。 

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/heapinit.jpeg)



#### **_java栈_** 是每个线程私有的区域，它的生命周期与线程相同，一个线程对应一个java栈，每执行一个方法就会往栈中压入一个元素，这个元素叫“栈帧”，而栈帧中包括了方法中的局部变量、用于存放中间状态值的操作栈，这里面有很多细节，我们以后再讲。如果java栈空间不足了，程序会抛出StackOverflowError异常，想一想什么情况下会容易产生这个错误，对，递归，递归如果深度很深，就会执行大量的方法，方法越多java栈的占用空间越大。
#### **_本地方法栈_** 角色和java栈类似，只不过它是用来表示执行本地方法的，本地方法栈存放的方法调用本地方法接口，最终调用本地方法库，实现与操作系统、硬件交互的目的。
#### **_PC寄存器_**，说到这里我们的类已经加载了，实例对象、方法、静态变量都去了自己改去的地方，那么问题来了，程序该怎么执行，哪个方法先执行，哪个方法后执行，这些指令执行的顺序就是PC寄存器在管，它的作用就是控制程序指令的执行顺序。
#### 执行引擎
执行引擎当然就是根据PC寄存器调配的指令顺序，依次执行程序指令。

### 12.3 JVM内存模型

![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/memory.jpg)

虚拟机内存模型中定义的访问操作与物理计算机处理的基本一致.

Java中通过多线程机制使得多个任务同时执行处理，所有的线程共享JVM内存区域main memory，而每个线程又单独的有自己的工作内存，当线程与内存区域进行交互时，数据从主存拷贝到工作内存，进而交由线程处理（操作码+操作数）。

volatile关键字：
* 线程1工作内存中的变量更新会强制立即写入到主内存；
* 线程2工作内存中的变量会强制立即失效，这使得线程2必须去主内存中获取最新的变量值。

### 12.4 JVM参数配置
JVM配置参数分为三类参数：跟踪参数、堆分配参数、栈分配参数。
#### 12.4.1 跟踪参数
参数用于跟踪监控JVM，往往被开发人员用于JVM调优以及故障排查。
>> * 当发生GC时，打印GC简要信息,使用-XX:+PrintGC或-verbose:gc参数。
>> * 打印GC的详细信息以及堆使用详细信息,使用-XX:+PrintGCDetails参数。
>> * 使用外部文件记录GC的日志,使用-Xloggc:log/gc.log。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/outputgclog.png)
>>>> 还有一个非常有用的参数，它可以把GC的日志记录到外部文件中，这在生产环境进行故障排查时尤为重要，当java程序出现OOM时，总希望看到当时垃圾回收的情况，通过这个参数就可以把GC的日志记录下来，便于排查问题，当然也可以做日常JVM监控
>> * 监控类的加载，使用-XX:+TraceClassLoading。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/classLoadingLog.png)


#### 12.4.2 堆分配参数
>> * 堆初始大小：Xms
>> * 堆最大大小：Xmx
>> * 新生代内存大小：Xmn
>>>> -Xmn2g：设置新生代大小为2G。在整个堆内存大小确定的情况下，增大新生代将会减小年老代，反之亦然。此值关系到JVM垃圾回收，对系统性能影响较大，官方推荐配置为整个堆大小的3/8。
>> * -XX:NewSize=1024m：设置新生代初始值为1024M。
>> * -XX:MaxNewSize=1024m：设置新生代最大值为1024M。
>>>> 推荐使用-Xmn参数，原因是这个参数简洁，相当于一次设定 NewSize/MaxNewSIze，而且两者相等，适用于生产环境。-Xmn 配合-Xms/-Xmx，即可将堆内存布局完成。-Xmn参数是在JDK 1.4 开始支持。
>> * 新生代（eden+from+to）和老年代（不包含永久区）的比值：-XX:NewRatio
>>>> -Xmn，-XX:NewSize/-XX:MaxNewSize，-XX:NewRatio3组参数都可以影响新生代的大小，混合使用的情况下，优先级是什么？如下：
>>>> * 高优先级：-XX:NewSize/-XX:MaxNewSize 
>>>> * 中优先级：-Xmn（默认等效  -Xmn=-XX:NewSize=-XX:MaxNewSize=?） 
>>>> * 低优先级：-XX:NewRatio 
>> * Eden区与Survivor区（from、to）的大小比值：-XX:SurvivorRatio
>>>> -XX:SurvivorRatio=4：设置年轻代中Eden区与Survivor区的比值。表示2个Survivor区（JVM堆内存年轻代中默认有2个大小相等的Survivor区）与1个Eden区的比值为2:4，即1个Survivor区占整个年轻代大小的1/6。
>> * 在发生OOM异常时把堆栈信息打印到外部文件:-XX:+HeapDumpOnOutOfMemoryError、-XX:+HeapDumpPath
>> * 永久区分配参数:-XX:PermSize -XX:MaxPermSize
>>>> 用于设置永久区的初始空间和最大空间，他们表示一个系统可以容纳多少个类型，一般空间比较小。在java1.8以后，永久区被移到了元数据区，使用本地内存，所以这两个参数也不建议再使用。
>> * -XX:MaxTenuringThreshold
>>>> -XX:MaxTenuringThreshold=7：表示一个对象如果在Survivor区（救助空间）移动了7次还没有被垃圾回收就进入年老代。如果设置为0的话，则年轻代对象不经过Survivor区，直接进入年老代，对于需要大量常驻内存的应用，这样做可以提高效率。如果将此值设置为一个较大值，则年轻代对象会在Survivor区进行多次复制，这样可以增加对象在年轻代存活时间，增加对象在年轻代被垃圾回收的概率，减少Full GC的频率，这样做可以在某种程度上提高服务稳定性。


总结：
>> 根据实际事情调整新生代和幸存代的大小,官方推荐新生代占堆的3/8,幸存代占新生代的1/10;在OOM时，记得Dump出堆，确保可以排查现场问题。



#### 12.4.3 栈分配参数:-Xss
>> 栈大小参数为-Xss，通常只有几百k，决定了函数调用的深度，每个线程都有自己独立的栈空间。如果函数调用太深，超过了栈的大小，则会抛出java.lang.StackOverflowError，通常我们遇到这种错误，不是去调整-Xss参数，而是应该去调查函数调用太深的原理，是否使用递归，能不能保证递归出口等。
JDK5.0以后每个线程栈大小为1M，之前每个线程栈大小为256K。应当根据应用的线程所需内存大小进行调整。在相同物理内存下，减小这个值能生成更多的线程。但是操作系统对一个进程内的线程数还是有限制的，不能无限生成，经验值在3000~5000左右。需要注意的是：当这个值被设置的较大（例如>2MB）时将会在很大程度上降低系统的性能。
### 12.5 垃圾回收
我们需要先了解一个词“stop the world”，stop the world会在执行某一个垃圾回收算法的时候产生，JVM为了执行垃圾回收，会暂时java应用程序的执行，等垃圾回收完成后，再继续运行。如果你使用JMeter测试过java程序，你可能会发现在测试过程中，java程序有不规则的停顿现象，其实这就是“stop the world”，停顿的时候JVM是在做垃圾回收。所以尽可能减少stop the world的时间，就是我们优化JVM的主要目标。接下来我们看一下目前有哪些常见垃圾回收的算法。

垃圾回收算法：
>> * 引用计数法
>>>> 引用计数法顾名思义，就是对一个对象被引用的次数进行计数，当增加一个引用计数就加1，减少一个引用计数就减1。当对象的引用减少为0将被加收。
>>>> 引用计数算法原理非常简单，是最原始的回收算法，但是java中没有使用这种算法，原因有2:

>>>> 1是频繁的计数影响性能，
>>>> 2是它无法处理循环引用的问题。

>> * 标记清除
>>>> 标记清除算法，它是很多垃圾回收算法的基础，简单来说有两个步骤：标记、清除。

>>>> 标记：遍历所有的GC Roots，并将从GC Roots可达的对象设置为存活对象；

>>>> 清除：遍历堆中的所有对象，将没有被标记可达的对象清除；
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/mark.png)

>>>> 注意上图灰色的对象，因为从GC Root遍历不到它们（尽管它们本身有引用关系，但从GC Root无法遍历到它们），因此它们没有被标记为存活对象，在清除过程中将会被回收。
>>>> 这里需要注意的是标记清除算法执行过程中，会产生“stop the world”，让java程序暂停等待以保证在标记清除的过程中，不会有新的对象产生。为什么必须暂停java程序呢？举个例子，如果在标记过程完成后，又新产生了一个对象，而该对象已经错过了标记期，那么在接下来的清除流程中，这个新产生的对象因为未被标记，所以将被视为不可达对象而被清除，这样程序就会出错，因此标记清除算法在执行时，java程序将被暂停，产生“stop the world”。

>>>> 接下来我们总结一下标记清除算法：

>>>> 1、因为涉及大量的内存遍历工作，所以执行性能较低，这也会导致“stop the world”时间较长，java程序吞吐量降低；

>>>> 2、我们注意到对象被清除之后，被清除的对象留下内存的空缺位置，造成内存不连续，空间浪费。

>> * 标记压缩
>>>> 标记压缩算法你可能已经想到了，它就是在标记清除算法的基础上，增加了压缩过程。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/stress.png)
>>>> 在进行完标记清除之后，对内存空间进行压缩，节省内存空间，解决了标记清除算法内存不连续的问题。

>>>> 注意标记压缩算法也会产生“stop the world”，不能和java程序并发执行。在压缩过程中一些对象内存地址会发生改变，java程序只能等待压缩完成后才能继续。

>> * 复制算法
>>>> 复制算法简单来说就是把内存一分为二，但只使用其中一份，在垃圾回收时，将正在使用的那份内存中存活的对象复制到另一份空白的内存中，最后将正在使用的内存空间的对象清除，完成垃圾回收。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/copy1.png)
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/copy2.png)
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/copy3.png)
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/copy4.png)

>>>> 复制算法相对标记压缩算法来说更简洁高效，但它的缺点也显而易见，它不适合用于存活对象多的情况，因为那样需要复制的对象很多，复制性能较差，所以复制算法往往用于内存空间中新生代的垃圾回收，因为新生代中存活对象较少，复制成本较低。它另外一个缺点是内存空间占用成本高，因为它基于两份内存空间做对象复制，在非垃圾回收的周期内只用到了一份内存空间，内存利用率较低。

JVM给出了3种选择：串行收集器、并行收集器、并发收集器。串行收集器只适用于小数据量的情况，所以生产环境的选择主要是并行收集器和并发收集器。
默认情况下JDK5.0以前都是使用串行收集器，如果想使用其他收集器需要在启动时加入相应参数。JDK5.0以后，JVM会根据当前系统配置进行智能判断。

#### 12.5.1 串行收集器
>> * -XX:+UseSerialGC：设置串行收集器。
>>>> 顾名思义，串行收集器就是使用单线程进行垃圾回收。对新生代的回收使用复制算法，对老年代使用标记压缩算法。串行收集器是最古老最稳定的收集器，尽管它是串行回收，回收时间较长，但其稳定性是优于其他回收器的，综合来说是一个不错的选择。

>>>> 执行垃圾回收时，应用程序线程暂停，GC线程开始（开始垃圾回收），垃圾回收完成后，应用程序线程继续执行。注意：在GC线程运行过程中使用单线程进行串行回收。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/serialGC.png)


#### 12.5.2 并行收集器（吞吐量优先）
>> * -XX:+UseParallelGC：设置为并行收集器。此配置仅对年轻代有效。即年轻代使用并行收集，而年老代仍使用串行收集。
>> * -XX:ParallelGCThreads=20：配置并行收集器的线程数，即：同时有多少个线程一起进行垃圾回收。此值建议配置与CPU数目相等。
>> * -XX:+UseParallelOldGC：配置年老代垃圾收集方式为并行收集。JDK6.0开始支持对年老代并行收集。
>> * -XX:MaxGCPauseMillis=100：设置每次年轻代垃圾回收的最长时间（单位毫秒）。如果无法满足此时间，JVM会自动调整年轻代大小，以满足此时间。
>> * -XX:+UseAdaptiveSizePolicy：设置此选项后，并行收集器会自动调整年轻代Eden区大小和Survivor区大小的比例，以达成目标系统规定的最低响应时间或者收集频率等指标。此参数建议在使用并行收集器时，一直打开。
>> * -XX:+UseParNewGC：设置年轻代为并发收集。可与CMS收集同时使用。JDK5.0以上，JVM会根据系统配置自行设置，所以无需再设置此参数。

>>>> 在进行回收时，应用程序暂停，GC使用多线程并发回收，回收完成后应用程序线程继续运行。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/parallelGC.png)

#### 12.5.3 CMS回收器（响应时间优先）
>> * -XX:+UseConcMarkSweepGC：即CMS收集，设置年老代为并发收集。CMS收集是JDK1.4后期版本开始引入的新GC算法。它的主要适合场景是对响应时间的重要性需求大于对吞吐量的需求，能够承受垃圾回收线程和应用线程共享CPU资源，并且应用中存在比较多的长生命周期对象。CMS收集的目标是尽量减少应用的暂停时间，减少Full GC发生的几率，利用和应用程序线程并发的垃圾回收线程来标记清除年老代内存。
>> * -XX:CMSFullGCsBeforeCompaction=0：由于并发收集器不对内存空间进行压缩和整理，所以运行一段时间并行收集以后会产生内存碎片，内存使用效率降低。此参数设置运行0次Full GC后对内存空间进行压缩和整理，即每次Full GC后立刻开始压缩和整理内存。
>> * -XX:+UseCMSCompactAtFullCollection：打开内存空间的压缩和整理，在Full GC后执行。可能会影响性能，但可以消除内存碎片。
>> * -XX:+CMSIncrementalMode：设置为增量收集模式。一般适用于单CPU情况。
>> * -XX:CMSInitiatingOccupancyFraction=70：表示年老代内存空间使用到70%时就开始执行CMS收集，以确保年老代有足够的空间接纳来自年轻代的对象，避免Full GC的发生。

>>>> CMS回收器: Concurrent Mark Sweep，并发标记清除。注意这里注意两个词：并发、标记清除。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/CMSGC.png)

>>>> 从上图可以看到标记过程分三步：初始标记、并发标记、重新标记，并发标记是最主要的标记过程，而这个过程是并发执行的，可以与应用程序线程同时进行，初始标记和重新标记虽然不能和应用程序并发执行，但这两个过程标记速度快，时间短，所以对应用程序不会产生太大的影响。最后并发清除的过程，也是和应用程序同时进行的，避免了应用程序的停顿。
>>>> CMS的优点显而易见，就是减少了应用程序的停顿时间，让回收线程和应用程序线程可以并发执行。但它也不是完美的，从他的运行机制可以看出，因为它不像其他回收器一样集中一段时间对垃圾进行回收，并且在回收时应用程序还是运行，因此它的回收并不彻底。这也导致了CMS回收的频率相较其他回收器要高，频繁的回收将影响应用程序的吞吐量。
>>>> 并发表示它可以与应用程序并发执行、交替执行；标记清除表示这种回收器不是使用的是标记压缩算法，这和前面介绍的串行回收器和并发回收器有所不同。需要注意的是CMS回收器是一种针对老年代的回收器，不对新生代产生作用。这种回收器优点在于减少了应用程序停顿的时间，因为它不需要应用程序完成暂定等待垃圾回收，而是与垃圾回收并发执行。

#### 12.5.4 G1回收器
>> * -XX:+UseG1GC
>>>> G1回收器是jdk1.7以后推出的回收器，试图取代CMS回收器。
>>>> 不同于其他的回收器、G1将堆空间划分成了互相独立的区块。每块区域既有可能属于老年代、也有可能是新生代，并且每类区域空间可以是不连续的（对比CMS的老年代和新生代都必须是连续的）。这种将老年代区划分成多块的理念源于：当并发后台线程寻找可回收的对象时、有些区块包含可回收的对象要比其他区块多很多。虽然在清理这些区块时G1仍然需要暂停应用线程、但可以用相对较少的时间优先回收包含垃圾最多区块。这也是为什么G1命名为Garbage First的原因：第一时间处理垃圾最多的区块。要使用G1回收器需要在启动是配置以下参数：
>>>> G1相对CMS回收器来说优点在于：

>>>> 1、因为划分了很多区块，回收时减小了内存碎片的产生；

>>>> 2、G1适用于新生代和老年代，而CMS只适用于老年代。

### 12.6 性能监控工具
工欲善其事必先利其器，性能优化和故障排查在我们大都数人眼里是件比较棘手的事情，一是需要具备一定的原理知识作为基础，二是需要掌握排查问题和解决问题的流程、方法。
#### 12.6.1 Linux系统监控命令/工具
>> * uptime：该命令将显示目前服务器持续运行的时间，以及负载情况。
>> * top：查看当前系统的CPU/内存以及相关的进程状态。
>> * vmstat：可以查看系统CPU/内存、swap、io等情况。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/vmstat.png)
>>>> 上面的命令每隔1秒采样一次，一共采样四次。CPU占用率很高，上下文切换频繁，说明系统有线程正在频繁切换，这可能是你的程序开启了大量的线程存在资源竞争的情况。另外swap也是值得关注的指标，如果swpd过高则可能系统能使用的物理内存不足，不得不使用交换区内存，还有一个例外就是某些程序优先使用swap，导致swap飙升，而物理内存还有很多空余，这些情况是需要注意的。
>> * pidstat:第三方工具。
>>>>需要先安装：yum install sysstat   
>> * jps：jdk自带的工具JPS直接找到java程序的进程号。
>> * jstat：jdk自带的工具用于输出java程序内存使用情况，包括新生代、老年代、元数据区容量、垃圾回收情况。
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/jstat.png)
>>>> 上述命令输出进程ID为3618的内存使用情况（每2000毫秒输出一次，一共输出20次）
>>>> S0：幸存1区当前使用比例
>>>> S1：幸存2区当前使用比例
>>>> E：伊甸园区使用比例
>>>> O：老年代使用比例
>>>> M：元数据区使用比例
>>>> CCS：压缩使用比例
>>>> YGC：年轻代垃圾回收次数
>>>> FGC：老年代垃圾回收次数
>>>> FGCT：老年代垃圾回收消耗时间
>>>> GCT：垃圾回收消耗总时间
>> * jmap：jdk自带的工具用于输出java程序中内存对象的情况，包括有哪些对象，对象的数量。
>>>> 常用的方式是将指定进程的内存heap输出到外部文件，再由专门的heap分析工具进行分析,例如mat（Memory Analysis Tool），所以我们常用的命令是：
>>>> jmap -dump:live,format=b,file=heap.hprof 3618
>>>> 将heap.hprof传输出来到window电脑上使用mat(如：MemoryAnalyzer)工具分析：
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/jmap.png)
>> * jstack：jdk自带的工具用户输出java程序线程栈的情况，常用于定位因为某些线程问题造成的故障或性能问题。    
>>>> jstack 3618 > jstack.out
>>>> 上述命令将进程ID为3618的栈信息输出到外部文件，便于传输到windows电脑上进行分析。

#### 12.6.2 Windows系统监控 工具
>> * jvisualvm.exe:JDK自带工具
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/jvisualvm.png)
>> * MemoryAnalyzer.exe

一般故障排查流程：
![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/analyzeflow.png)

## 12.7 JVM调优
调优的最终目的都是为了令应用程序使用最小的硬件消耗来承载更大的吞吐。jvm的调优也不例外，jvm调优主要是针对垃圾收集器的收集性能优化，令运行在虚拟机上的应用能够使用更少的内存以及延迟获取更大的吞吐量。当然这里的最少是最优的选择，而不是越少越好。

1、性能定义

要查找和评估器性能瓶颈，首先要知道性能定义，对于jvm调优来说，我们需要知道以下三个定义属性，依作为评估基础:
>> * 吞吐量：重要指标之一，是指不考虑垃圾收集引起的停顿时间或内存消耗，垃圾收集器能支撑应用达到的最高性能指标。 
>> * 延迟：其度量标准是缩短由于垃圾啊收集引起的停顿时间或者完全消除因垃圾收集所引起的停顿，避免应用运行时发生抖动。 
>> * 内存占用：垃圾收集器流畅运行所需要 的内存数量。 

这三个属性中，其中一个任何一个属性性能的提高，几乎都是以另外一个或者两个属性性能的损失作代价，不可兼得，具体某一个属性或者两个属性的性能对应用来说比较重要，要基于应用的业务需求来确定。

2、性能调优原则

在调优过程中，我们应该谨记以下3个原则，以便帮助我们更轻松的完成垃圾收集的调优，从而达到应用程序的性能要求。

>> * MinorGC回收原则： 每次minor GC 都要尽可能多的收集垃圾对象。以减少应用程序发生Full GC的频率。
>> * GC内存最大化原则：处理吞吐量和延迟问题时候，垃圾处理器能使用的内存越大，垃圾收集的效果越好，应用程序也会越来越流畅。
>> * GC调优3选2原则: 在性能属性里面，吞吐量、延迟、内存占用，我们只能选择其中两个进行调优，不可三者兼得。

3、性能调优流程

以上就是对应用程序进行jvm调优的基本流程，我们可以看到，jvm调优是根据性能测试结果不断优化配置而多次迭代的过程。在达到每一个系统需求指标之前，之前的每个步骤都有可能经历多次迭代。有时候为了达到某一方面的指标，有可能需要对之前的参数进行多次调整，进而需要把之前的所有步骤重新测试一遍。
另外调优一般是从满足程序的内存使用需求开始的，之后是时间延迟的要求，最后才是吞吐量的要求，要基于这个步骤来不断优化，每一个步骤都是进行下一步的基础，不可逆行之。以下我们针对每个步骤进行详细的示例讲解。
在JVM的运行模式方面，我们直接选择server模式，这也是jdk1.6以后官方推荐的模式。
在垃圾收集器方面，我们直接采用了jdk1.6-1.8 中默认的parallel收集器（新生代采用parallelGC,老生代采用parallelOldGC）。

## 13.设计模式
设计模式（Design pattern）代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。

设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。 毫无疑问，设计模式于己于他人于系统都是多赢的，设计模式使代码编制真正工程化，设计模式是软件工程的基石，如同大厦的一块块砖石一样。项目中合理地运用设计模式可以完美地解决很多问题，每种模式在现实中都有相应的原理来与之对应，每种模式都描述了一个在我们周围不断重复发生的问题，以及该问题的核心解决方案，这也是设计模式能被广泛应用的原因。

### 13.1 设计模式的类型
创建型模式（5种）：工厂模式，抽象工厂模式，单例模式，建造者模式，原型模式

结构型模式（8种）：适配器模式、桥接模式、过滤器模式、组合模式、装饰器模式、外观模式、享元模式、代理模式

行为型模式（12种）：责任链模式、命令模式、解释器模式、迭代器模式、中介者模式、备忘录模式、观察者模式、状态模式、空对象模式、策略模式、模板模式、访问者模式

J2EE模式（8种）：MVC 模式、业务代表模式、组合实体模式、数据访问对象模式、前端控制器模式、拦截过滤器模式、服务定位器模式、传输对象模式

#### 13.1.1 创建型模式
这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
>> * 工厂模式（Factory Pattern）
>>>> 常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化。

>>>> ![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/SimpleFactory.png)

>>>> ![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/Factory1.png)

>> * 抽象工厂模式（Abstract Factory Pattern）
>>>> 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
>>>> 如：系统的产品有多于一个的产品族，当新增一族产品时只需要新增一个工厂类的实现而需要修改其他产品族的工厂类。

>>>> ![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/DP-AbstractFactory.png)

>>>> ![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/P-AbstractFactory-AddFactory.png)

>>>> ![](https://github.com/HolyPaPa99/Core-Java-Concept/blob/master/images/P-AbstractFactory-AddProduct.png)

>> * 单例模式（Singleton Pattern）
>> * 建造者模式（Builder Pattern）
>> * 原型模式（Prototype Pattern）

#### 13.1.2 结构型模式
这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
>> * 适配器模式（Adapter Pattern）
>> * 桥接模式（Bridge Pattern）
>> * 过滤器模式（Filter、Criteria Pattern）
>> * 组合模式（Composite Pattern）
>> * 装饰器模式（Decorator Pattern）
>> * 外观模式（Facade Pattern）
>> * 享元模式（Flyweight Pattern）
>> * 代理模式（Proxy Pattern）

#### 13.1.3 行为型模式
这些设计模式特别关注对象之间的通信。
>> * 责任链模式（Chain of Responsibility Pattern）
>> * 命令模式（Command Pattern）
>> * 解释器模式（Interpreter Pattern）
>> * 迭代器模式（Iterator Pattern）
>> * 中介者模式（Mediator Pattern）
>> * 备忘录模式（Memento Pattern）
>> * 观察者模式（Observer Pattern）
>> * 状态模式（State Pattern）
>> * 空对象模式（Null Object Pattern）
>> * 策略模式（Strategy Pattern）
>> * 模板模式（Template Pattern）
>> * 访问者模式（Visitor Pattern）

#### J2EE 模式
这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
>> * MVC 模式（MVC Pattern）
>> * 业务代表模式（Business Delegate Pattern）
>> * 组合实体模式（Composite Entity Pattern）
>> * 数据访问对象模式（Data Access Object Pattern）
>> * 前端控制器模式（Front Controller Pattern）
>> * 拦截过滤器模式（Intercepting Filter Pattern）
>> * 服务定位器模式（Service Locator Pattern）
>> * 传输对象模式（Transfer Object Pattern）

### 13.2 设计模式的六大原则
1、开闭原则（Open Close Principle）

开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

2、里氏代换原则（Liskov Substitution Principle）

里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

3、依赖倒转原则（Dependence Inversion Principle）

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）

这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5、迪米特法则，又称最少知道原则（Demeter Principle）

最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）

合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。