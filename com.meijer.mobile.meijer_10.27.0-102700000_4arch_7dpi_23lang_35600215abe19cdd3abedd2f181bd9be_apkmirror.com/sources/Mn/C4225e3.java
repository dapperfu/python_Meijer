package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.p;

/* renamed from: Mn.e3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4225e3 extends AbstractC4220d3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20580C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20581D;

    /* renamed from: B, reason: collision with root package name */
    private long f20582B;

    public C4225e3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20580C, f20581D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20582B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20582B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20582B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20581D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98877L2, 1);
    }

    private C4225e3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[1], (LinearLayout) objArr[0]);
        this.f20582B = -1L;
        this.f20530A.setTag(null);
        D0(view);
        o0();
    }
}
