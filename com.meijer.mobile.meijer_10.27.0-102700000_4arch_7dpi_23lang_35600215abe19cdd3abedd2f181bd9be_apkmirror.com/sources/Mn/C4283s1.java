package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.s1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4283s1 extends AbstractC4279r1 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f20948K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f20949L;

    /* renamed from: J, reason: collision with root package name */
    private long f20950J;

    public C4283s1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 10, f20948K, f20949L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20950J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20950J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20950J = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20949L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98881L6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98871K6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98891M6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99299z, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99288y, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98759A, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99300z0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99289y0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98760A0, 9);
    }

    private C4283s1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[5], (TableRow) objArr[4], (MaterialTextView) objArr[6], (ImageView) objArr[8], (TableRow) objArr[7], (MaterialTextView) objArr[9], (ConstraintLayout) objArr[0], (ImageView) objArr[2], (TableRow) objArr[1], (MaterialTextView) objArr[3]);
        this.f20950J = -1L;
        this.f20914F.setTag(null);
        D0(view);
        o0();
    }
}
