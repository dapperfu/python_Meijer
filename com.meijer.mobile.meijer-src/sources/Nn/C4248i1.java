package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.i1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4248i1 extends AbstractC4243h1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f22016C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f22017D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f22018A;

    /* renamed from: B, reason: collision with root package name */
    private long f22019B;

    public C4248i1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f22016C, f22017D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22019B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22019B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22019B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22017D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100052p6, 1);
    }

    private C4248i1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f22019B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22018A = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
