package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class Y0 extends X0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20407F;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20408G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f20409D;

    /* renamed from: E, reason: collision with root package name */
    private long f20410E;

    public Y0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f20407F, f20408G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20410E = 0L;
        }
        androidx.databinding.p.Y(this.f20394A);
        androidx.databinding.p.Y(this.f20397z);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20410E != 0) {
                    return true;
                }
                return this.f20394A.h0() || this.f20397z.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20410E = 4L;
        }
        this.f20394A.o0();
        this.f20397z.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(5);
        f20407F = iVar;
        iVar.a(1, new String[]{"checkout_item_card_info", "checkout_item_billing_address"}, new int[]{2, 3}, new int[]{com.meijer.mobile.meijer.V.f99341P, com.meijer.mobile.meijer.V.f99339O});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20408G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99019Z4, 4);
    }

    private Y0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (B0) objArr[3], (D0) objArr[2], (TextView) objArr[4], (LinearLayout) objArr[0]);
        this.f20410E = -1L;
        C0(this.f20397z);
        C0(this.f20394A);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f20409D = linearLayout;
        linearLayout.setTag(null);
        this.f20396C.setTag(null);
        D0(view);
        o0();
    }

    private boolean K0(B0 b02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20410E |= 1;
        }
        return true;
    }

    private boolean M0(D0 d02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20410E |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return K0((B0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return M0((D0) obj, i11);
    }
}
