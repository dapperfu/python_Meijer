package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes10.dex */
public class G2 extends F2 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21382C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21383D;

    /* renamed from: B, reason: collision with root package name */
    private long f21384B;

    public G2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21382C, f21383D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21384B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21384B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21384B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21383D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99733L2, 1);
    }

    private G2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[1], (ConstraintLayout) objArr[0]);
        this.f21384B = -1L;
        this.f21345A.setTag(null);
        B0(view);
        l0();
    }
}
