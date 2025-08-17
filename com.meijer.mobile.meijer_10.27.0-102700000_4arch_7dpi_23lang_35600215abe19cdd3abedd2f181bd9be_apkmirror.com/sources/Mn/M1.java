package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes9.dex */
public class M1 extends L1 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20216G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20217H;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f20218E;

    /* renamed from: F, reason: collision with root package name */
    private long f20219F;

    public M1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20216G, f20217H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20219F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20219F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20219F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20217H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98983V8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99016Z1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99038b2, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99027a2, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99080f0, 5);
    }

    private M1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[5], (MaterialCheckBox) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[1]);
        this.f20219F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20218E = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
