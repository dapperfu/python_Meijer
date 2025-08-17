package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class S2 extends R2 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20316G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20317H;

    /* renamed from: F, reason: collision with root package name */
    private long f20318F;

    public S2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20316G, f20317H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20318F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20318F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20318F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20317H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99068e, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99046c, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99057d, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99024a, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99035b, 5);
    }

    private S2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[4], (View) objArr[5], (ImageView) objArr[2], (TextView) objArr[3], (View) objArr[1]);
        this.f20318F = -1L;
        this.f20305z.setTag(null);
        D0(view);
        o0();
    }
}
