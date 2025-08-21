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
        public final i f57210a;

        /* renamed from: b, reason: collision with root package name */
        public final j f57211b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f57212c;

        /* renamed from: d, reason: collision with root package name */
        public final int f57213d;

        public a(i iVar, j jVar, IOException iOException, int i10) {
            this.f57210a = iVar;
            this.f57211b = jVar;
            this.f57212c = iOException;
            this.f57213d = i10;
        }
    }
}
