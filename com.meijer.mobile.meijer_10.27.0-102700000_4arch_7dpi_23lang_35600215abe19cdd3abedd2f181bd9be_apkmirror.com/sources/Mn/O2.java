package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class O2 extends N2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20255D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20256E = null;

    /* renamed from: C, reason: collision with root package name */
    private long f20257C;

    public O2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 3, f20255D, f20256E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20257C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20257C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20257C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private O2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (Button) objArr[2], (View) objArr[0], (Button) objArr[1]);
        this.f20257C = -1L;
        this.f20237z.setTag(null);
        this.f20235A.setTag(null);
        this.f20236B.setTag(null);
        E0(viewArr);
        o0();
    }
}
