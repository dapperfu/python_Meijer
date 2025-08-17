package Mn;

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

/* renamed from: Mn.a3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4205a3 extends Z2 {

    /* renamed from: V, reason: collision with root package name */
    private static final p.i f20471V;

    /* renamed from: W, reason: collision with root package name */
    private static final SparseIntArray f20472W;

    /* renamed from: T, reason: collision with root package name */
    private final ConstraintLayout f20473T;

    /* renamed from: U, reason: collision with root package name */
    private long f20474U;

    public C4205a3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 21, f20471V, f20472W));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20474U = 0L;
        }
        androidx.databinding.p.Y(this.f20453R);
        androidx.databinding.p.Y(this.f20442G);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20474U != 0) {
                    return true;
                }
                return this.f20453R.h0() || this.f20442G.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20474U = 4L;
        }
        this.f20453R.o0();
        this.f20442G.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(21);
        f20471V = iVar;
        int i10 = com.meijer.mobile.meijer.V.f99380f1;
        iVar.a(1, new String[]{"view_cart_item_note", "view_cart_item_note"}, new int[]{2, 3}, new int[]{i10, i10});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20472W = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98965U0, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98798D5, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98870K5, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98890M5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98920P5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98970U5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98817F2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98960T5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99239t5, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99093g2, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98985W0, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98952S7, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98786C4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99003X8, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99124j0, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98932Q7, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99159m2, 20);
    }

    private C4205a3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (Guideline) objArr[18], (MaterialCardView) objArr[0], (ComposeView) objArr[4], (FrameLayout) objArr[14], (ImageButton) objArr[13], (Guideline) objArr[20], (MaterialTextView) objArr[10], (X2) objArr[3], (Barrier) objArr[16], (MaterialButton) objArr[12], (ImageView) objArr[5], (FullWordEllipsisTextView) objArr[6], (MaterialTextView) objArr[7], (MaterialTextView) objArr[8], (MaterialTextView) objArr[11], (MaterialTextView) objArr[9], (Guideline) objArr[19], (CollapsibleStepperView) objArr[15], (X2) objArr[2], (Guideline) objArr[17]);
        this.f20474U = -1L;
        this.f20436A.setTag(null);
        C0(this.f20442G);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f20473T = constraintLayout;
        constraintLayout.setTag(null);
        C0(this.f20453R);
        D0(view);
        o0();
    }

    private boolean O0(X2 x22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20474U |= 1;
        }
        return true;
    }

    private boolean P0(X2 x22, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20474U |= 2;
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
        return P0((X2) obj, i11);
    }
}
