package com.jay.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jay.widget.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class StickyHeadersStaggeredGridLayoutManager<T extends RecyclerView.h & com.jay.widget.a> extends StaggeredGridLayoutManager {

    /* renamed from: Q, reason: collision with root package name */
    private T f90890Q;

    /* renamed from: R, reason: collision with root package name */
    private float f90891R;

    /* renamed from: S, reason: collision with root package name */
    private float f90892S;

    /* renamed from: T, reason: collision with root package name */
    private List<Integer> f90893T;

    /* renamed from: U, reason: collision with root package name */
    private RecyclerView.j f90894U;

    /* renamed from: V, reason: collision with root package name */
    private View f90895V;

    /* renamed from: W, reason: collision with root package name */
    private int f90896W;

    /* renamed from: X, reason: collision with root package name */
    private int f90897X;

    /* renamed from: Y, reason: collision with root package name */
    private int f90898Y;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f90899a;

        a(ViewTreeObserver viewTreeObserver) {
            this.f90899a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f90899a.removeOnGlobalLayoutListener(this);
            if (StickyHeadersStaggeredGridLayoutManager.this.f90897X != -1) {
                StickyHeadersStaggeredGridLayoutManager stickyHeadersStaggeredGridLayoutManager = StickyHeadersStaggeredGridLayoutManager.this;
                stickyHeadersStaggeredGridLayoutManager.a3(stickyHeadersStaggeredGridLayoutManager.f90897X, StickyHeadersStaggeredGridLayoutManager.this.f90898Y);
                StickyHeadersStaggeredGridLayoutManager.this.M3(-1, Integer.MIN_VALUE);
            }
        }
    }

    private class b extends RecyclerView.j {
        private b() {
        }

        private void h(int i10) {
            Integer num = (Integer) StickyHeadersStaggeredGridLayoutManager.this.f90893T.remove(i10);
            int iD3 = StickyHeadersStaggeredGridLayoutManager.this.D3(num.intValue());
            if (iD3 != -1) {
                StickyHeadersStaggeredGridLayoutManager.this.f90893T.add(iD3, num);
            } else {
                StickyHeadersStaggeredGridLayoutManager.this.f90893T.add(num);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            StickyHeadersStaggeredGridLayoutManager.this.f90893T.clear();
            int itemCount = StickyHeadersStaggeredGridLayoutManager.this.f90890Q.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                if (((com.jay.widget.a) StickyHeadersStaggeredGridLayoutManager.this.f90890Q).a(i10)) {
                    StickyHeadersStaggeredGridLayoutManager.this.f90893T.add(Integer.valueOf(i10));
                }
            }
            if (StickyHeadersStaggeredGridLayoutManager.this.f90895V == null || StickyHeadersStaggeredGridLayoutManager.this.f90893T.contains(Integer.valueOf(StickyHeadersStaggeredGridLayoutManager.this.f90896W))) {
                return;
            }
            StickyHeadersStaggeredGridLayoutManager.this.J3(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f90893T.size();
            if (size > 0) {
                for (int iD3 = StickyHeadersStaggeredGridLayoutManager.this.D3(i10); iD3 != -1 && iD3 < size; iD3++) {
                    StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD3, Integer.valueOf(((Integer) StickyHeadersStaggeredGridLayoutManager.this.f90893T.get(iD3)).intValue() + i11));
                }
            }
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                if (((com.jay.widget.a) StickyHeadersStaggeredGridLayoutManager.this.f90890Q).a(i12)) {
                    int iD32 = StickyHeadersStaggeredGridLayoutManager.this.D3(i12);
                    if (iD32 != -1) {
                        StickyHeadersStaggeredGridLayoutManager.this.f90893T.add(iD32, Integer.valueOf(i12));
                    } else {
                        StickyHeadersStaggeredGridLayoutManager.this.f90893T.add(Integer.valueOf(i12));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f90893T.size();
            if (size > 0) {
                if (i10 < i11) {
                    for (int iD3 = StickyHeadersStaggeredGridLayoutManager.this.D3(i10); iD3 != -1 && iD3 < size; iD3++) {
                        int iIntValue = ((Integer) StickyHeadersStaggeredGridLayoutManager.this.f90893T.get(iD3)).intValue();
                        if (iIntValue >= i10 && iIntValue < i10 + i12) {
                            StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD3, Integer.valueOf(iIntValue - (i11 - i10)));
                            h(iD3);
                        } else {
                            if (iIntValue < i10 + i12 || iIntValue > i11) {
                                return;
                            }
                            StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD3, Integer.valueOf(iIntValue - i12));
                            h(iD3);
                        }
                    }
                    return;
                }
                for (int iD32 = StickyHeadersStaggeredGridLayoutManager.this.D3(i11); iD32 != -1 && iD32 < size; iD32++) {
                    int iIntValue2 = ((Integer) StickyHeadersStaggeredGridLayoutManager.this.f90893T.get(iD32)).intValue();
                    if (iIntValue2 >= i10 && iIntValue2 < i10 + i12) {
                        StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD32, Integer.valueOf(iIntValue2 + (i11 - i10)));
                        h(iD32);
                    } else {
                        if (iIntValue2 < i11 || iIntValue2 > i10) {
                            return;
                        }
                        StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD32, Integer.valueOf(iIntValue2 + i12));
                        h(iD32);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            int size = StickyHeadersStaggeredGridLayoutManager.this.f90893T.size();
            if (size > 0) {
                int i12 = i10 + i11;
                for (int i13 = i12 - 1; i13 >= i10; i13--) {
                    int iB3 = StickyHeadersStaggeredGridLayoutManager.this.B3(i13);
                    if (iB3 != -1) {
                        StickyHeadersStaggeredGridLayoutManager.this.f90893T.remove(iB3);
                        size--;
                    }
                }
                if (StickyHeadersStaggeredGridLayoutManager.this.f90895V != null && !StickyHeadersStaggeredGridLayoutManager.this.f90893T.contains(Integer.valueOf(StickyHeadersStaggeredGridLayoutManager.this.f90896W))) {
                    StickyHeadersStaggeredGridLayoutManager.this.J3(null);
                }
                for (int iD3 = StickyHeadersStaggeredGridLayoutManager.this.D3(i12); iD3 != -1 && iD3 < size; iD3++) {
                    StickyHeadersStaggeredGridLayoutManager.this.f90893T.set(iD3, Integer.valueOf(((Integer) StickyHeadersStaggeredGridLayoutManager.this.f90893T.get(iD3)).intValue() - i11));
                }
            }
        }
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private Parcelable f90902a;

        /* renamed from: b, reason: collision with root package name */
        private int f90903b;

        /* renamed from: c, reason: collision with root package name */
        private int f90904c;

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
            this.f90902a = parcel.readParcelable(c.class.getClassLoader());
            this.f90903b = parcel.readInt();
            this.f90904c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f90902a, i10);
            parcel.writeInt(this.f90903b);
            parcel.writeInt(this.f90904c);
        }
    }

    private void I3(View view) {
        Q0(view, 0, 0);
        if (I2() == 1) {
            view.layout(getPaddingLeft(), 0, C0() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), o0() - getPaddingBottom());
        }
    }

    private void K3(int i10, int i11, boolean z10) {
        M3(-1, Integer.MIN_VALUE);
        if (!z10) {
            super.a3(i10, i11);
            return;
        }
        int iC3 = C3(i10);
        if (iC3 == -1 || B3(i10) != -1) {
            super.a3(i10, i11);
            return;
        }
        int i12 = i10 - 1;
        if (B3(i12) != -1) {
            super.a3(i12, i11);
            return;
        }
        if (this.f90895V == null || iC3 != B3(this.f90896W)) {
            M3(i10, i11);
            super.a3(i10, i11);
        } else {
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            super.a3(i10, i11 + this.f90895V.getHeight());
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void a3(int i10, int i11) {
        K3(i10, i11, true);
    }

    private void A3() {
        View view = this.f90895V;
        if (view != null) {
            O(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B3(int i10) {
        int size = this.f90893T.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f90893T.get(i12).intValue() > i10) {
                size = i12 - 1;
            } else {
                if (this.f90893T.get(i12).intValue() >= i10) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private int C3(int i10) {
        int size = this.f90893T.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f90893T.get(i12).intValue() <= i10) {
                if (i12 < this.f90893T.size() - 1) {
                    int i13 = i12 + 1;
                    if (this.f90893T.get(i13).intValue() <= i10) {
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
    public int D3(int i10) {
        int size = this.f90893T.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (this.f90893T.get(i13).intValue() >= i10) {
                    size = i13;
                }
            }
            if (this.f90893T.get(i12).intValue() >= i10) {
                return i12;
            }
            i11 = i12 + 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(RecyclerView.w wVar) {
        View view = this.f90895V;
        this.f90895V = null;
        this.f90896W = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        T t10 = this.f90890Q;
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
    private void L3(RecyclerView.h hVar) {
        T t10 = this.f90890Q;
        if (t10 != null) {
            t10.unregisterAdapterDataObserver(this.f90894U);
        }
        if (!(hVar instanceof com.jay.widget.a)) {
            this.f90890Q = null;
            this.f90893T.clear();
        } else {
            this.f90890Q = hVar;
            hVar.registerAdapterDataObserver(this.f90894U);
            this.f90894U.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(int i10, int i11) {
        this.f90897X = i10;
        this.f90898Y = i11;
    }

    private void N3(RecyclerView.w wVar, boolean z10) {
        View view;
        View viewA0;
        int iA;
        View viewA02;
        int size = this.f90893T.size();
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
                    if (H3(viewA0, qVar)) {
                        iA = qVar.a();
                        break;
                    }
                    i10++;
                }
            }
            if (viewA0 != null && iA != -1) {
                int iC3 = C3(iA);
                int iIntValue = iC3 != -1 ? this.f90893T.get(iC3).intValue() : -1;
                int i11 = iC3 + 1;
                int iIntValue2 = size > i11 ? this.f90893T.get(i11).intValue() : -1;
                if (iIntValue != -1 && ((iIntValue != iA || G3(viewA0)) && iIntValue2 != iIntValue + 1)) {
                    View view2 = this.f90895V;
                    if (view2 != null && q0(view2) != this.f90890Q.getItemViewType(iIntValue)) {
                        J3(wVar);
                    }
                    if (this.f90895V == null) {
                        z3(wVar, iIntValue);
                    }
                    if (z10 || v0(this.f90895V) != iIntValue) {
                        y3(wVar, iIntValue);
                    }
                    if (iIntValue2 != -1 && (viewA02 = a0(i10 + (iIntValue2 - iA))) != this.f90895V) {
                        view = viewA02;
                    }
                    View view3 = this.f90895V;
                    view3.setTranslationX(E3(view3, view));
                    View view4 = this.f90895V;
                    view4.setTranslationY(F3(view4, view));
                    return;
                }
            }
        }
        if (this.f90895V != null) {
            J3(wVar);
        }
    }

    private void x3() {
        View view = this.f90895V;
        if (view != null) {
            x(view);
        }
    }

    private void y3(RecyclerView.w wVar, int i10) {
        wVar.c(this.f90895V, i10);
        this.f90896W = i10;
        I3(this.f90895V);
        if (this.f90897X != -1) {
            ViewTreeObserver viewTreeObserver = this.f90895V.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new a(viewTreeObserver));
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        a3(i10, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            this.f90897X = cVar.f90903b;
            this.f90898Y = cVar.f90904c;
            parcelable = cVar.f90902a;
        }
        super.s1(parcelable);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable t1() {
        c cVar = new c();
        cVar.f90902a = super.t1();
        cVar.f90903b = this.f90897X;
        cVar.f90904c = this.f90898Y;
        return cVar;
    }

    public StickyHeadersStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f90893T = new ArrayList(0);
        this.f90894U = new b();
        this.f90896W = -1;
        this.f90897X = -1;
        this.f90898Y = 0;
    }

    private float E3(View view, View view2) {
        if (I2() != 1) {
            float fC0 = this.f90891R;
            if (J2()) {
                fC0 += C0() - view.getWidth();
            }
            if (view2 != null) {
                if (J2()) {
                    return Math.max(view2.getRight(), fC0);
                }
                return Math.min(view2.getLeft() - view.getWidth(), fC0);
            }
            return fC0;
        }
        return this.f90891R;
    }

    private float F3(View view, View view2) {
        if (I2() == 1) {
            float fO0 = this.f90892S;
            if (J2()) {
                fO0 += o0() - view.getHeight();
            }
            if (view2 != null) {
                if (J2()) {
                    return Math.max(view2.getBottom(), fO0);
                }
                return Math.min(view2.getTop() - view.getHeight(), fO0);
            }
            return fO0;
        }
        return this.f90892S;
    }

    private boolean G3(View view) {
        if (I2() == 1) {
            if (J2()) {
                if (view.getBottom() - view.getTranslationY() <= o0() + this.f90892S) {
                    return false;
                }
                return true;
            }
            if (view.getTop() + view.getTranslationY() >= this.f90892S) {
                return false;
            }
            return true;
        }
        if (J2()) {
            if (view.getRight() - view.getTranslationX() <= C0() + this.f90891R) {
                return false;
            }
            return true;
        }
        if (view.getLeft() + view.getTranslationX() >= this.f90891R) {
            return false;
        }
        return true;
    }

    private boolean H3(View view, RecyclerView.q qVar) {
        if (!qVar.d() && !qVar.e()) {
            if (I2() == 1) {
                if (J2()) {
                    if (view.getTop() + view.getTranslationY() > o0() + this.f90892S) {
                        return false;
                    }
                    return true;
                }
                if (view.getBottom() - view.getTranslationY() < this.f90892S) {
                    return false;
                }
                return true;
            }
            if (J2()) {
                if (view.getLeft() + view.getTranslationX() > C0() + this.f90891R) {
                    return false;
                }
                return true;
            }
            if (view.getRight() - view.getTranslationX() >= this.f90891R) {
                return true;
            }
        }
        return false;
    }

    private void z3(RecyclerView.w wVar, int i10) {
        View viewP = wVar.p(i10);
        T t10 = this.f90890Q;
        if (t10 instanceof a.InterfaceC1299a) {
            ((a.InterfaceC1299a) t10).a(viewP);
        }
        t(viewP);
        I3(viewP);
        F0(viewP);
        this.f90895V = viewP;
        this.f90896W = i10;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        A3();
        int iH = super.H(b10);
        x3();
        return iH;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        A3();
        int I10 = super.I(b10);
        x3();
        return I10;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        A3();
        int iJ = super.J(b10);
        x3();
        return iJ;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        A3();
        int iK = super.K(b10);
        x3();
        return iK;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        A3();
        int iL = super.L(b10);
        x3();
        return iL;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        A3();
        int iM = super.M(b10);
        x3();
        return iM;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        A3();
        int iN1 = super.N1(i10, wVar, b10);
        x3();
        if (iN1 != 0) {
            N3(wVar, false);
        }
        return iN1;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        A3();
        int iP1 = super.P1(i10, wVar, b10);
        x3();
        if (iP1 != 0) {
            N3(wVar, false);
        }
        return iP1;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        super.U0(hVar, hVar2);
        L3(hVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        L3(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        A3();
        View viewZ0 = super.Z0(view, i10, wVar, b10);
        x3();
        return viewZ0;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        A3();
        PointF pointFE = super.e(i10);
        x3();
        return pointFE;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        A3();
        super.n1(wVar, b10);
        x3();
        if (!b10.e()) {
            N3(wVar, true);
        }
    }
}
