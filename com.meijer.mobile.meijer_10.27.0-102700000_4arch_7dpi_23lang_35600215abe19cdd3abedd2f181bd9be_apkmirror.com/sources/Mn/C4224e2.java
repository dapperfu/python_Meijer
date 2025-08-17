package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Mn.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4224e2 extends AbstractC4219d2 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f20577H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f20578I;

    /* renamed from: G, reason: collision with root package name */
    private long f20579G;

    public C4224e2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 7, f20577H, f20578I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20579G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20579G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20579G = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20578I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99018Z3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99077e8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99088f8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98972U7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98992W7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98878L3, 6);
    }

    private C4224e2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[6], (RelativeLayout) objArr[0], (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f20579G = -1L;
        this.f20523A.setTag(null);
        D0(view);
        o0();
    }
}
