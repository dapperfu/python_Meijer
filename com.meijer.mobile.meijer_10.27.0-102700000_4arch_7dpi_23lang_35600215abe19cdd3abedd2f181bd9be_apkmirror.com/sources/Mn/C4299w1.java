package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;

/* renamed from: Mn.w1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4299w1 extends AbstractC4295v1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21066C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21067D;

    /* renamed from: A, reason: collision with root package name */
    private final LinearLayout f21068A;

    /* renamed from: B, reason: collision with root package name */
    private long f21069B;

    public C4299w1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f21066C, f21067D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21069B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21069B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21069B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21067D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99212r0, 1);
    }

    private C4299w1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f21069B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f21068A = linearLayout;
        linearLayout.setTag(null);
        D0(view);
        o0();
    }
}
