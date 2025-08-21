package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.k;
import retrofit2.ParameterHandler;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* loaded from: classes14.dex */
final class RequestFactory {
    private final HttpUrl baseUrl;
    private final okhttp3.j contentType;
    private final boolean hasBody;
    private final Headers headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;
    private final String relativeUrl;
    private final Class<?> service;

    static final class Builder {
        okhttp3.j contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;
        Headers headers;
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;
        ParameterHandler<?>[] parameterHandlers;
        final Type[] parameterTypes;
        String relativeUrl;
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;
        final Class<?> service;
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);

        private ParameterHandler<?> parseParameter(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation annotation : annotationArr) {
                    ParameterHandler<?> parameterAnnotation = parseParameterAnnotation(i10, type, annotationArr, annotation);
                    if (parameterAnnotation != null) {
                        if (parameterHandler != null) {
                            throw Utils.parameterError(this.method, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        parameterHandler = parameterAnnotation;
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            if (z10) {
                try {
                    if (Utils.getRawType(type) == Continuation.class) {
                        this.isKotlinSuspendFunction = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw Utils.parameterError(this.method, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private ParameterHandler<?> parseParameterAnnotation(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                validateResolvableType(i10, type);
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.gotPath) {
                    throw Utils.parameterError(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.relativeUrl != null) {
                    throw Utils.parameterError(this.method, i10, "@Url cannot be used with @%s URL", this.httpMethod);
                }
                this.gotUrl = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new ParameterHandler.RelativeUrl(this.method, i10);
                }
                throw Utils.parameterError(this.method, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Path) {
                validateResolvableType(i10, type);
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.relativeUrl == null) {
                    throw Utils.parameterError(this.method, i10, "@Path can only be used with relative url on @%s", this.httpMethod);
                }
                this.gotPath = true;
                Path path = (Path) annotation;
                String strValue = path.value();
                validatePathName(i10, strValue);
                return new ParameterHandler.Path(this.method, i10, strValue, this.retrofit.stringConverter(type, annotationArr), path.encoded());
            }
            if (annotation instanceof Query) {
                validateResolvableType(i10, type);
                Query query = (Query) annotation;
                String strValue2 = query.value();
                boolean zEncoded = query.encoded();
                Class<?> rawType = Utils.getRawType(type);
                this.gotQuery = true;
                if (!Iterable.class.isAssignableFrom(rawType)) {
                    if (!rawType.isArray()) {
                        return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(type, annotationArr), zEncoded);
                    }
                    return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), zEncoded).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryName) {
                validateResolvableType(i10, type);
                boolean zEncoded2 = ((QueryName) annotation).encoded();
                Class<?> rawType2 = Utils.getRawType(type);
                this.gotQueryName = true;
                if (!Iterable.class.isAssignableFrom(rawType2)) {
                    if (!rawType2.isArray()) {
                        return new ParameterHandler.QueryName(this.retrofit.stringConverter(type, annotationArr), zEncoded2);
                    }
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), zEncoded2).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded2).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryMap) {
                validateResolvableType(i10, type);
                Class<?> rawType3 = Utils.getRawType(type);
                this.gotQueryMap = true;
                if (!Map.class.isAssignableFrom(rawType3)) {
                    throw Utils.parameterError(this.method, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type supertype = Utils.getSupertype(type, rawType3, Map.class);
                if (!(supertype instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                Type parameterUpperBound = Utils.getParameterUpperBound(0, parameterizedType);
                if (String.class == parameterUpperBound) {
                    return new ParameterHandler.QueryMap(this.method, i10, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                }
                throw Utils.parameterError(this.method, i10, "@QueryMap keys must be of type String: " + parameterUpperBound, new Object[0]);
            }
            if (annotation instanceof Header) {
                validateResolvableType(i10, type);
                Header header = (Header) annotation;
                String strValue3 = header.value();
                Class<?> rawType4 = Utils.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType4)) {
                    if (!rawType4.isArray()) {
                        return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(type, annotationArr), header.allowUnsafeNonAsciiValues());
                    }
                    return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr), header.allowUnsafeNonAsciiValues()).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), header.allowUnsafeNonAsciiValues()).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof HeaderMap) {
                if (type == Headers.class) {
                    return new ParameterHandler.Headers(this.method, i10);
                }
                validateResolvableType(i10, type);
                Class<?> rawType5 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType5)) {
                    throw Utils.parameterError(this.method, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type supertype2 = Utils.getSupertype(type, rawType5, Map.class);
                if (!(supertype2 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                Type parameterUpperBound2 = Utils.getParameterUpperBound(0, parameterizedType2);
                if (String.class == parameterUpperBound2) {
                    return new ParameterHandler.HeaderMap(this.method, i10, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType2), annotationArr), ((HeaderMap) annotation).allowUnsafeNonAsciiValues());
                }
                throw Utils.parameterError(this.method, i10, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new Object[0]);
            }
            if (annotation instanceof Field) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String strValue4 = field.value();
                boolean zEncoded3 = field.encoded();
                this.gotField = true;
                Class<?> rawType6 = Utils.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType6)) {
                    if (!rawType6.isArray()) {
                        return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(type, annotationArr), zEncoded3);
                    }
                    return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), zEncoded3).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded3).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof FieldMap) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> rawType7 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType7)) {
                    throw Utils.parameterError(this.method, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type supertype3 = Utils.getSupertype(type, rawType7, Map.class);
                if (!(supertype3 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                Type parameterUpperBound3 = Utils.getParameterUpperBound(0, parameterizedType3);
                if (String.class == parameterUpperBound3) {
                    Converter converterStringConverter = this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType3), annotationArr);
                    this.gotField = true;
                    return new ParameterHandler.FieldMap(this.method, i10, converterStringConverter, ((FieldMap) annotation).encoded());
                }
                throw Utils.parameterError(this.method, i10, "@FieldMap keys must be of type String: " + parameterUpperBound3, new Object[0]);
            }
            if (!(annotation instanceof Part)) {
                if (annotation instanceof PartMap) {
                    validateResolvableType(i10, type);
                    if (!this.isMultipart) {
                        throw Utils.parameterError(this.method, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.gotPart = true;
                    Class<?> rawType8 = Utils.getRawType(type);
                    if (!Map.class.isAssignableFrom(rawType8)) {
                        throw Utils.parameterError(this.method, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type supertype4 = Utils.getSupertype(type, rawType8, Map.class);
                    if (!(supertype4 instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                    Type parameterUpperBound4 = Utils.getParameterUpperBound(0, parameterizedType4);
                    if (String.class == parameterUpperBound4) {
                        Type parameterUpperBound5 = Utils.getParameterUpperBound(1, parameterizedType4);
                        if (k.c.class.isAssignableFrom(Utils.getRawType(parameterUpperBound5))) {
                            throw Utils.parameterError(this.method, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new ParameterHandler.PartMap(this.method, i10, this.retrofit.requestBodyConverter(parameterUpperBound5, annotationArr, this.methodAnnotations), ((PartMap) annotation).encoding());
                    }
                    throw Utils.parameterError(this.method, i10, "@PartMap keys must be of type String: " + parameterUpperBound4, new Object[0]);
                }
                if (annotation instanceof Body) {
                    validateResolvableType(i10, type);
                    if (this.isFormEncoded || this.isMultipart) {
                        throw Utils.parameterError(this.method, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.gotBody) {
                        throw Utils.parameterError(this.method, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        Converter converterRequestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                        this.gotBody = true;
                        return new ParameterHandler.Body(this.method, i10, converterRequestBodyConverter);
                    } catch (RuntimeException e10) {
                        throw Utils.parameterError(this.method, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof Tag)) {
                    return null;
                }
                validateResolvableType(i10, type);
                Class<?> clsBoxIfPrimitive = boxIfPrimitive(Utils.getRawType(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    ParameterHandler<?> parameterHandler = this.parameterHandlers[i11];
                    if ((parameterHandler instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler).cls.equals(clsBoxIfPrimitive)) {
                        throw Utils.parameterError(this.method, i10, "@Tag type " + clsBoxIfPrimitive.getName() + " is duplicate of " + Platform.reflection.describeMethodParameter(this.method, i11) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new ParameterHandler.Tag(clsBoxIfPrimitive);
            }
            validateResolvableType(i10, type);
            if (!this.isMultipart) {
                throw Utils.parameterError(this.method, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Part part = (Part) annotation;
            this.gotPart = true;
            String strValue5 = part.value();
            Class<?> rawType9 = Utils.getRawType(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(rawType9)) {
                    if (rawType9.isArray()) {
                        if (k.c.class.isAssignableFrom(rawType9.getComponentType())) {
                            return ParameterHandler.RawPart.INSTANCE.array();
                        }
                        throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (k.c.class.isAssignableFrom(rawType9)) {
                        return ParameterHandler.RawPart.INSTANCE;
                    }
                    throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (k.c.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) type)))) {
                        return ParameterHandler.RawPart.INSTANCE.iterable();
                    }
                    throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw Utils.parameterError(this.method, i10, rawType9.getSimpleName() + " must include generic type (e.g., " + rawType9.getSimpleName() + "<String>)", new Object[0]);
            }
            Headers headersN = Headers.n("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", part.encoding());
            if (!Iterable.class.isAssignableFrom(rawType9)) {
                if (!rawType9.isArray()) {
                    if (k.c.class.isAssignableFrom(rawType9)) {
                        throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new ParameterHandler.Part(this.method, i10, headersN, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
                }
                Class<?> clsBoxIfPrimitive2 = boxIfPrimitive(rawType9.getComponentType());
                if (k.c.class.isAssignableFrom(clsBoxIfPrimitive2)) {
                    throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ParameterHandler.Part(this.method, i10, headersN, this.retrofit.requestBodyConverter(clsBoxIfPrimitive2, annotationArr, this.methodAnnotations)).array();
            }
            if (type instanceof ParameterizedType) {
                Type parameterUpperBound6 = Utils.getParameterUpperBound(0, (ParameterizedType) type);
                if (k.c.class.isAssignableFrom(Utils.getRawType(parameterUpperBound6))) {
                    throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ParameterHandler.Part(this.method, i10, headersN, this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations)).iterable();
            }
            throw Utils.parameterError(this.method, i10, rawType9.getSimpleName() + " must include generic type (e.g., " + rawType9.getSimpleName() + "<String>)", new Object[0]);
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers parseHeaders(String[] strArr, boolean z10) {
            Headers.a aVar = new Headers.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.contentType = okhttp3.j.e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw Utils.methodError(this.method, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.e(strSubstring, strTrim);
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.f();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z10) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (PARAM_URL_REGEX.matcher(strSubstring).find()) {
                    throw Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof DELETE) {
                parseHttpMethodAndPath("DELETE", ((DELETE) annotation).value(), false);
                return;
            }
            if (annotation instanceof GET) {
                parseHttpMethodAndPath("GET", ((GET) annotation).value(), false);
                return;
            }
            if (annotation instanceof HEAD) {
                parseHttpMethodAndPath("HEAD", ((HEAD) annotation).value(), false);
                return;
            }
            if (annotation instanceof PATCH) {
                parseHttpMethodAndPath("PATCH", ((PATCH) annotation).value(), true);
                return;
            }
            if (annotation instanceof POST) {
                parseHttpMethodAndPath("POST", ((POST) annotation).value(), true);
                return;
            }
            if (annotation instanceof PUT) {
                parseHttpMethodAndPath("PUT", ((PUT) annotation).value(), true);
                return;
            }
            if (annotation instanceof OPTIONS) {
                parseHttpMethodAndPath("OPTIONS", ((OPTIONS) annotation).value(), false);
                return;
            }
            if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
                return;
            }
            if (annotation instanceof retrofit2.http.Headers) {
                retrofit2.http.Headers headers = (retrofit2.http.Headers) annotation;
                String[] strArrValue = headers.value();
                if (strArrValue.length == 0) {
                    throw Utils.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(strArrValue, headers.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof Multipart) {
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i10, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw Utils.parameterError(this.method, i10, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw Utils.parameterError(this.method, i10, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        RequestFactory build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new ParameterHandler[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.parameterHandlers[i11] = parseParameter(i11, this.parameterTypes[i11], this.parameterAnnotationsArray[i11], i11 == i10);
                i11++;
            }
            if (this.relativeUrl == null && !this.gotUrl) {
                throw Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
            }
            boolean z10 = this.isFormEncoded;
            if (!z10 && !this.isMultipart && !this.hasBody && this.gotBody) {
                throw Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.gotField) {
                throw Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.isMultipart || this.gotPart) {
                return new RequestFactory(this);
            }
            throw Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        Builder(Retrofit retrofit, Class<?> cls, Method method) {
            this.retrofit = retrofit;
            this.service = cls;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        private void validateResolvableType(int i10, Type type) {
            if (!Utils.hasUnresolvableType(type)) {
            } else {
                throw Utils.parameterError(this.method, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    static RequestFactory parseAnnotations(Retrofit retrofit, Class<?> cls, Method method) {
        return new Builder(retrofit, cls, method).build();
    }

    Request create(Object obj, Object[] objArr) throws IOException {
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + parameterHandlerArr.length + ")");
        }
        RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        if (this.isKotlinSuspendFunction) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            parameterHandlerArr[i10].apply(requestBuilder, objArr[i10]);
        }
        return requestBuilder.get().r(Invocation.class, new Invocation(this.service, obj, this.method, arrayList)).b();
    }

    RequestFactory(Builder builder) {
        this.service = builder.service;
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }
}
