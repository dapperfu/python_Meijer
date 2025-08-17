package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class W0 extends V0 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f20381K;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f20382L;

    /* renamed from: J, reason: collision with root package name */
    private long f20383J;

    public W0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 10, f20381K, f20382L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20383J = 0L;
        }
        androidx.databinding.p.Y(this.f20369G);
        androidx.databinding.p.Y(this.f20364B);
        androidx.databinding.p.Y(this.f20367E);
        androidx.databinding.p.Y(this.f20363A);
        androidx.databinding.p.Y(this.f20368F);
        androidx.databinding.p.Y(this.f20372z);
        androidx.databinding.p.Y(this.f20371I);
        androidx.databinding.p.Y(this.f20365C);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20383J != 0) {
                    return true;
                }
                return this.f20369G.h0() || this.f20364B.h0() || this.f20367E.h0() || this.f20363A.h0() || this.f20368F.h0() || this.f20372z.h0() || this.f20371I.h0() || this.f20365C.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20383J = 256L;
        }
        this.f20369G.o0();
        this.f20364B.o0();
        this.f20367E.o0();
        this.f20363A.o0();
        this.f20368F.o0();
        this.f20372z.o0();
        this.f20371I.o0();
        this.f20365C.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(10);
        f20381K = iVar;
        iVar.a(0, new String[]{"checkout_item_pickup_store", "checkout_item_delivery_address", "checkout_item_fulfillment_slot", "checkout_item_contact_information", "checkout_item_pickup_person", "checkout_item_cart_items", "checkout_item_substitute_preference", "checkout_item_delivery_note"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{com.meijer.mobile.meijer.V.f99355W, com.meijer.mobile.meijer.V.f99347S, com.meijer.mobile.meijer.V.f99351U, com.meijer.mobile.meijer.V.f99345R, com.meijer.mobile.meijer.V.f99353V, com.meijer.mobile.meijer.V.f99343Q, com.meijer.mobile.meijer.V.f99357X, com.meijer.mobile.meijer.V.f99349T});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20382L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98977V2, 9);
    }

    private W0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 8, (F0) objArr[6], (H0) objArr[4], (J0) objArr[2], (L0) objArr[8], (TextView) objArr[9], (N0) objArr[3], (P0) objArr[5], (R0) objArr[1], (LinearLayout) objArr[0], (T0) objArr[7]);
        this.f20383J = -1L;
        C0(this.f20372z);
        C0(this.f20363A);
        C0(this.f20364B);
        C0(this.f20365C);
        C0(this.f20367E);
        C0(this.f20368F);
        C0(this.f20369G);
        this.f20370H.setTag(null);
        C0(this.f20371I);
        D0(view);
        o0();
    }

    private boolean K0(F0 f02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 64;
        }
        return true;
    }

    private boolean M0(H0 h02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 32;
        }
        return true;
    }

    private boolean O0(J0 j02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 1;
        }
        return true;
    }

    private boolean P0(L0 l02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 4;
        }
        return true;
    }

    private boolean Q0(N0 n02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 2;
        }
        return true;
    }

    private boolean T0(P0 p02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 16;
        }
        return true;
    }

    private boolean W0(R0 r02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 8;
        }
        return true;
    }

    private boolean Y0(T0 t02, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20383J |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return O0((J0) obj, i11);
            case 1:
                return Q0((N0) obj, i11);
            case 2:
                return P0((L0) obj, i11);
            case 3:
                return W0((R0) obj, i11);
            case 4:
                return T0((P0) obj, i11);
            case 5:
                return M0((H0) obj, i11);
            case 6:
                return K0((F0) obj, i11);
            case 7:
                return Y0((T0) obj, i11);
            default:
                return false;
        }
    }
}
