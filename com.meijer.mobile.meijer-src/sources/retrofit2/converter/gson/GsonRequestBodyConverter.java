package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import gw.C14416e;
import gw.InterfaceC14417f;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.RequestBody;
import okhttp3.j;
import retrofit2.Converter;

/* loaded from: classes14.dex */
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

    static <T> void writeJson(InterfaceC14417f interfaceC14417f, Gson gson, TypeAdapter<T> typeAdapter, T t10) throws IOException {
        JsonWriter jsonWriterV = gson.v(new OutputStreamWriter(interfaceC14417f.Q3(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterV, t10);
        jsonWriterV.close();
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        if (this.streaming) {
            return new GsonStreamingRequestBody(this.gson, this.adapter, t10);
        }
        C14416e c14416e = new C14416e();
        writeJson(c14416e, this.gson, this.adapter, t10);
        return RequestBody.create(MEDIA_TYPE, c14416e.P2());
    }

    GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter, boolean z10) {
        this.gson = gson;
        this.adapter = typeAdapter;
        this.streaming = z10;
    }
}
