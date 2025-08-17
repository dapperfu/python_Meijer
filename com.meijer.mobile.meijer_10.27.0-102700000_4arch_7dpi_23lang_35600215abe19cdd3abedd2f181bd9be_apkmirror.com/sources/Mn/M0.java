package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class M0 extends L0 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20213C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20214D;

    /* renamed from: B, reason: collision with root package name */
    private long f20215B;

    public M0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20213C, f20214D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20215B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20215B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20215B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20214D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98856J1, 1);
    }

    private M0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ListCardView) objArr[0], (TextView) objArr[1]);
        this.f20215B = -1L;
        this.f20180z.setTag(null);
        D0(view);
        o0();
    }
}
