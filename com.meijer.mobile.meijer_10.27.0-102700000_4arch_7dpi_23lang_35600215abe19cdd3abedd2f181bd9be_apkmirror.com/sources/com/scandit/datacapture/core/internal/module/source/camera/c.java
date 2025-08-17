package com.scandit.datacapture.core.internal.module.source.camera;

import android.content.Context;
import android.content.SharedPreferences;
import com.scandit.datacapture.core.internal.module.utils.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f125031a;

    public final String a() {
        try {
            return this.f125031a.getString("selected_dynamic_resolution", null);
        } catch (ClassCastException e10) {
            i.a("The stored dynamic resolution is not valid, clearing: " + e10.getMessage());
            this.f125031a.edit().remove("selected_dynamic_resolution").apply();
            return null;
        }
    }

    public c(Context context) {
        Intrinsics.j(context, "context");
        this.f125031a = context.getSharedPreferences("com.scandit.datacapture.camera_store", 0);
    }

    public final void a(String resolution) {
        Intrinsics.j(resolution, "resolution");
        this.f125031a.edit().putString("selected_dynamic_resolution", resolution).apply();
    }
}
