package Oj;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes8.dex */
public class r extends q {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f24409G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f24410H;

    /* renamed from: E, reason: collision with root package name */
    private final ScrollView f24411E;

    /* renamed from: F, reason: collision with root package name */
    private long f24412F;

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f24409G, f24410H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f24412F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f24412F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f24412F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24410H = sparseIntArray;
        sparseIntArray.put(Cj.k.f4925h, 1);
        sparseIntArray.put(Cj.k.f4948o1, 2);
        sparseIntArray.put(Cj.k.f4954q1, 3);
        sparseIntArray.put(Cj.k.f4945n1, 4);
        sparseIntArray.put(Cj.k.f4951p1, 5);
    }

    private r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[1], (TextView) objArr[4], (ImageView) objArr[2], (TextView) objArr[5], (TextView) objArr[3]);
        this.f24412F = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f24411E = scrollView;
        scrollView.setTag(null);
        B0(view);
        l0();
    }
}
