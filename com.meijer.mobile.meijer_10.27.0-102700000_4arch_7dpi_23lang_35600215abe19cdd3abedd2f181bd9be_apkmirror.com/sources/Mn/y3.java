package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class y3 extends x3 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21142H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21143I;

    /* renamed from: F, reason: collision with root package name */
    private final LinearLayout f21144F;

    /* renamed from: G, reason: collision with root package name */
    private long f21145G;

    public y3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 7, f21142H, f21143I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21145G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21145G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21145G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21143I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98789C7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98778B7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99307z7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98767A7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98811E7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98800D7, 6);
    }

    private y3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[5]);
        this.f21145G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f21144F = linearLayout;
        linearLayout.setTag(null);
        E0(viewArr);
        o0();
    }
}
