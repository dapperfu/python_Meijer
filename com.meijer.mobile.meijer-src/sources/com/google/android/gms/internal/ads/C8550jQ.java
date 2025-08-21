package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8550jQ implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8657kQ f76281a;

    C8550jQ(C8657kQ c8657kQ) {
        this.f76281a = c8657kQ;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue()) {
            Matcher matcher = C8657kQ.f76480h.matcher(th2.getMessage());
            if (matcher.matches()) {
                this.f76281a.f76485e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        C8733l60 c8733l60 = (C8733l60) obj;
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue()) {
            this.f76281a.f76485e.i(c8733l60.f76589b.f76177b.f73947f);
            this.f76281a.f76485e.j(c8733l60.f76589b.f76177b.f73948g);
        }
    }
}
