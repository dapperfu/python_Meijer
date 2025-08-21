package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10816g2 implements InterfaceC10800f2 {
    protected AbstractC10816g2() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC10800f2) && zzd() == ((InterfaceC10800f2) obj).zzd();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jZzd = zzd();
        long jZzd2 = ((InterfaceC10800f2) obj).zzd();
        if (jZzd < jZzd2) {
            return -1;
        }
        return jZzd > jZzd2 ? 1 : 0;
    }

    public final int hashCode() {
        long jZzd = zzd();
        return (int) (jZzd ^ (jZzd >>> 32));
    }

    public final String toString() {
        int i10;
        int i11;
        long jZzd = zzd();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        C10864j2.a(stringBuffer, jZzd);
        while (true) {
            int length = stringBuffer.length();
            if (jZzd < 0) {
                i10 = 7;
            } else {
                i10 = 6;
            }
            if (length >= i10) {
                break;
            }
            if (jZzd < 0) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            stringBuffer.insert(i11, "0");
        }
        if ((jZzd / 1000) * 1000 == jZzd) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
