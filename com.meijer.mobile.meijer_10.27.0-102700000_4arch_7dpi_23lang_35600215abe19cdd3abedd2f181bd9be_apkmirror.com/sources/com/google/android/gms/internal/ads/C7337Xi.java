package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7337Xi implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f71383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4098a f71384b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f71385c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7707cj f71386d;

    C7337Xi(C7707cj c7707cj, Map map, InterfaceC4098a interfaceC4098a, String str) {
        this.f71383a = map;
        this.f71384b = interfaceC4098a;
        this.f71385c = str;
        this.f71386d = c7707cj;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Lc.v.s().x(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws URISyntaxException {
        String str = (String) obj;
        if (((Boolean) Mc.A.c().a(C8659lf.f76190V9)).booleanValue()) {
            this.f71383a.put("u", str);
        }
        this.f71386d.h(str, this.f71384b, this.f71383a, this.f71385c);
    }
}
