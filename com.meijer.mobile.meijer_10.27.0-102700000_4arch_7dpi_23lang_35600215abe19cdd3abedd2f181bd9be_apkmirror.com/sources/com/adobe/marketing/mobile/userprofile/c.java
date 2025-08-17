package com.adobe.marketing.mobile.userprofile;

import Q5.K;
import Q5.t;
import Q5.v;
import com.adobe.marketing.mobile.util.DataReaderException;
import f6.C13845a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final v f62743a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f62744b = new HashMap();

    private void g(String str, Object obj) {
        if (obj == null) {
            this.f62744b.remove(str);
        } else {
            this.f62744b.put(str, obj);
        }
    }

    Object b(String str) {
        return this.f62744b.get(str);
    }

    Map<String, Object> c() {
        return Collections.unmodifiableMap(this.f62744b);
    }

    Map<String, Object> d(String str) {
        try {
            return C13845a.j(Object.class, this.f62744b, str);
        } catch (DataReaderException unused) {
            return null;
        }
    }

    boolean e() {
        String string = this.f62743a.getString("user_profile", "{}");
        if (string == null) {
            return true;
        }
        try {
            this.f62744b = a.a(new JSONObject(string));
            return true;
        } catch (JSONException e10) {
            t.b("UserProfile", "PersistentProfileData", "Could not load persistent profile data: %s", e10);
            return false;
        }
    }

    boolean f() {
        try {
            if (this.f62743a == null) {
                return false;
            }
            String string = new JSONObject(this.f62744b).toString();
            this.f62743a.d("user_profile", string);
            t.e("UserProfile", "PersistentProfileData", "Profile Data is persisted : %s", string);
            return true;
        } catch (Exception e10) {
            t.b("UserProfile", "PersistentProfileData", "Profile Data is not persisted : %s", e10);
            return false;
        }
    }

    c() throws b {
        v vVarA = K.f().d().a("ADBUserProfile");
        this.f62743a = vVarA;
        if (vVarA != null) {
        } else {
            throw new b("Failed to create a NamedCollection service with the collection name [ADBUserProfile]");
        }
    }

    void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f62744b.remove(it.next());
        }
    }

    void h(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue());
        }
    }
}
