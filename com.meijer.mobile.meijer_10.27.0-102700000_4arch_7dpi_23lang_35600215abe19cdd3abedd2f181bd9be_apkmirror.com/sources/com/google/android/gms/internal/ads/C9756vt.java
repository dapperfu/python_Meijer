package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9756vt implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f79143a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f79144b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f79145c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10184zt f79146d;

    C9756vt(C10184zt c10184zt, List list, String str, Uri uri) {
        this.f79143a = list;
        this.f79144b = str;
        this.f79145c = uri;
        this.f79146d = c10184zt;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Qc.p.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f79145c)));
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.f79143a;
        String str = this.f79144b;
        this.f79146d.g0((Map) obj, list, str);
    }
}
