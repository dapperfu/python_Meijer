package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4267n extends AbstractC4263m {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f22133E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f22134F;

    /* renamed from: C, reason: collision with root package name */
    private final CoordinatorLayout f22135C;

    /* renamed from: D, reason: collision with root package name */
    private long f22136D;

    public C4267n(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f22133E, f22134F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22136D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22136D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22136D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22134F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99983j3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99783Q2, 3);
    }

    private C4267n(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (FrameLayout) objArr[3], (ImageView) objArr[1]);
        this.f22136D = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f22135C = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
