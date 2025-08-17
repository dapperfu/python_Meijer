package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.G;
import h3.M;
import java.io.IOException;

/* loaded from: classes.dex */
public interface q extends G {

    public interface a extends G.a<q> {
        void f(q qVar);
    }

    @Override // androidx.media3.exoplayer.source.G
    boolean a();

    @Override // androidx.media3.exoplayer.source.G
    boolean b(C6061l0 c6061l0);

    @Override // androidx.media3.exoplayer.source.G
    long c();

    @Override // androidx.media3.exoplayer.source.G
    long d();

    @Override // androidx.media3.exoplayer.source.G
    void e(long j10);

    long h(long j10);

    long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10);

    long j();

    long k(long j10, M m10);

    void n() throws IOException;

    void q(a aVar, long j10);

    p3.w r();

    void u(long j10, boolean z10);
}
