package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.RequestBody;
import okhttp3.j;
import retrofit2.Converter;

/* loaded from: classes14.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final j MEDIA_TYPE = j.e("text/plain; charset=UTF-8");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((ScalarRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        return RequestBody.create(MEDIA_TYPE, String.valueOf(t10));
    }

    private ScalarRequestBodyConverter() {
    }
}
