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

/* loaded from: classes7.dex */
class Z {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f88861a;

    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final long f88862d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f88863a;

        /* renamed from: b, reason: collision with root package name */
        final String f88864b;

        /* renamed from: c, reason: collision with root package name */
        final long f88865c;

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
            this.f88863a = str;
            this.f88864b = str2;
            this.f88865c = j10;
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
            if (System.currentTimeMillis() <= this.f88865c + f88862d && str.equals(this.f88864b)) {
                return false;
            }
            return true;
        }
    }

    public synchronized void c() {
        this.f88861a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f88861a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f88861a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f88861a.edit();
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

    public Z(Context context) {
        this.f88861a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }
}
