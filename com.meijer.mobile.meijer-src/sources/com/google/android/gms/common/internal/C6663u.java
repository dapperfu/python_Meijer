package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6663u {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f65783a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65784b;

    public String a(String str) {
        int identifier = this.f65783a.getIdentifier(str, "string", this.f65784b);
        if (identifier == 0) {
            return null;
        }
        return this.f65783a.getString(identifier);
    }

    public C6663u(Context context) {
        r.l(context);
        Resources resources = context.getResources();
        this.f65783a = resources;
        this.f65784b = resources.getResourcePackageName(id.k.f137544a);
    }
}
