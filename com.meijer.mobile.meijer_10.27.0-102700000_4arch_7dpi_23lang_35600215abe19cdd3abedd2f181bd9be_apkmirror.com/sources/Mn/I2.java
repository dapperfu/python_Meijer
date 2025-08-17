package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.widget.MeijerEditText;

/* loaded from: classes9.dex */
public class I2 extends H2 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20125E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20126F;

    /* renamed from: D, reason: collision with root package name */
    private long f20127D;

    public I2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20125E, f20126F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20127D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20127D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20127D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20126F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99131j7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99109h7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99098g7, 3);
    }

    private I2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[3], (MeijerEditText) objArr[2], (ImageButton) objArr[1], (ConstraintLayout) objArr[0]);
        this.f20127D = -1L;
        this.f20068C.setTag(null);
        D0(view);
        o0();
    }
}
