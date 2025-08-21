package retrofit2.converter.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.q;
import gw.C14416e;
import java.io.IOException;
import okhttp3.RequestBody;
import okhttp3.j;
import retrofit2.Converter;

/* loaded from: classes14.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final j MEDIA_TYPE = j.e("application/json; charset=UTF-8");
    private final h<T> adapter;
    private final boolean streaming;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        if (this.streaming) {
            return new MoshiStreamingRequestBody(this.adapter, t10);
        }
        C14416e c14416e = new C14416e();
        this.adapter.toJson(q.p(c14416e), (q) t10);
        return RequestBody.create(MEDIA_TYPE, c14416e.P2());
    }

    MoshiRequestBodyConverter(h<T> hVar, boolean z10) {
        this.adapter = hVar;
        this.streaming = z10;
    }
}
