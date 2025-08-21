package q6;

import android.graphics.PointF;
import h6.C14478i;
import j6.InterfaceC14951c;
import p6.C16407b;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157989a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.o<PointF, PointF> f157990b;

    /* renamed from: c, reason: collision with root package name */
    private final p6.o<PointF, PointF> f157991c;

    /* renamed from: d, reason: collision with root package name */
    private final C16407b f157992d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f157993e;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.o(oVar, abstractC16860b, this);
    }

    public C16407b b() {
        return this.f157992d;
    }

    public String c() {
        return this.f157989a;
    }

    public p6.o<PointF, PointF> d() {
        return this.f157990b;
    }

    public p6.o<PointF, PointF> e() {
        return this.f157991c;
    }

    public boolean f() {
        return this.f157993e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f157990b + ", size=" + this.f157991c + '}';
    }

    public l(String str, p6.o<PointF, PointF> oVar, p6.o<PointF, PointF> oVar2, C16407b c16407b, boolean z10) {
        this.f157989a = str;
        this.f157990b = oVar;
        this.f157991c = oVar2;
        this.f157992d = c16407b;
        this.f157993e = z10;
    }
}
