package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class K1 extends J1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20169C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20170D;

    /* renamed from: B, reason: collision with root package name */
    private long f20171B;

    public K1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20169C, f20170D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20171B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20171B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20171B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20170D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98883L8, 1);
    }

    private K1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[1]);
        this.f20171B = -1L;
        this.f20143z.setTag(null);
        D0(view);
        o0();
    }
}
