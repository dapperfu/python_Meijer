package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class D extends C {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f21282M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f21283N;

    /* renamed from: K, reason: collision with root package name */
    private final CoordinatorLayout f21284K;

    /* renamed from: L, reason: collision with root package name */
    private long f21285L;

    public D(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 12, f21282M, f21283N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21285L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21285L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21285L = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21283N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99825U4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99795R4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100112v0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99805S4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99802S1, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99836V5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99705I4, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99861Y0, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99695H4, 11);
    }

    private D(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[5], (View) objArr[10], (View) objArr[7], (MaterialButton) objArr[11], (LinearLayout) objArr[9], (NestedScrollView) objArr[4], (TextView) objArr[6], (AppBarLayout) objArr[1], (RecyclerView) objArr[8], (ProgressView) objArr[3], (MaterialToolbar) objArr[2]);
        this.f21285L = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21284K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
