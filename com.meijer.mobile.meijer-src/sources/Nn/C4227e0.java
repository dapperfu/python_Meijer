package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4227e0 extends AbstractC4222d0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21899D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21900E;

    /* renamed from: B, reason: collision with root package name */
    private final CoordinatorLayout f21901B;

    /* renamed from: C, reason: collision with root package name */
    private long f21902C;

    public C4227e0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21899D, f21900E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21902C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21902C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21902C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21900E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99783Q2, 2);
    }

    private C4227e0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[1], (FrameLayout) objArr[2]);
        this.f21902C = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21901B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
