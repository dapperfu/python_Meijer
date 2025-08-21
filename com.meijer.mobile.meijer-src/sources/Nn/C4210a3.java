package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;

/* renamed from: Nn.a3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4210a3 extends Z2 {

    /* renamed from: V, reason: collision with root package name */
    private static final p.i f21803V;

    /* renamed from: W, reason: collision with root package name */
    private static final SparseIntArray f21804W;

    /* renamed from: T, reason: collision with root package name */
    private final ConstraintLayout f21805T;

    /* renamed from: U, reason: collision with root package name */
    private long f21806U;

    public C4210a3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 21, f21803V, f21804W));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21806U = 0L;
        }
        androidx.databinding.p.Z(this.f21785R);
        androidx.databinding.p.Z(this.f21774G);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21806U != 0) {
                    return true;
                }
                return this.f21785R.h0() || this.f21774G.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21806U = 4L;
        }
        this.f21785R.l0();
        this.f21774G.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(21);
        f21803V = iVar;
        int i10 = com.meijer.mobile.meijer.V.f100236f1;
        iVar.a(1, new String[]{"view_cart_item_note", "view_cart_item_note"}, new int[]{2, 3}, new int[]{i10, i10});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21804W = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99821U0, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99644C5, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99716J5, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99736L5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99766O5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99816T5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99673F2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99806S5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100095t5, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99949g2, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99841W0, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99798R7, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99643C4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99849W8, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99980j0, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99778P7, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100015m2, 20);
    }

    private C4210a3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (Guideline) objArr[18], (MaterialCardView) objArr[0], (ComposeView) objArr[4], (FrameLayout) objArr[14], (ImageButton) objArr[13], (Guideline) objArr[20], (MaterialTextView) objArr[10], (X2) objArr[3], (Barrier) objArr[16], (MaterialButton) objArr[12], (ImageView) objArr[5], (FullWordEllipsisTextView) objArr[6], (MaterialTextView) objArr[7], (MaterialTextView) objArr[8], (MaterialTextView) objArr[11], (MaterialTextView) objArr[9], (Guideline) objArr[19], (CollapsibleStepperView) objArr[15], (X2) objArr[2], (Guideline) objArr[17]);
        this.f21806U = -1L;
        this.f21768A.setTag(null);
        A0(this.f21774G);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f21805T = constraintLayout;
        constraintLayout.setTag(null);
        A0(this.f21785R);
        B0(view);
        l0();
    }

    private boolean O0(X2 x22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21806U |= 1;
        }
        return true;
    }

    private boolean R0(X2 x22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21806U |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return O0((X2) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return R0((X2) obj, i11);
    }
}
