package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* loaded from: classes14.dex */
final class BuiltInConverters extends Converter.Factory {

    static final class BufferingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return Utils.buffer(responseBody);
            } finally {
                responseBody.close();
            }
        }

        BufferingResponseBodyConverter() {
        }
    }

    static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }

        ToStringConverter() {
        }
    }

    static final class UnitResponseBodyConverter implements Converter<ResponseBody, Unit> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.f143329a;
        }

        UnitResponseBodyConverter() {
        }
    }

    static final class VoidResponseBodyConverter implements Converter<ResponseBody, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }

        VoidResponseBodyConverter() {
        }
    }

    static final class RequestBodyConverter implements Converter<RequestBody, RequestBody> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }

        RequestBodyConverter() {
        }
    }

    static final class StreamingResponseBodyConverter implements Converter<ResponseBody, ResponseBody> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }

        StreamingResponseBodyConverter() {
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (Utils.isUnit(type)) {
            return UnitResponseBodyConverter.INSTANCE;
        }
        return null;
    }

    BuiltInConverters() {
    }
}
