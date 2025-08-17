package Mn;

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

/* loaded from: classes9.dex */
public class H extends G {

    /* renamed from: b0, reason: collision with root package name */
    private static final p.i f20056b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final SparseIntArray f20057c0;

    /* renamed from: a0, reason: collision with root package name */
    private long f20058a0;

    public H(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 27, f20056b0, f20057c0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20058a0;
            this.f20058a0 = 0L;
        }
        if ((j10 & 2) != 0) {
            zj.c.a(this.f20028M, true);
            zj.c.a(this.f20030O, true);
            zj.c.a(this.f20031P, true);
        }
        androidx.databinding.p.Y(this.f20033R);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20058a0 != 0) {
                    return true;
                }
                return this.f20033R.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20058a0 = 2L;
        }
        this.f20033R.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(27);
        f20056b0 = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{4}, new int[]{com.meijer.mobile.meijer.V.f99416r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20057c0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99130j6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98937R2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98931Q6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99030a5, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99052c5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99063d5, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99106h4, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99095g4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99139k4, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99128j4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98769A9, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98780B9, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98843H8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98853I8, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99170n2, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98887M2, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98877L2, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99029a4, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99040b4, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 26);
    }

    private H(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[5], (TextView) objArr[21], (Button) objArr[23], (FrameLayout) objArr[22], (FrameLayout) objArr[8], (TextView) objArr[24], (TextView) objArr[25], (TextInputEditText) objArr[14], (EnhancedTextInputLayoutView) objArr[13], (TextInputEditText) objArr[16], (EnhancedTextInputLayoutView) objArr[15], (ConstraintLayout) objArr[10], (ImageView) objArr[11], (TextView) objArr[2], (TextView) objArr[12], (TextView) objArr[1], (TextView) objArr[3], (View) objArr[7], (v3) objArr[4], (ProgressView) objArr[26], (ScrollView) objArr[9], (MaterialCheckBox) objArr[19], (TextView) objArr[20], (MaterialToolbar) objArr[6], (CoordinatorLayout) objArr[0], (MaterialCheckBox) objArr[17], (TextView) objArr[18]);
        this.f20058a0 = -1L;
        this.f20028M.setTag(null);
        this.f20030O.setTag(null);
        this.f20031P.setTag(null);
        C0(this.f20033R);
        this.f20039X.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20058a0 |= 1;
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
