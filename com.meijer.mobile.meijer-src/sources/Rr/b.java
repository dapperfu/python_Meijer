package Rr;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public class b extends a {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f34001D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f34002E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f34003B;

    /* renamed from: C, reason: collision with root package name */
    private long f34004C;

    public b(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 3, f34001D, f34002E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f34004C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f34004C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f34004C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34002E = sparseIntArray;
        sparseIntArray.put(Nr.d.f22625j, 1);
        sparseIntArray.put(Nr.d.f22624i, 2);
    }

    private b(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f34004C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f34003B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
