package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.g1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4238g1 extends AbstractC4233f1 {

    /* renamed from: Q, reason: collision with root package name */
    private static final p.i f21964Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static final SparseIntArray f21965R;

    /* renamed from: O, reason: collision with root package name */
    private final ConstraintLayout f21966O;

    /* renamed from: P, reason: collision with root package name */
    private long f21967P;

    public C4238g1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 16, f21964Q, f21965R));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21967P;
            this.f21967P = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.c(this.f21936K, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21967P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21967P = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21965R = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99756N5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99706I5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99760O, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99801S0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99644C5, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99716J5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99826U5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99685G4, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100047p1, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99786Q5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100036o1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99776P5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99796R5, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99840W, 15);
    }

    private C4238g1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[4], (Barrier) objArr[15], (ImageButton) objArr[5], (View) objArr[12], (View) objArr[10], (MaterialTextView) objArr[9], (ImageView) objArr[6], (MaterialTextView) objArr[3], (MaterialTextView) objArr[7], (MaterialTextView) objArr[2], (MaterialTextView) objArr[13], (ConstraintLayout) objArr[1], (RecyclerView) objArr[11], (MaterialTextView) objArr[14], (MaterialTextView) objArr[8]);
        this.f21967P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21966O = constraintLayout;
        constraintLayout.setTag(null);
        this.f21936K.setTag(null);
        B0(view);
        l0();
    }
}
