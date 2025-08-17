package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class I0 extends H0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20119E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20120F;

    /* renamed from: D, reason: collision with root package name */
    private long f20121D;

    public I0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20119E, f20120F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20121D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20121D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20121D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20120F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99202q1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99224s1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99213r1, 3);
    }

    private I0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[2]);
        this.f20121D = -1L;
        this.f20062z.setTag(null);
        D0(view);
        o0();
    }
}
