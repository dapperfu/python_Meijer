package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4290t extends AbstractC4286s {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f22290J;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f22291K;

    /* renamed from: G, reason: collision with root package name */
    private final ConstraintLayout f22292G;

    /* renamed from: H, reason: collision with root package name */
    private final AppBarLayout f22293H;

    /* renamed from: I, reason: collision with root package name */
    private long f22294I;

    public C4290t(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 9, f22290J, f22291K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22294I = 0L;
        }
        androidx.databinding.p.Z(this.f22274E);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22294I != 0) {
                    return true;
                }
                return this.f22274E.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22294I = 2L;
        }
        this.f22274E.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(9);
        f22290J = iVar;
        iVar.a(1, new String[]{"filtered_products_results_header"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f100247j0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22291K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99813T2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99652D2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99663E2, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 8);
    }

    private C4290t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CoordinatorLayout) objArr[3], (RecyclerView) objArr[6], (ComposeView) objArr[7], (ComposeView) objArr[5], (ProgressView) objArr[8], (AbstractC4277p1) objArr[2], (MaterialToolbar) objArr[4]);
        this.f22294I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22292G = constraintLayout;
        constraintLayout.setTag(null);
        AppBarLayout appBarLayout = (AppBarLayout) objArr[1];
        this.f22293H = appBarLayout;
        appBarLayout.setTag(null);
        A0(this.f22274E);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4277p1 abstractC4277p1, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22294I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4277p1) obj, i11);
    }
}
