package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes14.dex */
abstract class ServiceMethod<T> {
    abstract T invoke(Object obj, Object[] objArr);

    ServiceMethod() {
    }

    static <T> ServiceMethod<T> parseAnnotations(Retrofit retrofit, Class<?> cls, Method method) {
        RequestFactory annotations = RequestFactory.parseAnnotations(retrofit, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!Utils.hasUnresolvableType(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return HttpServiceMethod.parseAnnotations(retrofit, method, annotations);
            }
            throw Utils.methodError(method, "Service methods cannot return void.", new Object[0]);
        }
        throw Utils.methodError(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }
}
