package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9312qb0 implements InterfaceC9098ob0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9098ob0 f78640a;

    public C9312qb0(InterfaceC9098ob0 interfaceC9098ob0) {
        this.f78640a = interfaceC9098ob0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9098ob0
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectA = C10274zb0.a(0, 0, 0, 0);
        int iB = C6740Cb0.b();
        int i10 = iB - 1;
        if (iB == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i10 == 0);
            return jSONObjectA;
        } catch (JSONException e10) {
            C6672Ab0.a("Error with setting output device status", e10);
            return jSONObjectA;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9098ob0
    public final void a(View view, JSONObject jSONObject, InterfaceC8991nb0 interfaceC8991nb0, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        C7817cb0 c7817cb0A = C7817cb0.a();
        if (c7817cb0A != null) {
            Collection collectionB = c7817cb0A.b();
            int size = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                View viewF = ((C7010Ka0) it.next()).f();
                if (viewF != null && viewF.isAttachedToWindow() && viewF.isShown()) {
                    View view2 = viewF;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewF.getRootView();
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
            interfaceC8991nb0.a((View) arrayList.get(i11), this.f78640a, jSONObject, z11);
        }
    }
}
