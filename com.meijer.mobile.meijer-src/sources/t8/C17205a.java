package t8;

import z8.f;

/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17205a {
    public StringBuilder a(C17207c c17207c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(c17207c.f().e());
        if (c17207c.D() != null) {
            sb2.append("&");
            sb2.append("na");
            sb2.append("=");
            sb2.append(f.t(c17207c.h()));
        }
        sb2.append("&");
        sb2.append("s0");
        sb2.append("=");
        sb2.append(c17207c.g());
        sb2.append("&");
        sb2.append("t0");
        sb2.append("=");
        sb2.append(c17207c.E());
        sb2.append("&");
        sb2.append("t1");
        sb2.append("=");
        sb2.append(c17207c.G());
        sb2.append("&");
        sb2.append("nt");
        sb2.append("=");
        sb2.append(c17207c.H());
        sb2.append("&");
        sb2.append("fw");
        sb2.append("=");
        sb2.append(c17207c.F() ? "1" : "0");
        return sb2;
    }
}
