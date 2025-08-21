package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Nn.i3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4250i3 extends AbstractC4245h3 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22023F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22024G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f22025D;

    /* renamed from: E, reason: collision with root package name */
    private long f22026E;

    public C4250i3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f22023F, f22024G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22026E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22026E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22026E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22024G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99800S, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99780Q, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99790R, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99824U3, 4);
    }

    private C4250i3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (TextView) objArr[1], (ProgressBar) objArr[4]);
        this.f22026E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22025D = linearLayout;
        linearLayout.setTag(null);
        B0(view);
        l0();
    }
}
