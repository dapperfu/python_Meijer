package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.k2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4258k2 extends AbstractC4254j2 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f22095E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f22096F;

    /* renamed from: D, reason: collision with root package name */
    private long f22097D;

    public C4258k2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f22095E, f22096F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22097D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22097D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22097D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22096F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99774P3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100034o, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100023n, 3);
    }

    private C4258k2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f22097D = -1L;
        this.f22062C.setTag(null);
        B0(view);
        l0();
    }
}
