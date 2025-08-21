package Rr;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public class f extends e {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f34015E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f34016F;

    /* renamed from: D, reason: collision with root package name */
    private long f34017D;

    public f(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 3, f34015E, f34016F));
    }

    @Override // Rr.e
    public void O0(Vr.e eVar) {
        I0(0, eVar);
        this.f34013C = eVar;
        synchronized (this) {
            this.f34017D |= 1;
        }
        notifyPropertyChanged(Nr.a.f22610e);
        super.z0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f34017D;
            this.f34017D = 0L;
        }
        Vr.e eVar = this.f34013C;
        long j11 = j10 & 7;
        String imageUrl = (j11 == 0 || eVar == null) ? null : eVar.getImageUrl();
        if (j11 != 0) {
            Cj.a.a(this.f34011A, imageUrl);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f34017D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f34017D = 4L;
        }
        z0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34016F = sparseIntArray;
        sparseIntArray.put(Nr.d.f22627l, 2);
    }

    private f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f34017D = -1L;
        this.f34014z.setTag(null);
        this.f34011A.setTag(null);
        B0(view);
        l0();
    }

    private boolean R0(Vr.e eVar, int i10) {
        if (i10 == Nr.a.f22606a) {
            synchronized (this) {
                this.f34017D |= 1;
            }
            return true;
        }
        if (i10 != Nr.a.f22609d) {
            return false;
        }
        synchronized (this) {
            this.f34017D |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return R0((Vr.e) obj, i11);
    }
}
