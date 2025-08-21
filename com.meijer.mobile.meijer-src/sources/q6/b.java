package q6;

import android.graphics.PointF;
import h6.C14478i;
import j6.C14954f;
import j6.InterfaceC14951c;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157904a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.o<PointF, PointF> f157905b;

    /* renamed from: c, reason: collision with root package name */
    private final p6.f f157906c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f157907d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f157908e;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new C14954f(oVar, abstractC16860b, this);
    }

    public String b() {
        return this.f157904a;
    }

    public p6.o<PointF, PointF> c() {
        return this.f157905b;
    }

    public p6.f d() {
        return this.f157906c;
    }

    public boolean e() {
        return this.f157908e;
    }

    public boolean f() {
        return this.f157907d;
    }

    public b(String str, p6.o<PointF, PointF> oVar, p6.f fVar, boolean z10, boolean z11) {
        this.f157904a = str;
        this.f157905b = oVar;
        this.f157906c = fVar;
        this.f157907d = z10;
        this.f157908e = z11;
    }
}
