package Mn;

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

/* loaded from: classes9.dex */
public class D extends C {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f19950M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f19951N;

    /* renamed from: K, reason: collision with root package name */
    private final CoordinatorLayout f19952K;

    /* renamed from: L, reason: collision with root package name */
    private long f19953L;

    public D(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 12, f19950M, f19951N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19953L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19953L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19953L = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19951N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98969U4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98939R4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99256v0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98949S4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98946S1, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98990W5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98849I4, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99005Y0, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98839H4, 11);
    }

    private D(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[5], (View) objArr[10], (View) objArr[7], (MaterialButton) objArr[11], (LinearLayout) objArr[9], (NestedScrollView) objArr[4], (TextView) objArr[6], (AppBarLayout) objArr[1], (RecyclerView) objArr[8], (ProgressView) objArr[3], (MaterialToolbar) objArr[2]);
        this.f19953L = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f19952K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
