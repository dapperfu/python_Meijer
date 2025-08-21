package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Nn.s2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4289s2 extends AbstractC4285r2 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f22283C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f22284D;

    /* renamed from: A, reason: collision with root package name */
    private final LinearLayout f22285A;

    /* renamed from: B, reason: collision with root package name */
    private long f22286B;

    public C4289s2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f22283C, f22284D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22286B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22286B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22286B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22284D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100116v4, 1);
    }

    private C4289s2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1]);
        this.f22286B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22285A = linearLayout;
        linearLayout.setTag(null);
        B0(view);
        l0();
    }
}
