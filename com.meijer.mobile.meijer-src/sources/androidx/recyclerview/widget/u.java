package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public class u extends y {

    /* renamed from: d, reason: collision with root package name */
    private t f58528d;

    /* renamed from: e, reason: collision with root package name */
    private t f58529e;

    class a extends p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.A
        protected void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            u uVar = u.this;
            int[] iArrC = uVar.c(uVar.f58535a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f58516j);
            }
        }

        @Override // androidx.recyclerview.widget.p
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.p
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.y
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.B()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.C()) {
            iArr[1] = k(view, o(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private t m(RecyclerView.p pVar) {
        t tVar = this.f58529e;
        if (tVar == null || tVar.f58525a != pVar) {
            this.f58529e = t.a(pVar);
        }
        return this.f58529e;
    }

    private t o(RecyclerView.p pVar) {
        t tVar = this.f58528d;
        if (tVar == null || tVar.f58525a != pVar) {
            this.f58528d = t.c(pVar);
        }
        return this.f58528d;
    }

    @Override // androidx.recyclerview.widget.y
    protected RecyclerView.A d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.A.b) {
            return new a(this.f58535a.getContext());
        }
        return null;
    }

    private int k(View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.m() + (tVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, t tVar) {
        int iB0 = pVar.b0();
        View view = null;
        if (iB0 == 0) {
            return null;
        }
        int iM = tVar.m() + (tVar.n() / 2);
        int i10 = a.e.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < iB0; i11++) {
            View viewA0 = pVar.a0(i11);
            int iAbs = Math.abs((tVar.g(viewA0) + (tVar.e(viewA0) / 2)) - iM);
            if (iAbs < i10) {
                view = viewA0;
                i10 = iAbs;
            }
        }
        return view;
    }

    private t n(RecyclerView.p pVar) {
        if (pVar.C()) {
            return o(pVar);
        }
        if (pVar.B()) {
            return m(pVar);
        }
        return null;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        if (pVar.B()) {
            if (i10 <= 0) {
                return false;
            }
            return true;
        }
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF pointFE;
        int iA = pVar.a();
        if (!(pVar instanceof RecyclerView.A.b) || (pointFE = ((RecyclerView.A.b) pVar).e(iA - 1)) == null) {
            return false;
        }
        if (pointFE.x >= 0.0f && pointFE.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public View f(RecyclerView.p pVar) {
        if (pVar.C()) {
            return l(pVar, o(pVar));
        }
        if (pVar.B()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public int g(RecyclerView.p pVar, int i10, int i11) {
        t tVarN;
        int i12;
        int iA = pVar.a();
        if (iA == 0 || (tVarN = n(pVar)) == null) {
            return -1;
        }
        int iB0 = pVar.b0();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < iB0; i15++) {
            View viewA0 = pVar.a0(i15);
            if (viewA0 != null) {
                int iK = k(viewA0, tVarN);
                if (iK <= 0 && iK > i14) {
                    view2 = viewA0;
                    i14 = iK;
                }
                if (iK >= 0 && iK < i13) {
                    view = viewA0;
                    i13 = iK;
                }
            }
        }
        boolean zP = p(pVar, i10, i11);
        if (zP && view != null) {
            return pVar.v0(view);
        }
        if (!zP && view2 != null) {
            return pVar.v0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iV0 = pVar.v0(view);
        if (q(pVar) == zP) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i16 = iV0 + i12;
        if (i16 < 0 || i16 >= iA) {
            return -1;
        }
        return i16;
    }
}
