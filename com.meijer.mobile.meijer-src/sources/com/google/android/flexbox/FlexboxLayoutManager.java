package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements com.google.android.flexbox.a, RecyclerView.A.b {

    /* renamed from: S, reason: collision with root package name */
    private static final Rect f65301S = new Rect();

    /* renamed from: B, reason: collision with root package name */
    private RecyclerView.w f65303B;

    /* renamed from: C, reason: collision with root package name */
    private RecyclerView.B f65304C;

    /* renamed from: D, reason: collision with root package name */
    private d f65305D;

    /* renamed from: F, reason: collision with root package name */
    private t f65307F;

    /* renamed from: G, reason: collision with root package name */
    private t f65308G;

    /* renamed from: H, reason: collision with root package name */
    private e f65309H;

    /* renamed from: M, reason: collision with root package name */
    private boolean f65314M;

    /* renamed from: O, reason: collision with root package name */
    private final Context f65316O;

    /* renamed from: P, reason: collision with root package name */
    private View f65317P;

    /* renamed from: s, reason: collision with root package name */
    private int f65320s;

    /* renamed from: t, reason: collision with root package name */
    private int f65321t;

    /* renamed from: u, reason: collision with root package name */
    private int f65322u;

    /* renamed from: v, reason: collision with root package name */
    private int f65323v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f65325x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f65326y;

    /* renamed from: w, reason: collision with root package name */
    private int f65324w = -1;

    /* renamed from: z, reason: collision with root package name */
    private List<com.google.android.flexbox.c> f65327z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    private final com.google.android.flexbox.d f65302A = new com.google.android.flexbox.d(this);

    /* renamed from: E, reason: collision with root package name */
    private b f65306E = new b();

    /* renamed from: I, reason: collision with root package name */
    private int f65310I = -1;

    /* renamed from: J, reason: collision with root package name */
    private int f65311J = Integer.MIN_VALUE;

    /* renamed from: K, reason: collision with root package name */
    private int f65312K = Integer.MIN_VALUE;

    /* renamed from: L, reason: collision with root package name */
    private int f65313L = Integer.MIN_VALUE;

    /* renamed from: N, reason: collision with root package name */
    private SparseArray<View> f65315N = new SparseArray<>();

    /* renamed from: Q, reason: collision with root package name */
    private int f65318Q = -1;

    /* renamed from: R, reason: collision with root package name */
    private d.b f65319R = new d.b();

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private int f65328a;

        /* renamed from: b, reason: collision with root package name */
        private int f65329b;

        /* renamed from: c, reason: collision with root package name */
        private int f65330c;

        /* renamed from: d, reason: collision with root package name */
        private int f65331d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f65332e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f65333f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f65334g;

        private b() {
            this.f65331d = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t() {
            this.f65328a = -1;
            this.f65329b = -1;
            this.f65330c = Integer.MIN_VALUE;
            this.f65333f = false;
            this.f65334g = false;
            if (FlexboxLayoutManager.this.q()) {
                if (FlexboxLayoutManager.this.f65321t == 0) {
                    this.f65332e = FlexboxLayoutManager.this.f65320s == 1;
                    return;
                } else {
                    this.f65332e = FlexboxLayoutManager.this.f65321t == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f65321t == 0) {
                this.f65332e = FlexboxLayoutManager.this.f65320s == 3;
            } else {
                this.f65332e = FlexboxLayoutManager.this.f65321t == 2;
            }
        }

        static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f65331d + i10;
            bVar.f65331d = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            if (FlexboxLayoutManager.this.q() || !FlexboxLayoutManager.this.f65325x) {
                this.f65330c = this.f65332e ? FlexboxLayoutManager.this.f65307F.i() : FlexboxLayoutManager.this.f65307F.m();
            } else {
                this.f65330c = this.f65332e ? FlexboxLayoutManager.this.f65307F.i() : FlexboxLayoutManager.this.C0() - FlexboxLayoutManager.this.f65307F.m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            t tVar = FlexboxLayoutManager.this.f65321t == 0 ? FlexboxLayoutManager.this.f65308G : FlexboxLayoutManager.this.f65307F;
            if (FlexboxLayoutManager.this.q() || !FlexboxLayoutManager.this.f65325x) {
                if (this.f65332e) {
                    this.f65330c = tVar.d(view) + tVar.o();
                } else {
                    this.f65330c = tVar.g(view);
                }
            } else if (this.f65332e) {
                this.f65330c = tVar.g(view) + tVar.o();
            } else {
                this.f65330c = tVar.d(view);
            }
            this.f65328a = FlexboxLayoutManager.this.v0(view);
            this.f65334g = false;
            int[] iArr = FlexboxLayoutManager.this.f65302A.f65377c;
            int i10 = this.f65328a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iArr[i10];
            this.f65329b = i11 != -1 ? i11 : 0;
            if (FlexboxLayoutManager.this.f65327z.size() > this.f65329b) {
                this.f65328a = ((com.google.android.flexbox.c) FlexboxLayoutManager.this.f65327z.get(this.f65329b)).f65371o;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f65328a + ", mFlexLinePosition=" + this.f65329b + ", mCoordinate=" + this.f65330c + ", mPerpendicularCoordinate=" + this.f65331d + ", mLayoutFromEnd=" + this.f65332e + ", mValid=" + this.f65333f + ", mAssignedFromSavedState=" + this.f65334g + '}';
        }
    }

    public static class c extends RecyclerView.q implements com.google.android.flexbox.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private float f65336e;

        /* renamed from: f, reason: collision with root package name */
        private float f65337f;

        /* renamed from: g, reason: collision with root package name */
        private int f65338g;

        /* renamed from: h, reason: collision with root package name */
        private float f65339h;

        /* renamed from: i, reason: collision with root package name */
        private int f65340i;

        /* renamed from: j, reason: collision with root package name */
        private int f65341j;

        /* renamed from: k, reason: collision with root package name */
        private int f65342k;

        /* renamed from: l, reason: collision with root package name */
        private int f65343l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f65344m;

        class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }

            a() {
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f65336e = 0.0f;
            this.f65337f = 1.0f;
            this.f65338g = -1;
            this.f65339h = -1.0f;
            this.f65342k = 16777215;
            this.f65343l = 16777215;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.b
        public int A2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public int G3() {
            return this.f65343l;
        }

        @Override // com.google.android.flexbox.b
        public int J0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public int K1() {
            return this.f65342k;
        }

        @Override // com.google.android.flexbox.b
        public void P0(int i10) {
            this.f65341j = i10;
        }

        @Override // com.google.android.flexbox.b
        public float T0() {
            return this.f65336e;
        }

        @Override // com.google.android.flexbox.b
        public float e1() {
            return this.f65339h;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int j0() {
            return this.f65338g;
        }

        @Override // com.google.android.flexbox.b
        public float m0() {
            return this.f65337f;
        }

        @Override // com.google.android.flexbox.b
        public boolean r1() {
            return this.f65344m;
        }

        @Override // com.google.android.flexbox.b
        public int s0() {
            return this.f65340i;
        }

        @Override // com.google.android.flexbox.b
        public int t3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public void v2(int i10) {
            this.f65340i = i10;
        }

        @Override // com.google.android.flexbox.b
        public int v3() {
            return this.f65341j;
        }

        @Override // com.google.android.flexbox.b
        public int w2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f65336e);
            parcel.writeFloat(this.f65337f);
            parcel.writeInt(this.f65338g);
            parcel.writeFloat(this.f65339h);
            parcel.writeInt(this.f65340i);
            parcel.writeInt(this.f65341j);
            parcel.writeInt(this.f65342k);
            parcel.writeInt(this.f65343l);
            parcel.writeByte(this.f65344m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f65336e = 0.0f;
            this.f65337f = 1.0f;
            this.f65338g = -1;
            this.f65339h = -1.0f;
            this.f65342k = 16777215;
            this.f65343l = 16777215;
        }

        protected c(Parcel parcel) {
            super(-2, -2);
            this.f65336e = 0.0f;
            this.f65337f = 1.0f;
            this.f65338g = -1;
            this.f65339h = -1.0f;
            this.f65342k = 16777215;
            this.f65343l = 16777215;
            this.f65336e = parcel.readFloat();
            this.f65337f = parcel.readFloat();
            this.f65338g = parcel.readInt();
            this.f65339h = parcel.readFloat();
            this.f65340i = parcel.readInt();
            this.f65341j = parcel.readInt();
            this.f65342k = parcel.readInt();
            this.f65343l = parcel.readInt();
            this.f65344m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f65345a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f65346b;

        /* renamed from: c, reason: collision with root package name */
        private int f65347c;

        /* renamed from: d, reason: collision with root package name */
        private int f65348d;

        /* renamed from: e, reason: collision with root package name */
        private int f65349e;

        /* renamed from: f, reason: collision with root package name */
        private int f65350f;

        /* renamed from: g, reason: collision with root package name */
        private int f65351g;

        /* renamed from: h, reason: collision with root package name */
        private int f65352h;

        /* renamed from: i, reason: collision with root package name */
        private int f65353i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f65354j;

        private d() {
            this.f65352h = 1;
            this.f65353i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D(RecyclerView.B b10, List<com.google.android.flexbox.c> list) {
            int i10;
            int i11 = this.f65348d;
            return i11 >= 0 && i11 < b10.b() && (i10 = this.f65347c) >= 0 && i10 < list.size();
        }

        static /* synthetic */ int c(d dVar, int i10) {
            int i11 = dVar.f65349e + i10;
            dVar.f65349e = i11;
            return i11;
        }

        static /* synthetic */ int d(d dVar, int i10) {
            int i11 = dVar.f65349e - i10;
            dVar.f65349e = i11;
            return i11;
        }

        static /* synthetic */ int i(d dVar, int i10) {
            int i11 = dVar.f65345a - i10;
            dVar.f65345a = i11;
            return i11;
        }

        static /* synthetic */ int l(d dVar) {
            int i10 = dVar.f65347c;
            dVar.f65347c = i10 + 1;
            return i10;
        }

        static /* synthetic */ int m(d dVar) {
            int i10 = dVar.f65347c;
            dVar.f65347c = i10 - 1;
            return i10;
        }

        static /* synthetic */ int n(d dVar, int i10) {
            int i11 = dVar.f65347c + i10;
            dVar.f65347c = i11;
            return i11;
        }

        static /* synthetic */ int q(d dVar, int i10) {
            int i11 = dVar.f65350f + i10;
            dVar.f65350f = i11;
            return i11;
        }

        static /* synthetic */ int u(d dVar, int i10) {
            int i11 = dVar.f65348d + i10;
            dVar.f65348d = i11;
            return i11;
        }

        static /* synthetic */ int v(d dVar, int i10) {
            int i11 = dVar.f65348d - i10;
            dVar.f65348d = i11;
            return i11;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f65345a + ", mFlexLinePosition=" + this.f65347c + ", mPosition=" + this.f65348d + ", mOffset=" + this.f65349e + ", mScrollingOffset=" + this.f65350f + ", mLastScrollDelta=" + this.f65351g + ", mItemDirection=" + this.f65352h + ", mLayoutDirection=" + this.f65353i + '}';
        }
    }

    private static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f65355a;

        /* renamed from: b, reason: collision with root package name */
        private int f65356b;

        class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }

            a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f65355a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int i10) {
            int i11 = this.f65355a;
            return i11 >= 0 && i11 < i10;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f65355a + ", mAnchorOffset=" + this.f65356b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f65355a);
            parcel.writeInt(this.f65356b);
        }

        e() {
        }

        private e(Parcel parcel) {
            this.f65355a = parcel.readInt();
            this.f65356b = parcel.readInt();
        }

        private e(e eVar) {
            this.f65355a = eVar.f65355a;
            this.f65356b = eVar.f65356b;
        }
    }

    private View F2() {
        return a0(0);
    }

    private View u2(int i10) {
        View viewB2 = B2(0, b0(), i10);
        if (viewB2 == null) {
            return null;
        }
        int i11 = this.f65302A.f65377c[v0(viewB2)];
        if (i11 == -1) {
            return null;
        }
        return v2(viewB2, this.f65327z.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H0() {
        return true;
    }

    public void X2(int i10) {
        if (i10 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i11 = this.f65321t;
        if (i11 != i10) {
            if (i11 == 0 || i10 == 0) {
                A1();
                n2();
            }
            this.f65321t = i10;
            this.f65307F = null;
            this.f65308G = null;
            K1();
        }
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public void m(com.google.android.flexbox.c cVar) {
    }

    public int w2() {
        View viewA2 = A2(0, b0(), false);
        if (viewA2 == null) {
            return -1;
        }
        return v0(viewA2);
    }

    private View A2(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View viewA0 = a0(i10);
            if (L2(viewA0, z10)) {
                return viewA0;
            }
            i10 += i12;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int N2(com.google.android.flexbox.c r18, com.google.android.flexbox.FlexboxLayoutManager.d r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.N2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int O2(com.google.android.flexbox.c r21, com.google.android.flexbox.FlexboxLayoutManager.d r22) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.O2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    private void Q2(RecyclerView.w wVar, int i10, int i11) {
        while (i11 >= i10) {
            E1(i11, wVar);
            i11--;
        }
    }

    private void a3(RecyclerView.B b10, b bVar) {
        if (Z2(b10, bVar, this.f65309H) || Y2(b10, bVar)) {
            return;
        }
        bVar.r();
        bVar.f65328a = 0;
        bVar.f65329b = 0;
    }

    private void d3(int i10, int i11) {
        this.f65305D.f65353i = i10;
        boolean zQ = q();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C0(), D0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(o0(), p0());
        boolean z10 = !zQ && this.f65325x;
        if (i10 == 1) {
            View viewA0 = a0(b0() - 1);
            if (viewA0 == null) {
                return;
            }
            this.f65305D.f65349e = this.f65307F.d(viewA0);
            int iV0 = v0(viewA0);
            View viewY2 = y2(viewA0, this.f65327z.get(this.f65302A.f65377c[iV0]));
            this.f65305D.f65352h = 1;
            d dVar = this.f65305D;
            dVar.f65348d = iV0 + dVar.f65352h;
            if (this.f65302A.f65377c.length <= this.f65305D.f65348d) {
                this.f65305D.f65347c = -1;
            } else {
                d dVar2 = this.f65305D;
                dVar2.f65347c = this.f65302A.f65377c[dVar2.f65348d];
            }
            if (z10) {
                this.f65305D.f65349e = this.f65307F.g(viewY2);
                this.f65305D.f65350f = (-this.f65307F.g(viewY2)) + this.f65307F.m();
                d dVar3 = this.f65305D;
                dVar3.f65350f = Math.max(dVar3.f65350f, 0);
            } else {
                this.f65305D.f65349e = this.f65307F.d(viewY2);
                this.f65305D.f65350f = this.f65307F.d(viewY2) - this.f65307F.i();
            }
            if ((this.f65305D.f65347c == -1 || this.f65305D.f65347c > this.f65327z.size() - 1) && this.f65305D.f65348d <= getFlexItemCount()) {
                int i12 = i11 - this.f65305D.f65350f;
                this.f65319R.a();
                if (i12 > 0) {
                    if (zQ) {
                        this.f65302A.d(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i12, this.f65305D.f65348d, this.f65327z);
                    } else {
                        this.f65302A.g(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i12, this.f65305D.f65348d, this.f65327z);
                    }
                    this.f65302A.q(iMakeMeasureSpec, iMakeMeasureSpec2, this.f65305D.f65348d);
                    this.f65302A.Y(this.f65305D.f65348d);
                }
            }
        } else {
            View viewA02 = a0(0);
            if (viewA02 == null) {
                return;
            }
            this.f65305D.f65349e = this.f65307F.g(viewA02);
            int iV02 = v0(viewA02);
            View viewV2 = v2(viewA02, this.f65327z.get(this.f65302A.f65377c[iV02]));
            this.f65305D.f65352h = 1;
            int i13 = this.f65302A.f65377c[iV02];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.f65305D.f65348d = iV02 - this.f65327z.get(i13 - 1).b();
            } else {
                this.f65305D.f65348d = -1;
            }
            this.f65305D.f65347c = i13 > 0 ? i13 - 1 : 0;
            if (z10) {
                this.f65305D.f65349e = this.f65307F.d(viewV2);
                this.f65305D.f65350f = this.f65307F.d(viewV2) - this.f65307F.i();
                d dVar4 = this.f65305D;
                dVar4.f65350f = Math.max(dVar4.f65350f, 0);
            } else {
                this.f65305D.f65349e = this.f65307F.g(viewV2);
                this.f65305D.f65350f = (-this.f65307F.g(viewV2)) + this.f65307F.m();
            }
        }
        d dVar5 = this.f65305D;
        dVar5.f65345a = i11 - dVar5.f65350f;
    }

    private void e3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            T2();
        } else {
            this.f65305D.f65346b = false;
        }
        if (q() || !this.f65325x) {
            this.f65305D.f65345a = this.f65307F.i() - bVar.f65330c;
        } else {
            this.f65305D.f65345a = bVar.f65330c - getPaddingRight();
        }
        this.f65305D.f65348d = bVar.f65328a;
        this.f65305D.f65352h = 1;
        this.f65305D.f65353i = 1;
        this.f65305D.f65349e = bVar.f65330c;
        this.f65305D.f65350f = Integer.MIN_VALUE;
        this.f65305D.f65347c = bVar.f65329b;
        if (!z10 || this.f65327z.size() <= 1 || bVar.f65329b < 0 || bVar.f65329b >= this.f65327z.size() - 1) {
            return;
        }
        com.google.android.flexbox.c cVar = this.f65327z.get(bVar.f65329b);
        d.l(this.f65305D);
        d.u(this.f65305D, cVar.b());
    }

    private void f3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            T2();
        } else {
            this.f65305D.f65346b = false;
        }
        if (q() || !this.f65325x) {
            this.f65305D.f65345a = bVar.f65330c - this.f65307F.m();
        } else {
            this.f65305D.f65345a = (this.f65317P.getWidth() - bVar.f65330c) - this.f65307F.m();
        }
        this.f65305D.f65348d = bVar.f65328a;
        this.f65305D.f65352h = 1;
        this.f65305D.f65353i = -1;
        this.f65305D.f65349e = bVar.f65330c;
        this.f65305D.f65350f = Integer.MIN_VALUE;
        this.f65305D.f65347c = bVar.f65329b;
        if (!z10 || bVar.f65329b <= 0 || this.f65327z.size() <= bVar.f65329b) {
            return;
        }
        com.google.android.flexbox.c cVar = this.f65327z.get(bVar.f65329b);
        d.m(this.f65305D);
        d.v(this.f65305D, cVar.b());
    }

    private void n2() {
        this.f65327z.clear();
        this.f65306E.t();
        this.f65306E.f65331d = 0;
    }

    private void r2() {
        if (this.f65305D == null) {
            this.f65305D = new d();
        }
    }

    private void s2() {
        if (this.f65307F != null) {
            return;
        }
        if (q()) {
            if (this.f65321t == 0) {
                this.f65307F = t.a(this);
                this.f65308G = t.c(this);
                return;
            } else {
                this.f65307F = t.c(this);
                this.f65308G = t.a(this);
                return;
            }
        }
        if (this.f65321t == 0) {
            this.f65307F = t.c(this);
            this.f65308G = t.a(this);
        } else {
            this.f65307F = t.a(this);
            this.f65308G = t.c(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean B() {
        if (this.f65321t == 0) {
            return q();
        }
        if (!q()) {
            return true;
        }
        int iC0 = C0();
        View view = this.f65317P;
        return iC0 > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        if (this.f65321t == 0) {
            return !q();
        }
        if (!q()) {
            int iO0 = o0();
            View view = this.f65317P;
            if (iO0 <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        this.f65310I = i10;
        this.f65311J = Integer.MIN_VALUE;
        e eVar = this.f65309H;
        if (eVar != null) {
            eVar.h();
        }
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q V() {
        return new c(-2, -2);
    }

    public void V2(int i10) {
        int i11 = this.f65323v;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                A1();
                n2();
            }
            this.f65323v = i10;
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q W(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void W2(int i10) {
        if (this.f65320s != i10) {
            A1();
            this.f65320s = i10;
            this.f65307F = null;
            this.f65308G = null;
            n2();
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        a2(pVar);
    }

    @Override // com.google.android.flexbox.a
    public void f(View view, int i10, int i11, com.google.android.flexbox.c cVar) {
        A(view, f65301S);
        if (q()) {
            int iS0 = s0(view) + x0(view);
            cVar.f65361e += iS0;
            cVar.f65362f += iS0;
        } else {
            int iA0 = A0(view) + Z(view);
            cVar.f65361e += iA0;
            cVar.f65362f += iA0;
        }
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f65323v;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f65320s;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.f65304C.b();
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.c> getFlexLinesInternal() {
        return this.f65327z;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f65321t;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.f65327z.size() == 0) {
            return 0;
        }
        int size = this.f65327z.size();
        int iMax = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            iMax = Math.max(iMax, this.f65327z.get(i10).f65361e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f65324w;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f65327z.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f65327z.get(i11).f65363g;
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public View i(int i10) {
        View view = this.f65315N.get(i10);
        return view != null ? view : this.f65303B.p(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        int i10;
        int i11;
        this.f65303B = wVar;
        this.f65304C = b10;
        int iB = b10.b();
        if (iB == 0 && b10.e()) {
            return;
        }
        U2();
        s2();
        r2();
        this.f65302A.t(iB);
        this.f65302A.u(iB);
        this.f65302A.s(iB);
        this.f65305D.f65354j = false;
        e eVar = this.f65309H;
        if (eVar != null && eVar.g(iB)) {
            this.f65310I = this.f65309H.f65355a;
        }
        if (!this.f65306E.f65333f || this.f65310I != -1 || this.f65309H != null) {
            this.f65306E.t();
            a3(b10, this.f65306E);
            this.f65306E.f65333f = true;
        }
        N(wVar);
        if (this.f65306E.f65332e) {
            f3(this.f65306E, false, true);
        } else {
            e3(this.f65306E, false, true);
        }
        c3(iB);
        t2(wVar, b10, this.f65305D);
        if (this.f65306E.f65332e) {
            i11 = this.f65305D.f65349e;
            e3(this.f65306E, true, false);
            t2(wVar, b10, this.f65305D);
            i10 = this.f65305D.f65349e;
        } else {
            i10 = this.f65305D.f65349e;
            f3(this.f65306E, true, false);
            t2(wVar, b10, this.f65305D);
            i11 = this.f65305D.f65349e;
        }
        if (b0() > 0) {
            if (this.f65306E.f65332e) {
                D2(i11 + C2(i10, wVar, b10, true), wVar, b10, false);
            } else {
                C2(i10 + D2(i11, wVar, b10, true), wVar, b10, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public void o(int i10, View view) {
        this.f65315N.put(i10, view);
    }

    @Override // com.google.android.flexbox.a
    public boolean q() {
        int i10 = this.f65320s;
        return i10 == 0 || i10 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f65309H = (e) parcelable;
            K1();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.c> list) {
        this.f65327z = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable t1() {
        if (this.f65309H != null) {
            return new e(this.f65309H);
        }
        e eVar = new e();
        if (b0() <= 0) {
            eVar.h();
            return eVar;
        }
        View viewF2 = F2();
        eVar.f65355a = v0(viewF2);
        eVar.f65356b = this.f65307F.g(viewF2) - this.f65307F.m();
        return eVar;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d dVarW0 = RecyclerView.p.w0(context, attributeSet, i10, i11);
        int i12 = dVarW0.f58197a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (dVarW0.f58199c) {
                    W2(3);
                } else {
                    W2(2);
                }
            }
        } else if (dVarW0.f58199c) {
            W2(1);
        } else {
            W2(0);
        }
        X2(1);
        V2(4);
        this.f65316O = context;
    }

    private View B2(int i10, int i11, int i12) {
        int i13;
        int iV0;
        s2();
        r2();
        int iM = this.f65307F.m();
        int i14 = this.f65307F.i();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewA0 = a0(i10);
            if (viewA0 != null && (iV0 = v0(viewA0)) >= 0 && iV0 < i12) {
                if (((RecyclerView.q) viewA0.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = viewA0;
                    }
                } else {
                    if (this.f65307F.g(viewA0) >= iM && this.f65307F.d(viewA0) <= i14) {
                        return viewA0;
                    }
                    if (view == null) {
                        view = viewA0;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    private int C2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iJ2;
        int i11;
        if (!q() && this.f65325x) {
            int iM = i10 - this.f65307F.m();
            if (iM <= 0) {
                return 0;
            }
            iJ2 = J2(iM, wVar, b10);
        } else {
            int i12 = this.f65307F.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            iJ2 = -J2(-i12, wVar, b10);
        }
        int i13 = i10 + iJ2;
        if (z10 && (i11 = this.f65307F.i() - i13) > 0) {
            this.f65307F.r(i11);
            return i11 + iJ2;
        }
        return iJ2;
    }

    private int D2(int i10, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iJ2;
        int iM;
        if (!q() && this.f65325x) {
            int i11 = this.f65307F.i() - i10;
            if (i11 <= 0) {
                return 0;
            }
            iJ2 = J2(-i11, wVar, b10);
        } else {
            int iM2 = i10 - this.f65307F.m();
            if (iM2 <= 0) {
                return 0;
            }
            iJ2 = -J2(iM2, wVar, b10);
        }
        int i12 = i10 + iJ2;
        if (z10 && (iM = i12 - this.f65307F.m()) > 0) {
            this.f65307F.r(-iM);
            return iJ2 - iM;
        }
        return iJ2;
    }

    private int E2(View view) {
        return g0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    private int G2(View view) {
        return i0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    private int H2(View view) {
        return l0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    private int I2(View view) {
        return m0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    private int J2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        boolean z10;
        if (b0() == 0 || i10 == 0) {
            return 0;
        }
        s2();
        int i11 = 1;
        this.f65305D.f65354j = true;
        if (!q() && this.f65325x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int iAbs = Math.abs(i10);
        d3(i11, iAbs);
        int iT2 = this.f65305D.f65350f + t2(wVar, b10, this.f65305D);
        if (iT2 < 0) {
            return 0;
        }
        if (z10) {
            if (iAbs > iT2) {
                i10 = (-i11) * iT2;
            }
        } else if (iAbs > iT2) {
            i10 = i11 * iT2;
        }
        this.f65307F.r(-i10);
        this.f65305D.f65351g = i10;
        return i10;
    }

    private int K2(int i10) {
        int height;
        int iO0;
        if (b0() != 0 && i10 != 0) {
            s2();
            boolean zQ = q();
            View view = this.f65317P;
            if (zQ) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (zQ) {
                iO0 = C0();
            } else {
                iO0 = o0();
            }
            if (r0() == 1) {
                int iAbs = Math.abs(i10);
                if (i10 < 0) {
                    return -Math.min((iO0 + this.f65306E.f65331d) - height, iAbs);
                }
                if (this.f65306E.f65331d + i10 > 0) {
                    return -this.f65306E.f65331d;
                }
            } else {
                if (i10 > 0) {
                    return Math.min((iO0 - this.f65306E.f65331d) - height, i10);
                }
                if (this.f65306E.f65331d + i10 < 0) {
                    return -this.f65306E.f65331d;
                }
            }
            return i10;
        }
        return 0;
    }

    private boolean L2(View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iC0 = C0() - getPaddingRight();
        int iO0 = o0() - getPaddingBottom();
        int iG2 = G2(view);
        int iI2 = I2(view);
        int iH2 = H2(view);
        int iE2 = E2(view);
        if (paddingLeft <= iG2 && iC0 >= iH2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (iG2 < iC0 && iH2 < paddingLeft) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (paddingTop <= iI2 && iO0 >= iE2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (iI2 < iO0 && iE2 < paddingTop) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z10) {
            if (z11 && z13) {
                return true;
            }
            return false;
        }
        if (z12 && z14) {
            return true;
        }
        return false;
    }

    private static boolean M0(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    private int M2(com.google.android.flexbox.c cVar, d dVar) {
        if (q()) {
            return N2(cVar, dVar);
        }
        return O2(cVar, dVar);
    }

    private void P2(RecyclerView.w wVar, d dVar) {
        if (!dVar.f65354j) {
            return;
        }
        if (dVar.f65353i == -1) {
            R2(wVar, dVar);
        } else {
            S2(wVar, dVar);
        }
    }

    private void R2(RecyclerView.w wVar, d dVar) {
        int iB0;
        int i10;
        View viewA0;
        int i11;
        if (dVar.f65350f < 0 || (iB0 = b0()) == 0 || (viewA0 = a0(iB0 - 1)) == null || (i11 = this.f65302A.f65377c[v0(viewA0)]) == -1) {
            return;
        }
        com.google.android.flexbox.c cVar = this.f65327z.get(i11);
        int i12 = i10;
        while (true) {
            if (i12 < 0) {
                break;
            }
            View viewA02 = a0(i12);
            if (viewA02 != null) {
                if (!l2(viewA02, dVar.f65350f)) {
                    break;
                }
                if (cVar.f65371o != v0(viewA02)) {
                    continue;
                } else if (i11 <= 0) {
                    iB0 = i12;
                    break;
                } else {
                    i11 += dVar.f65353i;
                    cVar = this.f65327z.get(i11);
                    iB0 = i12;
                }
            }
            i12--;
        }
        Q2(wVar, iB0, i10);
    }

    private void S2(RecyclerView.w wVar, d dVar) {
        int iB0;
        View viewA0;
        if (dVar.f65350f >= 0 && (iB0 = b0()) != 0 && (viewA0 = a0(0)) != null) {
            int i10 = this.f65302A.f65377c[v0(viewA0)];
            int i11 = -1;
            if (i10 == -1) {
                return;
            }
            com.google.android.flexbox.c cVar = this.f65327z.get(i10);
            int i12 = 0;
            while (true) {
                if (i12 >= iB0) {
                    break;
                }
                View viewA02 = a0(i12);
                if (viewA02 != null) {
                    if (!m2(viewA02, dVar.f65350f)) {
                        break;
                    }
                    if (cVar.f65372p != v0(viewA02)) {
                        continue;
                    } else if (i10 >= this.f65327z.size() - 1) {
                        i11 = i12;
                        break;
                    } else {
                        i10 += dVar.f65353i;
                        cVar = this.f65327z.get(i10);
                        i11 = i12;
                    }
                }
                i12++;
            }
            Q2(wVar, 0, i11);
        }
    }

    private void T2() {
        int iD0;
        boolean z10;
        if (q()) {
            iD0 = p0();
        } else {
            iD0 = D0();
        }
        d dVar = this.f65305D;
        if (iD0 != 0 && iD0 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        dVar.f65346b = z10;
    }

    private void U2() {
        boolean z10;
        boolean z11;
        boolean z12;
        int iR0 = r0();
        int i10 = this.f65320s;
        boolean z13 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f65325x = false;
                        this.f65326y = false;
                        return;
                    }
                    if (iR0 == 1) {
                        z13 = true;
                    }
                    this.f65325x = z13;
                    if (this.f65321t == 2) {
                        this.f65325x = !z13;
                    }
                    this.f65326y = true;
                    return;
                }
                if (iR0 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f65325x = z12;
                if (this.f65321t == 2) {
                    this.f65325x = !z12;
                }
                this.f65326y = false;
                return;
            }
            if (iR0 != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f65325x = z11;
            if (this.f65321t == 2) {
                z13 = true;
            }
            this.f65326y = z13;
            return;
        }
        if (iR0 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f65325x = z10;
        if (this.f65321t == 2) {
            z13 = true;
        }
        this.f65326y = z13;
    }

    private boolean W1(View view, int i10, int i11, RecyclerView.q qVar) {
        if (!view.isLayoutRequested() && L0() && M0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && M0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) {
            return false;
        }
        return true;
    }

    private boolean Y2(RecyclerView.B b10, b bVar) {
        View viewU2;
        int iM;
        if (b0() == 0) {
            return false;
        }
        if (bVar.f65332e) {
            viewU2 = x2(b10.b());
        } else {
            viewU2 = u2(b10.b());
        }
        if (viewU2 != null) {
            bVar.s(viewU2);
            if (!b10.e() && d2()) {
                if (this.f65307F.g(viewU2) >= this.f65307F.i() || this.f65307F.d(viewU2) < this.f65307F.m()) {
                    if (bVar.f65332e) {
                        iM = this.f65307F.i();
                    } else {
                        iM = this.f65307F.m();
                    }
                    bVar.f65330c = iM;
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean Z2(RecyclerView.B b10, b bVar, e eVar) {
        int i10;
        View viewA0;
        int iG;
        boolean z10 = false;
        if (!b10.e() && (i10 = this.f65310I) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                bVar.f65328a = this.f65310I;
                bVar.f65329b = this.f65302A.f65377c[bVar.f65328a];
                e eVar2 = this.f65309H;
                if (eVar2 != null && eVar2.g(b10.b())) {
                    bVar.f65330c = this.f65307F.m() + eVar.f65356b;
                    bVar.f65334g = true;
                    bVar.f65329b = -1;
                    return true;
                }
                if (this.f65311J == Integer.MIN_VALUE) {
                    View viewU = U(this.f65310I);
                    if (viewU != null) {
                        if (this.f65307F.e(viewU) > this.f65307F.n()) {
                            bVar.r();
                            return true;
                        }
                        if (this.f65307F.g(viewU) - this.f65307F.m() < 0) {
                            bVar.f65330c = this.f65307F.m();
                            bVar.f65332e = false;
                            return true;
                        }
                        if (this.f65307F.i() - this.f65307F.d(viewU) < 0) {
                            bVar.f65330c = this.f65307F.i();
                            bVar.f65332e = true;
                            return true;
                        }
                        if (bVar.f65332e) {
                            iG = this.f65307F.d(viewU) + this.f65307F.o();
                        } else {
                            iG = this.f65307F.g(viewU);
                        }
                        bVar.f65330c = iG;
                    } else {
                        if (b0() > 0 && (viewA0 = a0(0)) != null) {
                            if (this.f65310I < v0(viewA0)) {
                                z10 = true;
                            }
                            bVar.f65332e = z10;
                        }
                        bVar.r();
                    }
                    return true;
                }
                if (q() || !this.f65325x) {
                    bVar.f65330c = this.f65307F.m() + this.f65311J;
                } else {
                    bVar.f65330c = this.f65311J - this.f65307F.j();
                }
                return true;
            }
            this.f65310I = -1;
            this.f65311J = Integer.MIN_VALUE;
        }
        return false;
    }

    private void b3(int i10) {
        if (i10 < z2()) {
            int iB0 = b0();
            this.f65302A.t(iB0);
            this.f65302A.u(iB0);
            this.f65302A.s(iB0);
            if (i10 < this.f65302A.f65377c.length) {
                this.f65318Q = i10;
                View viewF2 = F2();
                if (viewF2 == null) {
                    return;
                }
                this.f65310I = v0(viewF2);
                if (!q() && this.f65325x) {
                    this.f65311J = this.f65307F.d(viewF2) + this.f65307F.j();
                } else {
                    this.f65311J = this.f65307F.g(viewF2) - this.f65307F.m();
                }
            }
        }
    }

    private void c3(int i10) {
        int i11;
        int iMin;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C0(), D0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(o0(), p0());
        int iC0 = C0();
        int iO0 = o0();
        boolean z10 = false;
        if (q()) {
            int i13 = this.f65312K;
            if (i13 != Integer.MIN_VALUE && i13 != iC0) {
                z10 = true;
            }
            i11 = this.f65305D.f65346b ? this.f65316O.getResources().getDisplayMetrics().heightPixels : this.f65305D.f65345a;
        } else {
            int i14 = this.f65313L;
            if (i14 != Integer.MIN_VALUE && i14 != iO0) {
                z10 = true;
            }
            if (!this.f65305D.f65346b) {
                i11 = this.f65305D.f65345a;
            } else {
                i11 = this.f65316O.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i15 = i11;
        this.f65312K = iC0;
        this.f65313L = iO0;
        int i16 = this.f65318Q;
        if (i16 == -1 && (this.f65310I != -1 || z10)) {
            if (this.f65306E.f65332e) {
                return;
            }
            this.f65327z.clear();
            this.f65319R.a();
            if (q()) {
                this.f65302A.e(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i15, this.f65306E.f65328a, this.f65327z);
            } else {
                this.f65302A.h(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i15, this.f65306E.f65328a, this.f65327z);
            }
            this.f65327z = this.f65319R.f65380a;
            this.f65302A.p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f65302A.X();
            b bVar = this.f65306E;
            bVar.f65329b = this.f65302A.f65377c[bVar.f65328a];
            this.f65305D.f65347c = this.f65306E.f65329b;
            return;
        }
        if (i16 == -1) {
            iMin = this.f65306E.f65328a;
        } else {
            iMin = Math.min(i16, this.f65306E.f65328a);
        }
        int i17 = iMin;
        this.f65319R.a();
        if (q()) {
            if (this.f65327z.size() > 0) {
                this.f65302A.j(this.f65327z, i17);
                this.f65302A.b(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i15, i17, this.f65306E.f65328a, this.f65327z);
                i12 = i17;
            } else {
                i12 = i17;
                this.f65302A.s(i10);
                this.f65302A.d(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, this.f65327z);
            }
        } else {
            i12 = i17;
            if (this.f65327z.size() > 0) {
                this.f65302A.j(this.f65327z, i12);
                i17 = i12;
                this.f65302A.b(this.f65319R, iMakeMeasureSpec2, iMakeMeasureSpec, i15, i17, this.f65306E.f65328a, this.f65327z);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i12 = i17;
            } else {
                this.f65302A.s(i10);
                this.f65302A.g(this.f65319R, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, this.f65327z);
            }
        }
        this.f65327z = this.f65319R.f65380a;
        this.f65302A.q(iMakeMeasureSpec, iMakeMeasureSpec2, i12);
        this.f65302A.Y(i12);
    }

    private boolean l2(View view, int i10) {
        if (!q() && this.f65325x) {
            if (this.f65307F.d(view) > i10) {
                return false;
            }
            return true;
        }
        if (this.f65307F.g(view) < this.f65307F.h() - i10) {
            return false;
        }
        return true;
    }

    private boolean m2(View view, int i10) {
        if (!q() && this.f65325x) {
            if (this.f65307F.h() - this.f65307F.g(view) > i10) {
                return false;
            }
            return true;
        }
        if (this.f65307F.d(view) > i10) {
            return false;
        }
        return true;
    }

    private int o2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        int iB = b10.b();
        s2();
        View viewU2 = u2(iB);
        View viewX2 = x2(iB);
        if (b10.b() == 0 || viewU2 == null || viewX2 == null) {
            return 0;
        }
        return Math.min(this.f65307F.n(), this.f65307F.d(viewX2) - this.f65307F.g(viewU2));
    }

    private int p2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        int iB = b10.b();
        View viewU2 = u2(iB);
        View viewX2 = x2(iB);
        if (b10.b() != 0 && viewU2 != null && viewX2 != null) {
            int iV0 = v0(viewU2);
            int iV02 = v0(viewX2);
            int iAbs = Math.abs(this.f65307F.d(viewX2) - this.f65307F.g(viewU2));
            int i10 = this.f65302A.f65377c[iV0];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (iAbs / ((r4[iV02] - i10) + 1))) + (this.f65307F.m() - this.f65307F.g(viewU2)));
            }
        }
        return 0;
    }

    private int q2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        int iB = b10.b();
        View viewU2 = u2(iB);
        View viewX2 = x2(iB);
        if (b10.b() == 0 || viewU2 == null || viewX2 == null) {
            return 0;
        }
        int iW2 = w2();
        return (int) ((Math.abs(this.f65307F.d(viewX2) - this.f65307F.g(viewU2)) / ((z2() - iW2) + 1)) * b10.b());
    }

    private int t2(RecyclerView.w wVar, RecyclerView.B b10, d dVar) {
        if (dVar.f65350f != Integer.MIN_VALUE) {
            if (dVar.f65345a < 0) {
                d.q(dVar, dVar.f65345a);
            }
            P2(wVar, dVar);
        }
        int i10 = dVar.f65345a;
        int iA = dVar.f65345a;
        boolean zQ = q();
        int iM2 = 0;
        while (true) {
            if ((iA <= 0 && !this.f65305D.f65346b) || !dVar.D(b10, this.f65327z)) {
                break;
            }
            com.google.android.flexbox.c cVar = this.f65327z.get(dVar.f65347c);
            dVar.f65348d = cVar.f65371o;
            iM2 += M2(cVar, dVar);
            if (!zQ && this.f65325x) {
                d.d(dVar, cVar.a() * dVar.f65353i);
            } else {
                d.c(dVar, cVar.a() * dVar.f65353i);
            }
            iA -= cVar.a();
        }
        d.i(dVar, iM2);
        if (dVar.f65350f != Integer.MIN_VALUE) {
            d.q(dVar, iM2);
            if (dVar.f65345a < 0) {
                d.q(dVar, dVar.f65345a);
            }
            P2(wVar, dVar);
        }
        return i10 - dVar.f65345a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View v2(android.view.View r6, com.google.android.flexbox.c r7) {
        /*
            r5 = this;
            boolean r0 = r5.q()
            int r7 = r7.f65364h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.a0(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f65325x
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.t r3 = r5.f65307F
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.t r4 = r5.f65307F
            int r4 = r4.d(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.t r3 = r5.f65307F
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.t r4 = r5.f65307F
            int r4 = r4.g(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.v2(android.view.View, com.google.android.flexbox.c):android.view.View");
    }

    private View x2(int i10) {
        View viewB2 = B2(b0() - 1, -1, i10);
        if (viewB2 == null) {
            return null;
        }
        return y2(viewB2, this.f65327z.get(this.f65302A.f65377c[v0(viewB2)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View y2(android.view.View r6, com.google.android.flexbox.c r7) {
        /*
            r5 = this;
            boolean r0 = r5.q()
            int r1 = r5.b0()
            int r1 = r1 + (-2)
            int r2 = r5.b0()
            int r7 = r7.f65364h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.a0(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f65325x
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.t r3 = r5.f65307F
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.t r4 = r5.f65307F
            int r4 = r4.g(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.t r3 = r5.f65307F
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.t r4 = r5.f65307F
            int r4 = r4.d(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.y2(android.view.View, com.google.android.flexbox.c):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        return o2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        return p2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        return q2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        return o2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        return p2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        return q2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (q() && this.f65321t != 0) {
            int iK2 = K2(i10);
            b.l(this.f65306E, iK2);
            this.f65308G.r(-iK2);
            return iK2;
        }
        int iJ2 = J2(i10, wVar, b10);
        this.f65315N.clear();
        return iJ2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (!q() && (this.f65321t != 0 || q())) {
            int iK2 = K2(i10);
            b.l(this.f65306E, iK2);
            this.f65308G.r(-iK2);
            return iK2;
        }
        int iJ2 = J2(i10, wVar, b10);
        this.f65315N.clear();
        return iJ2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        this.f65317P = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Y0(recyclerView, wVar);
        if (this.f65314M) {
            B1(wVar);
            wVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        View viewA0;
        int i11;
        if (b0() == 0 || (viewA0 = a0(0)) == null) {
            return null;
        }
        if (i10 < v0(viewA0)) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        if (q()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // com.google.android.flexbox.a
    public int g(int i10, int i11, int i12) {
        return RecyclerView.p.c0(C0(), D0(), i11, i12, B());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        super.h1(recyclerView, i10, i11);
        b3(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.j1(recyclerView, i10, i11, i12);
        b3(Math.min(i10, i11));
    }

    @Override // com.google.android.flexbox.a
    public int k(int i10, int i11, int i12) {
        return RecyclerView.p.c0(o0(), p0(), i11, i12, C());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView recyclerView, int i10, int i11) {
        super.k1(recyclerView, i10, i11);
        b3(i10);
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        int iS0;
        int iX0;
        if (q()) {
            iS0 = A0(view);
            iX0 = Z(view);
        } else {
            iS0 = s0(view);
            iX0 = x0(view);
        }
        return iS0 + iX0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l1(RecyclerView recyclerView, int i10, int i11) {
        super.l1(recyclerView, i10, i11);
        b3(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.m1(recyclerView, i10, i11, obj);
        b3(i10);
    }

    @Override // com.google.android.flexbox.a
    public View n(int i10) {
        return i(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView.B b10) {
        super.o1(b10);
        this.f65309H = null;
        this.f65310I = -1;
        this.f65311J = Integer.MIN_VALUE;
        this.f65318Q = -1;
        this.f65306E.t();
        this.f65315N.clear();
    }

    @Override // com.google.android.flexbox.a
    public int p(View view, int i10, int i11) {
        int iA0;
        int iZ;
        if (q()) {
            iA0 = s0(view);
            iZ = x0(view);
        } else {
            iA0 = A0(view);
            iZ = Z(view);
        }
        return iA0 + iZ;
    }

    public int z2() {
        View viewA2 = A2(b0() - 1, -1, false);
        if (viewA2 == null) {
            return -1;
        }
        return v0(viewA2);
    }
}
