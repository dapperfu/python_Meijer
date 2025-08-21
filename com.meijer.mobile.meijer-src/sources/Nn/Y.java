package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public class Y extends X {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f21736E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f21737F;

    /* renamed from: D, reason: collision with root package name */
    private long f21738D;

    public Y(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21736E, f21737F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21738D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21738D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21738D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21737F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99688G7, 3);
    }

    private Y(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (AppBarLayout) objArr[1], (DrawerLayout) objArr[0], (FrameLayout) objArr[3]);
        this.f21738D = -1L;
        this.f21723B.setTag(null);
        B0(view);
        l0();
    }
}
