package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzde implements zzdb {
    private final int[] zza = new int[2];

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzdl.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzdl.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    public final void zzb(View view, JSONObject jSONObject, zzda zzdaVar, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    zzdaVar.zza(viewGroup.getChildAt(i11), this, jSONObject, z11);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < size2) {
                        zzdaVar.zza((View) arrayList3.get(i14), this, jSONObject, z11);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }
}
