package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class U2 extends T2 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21686G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21687H;

    /* renamed from: F, reason: collision with root package name */
    private long f21688F;

    public U2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21686G, f21687H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21688F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21688F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21688F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21687H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99898b6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99866Y5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99887a6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99909c6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99876Z5, 5);
    }

    private U2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageButton) objArr[2], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[4]);
        this.f21688F = -1L;
        this.f21675z.setTag(null);
        B0(view);
        l0();
    }
}
