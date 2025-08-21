package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9881vt implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f79983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f79984b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f79985c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10309zt f79986d;

    C9881vt(C10309zt c10309zt, List list, String str, Uri uri) {
        this.f79983a = list;
        this.f79984b = str;
        this.f79985c = uri;
        this.f79986d = c10309zt;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Sc.p.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f79985c)));
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.f79983a;
        String str = this.f79984b;
        this.f79986d.g0((Map) obj, list, str);
    }
}
