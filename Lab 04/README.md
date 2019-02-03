# Lab 04: Strategy Patterns

## Tasks
- Strategy (EncryptionStrategy): Is an interface common to all supported algorithm-specific classes.
- ConcreteStrategy (AesEncryptionStrategy, BlowfishEncryptionStrategy and TripleDESEncryptionStrategy): Implements the algorithm using the Strategy interface.
- Context (Encryptor): Provides the interface to client for encrypting data. The Context maintains a reference to a Strategy object and is instantiated and initialized by clients with a ConcreteStrategy object.

## Structure

EncryptionStrategy.java
```java
public interface EncryptionStrategy {
    void encryptData(String plainText);
}
```

AesEncryptionStrategy.java
```java
public class AesEncryptionStrategy implements EncryptionStrategy{
	\\ Your own code
}
```

BlowfishEncryptionStrategy.java
```java
public class BlowfishEncryptionStrategy implements EncryptionStrategy{
	\\ Your own code
}
```

TripleDESEncryptionStrategy.java
```java
public class TripleDESEncryptionStrategy implements EncryptionStrategy{
	\\ Your own code
}
```

Encryptor.java
```java
public class Encryptor {
	\\ Your own code
}
```

EncryptorTest.java
```java
public class EncryptorTest {
	\\ Your own code
}
```