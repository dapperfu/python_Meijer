package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.fa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8135fa0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9937wN f74962a;

    C8135fa0(C9937wN c9937wN) {
        this.f74962a = c9937wN;
    }

    private final void g(Gc.b bVar, Optional optional, String str, long j10, Optional optional2) {
        final C9830vN c9830vNA = this.f74962a.a();
        c9830vNA.b(str, Long.toString(j10));
        c9830vNA.b("ad_format", bVar == null ? com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE : bVar.name());
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.da0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c9830vNA.b("action", (String) obj);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ea0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c9830vNA.b("gqi", (String) obj);
            }
        });
        c9830vNA.g();
    }

    public final void a(Gc.b bVar, long j10, Optional optional, Optional optional2) {
        final C9830vN c9830vNA = this.f74962a.a();
        c9830vNA.b("plaac_ts", Long.toString(j10));
        c9830vNA.b("ad_format", bVar.name());
        c9830vNA.b("action", "is_ad_available");
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ba0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c9830vNA.b("plaay_ts", Long.toString(((Long) obj).longValue()));
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ca0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c9830vNA.b("gqi", (String) obj);
            }
        });
        c9830vNA.g();
    }

    public final void d(Gc.b bVar, long j10) {
        g(bVar, Optional.of("poll_ad"), "ppac_ts", j10, Optional.empty());
    }

    public final void e(Gc.b bVar, long j10, Optional optional) {
        g(bVar, Optional.of("poll_ad"), "ppla_ts", j10, optional);
    }

    public final void f(Map map, long j10) {
        C9830vN c9830vNA = this.f74962a.a();
        c9830vNA.b("action", "start_preload");
        c9830vNA.b("sp_ts", Long.toString(j10));
        for (Gc.b bVar : map.keySet()) {
            String strValueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            c9830vNA.b(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(bVar)).intValue()));
        }
        c9830vNA.g();
    }

    public final void b(Gc.b bVar, long j10, Optional optional) {
        g(bVar, Optional.empty(), "pano_ts", j10, optional);
    }

    public final void c(Gc.b bVar, long j10) {
        g(bVar, Optional.empty(), "paeo_ts", j10, Optional.empty());
    }
}
