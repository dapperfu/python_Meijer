package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class Q0 extends P0 {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20284G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20285H;

    /* renamed from: F, reason: collision with root package name */
    private long f20286F;

    public Q0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20284G, f20285H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20286F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20286F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20286F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20285H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99096g5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99074e5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99107h5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99162m5, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99085f5, 5);
    }

    private Q0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4]);
        this.f20286F = -1L;
        this.f20268z.setTag(null);
        D0(view);
        o0();
    }
}
