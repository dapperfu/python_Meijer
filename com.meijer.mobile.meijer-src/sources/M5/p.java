package M5;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "input", "", "a", "(Ljava/lang/String;)I", "", "b", "(Ljava/lang/String;)J", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class p {
    private static final int a(String str) {
        if (str == null) {
            return 0;
        }
        int i10 = StringsKt.C1(str).toString().length() == 0 ? 0 : -2128831035;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        for (byte b10 : bytes) {
            i10 = (i10 ^ (b10 & 255)) * 16777619;
        }
        return i10;
    }

    public static final long b(String str) {
        return UInt.b(a(str)) & 4294967295L;
    }
}
