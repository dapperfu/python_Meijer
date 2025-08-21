package retrofit2.converter.moshi;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import gw.C14419h;
import gw.InterfaceC14418g;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes14.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final C14419h UTF8_BOM = C14419h.m("EFBBBF");
    private final h<T> adapter;

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        InterfaceC14418g source = responseBody.getSource();
        try {
            if (source.d0(0L, UTF8_BOM)) {
                source.skip(r1.V());
            }
            k kVarJ = k.j(source);
            T tFromJson = this.adapter.fromJson(kVarJ);
            if (kVarJ.l() != k.c.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tFromJson;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }

    MoshiResponseBodyConverter(h<T> hVar) {
        this.adapter = hVar;
    }
}
