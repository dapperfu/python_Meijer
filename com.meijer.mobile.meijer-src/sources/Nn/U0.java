package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class U0 extends T0 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21680C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21681D;

    /* renamed from: B, reason: collision with root package name */
    private long f21682B;

    public U0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21680C, f21681D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21682B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21682B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21682B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21681D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99966h8, 1);
    }

    private U0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1], (ListCardView) objArr[0]);
        this.f21682B = -1L;
        this.f21667A.setTag(null);
        B0(view);
        l0();
    }
}
