package p6;

import android.graphics.PointF;
import g6.C14209i;
import i6.InterfaceC14692c;
import o6.C15998b;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155585a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.o<PointF, PointF> f155586b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.o<PointF, PointF> f155587c;

    /* renamed from: d, reason: collision with root package name */
    private final C15998b f155588d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f155589e;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.o(oVar, abstractC16472b, this);
    }

    public C15998b b() {
        return this.f155588d;
    }

    public String c() {
        return this.f155585a;
    }

    public o6.o<PointF, PointF> d() {
        return this.f155586b;
    }

    public o6.o<PointF, PointF> e() {
        return this.f155587c;
    }

    public boolean f() {
        return this.f155589e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f155586b + ", size=" + this.f155587c + '}';
    }

    public l(String str, o6.o<PointF, PointF> oVar, o6.o<PointF, PointF> oVar2, C15998b c15998b, boolean z10) {
        this.f155585a = str;
        this.f155586b = oVar;
        this.f155587c = oVar2;
        this.f155588d = c15998b;
        this.f155589e = z10;
    }
}
