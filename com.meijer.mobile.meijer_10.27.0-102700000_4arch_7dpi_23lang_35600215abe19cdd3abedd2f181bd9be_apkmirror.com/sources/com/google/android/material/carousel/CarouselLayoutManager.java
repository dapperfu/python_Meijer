package com.google.android.material.carousel;

import ae.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import be.C6230a;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.f;
import h2.C14329a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    private int f86581A;

    /* renamed from: B, reason: collision with root package name */
    private Map<Integer, f> f86582B;

    /* renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f86583C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f86584D;

    /* renamed from: E, reason: collision with root package name */
    private int f86585E;

    /* renamed from: F, reason: collision with root package name */
    private int f86586F;

    /* renamed from: G, reason: collision with root package name */
    private int f86587G;

    /* renamed from: s, reason: collision with root package name */
    int f86588s;

    /* renamed from: t, reason: collision with root package name */
    int f86589t;

    /* renamed from: u, reason: collision with root package name */
    int f86590u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f86591v;

    /* renamed from: w, reason: collision with root package name */
    private final c f86592w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f86593x;

    /* renamed from: y, reason: collision with root package name */
    private g f86594y;

    /* renamed from: z, reason: collision with root package name */
    private f f86595z;

    class a extends p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A
        public PointF a(int i10) {
            return CarouselLayoutManager.this.e(i10);
        }

        @Override // androidx.recyclerview.widget.p
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f86594y == null || !CarouselLayoutManager.this.b()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.u2(carouselLayoutManager.v0(view));
        }

        @Override // androidx.recyclerview.widget.p
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f86594y == null || CarouselLayoutManager.this.b()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.u2(carouselLayoutManager.v0(view));
        }
    }

    private static class c extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private final Paint f86601a;

        /* renamed from: b, reason: collision with root package name */
        private List<f.c> f86602b;

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            super.onDrawOver(canvas, recyclerView, b10);
            this.f86601a.setStrokeWidth(recyclerView.getResources().getDimension(ae.d.f44631u));
            for (f.c cVar : this.f86602b) {
                this.f86601a.setColor(c2.c.c(-65281, -16776961, cVar.f86633c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).b()) {
                    canvas.drawLine(cVar.f86632b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).O2(), cVar.f86632b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).J2(), this.f86601a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).L2(), cVar.f86632b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).M2(), cVar.f86632b, this.f86601a);
                }
            }
        }

        c() {
            Paint paint = new Paint();
            this.f86601a = paint;
            this.f86602b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void f(List<f.c> list) {
            this.f86602b = Collections.unmodifiableList(list);
        }
    }

    public CarouselLayoutManager() {
        this(new i());
    }

    private static d S2(List<f.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = list.get(i14);
            float f15 = z10 ? cVar.f86632b : cVar.f86631a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private void Z2(RecyclerView.w wVar) {
        View viewP = wVar.p(0);
        Q0(viewP, 0, 0);
        f fVarG = this.f86593x.g(this, viewP);
        if (T2()) {
            fVarG = f.n(fVarG, B2());
        }
        this.f86594y = g.f(this, fVarG, D2(), F2(), P2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3() {
        this.f86594y = null;
        K1();
    }

    private static int v2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H0() {
        return true;
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final View f86597a;

        /* renamed from: b, reason: collision with root package name */
        final float f86598b;

        /* renamed from: c, reason: collision with root package name */
        final float f86599c;

        /* renamed from: d, reason: collision with root package name */
        final d f86600d;

        b(View view, float f10, float f11, d dVar) {
            this.f86597a = view;
            this.f86598b = f10;
            this.f86599c = f11;
            this.f86600d = dVar;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final f.c f86603a;

        /* renamed from: b, reason: collision with root package name */
        final f.c f86604b;

        d(f.c cVar, f.c cVar2) {
            boolean z10;
            if (cVar.f86631a <= cVar2.f86631a) {
                z10 = true;
            } else {
                z10 = false;
            }
            o2.i.a(z10);
            this.f86603a = cVar;
            this.f86604b = cVar2;
        }
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    private float C2(View view) {
        super.h0(view, new Rect());
        return b() ? r0.centerX() : r0.centerY();
    }

    private f E2(int i10) {
        f fVar;
        Map<Integer, f> map = this.f86582B;
        return (map == null || (fVar = map.get(Integer.valueOf(C14329a.b(i10, 0, Math.max(0, a() + (-1)))))) == null) ? this.f86594y.g() : fVar;
    }

    private float G2(float f10, d dVar) {
        f.c cVar = dVar.f86603a;
        float f11 = cVar.f86634d;
        f.c cVar2 = dVar.f86604b;
        return C6230a.b(f11, cVar2.f86634d, cVar.f86632b, cVar2.f86632b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J2() {
        return this.f86583C.g();
    }

    private int K2() {
        return this.f86583C.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L2() {
        return this.f86583C.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int M2() {
        return this.f86583C.j();
    }

    private int N2() {
        return this.f86583C.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int O2() {
        return this.f86583C.l();
    }

    private void W2() {
        if (this.f86591v && Log.isLoggable("CarouselLayoutManager", 3)) {
            FS.log_d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < b0(); i10++) {
                View viewA0 = a0(i10);
                FS.log_d("CarouselLayoutManager", "item position " + v0(viewA0) + ", center:" + C2(viewA0) + ", child index:" + i10);
            }
            FS.log_d("CarouselLayoutManager", "==============");
        }
    }

    private void f3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f44956M0);
            e3(typedArrayObtainStyledAttributes.getInt(l.f44968N0, 0));
            h3(typedArrayObtainStyledAttributes.getInt(l.f45370v6, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i3(View view, float f10, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f86603a;
            float f11 = cVar.f86633c;
            f.c cVar2 = dVar.f86604b;
            float fB = C6230a.b(f11, cVar2.f86633c, cVar.f86631a, cVar2.f86631a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.f86583C.f(height, width, C6230a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), C6230a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fR2 = r2(view, f10, dVar);
            RectF rectF = new RectF(fR2 - (rectFF.width() / 2.0f), fR2 - (rectFF.height() / 2.0f), fR2 + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fR2);
            RectF rectF2 = new RectF(L2(), O2(), M2(), J2());
            if (this.f86593x.f()) {
                this.f86583C.a(rectFF, rectF, rectF2);
            }
            this.f86583C.n(rectFF, rectF, rectF2);
            ((h) view).a(rectFF);
        }
    }

    private void j3(g gVar) {
        int i10 = this.f86590u;
        int i11 = this.f86589t;
        if (i10 <= i11) {
            this.f86595z = T2() ? gVar.h() : gVar.l();
        } else {
            this.f86595z = gVar.j(this.f86588s, i11, i10);
        }
        this.f86592w.f(this.f86595z.g());
    }

    private void l2(View view, int i10, b bVar) {
        float f10 = this.f86595z.f() / 2.0f;
        u(view, i10);
        float f11 = bVar.f86599c;
        this.f86583C.m(view, (int) (f11 - f10), (int) (f11 + f10));
        i3(view, bVar.f86598b, bVar.f86600d);
    }

    private void l3() {
        if (!this.f86591v || b0() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < b0() - 1) {
            int iV0 = v0(a0(i10));
            int i11 = i10 + 1;
            int iV02 = v0(a0(i11));
            if (iV0 > iV02) {
                W2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iV0 + "] and child at index [" + i11 + "] had adapter position [" + iV02 + "].");
            }
            i10 = i11;
        }
    }

    private void o2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0 || i10 >= a()) {
            return;
        }
        b bVarX2 = X2(wVar, s2(i10), i10);
        l2(bVarX2.f86597a, i11, bVarX2);
    }

    private float r2(View view, float f10, d dVar) {
        f.c cVar = dVar.f86603a;
        float f11 = cVar.f86632b;
        f.c cVar2 = dVar.f86604b;
        float fB = C6230a.b(f11, cVar2.f86632b, cVar.f86631a, cVar2.f86631a, f10);
        if (dVar.f86604b != this.f86595z.c() && dVar.f86603a != this.f86595z.j()) {
            return fB;
        }
        float fE = this.f86583C.e((RecyclerView.q) view.getLayoutParams()) / this.f86595z.f();
        f.c cVar3 = dVar.f86604b;
        return fB + ((f10 - cVar3.f86631a) * ((1.0f - cVar3.f86633c) + fE));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        return this.f86588s;
    }

    public int I2() {
        return this.f86583C.f86613a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        return this.f86590u - this.f86589t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iR2;
        if (this.f86594y == null || (iR2 = R2(v0(view), E2(v0(view)))) == 0) {
            return false;
        }
        d3(recyclerView, R2(v0(view), this.f86594y.j(this.f86588s + v2(iR2, this.f86588s, this.f86589t, this.f86590u), this.f86589t, this.f86590u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        return this.f86588s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        return this.f86590u - this.f86589t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        this.f86586F = i10;
        if (this.f86594y == null) {
            return;
        }
        this.f86588s = Q2(i10, E2(i10));
        this.f86581A = C14329a.b(i10, 0, Math.max(0, a() - 1));
        j3(this.f86594y);
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(View view, int i10, int i11) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        A(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        g gVar = this.f86594y;
        float f10 = (gVar == null || this.f86583C.f86613a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : gVar.g().f();
        g gVar2 = this.f86594y;
        view.measure(RecyclerView.p.c0(C0(), D0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, (int) f10, B()), RecyclerView.p.c0(o0(), p0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, (int) ((gVar2 == null || this.f86583C.f86613a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : gVar2.g().f()), C()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q V() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        a2(aVar);
    }

    @Override // com.google.android.material.carousel.b
    public boolean b() {
        return this.f86583C.f86613a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        if (this.f86594y == null) {
            return null;
        }
        int iH2 = H2(i10, E2(i10));
        return b() ? new PointF(iH2, 0.0f) : new PointF(0.0f, iH2);
    }

    public void e3(int i10) {
        this.f86587G = i10;
        a3();
    }

    public void g3(com.google.android.material.carousel.d dVar) {
        this.f86593x = dVar;
        a3();
    }

    public void h3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        w(null);
        com.google.android.material.carousel.c cVar = this.f86583C;
        if (cVar == null || i10 != cVar.f86613a) {
            this.f86583C = com.google.android.material.carousel.c.c(this, i10);
            a3();
        }
    }

    @Override // com.google.android.material.carousel.b
    public int j() {
        return this.f86587G;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f86591v = false;
        this.f86592w = new c();
        this.f86581A = 0;
        this.f86584D = new View.OnLayoutChangeListener() { // from class: fe.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.f2(this.f130990a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f86586F = -1;
        this.f86587G = 0;
        g3(dVar);
        h3(i10);
    }

    private View A2() {
        int iB0;
        if (T2()) {
            iB0 = b0() - 1;
        } else {
            iB0 = 0;
        }
        return a0(iB0);
    }

    private int B2() {
        if (b()) {
            return c();
        }
        return d();
    }

    private int D2() {
        int i10;
        int i11;
        if (b0() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) a0(0).getLayoutParams();
        if (this.f86583C.f86613a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i10 + i11;
    }

    private int F2() {
        if (!e0() && this.f86593x.f()) {
            if (I2() == 1) {
                return getPaddingTop();
            }
            return getPaddingLeft();
        }
        return 0;
    }

    private int P2() {
        if (!e0() && this.f86593x.f()) {
            if (I2() == 1) {
                return getPaddingBottom();
            }
            return getPaddingRight();
        }
        return 0;
    }

    private int Q2(int i10, f fVar) {
        if (T2()) {
            return (int) (((B2() - fVar.h().f86631a) - (i10 * fVar.f())) - (fVar.f() / 2.0f));
        }
        return (int) (((i10 * fVar.f()) - fVar.a().f86631a) + (fVar.f() / 2.0f));
    }

    private int R2(int i10, f fVar) {
        int iB2;
        int i11 = a.e.API_PRIORITY_OTHER;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            if (T2()) {
                iB2 = (int) ((B2() - cVar.f86631a) - f10);
            } else {
                iB2 = (int) (f10 - cVar.f86631a);
            }
            int i12 = iB2 - this.f86588s;
            if (Math.abs(i11) > Math.abs(i12)) {
                i11 = i12;
            }
        }
        return i11;
    }

    private boolean U2(float f10, d dVar) {
        float fN2 = n2(f10, G2(f10, dVar) / 2.0f);
        if (T2()) {
            if (fN2 >= 0.0f) {
                return false;
            }
            return true;
        }
        if (fN2 <= B2()) {
            return false;
        }
        return true;
    }

    private boolean V2(float f10, d dVar) {
        float fM2 = m2(f10, G2(f10, dVar) / 2.0f);
        if (T2()) {
            if (fM2 <= B2()) {
                return false;
            }
            return true;
        }
        if (fM2 >= 0.0f) {
            return false;
        }
        return true;
    }

    private b X2(RecyclerView.w wVar, float f10, int i10) {
        View viewP = wVar.p(i10);
        Q0(viewP, 0, 0);
        float fM2 = m2(f10, this.f86595z.f() / 2.0f);
        d dVarS2 = S2(this.f86595z.g(), fM2, false);
        return new b(viewP, fM2, r2(viewP, fM2, dVarS2), dVarS2);
    }

    private float Y2(View view, float f10, float f11, Rect rect) {
        float fM2 = m2(f10, f11);
        d dVarS2 = S2(this.f86595z.g(), fM2, false);
        float fR2 = r2(view, fM2, dVarS2);
        super.h0(view, rect);
        i3(view, fM2, dVarS2);
        this.f86583C.o(view, rect, f11, fR2);
        return fR2;
    }

    private void b3(RecyclerView.w wVar) {
        while (b0() > 0) {
            View viewA0 = a0(0);
            float fC2 = C2(viewA0);
            if (!V2(fC2, S2(this.f86595z.g(), fC2, true))) {
                break;
            } else {
                D1(viewA0, wVar);
            }
        }
        while (b0() - 1 >= 0) {
            View viewA02 = a0(b0() - 1);
            float fC22 = C2(viewA02);
            if (U2(fC22, S2(this.f86595z.g(), fC22, true))) {
                D1(viewA02, wVar);
            } else {
                return;
            }
        }
    }

    private int c3(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        float f10;
        if (b0() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f86594y == null) {
            Z2(wVar);
        }
        int iV2 = v2(i10, this.f86588s, this.f86589t, this.f86590u);
        this.f86588s += iV2;
        j3(this.f86594y);
        float f11 = this.f86595z.f() / 2.0f;
        float fS2 = s2(v0(a0(0)));
        Rect rect = new Rect();
        if (T2()) {
            f10 = this.f86595z.h().f86632b;
        } else {
            f10 = this.f86595z.a().f86632b;
        }
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < b0(); i11++) {
            View viewA0 = a0(i11);
            float fAbs = Math.abs(f10 - Y2(viewA0, fS2, f11, rect));
            if (viewA0 != null && fAbs < f12) {
                this.f86586F = v0(viewA0);
                f12 = fAbs;
            }
            fS2 = m2(fS2, this.f86595z.f());
        }
        y2(wVar, b10);
        return iV2;
    }

    private void d3(RecyclerView recyclerView, int i10) {
        if (b()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public static /* synthetic */ void f2(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: fe.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f130991a.a3();
            }
        });
    }

    private void k3() {
        int iA = a();
        int i10 = this.f86585E;
        if (iA != i10 && this.f86594y != null) {
            if (this.f86593x.h(this, i10)) {
                a3();
            }
            this.f86585E = iA;
        }
    }

    private float m2(float f10, float f11) {
        if (T2()) {
            return f10 - f11;
        }
        return f10 + f11;
    }

    private float n2(float f10, float f11) {
        if (T2()) {
            return f10 + f11;
        }
        return f10 - f11;
    }

    private void p2(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        float fS2 = s2(i10);
        while (i10 < b10.b()) {
            b bVarX2 = X2(wVar, fS2, i10);
            if (!U2(bVarX2.f86599c, bVarX2.f86600d)) {
                fS2 = m2(fS2, this.f86595z.f());
                if (!V2(bVarX2.f86599c, bVarX2.f86600d)) {
                    l2(bVarX2.f86597a, -1, bVarX2);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void q2(RecyclerView.w wVar, int i10) {
        float fS2 = s2(i10);
        while (i10 >= 0) {
            b bVarX2 = X2(wVar, fS2, i10);
            if (!V2(bVarX2.f86599c, bVarX2.f86600d)) {
                fS2 = n2(fS2, this.f86595z.f());
                if (!U2(bVarX2.f86599c, bVarX2.f86600d)) {
                    l2(bVarX2.f86597a, 0, bVarX2);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    private float s2(int i10) {
        return m2(N2() - this.f86588s, this.f86595z.f() * i10);
    }

    private int t2(RecyclerView.B b10, g gVar) {
        f fVarH;
        f.c cVarH;
        float f10;
        float f11;
        boolean zT2 = T2();
        if (zT2) {
            fVarH = gVar.l();
        } else {
            fVarH = gVar.h();
        }
        if (zT2) {
            cVarH = fVarH.a();
        } else {
            cVarH = fVarH.h();
        }
        float fB = (b10.b() - 1) * fVarH.f();
        if (zT2) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f12 = fB * f10;
        if (zT2) {
            f11 = -cVarH.f86637g;
        } else {
            f11 = cVarH.f86638h;
        }
        int iN2 = (int) ((f12 - (cVarH.f86631a - N2())) + (K2() - cVarH.f86631a) + f11);
        if (zT2) {
            return Math.min(0, iN2);
        }
        return Math.max(0, iN2);
    }

    private int w2(g gVar) {
        f fVarL;
        f.c cVarA;
        boolean zT2 = T2();
        if (zT2) {
            fVarL = gVar.h();
        } else {
            fVarL = gVar.l();
        }
        if (zT2) {
            cVarA = fVarL.h();
        } else {
            cVarA = fVarL.a();
        }
        return (int) (N2() - n2(cVarA.f86631a, fVarL.f() / 2.0f));
    }

    private int x2(int i10) {
        int iI2 = I2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        FS.log_d("CarouselLayoutManager", "Unknown focus request:" + i10);
                        return Integer.MIN_VALUE;
                    }
                    if (iI2 == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (iI2 != 0) {
                    return Integer.MIN_VALUE;
                }
                if (T2()) {
                    return -1;
                }
                return 1;
            }
            if (iI2 == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (iI2 != 0) {
            return Integer.MIN_VALUE;
        }
        if (!T2()) {
            return -1;
        }
        return 1;
    }

    private void y2(RecyclerView.w wVar, RecyclerView.B b10) {
        b3(wVar);
        if (b0() == 0) {
            q2(wVar, this.f86581A - 1);
            p2(wVar, b10, this.f86581A);
        } else {
            int iV0 = v0(a0(0));
            int iV02 = v0(a0(b0() - 1));
            q2(wVar, iV0 - 1);
            p2(wVar, b10, iV02 + 1);
        }
        l3();
    }

    private View z2() {
        int iB0;
        if (T2()) {
            iB0 = 0;
        } else {
            iB0 = b0() - 1;
        }
        return a0(iB0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean B() {
        return b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        return !b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        if (b0() != 0 && this.f86594y != null && a() > 1) {
            return (int) (C0() * (this.f86594y.g().f() / J(b10)));
        }
        return 0;
    }

    int H2(int i10, f fVar) {
        return Q2(i10, fVar) - this.f86588s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        if (b0() != 0 && this.f86594y != null && a() > 1) {
            return (int) (o0() * (this.f86594y.g().f() / M(b10)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (B()) {
            return c3(i10, wVar, b10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (C()) {
            return c3(i10, wVar, b10);
        }
        return 0;
    }

    boolean T2() {
        if (b() && r0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        this.f86593x.e(recyclerView.getContext());
        a3();
        recyclerView.addOnLayoutChangeListener(this.f86584D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Y0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.f86584D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int iX2;
        if (b0() == 0 || (iX2 = x2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iX2 == -1) {
            if (v0(view) == 0) {
                return null;
            }
            o2(wVar, v0(a0(0)) - 1, 0);
            return A2();
        }
        if (v0(view) == a() - 1) {
            return null;
        }
        o2(wVar, v0(a0(b0() - 1)) + 1, -1);
        return z2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(AccessibilityEvent accessibilityEvent) {
        super.a1(accessibilityEvent);
        if (b0() > 0) {
            accessibilityEvent.setFromIndex(v0(a0(0)));
            accessibilityEvent.setToIndex(v0(a0(b0() - 1)));
        }
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return C0();
    }

    @Override // com.google.android.material.carousel.b
    public int d() {
        return o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h0(View view, Rect rect) {
        float fWidth;
        super.h0(view, rect);
        float fCenterY = rect.centerY();
        if (b()) {
            fCenterY = rect.centerX();
        }
        float fG2 = G2(fCenterY, S2(this.f86595z.g(), fCenterY, true));
        float fHeight = 0.0f;
        if (b()) {
            fWidth = (rect.width() - fG2) / 2.0f;
        } else {
            fWidth = 0.0f;
        }
        if (!b()) {
            fHeight = (rect.height() - fG2) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        super.h1(recyclerView, i10, i11);
        k3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView recyclerView, int i10, int i11) {
        super.k1(recyclerView, i10, i11);
        k3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10;
        int i10;
        if (b10.b() > 0 && B2() > 0.0f) {
            boolean zT2 = T2();
            if (this.f86594y == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Z2(wVar);
            }
            int iW2 = w2(this.f86594y);
            int iT2 = t2(b10, this.f86594y);
            if (zT2) {
                i10 = iT2;
            } else {
                i10 = iW2;
            }
            this.f86589t = i10;
            if (zT2) {
                iT2 = iW2;
            }
            this.f86590u = iT2;
            if (z10) {
                this.f86588s = iW2;
                this.f86582B = this.f86594y.i(a(), this.f86589t, this.f86590u, T2());
                int i11 = this.f86586F;
                if (i11 != -1) {
                    this.f86588s = Q2(i11, E2(i11));
                }
            }
            int i12 = this.f86588s;
            this.f86588s = i12 + v2(0, i12, this.f86589t, this.f86590u);
            this.f86581A = C14329a.b(this.f86581A, 0, b10.b());
            j3(this.f86594y);
            N(wVar);
            y2(wVar, b10);
            this.f86585E = a();
            return;
        }
        B1(wVar);
        this.f86581A = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView.B b10) {
        super.o1(b10);
        if (b0() == 0) {
            this.f86581A = 0;
        } else {
            this.f86581A = v0(a0(0));
        }
        l3();
    }

    int u2(int i10) {
        return (int) (this.f86588s - Q2(i10, E2(i10)));
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f86591v = false;
        this.f86592w = new c();
        this.f86581A = 0;
        this.f86584D = new View.OnLayoutChangeListener() { // from class: fe.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.f2(this.f130990a, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f86586F = -1;
        this.f86587G = 0;
        g3(new i());
        f3(context, attributeSet);
    }
}
