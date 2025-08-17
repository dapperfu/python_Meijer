package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10739j2 {
    public static void a(StringBuffer stringBuffer, long j10) {
        int i10 = (int) j10;
        if (i10 != j10) {
            stringBuffer.append(Long.toString(j10));
            return;
        }
        if (i10 < 0) {
            stringBuffer.append('-');
            if (i10 == Integer.MIN_VALUE) {
                stringBuffer.append("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            stringBuffer.append((char) (i10 + 48));
        } else {
            if (i10 >= 100) {
                stringBuffer.append(Integer.toString(i10));
                return;
            }
            int i11 = ((i10 + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i11 + 48));
            stringBuffer.append((char) (((i10 - (i11 << 3)) - (i11 + i11)) + 48));
        }
    }

    static {
        Math.log(10.0d);
    }
}
