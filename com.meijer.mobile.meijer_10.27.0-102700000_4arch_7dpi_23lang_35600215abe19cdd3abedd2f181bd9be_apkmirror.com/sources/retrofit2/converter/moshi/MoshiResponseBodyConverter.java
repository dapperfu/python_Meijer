package retrofit2.converter.moshi;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import java.io.IOException;
import kw.C15331h;
import kw.InterfaceC15330g;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes13.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final C15331h UTF8_BOM = C15331h.m("EFBBBF");
    private final h<T> adapter;

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        InterfaceC15330g source = responseBody.getSource();
        try {
            if (source.Y(0L, UTF8_BOM)) {
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
