package com.google.android.libraries.places.internal;

import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5230h;
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
    public final /* synthetic */ void zzb(Class cls, C5233k c5233k, JSONObject jSONObject) {
        try {
            try {
                c5233k.e((zzga) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzgb e10) {
                c5233k.d(new ApiException(new Status(8, e10.getMessage())));
            }
        } catch (Error | RuntimeException e11) {
            zzmr.zzb(e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(C5233k c5233k, VolleyError volleyError) {
        try {
            c5233k.d(zzfl.zza(volleyError));
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public final AbstractC5232j zza(zzfz zzfzVar, final Class cls) {
        C5233k c5233k;
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        AbstractC5223a abstractC5223aZzb = zzfzVar.zzb();
        if (abstractC5223aZzb != null) {
            c5233k = new C5233k(abstractC5223aZzb);
        } else {
            c5233k = new C5233k();
        }
        final C5233k c5233k2 = c5233k;
        final zzfn zzfnVar = new zzfn(this, 0, strZzd, null, new k.b() { // from class: com.google.android.libraries.places.internal.zzfp
            @Override // com.android.volley.k.b
            public final /* synthetic */ void onResponse(Object obj) {
                this.zza.zzb(cls, c5233k2, (JSONObject) obj);
            }
        }, new k.a() { // from class: com.google.android.libraries.places.internal.zzfo
            @Override // com.android.volley.k.a
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfr.zzd(c5233k2, volleyError);
            }
        }, mapZzc);
        if (abstractC5223aZzb != null) {
            abstractC5223aZzb.b(new InterfaceC5230h() { // from class: com.google.android.libraries.places.internal.zzfq
                @Override // Td.InterfaceC5230h
                public final /* synthetic */ void onCanceled() {
                    zzfnVar.cancel();
                }
            });
        }
        this.zza.a(zzfnVar);
        return c5233k2.a();
    }
}
