package retrofit2.converter.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes14.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final t moshi;
    private final boolean serializeNulls;
    private final boolean streaming;

    public static MoshiConverterFactory create() {
        return create(new t.a().d());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    public static MoshiConverterFactory create(t tVar) {
        if (tVar != null) {
            return new MoshiConverterFactory(tVar, false, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls, this.streaming);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls, this.streaming);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        h hVarE = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            hVarE = hVarE.lenient();
        }
        if (this.failOnUnknown) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.serializeNulls) {
            hVarE = hVarE.serializeNulls();
        }
        return new MoshiRequestBodyConverter(hVarE, this.streaming);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        h hVarE = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            hVarE = hVarE.lenient();
        }
        if (this.failOnUnknown) {
            hVarE = hVarE.failOnUnknown();
        }
        if (this.serializeNulls) {
            hVarE = hVarE.serializeNulls();
        }
        return new MoshiResponseBodyConverter(hVarE);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true, this.streaming);
    }

    public MoshiConverterFactory withStreaming() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, this.serializeNulls, true);
    }

    private MoshiConverterFactory(t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.moshi = tVar;
        this.lenient = z10;
        this.failOnUnknown = z11;
        this.serializeNulls = z12;
        this.streaming = z13;
    }
}
