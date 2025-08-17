package androidx.media3.exoplayer.mediacodec;

import a3.t;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import g3.C14196c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface h {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f56485a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f56486b;

        /* renamed from: c, reason: collision with root package name */
        public final t f56487c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f56488d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f56489e;

        /* renamed from: f, reason: collision with root package name */
        public final n3.h f56490f;

        public static a a(j jVar, MediaFormat mediaFormat, t tVar, MediaCrypto mediaCrypto, n3.h hVar) {
            return new a(jVar, mediaFormat, tVar, null, mediaCrypto, hVar);
        }

        public static a b(j jVar, MediaFormat mediaFormat, t tVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, tVar, surface, mediaCrypto, null);
        }

        private a(j jVar, MediaFormat mediaFormat, t tVar, Surface surface, MediaCrypto mediaCrypto, n3.h hVar) {
            this.f56485a = jVar;
            this.f56486b = mediaFormat;
            this.f56487c = tVar;
            this.f56488d = surface;
            this.f56489e = mediaCrypto;
            this.f56490f = hVar;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f56491a = new g();

        h b(a aVar) throws IOException;

        static b a(Context context) {
            return new g(context);
        }
    }

    public interface c {
        default void a() {
        }

        default void b() {
        }
    }

    public interface d {
        void a(h hVar, long j10, long j11);
    }

    void a(int i10, int i11, int i12, long j10, int i13);

    void b(Bundle bundle);

    void c(int i10, int i11, C14196c c14196c, long j10, int i12);

    default boolean d(c cVar) {
        return false;
    }

    void e(d dVar, Handler handler);

    MediaFormat f();

    void flush();

    void g();

    void h(int i10);

    ByteBuffer i(int i10);

    void j(Surface surface);

    boolean k();

    void l(int i10, long j10);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    void o(int i10, boolean z10);

    ByteBuffer p(int i10);

    void release();
}
