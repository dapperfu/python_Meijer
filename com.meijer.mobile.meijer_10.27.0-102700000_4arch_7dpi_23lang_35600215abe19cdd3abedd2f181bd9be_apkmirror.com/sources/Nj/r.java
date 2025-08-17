package Nj;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes7.dex */
public class r extends q {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f22164G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f22165H;

    /* renamed from: E, reason: collision with root package name */
    private final ScrollView f22166E;

    /* renamed from: F, reason: collision with root package name */
    private long f22167F;

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f22164G, f22165H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22167F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22167F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f22167F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22165H = sparseIntArray;
        sparseIntArray.put(Bj.k.f2880h, 1);
        sparseIntArray.put(Bj.k.f2903o1, 2);
        sparseIntArray.put(Bj.k.f2909q1, 3);
        sparseIntArray.put(Bj.k.f2900n1, 4);
        sparseIntArray.put(Bj.k.f2906p1, 5);
    }

    private r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[1], (TextView) objArr[4], (ImageView) objArr[2], (TextView) objArr[5], (TextView) objArr[3]);
        this.f22167F = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f22166E = scrollView;
        scrollView.setTag(null);
        D0(view);
        o0();
    }
}
