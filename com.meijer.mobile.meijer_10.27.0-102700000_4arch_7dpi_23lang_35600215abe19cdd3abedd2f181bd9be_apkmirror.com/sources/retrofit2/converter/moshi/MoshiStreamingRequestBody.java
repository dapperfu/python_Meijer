package retrofit2.converter.moshi;

import com.squareup.moshi.h;
import java.io.IOException;
import kw.InterfaceC15329f;
import okhttp3.RequestBody;
import okhttp3.j;

/* loaded from: classes13.dex */
final class MoshiStreamingRequestBody<T> extends RequestBody {
    private final h<T> adapter;
    private final T value;

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public j getF154110a() {
        return MoshiRequestBodyConverter.MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC15329f interfaceC15329f) throws IOException {
        this.adapter.toJson(interfaceC15329f, (InterfaceC15329f) this.value);
    }

    public MoshiStreamingRequestBody(h<T> hVar, T t10) {
        this.adapter = hVar;
        this.value = t10;
    }
}
