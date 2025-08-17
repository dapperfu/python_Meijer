package com.launchdarkly.sdk.json;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static final List<Class<? extends c>> f91343a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final Gson f91344b = new com.google.gson.f().e().b();

    static <T> T b(a aVar, Type type) {
        return (T) f91344b.k(aVar, type);
    }

    static <T> T c(String str, Class<T> cls) throws SerializationException {
        if (str == null || str.isEmpty()) {
            throw new SerializationException("input string was null/empty");
        }
        try {
            return (T) f91344b.o(str, cls);
        } catch (Exception e10) {
            throw new SerializationException(e10);
        }
    }

    static String e(Object obj) {
        return f91344b.x(obj);
    }

    static void f(Object obj, Class<?> cls, b bVar) throws JsonIOException {
        f91344b.C(obj, cls, bVar);
    }

    public static <T extends c> T a(String str, Class<T> cls) throws SerializationException {
        return (T) c(str, cls);
    }

    public static <T extends c> String d(T t10) {
        return e(t10);
    }
}
