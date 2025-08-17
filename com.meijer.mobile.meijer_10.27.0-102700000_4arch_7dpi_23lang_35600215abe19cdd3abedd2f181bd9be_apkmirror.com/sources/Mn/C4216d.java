package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.widget.MPerksBarcodeView;

/* renamed from: Mn.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4216d extends AbstractC4211c {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f20510H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f20511I;

    /* renamed from: G, reason: collision with root package name */
    private long f20512G;

    public C4216d(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 7, f20510H, f20511I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20512G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20512G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20512G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20511I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98906O1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99084f4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98914P, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98954T, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99234t0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99079f, 6);
    }

    private C4216d(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[6], (ImageView) objArr[3], (MPerksBarcodeView) objArr[4], (View) objArr[5], (ConstraintLayout) objArr[1], (FrameLayout) objArr[0], (ImageView) objArr[2]);
        this.f20512G = -1L;
        this.f20492E.setTag(null);
        D0(view);
        o0();
    }
}
