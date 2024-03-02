[![Java CI](https://github.com/xtermi2/java22/actions/workflows/maven.yml/badge.svg)](https://github.com/xtermi2/java22/actions/workflows/maven.yml)

# Schedule

- 2024/02/22 Final Release Candidate
- 2024/03/19 General Availability

# Java 22 Features

- [JEP 423: Region Pinning for G1](https://openjdk.org/jeps/423)
    - Reduce latency by implementing region pinning in G1, so that garbage collection need not be disabled during Java
      Native Interface (JNI) critical regions.
- [JEP 447: Statements before super(...) (Preview)](https://openjdk.org/jeps/447)
    - In constructors in the Java programming language, allow statements that do not reference the instance being
      created to appear before an explicit constructor invocation.
    - see example `StatementsBeforeSuper.java`
- [JEP 454: Foreign Function & Memory API](https://openjdk.java.net/jeps/454)
    - Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime.
      Combination of 2 APIs introduced in previous JDKs:
    - Foreign-Memory Access API (incubator in 14, 15 and 16)
    - Foreign Linker API (incubator in 16)
    - The main changes since the 3rd preview are:
        - Provided a new linker option allowing clients to pass heap segments to downcall method handles;
        - Introduced the Enable-Native-Access JAR-file manifest attribute, allowing code in executable JAR files to call
          restricted methods without having to use the --enable-native-access command-line option;
        - Enabled clients to build C-language function descriptors programmatically, avoiding platform-specific
          constants;
        - Improved support for variable-length arrays in native memory; and
          Added support for arbitrary charsets for native strings.
    - see example `ForeignFunctionAndMemoryAPI.java`
- [JEP 456: Unnamed Variables & Patterns](https://openjdk.org/jeps/456)
    - TODO
- [JEP 456: 457: Class-File API (Preview)](https://openjdk.org/jeps/457)
    - TODO
- [JEP 458: Launch Multi-File Source-Code Programs](https://openjdk.org/jeps/458)
    - TODO
- [JEP 459: String Templates (Second Preview)](https://openjdk.org/jeps/430)
    - String templates complement Java's existing string literals and text blocks by coupling literal text with embedded
      expressions and template processors to produce specialized results.
    - Except for a technical change in the types of template expressions, there are no changes relative to the first
      preview
    - see example `StringTemplates.java`
- [JEP 460: Vector API (Seventh Incubator)](https://openjdk.org/jeps/460)
    - Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on
      supported CPU architectures, thus achieving performance superior to equivalent scalar computations.
    - Notable changes since 6th incubator:
        - Support vector access with heap MemorySegments that are backed by an array of any primitive element type.
          Previously access was limited to heap MemorySegments backed by an array of byte.
- [JEP 461: Stream Gatherers (Preview)](https://openjdk.org/jeps/461)
    - TODO
- [JEP 462: Structured Concurrency (Second Preview)](https://openjdk.org/jeps/453)
    - Simplify concurrent programming by introducing an API for structured concurrency. Structured concurrency treats
      groups of related tasks running in different threads as a single unit of work, thereby streamlining error handling
      and cancellation, improving reliability, and enhancing observability.
    - no changes since last preview in JDK 21.
    - see example `StructuredConcurrency.java`
- [JEP 463: Implicitly Declared Classes and Instance Main Methods (Second Preview)](https://openjdk.org/jeps/463)
    - Evolve the Java language so that students can write their first programs without needing to understand language
      features designed for large programs. Far from using a separate dialect of Java, students can write streamlined
      declarations for single-class programs and then seamlessly expand their programs to use more advanced features as
      their skills grow.
    - changes since first preview in JDK 21:
        - A source file without an enclosing class declaration is said to implicitly declare a class with a name chosen
          by the host system. Such implicitly declared classes behave like normal top-level classes and require no
          additional tooling, library, or runtime support.
        - simplify the selection process for the main method.
    - see example `UnnamedClasses.java`
- [JEP 464: Scoped Values (Second Preview)](https://openjdk.org/jeps/464)
    - Enable the sharing of immutable data within and across threads. They are preferred to thread-local variables,
      especially when using large numbers of virtual threads.
    - Unlike a thread-local variable, a scoped value is written once and is then immutable, and is available only for a
      bounded period during execution of the thread.
    - In effect, a scoped value is an implicit method parameter. It is "as if" every method in a sequence of calls has
      an additional, invisible, parameter. None of the methods declare this parameter and only the methods that have
      access to the scoped value object can access its value (the data). Scoped values make it possible to pass data
      securely from a caller to a faraway callee through a sequence of intermediate methods that do not declare a
      parameter for the data and have no access to the data.
    - no changes since the first preview in JDK 21.
    - see example `ScopedValueServer.java`

----------------------

##### Other References

- https://openjdk.org/projects/jdk/22/
