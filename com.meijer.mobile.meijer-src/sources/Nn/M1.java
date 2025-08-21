package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes10.dex */
public class M1 extends L1 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21548G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21549H;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f21550E;

    /* renamed from: F, reason: collision with root package name */
    private long f21551F;

    public M1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21548G, f21549H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21551F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21551F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21551F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21549H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99829U8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99872Z1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99894b2, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99883a2, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99936f0, 5);
    }

    private M1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[5], (MaterialCheckBox) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[1]);
        this.f21551F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21550E = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
