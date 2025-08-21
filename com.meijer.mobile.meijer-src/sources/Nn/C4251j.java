package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4251j extends AbstractC4246i {

    /* renamed from: Q, reason: collision with root package name */
    private static final p.i f22027Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static final SparseIntArray f22028R;

    /* renamed from: O, reason: collision with root package name */
    private final CoordinatorLayout f22029O;

    /* renamed from: P, reason: collision with root package name */
    private long f22030P;

    public C4251j(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 16, f22027Q, f22028R));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22030P;
            this.f22030P = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f21999B, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22030P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22030P = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22028R = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99967h9, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100147y2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99865Y4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99855X4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100114v2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100103u2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100136x2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100125w2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100101u0, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99945f9, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99934e9, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 15);
    }

    private C4251j(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[2], (ConstraintLayout) objArr[12], (MaterialTextView) objArr[1], (AutoCompleteTextView) objArr[9], (EnhancedTextInputLayoutView) objArr[8], (AutoCompleteTextView) objArr[11], (EnhancedTextInputLayoutView) objArr[10], (CalloutView) objArr[5], (ImageView) objArr[7], (MaterialTextView) objArr[6], (ProgressView) objArr[15], (MaterialToolbar) objArr[3], (MaterialButton) objArr[14], (View) objArr[13], (ConstraintLayout) objArr[4]);
        this.f22030P = -1L;
        this.f21999B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f22029O = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
