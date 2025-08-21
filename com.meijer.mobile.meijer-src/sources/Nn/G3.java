package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class G3 extends F3 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f21385B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f21386C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f21387A;

    public G3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 1, f21385B, f21386C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21387A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21387A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21387A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private G3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (TextView) objArr[0]);
        this.f21387A = -1L;
        this.f21347z.setTag(null);
        D0(viewArr);
        l0();
    }
}
