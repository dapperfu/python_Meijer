package q6;

import h6.C14478i;
import j6.InterfaceC14951c;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158013a;

    /* renamed from: b, reason: collision with root package name */
    private final int f158014b;

    /* renamed from: c, reason: collision with root package name */
    private final p6.h f158015c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f158016d;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.r(oVar, abstractC16860b, this);
    }

    public String b() {
        return this.f158013a;
    }

    public p6.h c() {
        return this.f158015c;
    }

    public boolean d() {
        return this.f158016d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f158013a + ", index=" + this.f158014b + '}';
    }

    public r(String str, int i10, p6.h hVar, boolean z10) {
        this.f158013a = str;
        this.f158014b = i10;
        this.f158015c = hVar;
        this.f158016d = z10;
    }
}
