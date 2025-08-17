package Jv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u001a\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"", "i", "", "e", "(I)C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "c", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "d", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "a", "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16223a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f16224b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f16223a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f16224b = bArr;
    }

    public static final byte[] a() {
        return f16224b;
    }

    public static final String[] b() {
        return f16223a;
    }

    public static final void c(StringBuilder sb2, String value) {
        Intrinsics.j(sb2, "<this>");
        Intrinsics.j(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f16223a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) value, i10, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final Boolean d(String str) {
        Intrinsics.j(str, "<this>");
        if (StringsKt.H(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.H(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
