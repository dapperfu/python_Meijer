package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Spinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.c0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4212c0 extends AbstractC4207b0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20495F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20496G;

    /* renamed from: D, reason: collision with root package name */
    private final CoordinatorLayout f20497D;

    /* renamed from: E, reason: collision with root package name */
    private long f20498E;

    public C4212c0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f20495F, f20496G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20498E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20498E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20498E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20496G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99172n4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98784C2, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 4);
    }

    private C4212c0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[1], (ShoppingListFavoritesView) objArr[3], (Spinner) objArr[2], (ProgressView) objArr[4]);
        this.f20498E = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20497D = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
