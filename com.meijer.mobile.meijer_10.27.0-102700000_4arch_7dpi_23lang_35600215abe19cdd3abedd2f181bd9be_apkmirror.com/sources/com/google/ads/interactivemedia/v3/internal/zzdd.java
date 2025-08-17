package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdd implements zzdb {
    private final zzdb zza;

    public zzdd(zzdb zzdbVar) {
        this.zza = zzdbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZza = zzdl.zza(0, 0, 0, 0);
        int iZzb = zzdo.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i10 == 0);
            return jSONObjectZza;
        } catch (JSONException e10) {
            zzdm.zza("Error with setting output device status", e10);
            return jSONObjectZza;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    public final void zzb(View view, JSONObject jSONObject, zzda zzdaVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzcr zzcrVarZza = zzcr.zza();
        if (zzcrVarZza != null) {
            Collection collectionZzb = zzcrVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzg = ((com.google.ads.interactivemedia.omid.library.adsession.zze) it.next()).zzg();
                if (viewZzg != null && viewZzg.isAttachedToWindow() && viewZzg.isShown()) {
                    View view2 = viewZzg;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzg.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzdaVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
