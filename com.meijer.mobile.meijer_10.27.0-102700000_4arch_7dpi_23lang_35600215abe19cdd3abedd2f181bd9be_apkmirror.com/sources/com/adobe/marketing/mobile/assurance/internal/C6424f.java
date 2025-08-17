package com.adobe.marketing.mobile.assurance.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6424f {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f62237a;

    String a() {
        SharedPreferences sharedPreferences = this.f62237a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("reconnection.url", null);
        }
        Q5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference instance is null", new Object[0]);
        return null;
    }

    void b(String str) {
        SharedPreferences sharedPreferences = this.f62237a;
        if (sharedPreferences == null) {
            Q5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference instance is null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            Q5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference Editor instance is null", new Object[0]);
            return;
        }
        Q5.t.e("Assurance", "AssuranceConnectionDataStore", "Session URL stored is:" + str, new Object[0]);
        editorEdit.putString("reconnection.url", str);
        editorEdit.apply();
    }

    C6424f(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            sharedPreferences = null;
        } else {
            sharedPreferences = context.getSharedPreferences("com.adobe.assurance.preferences", 0);
        }
        this.f62237a = sharedPreferences;
    }
}
