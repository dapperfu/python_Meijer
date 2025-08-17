package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class m3 extends l3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20798C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20799D;

    /* renamed from: B, reason: collision with root package name */
    private long f20800B;

    public m3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20798C, f20799D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20800B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20800B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20800B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20799D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98938R3, 1);
    }

    private m3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RatingBar) objArr[1], (ConstraintLayout) objArr[0]);
        this.f20800B = -1L;
        this.f20784A.setTag(null);
        D0(view);
        o0();
    }
}
