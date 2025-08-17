package Mn;

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

/* renamed from: Mn.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4285t extends AbstractC4281s {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f20958J;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f20959K;

    /* renamed from: G, reason: collision with root package name */
    private final ConstraintLayout f20960G;

    /* renamed from: H, reason: collision with root package name */
    private final AppBarLayout f20961H;

    /* renamed from: I, reason: collision with root package name */
    private long f20962I;

    public C4285t(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 9, f20958J, f20959K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20962I = 0L;
        }
        androidx.databinding.p.Y(this.f20942E);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20962I != 0) {
                    return true;
                }
                return this.f20942E.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20962I = 2L;
        }
        this.f20942E.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(9);
        f20958J = iVar;
        iVar.a(1, new String[]{"filtered_products_results_header"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f99391j0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20959K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98957T2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98795D2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98806E2, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 8);
    }

    private C4285t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (CoordinatorLayout) objArr[3], (RecyclerView) objArr[6], (ComposeView) objArr[7], (ComposeView) objArr[5], (ProgressView) objArr[8], (AbstractC4272p1) objArr[2], (MaterialToolbar) objArr[4]);
        this.f20962I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20960G = constraintLayout;
        constraintLayout.setTag(null);
        AppBarLayout appBarLayout = (AppBarLayout) objArr[1];
        this.f20961H = appBarLayout;
        appBarLayout.setTag(null);
        C0(this.f20942E);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4272p1 abstractC4272p1, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20962I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4272p1) obj, i11);
    }
}
