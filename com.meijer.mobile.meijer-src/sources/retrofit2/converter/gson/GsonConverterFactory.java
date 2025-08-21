package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes14.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final Gson gson;
    private final boolean streaming;

    public static GsonConverterFactory create() {
        return create(new Gson());
    }

    public static GsonConverterFactory create(Gson gson) {
        if (gson != null) {
            return new GsonConverterFactory(gson, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.q(a.get(type)), this.streaming);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.q(a.get(type)));
    }

    public GsonConverterFactory withStreaming() {
        return new GsonConverterFactory(this.gson, true);
    }

    private GsonConverterFactory(Gson gson, boolean z10) {
        this.gson = gson;
        this.streaming = z10;
    }
}
