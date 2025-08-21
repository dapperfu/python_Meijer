package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.CalloutView;

/* loaded from: classes10.dex */
public class O1 extends N1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21583D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21584E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f21585B;

    /* renamed from: C, reason: collision with root package name */
    private long f21586C;

    public O1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21583D, f21584E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21586C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21586C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21586C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21584E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100149y4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99926e1, 2);
    }

    private O1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (CalloutView) objArr[1]);
        this.f21586C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21585B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
