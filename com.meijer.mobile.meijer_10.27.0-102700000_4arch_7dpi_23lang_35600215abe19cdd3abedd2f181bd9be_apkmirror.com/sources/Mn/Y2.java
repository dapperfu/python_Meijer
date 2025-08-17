package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes9.dex */
public class Y2 extends X2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20414D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20415E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20416B;

    /* renamed from: C, reason: collision with root package name */
    private long f20417C;

    public Y2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20414D, f20415E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20417C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20417C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20417C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20415E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98808E4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99071e2, 2);
    }

    private Y2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[2], (MaterialTextView) objArr[1]);
        this.f20417C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20416B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
