package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class I1 extends H1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20122D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20123E;

    /* renamed from: C, reason: collision with root package name */
    private long f20124C;

    public I1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20122D, f20123E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20124C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20124C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20124C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20123E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98903N8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98892M7, 2);
    }

    private I1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (ConstraintLayout) objArr[0], (TextView) objArr[1]);
        this.f20124C = -1L;
        this.f20063A.setTag(null);
        D0(view);
        o0();
    }
}
