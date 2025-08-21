package Rr;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public class h extends g {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f34019B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f34020C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f34021A;

    public h(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 1, f34019B, f34020C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f34021A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f34021A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f34021A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatImageView) objArr[0]);
        this.f34021A = -1L;
        this.f34018z.setTag(null);
        B0(view);
        l0();
    }
}
