package Nn;

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

/* loaded from: classes10.dex */
public class L extends K {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f21507M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f21508N;

    /* renamed from: K, reason: collision with root package name */
    private final CoordinatorLayout f21509K;

    /* renamed from: L, reason: collision with root package name */
    private long f21510L;

    public L(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 12, f21507M, f21508N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21510L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21510L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21510L = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21508N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99837V6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100044o9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99679F8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99632B4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99830V, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100133x, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99654D4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99651D1, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99978i9, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 11);
    }

    private L(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[7], (Barrier) objArr[6], (MaterialButton) objArr[9], (TextInputEditText) objArr[5], (ConstraintLayout) objArr[8], (ProgressView) objArr[11], (ScrollView) objArr[2], (TextInputLayout) objArr[4], (MaterialToolbar) objArr[1], (MaterialButton) objArr[10], (ConstraintLayout) objArr[3]);
        this.f21510L = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21509K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
