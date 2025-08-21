package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.o1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4273o1 extends AbstractC4269n1 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22166F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22167G;

    /* renamed from: E, reason: collision with root package name */
    private long f22168E;

    public C4273o1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f22166F, f22167G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22168E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22168E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22168E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22167G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99869Y8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99879Z8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99859X8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100081s2, 4);
    }

    private C4273o1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Group) objArr[4], (ConstraintLayout) objArr[0], (MaterialButton) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f22168E = -1L;
        this.f22140A.setTag(null);
        B0(view);
        l0();
    }
}
