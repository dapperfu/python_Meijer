package com.google.android.libraries.places.internal;

import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5514h;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class zzfr {
    private final j zza;
    private final zzkr zzb;

    zzfr(j jVar, zzkr zzkrVar) {
        this.zza = jVar;
        this.zzb = zzkrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(Class cls, C5517k c5517k, JSONObject jSONObject) {
        try {
            try {
                c5517k.e((zzga) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzgb e10) {
                c5517k.d(new ApiException(new Status(8, e10.getMessage())));
            }
        } catch (Error | RuntimeException e11) {
            zzmr.zzb(e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(C5517k c5517k, VolleyError volleyError) {
        try {
            c5517k.d(zzfl.zza(volleyError));
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public final AbstractC5516j zza(zzfz zzfzVar, final Class cls) {
        C5517k c5517k;
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        AbstractC5507a abstractC5507aZzb = zzfzVar.zzb();
        if (abstractC5507aZzb != null) {
            c5517k = new C5517k(abstractC5507aZzb);
        } else {
            c5517k = new C5517k();
        }
        final C5517k c5517k2 = c5517k;
        final zzfn zzfnVar = new zzfn(this, 0, strZzd, null, new k.b() { // from class: com.google.android.libraries.places.internal.zzfp
            @Override // com.android.volley.k.b
            public final /* synthetic */ void onResponse(Object obj) {
                this.zza.zzb(cls, c5517k2, (JSONObject) obj);
            }
        }, new k.a() { // from class: com.google.android.libraries.places.internal.zzfo
            @Override // com.android.volley.k.a
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfr.zzd(c5517k2, volleyError);
            }
        }, mapZzc);
        if (abstractC5507aZzb != null) {
            abstractC5507aZzb.b(new InterfaceC5514h() { // from class: com.google.android.libraries.places.internal.zzfq
                @Override // Vd.InterfaceC5514h
                public final /* synthetic */ void onCanceled() {
                    zzfnVar.cancel();
                }
            });
        }
        this.zza.a(zzfnVar);
        return c5517k2.a();
    }
}
