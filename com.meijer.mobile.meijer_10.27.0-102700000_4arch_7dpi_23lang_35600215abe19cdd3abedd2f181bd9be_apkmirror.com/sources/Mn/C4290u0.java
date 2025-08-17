package Mn;

import Nn.a;
import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;

/* renamed from: Mn.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4290u0 extends AbstractC4286t0 implements a.InterfaceC0367a {

    /* renamed from: S, reason: collision with root package name */
    private static final p.i f21014S = null;

    /* renamed from: T, reason: collision with root package name */
    private static final SparseIntArray f21015T;

    /* renamed from: L, reason: collision with root package name */
    private final View.OnClickListener f21016L;

    /* renamed from: M, reason: collision with root package name */
    private final View.OnClickListener f21017M;

    /* renamed from: N, reason: collision with root package name */
    private final View.OnClickListener f21018N;

    /* renamed from: O, reason: collision with root package name */
    private final View.OnClickListener f21019O;

    /* renamed from: P, reason: collision with root package name */
    private final View.OnClickListener f21020P;

    /* renamed from: Q, reason: collision with root package name */
    private final View.OnClickListener f21021Q;

    /* renamed from: R, reason: collision with root package name */
    private long f21022R;

    public C4290u0(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 11, f21014S, f21015T));
    }

    private boolean P0(NavBarItem navBarItem, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f21022R |= 1;
            }
            return true;
        }
        if (i10 == 8) {
            synchronized (this) {
                this.f21022R |= 24;
            }
            return true;
        }
        if (i10 == 7) {
            synchronized (this) {
                this.f21022R |= 8;
            }
            return true;
        }
        if (i10 == 6) {
            synchronized (this) {
                this.f21022R |= 16;
            }
            return true;
        }
        if (i10 == 2) {
            synchronized (this) {
                this.f21022R |= 32;
            }
            return true;
        }
        if (i10 == 3) {
            synchronized (this) {
                this.f21022R |= 36;
            }
            return true;
        }
        if (i10 != 13) {
            return false;
        }
        synchronized (this) {
            this.f21022R |= 64;
        }
        return true;
    }

    @Override // Mn.AbstractC4286t0
    public void O0(NavBarItem navBarItem) {
        H0(0, navBarItem);
        this.f20973K = navBarItem;
        synchronized (this) {
            this.f21022R |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21022R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21022R = 128L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21015T = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99138k3, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99008Y3, 10);
    }

    private C4290u0(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 3, (MaterialToolbar) objArr[0], (ImageButton) objArr[6], (ComposeView) objArr[8], (TextView) objArr[1], (ConstraintLayout) objArr[9], (ImageView) objArr[10], (ImageView) objArr[5], (TextView) objArr[3], (ConstraintLayout) objArr[2], (ImageView) objArr[4], (ImageButton) objArr[7]);
        this.f21022R = -1L;
        this.f20974z.setTag(null);
        this.f20963A.setTag(null);
        this.f20964B.setTag(null);
        this.f20965C.setTag(null);
        this.f20968F.setTag(null);
        this.f20969G.setTag(null);
        this.f20970H.setTag(null);
        this.f20971I.setTag(null);
        this.f20972J.setTag(null);
        E0(viewArr);
        this.f21016L = new Nn.a(this, 6);
        this.f21017M = new Nn.a(this, 4);
        this.f21018N = new Nn.a(this, 2);
        this.f21019O = new Nn.a(this, 5);
        this.f21020P = new Nn.a(this, 3);
        this.f21021Q = new Nn.a(this, 1);
        o0();
    }

    private boolean Q0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21022R |= 36;
        }
        return true;
    }

    private boolean T0(androidx.databinding.i<String> iVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21022R |= 26;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        long j11;
        long j12;
        int i10;
        int i11;
        AbstractC5607a abstractC5607a;
        AbstractC5607a greetingContentDescription;
        AbstractC5607a abstractC5607a2;
        androidx.databinding.h greetingFirstName;
        synchronized (this) {
            j10 = this.f21022R;
            this.f21022R = 0L;
        }
        NavBarItem navBarItem = this.f20973K;
        int iM = 0;
        if ((255 & j10) != 0) {
            greetingContentDescription = ((j10 & 137) == 0 || navBarItem == null) ? null : navBarItem.getGreetingContentDescription();
            int shoppingListIconResource = ((j10 & 193) == 0 || navBarItem == null) ? 0 : navBarItem.getShoppingListIconResource();
            if ((j10 & 131) != 0) {
                if (navBarItem != null) {
                    greetingFirstName = navBarItem.getGreetingFirstName();
                    j11 = 0;
                } else {
                    j11 = 0;
                    greetingFirstName = null;
                }
                H0(1, greetingFirstName);
            } else {
                j11 = 0;
            }
            AbstractC5607a cartDescription = ((j10 & 161) == j11 || navBarItem == null) ? null : navBarItem.getCartDescription();
            AbstractC5607a greeting = ((j10 & 145) == j11 || navBarItem == null) ? null : navBarItem.getGreeting();
            if ((j10 & 133) != j11) {
                j12 = 133;
                androidx.databinding.j cartItemCount = navBarItem != null ? navBarItem.getCartItemCount() : null;
                H0(2, cartItemCount);
                if (cartItemCount != null) {
                    iM = cartItemCount.M();
                }
            } else {
                j12 = 133;
            }
            abstractC5607a2 = greeting;
            i10 = iM;
            abstractC5607a = cartDescription;
            i11 = shoppingListIconResource;
        } else {
            j11 = 0;
            j12 = 133;
            i10 = 0;
            i11 = 0;
            abstractC5607a = null;
            greetingContentDescription = null;
            abstractC5607a2 = null;
        }
        if ((161 & j10) != j11) {
            bk.d.e(this.f20963A, abstractC5607a);
        }
        if ((128 & j10) != j11) {
            this.f20963A.setOnClickListener(this.f21019O);
            this.f20965C.setOnClickListener(this.f21021Q);
            this.f20968F.setOnClickListener(this.f21017M);
            this.f20969G.setOnClickListener(this.f21018N);
            this.f20971I.setOnClickListener(this.f21020P);
            this.f20972J.setOnClickListener(this.f21016L);
        }
        if ((j10 & j12) != j11) {
            Qj.a.e(this.f20963A, i10);
        }
        if ((j10 & 137) != j11) {
            bk.d.e(this.f20965C, greetingContentDescription);
        }
        if ((j10 & 145) != j11) {
            bk.d.g(this.f20965C, abstractC5607a2);
        }
        if ((j10 & 193) != j11) {
            Bj.b.a(this.f20972J, i11);
        }
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return P0((NavBarItem) obj, i11);
        }
        if (i10 == 1) {
            return T0((androidx.databinding.i) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return Q0((androidx.databinding.j) obj, i11);
    }

    @Override // Nn.a.InterfaceC0367a
    public final void b(int i10, View view) {
        switch (i10) {
            case 1:
                NavBarItem navBarItem = this.f20973K;
                if (navBarItem != null) {
                    navBarItem.onAccountTapped();
                    break;
                }
                break;
            case 2:
                NavBarItem navBarItem2 = this.f20973K;
                if (navBarItem2 != null) {
                    navBarItem2.onSearchTapped();
                    break;
                }
                break;
            case 3:
                NavBarItem navBarItem3 = this.f20973K;
                if (navBarItem3 != null) {
                    navBarItem3.onSearchTapped();
                    break;
                }
                break;
            case 4:
                NavBarItem navBarItem4 = this.f20973K;
                if (navBarItem4 != null) {
                    navBarItem4.onScanTapped();
                    break;
                }
                break;
            case 5:
                NavBarItem navBarItem5 = this.f20973K;
                if (navBarItem5 != null) {
                    navBarItem5.onCartTapped();
                    break;
                }
                break;
            case 6:
                NavBarItem navBarItem6 = this.f20973K;
                if (navBarItem6 != null) {
                    navBarItem6.onShoppingListTapped();
                    break;
                }
                break;
        }
    }
}
