package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes9.dex */
public class Y extends X {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20404E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20405F;

    /* renamed from: D, reason: collision with root package name */
    private long f20406D;

    public Y(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20404E, f20405F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20406D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20406D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20406D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20405F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98842H7, 3);
    }

    private Y(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (AppBarLayout) objArr[1], (DrawerLayout) objArr[0], (FrameLayout) objArr[3]);
        this.f20406D = -1L;
        this.f20391B.setTag(null);
        D0(view);
        o0();
    }
}
