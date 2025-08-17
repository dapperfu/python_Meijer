package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4251k0 extends AbstractC4247j0 {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f20755R;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f20756S;

    /* renamed from: P, reason: collision with root package name */
    private final CoordinatorLayout f20757P;

    /* renamed from: Q, reason: collision with root package name */
    private long f20758Q;

    public C4251k0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 17, f20755R, f20756S));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20758Q = 0L;
        }
        androidx.databinding.p.Y(this.f20703E);
        androidx.databinding.p.Y(this.f20711M);
        androidx.databinding.p.Y(this.f20709K);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20758Q != 0) {
                    return true;
                }
                return this.f20703E.h0() || this.f20711M.h0() || this.f20709K.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20758Q = 8L;
        }
        this.f20703E.o0();
        this.f20711M.o0();
        this.f20709K.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(17);
        f20755R = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f99416r1});
        iVar.a(1, new String[]{"store_search_layout", "store_list_footer_layout"}, new int[]{3, 4}, new int[]{com.meijer.mobile.meijer.V.f99358X0, com.meijer.mobile.meijer.V.f99356W0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20756S = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99012Y7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99141k6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99097g6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99022Z7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99148l2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99137k2, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99126j2, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99099g8, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98907O2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99221r9, 16);
    }

    private C4251k0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 3, (TextView) objArr[13], (TextView) objArr[12], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[15], (ContentLoadingProgressBar) objArr[9], (v3) objArr[2], (ConstraintLayout) objArr[8], (ProgressView) objArr[7], (ConstraintLayout) objArr[1], (AppBarLayout) objArr[5], (NestedScrollView) objArr[10], (F2) objArr[4], (RecyclerView) objArr[14], (H2) objArr[3], (MaterialToolbar) objArr[6], (TextView) objArr[16]);
        this.f20758Q = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20757P = coordinatorLayout;
        coordinatorLayout.setTag(null);
        C0(this.f20703E);
        this.f20706H.setTag(null);
        C0(this.f20709K);
        C0(this.f20711M);
        D0(view);
        o0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20758Q |= 1;
        }
        return true;
    }

    private boolean P0(F2 f22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20758Q |= 2;
        }
        return true;
    }

    private boolean Q0(H2 h22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20758Q |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return O0((v3) obj, i11);
        }
        if (i10 == 1) {
            return P0((F2) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return Q0((H2) obj, i11);
    }
}
