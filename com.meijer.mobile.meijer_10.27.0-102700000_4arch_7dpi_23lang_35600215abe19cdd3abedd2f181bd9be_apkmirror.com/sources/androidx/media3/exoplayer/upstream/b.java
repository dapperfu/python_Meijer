package androidx.media3.exoplayer.upstream;

import java.io.IOException;
import p3.i;
import p3.j;

/* loaded from: classes.dex */
public interface b {
    long a(a aVar);

    int b(int i10);

    default void c(long j10) {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i f56986a;

        /* renamed from: b, reason: collision with root package name */
        public final j f56987b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f56988c;

        /* renamed from: d, reason: collision with root package name */
        public final int f56989d;

        public a(i iVar, j jVar, IOException iOException, int i10) {
            this.f56986a = iVar;
            this.f56987b = jVar;
            this.f56988c = iOException;
            this.f56989d = i10;
        }
    }
}
