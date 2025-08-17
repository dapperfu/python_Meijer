package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kw.C15328e;
import kw.InterfaceC15329f;
import okhttp3.RequestBody;
import okhttp3.j;
import retrofit2.Converter;

/* loaded from: classes13.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final j MEDIA_TYPE = j.e("application/json; charset=UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;
    private final boolean streaming;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    static <T> void writeJson(InterfaceC15329f interfaceC15329f, Gson gson, TypeAdapter<T> typeAdapter, T t10) throws IOException {
        JsonWriter jsonWriterV = gson.v(new OutputStreamWriter(interfaceC15329f.Q3(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterV, t10);
        jsonWriterV.close();
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        if (this.streaming) {
            return new GsonStreamingRequestBody(this.gson, this.adapter, t10);
        }
        C15328e c15328e = new C15328e();
        writeJson(c15328e, this.gson, this.adapter, t10);
        return RequestBody.create(MEDIA_TYPE, c15328e.Q2());
    }

    GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter, boolean z10) {
        this.gson = gson;
        this.adapter = typeAdapter;
        this.streaming = z10;
    }
}
