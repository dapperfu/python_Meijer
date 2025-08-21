package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes10.dex */
public class U extends T {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f21676R;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f21677S;

    /* renamed from: P, reason: collision with root package name */
    private final ConstraintLayout f21678P;

    /* renamed from: Q, reason: collision with root package name */
    private long f21679Q;

    public U(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 17, f21676R, f21677S));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21679Q = 0L;
        }
        androidx.databinding.p.Z(this.f21656F);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21679Q != 0) {
                    return true;
                }
                return this.f21656F.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21679Q = 2L;
        }
        this.f21656F.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(17);
        f21676R = iVar;
        iVar.a(1, new String[]{"search_bar_find"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f100202R0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21677S = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99899b7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100010l8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100086s7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99998k7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100009l7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99823U2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99843W2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100020m7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99747M6, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99972i3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100031n7, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99659D9, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100101u0, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100042o7, 16);
    }

    private U(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[15], (ComposeView) objArr[8], (View) objArr[9], (ComposeView) objArr[12], (ComposeView) objArr[11], (AppBarLayout) objArr[3], (AbstractC4317z2) objArr[2], (CoordinatorLayout) objArr[0], (RecyclerView) objArr[6], (LinearLayout) objArr[7], (TabLayout) objArr[10], (ViewPager2) objArr[13], (MaterialButton) objArr[16], (RecyclerView) objArr[5], (MaterialToolbar) objArr[4], (ComposeView) objArr[14]);
        this.f21679Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f21678P = constraintLayout;
        constraintLayout.setTag(null);
        A0(this.f21656F);
        this.f21657G.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4317z2 abstractC4317z2, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21679Q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4317z2) obj, i11);
    }
}
