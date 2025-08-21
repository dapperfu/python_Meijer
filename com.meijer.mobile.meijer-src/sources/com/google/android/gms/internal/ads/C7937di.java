package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7937di implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8043ei f74301a;

    public C7937di(InterfaceC8043ei interfaceC8043ei) {
        this.f74301a = interfaceC8043ei;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        if (this.f74301a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            Sc.p.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleA = null;
        if (map.containsKey("info")) {
            try {
                bundleA = Rc.U.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                Sc.p.e("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundleA == null) {
            Sc.p.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f74301a.g0(str, bundleA);
        }
    }
}
