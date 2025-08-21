package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class w {
    static int a(RecyclerView.B b10, t tVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.b0() != 0 && b10.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(pVar.v0(view) - pVar.v0(view2)) + 1;
            }
            return Math.min(tVar.n(), tVar.d(view2) - tVar.g(view));
        }
        return 0;
    }

    static int b(RecyclerView.B b10, t tVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int iMax;
        if (pVar.b0() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(pVar.v0(view), pVar.v0(view2));
        int iMax2 = Math.max(pVar.v0(view), pVar.v0(view2));
        if (z11) {
            iMax = Math.max(0, (b10.b() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z10) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.v0(view) - pVar.v0(view2)) + 1))) + (tVar.m() - tVar.g(view)));
    }

    static int c(RecyclerView.B b10, t tVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.b0() != 0 && b10.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return b10.b();
            }
            return (int) (((tVar.d(view2) - tVar.g(view)) / (Math.abs(pVar.v0(view) - pVar.v0(view2)) + 1)) * b10.b());
        }
        return 0;
    }
}
