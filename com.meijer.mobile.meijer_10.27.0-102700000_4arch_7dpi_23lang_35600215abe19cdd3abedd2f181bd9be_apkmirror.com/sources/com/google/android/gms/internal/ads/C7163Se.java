package com.google.android.gms.internal.ads;

import Pc.C4569g0;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import java.util.concurrent.Callable;
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7163Se {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70134a;

    public final boolean a(Intent intent) {
        com.google.android.gms.common.internal.r.m(intent, "Intent can not be null");
        return !this.f70134a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) C4569g0.a(this.f70134a, new Callable() { // from class: com.google.android.gms.internal.ads.Re
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && C16519f.a(this.f70134a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public C7163Se(Context context) {
        com.google.android.gms.common.internal.r.m(context, "Context can not be null");
        this.f70134a = context;
    }
}
