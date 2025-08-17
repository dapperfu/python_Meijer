package com.google.gson.internal;

import com.google.gson.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class G {

    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f89490a;

        class a extends b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f89491b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f89491b = method;
            }

            @Override // com.google.gson.internal.G.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f89491b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: com.google.gson.internal.G$b$b, reason: collision with other inner class name */
        class C1289b extends b {
            C1289b() {
                super();
            }

            @Override // com.google.gson.internal.G.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);

        static {
            b aVar;
            if (y.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C1289b();
            }
            f89490a = aVar;
        }
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f89490a.a(accessibleObject, obj);
    }

    public static r.a b(List<com.google.gson.r> list, Class<?> cls) {
        Iterator<com.google.gson.r> it = list.iterator();
        while (it.hasNext()) {
            r.a aVarA = it.next().a(cls);
            if (aVarA != r.a.INDECISIVE) {
                return aVarA;
            }
        }
        return r.a.ALLOW;
    }
}
