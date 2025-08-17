package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdz implements zzda {
    private static final zzdz zza = new zzdz();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzdv();
    private static final Runnable zze = new zzdw();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzds zzk = new zzds();
    private final zzdc zzj = new zzdc();
    private final zzdt zzl = new zzdt(new zzec());

    public static zzdz zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzdz zzdzVar) throws JSONException {
        zzdz zzdzVar2;
        zzdzVar.zzg = 0;
        zzdzVar.zzi.clear();
        zzdzVar.zzh = false;
        for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzcr.zza().zzb()) {
        }
        zzdzVar.zzm = System.nanoTime();
        zzdzVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzdb zzdbVarZza = zzdzVar.zzj.zza();
        if (zzdzVar.zzk.zze().size() > 0) {
            Iterator it = zzdzVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzdbVarZza.zza(null);
                View viewZza = zzdzVar.zzk.zza(str);
                zzdb zzdbVarZzb = zzdzVar.zzj.zzb();
                String strZzc = zzdzVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzdbVarZzb.zza(viewZza);
                    zzdl.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzdm.zza("Error with setting not visible reason", e10);
                    }
                    zzdl.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzdl.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzdzVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzdzVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzdbVarZza.zza(null);
            zzdzVar2 = zzdzVar;
            zzdzVar2.zzk(null, zzdbVarZza, jSONObjectZza3, 1, false);
            zzdl.zzf(jSONObjectZza3);
            zzdzVar2.zzl.zzd(jSONObjectZza3, zzdzVar2.zzk.zzf(), jNanoTime);
        } else {
            zzdzVar2 = zzdzVar;
            zzdzVar2.zzl.zzb();
        }
        zzdzVar2.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzdzVar2.zzm;
        if (zzdzVar2.zzf.size() > 0) {
            for (zzdy zzdyVar : zzdzVar2.zzf) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzdyVar.zzb();
                if (zzdyVar instanceof zzdx) {
                    ((zzdx) zzdyVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzdb zzdbVar, JSONObject jSONObject, int i10, boolean z10) {
        zzdbVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    zzdz() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzda
    public final void zza(View view, zzdb zzdbVar, JSONObject jSONObject, boolean z10) throws JSONException {
        int iZzk;
        boolean z11;
        zzdz zzdzVar;
        View view2;
        zzdb zzdbVar2;
        boolean z12;
        if (zzdq.zza(view) == null && (iZzk = this.zzk.zzk(view)) != 3) {
            JSONObject jSONObjectZza = zzdbVar.zza(view);
            zzdl.zzc(jSONObject, jSONObjectZza);
            String strZzd = this.zzk.zzd(view);
            if (strZzd != null) {
                zzdl.zzb(jSONObjectZza, strZzd);
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
                } catch (JSONException e10) {
                    zzdm.zza("Error with setting has window focus", e10);
                }
                this.zzk.zzh();
                zzdzVar = this;
            } else {
                zzdr zzdrVarZzb = this.zzk.zzb(view);
                if (zzdrVarZzb != null) {
                    zzcu zzcuVarZza = zzdrVarZzb.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayListZzb = zzdrVarZzb.zzb();
                    int size = arrayListZzb.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) arrayListZzb.get(i10));
                    }
                    try {
                        jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectZza.put("friendlyObstructionClass", zzcuVarZza.zzd());
                        jSONObjectZza.put("friendlyObstructionPurpose", zzcuVarZza.zza());
                        jSONObjectZza.put("friendlyObstructionReason", zzcuVarZza.zzc());
                    } catch (JSONException e11) {
                        zzdm.zza("Error with setting friendly obstruction", e11);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 || z11) {
                    zzdzVar = this;
                    view2 = view;
                    zzdbVar2 = zzdbVar;
                    z12 = true;
                } else {
                    view2 = view;
                    zzdbVar2 = zzdbVar;
                    z12 = false;
                    zzdzVar = this;
                }
                zzdzVar.zzk(view2, zzdbVar2, jSONObjectZza, iZzk, z12);
            }
            zzdzVar.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzdu(this));
    }
}
