package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomAnnotations {

  @MyAnnotation
  public String aString = "";

  @MyAnnotation
  public void aMethod() {

  }

  public static void main(String[] args) {
    Field[] fields = CustomAnnotations.class.getFields();
    Method[] methods = CustomAnnotations.class.getMethods();

    for (Field field : fields) {
      String data = field.getName();
      Annotation[] annotations = field.getAnnotations();
      for (Annotation annotation : annotations) {
        if (annotation.annotationType() == MyAnnotation.class) {
          data += " -HAS MY ANNOTATION";
        }
      }
      System.out.println(data);
    }

    for (Method method : methods) {
      String data = method.getName();
      if (method.isAnnotationPresent(MyAnnotation.class)) {
        data += " -HAS MY ANNOTATION";
      }
      System.out.println(data);
    }
  }
}
