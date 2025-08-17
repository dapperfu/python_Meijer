package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7812di implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7918ei f73461a;

    public C7812di(InterfaceC7918ei interfaceC7918ei) {
        this.f73461a = interfaceC7918ei;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        if (this.f73461a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            Qc.p.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleA = null;
        if (map.containsKey("info")) {
            try {
                bundleA = Pc.U.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                Qc.p.e("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundleA == null) {
            Qc.p.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f73461a.b0(str, bundleA);
        }
    }
}
