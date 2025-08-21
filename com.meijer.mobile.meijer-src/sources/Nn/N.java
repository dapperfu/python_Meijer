package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.widget.SpannableTextView;

/* loaded from: classes10.dex */
public class N extends M {

    /* renamed from: Y, reason: collision with root package name */
    private static final p.i f21555Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final SparseIntArray f21556Z;

    /* renamed from: X, reason: collision with root package name */
    private long f21557X;

    public N(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 24, f21555Y, f21556Z));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21557X;
            this.f21557X = 0L;
        }
        if ((j10 & 2) != 0) {
            Aj.c.a(this.f21522B, true);
            Aj.c.a(this.f21536P, true);
        }
        androidx.databinding.p.Z(this.f21539S);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21557X != 0) {
                    return true;
                }
                return this.f21539S.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21557X = 2L;
        }
        this.f21539S.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(24);
        f21555Y = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{3}, new int[]{com.meijer.mobile.meijer.V.f100272r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21556Z = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99975i6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99777P6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99920d6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99856X5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99931e6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99713J2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100048p2, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99784Q3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100059q2, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99960h2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100037o2, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99845W4, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100070r2, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99669E8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99743M2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100072r4, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99885a4, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99854X3, 23);
    }

    private N(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[4], (EnhancedTextInputLayoutView) objArr[15], (TextView) objArr[2], (TextInputEditText) objArr[16], (TextInputEditText) objArr[12], (TextInputEditText) objArr[14], (TextInputEditText) objArr[18], (EnhancedTextInputLayoutView) objArr[11], (FrameLayout) objArr[20], (EnhancedTextInputLayoutView) objArr[13], (TextView) objArr[23], (TextView) objArr[22], (Button) objArr[21], (EnhancedTextInputLayoutView) objArr[17], (ImageView) objArr[9], (ConstraintLayout) objArr[8], (ComposeView) objArr[1], (TextView) objArr[10], (View) objArr[6], (v3) objArr[3], (ScrollView) objArr[7], (SpannableTextView) objArr[19], (MaterialToolbar) objArr[5], (CoordinatorLayout) objArr[0]);
        this.f21557X = -1L;
        this.f21522B.setTag(null);
        this.f21536P.setTag(null);
        A0(this.f21539S);
        this.f21543W.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21557X |= 1;
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
