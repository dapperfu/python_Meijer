package Mn;

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

/* loaded from: classes9.dex */
public class U extends T {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f20344R;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f20345S;

    /* renamed from: P, reason: collision with root package name */
    private final ConstraintLayout f20346P;

    /* renamed from: Q, reason: collision with root package name */
    private long f20347Q;

    public U(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 17, f20344R, f20345S));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20347Q = 0L;
        }
        androidx.databinding.p.Y(this.f20324F);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20347Q != 0) {
                    return true;
                }
                return this.f20324F.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20347Q = 2L;
        }
        this.f20324F.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(17);
        f20344R = iVar;
        iVar.a(1, new String[]{"search_bar_find"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f99346R0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20345S = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99054c7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99165m8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99241t7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99153l7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99164m7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98967U2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98987W2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99175n7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98901N6, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99116i3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99186o7, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98813E9, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99245u0, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99197p7, 16);
    }

    private U(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[15], (ComposeView) objArr[8], (View) objArr[9], (ComposeView) objArr[12], (ComposeView) objArr[11], (AppBarLayout) objArr[3], (AbstractC4312z2) objArr[2], (CoordinatorLayout) objArr[0], (RecyclerView) objArr[6], (LinearLayout) objArr[7], (TabLayout) objArr[10], (ViewPager2) objArr[13], (MaterialButton) objArr[16], (RecyclerView) objArr[5], (MaterialToolbar) objArr[4], (ComposeView) objArr[14]);
        this.f20347Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f20346P = constraintLayout;
        constraintLayout.setTag(null);
        C0(this.f20324F);
        this.f20325G.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4312z2 abstractC4312z2, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20347Q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4312z2) obj, i11);
    }
}
