package Nv;

import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "string", "a", "(Ljava/lang/String;)Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {
    public static final String a(String string) {
        Intrinsics.j(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.i(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
