package androidx.media3.exoplayer;

import androidx.media3.exoplayer.F0;
import androidx.media3.exoplayer.source.r;
import d3.InterfaceC13473h;
import i3.E1;
import java.io.IOException;

/* loaded from: classes.dex */
public interface H0 extends F0.b {

    public interface a {
        void a();

        void b();
    }

    boolean B();

    default long E(long j10, long j11) {
        return 10000L;
    }

    I0 G();

    default void J(float f10, float f11) throws ExoPlaybackException {
    }

    void L(a3.t[] tVarArr, p3.r rVar, long j10, long j11, r.b bVar) throws ExoPlaybackException;

    long N();

    void O(long j10) throws ExoPlaybackException;

    h3.I P();

    boolean b();

    boolean c();

    void disable();

    default void e() {
    }

    int g();

    String getName();

    int getState();

    void h(long j10, long j11) throws ExoPlaybackException;

    p3.r i();

    void k(a3.F f10);

    void l(int i10, E1 e12, InterfaceC13473h interfaceC13473h);

    boolean m();

    void o(h3.K k10, a3.t[] tVarArr, p3.r rVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar) throws ExoPlaybackException;

    void q();

    default void release() {
    }

    void reset();

    void start() throws ExoPlaybackException;

    void stop();

    void y() throws IOException;
}
