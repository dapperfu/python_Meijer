package Rr;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public class f extends e {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f32978E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f32979F;

    /* renamed from: D, reason: collision with root package name */
    private long f32980D;

    public f(androidx.databinding.f fVar, View view) {
        this(fVar, view, p.s0(fVar, view, 3, f32978E, f32979F));
    }

    @Override // Rr.e
    public void O0(Vr.e eVar) {
        H0(0, eVar);
        this.f32976C = eVar;
        synchronized (this) {
            this.f32980D |= 1;
        }
        notifyPropertyChanged(Nr.a.f22654e);
        super.A0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f32980D;
            this.f32980D = 0L;
        }
        Vr.e eVar = this.f32976C;
        long j11 = j10 & 7;
        String imageUrl = (j11 == 0 || eVar == null) ? null : eVar.getImageUrl();
        if (j11 != 0) {
            Bj.a.a(this.f32974A, imageUrl);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f32980D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f32980D = 4L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32979F = sparseIntArray;
        sparseIntArray.put(Nr.d.f22671l, 2);
    }

    private f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f32980D = -1L;
        this.f32977z.setTag(null);
        this.f32974A.setTag(null);
        D0(view);
        o0();
    }

    private boolean P0(Vr.e eVar, int i10) {
        if (i10 == Nr.a.f22650a) {
            synchronized (this) {
                this.f32980D |= 1;
            }
            return true;
        }
        if (i10 != Nr.a.f22653d) {
            return false;
        }
        synchronized (this) {
            this.f32980D |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return P0((Vr.e) obj, i11);
    }
}
