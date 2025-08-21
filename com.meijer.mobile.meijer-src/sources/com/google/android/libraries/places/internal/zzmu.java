package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.u;
import rc.AbstractC16884d;
import rc.AbstractC16887g;
import rc.C16883c;
import rc.InterfaceC16889i;

/* loaded from: classes6.dex */
public final class zzmu implements zzmv {
    private static final Integer zza = 79508299;
    private final InterfaceC16889i zzb;
    private final zzeo zzc;

    @Override // com.google.android.libraries.places.internal.zzmv
    public final void zzb(zzaks zzaksVar) {
        k.a(this.zzc.zza(), new zzms(this, zzaksVar), u.a());
    }

    public zzmu(InterfaceC16889i interfaceC16889i, zzeo zzeoVar) {
        this.zzb = interfaceC16889i;
        this.zzc = zzeoVar;
    }

    public static InterfaceC16889i zza(Context context) {
        tc.u.f(context.getApplicationContext());
        return tc.u.c().g("cct").a("LE", zzuk.class, C16883c.b("proto"), zzmt.zza);
    }

    final /* synthetic */ void zzc(zzaks zzaksVar) {
        zzakz zzakzVar = (zzakz) zzaksVar.zzG();
        zzui zzuiVarZza = zzuk.zza();
        zzuiVarZza.zzb(1);
        zzuiVarZza.zza(zzakzVar);
        this.zzb.b(AbstractC16884d.g((zzuk) zzuiVarZza.zzG(), AbstractC16887g.b(zza)));
    }
}
