package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4231f extends AbstractC4226e {

    /* renamed from: l0, reason: collision with root package name */
    private static final p.i f21915l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final SparseIntArray f21916m0;

    /* renamed from: i0, reason: collision with root package name */
    private final ConstraintLayout f21917i0;

    /* renamed from: j0, reason: collision with root package name */
    private final ConstraintLayout f21918j0;

    /* renamed from: k0, reason: collision with root package name */
    private long f21919k0;

    public C4231f(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 37, f21915l0, f21916m0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21919k0 = 0L;
        }
        androidx.databinding.p.Z(this.f21864A);
        androidx.databinding.p.Z(this.f21890a0);
        androidx.databinding.p.Z(this.f21879P);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21919k0 != 0) {
                    return true;
                }
                return this.f21864A.h0() || this.f21890a0.h0() || this.f21879P.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21919k0 = 8L;
        }
        this.f21864A.l0();
        this.f21890a0.l0();
        this.f21879P.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(37);
        f21915l0 = iVar;
        iVar.a(1, new String[]{"cart_error_empty_screen"}, new int[]{5}, new int[]{com.meijer.mobile.meijer.V.f100189L});
        iVar.a(2, new String[]{"alcohol_restriction_message", "cart_order_summary"}, new int[]{3, 4}, new int[]{com.meijer.mobile.meijer.V.f100185J, com.meijer.mobile.meijer.V.f100191M});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21916m0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99916d2, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99811T0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99813T2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99843W2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99831V0, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99929e4, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99715J4, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99815T4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99765O4, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99707I6, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99947g0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99735L4, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100100u, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99938f2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99714J3, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99781Q0, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99971i2, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99676F5, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99836V5, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99917d3, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100039o4, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99741M0, 28);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100003l1, 29);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100101u0, 30);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99861Y0, 31);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99851X0, 32);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99628B0, 33);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99989j9, 34);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99956g9, 35);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 36);
    }

    private C4231f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 3, (MaterialButton) objArr[19], (AbstractC4283r0) objArr[3], (MaterialToolbar) objArr[6], (View) objArr[17], (ConstraintLayout) objArr[30], (MaterialButton) objArr[33], (MaterialTextView) objArr[28], (MaterialTextView) objArr[22], (ConstraintLayout) objArr[8], (NestedScrollView) objArr[11], (MaterialButton) objArr[32], (View) objArr[31], (ComposeView) objArr[29], (ComposeView) objArr[7], (LinearLayout) objArr[20], (MaterialButton) objArr[23], (AbstractC4299v0) objArr[5], (ComposeView) objArr[9], (View) objArr[10], (ComposeView) objArr[26], (ConstraintLayout) objArr[21], (ComposeView) objArr[12], (DrawerLayout) objArr[0], (MaterialButton) objArr[27], (Group) objArr[13], (RecyclerView) objArr[18], (TextView) objArr[15], (AbstractC4307x0) objArr[4], (CalloutView) objArr[14], (View) objArr[24], (RecyclerView) objArr[25], (ProgressView) objArr[36], (MaterialButton) objArr[16], (Group) objArr[35], (MaterialButton) objArr[34]);
        this.f21919k0 = -1L;
        A0(this.f21864A);
        A0(this.f21879P);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f21917i0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[2];
        this.f21918j0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.f21885V.setTag(null);
        A0(this.f21890a0);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4283r0 abstractC4283r0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21919k0 |= 4;
        }
        return true;
    }

    private boolean R0(AbstractC4299v0 abstractC4299v0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21919k0 |= 2;
        }
        return true;
    }

    private boolean U0(AbstractC4307x0 abstractC4307x0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21919k0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return U0((AbstractC4307x0) obj, i11);
        }
        if (i10 == 1) {
            return R0((AbstractC4299v0) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return O0((AbstractC4283r0) obj, i11);
    }
}
