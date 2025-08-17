package retrofit2;

import android.annotation.TargetApi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

@TargetApi(24)
@IgnoreJRERequirement
/* loaded from: classes13.dex */
public final class OptionalConverterFactory extends Converter.Factory {

    @IgnoreJRERequirement
    static final class OptionalConverter<T> implements Converter<ResponseBody, Optional<T>> {
        private final Converter<ResponseBody, T> delegate;

        @Override // retrofit2.Converter
        public Optional<T> convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.delegate.convert(responseBody));
        }

        OptionalConverter(Converter<ResponseBody, T> converter) {
            this.delegate = converter;
        }
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
