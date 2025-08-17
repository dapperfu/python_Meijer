package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class W2 extends V2 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20387C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20388D;

    /* renamed from: B, reason: collision with root package name */
    private long f20389B;

    public W2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 2, f20387C, f20388D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20389B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20389B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20389B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20388D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98773B2, 1);
    }

    private W2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (RelativeLayout) objArr[0], (ImageButton) objArr[1]);
        this.f20389B = -1L;
        this.f20377z.setTag(null);
        E0(viewArr);
        o0();
    }
}
