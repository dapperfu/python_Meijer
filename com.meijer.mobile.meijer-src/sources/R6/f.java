package R6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "([B)Ljava/lang/String;", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f {
    public static final String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            int i11 = b10 & 255;
            if (i11 < 16) {
                sb2.append('0');
            }
            String string = Integer.toString(i11, CharsKt.a(16));
            Intrinsics.i(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
        }
        String string2 = sb2.toString();
        Intrinsics.i(string2, "StringBuilder(capacity).…builderAction).toString()");
        return string2;
    }
}
