package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class Q1 extends P1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20287D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20288E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20289B;

    /* renamed from: C, reason: collision with root package name */
    private long f20290C;

    public Q1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20287D, f20288E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20290C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20290C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20290C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20288E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99229s6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99218r6, 2);
    }

    private Q1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[2], (TextView) objArr[1]);
        this.f20290C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20289B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
