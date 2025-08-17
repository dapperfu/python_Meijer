package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class U2 extends T2 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20354G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20355H;

    /* renamed from: F, reason: collision with root package name */
    private long f20356F;

    public U2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20354G, f20355H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20356F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20356F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20356F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20355H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99053c6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99020Z5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99042b6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99064d6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99031a6, 5);
    }

    private U2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageButton) objArr[2], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[4]);
        this.f20356F = -1L;
        this.f20343z.setTag(null);
        D0(view);
        o0();
    }
}
