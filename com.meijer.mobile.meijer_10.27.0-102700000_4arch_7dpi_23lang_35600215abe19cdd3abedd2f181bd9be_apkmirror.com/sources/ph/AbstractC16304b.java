package ph;

import java.net.URI;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ph.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC16304b {
    public static URI a(URI uri, String str) {
        HttpUrl httpUrlG = HttpUrl.h(uri).k().d(str).g();
        List<String> listN = httpUrlG.n();
        HttpUrl.a aVarK = httpUrlG.k();
        for (int size = listN.size() - 1; size >= 0; size--) {
            if (listN.get(size).isEmpty()) {
                aVarK.B(size);
            }
        }
        return aVarK.g().y();
    }
}
