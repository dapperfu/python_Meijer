package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;

/* loaded from: classes9.dex */
public class O1 extends N1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20251D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20252E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20253B;

    /* renamed from: C, reason: collision with root package name */
    private long f20254C;

    public O1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20251D, f20252E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20254C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20254C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20254C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20252E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99293y4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99070e1, 2);
    }

    private O1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (CalloutView) objArr[1]);
        this.f20254C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20253B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
