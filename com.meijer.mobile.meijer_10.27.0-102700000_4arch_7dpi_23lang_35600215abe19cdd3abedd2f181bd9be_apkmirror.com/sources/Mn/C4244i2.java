package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Mn.i2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4244i2 extends AbstractC4239h2 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f20688B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f20689C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f20690A;

    public C4244i2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 1, f20688B, f20689C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20690A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20690A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20690A = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4244i2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[0]);
        this.f20690A = -1L;
        this.f20661z.setTag(null);
        D0(view);
        o0();
    }
}
