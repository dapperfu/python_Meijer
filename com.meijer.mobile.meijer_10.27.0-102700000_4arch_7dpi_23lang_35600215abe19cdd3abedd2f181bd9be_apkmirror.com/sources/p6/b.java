package p6;

import android.graphics.PointF;
import g6.C14209i;
import i6.C14695f;
import i6.InterfaceC14692c;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155500a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.o<PointF, PointF> f155501b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.f f155502c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f155503d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f155504e;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new C14695f(oVar, abstractC16472b, this);
    }

    public String b() {
        return this.f155500a;
    }

    public o6.o<PointF, PointF> c() {
        return this.f155501b;
    }

    public o6.f d() {
        return this.f155502c;
    }

    public boolean e() {
        return this.f155504e;
    }

    public boolean f() {
        return this.f155503d;
    }

    public b(String str, o6.o<PointF, PointF> oVar, o6.f fVar, boolean z10, boolean z11) {
        this.f155500a = str;
        this.f155501b = oVar;
        this.f155502c = fVar;
        this.f155503d = z10;
        this.f155504e = z11;
    }
}
