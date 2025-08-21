package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class M2 extends L2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21552D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21553E = null;

    /* renamed from: C, reason: collision with root package name */
    private long f21554C;

    public M2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 3, f21552D, f21553E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21554C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21554C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21554C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private M2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (TextView) objArr[2], (ImageView) objArr[0], (TextView) objArr[1]);
        this.f21554C = -1L;
        this.f21520z.setTag(null);
        this.f21518A.setTag(null);
        this.f21519B.setTag(null);
        D0(viewArr);
        l0();
    }
}
