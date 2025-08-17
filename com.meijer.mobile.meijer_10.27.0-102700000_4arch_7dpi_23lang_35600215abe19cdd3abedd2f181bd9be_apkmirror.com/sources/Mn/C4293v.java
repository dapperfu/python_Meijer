package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4293v extends AbstractC4289u {

    /* renamed from: W, reason: collision with root package name */
    private static final p.i f21035W = null;

    /* renamed from: X, reason: collision with root package name */
    private static final SparseIntArray f21036X;

    /* renamed from: V, reason: collision with root package name */
    private long f21037V;

    public C4293v(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 22, f21035W, f21036X));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21037V = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21037V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21037V = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21036X = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99132j8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99165m8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99231s8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99242t8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98908O3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99209q8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98962T7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99220r8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99154l8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99143k8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99003X8, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99176n8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99160m3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99295y6, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99284x6, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99187o8, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99253u8, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99198p8, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99275w8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99113i0, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99264v8, 21);
    }

    private C4293v(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[20], (Group) objArr[13], (Group) objArr[5], (TextView) objArr[15], (TextView) objArr[14], (ComposeView) objArr[7], (AppBarLayout) objArr[1], (CoordinatorLayout) objArr[0], (TextView) objArr[10], (TextView) objArr[9], (MaterialToolbar) objArr[2], (View) objArr[12], (View) objArr[16], (View) objArr[18], (ImageView) objArr[6], (FullWordEllipsisTextView) objArr[8], (ProgressView) objArr[3], (ConstraintLayout) objArr[4], (MaterialButton) objArr[17], (MaterialButton) objArr[21], (ViewPager2) objArr[19], (Guideline) objArr[11]);
        this.f21037V = -1L;
        this.f20998G.setTag(null);
        D0(view);
        o0();
    }
}
