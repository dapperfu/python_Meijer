package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.o1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4268o1 extends AbstractC4264n1 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20834F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20835G;

    /* renamed from: E, reason: collision with root package name */
    private long f20836E;

    public C4268o1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f20834F, f20835G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20836E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20836E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20836E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20835G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99023Z8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99034a9, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99013Y8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99225s2, 4);
    }

    private C4268o1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Group) objArr[4], (ConstraintLayout) objArr[0], (MaterialButton) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f20836E = -1L;
        this.f20808A.setTag(null);
        D0(view);
        o0();
    }
}
