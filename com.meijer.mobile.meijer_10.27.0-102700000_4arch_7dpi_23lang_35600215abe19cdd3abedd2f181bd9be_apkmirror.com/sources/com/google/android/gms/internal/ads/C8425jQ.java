package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8425jQ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8532kQ f75441a;

    C8425jQ(C8532kQ c8532kQ) {
        this.f75441a = c8532kQ;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue()) {
            Matcher matcher = C8532kQ.f75640h.matcher(th2.getMessage());
            if (matcher.matches()) {
                this.f75441a.f75645e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C8608l60 c8608l60 = (C8608l60) obj;
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue()) {
            this.f75441a.f75645e.i(c8608l60.f75749b.f75337b.f73107f);
            this.f75441a.f75645e.j(c8608l60.f75749b.f75337b.f73108g);
        }
    }
}
