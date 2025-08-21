package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class E0 extends D0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f21312E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f21313F;

    /* renamed from: D, reason: collision with root package name */
    private long f21314D;

    public E0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21312E, f21313F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21314D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21314D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21314D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21313F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99671F0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99661E0, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99650D0, 3);
    }

    private E0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (ListCardView) objArr[0]);
        this.f21314D = -1L;
        this.f21288C.setTag(null);
        B0(view);
        l0();
    }
}
