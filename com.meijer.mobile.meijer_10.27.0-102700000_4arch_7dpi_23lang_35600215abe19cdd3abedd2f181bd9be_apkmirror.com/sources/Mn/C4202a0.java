package Mn;

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

/* renamed from: Mn.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4202a0 extends Z {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f20461O = null;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f20462P;

    /* renamed from: N, reason: collision with root package name */
    private long f20463N;

    public C4202a0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 14, f20461O, f20462P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20463N = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20463N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20463N = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20462P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98921P6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99211r, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99222s, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99200q, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98971U6, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98872K7, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98777B6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98788C6, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98766A6, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 13);
    }

    private C4202a0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[7], (ConstraintLayout) objArr[5], (TextView) objArr[6], (MaterialToolbar) objArr[4], (AppBarLayout) objArr[3], (DrawerLayout) objArr[0], (ProgressView) objArr[13], (Group) objArr[12], (View) objArr[10], (Button) objArr[11], (ConstraintLayout) objArr[2], (ImageView) objArr[8], (LinearLayout) objArr[1], (FrameLayout) objArr[9]);
        this.f20463N = -1L;
        this.f20422E.setTag(null);
        this.f20429L.setTag(null);
        D0(view);
        o0();
    }
}
