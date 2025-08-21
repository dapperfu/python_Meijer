package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class m3 extends l3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f22130C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f22131D;

    /* renamed from: B, reason: collision with root package name */
    private long f22132B;

    public m3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f22130C, f22131D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22132B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22132B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22132B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22131D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99794R3, 1);
    }

    private m3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RatingBar) objArr[1], (ConstraintLayout) objArr[0]);
        this.f22132B = -1L;
        this.f22116A.setTag(null);
        B0(view);
        l0();
    }
}
