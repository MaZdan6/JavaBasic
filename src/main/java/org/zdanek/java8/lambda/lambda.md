## Method References
* a first example    
    ```java
        Function<Person, Integer> f= person-> person.getAge();
        Function<Person, Integer> f= Person::getAge;
    ```
    
* a second example
    ```java    
        BinaryOperator<Integer> sum =(i1, i2) -> i1 + i2;
        BinaryOperator<Integer> sum2 =(i1, i2) -> Integer.sum(i1,i2);
    ```
* a second example
    ```java
        Consumer<String> printer = s-> System.out.println(s);
        Consumer<String> printer = s-> System.out::println;
    ```
## Interfaces have been modified in Java 8
    ```java
    public interface  Iterable<T>{
    
            default void forEach(Consumer<? super T> action){
                Object.requireNonNull(action){
                    for (T t: this){
                        action.accept(t);
                    }
                }
            }
        }
    
        @FunctionalInterface
        public interface  Iterable<T,R>{
            R apply (T t);
            static <T> Function <T,T> indentity(){
                return t ->t;
            }
        }
    ```