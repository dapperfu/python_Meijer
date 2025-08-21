package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class S1 extends R1 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f21645B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f21646C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f21647A;

    public S1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 1, f21645B, f21646C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21647A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21647A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21647A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private S1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[0]);
        this.f21647A = -1L;
        this.f21631z.setTag(null);
        B0(view);
        l0();
    }
}
