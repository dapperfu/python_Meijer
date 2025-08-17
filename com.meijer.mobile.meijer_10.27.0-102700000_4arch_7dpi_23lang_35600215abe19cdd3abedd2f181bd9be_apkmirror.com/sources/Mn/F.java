package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public class F extends E {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f19997G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f19998H;

    /* renamed from: E, reason: collision with root package name */
    private final CoordinatorLayout f19999E;

    /* renamed from: F, reason: collision with root package name */
    private long f20000F;

    public F(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f19997G, f19998H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20000F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20000F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20000F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19998H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99149l3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98862J7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99147l1, 5);
    }

    private F(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[5], (ComposeView) objArr[2], (ProgressView) objArr[4], (RecyclerView) objArr[3], (MaterialToolbar) objArr[1]);
        this.f20000F = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f19999E = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
