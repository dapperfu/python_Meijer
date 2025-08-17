package qs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.f;
import androidx.databinding.p;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: qs.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C16602b extends AbstractC16601a {

    /* renamed from: B, reason: collision with root package name */
    private static final p.i f157526B = null;

    /* renamed from: C, reason: collision with root package name */
    private static final SparseIntArray f157527C = null;

    /* renamed from: A, reason: collision with root package name */
    private long f157528A;

    public C16602b(f fVar, View view) {
        this(fVar, view, p.s0(fVar, view, 1, f157526B, f157527C));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f157528A = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f157528A != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f157528A = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C16602b(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (DrawerLayout) objArr[0]);
        this.f157528A = -1L;
        this.f157525z.setTag(null);
        D0(view);
        o0();
    }
}
