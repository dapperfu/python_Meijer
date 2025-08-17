package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarResponseBodyConverters;

/* loaded from: classes13.dex */
public final class ScalarsConverterFactory extends Converter.Factory {
    public static ScalarsConverterFactory create() {
        return new ScalarsConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return ScalarRequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE;
        }
        if (type == Character.class || type == Character.TYPE) {
            return ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE;
        }
        if (type == Double.class || type == Double.TYPE) {
            return ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE;
        }
        if (type == Float.class || type == Float.TYPE) {
            return ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE;
        }
        if (type == Long.class || type == Long.TYPE) {
            return ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE;
        }
        if (type == Short.class || type == Short.TYPE) {
            return ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE;
        }
        return null;
    }

    private ScalarsConverterFactory() {
    }
}
