package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.p;

/* renamed from: Nn.e3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4230e3 extends AbstractC4225d3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21912C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21913D;

    /* renamed from: B, reason: collision with root package name */
    private long f21914B;

    public C4230e3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21912C, f21913D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21914B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21914B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21914B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21913D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99733L2, 1);
    }

    private C4230e3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[1], (LinearLayout) objArr[0]);
        this.f21914B = -1L;
        this.f21862A.setTag(null);
        B0(view);
        l0();
    }
}
