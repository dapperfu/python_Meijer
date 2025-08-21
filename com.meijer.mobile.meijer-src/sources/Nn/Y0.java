package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class Y0 extends X0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21739F;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21740G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f21741D;

    /* renamed from: E, reason: collision with root package name */
    private long f21742E;

    public Y0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f21739F, f21740G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21742E = 0L;
        }
        androidx.databinding.p.Z(this.f21726A);
        androidx.databinding.p.Z(this.f21729z);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21742E != 0) {
                    return true;
                }
                return this.f21726A.h0() || this.f21729z.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21742E = 4L;
        }
        this.f21726A.l0();
        this.f21729z.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(5);
        f21739F = iVar;
        iVar.a(1, new String[]{"checkout_item_card_info", "checkout_item_billing_address"}, new int[]{2, 3}, new int[]{com.meijer.mobile.meijer.V.f100197P, com.meijer.mobile.meijer.V.f100195O});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21740G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99875Z4, 4);
    }

    private Y0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (B0) objArr[3], (D0) objArr[2], (TextView) objArr[4], (LinearLayout) objArr[0]);
        this.f21742E = -1L;
        A0(this.f21729z);
        A0(this.f21726A);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f21741D = linearLayout;
        linearLayout.setTag(null);
        this.f21728C.setTag(null);
        B0(view);
        l0();
    }

    private boolean M0(B0 b02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21742E |= 1;
        }
        return true;
    }

    private boolean N0(D0 d02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21742E |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return M0((B0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return N0((D0) obj, i11);
    }
}
