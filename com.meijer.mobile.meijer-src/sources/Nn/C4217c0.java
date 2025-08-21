package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Spinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4217c0 extends AbstractC4212b0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21827F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21828G;

    /* renamed from: D, reason: collision with root package name */
    private final CoordinatorLayout f21829D;

    /* renamed from: E, reason: collision with root package name */
    private long f21830E;

    public C4217c0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f21827F, f21828G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21830E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21830E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21830E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21828G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100028n4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99641C2, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 4);
    }

    private C4217c0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[1], (ShoppingListFavoritesView) objArr[3], (Spinner) objArr[2], (ProgressView) objArr[4]);
        this.f21830E = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21829D = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
