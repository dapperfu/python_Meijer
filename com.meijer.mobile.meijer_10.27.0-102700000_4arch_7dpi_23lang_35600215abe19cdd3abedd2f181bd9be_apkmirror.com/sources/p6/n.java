package p6;

import g6.C14209i;
import i6.InterfaceC14692c;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155595a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.o<Float, Float> f155596b;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.q(oVar, abstractC16472b, this);
    }

    public o6.o<Float, Float> b() {
        return this.f155596b;
    }

    public String c() {
        return this.f155595a;
    }

    public n(String str, o6.o<Float, Float> oVar) {
        this.f155595a = str;
        this.f155596b = oVar;
    }
}
