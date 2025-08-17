package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public class W extends V {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20378G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20379H;

    /* renamed from: F, reason: collision with root package name */
    private long f20380F;

    public W(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20378G, f20379H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20380F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20380F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20380F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20379H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99309z9, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99232s9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99125j1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 5);
    }

    private W(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (ComposeView) objArr[4], (DrawerLayout) objArr[0], (ProgressView) objArr[5], (ComposeView) objArr[3], (LinearLayout) objArr[1]);
        this.f20380F = -1L;
        this.f20358B.setTag(null);
        D0(view);
        o0();
    }
}
