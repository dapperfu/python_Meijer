package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4270p extends AbstractC4266o {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20844G;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20845H;

    /* renamed from: E, reason: collision with root package name */
    private final CoordinatorLayout f20846E;

    /* renamed from: F, reason: collision with root package name */
    private long f20847F;

    public C4270p(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20844G, f20845H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20847F = 0L;
        }
        androidx.databinding.p.Y(this.f20827B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20847F != 0) {
                    return true;
                }
                return this.f20827B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20847F = 2L;
        }
        this.f20827B.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(6);
        f20844G = iVar;
        iVar.a(0, new String[]{"fetch_data_failure_view"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f99388i0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20845H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98866K1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98876L1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99163m6, 5);
    }

    private C4270p(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TabLayout) objArr[3], (ViewPager2) objArr[4], (AbstractC4264n1) objArr[1], (ProgressView) objArr[5], (MaterialToolbar) objArr[2]);
        this.f20847F = -1L;
        C0(this.f20827B);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20846E = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4264n1 abstractC4264n1, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20847F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4264n1) obj, i11);
    }
}
