package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class F extends E {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21329G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21330H;

    /* renamed from: E, reason: collision with root package name */
    private final CoordinatorLayout f21331E;

    /* renamed from: F, reason: collision with root package name */
    private long f21332F;

    public F(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21329G, f21330H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21332F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21332F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21332F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21330H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100005l3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99708I7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100003l1, 5);
    }

    private F(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[5], (ComposeView) objArr[2], (ProgressView) objArr[4], (RecyclerView) objArr[3], (MaterialToolbar) objArr[1]);
        this.f21332F = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21331E = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
