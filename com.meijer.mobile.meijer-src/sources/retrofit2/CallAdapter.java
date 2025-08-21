package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes14.dex */
public interface CallAdapter<R, T> {
    T adapt(Call<R> call);

    Type responseType();

    public static abstract class Factory {
        public abstract CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);

        protected static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i10, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return Utils.getRawType(type);
        }
    }
}
