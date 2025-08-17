package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Mn.m2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4261m2 extends AbstractC4257l2 {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f20795B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f20796C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f20797A;

    public C4261m2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 1, f20795B, f20796C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20797A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20797A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20797A = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4261m2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[0]);
        this.f20797A = -1L;
        this.f20783z.setTag(null);
        D0(view);
        o0();
    }
}
