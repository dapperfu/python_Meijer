package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/Q0;", "Lcom/bugsnag/android/N;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "requestCreateIfDoesNotExist", "", "a", "(Z)Ljava/lang/String;", "deviceId", "Lcom/bugsnag/android/h1;", "d", "(Ljava/lang/String;)Lcom/bugsnag/android/h1;", "c", "()Z", "", "b", "()V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "prefs", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Q0 implements N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences prefs;

    @Override // com.bugsnag.android.N
    public String a(boolean requestCreateIfDoesNotExist) {
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("install.iud", null);
        }
        return null;
    }

    public final boolean c() {
        SharedPreferences sharedPreferences = this.prefs;
        return sharedPreferences != null && sharedPreferences.contains("install.iud");
    }

    public final h1 d(String deviceId) {
        SharedPreferences sharedPreferences = this.prefs;
        String string = sharedPreferences != null ? sharedPreferences.getString("user.id", deviceId) : null;
        SharedPreferences sharedPreferences2 = this.prefs;
        String string2 = sharedPreferences2 != null ? sharedPreferences2.getString("user.email", null) : null;
        SharedPreferences sharedPreferences3 = this.prefs;
        return new h1(string, string2, sharedPreferences3 != null ? sharedPreferences3.getString("user.name", null) : null);
    }

    public Q0(Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences("com.bugsnag.android", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.prefs = sharedPreferences;
    }

    @SuppressLint({"ApplySharedPref"})
    public final void b() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        if (c() && (sharedPreferences = this.prefs) != null && (editorEdit = sharedPreferences.edit()) != null && (editorClear = editorEdit.clear()) != null) {
            editorClear.commit();
        }
    }
}
