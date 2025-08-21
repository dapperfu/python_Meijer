package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class b0 {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f89729a;

    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f89730d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f89731a;

        /* renamed from: b, reason: collision with root package name */
        final String f89732b;

        /* renamed from: c, reason: collision with root package name */
        final long f89733c;

        static String a(String str, String str2, long j10) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                FS.log_w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        private a(String str, String str2, long j10) {
            this.f89731a = str;
            this.f89732b = str2;
            this.f89733c = j10;
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    FS.log_w("FirebaseMessaging", "Failed to parse token: " + e10);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        boolean b(String str) {
            if (System.currentTimeMillis() <= this.f89733c + f89730d && str.equals(this.f89732b)) {
                return false;
            }
            return true;
        }
    }

    public synchronized void c() {
        this.f89729a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f89729a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f89729a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f89729a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }

    private void a(Context context, String str) {
        File file = new File(Z1.b.i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            FS.log_i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public b0(Context context) {
        this.f89729a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }
}
