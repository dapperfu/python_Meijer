package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4275p extends AbstractC4271o {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f22176G;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f22177H;

    /* renamed from: E, reason: collision with root package name */
    private final CoordinatorLayout f22178E;

    /* renamed from: F, reason: collision with root package name */
    private long f22179F;

    public C4275p(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f22176G, f22177H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22179F = 0L;
        }
        androidx.databinding.p.Z(this.f22159B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22179F != 0) {
                    return true;
                }
                return this.f22159B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22179F = 2L;
        }
        this.f22159B.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(6);
        f22176G = iVar;
        iVar.a(0, new String[]{"fetch_data_failure_view"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f100244i0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22177H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99722K1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99732L1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100008l6, 5);
    }

    private C4275p(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TabLayout) objArr[3], (ViewPager2) objArr[4], (AbstractC4269n1) objArr[1], (ProgressView) objArr[5], (MaterialToolbar) objArr[2]);
        this.f22179F = -1L;
        A0(this.f22159B);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f22178E = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4269n1 abstractC4269n1, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22179F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4269n1) obj, i11);
    }
}
