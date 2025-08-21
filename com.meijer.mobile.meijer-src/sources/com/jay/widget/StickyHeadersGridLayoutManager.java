package com.jay.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.jay.widget.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class StickyHeadersGridLayoutManager<T extends RecyclerView.h & com.jay.widget.a> extends GridLayoutManager {

    /* renamed from: R, reason: collision with root package name */
    private T f91699R;

    /* renamed from: S, reason: collision with root package name */
    private float f91700S;

    /* renamed from: T, reason: collision with root package name */
    private float f91701T;

    /* renamed from: U, reason: collision with root package name */
    private final List<Integer> f91702U;

    /* renamed from: V, reason: collision with root package name */
    private final RecyclerView.j f91703V;

    /* renamed from: W, reason: collision with root package name */
    private View f91704W;

    /* renamed from: X, reason: collision with root package name */
    private int f91705X;

    /* renamed from: Y, reason: collision with root package name */
    private int f91706Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f91707Z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f91708a;

        a(ViewTreeObserver viewTreeObserver) {
            this.f91708a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f91708a.removeOnGlobalLayoutListener(this);
            if (StickyHeadersGridLayoutManager.this.f91706Y != -1) {
                StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager = StickyHeadersGridLayoutManager.this;
                stickyHeadersGridLayoutManager.T2(stickyHeadersGridLayoutManager.f91706Y, StickyHeadersGridLayoutManager.this.f91707Z);
                StickyHeadersGridLayoutManager.this.Y3(-1, Integer.MIN_VALUE);
            }
        }
    }

    private class b extends RecyclerView.j {
        private b() {
        }

        private void h(int i10) {
            Integer num = (Integer) StickyHeadersGridLayoutManager.this.f91702U.remove(i10);
            int iP3 = StickyHeadersGridLayoutManager.this.P3(num.intValue());
            if (iP3 != -1) {
                StickyHeadersGridLayoutManager.this.f91702U.add(iP3, num);
            } else {
                StickyHeadersGridLayoutManager.this.f91702U.add(num);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            StickyHeadersGridLayoutManager.this.f91702U.clear();
            int itemCount = StickyHeadersGridLayoutManager.this.f91699R.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                if (((com.jay.widget.a) StickyHeadersGridLayoutManager.this.f91699R).a(i10)) {
                    StickyHeadersGridLayoutManager.this.f91702U.add(Integer.valueOf(i10));
                }
            }
            if (StickyHeadersGridLayoutManager.this.f91704W == null || StickyHeadersGridLayoutManager.this.f91702U.contains(Integer.valueOf(StickyHeadersGridLayoutManager.this.f91705X))) {
                return;
            }
            StickyHeadersGridLayoutManager.this.V3(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            int size = StickyHeadersGridLayoutManager.this.f91702U.size();
            if (size > 0) {
                for (int iP3 = StickyHeadersGridLayoutManager.this.P3(i10); iP3 != -1 && iP3 < size; iP3++) {
                    StickyHeadersGridLayoutManager.this.f91702U.set(iP3, Integer.valueOf(((Integer) StickyHeadersGridLayoutManager.this.f91702U.get(iP3)).intValue() + i11));
                }
            }
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                if (((com.jay.widget.a) StickyHeadersGridLayoutManager.this.f91699R).a(i12)) {
                    int iP32 = StickyHeadersGridLayoutManager.this.P3(i12);
                    if (iP32 != -1) {
                        StickyHeadersGridLayoutManager.this.f91702U.add(iP32, Integer.valueOf(i12));
                    } else {
                        StickyHeadersGridLayoutManager.this.f91702U.add(Integer.valueOf(i12));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            int size = StickyHeadersGridLayoutManager.this.f91702U.size();
            if (size > 0) {
                if (i10 < i11) {
                    for (int iP3 = StickyHeadersGridLayoutManager.this.P3(i10); iP3 != -1 && iP3 < size; iP3++) {
                        int iIntValue = ((Integer) StickyHeadersGridLayoutManager.this.f91702U.get(iP3)).intValue();
                        if (iIntValue >= i10 && iIntValue < i10 + i12) {
                            StickyHeadersGridLayoutManager.this.f91702U.set(iP3, Integer.valueOf(iIntValue - (i11 - i10)));
                            h(iP3);
                        } else {
                            if (iIntValue < i10 + i12 || iIntValue > i11) {
                                return;
                            }
                            StickyHeadersGridLayoutManager.this.f91702U.set(iP3, Integer.valueOf(iIntValue - i12));
                            h(iP3);
                        }
                    }
                    return;
                }
                for (int iP32 = StickyHeadersGridLayoutManager.this.P3(i11); iP32 != -1 && iP32 < size; iP32++) {
                    int iIntValue2 = ((Integer) StickyHeadersGridLayoutManager.this.f91702U.get(iP32)).intValue();
                    if (iIntValue2 >= i10 && iIntValue2 < i10 + i12) {
                        StickyHeadersGridLayoutManager.this.f91702U.set(iP32, Integer.valueOf(iIntValue2 + (i11 - i10)));
                        h(iP32);
                    } else {
                        if (iIntValue2 < i11 || iIntValue2 > i10) {
                            return;
                        }
                        StickyHeadersGridLayoutManager.this.f91702U.set(iP32, Integer.valueOf(iIntValue2 + i12));
                        h(iP32);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            int size = StickyHeadersGridLayoutManager.this.f91702U.size();
            if (size > 0) {
                int i12 = i10 + i11;
                for (int i13 = i12 - 1; i13 >= i10; i13--) {
                    int iN3 = StickyHeadersGridLayoutManager.this.N3(i13);
                    if (iN3 != -1) {
                        StickyHeadersGridLayoutManager.this.f91702U.remove(iN3);
                        size--;
                    }
                }
                if (StickyHeadersGridLayoutManager.this.f91704W != null && !StickyHeadersGridLayoutManager.this.f91702U.contains(Integer.valueOf(StickyHeadersGridLayoutManager.this.f91705X))) {
                    StickyHeadersGridLayoutManager.this.V3(null);
                }
                for (int iP3 = StickyHeadersGridLayoutManager.this.P3(i12); iP3 != -1 && iP3 < size; iP3++) {
                    StickyHeadersGridLayoutManager.this.f91702U.set(iP3, Integer.valueOf(((Integer) StickyHeadersGridLayoutManager.this.f91702U.get(iP3)).intValue() - i11));
                }
            }
        }
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private Parcelable f91711a;

        /* renamed from: b, reason: collision with root package name */
        private int f91712b;

        /* renamed from: c, reason: collision with root package name */
        private int f91713c;

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
            this.f91711a = parcel.readParcelable(c.class.getClassLoader());
            this.f91712b = parcel.readInt();
            this.f91713c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f91711a, i10);
            parcel.writeInt(this.f91712b);
            parcel.writeInt(this.f91713c);
        }
    }

    private void U3(View view) {
        Q0(view, 0, 0);
        if (F2() == 1) {
            view.layout(getPaddingLeft(), 0, C0() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), o0() - getPaddingBottom());
        }
    }

    private void W3(int i10, int i11, boolean z10) {
        Y3(-1, Integer.MIN_VALUE);
        if (!z10) {
            super.T2(i10, i11);
            return;
        }
        int iO3 = O3(i10);
        if (iO3 == -1 || N3(i10) != -1) {
            super.T2(i10, i11);
            return;
        }
        int i12 = i10 - 1;
        if (N3(i12) != -1) {
            super.T2(i12, i11);
            return;
        }
        if (this.f91704W == null || iO3 != N3(this.f91705X)) {
            Y3(i10, i11);
            super.T2(i10, i11);
        } else {
            if (i11 == Integer.MIN_VALUE) {
                i11 = 0;
            }
            super.T2(i10, i11 + this.f91704W.getHeight());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void T2(int i10, int i11) {
        W3(i10, i11, true);
    }

    private void J3() {
        View view = this.f91704W;
        if (view != null) {
            x(view);
        }
    }

    private void K3(RecyclerView.w wVar, int i10) {
        wVar.c(this.f91704W, i10);
        this.f91705X = i10;
        U3(this.f91704W);
        if (this.f91706Y != -1) {
            ViewTreeObserver viewTreeObserver = this.f91704W.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new a(viewTreeObserver));
        }
    }

    private void M3() {
        View view = this.f91704W;
        if (view != null) {
            O(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N3(int i10) {
        int size = this.f91702U.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f91702U.get(i12).intValue() > i10) {
                size = i12 - 1;
            } else {
                if (this.f91702U.get(i12).intValue() >= i10) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private int O3(int i10) {
        int size = this.f91702U.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (this.f91702U.get(i12).intValue() <= i10) {
                if (i12 < this.f91702U.size() - 1) {
                    int i13 = i12 + 1;
                    if (this.f91702U.get(i13).intValue() <= i10) {
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
    public int P3(int i10) {
        int size = this.f91702U.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (this.f91702U.get(i13).intValue() >= i10) {
                    size = i13;
                }
            }
            if (this.f91702U.get(i12).intValue() >= i10) {
                return i12;
            }
            i11 = i12 + 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(RecyclerView.w wVar) {
        View view = this.f91704W;
        this.f91704W = null;
        this.f91705X = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        T t10 = this.f91699R;
        if (t10 instanceof a.InterfaceC1308a) {
            ((a.InterfaceC1308a) t10).b(view);
        }
        b2(view);
        G1(view);
        if (wVar != null) {
            wVar.H(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X3(RecyclerView.h hVar) {
        T t10 = this.f91699R;
        if (t10 != null) {
            t10.unregisterAdapterDataObserver(this.f91703V);
        }
        if (!(hVar instanceof com.jay.widget.a)) {
            this.f91699R = null;
            this.f91702U.clear();
        } else {
            this.f91699R = hVar;
            hVar.registerAdapterDataObserver(this.f91703V);
            this.f91703V.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i10, int i11) {
        this.f91706Y = i10;
        this.f91707Z = i11;
    }

    private void Z3(RecyclerView.w wVar, boolean z10) {
        View view;
        View viewA0;
        int iA;
        View viewA02;
        int size = this.f91702U.size();
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
                    if (T3(viewA0, qVar)) {
                        iA = qVar.a();
                        break;
                    }
                    i10++;
                }
            }
            if (viewA0 != null && iA != -1) {
                int iO3 = O3(iA);
                int iIntValue = iO3 != -1 ? this.f91702U.get(iO3).intValue() : -1;
                int i11 = iO3 + 1;
                int iIntValue2 = size > i11 ? this.f91702U.get(i11).intValue() : -1;
                if (iIntValue != -1 && ((iIntValue != iA || S3(viewA0)) && iIntValue2 != iIntValue + 1)) {
                    View view2 = this.f91704W;
                    if (view2 != null && q0(view2) != this.f91699R.getItemViewType(iIntValue)) {
                        V3(wVar);
                    }
                    if (this.f91704W == null) {
                        L3(wVar, iIntValue);
                    }
                    if (z10 || v0(this.f91704W) != iIntValue) {
                        K3(wVar, iIntValue);
                    }
                    if (iIntValue2 != -1 && (viewA02 = a0(i10 + (iIntValue2 - iA))) != this.f91704W) {
                        view = viewA02;
                    }
                    View view3 = this.f91704W;
                    view3.setTranslationX(Q3(view3, view));
                    View view4 = this.f91704W;
                    view4.setTranslationY(R3(view4, view));
                    return;
                }
            }
        }
        if (this.f91704W != null) {
            V3(wVar);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        T2(i10, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            this.f91706Y = cVar.f91712b;
            this.f91707Z = cVar.f91713c;
            parcelable = cVar.f91711a;
        }
        super.s1(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public Parcelable t1() {
        c cVar = new c();
        cVar.f91711a = super.t1();
        cVar.f91712b = this.f91706Y;
        cVar.f91713c = this.f91707Z;
        return cVar;
    }

    public StickyHeadersGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f91702U = new ArrayList(0);
        this.f91703V = new b();
        this.f91705X = -1;
        this.f91706Y = -1;
        this.f91707Z = 0;
    }

    private void L3(RecyclerView.w wVar, int i10) {
        View viewP = wVar.p(i10);
        T t10 = this.f91699R;
        if (t10 instanceof a.InterfaceC1308a) {
            ((a.InterfaceC1308a) t10).a(viewP);
        }
        t(viewP);
        U3(viewP);
        F0(viewP);
        this.f91704W = viewP;
        this.f91705X = i10;
    }

    private float Q3(View view, View view2) {
        if (F2() != 1) {
            float fC0 = this.f91700S;
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
        return this.f91700S;
    }

    private float R3(View view, View view2) {
        if (F2() == 1) {
            float fO0 = this.f91701T;
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
        return this.f91701T;
    }

    private boolean S3(View view) {
        if (F2() == 1) {
            if (G2()) {
                if (view.getBottom() - view.getTranslationY() <= o0() + this.f91701T) {
                    return false;
                }
                return true;
            }
            if (view.getTop() + view.getTranslationY() >= this.f91701T) {
                return false;
            }
            return true;
        }
        if (G2()) {
            if (view.getRight() - view.getTranslationX() <= C0() + this.f91700S) {
                return false;
            }
            return true;
        }
        if (view.getLeft() + view.getTranslationX() >= this.f91700S) {
            return false;
        }
        return true;
    }

    private boolean T3(View view, RecyclerView.q qVar) {
        if (!qVar.d() && !qVar.e()) {
            if (F2() == 1) {
                if (G2()) {
                    if (view.getTop() + view.getTranslationY() > o0() + this.f91701T) {
                        return false;
                    }
                    return true;
                }
                if (view.getBottom() - view.getTranslationY() < this.f91701T) {
                    return false;
                }
                return true;
            }
            if (G2()) {
                if (view.getLeft() + view.getTranslationX() > C0() + this.f91700S) {
                    return false;
                }
                return true;
            }
            if (view.getRight() - view.getTranslationX() >= this.f91700S) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        M3();
        int iH = super.H(b10);
        J3();
        return iH;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        M3();
        int I10 = super.I(b10);
        J3();
        return I10;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        M3();
        int iJ = super.J(b10);
        J3();
        return iJ;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        M3();
        int iK = super.K(b10);
        J3();
        return iK;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        M3();
        int iL = super.L(b10);
        J3();
        return iL;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        M3();
        int iM = super.M(b10);
        J3();
        return iM;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        M3();
        int iN1 = super.N1(i10, wVar, b10);
        J3();
        if (iN1 != 0) {
            Z3(wVar, false);
        }
        return iN1;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        M3();
        int iP1 = super.P1(i10, wVar, b10);
        J3();
        if (iP1 != 0) {
            Z3(wVar, false);
        }
        return iP1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        super.U0(hVar, hVar2);
        X3(hVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        super.W0(recyclerView);
        X3(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        M3();
        View viewZ0 = super.Z0(view, i10, wVar, b10);
        J3();
        return viewZ0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        M3();
        PointF pointFE = super.e(i10);
        J3();
        return pointFE;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        M3();
        try {
            super.n1(wVar, b10);
        } catch (IndexOutOfBoundsException e10) {
            qw.a.e(e10, "meet a IOOBE in RecyclerView", new Object[0]);
        }
        J3();
        if (!b10.e()) {
            Z3(wVar, true);
        }
    }
}
