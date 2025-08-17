package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class E0 extends D0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f19980E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f19981F;

    /* renamed from: D, reason: collision with root package name */
    private long f19982D;

    public E0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f19980E, f19981F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19982D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19982D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19982D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19981F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98815F0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98804E0, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98793D0, 3);
    }

    private E0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (ListCardView) objArr[0]);
        this.f19982D = -1L;
        this.f19956C.setTag(null);
        D0(view);
        o0();
    }
}
