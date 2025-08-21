package s8;

import v8.C17648a;

/* renamed from: s8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17031c {
    public StringBuilder a(C17032d c17032d) {
        String str;
        C17648a c17648aD = c17032d.D();
        C17648a c17648aE = c17032d.E();
        C17648a c17648aI = c17032d.I();
        C17648a c17648aH = c17032d.H();
        C17648a c17648aF = c17032d.F();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(c17032d.f().e());
        sb2.append("&");
        sb2.append("na");
        sb2.append("=");
        sb2.append(z8.f.t(c17032d.h()));
        sb2.append("&");
        sb2.append("it");
        sb2.append("=");
        sb2.append(z8.f.e());
        sb2.append("&");
        sb2.append("ca");
        sb2.append("=");
        sb2.append(c17032d.o());
        sb2.append("&");
        sb2.append("pa");
        sb2.append("=");
        sb2.append(c17032d.j());
        sb2.append("&");
        sb2.append("s0");
        sb2.append("=");
        sb2.append(c17648aD.a());
        sb2.append("&");
        sb2.append("t0");
        sb2.append("=");
        sb2.append(c17648aD.b());
        if (c17648aE != null) {
            sb2.append("&");
            sb2.append("s1");
            sb2.append("=");
            sb2.append(c17648aE.a());
            sb2.append("&");
            sb2.append("t1");
            sb2.append("=");
            sb2.append(c17648aE.b());
        }
        if (c17648aI != null) {
            sb2.append("&");
            sb2.append("s2");
            sb2.append("=");
            sb2.append(c17648aI.a());
            sb2.append("&");
            sb2.append("t2");
            sb2.append("=");
            sb2.append(c17648aI.b());
        }
        if (c17648aH != null) {
            sb2.append("&");
            sb2.append("s3");
            sb2.append("=");
            sb2.append(c17648aH.a());
            sb2.append("&");
            sb2.append("t3");
            sb2.append("=");
            sb2.append(c17648aH.b());
        }
        if (c17648aF != null) {
            sb2.append("&");
            sb2.append("s4");
            sb2.append("=");
            sb2.append(c17648aF.a());
            sb2.append("&");
            sb2.append("t4");
            sb2.append("=");
            sb2.append(c17648aF.b());
        }
        sb2.append("&");
        sb2.append("fw");
        sb2.append("=");
        if (c17032d.G()) {
            str = "1";
        } else {
            str = "0";
        }
        sb2.append(str);
        return sb2;
    }
}
