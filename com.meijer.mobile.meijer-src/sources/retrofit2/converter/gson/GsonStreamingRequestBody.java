package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import gw.InterfaceC14417f;
import java.io.IOException;
import okhttp3.RequestBody;
import okhttp3.j;

/* loaded from: classes14.dex */
final class GsonStreamingRequestBody<T> extends RequestBody {
    private final TypeAdapter<T> adapter;
    private final Gson gson;
    private final T value;

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public j getContentType() {
        return GsonRequestBodyConverter.MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC14417f interfaceC14417f) throws IOException {
        GsonRequestBodyConverter.writeJson(interfaceC14417f, this.gson, this.adapter, this.value);
    }

    public GsonStreamingRequestBody(Gson gson, TypeAdapter<T> typeAdapter, T t10) {
        this.gson = gson;
        this.adapter = typeAdapter;
        this.value = t10;
    }
}
