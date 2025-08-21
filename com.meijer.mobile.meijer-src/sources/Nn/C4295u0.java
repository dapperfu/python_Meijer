package Nn;

import On.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import bk.AbstractC6392a;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;

/* renamed from: Nn.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4295u0 extends AbstractC4291t0 implements a.InterfaceC0406a {

    /* renamed from: S, reason: collision with root package name */
    private static final p.i f22346S = null;

    /* renamed from: T, reason: collision with root package name */
    private static final SparseIntArray f22347T;

    /* renamed from: L, reason: collision with root package name */
    private final View.OnClickListener f22348L;

    /* renamed from: M, reason: collision with root package name */
    private final View.OnClickListener f22349M;

    /* renamed from: N, reason: collision with root package name */
    private final View.OnClickListener f22350N;

    /* renamed from: O, reason: collision with root package name */
    private final View.OnClickListener f22351O;

    /* renamed from: P, reason: collision with root package name */
    private final View.OnClickListener f22352P;

    /* renamed from: Q, reason: collision with root package name */
    private final View.OnClickListener f22353Q;

    /* renamed from: R, reason: collision with root package name */
    private long f22354R;

    public C4295u0(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 11, f22346S, f22347T));
    }

    private boolean R0(NavBarItem navBarItem, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f22354R |= 1;
            }
            return true;
        }
        if (i10 == 7) {
            synchronized (this) {
                this.f22354R |= 8;
            }
            return true;
        }
        if (i10 == 8) {
            synchronized (this) {
                this.f22354R |= 24;
            }
            return true;
        }
        if (i10 == 6) {
            synchronized (this) {
                this.f22354R |= 16;
            }
            return true;
        }
        if (i10 == 3) {
            synchronized (this) {
                this.f22354R |= 36;
            }
            return true;
        }
        if (i10 == 2) {
            synchronized (this) {
                this.f22354R |= 32;
            }
            return true;
        }
        if (i10 != 13) {
            return false;
        }
        synchronized (this) {
            this.f22354R |= 64;
        }
        return true;
    }

    @Override // Nn.AbstractC4291t0
    public void O0(NavBarItem navBarItem) {
        I0(0, navBarItem);
        this.f22305K = navBarItem;
        synchronized (this) {
            this.f22354R |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22354R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22354R = 128L;
        }
        z0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22347T = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99994k3, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99864Y3, 10);
    }

    private C4295u0(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 3, (MaterialToolbar) objArr[0], (ImageButton) objArr[6], (ComposeView) objArr[8], (TextView) objArr[1], (ConstraintLayout) objArr[9], (ImageView) objArr[10], (ImageView) objArr[5], (TextView) objArr[3], (ConstraintLayout) objArr[2], (ImageView) objArr[4], (ImageButton) objArr[7]);
        this.f22354R = -1L;
        this.f22306z.setTag(null);
        this.f22295A.setTag(null);
        this.f22296B.setTag(null);
        this.f22297C.setTag(null);
        this.f22300F.setTag(null);
        this.f22301G.setTag(null);
        this.f22302H.setTag(null);
        this.f22303I.setTag(null);
        this.f22304J.setTag(null);
        D0(viewArr);
        this.f22348L = new On.a(this, 6);
        this.f22349M = new On.a(this, 4);
        this.f22350N = new On.a(this, 2);
        this.f22351O = new On.a(this, 5);
        this.f22352P = new On.a(this, 3);
        this.f22353Q = new On.a(this, 1);
        l0();
    }

    private boolean U0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22354R |= 36;
        }
        return true;
    }

    private boolean V0(androidx.databinding.i<String> iVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22354R |= 26;
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
        AbstractC6392a abstractC6392a;
        AbstractC6392a greetingContentDescription;
        AbstractC6392a abstractC6392a2;
        androidx.databinding.h greetingFirstName;
        synchronized (this) {
            j10 = this.f22354R;
            this.f22354R = 0L;
        }
        NavBarItem navBarItem = this.f22305K;
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
                I0(1, greetingFirstName);
            } else {
                j11 = 0;
            }
            AbstractC6392a cartDescription = ((j10 & 161) == j11 || navBarItem == null) ? null : navBarItem.getCartDescription();
            AbstractC6392a greeting = ((j10 & 145) == j11 || navBarItem == null) ? null : navBarItem.getGreeting();
            if ((j10 & 133) != j11) {
                j12 = 133;
                androidx.databinding.j cartItemCount = navBarItem != null ? navBarItem.getCartItemCount() : null;
                I0(2, cartItemCount);
                if (cartItemCount != null) {
                    iM = cartItemCount.M();
                }
            } else {
                j12 = 133;
            }
            abstractC6392a2 = greeting;
            i10 = iM;
            abstractC6392a = cartDescription;
            i11 = shoppingListIconResource;
        } else {
            j11 = 0;
            j12 = 133;
            i10 = 0;
            i11 = 0;
            abstractC6392a = null;
            greetingContentDescription = null;
            abstractC6392a2 = null;
        }
        if ((161 & j10) != j11) {
            ck.d.e(this.f22295A, abstractC6392a);
        }
        if ((128 & j10) != j11) {
            this.f22295A.setOnClickListener(this.f22351O);
            this.f22297C.setOnClickListener(this.f22353Q);
            this.f22300F.setOnClickListener(this.f22349M);
            this.f22301G.setOnClickListener(this.f22350N);
            this.f22303I.setOnClickListener(this.f22352P);
            this.f22304J.setOnClickListener(this.f22348L);
        }
        if ((j10 & j12) != j11) {
            Rj.a.e(this.f22295A, i10);
        }
        if ((j10 & 137) != j11) {
            ck.d.e(this.f22297C, greetingContentDescription);
        }
        if ((j10 & 145) != j11) {
            ck.d.g(this.f22297C, abstractC6392a2);
        }
        if ((j10 & 193) != j11) {
            Cj.b.a(this.f22304J, i11);
        }
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return R0((NavBarItem) obj, i11);
        }
        if (i10 == 1) {
            return V0((androidx.databinding.i) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return U0((androidx.databinding.j) obj, i11);
    }

    @Override // On.a.InterfaceC0406a
    public final void b(int i10, View view) {
        switch (i10) {
            case 1:
                NavBarItem navBarItem = this.f22305K;
                if (navBarItem != null) {
                    navBarItem.onAccountTapped();
                    break;
                }
                break;
            case 2:
                NavBarItem navBarItem2 = this.f22305K;
                if (navBarItem2 != null) {
                    navBarItem2.onSearchTapped();
                    break;
                }
                break;
            case 3:
                NavBarItem navBarItem3 = this.f22305K;
                if (navBarItem3 != null) {
                    navBarItem3.onSearchTapped();
                    break;
                }
                break;
            case 4:
                NavBarItem navBarItem4 = this.f22305K;
                if (navBarItem4 != null) {
                    navBarItem4.onScanTapped();
                    break;
                }
                break;
            case 5:
                NavBarItem navBarItem5 = this.f22305K;
                if (navBarItem5 != null) {
                    navBarItem5.onCartTapped();
                    break;
                }
                break;
            case 6:
                NavBarItem navBarItem6 = this.f22305K;
                if (navBarItem6 != null) {
                    navBarItem6.onShoppingListTapped();
                    break;
                }
                break;
        }
    }
}
