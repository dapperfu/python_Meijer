package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f64534a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f64535a = new HashMap();

        e b() {
            return new e(this);
        }

        a() {
        }
    }

    public boolean a(Class<Object> cls) {
        return this.f64534a.containsKey(cls);
    }

    e(a aVar) {
        this.f64534a = Collections.unmodifiableMap(new HashMap(aVar.f64535a));
    }
}
