package Mn;

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

/* loaded from: classes9.dex */
public class N extends M {

    /* renamed from: Y, reason: collision with root package name */
    private static final p.i f20223Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final SparseIntArray f20224Z;

    /* renamed from: X, reason: collision with root package name */
    private long f20225X;

    public N(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 24, f20223Y, f20224Z));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20225X;
            this.f20225X = 0L;
        }
        if ((j10 & 2) != 0) {
            zj.c.a(this.f20190B, true);
            zj.c.a(this.f20204P, true);
        }
        androidx.databinding.p.Y(this.f20207S);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20225X != 0) {
                    return true;
                }
                return this.f20207S.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20225X = 2L;
        }
        this.f20207S.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(24);
        f20223Y = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{3}, new int[]{com.meijer.mobile.meijer.V.f99416r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20224Z = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99130j6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98931Q6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99075e6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99010Y5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99086f6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98857J2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99192p2, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98928Q3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99203q2, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99104h2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99181o2, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98989W4, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99214r2, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98823F8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98887M2, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99216r4, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99029a4, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98998X3, 23);
    }

    private N(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[4], (EnhancedTextInputLayoutView) objArr[15], (TextView) objArr[2], (TextInputEditText) objArr[16], (TextInputEditText) objArr[12], (TextInputEditText) objArr[14], (TextInputEditText) objArr[18], (EnhancedTextInputLayoutView) objArr[11], (FrameLayout) objArr[20], (EnhancedTextInputLayoutView) objArr[13], (TextView) objArr[23], (TextView) objArr[22], (Button) objArr[21], (EnhancedTextInputLayoutView) objArr[17], (ImageView) objArr[9], (ConstraintLayout) objArr[8], (ComposeView) objArr[1], (TextView) objArr[10], (View) objArr[6], (v3) objArr[3], (ScrollView) objArr[7], (SpannableTextView) objArr[19], (MaterialToolbar) objArr[5], (CoordinatorLayout) objArr[0]);
        this.f20225X = -1L;
        this.f20190B.setTag(null);
        this.f20204P.setTag(null);
        C0(this.f20207S);
        this.f20211W.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20225X |= 1;
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
