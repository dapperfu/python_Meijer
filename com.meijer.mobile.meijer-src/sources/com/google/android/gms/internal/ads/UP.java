package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class UP implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71451a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71452b;

    public UP(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f71451a = interfaceC10213yy0;
        this.f71452b = interfaceC10213yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        B80 b80 = (B80) this.f71451a.zzb();
        final CookieManager cookieManagerA = Nc.v.u().a((Context) this.f71452b.zzb());
        C9378r80 c9378r80I = C8630k80.a(new Callable() { // from class: com.google.android.gms.internal.ads.PP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerA;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) Oc.A.c().a(C8784lf.f77063Y0));
            }
        }, EnumC9806v80.WEBVIEW_COOKIE, b80).i(1L, TimeUnit.SECONDS);
        final InterfaceC7990e80 interfaceC7990e80 = new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.QP
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) {
                return "";
            }
        };
        return c9378r80I.c(Exception.class, new InterfaceC9541sj0(interfaceC7990e80) { // from class: com.google.android.gms.internal.ads.l80
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h("");
            }
        }).a();
    }
}
