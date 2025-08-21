package q6;

import h6.C14478i;
import j6.InterfaceC14951c;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157999a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.o<Float, Float> f158000b;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.q(oVar, abstractC16860b, this);
    }

    public p6.o<Float, Float> b() {
        return this.f158000b;
    }

    public String c() {
        return this.f157999a;
    }

    public n(String str, p6.o<Float, Float> oVar) {
        this.f157999a = str;
        this.f158000b = oVar;
    }
}
