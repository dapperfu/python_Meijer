package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class C0 extends B0 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f19936G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f19937H;

    /* renamed from: F, reason: collision with root package name */
    private long f19938F;

    public C0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f19936G, f19937H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19938F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19938F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19938F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19937H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99069e0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99047c0, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99058d0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99025a0, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99036b0, 5);
    }

    private C0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1]);
        this.f19938F = -1L;
        this.f19903z.setTag(null);
        D0(view);
        o0();
    }
}
