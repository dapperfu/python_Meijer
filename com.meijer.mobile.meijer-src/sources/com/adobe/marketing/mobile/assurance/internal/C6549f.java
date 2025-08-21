package com.adobe.marketing.mobile.assurance.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6549f {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f63076a;

    String a() {
        SharedPreferences sharedPreferences = this.f63076a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("reconnection.url", null);
        }
        R5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference instance is null", new Object[0]);
        return null;
    }

    void b(String str) {
        SharedPreferences sharedPreferences = this.f63076a;
        if (sharedPreferences == null) {
            R5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference instance is null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            R5.t.b("Assurance", "AssuranceConnectionDataStore", "Unable to get connection URL from persistence, SharedPreference Editor instance is null", new Object[0]);
            return;
        }
        R5.t.e("Assurance", "AssuranceConnectionDataStore", "Session URL stored is:" + str, new Object[0]);
        editorEdit.putString("reconnection.url", str);
        editorEdit.apply();
    }

    C6549f(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            sharedPreferences = null;
        } else {
            sharedPreferences = context.getSharedPreferences("com.adobe.assurance.preferences", 0);
        }
        this.f63076a = sharedPreferences;
    }
}
