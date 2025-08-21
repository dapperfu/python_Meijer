package s3;

import a3.C5647d;
import a3.F;
import a3.I;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;

/* renamed from: s3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16998D {

    /* renamed from: a, reason: collision with root package name */
    private a f159751a;

    /* renamed from: b, reason: collision with root package name */
    private t3.d f159752b;

    /* renamed from: s3.D$a */
    public interface a {
        default void a(H0 h02) {
        }

        void b();
    }

    public I0.a d() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f159751a = null;
        this.f159752b = null;
    }

    public abstract C16999E k(I0[] i0Arr, p3.w wVar, r.b bVar, F f10) throws ExoPlaybackException;

    public void l(C5647d c5647d) {
    }

    public void m(I i10) {
    }

    protected final t3.d b() {
        return (t3.d) C13599a.i(this.f159752b);
    }

    public I c() {
        return I.f44460F;
    }

    public void e(a aVar, t3.d dVar) {
        this.f159751a = aVar;
        this.f159752b = dVar;
    }

    protected final void f() {
        a aVar = this.f159751a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(H0 h02) {
        a aVar = this.f159751a;
        if (aVar != null) {
            aVar.a(h02);
        }
    }
}
