# solid-principle

<h1>1. Single Responsibility Principle - 단일 책임 원칙</h1>
- 하나의 class 는 하나의 책임만 진다. 해당 class 의 변경의 이유는 오직 하나여야만 한다.

1. Testing - 단일 책임의 원칙을 잘 따른 class 는 test case 가 적다.

2. Lower Coupling - 적은 기능을 할 수록 다른 class 에 대한 의존성 또한 낮아진다.

<h1>2. Open for Extension, Close for Modification Principle</h1>
- class 는 확장성을 보장해야 하고, 변경은 최소화 해야한다. 이미 작성된 코드에 대해서는 변경을 최소화 해야 한다. 예외 케이스는 Bug 이다. <br>
- 확장은 상속(Inheritance) 를 통해서 한다.

<h1>3. Liskov Substitution Principle - 리스코프 치환 원칙</h1>
- 만약 A Class 가 class B 의 Subtype 이면 (extends), B를 A로 대체할 수 있어야한다.

<h1>4. Interface Segregation Principle</h1>
- 큰 Interface ( 추상 메서드 수가 많은 ) 는 작은 인터페이스 ( 추상 메서드 수가 적은 ) Interface 로 분리되어야 한다. <br> 
&nbsp;&nbsp;분리된 Interface 들을 구현하는 class 는 오직 필요한 메서드만 구현하게 된다.
- Interface 는 상속과 다르게 다수의 구현이 가능하다.

<h1>5. Dependency Inversion Principle - 의존 역전의 원칙</h1>
- module 간의 (has a 관계) coupling 을 추상화를 통해서 낮춘다. <br>
- member class 는 interface 를 사용하여 추상화 한다.
