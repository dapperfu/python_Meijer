package Mn;

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

/* renamed from: Mn.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4226f extends AbstractC4221e {

    /* renamed from: l0, reason: collision with root package name */
    private static final p.i f20583l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final SparseIntArray f20584m0;

    /* renamed from: i0, reason: collision with root package name */
    private final ConstraintLayout f20585i0;

    /* renamed from: j0, reason: collision with root package name */
    private final ConstraintLayout f20586j0;

    /* renamed from: k0, reason: collision with root package name */
    private long f20587k0;

    public C4226f(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 37, f20583l0, f20584m0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20587k0 = 0L;
        }
        androidx.databinding.p.Y(this.f20532A);
        androidx.databinding.p.Y(this.f20558a0);
        androidx.databinding.p.Y(this.f20547P);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20587k0 != 0) {
                    return true;
                }
                return this.f20532A.h0() || this.f20558a0.h0() || this.f20547P.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20587k0 = 8L;
        }
        this.f20532A.o0();
        this.f20558a0.o0();
        this.f20547P.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(37);
        f20583l0 = iVar;
        iVar.a(1, new String[]{"cart_error_empty_screen"}, new int[]{5}, new int[]{com.meijer.mobile.meijer.V.f99333L});
        iVar.a(2, new String[]{"alcohol_restriction_message", "cart_order_summary"}, new int[]{3, 4}, new int[]{com.meijer.mobile.meijer.V.f99329J, com.meijer.mobile.meijer.V.f99335M});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20584m0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99060d2, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98955T0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98957T2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98987W2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98975V0, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99073e4, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98859J4, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98959T4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98909O4, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98861J6, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99091g0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98879L4, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99244u, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99082f2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98858J3, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98925Q0, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99115i2, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98830G5, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98990W5, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99061d3, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99183o4, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98885M0, 28);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99147l1, 29);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99245u0, 30);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99005Y0, 31);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98995X0, 32);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98771B0, 33);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99144k9, 34);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99111h9, 35);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 36);
    }

    private C4226f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 3, (MaterialButton) objArr[19], (AbstractC4278r0) objArr[3], (MaterialToolbar) objArr[6], (View) objArr[17], (ConstraintLayout) objArr[30], (MaterialButton) objArr[33], (MaterialTextView) objArr[28], (MaterialTextView) objArr[22], (ConstraintLayout) objArr[8], (NestedScrollView) objArr[11], (MaterialButton) objArr[32], (View) objArr[31], (ComposeView) objArr[29], (ComposeView) objArr[7], (LinearLayout) objArr[20], (MaterialButton) objArr[23], (AbstractC4294v0) objArr[5], (ComposeView) objArr[9], (View) objArr[10], (ComposeView) objArr[26], (ConstraintLayout) objArr[21], (ComposeView) objArr[12], (DrawerLayout) objArr[0], (MaterialButton) objArr[27], (Group) objArr[13], (RecyclerView) objArr[18], (TextView) objArr[15], (AbstractC4302x0) objArr[4], (CalloutView) objArr[14], (View) objArr[24], (RecyclerView) objArr[25], (ProgressView) objArr[36], (MaterialButton) objArr[16], (Group) objArr[35], (MaterialButton) objArr[34]);
        this.f20587k0 = -1L;
        C0(this.f20532A);
        C0(this.f20547P);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f20585i0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[2];
        this.f20586j0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.f20553V.setTag(null);
        C0(this.f20558a0);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4278r0 abstractC4278r0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20587k0 |= 4;
        }
        return true;
    }

    private boolean P0(AbstractC4294v0 abstractC4294v0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20587k0 |= 2;
        }
        return true;
    }

    private boolean Q0(AbstractC4302x0 abstractC4302x0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20587k0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return Q0((AbstractC4302x0) obj, i11);
        }
        if (i10 == 1) {
            return P0((AbstractC4294v0) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return O0((AbstractC4278r0) obj, i11);
    }
}
