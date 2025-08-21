package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes10.dex */
public class w3 extends v3 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22405D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22406E;

    /* renamed from: C, reason: collision with root package name */
    private long f22407C;

    public w3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22405D, f22406E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22407C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22407C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22407C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22406E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99953g6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99964h6, 2);
    }

    private w3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ProgressIndicatorView) objArr[1], (View) objArr[2], (ConstraintLayout) objArr[0]);
        this.f22407C = -1L;
        this.f22380B.setTag(null);
        B0(view);
        l0();
    }
}
