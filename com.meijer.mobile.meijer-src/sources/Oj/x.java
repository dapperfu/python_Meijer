package Oj;

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

/* loaded from: classes8.dex */
public class x extends w {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f24450H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f24451I;

    /* renamed from: F, reason: collision with root package name */
    private final ConstraintLayout f24452F;

    /* renamed from: G, reason: collision with root package name */
    private long f24453G;

    public x(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 7, f24450H, f24451I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f24453G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f24453G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f24453G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24451I = sparseIntArray;
        sparseIntArray.put(Cj.k.f4930i1, 1);
        sparseIntArray.put(Cj.k.f4939l1, 2);
        sparseIntArray.put(Cj.k.f4889S0, 3);
        sparseIntArray.put(Cj.k.f4966w0, 4);
        sparseIntArray.put(Cj.k.f4904a, 5);
        sparseIntArray.put(Cj.k.f4936k1, 6);
    }

    private x(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[5], (MaterialButton) objArr[4], (TextView) objArr[3], (MaterialToolbar) objArr[1], (TabLayout) objArr[6], (ViewPager) objArr[2]);
        this.f24453G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f24452F = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
