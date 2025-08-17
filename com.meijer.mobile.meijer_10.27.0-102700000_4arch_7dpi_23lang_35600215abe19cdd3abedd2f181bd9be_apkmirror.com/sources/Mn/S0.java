package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class S0 extends R0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20310F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20311G;

    /* renamed from: E, reason: collision with root package name */
    private long f20312E;

    public S0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f20310F, f20311G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20312E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20312E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20312E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20311G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99151l5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99129j5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99118i5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99140k5, 4);
    }

    private S0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (TextView) objArr[2], (ListCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[1]);
        this.f20312E = -1L;
        this.f20295B.setTag(null);
        D0(view);
        o0();
    }
}
