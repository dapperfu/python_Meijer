package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.u;
import pc.AbstractC16280d;
import pc.AbstractC16283g;
import pc.C16279c;
import pc.InterfaceC16285i;

/* loaded from: classes6.dex */
public final class zzmu implements zzmv {
    private static final Integer zza = 79508299;
    private final InterfaceC16285i zzb;
    private final zzeo zzc;

    @Override // com.google.android.libraries.places.internal.zzmv
    public final void zzb(zzaks zzaksVar) {
        k.a(this.zzc.zza(), new zzms(this, zzaksVar), u.a());
    }

    public zzmu(InterfaceC16285i interfaceC16285i, zzeo zzeoVar) {
        this.zzb = interfaceC16285i;
        this.zzc = zzeoVar;
    }

    public static InterfaceC16285i zza(Context context) {
        rc.u.f(context.getApplicationContext());
        return rc.u.c().g("cct").a("LE", zzuk.class, C16279c.b("proto"), zzmt.zza);
    }

    final /* synthetic */ void zzc(zzaks zzaksVar) {
        zzakz zzakzVar = (zzakz) zzaksVar.zzG();
        zzui zzuiVarZza = zzuk.zza();
        zzuiVarZza.zzb(1);
        zzuiVarZza.zza(zzakzVar);
        this.zzb.a(AbstractC16280d.g((zzuk) zzuiVarZza.zzG(), AbstractC16283g.b(zza)));
    }
}
