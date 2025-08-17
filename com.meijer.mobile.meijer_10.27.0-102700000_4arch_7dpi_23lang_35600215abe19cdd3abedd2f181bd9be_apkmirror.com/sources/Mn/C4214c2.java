package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.c2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4214c2 extends AbstractC4209b2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20502D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20503E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20504B;

    /* renamed from: C, reason: collision with root package name */
    private long f20505C;

    public C4214c2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20502D, f20503E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20505C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20505C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20505C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20503E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99081f1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99037b1, 2);
    }

    private C4214c2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[2], (TextView) objArr[1]);
        this.f20505C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20504B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
