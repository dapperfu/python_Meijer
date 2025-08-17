package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class S1 extends R1 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f20313B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f20314C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f20315A;

    public S1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 1, f20313B, f20314C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20315A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20315A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20315A = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private S1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[0]);
        this.f20315A = -1L;
        this.f20299z.setTag(null);
        D0(view);
        o0();
    }
}
