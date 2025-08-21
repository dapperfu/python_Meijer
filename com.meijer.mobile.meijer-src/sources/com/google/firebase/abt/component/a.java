package com.google.firebase.abt.component;

import Ze.b;
import android.content.Context;
import bf.InterfaceC6375a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f89444a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f89445b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf.b<InterfaceC6375a> f89446c;

    public synchronized b b(String str) {
        try {
            if (!this.f89444a.containsKey(str)) {
                this.f89444a.put(str, a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f89444a.get(str);
    }

    protected b a(String str) {
        return new b(this.f89445b, this.f89446c, str);
    }

    protected a(Context context, Kf.b<InterfaceC6375a> bVar) {
        this.f89445b = context;
        this.f89446c = bVar;
    }
}
