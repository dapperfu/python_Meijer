package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public class L extends K {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f20175M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f20176N;

    /* renamed from: K, reason: collision with root package name */
    private final CoordinatorLayout f20177K;

    /* renamed from: L, reason: collision with root package name */
    private long f20178L;

    public L(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 12, f20175M, f20176N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20178L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20178L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20178L = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20176N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98991W6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99199p9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98833G8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98775B4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98974V, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99277x, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98797D4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98794D1, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99133j9, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 11);
    }

    private L(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[7], (Barrier) objArr[6], (MaterialButton) objArr[9], (TextInputEditText) objArr[5], (ConstraintLayout) objArr[8], (ProgressView) objArr[11], (ScrollView) objArr[2], (TextInputLayout) objArr[4], (MaterialToolbar) objArr[1], (MaterialButton) objArr[10], (ConstraintLayout) objArr[3]);
        this.f20178L = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20177K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
