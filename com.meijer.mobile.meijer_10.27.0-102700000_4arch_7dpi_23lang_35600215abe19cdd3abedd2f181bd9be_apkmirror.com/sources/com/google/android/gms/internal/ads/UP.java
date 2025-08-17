package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class UP implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70611a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70612b;

    public UP(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f70611a = interfaceC10088yy0;
        this.f70612b = interfaceC10088yy02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        B80 b80 = (B80) this.f70611a.zzb();
        final CookieManager cookieManagerA = Lc.v.u().a((Context) this.f70612b.zzb());
        C9253r80 c9253r80I = C8505k80.a(new Callable() { // from class: com.google.android.gms.internal.ads.PP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerA;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) Mc.A.c().a(C8659lf.f76223Y0));
            }
        }, EnumC9681v80.WEBVIEW_COOKIE, b80).i(1L, TimeUnit.SECONDS);
        final InterfaceC7865e80 interfaceC7865e80 = new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.QP
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) {
                return "";
            }
        };
        return c9253r80I.c(Exception.class, new InterfaceC9416sj0(interfaceC7865e80) { // from class: com.google.android.gms.internal.ads.l80
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h("");
            }
        }).a();
    }
}
