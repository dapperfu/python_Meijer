package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.g2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4234g2 extends AbstractC4229f2 {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f20636I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f20637J;

    /* renamed from: H, reason: collision with root package name */
    private long f20638H;

    public C4234g2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 8, f20636I, f20637J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20638H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20638H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20638H = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20637J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98958T3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99246u1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99088f8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98972U7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98982V7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99002X7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98992W7, 7);
    }

    private C4234g2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CardView) objArr[0], (TextView) objArr[2], (ConstraintLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3]);
        this.f20638H = -1L;
        this.f20616z.setTag(null);
        D0(view);
        o0();
    }
}
