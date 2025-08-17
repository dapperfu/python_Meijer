package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class O0 extends N0 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f20248H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f20249I;

    /* renamed from: G, reason: collision with root package name */
    private long f20250G;

    public O0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 7, f20248H, f20249I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20250G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20250G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20250G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20249I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99007Y2, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98997X2, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99039b3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99017Z2, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99028a3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 6);
    }

    private O0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (ProgressBar) objArr[6]);
        this.f20250G = -1L;
        this.f20232z.setTag(null);
        D0(view);
        o0();
    }
}
