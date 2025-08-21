package Ie;

import De.l;
import De.p;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f14438a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14439b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14440c;

    private static String[] c(String str) {
        p.l(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        p.l(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i10 = iLastIndexOf + 1;
        if (i10 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        p.l(str.charAt(i10) == ':', "Only a colon may follow a close bracket: %s", str);
        int i11 = iLastIndexOf + 2;
        for (int i12 = i11; i12 < str.length(); i12++) {
            p.l(Character.isDigit(str.charAt(i12)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i11)};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.a(this.f14438a, aVar.f14438a) && this.f14439b == aVar.f14439b) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(int i10) {
        return i10 >= 0 && i10 <= 65535;
    }

    public String b() {
        return this.f14438a;
    }

    public boolean d() {
        return this.f14439b >= 0;
    }

    public int hashCode() {
        return l.b(this.f14438a, Integer.valueOf(this.f14439b));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f14438a.length() + 8);
        if (this.f14438a.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.f14438a);
            sb2.append(']');
        } else {
            sb2.append(this.f14438a);
        }
        if (d()) {
            sb2.append(':');
            sb2.append(this.f14439b);
        }
        return sb2.toString();
    }

    private a(String str, int i10, boolean z10) {
        this.f14438a = str;
        this.f14439b = i10;
        this.f14440c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Ie.a a(java.lang.String r7) throws java.lang.NumberFormatException {
        /*
            De.p.q(r7)
            java.lang.String r0 = "["
            boolean r0 = r7.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = c(r7)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = r3
            goto L3c
        L19:
            r0 = 58
            int r4 = r7.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r7.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r7.substring(r3, r4)
            java.lang.String r0 = r7.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            r4 = 0
            r5 = r4
            r4 = r0
            r0 = r5
            r5 = r7
        L3c:
            boolean r6 = De.v.b(r0)
            if (r6 != 0) goto L80
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            De.d r1 = De.d.c()
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            De.p.l(r2, r1, r7)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = e(r1)
            java.lang.String r2 = "Port number out of range: %s"
            De.p.l(r0, r2, r7)
            goto L80
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L80:
            Ie.a r7 = new Ie.a
            r7.<init>(r5, r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.a.a(java.lang.String):Ie.a");
    }
}
