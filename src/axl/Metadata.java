package axl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

Метаданные для компилятора Axolotl.
Хранят информацию про данные и методы,
которые нет возможности реализовать на
простом Java.

*/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Metadata {
    int version();
    String data();
}
