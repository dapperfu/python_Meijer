package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class W0 extends V0 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f21713K;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f21714L;

    /* renamed from: J, reason: collision with root package name */
    private long f21715J;

    public W0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 10, f21713K, f21714L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21715J = 0L;
        }
        androidx.databinding.p.Z(this.f21701G);
        androidx.databinding.p.Z(this.f21696B);
        androidx.databinding.p.Z(this.f21699E);
        androidx.databinding.p.Z(this.f21695A);
        androidx.databinding.p.Z(this.f21700F);
        androidx.databinding.p.Z(this.f21704z);
        androidx.databinding.p.Z(this.f21703I);
        androidx.databinding.p.Z(this.f21697C);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21715J != 0) {
                    return true;
                }
                return this.f21701G.h0() || this.f21696B.h0() || this.f21699E.h0() || this.f21695A.h0() || this.f21700F.h0() || this.f21704z.h0() || this.f21703I.h0() || this.f21697C.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21715J = 256L;
        }
        this.f21701G.l0();
        this.f21696B.l0();
        this.f21699E.l0();
        this.f21695A.l0();
        this.f21700F.l0();
        this.f21704z.l0();
        this.f21703I.l0();
        this.f21697C.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(10);
        f21713K = iVar;
        iVar.a(0, new String[]{"checkout_item_pickup_store", "checkout_item_delivery_address", "checkout_item_fulfillment_slot", "checkout_item_contact_information", "checkout_item_pickup_person", "checkout_item_cart_items", "checkout_item_substitute_preference", "checkout_item_delivery_note"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{com.meijer.mobile.meijer.V.f100211W, com.meijer.mobile.meijer.V.f100203S, com.meijer.mobile.meijer.V.f100207U, com.meijer.mobile.meijer.V.f100201R, com.meijer.mobile.meijer.V.f100209V, com.meijer.mobile.meijer.V.f100199Q, com.meijer.mobile.meijer.V.f100213X, com.meijer.mobile.meijer.V.f100205T});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21714L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99833V2, 9);
    }

    private W0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 8, (F0) objArr[6], (H0) objArr[4], (J0) objArr[2], (L0) objArr[8], (TextView) objArr[9], (N0) objArr[3], (P0) objArr[5], (R0) objArr[1], (LinearLayout) objArr[0], (T0) objArr[7]);
        this.f21715J = -1L;
        A0(this.f21704z);
        A0(this.f21695A);
        A0(this.f21696B);
        A0(this.f21697C);
        A0(this.f21699E);
        A0(this.f21700F);
        A0(this.f21701G);
        this.f21702H.setTag(null);
        A0(this.f21703I);
        B0(view);
        l0();
    }

    private boolean M0(F0 f02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 64;
        }
        return true;
    }

    private boolean N0(H0 h02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 32;
        }
        return true;
    }

    private boolean O0(J0 j02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 1;
        }
        return true;
    }

    private boolean R0(L0 l02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 4;
        }
        return true;
    }

    private boolean U0(N0 n02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 2;
        }
        return true;
    }

    private boolean V0(P0 p02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 16;
        }
        return true;
    }

    private boolean X0(R0 r02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 8;
        }
        return true;
    }

    private boolean b1(T0 t02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21715J |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return O0((J0) obj, i11);
            case 1:
                return U0((N0) obj, i11);
            case 2:
                return R0((L0) obj, i11);
            case 3:
                return X0((R0) obj, i11);
            case 4:
                return V0((P0) obj, i11);
            case 5:
                return N0((H0) obj, i11);
            case 6:
                return M0((F0) obj, i11);
            case 7:
                return b1((T0) obj, i11);
            default:
                return false;
        }
    }
}
