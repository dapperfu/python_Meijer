package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class K1 extends J1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21501C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21502D;

    /* renamed from: B, reason: collision with root package name */
    private long f21503B;

    public K1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21501C, f21502D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21503B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21503B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21503B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21502D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99729K8, 1);
    }

    private K1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[1]);
        this.f21503B = -1L;
        this.f21475z.setTag(null);
        B0(view);
        l0();
    }
}
