package com.adobe.marketing.mobile.userprofile;

import R5.K;
import R5.t;
import R5.v;
import com.adobe.marketing.mobile.util.DataReaderException;
import g6.C14328a;
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
    private final v f63582a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f63583b = new HashMap();

    private void g(String str, Object obj) {
        if (obj == null) {
            this.f63583b.remove(str);
        } else {
            this.f63583b.put(str, obj);
        }
    }

    Object b(String str) {
        return this.f63583b.get(str);
    }

    Map<String, Object> c() {
        return Collections.unmodifiableMap(this.f63583b);
    }

    Map<String, Object> d(String str) {
        try {
            return C14328a.j(Object.class, this.f63583b, str);
        } catch (DataReaderException unused) {
            return null;
        }
    }

    boolean e() {
        String string = this.f63582a.getString("user_profile", "{}");
        if (string == null) {
            return true;
        }
        try {
            this.f63583b = a.a(new JSONObject(string));
            return true;
        } catch (JSONException e10) {
            t.b("UserProfile", "PersistentProfileData", "Could not load persistent profile data: %s", e10);
            return false;
        }
    }

    boolean f() {
        try {
            if (this.f63582a == null) {
                return false;
            }
            String string = new JSONObject(this.f63583b).toString();
            this.f63582a.d("user_profile", string);
            t.e("UserProfile", "PersistentProfileData", "Profile Data is persisted : %s", string);
            return true;
        } catch (Exception e10) {
            t.b("UserProfile", "PersistentProfileData", "Profile Data is not persisted : %s", e10);
            return false;
        }
    }

    c() throws b {
        v vVarA = K.f().d().a("ADBUserProfile");
        this.f63582a = vVarA;
        if (vVarA != null) {
        } else {
            throw new b("Failed to create a NamedCollection service with the collection name [ADBUserProfile]");
        }
    }

    void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f63583b.remove(it.next());
        }
    }

    void h(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue());
        }
    }
}
