package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4207a0 extends Z {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f21793O = null;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f21794P;

    /* renamed from: N, reason: collision with root package name */
    private long f21795N;

    public C4207a0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 14, f21793O, f21794P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21795N = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21795N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21795N = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21794P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99767O6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100067r, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100078s, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100056q, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99817T6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99718J7, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99623A6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99634B6, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100162z6, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 13);
    }

    private C4207a0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[7], (ConstraintLayout) objArr[5], (TextView) objArr[6], (MaterialToolbar) objArr[4], (AppBarLayout) objArr[3], (DrawerLayout) objArr[0], (ProgressView) objArr[13], (Group) objArr[12], (View) objArr[10], (Button) objArr[11], (ConstraintLayout) objArr[2], (ImageView) objArr[8], (LinearLayout) objArr[1], (FrameLayout) objArr[9]);
        this.f21795N = -1L;
        this.f21754E.setTag(null);
        this.f21761L.setTag(null);
        B0(view);
        l0();
    }
}
