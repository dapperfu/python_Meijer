package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Nn.m2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4266m2 extends AbstractC4262l2 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f22127B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f22128C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f22129A;

    public C4266m2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 1, f22127B, f22128C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22129A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22129A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22129A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4266m2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[0]);
        this.f22129A = -1L;
        this.f22115z.setTag(null);
        B0(view);
        l0();
    }
}
