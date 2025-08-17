package com.launchdarkly.sdk.android;

import android.app.Application;
import android.content.SharedPreferences;
import ih.C14724c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import mh.InterfaceC15630k;

/* loaded from: classes7.dex */
final class q0 implements InterfaceC15630k {

    /* renamed from: a, reason: collision with root package name */
    private final Application f91248a;

    /* renamed from: b, reason: collision with root package name */
    private final C14724c f91249b;

    private SharedPreferences f(String str) {
        return this.f91248a.getSharedPreferences(str, 0);
    }

    @Override // mh.InterfaceC15630k
    public Collection<String> b() {
        File[] fileArrListFiles = new File(this.f91248a.getFilesDir().getParent() + "/shared_prefs/").listFiles();
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".xml")) {
                    arrayList.add(file.getName().substring(0, file.getName().length() - 4));
                }
            }
        }
        return arrayList;
    }

    public q0(Application application, C14724c c14724c) {
        this.f91248a = application;
        this.f91249b = c14724c;
    }

    @Override // mh.InterfaceC15630k
    public void a(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = f(str).edit();
        if (str3 == null) {
            editorEdit.remove(str2);
        } else {
            editorEdit.putString(str2, str3);
        }
        editorEdit.apply();
    }

    @Override // mh.InterfaceC15630k
    public void c(String str, Map<String, String> map) {
        SharedPreferences.Editor editorEdit = f(str).edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
    }

    @Override // mh.InterfaceC15630k
    public String d(String str, String str2) {
        SharedPreferences sharedPreferencesF = f(str);
        try {
            return sharedPreferencesF.getString(str2, null);
        } catch (ClassCastException unused) {
            try {
                return String.valueOf(Long.valueOf(sharedPreferencesF.getLong(str2, 0L)));
            } catch (ClassCastException unused2) {
                return null;
            }
        }
    }

    @Override // mh.InterfaceC15630k
    public void e(String str, boolean z10) {
        f(str).edit().clear().apply();
        if (z10) {
            new File(this.f91248a.getFilesDir().getParent() + "/shared_prefs/" + str + ".xml").delete();
        }
    }
}
