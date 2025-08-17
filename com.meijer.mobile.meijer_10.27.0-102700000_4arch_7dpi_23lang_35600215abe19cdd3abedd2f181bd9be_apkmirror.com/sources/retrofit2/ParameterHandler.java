package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.RequestBody;
import okhttp3.k;

/* loaded from: classes13.dex */
abstract class ParameterHandler<T> {

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, strConvert, this.encoded);
        }

        Field(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158175p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f158175p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f158175p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f158175p, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f158175p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, strConvert, this.encoded);
            }
        }

        FieldMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f158175p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final boolean allowUnsafeNonAsciiValues;
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, strConvert, this.allowUnsafeNonAsciiValues);
        }

        Header(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean allowUnsafeNonAsciiValues;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158176p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f158176p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f158176p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f158176p, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value), this.allowUnsafeNonAsciiValues);
            }
        }

        HeaderMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f158176p = i10;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }
    }

    static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158177p;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers == null) {
                throw Utils.parameterError(this.method, this.f158177p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(headers);
        }

        Headers(Method method, int i10) {
            this.method = method;
            this.f158177p = i10;
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158178p;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, this.f158178p, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }

        Part(Method method, int i10, okhttp3.Headers headers, Converter<T, RequestBody> converter) {
            this.method = method;
            this.f158178p = i10;
            this.headers = headers;
            this.converter = converter;
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158179p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f158179p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f158179p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f158179p, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addPart(okhttp3.Headers.n("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }

        PartMap(Method method, int i10, Converter<T, RequestBody> converter, String str) {
            this.method = method;
            this.f158179p = i10;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p, reason: collision with root package name */
        private final int f158180p;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            if (t10 != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t10), this.encoded);
                return;
            }
            throw Utils.parameterError(this.method, this.f158180p, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }

        Path(Method method, int i10, String str, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f158180p = i10;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, strConvert, this.encoded);
        }

        Query(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158181p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f158181p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f158181p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f158181p, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f158181p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, strConvert, this.encoded);
            }
        }

        QueryMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f158181p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t10), null, this.encoded);
        }

        QueryName(Converter<T, String> converter, boolean z10) {
            this.nameConverter = converter;
            this.encoded = z10;
        }
    }

    static final class RawPart extends ParameterHandler<k.c> {
        static final RawPart INSTANCE = new RawPart();

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, k.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }

        private RawPart() {
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158182p;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.f158182p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }

        RelativeUrl(Method method, int i10) {
            this.method = method;
            this.f158182p = i10;
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) {
            requestBuilder.addTag(this.cls, t10);
        }

        Tag(Class<T> cls) {
            this.cls = cls;
        }
    }

    abstract void apply(RequestBuilder requestBuilder, T t10) throws IOException;

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f158174p;

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t10) {
            if (t10 == null) {
                throw Utils.parameterError(this.method, this.f158174p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, e10, this.f158174p, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }

        Body(Method method, int i10, Converter<T, RequestBody> converter) {
            this.method = method;
            this.f158174p = i10;
            this.converter = converter;
        }
    }

    final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i10));
                }
            }
        };
    }

    final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }

    ParameterHandler() {
    }
}
