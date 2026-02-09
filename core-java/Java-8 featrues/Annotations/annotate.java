/*
! What are annotations in Java?
Annotations are labels you attach to Java elements (classes, methods, fields, etc.) to give extra information to the compiler, tools, or frameworks.
They don’t change logic by themselves, but they influence checks, warnings, code generation, or runtime behavior.

! Core Java annotations (the important ones)
*1. @Override
Says a method must override a parent class method.
Helps catch mistakes at compile time.

*2. @Deprecated
Marks something as outdated and not recommended for use.

*3. @SuppressWarnings
Tells the compiler to ignore specific warnings.

*4. @FunctionalInterface
Ensures an interface has only one abstract method (used for lambdas).

*5. @SafeVarargs
Prevents warnings related to variable arguments with generics.

! Meta-annotations (annotations for annotations)
These define how annotations behave.

*6. @Target
Where the annotation can be used (class, method, field, etc.).

*7. @Retention
How long the annotation exists (source, compile time, or runtime).

*8. @Documented
Includes the annotation in generated documentation.

*9. @Inherited
Allows subclasses to inherit annotations from parent classes.

*10. @Repeatable
Allows the same annotation to be used multiple times on one element.
 */
