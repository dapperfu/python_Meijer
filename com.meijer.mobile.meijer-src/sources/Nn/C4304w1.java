package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;

/* renamed from: Nn.w1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4304w1 extends AbstractC4300v1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f22398C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f22399D;

    /* renamed from: A, reason: collision with root package name */
    private final LinearLayout f22400A;

    /* renamed from: B, reason: collision with root package name */
    private long f22401B;

    public C4304w1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f22398C, f22399D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22401B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22401B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22401B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22399D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100068r0, 1);
    }

    private C4304w1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f22401B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22400A = linearLayout;
        linearLayout.setTag(null);
        B0(view);
        l0();
    }
}
