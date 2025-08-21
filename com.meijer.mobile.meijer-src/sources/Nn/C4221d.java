package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.widget.MPerksBarcodeView;

/* renamed from: Nn.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4221d extends AbstractC4216c {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21842H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21843I;

    /* renamed from: G, reason: collision with root package name */
    private long f21844G;

    public C4221d(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 7, f21842H, f21843I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21844G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21844G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21844G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21843I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99762O1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99940f4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99770P, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99810T, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100090t0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99935f, 6);
    }

    private C4221d(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[6], (ImageView) objArr[3], (MPerksBarcodeView) objArr[4], (View) objArr[5], (ConstraintLayout) objArr[1], (FrameLayout) objArr[0], (ImageView) objArr[2]);
        this.f21844G = -1L;
        this.f21824E.setTag(null);
        B0(view);
        l0();
    }
}
