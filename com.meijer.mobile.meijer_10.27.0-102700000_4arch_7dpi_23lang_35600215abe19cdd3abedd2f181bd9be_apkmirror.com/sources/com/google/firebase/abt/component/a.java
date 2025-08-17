package com.google.firebase.abt.component;

import Xe.b;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f88604a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f88605b;

    /* renamed from: c, reason: collision with root package name */
    private final If.b<Ze.a> f88606c;

    public synchronized b b(String str) {
        try {
            if (!this.f88604a.containsKey(str)) {
                this.f88604a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f88604a.get(str);
    }

    protected b a(String str) {
        return new b(this.f88605b, this.f88606c, str);
    }

    protected a(Context context, If.b<Ze.a> bVar) {
        this.f88605b = context;
        this.f88606c = bVar;
    }
}
