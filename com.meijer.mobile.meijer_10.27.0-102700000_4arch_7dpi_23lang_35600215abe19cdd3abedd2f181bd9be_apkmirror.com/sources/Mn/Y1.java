package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes9.dex */
public class Y1 extends X1 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20411E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20412F;

    /* renamed from: D, reason: collision with root package name */
    private long f20413D;

    public Y1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20411E, f20412F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20413D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20413D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20413D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20412F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99193p3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99215r3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99204q3, 3);
    }

    private Y1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCheckBox) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ConstraintLayout) objArr[0]);
        this.f20413D = -1L;
        this.f20400C.setTag(null);
        D0(view);
        o0();
    }
}
