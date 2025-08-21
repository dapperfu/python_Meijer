package Nn;

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

/* renamed from: Nn.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4314z extends AbstractC4310y {

    /* renamed from: I, reason: collision with root package name */
    private static final p.i f22478I = null;

    /* renamed from: J, reason: collision with root package name */
    private static final SparseIntArray f22479J;

    /* renamed from: H, reason: collision with root package name */
    private long f22480H;

    public C4314z(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 8, f22478I, f22479J));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22480H = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22480H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22480H = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22479J = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99740M, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100148y3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99857X6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100061q4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100115v3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100003l1, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100159z3, 7);
    }

    private C4314z(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CoordinatorLayout) objArr[1], (ComposeView) objArr[6], (View) objArr[5], (HomeSearchAppBar) objArr[2], (UnauthFooterViewNewHomeScreen) objArr[7], (DrawerLayout) objArr[0], (FrameLayout) objArr[4], (NestedScrollView) objArr[3]);
        this.f22480H = -1L;
        this.f22458E.setTag(null);
        B0(view);
        l0();
    }
}
