package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class O0 extends N0 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21580H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21581I;

    /* renamed from: G, reason: collision with root package name */
    private long f21582G;

    public O0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 7, f21580H, f21581I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21582G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21582G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21582G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21581I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99863Y2, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99853X2, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99895b3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99873Z2, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99884a3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 6);
    }

    private O0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (ProgressBar) objArr[6]);
        this.f21582G = -1L;
        this.f21564z.setTag(null);
        B0(view);
        l0();
    }
}
