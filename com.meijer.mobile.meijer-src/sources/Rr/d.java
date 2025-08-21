package Rr;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public class d extends c {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f34007D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f34008E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f34009B;

    /* renamed from: C, reason: collision with root package name */
    private long f34010C;

    public d(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 3, f34007D, f34008E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f34010C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f34010C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f34010C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34008E = sparseIntArray;
        sparseIntArray.put(Nr.d.f22623h, 1);
        sparseIntArray.put(Nr.d.f22622g, 2);
    }

    private d(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f34010C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f34009B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
