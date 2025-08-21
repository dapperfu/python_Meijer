package com.google.android.libraries.places.internal;

import Ld.C4011a;
import Ld.InterfaceC4013c;
import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzfc {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final InterfaceC4013c zzb;
    private final zzlr zzc;
    private final Context zzd;

    public final AbstractC5516j zza(AbstractC5507a abstractC5507a) {
        C4011a.C0329a c0329a = new C4011a.C0329a();
        long j10 = zza;
        C4011a.C0329a c0329aB = c0329a.b(j10);
        if (Z1.b.a(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            c0329aB.c(100);
        } else {
            c0329aB.c(102);
        }
        return this.zzc.zza(this.zzb.a(c0329aB.a(), abstractC5507a), abstractC5507a, j10, "Location timeout.").k(new zzfb(this));
    }

    zzfc(Context context, InterfaceC4013c interfaceC4013c, zzlr zzlrVar) {
        this.zzd = context;
        this.zzb = interfaceC4013c;
        this.zzc = zzlrVar;
    }
}
