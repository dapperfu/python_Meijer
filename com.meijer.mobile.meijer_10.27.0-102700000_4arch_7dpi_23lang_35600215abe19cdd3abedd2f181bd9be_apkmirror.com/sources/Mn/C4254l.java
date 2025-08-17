package Mn;

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

/* renamed from: Mn.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4254l extends AbstractC4250k {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f20771K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f20772L;

    /* renamed from: J, reason: collision with root package name */
    private long f20773J;

    public C4254l(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 10, f20771K, f20772L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20773J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20773J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20773J = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20772L = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99263v7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99032a7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99131j7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98971U6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99279x1, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99021Z6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99290y1, 9);
    }

    private C4254l(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (AppBarLayout) objArr[1], (TabLayout) objArr[7], (SwipeViewPager) objArr[9], (DrawerLayout) objArr[0], (ImageButton) objArr[6], (LinearLayout) objArr[8], (TextView) objArr[4], (ImageView) objArr[5], (ConstraintLayout) objArr[3]);
        this.f20773J = -1L;
        this.f20748D.setTag(null);
        D0(view);
        o0();
    }
}
