
适配器模式（Adapter Pattern）是一种结构型设计模式，它允许接口不兼容的类能够一起工作。适配器模式通过引入一个适配器类来将一个类的接口转换成客户端希望的另一个接口。这种模式通常用于旧系统的复用，使得旧接口与新接口兼容。

适配器模式涉及以下角色：

+ 目标接口（Target Interface）：客户端希望的接口，适配器模式将现有接口转换成该接口。
+ 适配器类（Adapter Class）：实现目标接口并包含现有类的对象实例，在适配器类中调用现有类的方法，将其转换为目标接口的方法。
+ 被适配者（Adaptee）：需要被适配的类，它包含客户端不兼容的接口。

## Demo1
**适配器模式（Adapter Pattern）：**
在这个例子中，AdaptedRandomDoubles 类充当了适配器的角色。适配器模式允许你将一个类的接口转换成客户端期望的另一个接口。在这里，AdaptedRandomDoubles 通过继承 RandomDoubles 类并实现 Readable 接口，使得 RandomDoubles 的实例可以被用作 Scanner 的数据源。

**接口的强大之处：**
接口提供了一种机制，可以使不相关的类之间实现共同的行为。在这个例子中，RandomDoubles 类本身没有实现 Readable 接口，但通过使用接口，你可以在其基础上创建一个新的类（AdaptedRandomDoubles），使其具备了 RandomDoubles 和 Readable 的行为。这种灵活性和可扩展性是接口的一大优势，因为它们允许你在不改变现有代码结构的情况下，为类添加新的行为。
