package Mn;

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

/* renamed from: Mn.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4246j extends AbstractC4241i {

    /* renamed from: Q, reason: collision with root package name */
    private static final p.i f20695Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static final SparseIntArray f20696R;

    /* renamed from: O, reason: collision with root package name */
    private final CoordinatorLayout f20697O;

    /* renamed from: P, reason: collision with root package name */
    private long f20698P;

    public C4246j(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 16, f20695Q, f20696R));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20698P;
            this.f20698P = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f20667B, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20698P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20698P = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20696R = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99122i9, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99291y2, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99009Y4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98999X4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99258v2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99247u2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99280x2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99269w2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99245u0, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99100g9, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99089f9, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 15);
    }

    private C4246j(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[2], (ConstraintLayout) objArr[12], (MaterialTextView) objArr[1], (AutoCompleteTextView) objArr[9], (EnhancedTextInputLayoutView) objArr[8], (AutoCompleteTextView) objArr[11], (EnhancedTextInputLayoutView) objArr[10], (CalloutView) objArr[5], (ImageView) objArr[7], (MaterialTextView) objArr[6], (ProgressView) objArr[15], (MaterialToolbar) objArr[3], (MaterialButton) objArr[14], (View) objArr[13], (ConstraintLayout) objArr[4]);
        this.f20698P = -1L;
        this.f20667B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20697O = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
