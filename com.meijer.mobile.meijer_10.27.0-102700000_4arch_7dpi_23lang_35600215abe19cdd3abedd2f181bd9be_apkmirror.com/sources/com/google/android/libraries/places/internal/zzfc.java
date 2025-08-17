package com.google.android.libraries.places.internal;

import Jd.C3767a;
import Jd.InterfaceC3769c;
import Td.AbstractC5223a;
import Td.AbstractC5232j;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzfc {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final InterfaceC3769c zzb;
    private final zzlr zzc;
    private final Context zzd;

    public final AbstractC5232j zza(AbstractC5223a abstractC5223a) {
        C3767a.C0237a c0237a = new C3767a.C0237a();
        long j10 = zza;
        C3767a.C0237a c0237aB = c0237a.b(j10);
        if (Z1.b.a(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            c0237aB.c(100);
        } else {
            c0237aB.c(102);
        }
        return this.zzc.zza(this.zzb.j(c0237aB.a(), abstractC5223a), abstractC5223a, j10, "Location timeout.").k(new zzfb(this));
    }

    zzfc(Context context, InterfaceC3769c interfaceC3769c, zzlr zzlrVar) {
        this.zzd = context;
        this.zzb = interfaceC3769c;
        this.zzc = zzlrVar;
    }
}
