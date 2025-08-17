package q8;

import t8.C17073a;

/* renamed from: q8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16483c {
    public StringBuilder a(C16484d c16484d) {
        String str;
        C17073a c17073aD = c16484d.D();
        C17073a c17073aE = c16484d.E();
        C17073a c17073aI = c16484d.I();
        C17073a c17073aH = c16484d.H();
        C17073a c17073aF = c16484d.F();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(c16484d.f().e());
        sb2.append("&");
        sb2.append("na");
        sb2.append("=");
        sb2.append(x8.f.t(c16484d.h()));
        sb2.append("&");
        sb2.append("it");
        sb2.append("=");
        sb2.append(x8.f.e());
        sb2.append("&");
        sb2.append("ca");
        sb2.append("=");
        sb2.append(c16484d.o());
        sb2.append("&");
        sb2.append("pa");
        sb2.append("=");
        sb2.append(c16484d.j());
        sb2.append("&");
        sb2.append("s0");
        sb2.append("=");
        sb2.append(c17073aD.a());
        sb2.append("&");
        sb2.append("t0");
        sb2.append("=");
        sb2.append(c17073aD.b());
        if (c17073aE != null) {
            sb2.append("&");
            sb2.append("s1");
            sb2.append("=");
            sb2.append(c17073aE.a());
            sb2.append("&");
            sb2.append("t1");
            sb2.append("=");
            sb2.append(c17073aE.b());
        }
        if (c17073aI != null) {
            sb2.append("&");
            sb2.append("s2");
            sb2.append("=");
            sb2.append(c17073aI.a());
            sb2.append("&");
            sb2.append("t2");
            sb2.append("=");
            sb2.append(c17073aI.b());
        }
        if (c17073aH != null) {
            sb2.append("&");
            sb2.append("s3");
            sb2.append("=");
            sb2.append(c17073aH.a());
            sb2.append("&");
            sb2.append("t3");
            sb2.append("=");
            sb2.append(c17073aH.b());
        }
        if (c17073aF != null) {
            sb2.append("&");
            sb2.append("s4");
            sb2.append("=");
            sb2.append(c17073aF.a());
            sb2.append("&");
            sb2.append("t4");
            sb2.append("=");
            sb2.append(c17073aF.b());
        }
        sb2.append("&");
        sb2.append("fw");
        sb2.append("=");
        if (c16484d.G()) {
            str = "1";
        } else {
            str = "0";
        }
        sb2.append(str);
        return sb2;
    }
}
