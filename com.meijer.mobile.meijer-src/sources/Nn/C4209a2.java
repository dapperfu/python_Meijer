package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.a2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4209a2 extends Z1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21799C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21800D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f21801A;

    /* renamed from: B, reason: collision with root package name */
    private long f21802B;

    public C4209a2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21799C, f21800D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21802B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21802B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21802B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21800D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 1);
    }

    private C4209a2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ProgressView) objArr[1]);
        this.f21802B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21801A = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
