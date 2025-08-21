package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.q1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4281q1 extends AbstractC4277p1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22221D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22222E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f22223B;

    /* renamed from: C, reason: collision with root package name */
    private long f22224C;

    public C4281q1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22221D, f22222E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22224C;
            this.f22224C = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f22185z, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22224C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22224C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22222E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99758N7, 2);
    }

    private C4281q1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialTextView) objArr[1], (Button) objArr[2]);
        this.f22224C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22223B = constraintLayout;
        constraintLayout.setTag(null);
        this.f22185z.setTag(null);
        B0(view);
        l0();
    }
}
