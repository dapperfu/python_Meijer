package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class S0 extends R0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21642F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21643G;

    /* renamed from: E, reason: collision with root package name */
    private long f21644E;

    public S0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f21642F, f21643G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21644E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21644E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21644E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21643G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100007l5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99985j5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99974i5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99996k5, 4);
    }

    private S0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (TextView) objArr[2], (ListCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[1]);
        this.f21644E = -1L;
        this.f21627B.setTag(null);
        B0(view);
        l0();
    }
}
