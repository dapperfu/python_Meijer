package Nn;

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

/* renamed from: Nn.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4298v extends AbstractC4294u {

    /* renamed from: W, reason: collision with root package name */
    private static final p.i f22367W = null;

    /* renamed from: X, reason: collision with root package name */
    private static final SparseIntArray f22368X;

    /* renamed from: V, reason: collision with root package name */
    private long f22369V;

    public C4298v(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 22, f22367W, f22368X));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22369V = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22369V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22369V = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22368X = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99977i8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100010l8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100076r8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100087s8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99764O3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100054p8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99808S7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100065q8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99999k8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99988j8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99849W8, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100021m8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100016m3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100140x6, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100129w6, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100032n8, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100098t8, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100043o8, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100120v8, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99969i0, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100109u8, 21);
    }

    private C4298v(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[20], (Group) objArr[13], (Group) objArr[5], (TextView) objArr[15], (TextView) objArr[14], (ComposeView) objArr[7], (AppBarLayout) objArr[1], (CoordinatorLayout) objArr[0], (TextView) objArr[10], (TextView) objArr[9], (MaterialToolbar) objArr[2], (View) objArr[12], (View) objArr[16], (View) objArr[18], (ImageView) objArr[6], (FullWordEllipsisTextView) objArr[8], (ProgressView) objArr[3], (ConstraintLayout) objArr[4], (MaterialButton) objArr[17], (MaterialButton) objArr[21], (ViewPager2) objArr[19], (Guideline) objArr[11]);
        this.f22369V = -1L;
        this.f22330G.setTag(null);
        B0(view);
        l0();
    }
}
