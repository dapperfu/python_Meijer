package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.u2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4297u2 extends AbstractC4293t2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22360D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22361E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f22362B;

    /* renamed from: C, reason: collision with root package name */
    private long f22363C;

    public C4297u2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22360D, f22361E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22363C;
            this.f22363C = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f22320A, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22363C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22363C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22361E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100085s6, 2);
    }

    private C4297u2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[2], (TextView) objArr[1]);
        this.f22363C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22362B = constraintLayout;
        constraintLayout.setTag(null);
        this.f22320A.setTag(null);
        B0(view);
        l0();
    }
}
