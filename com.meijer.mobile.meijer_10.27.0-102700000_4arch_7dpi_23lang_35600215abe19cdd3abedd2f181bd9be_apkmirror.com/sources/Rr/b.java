package Rr;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public class b extends a {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f32964D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f32965E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f32966B;

    /* renamed from: C, reason: collision with root package name */
    private long f32967C;

    public b(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.s0(fVar, view, 3, f32964D, f32965E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f32967C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f32967C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f32967C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32965E = sparseIntArray;
        sparseIntArray.put(Nr.d.f22669j, 1);
        sparseIntArray.put(Nr.d.f22668i, 2);
    }

    private b(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f32967C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f32966B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
