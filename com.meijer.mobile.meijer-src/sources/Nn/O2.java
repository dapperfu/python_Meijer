package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class O2 extends N2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21587D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21588E = null;

    /* renamed from: C, reason: collision with root package name */
    private long f21589C;

    public O2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 3, f21587D, f21588E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21589C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21589C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21589C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private O2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (Button) objArr[2], (View) objArr[0], (Button) objArr[1]);
        this.f21589C = -1L;
        this.f21569z.setTag(null);
        this.f21567A.setTag(null);
        this.f21568B.setTag(null);
        D0(viewArr);
        l0();
    }
}
