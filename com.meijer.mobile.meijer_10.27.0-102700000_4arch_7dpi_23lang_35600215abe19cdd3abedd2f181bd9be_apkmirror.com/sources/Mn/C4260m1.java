package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;

/* renamed from: Mn.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4260m1 extends AbstractC4256l1 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20792F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20793G = null;

    /* renamed from: E, reason: collision with root package name */
    private long f20794E;

    public C4260m1(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 5, f20792F, f20793G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20794E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20794E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20794E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4260m1(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (Button) objArr[4], (Button) objArr[2], (Group) objArr[3], (TextView) objArr[1], (ImageView) objArr[0]);
        this.f20794E = -1L;
        this.f20782z.setTag(null);
        this.f20778A.setTag(null);
        this.f20779B.setTag(null);
        this.f20780C.setTag(null);
        this.f20781D.setTag(null);
        E0(viewArr);
        o0();
    }
}
