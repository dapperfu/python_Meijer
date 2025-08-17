package androidx.media3.exoplayer.source.ads;

import a3.C5562b;
import a3.F;
import a3.InterfaceC5563c;
import a3.v;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import f3.g;
import java.io.IOException;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: androidx.media3.exoplayer.source.ads.a$a, reason: collision with other inner class name */
    public interface InterfaceC1127a {
        default void a(C5562b c5562b) {
        }

        default void b() {
        }

        default void c(AdsMediaSource.AdLoadException adLoadException, g gVar) {
        }

        default void v() {
        }
    }

    public interface b {
        a a(v.b bVar);
    }

    void a(AdsMediaSource adsMediaSource, InterfaceC1127a interfaceC1127a);

    void b(AdsMediaSource adsMediaSource, g gVar, Object obj, InterfaceC5563c interfaceC5563c, InterfaceC1127a interfaceC1127a);

    void c(AdsMediaSource adsMediaSource, int i10, int i11);

    void d(int... iArr);

    void e(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException);

    default void f(AdsMediaSource adsMediaSource, F f10) {
    }
}
