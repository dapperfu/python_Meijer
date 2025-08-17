package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.StepperView;

/* loaded from: classes9.dex */
public class J extends I {

    /* renamed from: n0, reason: collision with root package name */
    private static final p.i f20131n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final SparseIntArray f20132o0;

    /* renamed from: k0, reason: collision with root package name */
    private final CoordinatorLayout f20133k0;

    /* renamed from: l0, reason: collision with root package name */
    private final ConstraintLayout f20134l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f20135m0;

    public J(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 39, f20131n0, f20132o0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20135m0;
            this.f20135m0 = 0L;
        }
        if ((j10 & 2) != 0) {
            zj.c.a(this.f20112e0, true);
        }
        androidx.databinding.p.Y(this.f20082A);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20135m0 != 0) {
                    return true;
                }
                return this.f20082A.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20135m0 = 2L;
        }
        this.f20082A.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(39);
        f20131n0 = iVar;
        iVar.a(1, new String[]{"age_restriction_warning"}, new int[]{4}, new int[]{com.meijer.mobile.meijer.V.f99327I});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20132o0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99015Z0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99169n1, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99194p4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99294y5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99250u5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98787C5, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98818F3, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98807E3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98796D3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98886M1, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98890M5, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99004Y, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99173n5, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99306z6, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98791C9, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98817F2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98864K, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98941R6, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99103h1, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98978V3, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99283x5, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99305z5, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99272w5, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98820F5, 28);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98809E5, 29);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98880L5, 30);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98819F4, 31);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98776B5, 32);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98765A5, 33);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98947S2, 34);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99061d3, 35);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99014Z, 36);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98942R7, 37);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99090g, 38);
    }

    private J(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (Barrier) objArr[38], (AbstractC4271p0) objArr[4], (TextView) objArr[21], (ComposeView) objArr[16], (ComposeView) objArr[36], (View) objArr[3], (TextView) objArr[23], (ConstraintLayout) objArr[6], (ComposeView) objArr[14], (TextView) objArr[20], (ComposeView) objArr[34], (ComposeView) objArr[35], (TabLayout) objArr[13], (ViewPager) objArr[12], (Barrier) objArr[11], (ComposeView) objArr[24], (NestedScrollView) objArr[7], (ComposeView) objArr[31], (TextView) objArr[17], (CheckableImageButton) objArr[9], (TextView) objArr[27], (FrameLayout) objArr[25], (MaterialCardView) objArr[8], (ExpandableCardView) objArr[26], (TextView) objArr[33], (ExpandableCardView) objArr[32], (CheckableImageButton) objArr[10], (TextView) objArr[29], (ExpandableCardView) objArr[28], (ExpandableCardView) objArr[30], (TextView) objArr[15], (TextView) objArr[2], (TextView) objArr[18], (TextView) objArr[22], (StepperView) objArr[37], (MaterialToolbar) objArr[5], (TextView) objArr[19]);
        this.f20135m0 = -1L;
        C0(this.f20082A);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20133k0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f20134l0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f20112e0.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4271p0 abstractC4271p0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20135m0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4271p0) obj, i11);
    }
}
