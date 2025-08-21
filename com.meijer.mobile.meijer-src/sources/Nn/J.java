package Nn;

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

/* loaded from: classes10.dex */
public class J extends I {

    /* renamed from: n0, reason: collision with root package name */
    private static final p.i f21463n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final SparseIntArray f21464o0;

    /* renamed from: k0, reason: collision with root package name */
    private final CoordinatorLayout f21465k0;

    /* renamed from: l0, reason: collision with root package name */
    private final ConstraintLayout f21466l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f21467m0;

    public J(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 39, f21463n0, f21464o0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21467m0;
            this.f21467m0 = 0L;
        }
        if ((j10 & 2) != 0) {
            Aj.c.a(this.f21444e0, true);
        }
        androidx.databinding.p.Z(this.f21414A);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21467m0 != 0) {
                    return true;
                }
                return this.f21414A.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21467m0 = 2L;
        }
        this.f21414A.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(39);
        f21463n0 = iVar;
        iVar.a(1, new String[]{"age_restriction_warning"}, new int[]{4}, new int[]{com.meijer.mobile.meijer.V.f100183I});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21464o0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99871Z0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100025n1, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100050p4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100139x5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100106u5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99633B5, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99674F3, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99664E3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99653D3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99742M1, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99736L5, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99860Y, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100029n5, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100151y6, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99637B9, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99673F2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99720K, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99787Q6, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99959h1, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99834V3, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100128w5, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100150y5, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100117v5, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99666E5, 28);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99655D5, 29);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99726K5, 30);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99675F4, 31);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99622A5, 32);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100161z5, 33);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99803S2, 34);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99917d3, 35);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99870Z, 36);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99788Q7, 37);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99946g, 38);
    }

    private J(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (Barrier) objArr[38], (AbstractC4276p0) objArr[4], (TextView) objArr[21], (ComposeView) objArr[16], (ComposeView) objArr[36], (View) objArr[3], (TextView) objArr[23], (ConstraintLayout) objArr[6], (ComposeView) objArr[14], (TextView) objArr[20], (ComposeView) objArr[34], (ComposeView) objArr[35], (TabLayout) objArr[13], (ViewPager) objArr[12], (Barrier) objArr[11], (ComposeView) objArr[24], (NestedScrollView) objArr[7], (ComposeView) objArr[31], (TextView) objArr[17], (CheckableImageButton) objArr[9], (TextView) objArr[27], (FrameLayout) objArr[25], (MaterialCardView) objArr[8], (ExpandableCardView) objArr[26], (TextView) objArr[33], (ExpandableCardView) objArr[32], (CheckableImageButton) objArr[10], (TextView) objArr[29], (ExpandableCardView) objArr[28], (ExpandableCardView) objArr[30], (TextView) objArr[15], (TextView) objArr[2], (TextView) objArr[18], (TextView) objArr[22], (StepperView) objArr[37], (MaterialToolbar) objArr[5], (TextView) objArr[19]);
        this.f21467m0 = -1L;
        A0(this.f21414A);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21465k0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f21466l0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f21444e0.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4276p0 abstractC4276p0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21467m0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4276p0) obj, i11);
    }
}
