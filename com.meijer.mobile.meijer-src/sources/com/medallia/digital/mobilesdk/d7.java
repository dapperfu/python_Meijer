package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class d7<T> implements m8 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f92646b = "com.medallia.digital.sharedpreference.SHARED_PREFS_KEY";

    /* renamed from: c, reason: collision with root package name */
    public static final String f92647c = "customParameterType";

    /* renamed from: d, reason: collision with root package name */
    public static final String f92648d = "TypeNull";

    /* renamed from: e, reason: collision with root package name */
    private static d7 f92649e;

    /* renamed from: f, reason: collision with root package name */
    private static SharedPreferences f92650f;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<a, Object> f92651a = new HashMap<>();

    protected enum a {
        API_TOKEN,
        ACCESS_TOKEN,
        SESSION_ID,
        PROPERTY_ID,
        SESSION_COUNTER,
        PREVIOUS_SESSION_ID,
        DEVICE_ID,
        CUSTOM_PARAMETERS,
        TARGET_ENGINE,
        UUID,
        LOCAL_CONFIGURATION_TIMESTAMP,
        UUID_URL,
        LENNY,
        NALA,
        LAST_SDK_VERSION,
        LAST_OS_VERSION,
        SDK_KILL_TIMESTAMP,
        SDK_RECOVER_TIMESTAMP,
        IS_SDK_KILLED,
        SHOULD_CHECK_OS,
        SDK_STOPPED,
        MISSING_EVENTS,
        MISSING_EVENTS_V2,
        PREVIOUS_ANALYTICS_V2,
        PREVIOUS_DIGITAL_ANALYTICS,
        PREVIOUS_SEND_USER_JOURNEY,
        INIT_CALLBACK_EVENT,
        IS_BLACKBOX_ENABLED,
        CUSTOM_LOCALE,
        OS_LOCALE,
        CUSTOM_APPEARANCE,
        OS_APPEARANCE,
        IS_DEBUG_FORM,
        IS_ON_DESTROY_CALLED,
        BG_STARTED_TIMESTAMP,
        LN_DISPLAYED_IDS,
        LN_DEFERRED_IDS,
        OCQ_USER_ID,
        OCQ_PREVIOUS_USER_ID,
        OCQ_UUID,
        OCQ_UUID_URL,
        C_UUID
    }

    private d7() {
        if (i4.c().b() != null) {
            f92650f = i4.c().b().getSharedPreferences(f92646b, 0);
        }
    }

    protected static d7 b() {
        if (f92649e == null || f92650f == null) {
            f92649e = new d7();
        }
        return f92649e;
    }

    protected int a(a aVar, int i10) {
        return d() ? f92650f.getInt(aVar.toString(), i10) : i10;
    }

    protected SharedPreferences c() {
        return f92650f;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(getClass().getSimpleName());
        a();
        f92650f = null;
        f92649e = null;
    }

    protected boolean d() {
        return f92650f != null;
    }

    protected void e() {
        a key;
        long jLongValue;
        if (d()) {
            for (Map.Entry<a, Object> entry : this.f92651a.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    b(entry.getKey(), (String) value);
                } else if (value instanceof Boolean) {
                    b(entry.getKey(), ((Boolean) value).booleanValue());
                } else {
                    if (value instanceof Long) {
                        key = entry.getKey();
                        jLongValue = ((Long) value).longValue();
                    } else if (value instanceof Integer) {
                        key = entry.getKey();
                        jLongValue = ((Integer) value).intValue();
                    }
                    b(key, jLongValue);
                }
            }
        }
    }

    protected long a(a aVar, long j10) {
        return d() ? f92650f.getLong(aVar.toString(), j10) : j10;
    }

    protected JSONArray b(a aVar) {
        if (d() && !TextUtils.isEmpty(f92650f.getString(aVar.toString(), null))) {
            try {
                return new JSONArray(f92650f.getString(aVar.toString(), null));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return null;
    }

    protected void c(a aVar, String str) {
        if (!d()) {
            this.f92651a.put(aVar, str);
            return;
        }
        HashSet hashSet = new HashSet(f92650f.getStringSet(aVar.toString(), new HashSet()));
        hashSet.add(str);
        f92650f.edit().putStringSet(aVar.toString(), hashSet).commit();
    }

    protected String a(a aVar, String str) {
        return d() ? f92650f.getString(aVar.toString(), str) : str;
    }

    protected void b(a aVar, int i10) {
        if (d()) {
            f92650f.edit().putInt(aVar.toString(), i10).commit();
        } else {
            this.f92651a.put(aVar, Integer.valueOf(i10));
        }
    }

    protected Set<String> a(a aVar, Set<String> set) {
        return d() ? f92650f.getStringSet(aVar.toString(), set) : set;
    }

    protected void b(a aVar, long j10) {
        if (d()) {
            f92650f.edit().putLong(aVar.toString(), j10).commit();
        } else {
            this.f92651a.put(aVar, Long.valueOf(j10));
        }
    }

    protected void a() {
        if (d()) {
            f92650f.edit().clear().commit();
        }
    }

    protected void b(a aVar, String str) {
        if (d()) {
            f92650f.edit().putString(aVar.toString(), str).commit();
        } else {
            this.f92651a.put(aVar, str);
        }
    }

    protected void a(Context context) {
        if (context == null) {
            return;
        }
        f92650f = context.getSharedPreferences(f92646b, 0);
    }

    protected void b(a aVar, Set<String> set) {
        if (d()) {
            f92650f.edit().putStringSet(aVar.toString(), set).commit();
        } else {
            this.f92651a.put(aVar, set);
        }
    }

    protected boolean a(a aVar) {
        if (!d()) {
            return false;
        }
        f92650f.edit().remove(aVar.toString()).commit();
        return true;
    }

    protected void b(a aVar, boolean z10) {
        if (d()) {
            f92650f.edit().putBoolean(aVar.toString(), z10).commit();
        } else {
            this.f92651a.put(aVar, Boolean.valueOf(z10));
        }
    }

    protected boolean a(a aVar, JSONArray jSONArray) throws JSONException {
        SharedPreferences.Editor editorPutString;
        if (!d() || jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        if (TextUtils.isEmpty(f92650f.getString(aVar.toString(), null))) {
            editorPutString = f92650f.edit().putString(aVar.toString(), jSONArray.toString());
        } else {
            JSONArray jSONArrayB = b(aVar);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= jSONArrayB.length()) {
                                jSONArrayB.put(jSONObject);
                                break;
                            }
                            JSONObject jSONObject2 = jSONArrayB.getJSONObject(i11);
                            if (a(jSONObject, jSONObject2, "name") && a(jSONObject, jSONObject2, f92647c)) {
                                jSONArrayB.put(i11, jSONObject);
                                break;
                            }
                            i11++;
                        }
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
            editorPutString = f92650f.edit().putString(aVar.toString(), jSONArrayB.toString());
        }
        editorPutString.commit();
        return true;
    }

    protected boolean a(a aVar, boolean z10) {
        return d() ? f92650f.getBoolean(aVar.toString(), z10) : z10;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject2 != null) {
            try {
                if (jSONObject.isNull(str)) {
                    return false;
                }
                if (!str.equals(f92647c) || (!jSONObject.getString(f92647c).equals(f92648d) && !jSONObject2.getString(f92647c).equals(f92648d))) {
                    return jSONObject.getString(str).equals(jSONObject2.getString(str));
                }
                return true;
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return false;
    }
}
