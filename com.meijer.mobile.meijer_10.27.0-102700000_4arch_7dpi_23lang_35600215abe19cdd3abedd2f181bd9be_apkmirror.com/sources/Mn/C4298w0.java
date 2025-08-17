package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4298w0 extends AbstractC4294v0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21063F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21064G;

    /* renamed from: E, reason: collision with root package name */
    private long f21065E;

    public C4298w0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f21063F, f21064G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21065E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21065E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21065E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21064G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98865K0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98845I0, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98835H0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98855J0, 4);
    }

    private C4298w0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[3], (TextView) objArr[2], (MaterialButton) objArr[4], (TextView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f21065E = -1L;
        this.f21041D.setTag(null);
        D0(view);
        o0();
    }
}
