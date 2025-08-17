package com.google.android.libraries.places.internal;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.c;
import com.google.gson.f;

/* loaded from: classes6.dex */
public final class zzkr {
    private final Gson zza = new f().f(c.f89420e).b();

    public final Object zza(String str, Class cls) throws zzgb {
        try {
            return this.zza.o(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 55);
            sb2.append("Could not convert JSON string to ");
            sb2.append(name);
            sb2.append(" due to syntax errors.");
            throw new zzgb(sb2.toString());
        }
    }
}
