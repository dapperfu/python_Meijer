package i3;

import a3.B;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.r;
import h3.C14333b;
import h3.C14334c;
import java.util.List;
import t3.d;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC14596a extends B.d, androidx.media3.exoplayer.source.s, d.a, androidx.media3.exoplayer.drm.h {
    void A(long j10, int i10);

    void C(List<r.b> list, r.b bVar);

    void D();

    void F(a3.B b10, Looper looper);

    void N(int i10, int i11, boolean z10);

    void O(InterfaceC14599b interfaceC14599b);

    void a(AudioSink.a aVar);

    void b(AudioSink.a aVar);

    void d(Exception exc);

    void f(C14333b c14333b);

    void g(String str);

    void h(String str, long j10, long j11);

    void j(C14333b c14333b);

    void k(String str);

    void l(String str, long j10, long j11);

    void o(long j10);

    void p(Exception exc);

    void r(a3.t tVar, C14334c c14334c);

    void release();

    void t(C14333b c14333b);

    void u(int i10, long j10);

    void v(Object obj, long j10);

    void w(Exception exc);

    void x(C14333b c14333b);

    void y(a3.t tVar, C14334c c14334c);

    void z(int i10, long j10, long j11);
}
