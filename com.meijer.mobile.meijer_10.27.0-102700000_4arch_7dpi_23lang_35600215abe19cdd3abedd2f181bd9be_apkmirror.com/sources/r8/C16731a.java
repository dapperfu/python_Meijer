package r8;

import x8.f;

/* renamed from: r8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16731a {
    public StringBuilder a(C16733c c16733c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(c16733c.f().e());
        if (c16733c.D() != null) {
            sb2.append("&");
            sb2.append("na");
            sb2.append("=");
            sb2.append(f.t(c16733c.h()));
        }
        sb2.append("&");
        sb2.append("s0");
        sb2.append("=");
        sb2.append(c16733c.g());
        sb2.append("&");
        sb2.append("t0");
        sb2.append("=");
        sb2.append(c16733c.E());
        sb2.append("&");
        sb2.append("t1");
        sb2.append("=");
        sb2.append(c16733c.G());
        sb2.append("&");
        sb2.append("nt");
        sb2.append("=");
        sb2.append(c16733c.H());
        sb2.append("&");
        sb2.append("fw");
        sb2.append("=");
        sb2.append(c16733c.F() ? "1" : "0");
        return sb2;
    }
}
