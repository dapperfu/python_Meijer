package qs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.f;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: qs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C16761b extends AbstractC16760a {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f158963B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f158964C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f158965A;

    public C16761b(f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 1, f158963B, f158964C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f158965A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f158965A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f158965A = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C16761b(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (DrawerLayout) objArr[0]);
        this.f158965A = -1L;
        this.f158962z.setTag(null);
        B0(view);
        l0();
    }
}
