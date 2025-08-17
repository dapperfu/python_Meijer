package Rr;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public class h extends g {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f32982B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f32983C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f32984A;

    public h(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.s0(fVar, view, 1, f32982B, f32983C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f32984A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f32984A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f32984A = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatImageView) objArr[0]);
        this.f32984A = -1L;
        this.f32981z.setTag(null);
        D0(view);
        o0();
    }
}
