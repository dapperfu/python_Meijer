package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4262n extends AbstractC4258m {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20801E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20802F;

    /* renamed from: C, reason: collision with root package name */
    private final CoordinatorLayout f20803C;

    /* renamed from: D, reason: collision with root package name */
    private long f20804D;

    public C4262n(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20801E, f20802F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20804D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20804D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20804D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20802F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99127j3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98927Q2, 3);
    }

    private C4262n(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (FrameLayout) objArr[3], (ImageView) objArr[1]);
        this.f20804D = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20803C = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
