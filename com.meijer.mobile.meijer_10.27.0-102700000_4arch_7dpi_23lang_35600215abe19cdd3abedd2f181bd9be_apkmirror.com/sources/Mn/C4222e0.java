package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4222e0 extends AbstractC4217d0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20567D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20568E;

    /* renamed from: B, reason: collision with root package name */
    private final CoordinatorLayout f20569B;

    /* renamed from: C, reason: collision with root package name */
    private long f20570C;

    public C4222e0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20567D, f20568E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20570C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20570C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20570C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20568E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98927Q2, 2);
    }

    private C4222e0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[1], (FrameLayout) objArr[2]);
        this.f20570C = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20569B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
