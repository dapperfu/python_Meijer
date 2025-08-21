package com.scandit.datacapture.core.internal.module.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f125169a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f125170b;

    public e(Context context) {
        Intrinsics.j(context, "context");
        this.f125169a = context;
        this.f125170b = context.getSharedPreferences("com.scandit.device_id", 0);
    }

    public final String a() {
        String str = null;
        String string = this.f125170b.getString("device_id", null);
        if (string != null) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.f125169a.getContentResolver(), "android_id");
        if (string2 != null && string2.length() >= 16) {
            str = string2;
        }
        if (str != null) {
            return str;
        }
        String string3 = UUID.randomUUID().toString();
        Intrinsics.i(string3, "toString(...)");
        String str2 = "bad1d000" + StringsKt.Q(string3, "-", "", false, 4, null);
        SharedPreferences.Editor editorEdit = this.f125170b.edit();
        editorEdit.putString("device_id", str2);
        editorEdit.apply();
        return str2;
    }
}
