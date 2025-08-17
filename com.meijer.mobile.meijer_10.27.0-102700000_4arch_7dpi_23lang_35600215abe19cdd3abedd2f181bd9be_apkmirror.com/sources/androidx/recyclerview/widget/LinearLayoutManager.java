package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.api.a;
import java.util.List;

/* loaded from: classes4.dex */
public class LinearLayoutManager extends RecyclerView.p implements l.h, RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    int f57858A;

    /* renamed from: B, reason: collision with root package name */
    int f57859B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f57860C;

    /* renamed from: D, reason: collision with root package name */
    d f57861D;

    /* renamed from: E, reason: collision with root package name */
    final a f57862E;

    /* renamed from: F, reason: collision with root package name */
    private final b f57863F;

    /* renamed from: G, reason: collision with root package name */
    private int f57864G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f57865H;

    /* renamed from: s, reason: collision with root package name */
    int f57866s;

    /* renamed from: t, reason: collision with root package name */
    private c f57867t;

    /* renamed from: u, reason: collision with root package name */
    t f57868u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57869v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f57870w;

    /* renamed from: x, reason: collision with root package name */
    boolean f57871x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f57872y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f57873z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        t f57874a;

        /* renamed from: b, reason: collision with root package name */
        int f57875b;

        /* renamed from: c, reason: collision with root package name */
        int f57876c;

        /* renamed from: d, reason: collision with root package name */
        boolean f57877d;

        /* renamed from: e, reason: collision with root package name */
        boolean f57878e;

        void e() {
            this.f57875b = -1;
            this.f57876c = Integer.MIN_VALUE;
            this.f57877d = false;
            this.f57878e = false;
        }

        void a() {
            this.f57876c = this.f57877d ? this.f57874a.i() : this.f57874a.m();
        }

        public void b(View view, int i10) {
            if (this.f57877d) {
                this.f57876c = this.f57874a.d(view) + this.f57874a.o();
            } else {
                this.f57876c = this.f57874a.g(view);
            }
            this.f57875b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f57874a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f57875b = i10;
            if (this.f57877d) {
                int i11 = (this.f57874a.i() - iO) - this.f57874a.d(view);
                this.f57876c = this.f57874a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f57876c - this.f57874a.e(view);
                    int iM = this.f57874a.m();
                    int iMin = iE - (iM + Math.min(this.f57874a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f57876c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f57874a.g(view);
            int iM2 = iG - this.f57874a.m();
            this.f57876c = iG;
            if (iM2 > 0) {
                int i12 = (this.f57874a.i() - Math.min(0, (this.f57874a.i() - iO) - this.f57874a.d(view))) - (iG + this.f57874a.e(view));
                if (i12 < 0) {
                    this.f57876c -= Math.min(iM2, -i12);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f57875b + ", mCoordinate=" + this.f57876c + ", mLayoutFromEnd=" + this.f57877d + ", mValid=" + this.f57878e + '}';
        }

        a() {
            e();
        }

        boolean d(View view, RecyclerView.B b10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (!qVar.d() && qVar.b() >= 0 && qVar.b() < b10.b()) {
                return true;
            }
            return false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f57884b;

        /* renamed from: c, reason: collision with root package name */
        int f57885c;

        /* renamed from: d, reason: collision with root package name */
        int f57886d;

        /* renamed from: e, reason: collision with root package name */
        int f57887e;

        /* renamed from: f, reason: collision with root package name */
        int f57888f;

        /* renamed from: g, reason: collision with root package name */
        int f57889g;

        /* renamed from: k, reason: collision with root package name */
        int f57893k;

        /* renamed from: m, reason: collision with root package name */
        boolean f57895m;

        /* renamed from: a, reason: collision with root package name */
        boolean f57883a = true;

        /* renamed from: h, reason: collision with root package name */
        int f57890h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f57891i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f57892j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.F> f57894l = null;

        public void a() {
            b(null);
        }

        private View e() {
            int size = this.f57894l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f57894l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.d() && this.f57886d == qVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        boolean c(RecyclerView.B b10) {
            int i10 = this.f57886d;
            return i10 >= 0 && i10 < b10.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f57894l != null) {
                return e();
            }
            View viewP = wVar.p(this.f57886d);
            this.f57886d += this.f57887e;
            return viewP;
        }

        public View f(View view) {
            int iB;
            int size = this.f57894l.size();
            View view2 = null;
            int i10 = a.e.API_PRIORITY_OTHER;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f57894l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.d() && (iB = (qVar.b() - this.f57886d) * this.f57887e) >= 0 && iB < i10) {
                    if (iB == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iB;
                }
            }
            return view2;
        }

        c() {
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f57886d = -1;
            } else {
                this.f57886d = ((RecyclerView.q) viewF.getLayoutParams()).b();
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f57896a;

        /* renamed from: b, reason: collision with root package name */
        int f57897b;

        /* renamed from: c, reason: collision with root package name */
        boolean f57898c;

        class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }

            a() {
            }
        }

        public d() {
        }

        void b() {
            this.f57896a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        d(Parcel parcel) {
            this.f57896a = parcel.readInt();
            this.f57897b = parcel.readInt();
            this.f57898c = parcel.readInt() == 1;
        }

        boolean a() {
            return this.f57896a >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f57896a);
            parcel.writeInt(this.f57897b);
            parcel.writeInt(this.f57898c ? 1 : 0);
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f57896a = dVar.f57896a;
            this.f57897b = dVar.f57897b;
            this.f57898c = dVar.f57898c;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View o2() {
        return v2(0, b0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H0() {
        return true;
    }

    void L2(RecyclerView.w wVar, RecyclerView.B b10, a aVar, int i10) {
    }

    public void V2(boolean z10) {
        w(null);
        if (z10 == this.f57870w) {
            return;
        }
        this.f57870w = z10;
        K1();
    }

    public void W2(boolean z10) {
        w(null);
        if (this.f57872y == z10) {
            return;
        }
        this.f57872y = z10;
        K1();
    }

    int j2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f57866s == 1) ? 1 : Integer.MIN_VALUE : this.f57866s == 0 ? 1 : Integer.MIN_VALUE : this.f57866s == 1 ? -1 : Integer.MIN_VALUE : this.f57866s == 0 ? -1 : Integer.MIN_VALUE : (this.f57866s != 1 && H2()) ? -1 : 1 : (this.f57866s != 1 && H2()) ? 1 : -1;
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f57879a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f57880b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f57881c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f57882d;

        void a() {
            this.f57879a = 0;
            this.f57880b = false;
            this.f57881c = false;
            this.f57882d = false;
        }

        protected b() {
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f57866s = 1;
        this.f57870w = false;
        this.f57871x = false;
        this.f57872y = false;
        this.f57873z = true;
        this.f57858A = -1;
        this.f57859B = Integer.MIN_VALUE;
        this.f57861D = null;
        this.f57862E = new a();
        this.f57863F = new b();
        this.f57864G = 2;
        this.f57865H = new int[2];
        U2(i10);
        V2(z10);
    }

    private int A2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12 = this.f57868u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -S2(-i12, wVar, b10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f57868u.i() - i14) <= 0) {
            return i13;
        }
        this.f57868u.r(i11);
        return i11 + i13;
    }

    private int B2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iM;
        int iM2 = i10 - this.f57868u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -S2(iM2, wVar, b10);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f57868u.m()) <= 0) {
            return i11;
        }
        this.f57868u.r(-iM);
        return i11 - iM;
    }

    private View C2() {
        return a0(this.f57871x ? 0 : b0() - 1);
    }

    private View D2() {
        return a0(this.f57871x ? b0() - 1 : 0);
    }

    private void M2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f57883a || cVar.f57895m) {
            return;
        }
        int i10 = cVar.f57889g;
        int i11 = cVar.f57891i;
        if (cVar.f57888f == -1) {
            O2(wVar, i10, i11);
        } else {
            P2(wVar, i10, i11);
        }
    }

    private void N2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                E1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                E1(i12, wVar);
            }
        }
    }

    private void P2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iB0 = b0();
        if (!this.f57871x) {
            for (int i13 = 0; i13 < iB0; i13++) {
                View viewA0 = a0(i13);
                if (this.f57868u.d(viewA0) > i12 || this.f57868u.p(viewA0) > i12) {
                    N2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iB0 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewA02 = a0(i15);
            if (this.f57868u.d(viewA02) > i12 || this.f57868u.p(viewA02) > i12) {
                N2(wVar, i14, i15);
                return;
            }
        }
    }

    private void R2() {
        if (this.f57866s == 1 || !H2()) {
            this.f57871x = this.f57870w;
        } else {
            this.f57871x = !this.f57870w;
        }
    }

    private void a3(int i10, int i11, boolean z10, RecyclerView.B b10) {
        int iM;
        this.f57867t.f57895m = Q2();
        this.f57867t.f57888f = i10;
        int[] iArr = this.f57865H;
        iArr[0] = 0;
        iArr[1] = 0;
        e2(b10, iArr);
        int iMax = Math.max(0, this.f57865H[0]);
        int iMax2 = Math.max(0, this.f57865H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f57867t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f57890h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f57891i = iMax;
        if (z11) {
            cVar.f57890h = i12 + this.f57868u.j();
            View viewC2 = C2();
            c cVar2 = this.f57867t;
            cVar2.f57887e = this.f57871x ? -1 : 1;
            int iV0 = v0(viewC2);
            c cVar3 = this.f57867t;
            cVar2.f57886d = iV0 + cVar3.f57887e;
            cVar3.f57884b = this.f57868u.d(viewC2);
            iM = this.f57868u.d(viewC2) - this.f57868u.i();
        } else {
            View viewD2 = D2();
            this.f57867t.f57890h += this.f57868u.m();
            c cVar4 = this.f57867t;
            cVar4.f57887e = this.f57871x ? 1 : -1;
            int iV02 = v0(viewD2);
            c cVar5 = this.f57867t;
            cVar4.f57886d = iV02 + cVar5.f57887e;
            cVar5.f57884b = this.f57868u.g(viewD2);
            iM = (-this.f57868u.g(viewD2)) + this.f57868u.m();
        }
        c cVar6 = this.f57867t;
        cVar6.f57885c = i11;
        if (z10) {
            cVar6.f57885c = i11 - iM;
        }
        cVar6.f57889g = iM;
    }

    private void b3(int i10, int i11) {
        this.f57867t.f57885c = this.f57868u.i() - i11;
        c cVar = this.f57867t;
        cVar.f57887e = this.f57871x ? -1 : 1;
        cVar.f57886d = i10;
        cVar.f57888f = 1;
        cVar.f57884b = i11;
        cVar.f57889g = Integer.MIN_VALUE;
    }

    private void c3(a aVar) {
        b3(aVar.f57875b, aVar.f57876c);
    }

    private void d3(int i10, int i11) {
        this.f57867t.f57885c = i11 - this.f57868u.m();
        c cVar = this.f57867t;
        cVar.f57886d = i10;
        cVar.f57887e = this.f57871x ? 1 : -1;
        cVar.f57888f = -1;
        cVar.f57884b = i11;
        cVar.f57889g = Integer.MIN_VALUE;
    }

    private void e3(a aVar) {
        d3(aVar.f57875b, aVar.f57876c);
    }

    private View x2() {
        return this.f57871x ? o2() : t2();
    }

    private View y2() {
        return this.f57871x ? t2() : o2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean B() {
        return this.f57866s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        return this.f57866s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void F(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        if (this.f57866s != 0) {
            i10 = i11;
        }
        if (b0() == 0 || i10 == 0) {
            return;
        }
        l2();
        a3(i10 > 0 ? 1 : -1, Math.abs(i10), true, b10);
        f2(b10, this.f57867t, cVar);
    }

    public int F2() {
        return this.f57866s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void G(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f57861D;
        if (dVar == null || !dVar.a()) {
            R2();
            z10 = this.f57871x;
            i11 = this.f57858A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f57861D;
            z10 = dVar2.f57898c;
            i11 = dVar2.f57896a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f57864G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public boolean G2() {
        return this.f57870w;
    }

    public boolean I2() {
        return this.f57873z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f57866s == 1) {
            return 0;
        }
        return S2(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        this.f57858A = i10;
        this.f57859B = Integer.MIN_VALUE;
        d dVar = this.f57861D;
        if (dVar != null) {
            dVar.b();
        }
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f57866s == 0) {
            return 0;
        }
        return S2(i10, wVar, b10);
    }

    boolean Q2() {
        return this.f57868u.k() == 0 && this.f57868u.h() == 0;
    }

    public void T2(int i10, int i11) {
        this.f57858A = i10;
        this.f57859B = i11;
        d dVar = this.f57861D;
        if (dVar != null) {
            dVar.b();
        }
        K1();
    }

    public void U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        w(null);
        if (i10 != this.f57866s || this.f57868u == null) {
            t tVarB = t.b(this, i10);
            this.f57868u = tVarB;
            this.f57862E.f57874a = tVarB;
            this.f57866s = i10;
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q V() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void Z1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        a2(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean d2() {
        return this.f57861D == null && this.f57869v == this.f57872y;
    }

    void f2(RecyclerView.B b10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f57886d;
        if (i10 < 0 || i10 >= b10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f57889g));
    }

    @Override // androidx.recyclerview.widget.l.h
    public void h(View view, View view2, int i10, int i11) {
        w("Cannot drop a view during a scroll or layout calculation");
        l2();
        R2();
        int iV0 = v0(view);
        int iV02 = v0(view2);
        char c10 = iV0 < iV02 ? (char) 1 : (char) 65535;
        if (this.f57871x) {
            if (c10 == 1) {
                T2(iV02, this.f57868u.i() - (this.f57868u.g(view2) + this.f57868u.e(view)));
                return;
            } else {
                T2(iV02, this.f57868u.i() - this.f57868u.d(view2));
                return;
            }
        }
        if (c10 == 65535) {
            T2(iV02, this.f57868u.g(view2));
        } else {
            T2(iV02, this.f57868u.d(view2) - this.f57868u.e(view));
        }
    }

    c k2() {
        return new c();
    }

    void l2() {
        if (this.f57867t == null) {
            this.f57867t = k2();
        }
    }

    int m2(RecyclerView.w wVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i10 = cVar.f57885c;
        int i11 = cVar.f57889g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f57889g = i11 + i10;
            }
            M2(wVar, cVar);
        }
        int i12 = cVar.f57885c + cVar.f57890h;
        b bVar = this.f57863F;
        while (true) {
            if ((!cVar.f57895m && i12 <= 0) || !cVar.c(b10)) {
                break;
            }
            bVar.a();
            J2(wVar, b10, cVar, bVar);
            if (!bVar.f57880b) {
                cVar.f57884b += bVar.f57879a * cVar.f57888f;
                if (!bVar.f57881c || cVar.f57894l != null || !b10.e()) {
                    int i13 = cVar.f57885c;
                    int i14 = bVar.f57879a;
                    cVar.f57885c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f57889g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f57879a;
                    cVar.f57889g = i16;
                    int i17 = cVar.f57885c;
                    if (i17 < 0) {
                        cVar.f57889g = i16 + i17;
                    }
                    M2(wVar, cVar);
                }
                if (z10 && bVar.f57882d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f57885c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iA2;
        int i14;
        View viewU;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f57861D == null && this.f57858A == -1) && b10.b() == 0) {
            B1(wVar);
            return;
        }
        d dVar = this.f57861D;
        if (dVar != null && dVar.a()) {
            this.f57858A = this.f57861D.f57896a;
        }
        l2();
        this.f57867t.f57883a = false;
        R2();
        View viewN0 = n0();
        a aVar = this.f57862E;
        if (!aVar.f57878e || this.f57858A != -1 || this.f57861D != null) {
            aVar.e();
            a aVar2 = this.f57862E;
            aVar2.f57877d = this.f57871x ^ this.f57872y;
            Z2(wVar, b10, aVar2);
            this.f57862E.f57878e = true;
        } else if (viewN0 != null && (this.f57868u.g(viewN0) >= this.f57868u.i() || this.f57868u.d(viewN0) <= this.f57868u.m())) {
            this.f57862E.c(viewN0, v0(viewN0));
        }
        c cVar = this.f57867t;
        cVar.f57888f = cVar.f57893k >= 0 ? 1 : -1;
        int[] iArr = this.f57865H;
        iArr[0] = 0;
        iArr[1] = 0;
        e2(b10, iArr);
        int iMax = Math.max(0, this.f57865H[0]) + this.f57868u.m();
        int iMax2 = Math.max(0, this.f57865H[1]) + this.f57868u.j();
        if (b10.e() && (i14 = this.f57858A) != -1 && this.f57859B != Integer.MIN_VALUE && (viewU = U(i14)) != null) {
            if (this.f57871x) {
                i15 = this.f57868u.i() - this.f57868u.d(viewU);
                iG = this.f57859B;
            } else {
                iG = this.f57868u.g(viewU) - this.f57868u.m();
                i15 = this.f57859B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f57862E;
        if (!aVar3.f57877d ? !this.f57871x : this.f57871x) {
            i16 = 1;
        }
        L2(wVar, b10, aVar3, i16);
        N(wVar);
        this.f57867t.f57895m = Q2();
        this.f57867t.f57892j = b10.e();
        this.f57867t.f57891i = 0;
        a aVar4 = this.f57862E;
        if (aVar4.f57877d) {
            e3(aVar4);
            c cVar2 = this.f57867t;
            cVar2.f57890h = iMax;
            m2(wVar, cVar2, b10, false);
            c cVar3 = this.f57867t;
            i11 = cVar3.f57884b;
            int i18 = cVar3.f57886d;
            int i19 = cVar3.f57885c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            c3(this.f57862E);
            c cVar4 = this.f57867t;
            cVar4.f57890h = iMax2;
            cVar4.f57886d += cVar4.f57887e;
            m2(wVar, cVar4, b10, false);
            c cVar5 = this.f57867t;
            i10 = cVar5.f57884b;
            int i20 = cVar5.f57885c;
            if (i20 > 0) {
                d3(i18, i11);
                c cVar6 = this.f57867t;
                cVar6.f57890h = i20;
                m2(wVar, cVar6, b10, false);
                i11 = this.f57867t.f57884b;
            }
        } else {
            c3(aVar4);
            c cVar7 = this.f57867t;
            cVar7.f57890h = iMax2;
            m2(wVar, cVar7, b10, false);
            c cVar8 = this.f57867t;
            i10 = cVar8.f57884b;
            int i21 = cVar8.f57886d;
            int i22 = cVar8.f57885c;
            if (i22 > 0) {
                iMax += i22;
            }
            e3(this.f57862E);
            c cVar9 = this.f57867t;
            cVar9.f57890h = iMax;
            cVar9.f57886d += cVar9.f57887e;
            m2(wVar, cVar9, b10, false);
            c cVar10 = this.f57867t;
            i11 = cVar10.f57884b;
            int i23 = cVar10.f57885c;
            if (i23 > 0) {
                b3(i21, i10);
                c cVar11 = this.f57867t;
                cVar11.f57890h = i23;
                m2(wVar, cVar11, b10, false);
                i10 = this.f57867t.f57884b;
            }
        }
        if (b0() > 0) {
            if (this.f57871x ^ this.f57872y) {
                int iA22 = A2(i10, wVar, b10, true);
                i12 = i11 + iA22;
                i13 = i10 + iA22;
                iA2 = B2(i12, wVar, b10, false);
            } else {
                int iB2 = B2(i11, wVar, b10, true);
                i12 = i11 + iB2;
                i13 = i10 + iB2;
                iA2 = A2(i13, wVar, b10, false);
            }
            i11 = i12 + iA2;
            i10 = i13 + iA2;
        }
        K2(wVar, b10, i11, i10);
        if (b10.e()) {
            this.f57862E.e();
        } else {
            this.f57868u.s();
        }
        this.f57869v = this.f57872y;
    }

    View p2(boolean z10, boolean z11) {
        return this.f57871x ? w2(0, b0(), z10, z11) : w2(b0() - 1, -1, z10, z11);
    }

    View q2(boolean z10, boolean z11) {
        return this.f57871x ? w2(b0() - 1, -1, z10, z11) : w2(0, b0(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f57861D = dVar;
            if (this.f57858A != -1) {
                dVar.b();
            }
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable t1() {
        if (this.f57861D != null) {
            return new d(this.f57861D);
        }
        d dVar = new d();
        if (b0() <= 0) {
            dVar.b();
            return dVar;
        }
        l2();
        boolean z10 = this.f57869v ^ this.f57871x;
        dVar.f57898c = z10;
        if (z10) {
            View viewC2 = C2();
            dVar.f57897b = this.f57868u.i() - this.f57868u.d(viewC2);
            dVar.f57896a = v0(viewC2);
            return dVar;
        }
        View viewD2 = D2();
        dVar.f57896a = v0(viewD2);
        dVar.f57897b = this.f57868u.g(viewD2) - this.f57868u.m();
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void w(String str) {
        if (this.f57861D == null) {
            super.w(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View z2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.l2()
            int r1 = r0.b0()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.b0()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.t r7 = r0.f57868u
            int r7 = r7.m()
            androidx.recyclerview.widget.t r8 = r0.f57868u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.a0(r1)
            int r13 = r0.v0(r12)
            androidx.recyclerview.widget.t r14 = r0.f57868u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.t r15 = r0.f57868u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.d()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.z2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean, boolean):android.view.View");
    }

    private void K2(RecyclerView.w wVar, RecyclerView.B b10, int i10, int i11) {
        boolean z10;
        if (b10.g() && b0() != 0 && !b10.e() && d2()) {
            List<RecyclerView.F> listL = wVar.l();
            int size = listL.size();
            int iV0 = v0(a0(0));
            int iE = 0;
            int iE2 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                RecyclerView.F f10 = listL.get(i12);
                if (!f10.isRemoved()) {
                    if (f10.getLayoutPosition() < iV0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.f57871x) {
                        iE += this.f57868u.e(f10.itemView);
                    } else {
                        iE2 += this.f57868u.e(f10.itemView);
                    }
                }
            }
            this.f57867t.f57894l = listL;
            if (iE > 0) {
                d3(v0(D2()), i10);
                c cVar = this.f57867t;
                cVar.f57890h = iE;
                cVar.f57885c = 0;
                cVar.a();
                m2(wVar, this.f57867t, b10, false);
            }
            if (iE2 > 0) {
                b3(v0(C2()), i11);
                c cVar2 = this.f57867t;
                cVar2.f57890h = iE2;
                cVar2.f57885c = 0;
                cVar2.a();
                m2(wVar, this.f57867t, b10, false);
            }
            this.f57867t.f57894l = null;
        }
    }

    private void O2(RecyclerView.w wVar, int i10, int i11) {
        int iB0 = b0();
        if (i10 >= 0) {
            int iH = (this.f57868u.h() - i10) + i11;
            if (this.f57871x) {
                for (int i12 = 0; i12 < iB0; i12++) {
                    View viewA0 = a0(i12);
                    if (this.f57868u.g(viewA0) < iH || this.f57868u.q(viewA0) < iH) {
                        N2(wVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iB0 - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewA02 = a0(i14);
                if (this.f57868u.g(viewA02) < iH || this.f57868u.q(viewA02) < iH) {
                    N2(wVar, i13, i14);
                    return;
                }
            }
        }
    }

    private boolean X2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        View viewZ2;
        boolean z10;
        boolean z11 = false;
        if (b0() == 0) {
            return false;
        }
        View viewN0 = n0();
        if (viewN0 != null && aVar.d(viewN0, b10)) {
            aVar.c(viewN0, v0(viewN0));
            return true;
        }
        boolean z12 = this.f57869v;
        boolean z13 = this.f57872y;
        if (z12 != z13 || (viewZ2 = z2(wVar, b10, aVar.f57877d, z13)) == null) {
            return false;
        }
        aVar.b(viewZ2, v0(viewZ2));
        if (!b10.e() && d2()) {
            int iG = this.f57868u.g(viewZ2);
            int iD = this.f57868u.d(viewZ2);
            int iM = this.f57868u.m();
            int i10 = this.f57868u.i();
            if (iD <= iM && iG < iM) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (iG >= i10 && iD > i10) {
                z11 = true;
            }
            if (z10 || z11) {
                if (aVar.f57877d) {
                    iM = i10;
                }
                aVar.f57876c = iM;
            }
        }
        return true;
    }

    private boolean Y2(RecyclerView.B b10, a aVar) {
        int i10;
        boolean z10;
        int iG;
        boolean z11 = false;
        if (!b10.e() && (i10 = this.f57858A) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                aVar.f57875b = this.f57858A;
                d dVar = this.f57861D;
                if (dVar != null && dVar.a()) {
                    boolean z12 = this.f57861D.f57898c;
                    aVar.f57877d = z12;
                    if (z12) {
                        aVar.f57876c = this.f57868u.i() - this.f57861D.f57897b;
                    } else {
                        aVar.f57876c = this.f57868u.m() + this.f57861D.f57897b;
                    }
                    return true;
                }
                if (this.f57859B == Integer.MIN_VALUE) {
                    View viewU = U(this.f57858A);
                    if (viewU != null) {
                        if (this.f57868u.e(viewU) > this.f57868u.n()) {
                            aVar.a();
                            return true;
                        }
                        if (this.f57868u.g(viewU) - this.f57868u.m() < 0) {
                            aVar.f57876c = this.f57868u.m();
                            aVar.f57877d = false;
                            return true;
                        }
                        if (this.f57868u.i() - this.f57868u.d(viewU) < 0) {
                            aVar.f57876c = this.f57868u.i();
                            aVar.f57877d = true;
                            return true;
                        }
                        if (aVar.f57877d) {
                            iG = this.f57868u.d(viewU) + this.f57868u.o();
                        } else {
                            iG = this.f57868u.g(viewU);
                        }
                        aVar.f57876c = iG;
                    } else {
                        if (b0() > 0) {
                            if (this.f57858A < v0(a0(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.f57871x) {
                                z11 = true;
                            }
                            aVar.f57877d = z11;
                        }
                        aVar.a();
                    }
                    return true;
                }
                boolean z13 = this.f57871x;
                aVar.f57877d = z13;
                if (z13) {
                    aVar.f57876c = this.f57868u.i() - this.f57859B;
                } else {
                    aVar.f57876c = this.f57868u.m() + this.f57859B;
                }
                return true;
            }
            this.f57858A = -1;
            this.f57859B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void Z2(RecyclerView.w wVar, RecyclerView.B b10, a aVar) {
        int iB;
        if (Y2(b10, aVar) || X2(wVar, b10, aVar)) {
            return;
        }
        aVar.a();
        if (this.f57872y) {
            iB = b10.b() - 1;
        } else {
            iB = 0;
        }
        aVar.f57875b = iB;
    }

    private int g2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        l2();
        return w.a(b10, this.f57868u, q2(!this.f57873z, true), p2(!this.f57873z, true), this, this.f57873z);
    }

    private int h2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        l2();
        return w.b(b10, this.f57868u, q2(!this.f57873z, true), p2(!this.f57873z, true), this, this.f57873z, this.f57871x);
    }

    private int i2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        l2();
        return w.c(b10, this.f57868u, q2(!this.f57873z, true), p2(!this.f57873z, true), this, this.f57873z);
    }

    private View t2() {
        return v2(b0() - 1, -1);
    }

    @Deprecated
    protected int E2(RecyclerView.B b10) {
        if (b10.d()) {
            return this.f57868u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int H(RecyclerView.B b10) {
        return g2(b10);
    }

    protected boolean H2() {
        if (r0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int I(RecyclerView.B b10) {
        return h2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int J(RecyclerView.B b10) {
        return i2(b10);
    }

    void J2(RecyclerView.w wVar, RecyclerView.B b10, c cVar, b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int iF;
        int i14;
        int i15;
        boolean z11;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f57880b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f57894l == null) {
            boolean z12 = this.f57871x;
            if (cVar.f57888f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                t(viewD);
            } else {
                u(viewD, 0);
            }
        } else {
            boolean z13 = this.f57871x;
            if (cVar.f57888f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                r(viewD);
            } else {
                s(viewD, 0);
            }
        }
        Q0(viewD, 0, 0);
        bVar.f57879a = this.f57868u.e(viewD);
        if (this.f57866s == 1) {
            if (H2()) {
                iF = C0() - getPaddingRight();
                paddingLeft = iF - this.f57868u.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF = this.f57868u.f(viewD) + paddingLeft;
            }
            if (cVar.f57888f == -1) {
                i15 = cVar.f57884b;
                i14 = i15 - bVar.f57879a;
            } else {
                i14 = cVar.f57884b;
                i15 = bVar.f57879a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int paddingTop = getPaddingTop();
            int iF2 = this.f57868u.f(viewD) + paddingTop;
            if (cVar.f57888f == -1) {
                int i17 = cVar.f57884b;
                i12 = i17 - bVar.f57879a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f57884b;
                i10 = bVar.f57879a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        P0(viewD, i12, i13, i10, i11);
        if (qVar.d() || qVar.c()) {
            bVar.f57881c = true;
        }
        bVar.f57882d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int K(RecyclerView.B b10) {
        return g2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int L(RecyclerView.B b10) {
        return h2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int M(RecyclerView.B b10) {
        return i2(b10);
    }

    int S2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int i11;
        if (b0() == 0 || i10 == 0) {
            return 0;
        }
        l2();
        this.f57867t.f57883a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int iAbs = Math.abs(i10);
        a3(i11, iAbs, true, b10);
        c cVar = this.f57867t;
        int iM2 = cVar.f57889g + m2(wVar, cVar, b10, false);
        if (iM2 < 0) {
            return 0;
        }
        if (iAbs > iM2) {
            i10 = i11 * iM2;
        }
        this.f57868u.r(-i10);
        this.f57867t.f57893k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View U(int i10) {
        int iB0 = b0();
        if (iB0 == 0) {
            return null;
        }
        int iV0 = i10 - v0(a0(0));
        if (iV0 >= 0 && iV0 < iB0) {
            View viewA0 = a0(iV0);
            if (v0(viewA0) == i10) {
                return viewA0;
            }
        }
        return super.U(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean X1() {
        if (p0() != 1073741824 && D0() != 1073741824 && E0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void Y0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Y0(recyclerView, wVar);
        if (this.f57860C) {
            B1(wVar);
            wVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        int iJ2;
        View viewX2;
        View viewC2;
        R2();
        if (b0() == 0 || (iJ2 = j2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        l2();
        a3(iJ2, (int) (this.f57868u.n() * 0.33333334f), false, b10);
        c cVar = this.f57867t;
        cVar.f57889g = Integer.MIN_VALUE;
        cVar.f57883a = false;
        m2(wVar, cVar, b10, true);
        if (iJ2 == -1) {
            viewX2 = y2();
        } else {
            viewX2 = x2();
        }
        if (iJ2 == -1) {
            viewC2 = D2();
        } else {
            viewC2 = C2();
        }
        if (viewC2.hasFocusable()) {
            if (viewX2 == null) {
                return null;
            }
            return viewC2;
        }
        return viewX2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void a1(AccessibilityEvent accessibilityEvent) {
        super.a1(accessibilityEvent);
        if (b0() > 0) {
            accessibilityEvent.setFromIndex(r2());
            accessibilityEvent.setToIndex(u2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    @SuppressLint({"UnknownNullness"})
    public PointF e(int i10) {
        if (b0() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < v0(a0(0))) {
            z10 = true;
        }
        if (z10 != this.f57871x) {
            i11 = -1;
        }
        if (this.f57866s == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    protected void e2(RecyclerView.B b10, int[] iArr) {
        int i10;
        int iE2 = E2(b10);
        if (this.f57867t.f57888f == -1) {
            i10 = 0;
        } else {
            i10 = iE2;
            iE2 = 0;
        }
        iArr[0] = iE2;
        iArr[1] = i10;
    }

    public int n2() {
        View viewW2 = w2(0, b0(), true, false);
        if (viewW2 == null) {
            return -1;
        }
        return v0(viewW2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void o1(RecyclerView.B b10) {
        super.o1(b10);
        this.f57861D = null;
        this.f57858A = -1;
        this.f57859B = Integer.MIN_VALUE;
        this.f57862E.e();
    }

    public int r2() {
        View viewW2 = w2(0, b0(), false, true);
        if (viewW2 == null) {
            return -1;
        }
        return v0(viewW2);
    }

    public int s2() {
        View viewW2 = w2(b0() - 1, -1, true, false);
        if (viewW2 == null) {
            return -1;
        }
        return v0(viewW2);
    }

    public int u2() {
        View viewW2 = w2(b0() - 1, -1, false, true);
        if (viewW2 == null) {
            return -1;
        }
        return v0(viewW2);
    }

    View v2(int i10, int i11) {
        int i12;
        int i13;
        l2();
        if (i11 > i10 || i11 < i10) {
            if (this.f57868u.g(a0(i10)) < this.f57868u.m()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f57866s == 0) {
                return this.f57957e.a(i10, i11, i12, i13);
            }
            return this.f57958f.a(i10, i11, i12, i13);
        }
        return a0(i10);
    }

    View w2(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        l2();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f57866s == 0) {
            return this.f57957e.a(i10, i11, i12, i13);
        }
        return this.f57958f.a(i10, i11, i12, i13);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f57866s = 1;
        this.f57870w = false;
        this.f57871x = false;
        this.f57872y = false;
        this.f57873z = true;
        this.f57858A = -1;
        this.f57859B = Integer.MIN_VALUE;
        this.f57861D = null;
        this.f57862E = new a();
        this.f57863F = new b();
        this.f57864G = 2;
        this.f57865H = new int[2];
        RecyclerView.p.d dVarW0 = RecyclerView.p.w0(context, attributeSet, i10, i11);
        U2(dVarW0.f57973a);
        V2(dVarW0.f57975c);
        W2(dVarW0.f57976d);
    }
}
