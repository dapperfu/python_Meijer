package p6;

import g6.C14209i;
import i6.InterfaceC14692c;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155609a;

    /* renamed from: b, reason: collision with root package name */
    private final int f155610b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.h f155611c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f155612d;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.r(oVar, abstractC16472b, this);
    }

    public String b() {
        return this.f155609a;
    }

    public o6.h c() {
        return this.f155611c;
    }

    public boolean d() {
        return this.f155612d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f155609a + ", index=" + this.f155610b + '}';
    }

    public r(String str, int i10, o6.h hVar, boolean z10) {
        this.f155609a = str;
        this.f155610b = i10;
        this.f155611c = hVar;
        this.f155612d = z10;
    }
}
