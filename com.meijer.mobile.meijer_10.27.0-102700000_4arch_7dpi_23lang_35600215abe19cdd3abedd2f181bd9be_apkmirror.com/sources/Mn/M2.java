package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class M2 extends L2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20220D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20221E = null;

    /* renamed from: C, reason: collision with root package name */
    private long f20222C;

    public M2(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 3, f20220D, f20221E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20222C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20222C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20222C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private M2(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (TextView) objArr[2], (ImageView) objArr[0], (TextView) objArr[1]);
        this.f20222C = -1L;
        this.f20188z.setTag(null);
        this.f20186A.setTag(null);
        this.f20187B.setTag(null);
        E0(viewArr);
        o0();
    }
}
