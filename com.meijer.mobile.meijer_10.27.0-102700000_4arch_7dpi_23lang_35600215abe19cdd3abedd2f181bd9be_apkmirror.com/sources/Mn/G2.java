package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public class G2 extends F2 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20050C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20051D;

    /* renamed from: B, reason: collision with root package name */
    private long f20052B;

    public G2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20050C, f20051D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20052B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20052B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20052B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20051D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98877L2, 1);
    }

    private G2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[1], (ConstraintLayout) objArr[0]);
        this.f20052B = -1L;
        this.f20013A.setTag(null);
        D0(view);
        o0();
    }
}
