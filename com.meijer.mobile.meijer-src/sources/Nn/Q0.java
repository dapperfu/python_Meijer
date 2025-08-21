package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class Q0 extends P0 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21616G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21617H;

    /* renamed from: F, reason: collision with root package name */
    private long f21618F;

    public Q0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21616G, f21617H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21618F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21618F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21618F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21617H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99952g5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99930e5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99963h5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100018m5, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99941f5, 5);
    }

    private Q0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4]);
        this.f21618F = -1L;
        this.f21600z.setTag(null);
        B0(view);
        l0();
    }
}
