package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.a1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4208a1 extends Z0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21796D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21797E;

    /* renamed from: C, reason: collision with root package name */
    private long f21798C;

    public C4208a1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21796D, f21797E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21798C;
            this.f21798C = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f21765B, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21798C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21798C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21797E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99629B1, 2);
    }

    private C4208a1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[2], (TextView) objArr[1]);
        this.f21798C = -1L;
        this.f21766z.setTag(null);
        this.f21765B.setTag(null);
        B0(view);
        l0();
    }
}
