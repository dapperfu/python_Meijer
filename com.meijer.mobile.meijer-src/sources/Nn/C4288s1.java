package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.s1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4288s1 extends AbstractC4284r1 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f22280K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f22281L;

    /* renamed from: J, reason: collision with root package name */
    private long f22282J;

    public C4288s1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 10, f22280K, f22281L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22282J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22282J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22282J = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22281L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99727K6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99717J6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99737L6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100155z, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100144y, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99616A, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100156z0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100145y0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99617A0, 9);
    }

    private C4288s1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[5], (TableRow) objArr[4], (MaterialTextView) objArr[6], (ImageView) objArr[8], (TableRow) objArr[7], (MaterialTextView) objArr[9], (ConstraintLayout) objArr[0], (ImageView) objArr[2], (TableRow) objArr[1], (MaterialTextView) objArr[3]);
        this.f22282J = -1L;
        this.f22246F.setTag(null);
        B0(view);
        l0();
    }
}
