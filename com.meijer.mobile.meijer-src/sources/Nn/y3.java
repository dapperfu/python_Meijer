package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class y3 extends x3 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f22474H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f22475I;

    /* renamed from: F, reason: collision with root package name */
    private final LinearLayout f22476F;

    /* renamed from: G, reason: collision with root package name */
    private long f22477G;

    public y3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 7, f22474H, f22475I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22477G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22477G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22477G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22475I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99635B7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99624A7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100152y7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100163z7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99657D7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99646C7, 6);
    }

    private y3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[5]);
        this.f22477G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22476F = linearLayout;
        linearLayout.setTag(null);
        D0(viewArr);
        l0();
    }
}
