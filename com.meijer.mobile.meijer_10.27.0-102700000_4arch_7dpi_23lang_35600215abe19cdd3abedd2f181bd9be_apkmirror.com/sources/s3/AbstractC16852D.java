package s3;

import a3.C5564d;
import a3.F;
import a3.I;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;

/* renamed from: s3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16852D {

    /* renamed from: a, reason: collision with root package name */
    private a f159888a;

    /* renamed from: b, reason: collision with root package name */
    private t3.d f159889b;

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
        this.f159888a = null;
        this.f159889b = null;
    }

    public abstract C16853E k(I0[] i0Arr, p3.w wVar, r.b bVar, F f10) throws ExoPlaybackException;

    public void l(C5564d c5564d) {
    }

    public void m(I i10) {
    }

    protected final t3.d b() {
        return (t3.d) C13466a.i(this.f159889b);
    }

    public I c() {
        return I.f43642F;
    }

    public void e(a aVar, t3.d dVar) {
        this.f159888a = aVar;
        this.f159889b = dVar;
    }

    protected final void f() {
        a aVar = this.f159888a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(H0 h02) {
        a aVar = this.f159888a;
        if (aVar != null) {
            aVar.a(h02);
        }
    }
}
