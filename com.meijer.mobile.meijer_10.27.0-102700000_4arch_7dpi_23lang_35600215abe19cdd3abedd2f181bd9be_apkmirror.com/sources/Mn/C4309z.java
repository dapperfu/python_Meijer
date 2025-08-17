package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.meijer.mobile.widget.HomeSearchAppBar;
import com.meijer.mobile.widget.UnauthFooterViewNewHomeScreen;

/* renamed from: Mn.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4309z extends AbstractC4305y {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f21146I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f21147J;

    /* renamed from: H, reason: collision with root package name */
    private long f21148H;

    public C4309z(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 8, f21146I, f21147J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21148H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21148H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21148H = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21147J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98884M, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99292y3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99011Y6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99205q4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99259v3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99147l1, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99303z3, 7);
    }

    private C4309z(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CoordinatorLayout) objArr[1], (ComposeView) objArr[6], (View) objArr[5], (HomeSearchAppBar) objArr[2], (UnauthFooterViewNewHomeScreen) objArr[7], (DrawerLayout) objArr[0], (FrameLayout) objArr[4], (NestedScrollView) objArr[3]);
        this.f21148H = -1L;
        this.f21126E.setTag(null);
        D0(view);
        o0();
    }
}
