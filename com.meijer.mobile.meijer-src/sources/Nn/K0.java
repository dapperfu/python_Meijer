package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class K0 extends J0 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21498G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21499H;

    /* renamed from: F, reason: collision with root package name */
    private long f21500F;

    public K0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21498G, f21499H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21500F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21500F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21500F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21499H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99702I1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99682G1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99692H1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99662E1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99672F1, 5);
    }

    private K0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1]);
        this.f21500F = -1L;
        this.f21473z.setTag(null);
        B0(view);
        l0();
    }
}
