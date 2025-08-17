package androidx.media3.exoplayer.drm;

import a3.t;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import i3.E1;

/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f56118a = new a();

    class a implements i {
        @Override // androidx.media3.exoplayer.drm.i
        public void d(Looper looper, E1 e12) {
        }

        @Override // androidx.media3.exoplayer.drm.i
        public DrmSession b(h.a aVar, t tVar) {
            if (tVar.f43953s == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.i
        public int c(t tVar) {
            return tVar.f43953s != null ? 1 : 0;
        }

        a() {
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56119a = new b() { // from class: k3.j
            @Override // androidx.media3.exoplayer.drm.i.b
            public final void release() {
                i.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    DrmSession b(h.a aVar, t tVar);

    int c(t tVar);

    void d(Looper looper, E1 e12);

    default void g() {
    }

    default void release() {
    }

    default b a(h.a aVar, t tVar) {
        return b.f56119a;
    }
}
