package Nn;

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

/* renamed from: Nn.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4256k0 extends AbstractC4252j0 {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f22087R;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f22088S;

    /* renamed from: P, reason: collision with root package name */
    private final CoordinatorLayout f22089P;

    /* renamed from: Q, reason: collision with root package name */
    private long f22090Q;

    public C4256k0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 17, f22087R, f22088S));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22090Q = 0L;
        }
        androidx.databinding.p.Z(this.f22035E);
        androidx.databinding.p.Z(this.f22043M);
        androidx.databinding.p.Z(this.f22041K);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22090Q != 0) {
                    return true;
                }
                return this.f22035E.h0() || this.f22043M.h0() || this.f22041K.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22090Q = 8L;
        }
        this.f22035E.l0();
        this.f22043M.l0();
        this.f22041K.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(17);
        f22087R = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f100272r1});
        iVar.a(1, new String[]{"store_search_layout", "store_list_footer_layout"}, new int[]{3, 4}, new int[]{com.meijer.mobile.meijer.V.f100214X0, com.meijer.mobile.meijer.V.f100212W0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22088S = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99858X7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99986j6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99942f6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99868Y7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100004l2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99993k2, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99982j2, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99944f8, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99763O2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100066q9, 16);
    }

    private C4256k0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 3, (TextView) objArr[13], (TextView) objArr[12], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[15], (ContentLoadingProgressBar) objArr[9], (v3) objArr[2], (ConstraintLayout) objArr[8], (ProgressView) objArr[7], (ConstraintLayout) objArr[1], (AppBarLayout) objArr[5], (NestedScrollView) objArr[10], (F2) objArr[4], (RecyclerView) objArr[14], (H2) objArr[3], (MaterialToolbar) objArr[6], (TextView) objArr[16]);
        this.f22090Q = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f22089P = coordinatorLayout;
        coordinatorLayout.setTag(null);
        A0(this.f22035E);
        this.f22038H.setTag(null);
        A0(this.f22041K);
        A0(this.f22043M);
        B0(view);
        l0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22090Q |= 1;
        }
        return true;
    }

    private boolean R0(F2 f22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22090Q |= 2;
        }
        return true;
    }

    private boolean U0(H2 h22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22090Q |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return O0((v3) obj, i11);
        }
        if (i10 == 1) {
            return R0((F2) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return U0((H2) obj, i11);
    }
}
