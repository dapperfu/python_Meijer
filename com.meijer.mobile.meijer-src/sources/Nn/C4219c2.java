package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.c2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4219c2 extends AbstractC4214b2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21834D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21835E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f21836B;

    /* renamed from: C, reason: collision with root package name */
    private long f21837C;

    public C4219c2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21834D, f21835E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21837C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21837C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21837C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21835E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99937f1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99893b1, 2);
    }

    private C4219c2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[2], (TextView) objArr[1]);
        this.f21837C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21836B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
