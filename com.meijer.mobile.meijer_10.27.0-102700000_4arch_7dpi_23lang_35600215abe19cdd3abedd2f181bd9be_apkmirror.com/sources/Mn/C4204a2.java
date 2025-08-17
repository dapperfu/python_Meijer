package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.a2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4204a2 extends Z1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20467C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20468D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f20469A;

    /* renamed from: B, reason: collision with root package name */
    private long f20470B;

    public C4204a2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20467C, f20468D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20470B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20470B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20470B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20468D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 1);
    }

    private C4204a2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ProgressView) objArr[1]);
        this.f20470B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20469A = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
