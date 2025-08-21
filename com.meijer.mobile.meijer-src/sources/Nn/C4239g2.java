package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.g2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4239g2 extends AbstractC4234f2 {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f21968I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f21969J;

    /* renamed from: H, reason: collision with root package name */
    private long f21970H;

    public C4239g2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 8, f21968I, f21969J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21970H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21970H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21970H = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21969J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99814T3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100102u1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99933e8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99818T7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99828U7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99848W7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99838V7, 7);
    }

    private C4239g2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[0], (TextView) objArr[2], (ConstraintLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3]);
        this.f21970H = -1L;
        this.f21948z.setTag(null);
        B0(view);
        l0();
    }
}
