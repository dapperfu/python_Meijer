package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f63694a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f63695a = new HashMap();

        e b() {
            return new e(this);
        }

        a() {
        }
    }

    public boolean a(Class<Object> cls) {
        return this.f63694a.containsKey(cls);
    }

    e(a aVar) {
        this.f63694a = Collections.unmodifiableMap(new HashMap(aVar.f63695a));
    }
}
