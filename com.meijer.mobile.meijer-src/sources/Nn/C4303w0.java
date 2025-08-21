package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4303w0 extends AbstractC4299v0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22395F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22396G;

    /* renamed from: E, reason: collision with root package name */
    private long f22397E;

    public C4303w0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f22395F, f22396G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22397E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22397E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22397E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22396G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99721K0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99701I0, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99691H0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99711J0, 4);
    }

    private C4303w0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[3], (TextView) objArr[2], (MaterialButton) objArr[4], (TextView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f22397E = -1L;
        this.f22373D.setTag(null);
        B0(view);
        l0();
    }
}
