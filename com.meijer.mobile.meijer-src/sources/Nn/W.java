package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class W extends V {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21710G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21711H;

    /* renamed from: F, reason: collision with root package name */
    private long f21712F;

    public W(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21710G, f21711H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21712F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21712F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21712F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21711H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100154y9, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100077r9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99981j1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 5);
    }

    private W(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[2], (ComposeView) objArr[4], (DrawerLayout) objArr[0], (ProgressView) objArr[5], (ComposeView) objArr[3], (LinearLayout) objArr[1]);
        this.f21712F = -1L;
        this.f21690B.setTag(null);
        B0(view);
        l0();
    }
}
