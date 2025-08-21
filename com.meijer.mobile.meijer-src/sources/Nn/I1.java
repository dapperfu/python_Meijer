package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class I1 extends H1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21454D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21455E;

    /* renamed from: C, reason: collision with root package name */
    private long f21456C;

    public I1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21454D, f21455E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21456C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21456C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21456C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21455E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99749M8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99738L7, 2);
    }

    private I1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (ConstraintLayout) objArr[0], (TextView) objArr[1]);
        this.f21456C = -1L;
        this.f21395A.setTag(null);
        B0(view);
        l0();
    }
}
