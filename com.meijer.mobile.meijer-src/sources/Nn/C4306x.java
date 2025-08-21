package Nn;

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

/* renamed from: Nn.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4306x extends AbstractC4302w {

    /* renamed from: P, reason: collision with root package name */
    private static final p.i f22408P;

    /* renamed from: Q, reason: collision with root package name */
    private static final SparseIntArray f22409Q;

    /* renamed from: M, reason: collision with root package name */
    private final ConstraintLayout f22410M;

    /* renamed from: N, reason: collision with root package name */
    private final ConstraintLayout f22411N;

    /* renamed from: O, reason: collision with root package name */
    private long f22412O;

    public C4306x(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 15, f22408P, f22409Q));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22412O = 0L;
        }
        androidx.databinding.p.Z(this.f22385D);
        androidx.databinding.p.Z(this.f22389H);
        androidx.databinding.p.Z(this.f22382A);
        androidx.databinding.p.Z(this.f22388G);
        androidx.databinding.p.Z(this.f22391J);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22412O != 0) {
                    return true;
                }
                return this.f22385D.h0() || this.f22389H.h0() || this.f22382A.h0() || this.f22388G.h0() || this.f22391J.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22412O = 32L;
        }
        this.f22385D.l0();
        this.f22389H.l0();
        this.f22382A.l0();
        this.f22388G.l0();
        this.f22391J.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(15);
        f22408P = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{3}, new int[]{com.meijer.mobile.meijer.V.f100272r1});
        iVar.a(1, new String[]{"fulfillment_slots_header_item", "fulfillment_slots_early_delivery_item", "time_slots_read_only_section"}, new int[]{4, 6, 7}, new int[]{com.meijer.mobile.meijer.V.f100283v0, com.meijer.mobile.meijer.V.f100280u0, com.meijer.mobile.meijer.V.f100216Y0});
        iVar.a(2, new String[]{"current_selection"}, new int[]{5}, new int[]{com.meijer.mobile.meijer.V.f100220a0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22409Q = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99759N8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99739L8, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99769O8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100084s5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 14);
    }

    private C4306x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 5, (AppBarLayout) objArr[8], (Z0) objArr[5], (LinearLayout) objArr[2], (MaterialButton) objArr[13], (v3) objArr[3], (ProgressView) objArr[14], (RecyclerView) objArr[11], (L1) objArr[6], (N1) objArr[4], (StickyNestedScrollView) objArr[10], (J2) objArr[7], (RecyclerView) objArr[12], (MaterialToolbar) objArr[9]);
        this.f22412O = -1L;
        A0(this.f22382A);
        this.f22383B.setTag("sticky-nonconstant");
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22410M = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.f22411N = constraintLayout2;
        constraintLayout2.setTag(null);
        A0(this.f22385D);
        A0(this.f22388G);
        A0(this.f22389H);
        A0(this.f22391J);
        B0(view);
        l0();
    }

    private boolean O0(Z0 z02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22412O |= 4;
        }
        return true;
    }

    private boolean R0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22412O |= 16;
        }
        return true;
    }

    private boolean U0(L1 l12, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22412O |= 8;
        }
        return true;
    }

    private boolean V0(N1 n12, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22412O |= 1;
        }
        return true;
    }

    private boolean X0(J2 j22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22412O |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return V0((N1) obj, i11);
        }
        if (i10 == 1) {
            return X0((J2) obj, i11);
        }
        if (i10 == 2) {
            return O0((Z0) obj, i11);
        }
        if (i10 == 3) {
            return U0((L1) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return R0((v3) obj, i11);
    }
}
