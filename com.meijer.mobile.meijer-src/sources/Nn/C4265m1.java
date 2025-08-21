package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;

/* renamed from: Nn.m1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4265m1 extends AbstractC4261l1 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22124F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22125G = null;

    /* renamed from: E, reason: collision with root package name */
    private long f22126E;

    public C4265m1(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 5, f22124F, f22125G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22126E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22126E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22126E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4265m1(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (Button) objArr[4], (Button) objArr[2], (Group) objArr[3], (TextView) objArr[1], (ImageView) objArr[0]);
        this.f22126E = -1L;
        this.f22114z.setTag(null);
        this.f22110A.setTag(null);
        this.f22111B.setTag(null);
        this.f22112C.setTag(null);
        this.f22113D.setTag(null);
        D0(viewArr);
        l0();
    }
}
