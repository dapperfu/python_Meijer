package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class H extends G {

    /* renamed from: b0, reason: collision with root package name */
    private static final p.i f21388b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final SparseIntArray f21389c0;

    /* renamed from: a0, reason: collision with root package name */
    private long f21390a0;

    public H(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 27, f21388b0, f21389c0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21390a0;
            this.f21390a0 = 0L;
        }
        if ((j10 & 2) != 0) {
            Aj.c.a(this.f21360M, true);
            Aj.c.a(this.f21362O, true);
            Aj.c.a(this.f21363P, true);
        }
        androidx.databinding.p.Z(this.f21365R);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21390a0 != 0) {
                    return true;
                }
                return this.f21365R.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21390a0 = 2L;
        }
        this.f21365R.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(27);
        f21388b0 = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{4}, new int[]{com.meijer.mobile.meijer.V.f100272r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21389c0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99975i6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99793R2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99777P6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99886a5, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99908c5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99919d5, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99962h4, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99951g4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99995k4, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99984j4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100165z9, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99626A9, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99689G8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99699H8, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100026n2, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99743M2, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99733L2, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99885a4, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99896b4, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 26);
    }

    private H(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[5], (TextView) objArr[21], (Button) objArr[23], (FrameLayout) objArr[22], (FrameLayout) objArr[8], (TextView) objArr[24], (TextView) objArr[25], (TextInputEditText) objArr[14], (EnhancedTextInputLayoutView) objArr[13], (TextInputEditText) objArr[16], (EnhancedTextInputLayoutView) objArr[15], (ConstraintLayout) objArr[10], (ImageView) objArr[11], (TextView) objArr[2], (TextView) objArr[12], (TextView) objArr[1], (TextView) objArr[3], (View) objArr[7], (v3) objArr[4], (ProgressView) objArr[26], (ScrollView) objArr[9], (MaterialCheckBox) objArr[19], (TextView) objArr[20], (MaterialToolbar) objArr[6], (CoordinatorLayout) objArr[0], (MaterialCheckBox) objArr[17], (TextView) objArr[18]);
        this.f21390a0 = -1L;
        this.f21360M.setTag(null);
        this.f21362O.setTag(null);
        this.f21363P.setTag(null);
        A0(this.f21365R);
        this.f21371X.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21390a0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((v3) obj, i11);
    }
}
