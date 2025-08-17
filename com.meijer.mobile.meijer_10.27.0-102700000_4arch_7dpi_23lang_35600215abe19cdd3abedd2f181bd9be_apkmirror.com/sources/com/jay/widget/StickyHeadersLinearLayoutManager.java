package com.jay.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.jay.widget.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class StickyHeadersLinearLayoutManager<T extends RecyclerView.h & com.jay.widget.a> extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    private T f90875I;

    /* renamed from: J, reason: collision with root package name */
    private float f90876J;

    /* renamed from: K, reason: collision with root package name */
    private float f90877K;

    /* renamed from: L, reason: collision with root package name */
    private List<Integer> f90878L;

    /* renamed from: M, reason: collision with root package name */
    private RecyclerView.j f90879M;

    /* renamed from: N, reason: collision with root package name */
    private View f90880N;

    /* renamed from: O, reason: collision with root package name */
    private int f90881O;

    /* renamed from: P, reason: collision with root package name */
    private int f90882P;

    /* renamed from: Q, reason: collision with root package name */
    private int f90883Q;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f90884a;

        a(ViewTreeObserver viewTreeObserver) {
            this.f90884a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f90884a.removeOnGlobalLayoutListener(this);
            if (StickyHeadersLinearLayoutManager.this.f90882P != -1) {
                StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
                stickyHeadersLinearLayoutManager.T2(stickyHeadersLinearLayoutManager.f90882P, StickyHeadersLinearLayoutManager.this.f90883Q);
                StickyHeadersLinearLayoutManager.this.E3(-1, Integer.MIN_VALUE);
            }
        }
    }

    private class b extends RecyclerView.j {
        private b() {
        }

        private void h(int i10) {
            Integer num = (Integer) StickyHeadersLinearLayoutManager.this.f90878L.remove(i10);
            int iV3 = StickyHeadersLinearLayoutManager.this.v3(num.intValue());
            if (iV3 != -1) {
                StickyHeadersLinearLayoutManager.this.f90878L.add(iV3, num);
            } else {
                StickyHeadersLinearLayoutManager.this.f90878L.add(num);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            StickyHeadersLinearLayoutManager.this.f90878L.clear();
            int itemCount = StickyHeadersLinearLayoutManager.this.f90875I.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                if (((com.jay.widget.a) StickyHeadersLinearLayoutManager.this.f90875I).a(i10)) {
                    StickyHeadersLinearLayoutManager.this.f90878L.add(Integer.valueOf(i10));
                }
            }
            if (StickyHeadersLinearLayoutManager.this.f90880N == null || StickyHeadersLinearLayoutManager.this.f90878L.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.f90881O))) {
                return;
            }
            StickyHeadersLinearLayoutManager.this.B3(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            int size = StickyHeadersLinearLayoutManager.this.f90878L.size();
            if (size > 0) {
                for (int iV3 = StickyHeadersLinearLayoutManager.this.v3(i10); iV3 != -1 && iV3 < size; iV3++) {
                    StickyHeadersLinearLayoutManager.this.f90878L.set(iV3, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.f90878L.get(iV3)).intValue() + i11));
                }
            }
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                if (((com.jay.widget.a) StickyHeadersLinearLayoutManager.this.f90875I).a(i12)) {
                    int iV32 = StickyHeadersLinearLayoutManager.this.v3(i12);
                    if (iV32 != -1) {
                        StickyHeadersLinearLayoutManager.this.f90878L.add(iV32, Integer.valueOf(i12));
                    } else {
                        StickyHeadersLinearLayoutManager.this.f90878L.add(Integer.valueOf(i12));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            int size = StickyHeadersLinearLayoutManager.this.f90878L.size();
            if (size > 0) {
                if (i10 < i11) {
                    for (int iV3 = StickyHeadersLinearLayoutManager.this.v3(i10); iV3 != -1 && iV3 < size; iV3++) {
                        int iIntValue = ((Integer) StickyHeadersLinearLayoutManager.this.f90878L.get(iV3)).intValue();
                        if (iIntValue >= i10 && iIntValue < i10 + i12) {
                            StickyHeadersLinearLayoutManager.this.f90878L.set(iV3, Integer.valueOf(iIntValue - (i11 - i10)));
                            h(iV3);
                        } else {
                            if (iIntValue < i10 + i12 || iIntValue > i11) {
                                return;
                            }
                            StickyHeadersLinearLayoutManager.this.f90878L.set(iV3, Integer.valueOf(iIntValue - i12));
                            h(iV3);
                        }
                    }
                    return;
                }
                for (int iV32 = StickyHeadersLinearLayoutManager.this.v3(i11); iV32 != -1 && iV32 < size; iV32++) {
                    int iIntValue2 = ((Integer) StickyHeadersLinearLayoutManager.this.f90878L.get(iV32)).intValue();
                    if (iIntValue2 >= i10 && iIntValue2 < i10 + i12) {
                        StickyHeadersLinearLayoutManager.this.f90878L.set(iV32, Integer.valueOf(iIntValue2 + (i11 - i10)));
                        h(iV32);
                    } else {
                        if (iIntValue2 < i11 || iIntValue2 > i10) {
                            return;
                        }
                        StickyHeadersLinearLayoutManager.this.f90878L.set(iV32, Integer.valueOf(iIntValue2 + i12));
                        h(iV32);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            int size = StickyHeadersLinearLayoutManager.this.f90878L.size();
            if (size > 0) {
                int i12 = i10 + i11;
                for (int i13 = i12 - 1; i13 >= i10; i13--) {
                    int iT3 = StickyHeadersLinearLayoutManager.this.t3(i13);
                    if (iT3 != -1) {
                        StickyHeadersLinearLayoutManager.this.f90878L.remove(iT3);
                        size--;
                    }
                }
                if (StickyHeadersLinearLayoutManager.this.f90880N != null && !StickyHeadersLinearLayoutManager.this.f90878L.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.f90881O))) {
                    StickyHeadersLinearLayoutManager.this.B3(null);
                }
                for (int iV3 = StickyHeadersLinearLayoutManager.this.v3(i12); iV3 != -1 && iV3 < size; iV3++) {
                    StickyHeadersLinearLayoutManager.this.f90878L.set(iV3, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.f90878L.get(iV3)).intValue() - i11));
                }
            }
        }
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private Parcelable f90887a;

        /* renamed from: b, reason: collision with root package name */
        private int f90888b;

        /* renamed from: c, reason: collision with root package name */
        private int f90889c;

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

        public c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public c(Parcel parcel) {
            this.f90887a = parcel.readParcelable(c.class.getClassLoader());
            this.f90888b = parcel.readInt();
            this.f90889c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f90887a, i10);
            parcel.writeInt(this.f90888b);
            parcel.writeInt(this.f90889c);
        }
    }

    private void A3(View view) {
        Q0(view, 0, 0);
        if (F2() == 1) {
            view.layout(getPaddingLeft(), 0, C0() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), o0() - getPaddingBottom());
        }
    }

    private void C3(int i10, int i11, boolean z10) {
        E3(-1, Integer.MIN_VALUE);
        if (!z10) {
            super.T2(i10, i11);
            return;
        }
        int iU3 = u3(i10);
        if (iU3 == -1 || t3(i10) != -1) {
            super.T2(i10, i11);
            return;
        }
        int i12 = i10 - 1;
        if (t3(i12) != -1) {
            super.T2(i12, i11);
            return;
        }
        if (this.f90880N == null || iU3 != t3(this.f90881O)) {
            E3(i10, i11);
            super.T2(i10, i11);
        } else {
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            super.T2(i10, i11 + this.f90880N.getHeight());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void T2(int i10, int i11) {
        C3(i10, i11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(RecyclerView.w wVar) {
        View view = this.f90880N;
        this.f90880N = null;
        this.f90881O = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        T t10 = this.f90875I;
        if (t10 instanceof a.InterfaceC1299a) {
            ((a.InterfaceC1299a) t10).b(view);
        }
        b2(view);
        G1(view);
        if (wVar != null) {
            wVar.H(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D3(RecyclerView.h hVar) {
        T t10 = this.f90875I;
        if (t10 != null) {
            t10.unregisterAdapterDataObserver(this.f90879M);
        }
        if (!(hVar instanceof com.jay.widget.a)) {
            this.f90875I = null;
            this.f90878L.clear();
        } else {
            this.f90875I = hVar;
            hVar.registerAdapterDataObserver(this.f90879M);
            this.f90879M.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i10, int i11) {
        this.f90882P = i10;
        this.f90883Q = i11;
    }

    private void F3(RecyclerView.w wVar, boolean z10) {
        View view;
        View viewA0;
        int iA;
        View viewA02;
        int size = this.f90878L.size();
        int iB0 = b0();
        if (size > 0 && iB0 > 0) {
            int i10 = 0;
            while (true) {
                view = null;
                if (i10 >= iB0) {
                    viewA0 = null;
                    iA = -1;
                    i10 = -1;
                    break;
                } else {
                    viewA0 = a0(i10);
                    RecyclerView.q qVar = (RecyclerView.q) viewA0.getLayoutParams();
                    if (z3(viewA0, qVar)) {
                        iA = qVar.a();
                        break;
                    }
                    i10++;
                }
            }
            if (viewA0 != null && iA != -1) {
                int iU3 = u3(iA);
                int iIntValue = iU3 != -1 ? this.f90878L.get(iU3).intValue() : -1;
                int i11 = iU3 + 1;
                int iIntValue2 = size > i11 ? this.f90878L.get(i11).intValue() : -1;
                if (iIntValue != -1 && ((iIntValue != iA || y3(viewA0)) && iIntValue2 != iIntValue + 1)) {
                    View view2 = this.f90880N;
                    if (view2 != null && q0(view2) != this.f90875I.getItemViewType(iIntValue)) {
                        B3(wVar);
                    }
                    if (this.f90880N == null) {
                        r3(wVar, iIntValue);
                    }
                    if (z10 || v0(this.f90880N) != iIntValue) {
                        q3(wVar, iIntValue);
                    }
                    if (iIntValue2 != -1 && (viewA02 = a0(i10 + (iIntValue2 - iA))) != this.f90880N) {
                        view = viewA02;
                    }
                    View view3 = this.f90880N;
                    view3.setTranslationX(w3(view3, view));
                    View view4 = this.f90880N;
                    view4.setTranslationY(x3(view4, view));
                    return;
                }
            }
        }
        if (this.f90880N != null) {
            B3(wVar);
        }
    }

    private void p3() {
        View view = this.f90880N;
        if (view != null) {
            x(view);
        }
    }

    private void q3(RecyclerView.w wVar, int i10) {
        wVar.c(this.f90880N, i10);
        this.f90881O = i10;
        A3(this.f90880N);
        if (this.f90882P != -1) {
            ViewTreeObserver viewTreeObserver = this.f90880N.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new a(viewTreeObserver));
        }
    }

    private void s3() {
        View view = this.f90880N;
        if (view != null) {
            O(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t3(int i10) {
        int size = this.f90878L.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f90878L.get(i12).intValue() > i10) {
                size = i12 - 1;
            } else {
                if (this.f90878L.get(i12).intValue() >= i10) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private int u3(int i10) {
        int size = this.f90878L.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f90878L.get(i12).intValue() <= i10) {
                if (i12 < this.f90878L.size() - 1) {
                    int i13 = i12 + 1;
                    if (this.f90878L.get(i13).intValue() <= i10) {
                        i11 = i13;
                    }
                }
                return i12;
            }
            size = i12 - 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v3(int i10) {
        int size = this.f90878L.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (this.f90878L.get(i13).intValue() >= i10) {
                    size = i13;
                }
            }
            if (this.f90878L.get(i12).intValue() >= i10) {
                return i12;
            }
            i11 = i12 + 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        T2(i10, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            this.f90882P = cVar.f90888b;
            this.f90883Q = cVar.f90889c;
            parcelable = cVar.f90887a;
        }
        super.s1(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable t1() {
        c cVar = new c();
        cVar.f90887a = super.t1();
        cVar.f90888b = this.f90882P;
        cVar.f90889c = this.f90883Q;
        return cVar;
    }

    public StickyHeadersLinearLayoutManager(Context context) {
        super(context);
        this.f90878L = new ArrayList(0);
        this.f90879M = new b();
        this.f90881O = -1;
        this.f90882P = -1;
        this.f90883Q = 0;
    }

    private void r3(RecyclerView.w wVar, int i10) {
        View viewP = wVar.p(i10);
        T t10 = this.f90875I;
        if (t10 instanceof a.InterfaceC1299a) {
            ((a.InterfaceC1299a) t10).a(viewP);
        }
        t(viewP);
        A3(viewP);
        F0(viewP);
        this.f90880N = viewP;
        this.f90881O = i10;
    }

    private float w3(View view, View view2) {
        if (F2() != 1) {
            float fC0 = this.f90876J;
            if (G2()) {
                fC0 += C0() - view.getWidth();
            }
            if (view2 != null) {
                if (G2()) {
                    return Math.max(view2.getRight(), fC0);
                }
                return Math.min(view2.getLeft() - view.getWidth(), fC0);
            }
            return fC0;
        }
        return this.f90876J;
    }

    private float x3(View view, View view2) {
        if (F2() == 1) {
            float fO0 = this.f90877K;
            if (G2()) {
                fO0 += o0() - view.getHeight();
            }
            if (view2 != null) {
                if (G2()) {
                    return Math.max(view2.getBottom(), fO0);
                }
                return Math.min(view2.getTop() - view.getHeight(), fO0);
            }
            return fO0;
        }
        return this.f90877K;
    }

    private boolean y3(View view) {
        if (F2() == 1) {
            if (G2()) {
                if (view.getBottom() - view.getTranslationY() <= o0() + this.f90877K) {
                    return false;
                }
                return true;
            }
            if (view.getTop() + view.getTranslationY() >= this.f90877K) {
                return false;
            }
            return true;
        }
        if (G2()) {
            if (view.getRight() - view.getTranslationX() <= C0() + this.f90876J) {
                return false;
            }
            return true;
        }
        if (view.getLeft() + view.getTranslationX() >= this.f90876J) {
            return false;
        }
        return true;
    }

    private boolean z3(View view, RecyclerView.q qVar) {
        if (!qVar.d() && !qVar.e()) {
            if (F2() == 1) {
                if (G2()) {
                    if (view.getTop() + view.getTranslationY() > o0() + this.f90877K) {
                        return false;
                    }
                    return true;
                }
                if (view.getBottom() - view.getTranslationY() < this.f90877K) {
                    return false;
                }
                return true;
            }
            if (G2()) {
                if (view.getLeft() + view.getTranslationX() > C0() + this.f90876J) {
                    return false;
                }
                return true;
            }
            if (view.getRight() - view.getTranslationX() >= this.f90876J) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        s3();
        int iH = super.H(b10);
        p3();
        return iH;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        s3();
        int I10 = super.I(b10);
        p3();
        return I10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        s3();
        int iJ = super.J(b10);
        p3();
        return iJ;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        s3();
        int iK = super.K(b10);
        p3();
        return iK;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        s3();
        int iL = super.L(b10);
        p3();
        return iL;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        s3();
        int iM = super.M(b10);
        p3();
        return iM;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        s3();
        int iN1 = super.N1(i10, wVar, b10);
        p3();
        if (iN1 != 0) {
            F3(wVar, false);
        }
        return iN1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        s3();
        int iP1 = super.P1(i10, wVar, b10);
        p3();
        if (iP1 != 0) {
            F3(wVar, false);
        }
        return iP1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        super.U0(hVar, hVar2);
        D3(hVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        D3(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        s3();
        View viewZ0 = super.Z0(view, i10, wVar, b10);
        p3();
        return viewZ0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        s3();
        PointF pointFE = super.e(i10);
        p3();
        return pointFE;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        s3();
        super.n1(wVar, b10);
        p3();
        if (!b10.e()) {
            F3(wVar, true);
        }
    }
}
