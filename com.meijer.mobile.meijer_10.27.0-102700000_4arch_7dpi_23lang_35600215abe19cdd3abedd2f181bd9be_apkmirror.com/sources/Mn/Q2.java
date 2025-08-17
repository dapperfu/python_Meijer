package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class Q2 extends P2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20291D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20292E = null;

    /* renamed from: C, reason: collision with root package name */
    private long f20293C;

    public Q2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 3, f20291D, f20292E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20293C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20293C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20293C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private Q2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (Button) objArr[1], (Button) objArr[2], (View) objArr[0]);
        this.f20293C = -1L;
        this.f20273z.setTag(null);
        this.f20271A.setTag(null);
        this.f20272B.setTag(null);
        E0(viewArr);
        o0();
    }
}
