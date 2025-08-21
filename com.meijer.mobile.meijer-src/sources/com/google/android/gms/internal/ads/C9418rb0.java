package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9418rb0 implements InterfaceC9098ob0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f78886a = new int[2];

    @Override // com.google.android.gms.internal.ads.InterfaceC9098ob0
    public final JSONObject zza(View view) {
        if (view == null) {
            return C10274zb0.a(0, 0, 0, 0);
        }
        int[] iArr = this.f78886a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f78886a;
        return C10274zb0.a(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9098ob0
    public final void a(View view, JSONObject jSONObject, InterfaceC8991nb0 interfaceC8991nb0, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    interfaceC8991nb0.a(viewGroup.getChildAt(i11), this, jSONObject, z11);
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
                        interfaceC8991nb0.a((View) arrayList3.get(i14), this, jSONObject, z11);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }
}
