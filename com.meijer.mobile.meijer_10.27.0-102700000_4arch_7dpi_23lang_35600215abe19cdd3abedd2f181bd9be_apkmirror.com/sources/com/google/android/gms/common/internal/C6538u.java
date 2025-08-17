package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6538u {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f64943a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64944b;

    public String a(String str) {
        int identifier = this.f64943a.getIdentifier(str, "string", this.f64944b);
        if (identifier == 0) {
            return null;
        }
        return this.f64943a.getString(identifier);
    }

    public C6538u(Context context) {
        r.l(context);
        Resources resources = context.getResources();
        this.f64943a = resources;
        this.f64944b = resources.getResourcePackageName(gd.k.f133328a);
    }
}
