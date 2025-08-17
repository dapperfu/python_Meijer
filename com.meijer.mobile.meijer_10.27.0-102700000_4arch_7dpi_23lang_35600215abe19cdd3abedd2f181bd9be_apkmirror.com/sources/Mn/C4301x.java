package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.StickyNestedScrollView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4301x extends AbstractC4297w {

    /* renamed from: P, reason: collision with root package name */
    private static final p.i f21076P;

    /* renamed from: Q, reason: collision with root package name */
    private static final SparseIntArray f21077Q;

    /* renamed from: M, reason: collision with root package name */
    private final ConstraintLayout f21078M;

    /* renamed from: N, reason: collision with root package name */
    private final ConstraintLayout f21079N;

    /* renamed from: O, reason: collision with root package name */
    private long f21080O;

    public C4301x(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 15, f21076P, f21077Q));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21080O = 0L;
        }
        androidx.databinding.p.Y(this.f21053D);
        androidx.databinding.p.Y(this.f21057H);
        androidx.databinding.p.Y(this.f21050A);
        androidx.databinding.p.Y(this.f21056G);
        androidx.databinding.p.Y(this.f21059J);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21080O != 0) {
                    return true;
                }
                return this.f21053D.h0() || this.f21057H.h0() || this.f21050A.h0() || this.f21056G.h0() || this.f21059J.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21080O = 32L;
        }
        this.f21053D.o0();
        this.f21057H.o0();
        this.f21050A.o0();
        this.f21056G.o0();
        this.f21059J.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(15);
        f21076P = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{3}, new int[]{com.meijer.mobile.meijer.V.f99416r1});
        iVar.a(1, new String[]{"fulfillment_slots_header_item", "fulfillment_slots_early_delivery_item", "time_slots_read_only_section"}, new int[]{4, 6, 7}, new int[]{com.meijer.mobile.meijer.V.f99427v0, com.meijer.mobile.meijer.V.f99424u0, com.meijer.mobile.meijer.V.f99360Y0});
        iVar.a(2, new String[]{"current_selection"}, new int[]{5}, new int[]{com.meijer.mobile.meijer.V.f99364a0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21077Q = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98913O8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98893M8, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98923P8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99228s5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 14);
    }

    private C4301x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 5, (AppBarLayout) objArr[8], (Z0) objArr[5], (LinearLayout) objArr[2], (MaterialButton) objArr[13], (v3) objArr[3], (ProgressView) objArr[14], (RecyclerView) objArr[11], (L1) objArr[6], (N1) objArr[4], (StickyNestedScrollView) objArr[10], (J2) objArr[7], (RecyclerView) objArr[12], (MaterialToolbar) objArr[9]);
        this.f21080O = -1L;
        C0(this.f21050A);
        this.f21051B.setTag("sticky-nonconstant");
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21078M = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.f21079N = constraintLayout2;
        constraintLayout2.setTag(null);
        C0(this.f21053D);
        C0(this.f21056G);
        C0(this.f21057H);
        C0(this.f21059J);
        D0(view);
        o0();
    }

    private boolean O0(Z0 z02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21080O |= 4;
        }
        return true;
    }

    private boolean P0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21080O |= 16;
        }
        return true;
    }

    private boolean Q0(L1 l12, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21080O |= 8;
        }
        return true;
    }

    private boolean T0(N1 n12, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21080O |= 1;
        }
        return true;
    }

    private boolean W0(J2 j22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21080O |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return T0((N1) obj, i11);
        }
        if (i10 == 1) {
            return W0((J2) obj, i11);
        }
        if (i10 == 2) {
            return O0((Z0) obj, i11);
        }
        if (i10 == 3) {
            return Q0((L1) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return P0((v3) obj, i11);
    }
}
