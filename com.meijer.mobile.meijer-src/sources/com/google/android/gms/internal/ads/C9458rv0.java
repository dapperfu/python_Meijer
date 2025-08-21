package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9458rv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f78933a;

    static {
        char[] cArr = new char[80];
        f78933a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC9245pv0 interfaceC9245pv0, String str) throws SecurityException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(interfaceC9245pv0, sb2, 0);
        return sb2.toString();
    }

    static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(Tv0.a(Zt0.B((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof Zt0) {
            sb2.append(": \"");
            sb2.append(Tv0.a((Zt0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof Gu0) {
            sb2.append(" {");
            d((Gu0) obj, sb2, i10 + 2);
            sb2.append("\n");
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        c(i10, sb2);
        sb2.append("}");
    }

    private static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f78933a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(com.google.android.gms.internal.ads.InterfaceC9245pv0 r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9458rv0.d(com.google.android.gms.internal.ads.pv0, java.lang.StringBuilder, int):void");
    }
}
