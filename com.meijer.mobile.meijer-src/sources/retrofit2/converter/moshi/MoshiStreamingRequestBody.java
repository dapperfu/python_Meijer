package retrofit2.converter.moshi;

import com.squareup.moshi.h;
import gw.InterfaceC14417f;
import java.io.IOException;
import okhttp3.RequestBody;
import okhttp3.j;

/* loaded from: classes14.dex */
final class MoshiStreamingRequestBody<T> extends RequestBody {
    private final h<T> adapter;
    private final T value;

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public j getF154418a() {
        return MoshiRequestBodyConverter.MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC14417f interfaceC14417f) throws IOException {
        this.adapter.toJson(interfaceC14417f, (InterfaceC14417f) this.value);
    }

    public MoshiStreamingRequestBody(h<T> hVar, T t10) {
        this.adapter = hVar;
        this.value = t10;
    }
}
