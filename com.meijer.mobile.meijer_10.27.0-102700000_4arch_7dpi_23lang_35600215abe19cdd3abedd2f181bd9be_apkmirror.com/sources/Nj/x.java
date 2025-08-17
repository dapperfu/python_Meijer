package Nj;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes7.dex */
public class x extends w {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f22205H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f22206I;

    /* renamed from: F, reason: collision with root package name */
    private final ConstraintLayout f22207F;

    /* renamed from: G, reason: collision with root package name */
    private long f22208G;

    public x(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 7, f22205H, f22206I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22208G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22208G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f22208G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22206I = sparseIntArray;
        sparseIntArray.put(Bj.k.f2885i1, 1);
        sparseIntArray.put(Bj.k.f2894l1, 2);
        sparseIntArray.put(Bj.k.f2844S0, 3);
        sparseIntArray.put(Bj.k.f2921w0, 4);
        sparseIntArray.put(Bj.k.f2859a, 5);
        sparseIntArray.put(Bj.k.f2891k1, 6);
    }

    private x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[5], (MaterialButton) objArr[4], (TextView) objArr[3], (MaterialToolbar) objArr[1], (TabLayout) objArr[6], (ViewPager) objArr[2]);
        this.f22208G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22207F = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
