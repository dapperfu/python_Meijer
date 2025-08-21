package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes10.dex */
public class Y2 extends X2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21746D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21747E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f21748B;

    /* renamed from: C, reason: collision with root package name */
    private long f21749C;

    public Y2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21746D, f21747E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21749C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21749C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21749C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21747E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99665E4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99927e2, 2);
    }

    private Y2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[2], (MaterialTextView) objArr[1]);
        this.f21749C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21748B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
