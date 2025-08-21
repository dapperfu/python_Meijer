package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.widget.SwipeViewPager;

/* renamed from: Nn.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4259l extends AbstractC4255k {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f22103K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f22104L;

    /* renamed from: J, reason: collision with root package name */
    private long f22105J;

    public C4259l(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 10, f22103K, f22104L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22105J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22105J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22105J = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22104L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100108u7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99877Z6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99976i7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99817T6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100135x1, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99867Y6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100146y1, 9);
    }

    private C4259l(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (AppBarLayout) objArr[1], (TabLayout) objArr[7], (SwipeViewPager) objArr[9], (DrawerLayout) objArr[0], (ImageButton) objArr[6], (LinearLayout) objArr[8], (TextView) objArr[4], (ImageView) objArr[5], (ConstraintLayout) objArr[3]);
        this.f22105J = -1L;
        this.f22080D.setTag(null);
        B0(view);
        l0();
    }
}
