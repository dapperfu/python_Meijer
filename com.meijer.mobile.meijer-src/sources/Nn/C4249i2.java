package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Nn.i2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4249i2 extends AbstractC4244h2 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f22020B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f22021C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f22022A;

    public C4249i2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 1, f22020B, f22021C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22022A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22022A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22022A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4249i2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[0]);
        this.f22022A = -1L;
        this.f21993z.setTag(null);
        B0(view);
        l0();
    }
}
