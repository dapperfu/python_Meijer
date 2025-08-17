package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes9.dex */
public class w3 extends v3 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21073D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21074E;

    /* renamed from: C, reason: collision with root package name */
    private long f21075C;

    public w3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f21073D, f21074E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21075C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21075C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21075C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21074E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99108h6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99119i6, 2);
    }

    private w3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ProgressIndicatorView) objArr[1], (View) objArr[2], (ConstraintLayout) objArr[0]);
        this.f21075C = -1L;
        this.f21048B.setTag(null);
        D0(view);
        o0();
    }
}
