package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import java.net.URISyntaxException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7462Xi implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f72223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4376a f72224b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f72225c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7832cj f72226d;

    C7462Xi(C7832cj c7832cj, Map map, InterfaceC4376a interfaceC4376a, String str) {
        this.f72223a = map;
        this.f72224b = interfaceC4376a;
        this.f72225c = str;
        this.f72226d = c7832cj;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Nc.v.s().x(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws URISyntaxException {
        String str = (String) obj;
        if (((Boolean) Oc.A.c().a(C8784lf.f77030V9)).booleanValue()) {
            this.f72223a.put("u", str);
        }
        this.f72226d.h(str, this.f72224b, this.f72223a, this.f72225c);
    }
}
