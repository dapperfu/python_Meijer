package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class K0 extends J0 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20166G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20167H;

    /* renamed from: F, reason: collision with root package name */
    private long f20168F;

    public K0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20166G, f20167H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20168F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20168F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20168F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20167H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98846I1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98826G1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98836H1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98805E1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98816F1, 5);
    }

    private K0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1]);
        this.f20168F = -1L;
        this.f20141z.setTag(null);
        D0(view);
        o0();
    }
}
