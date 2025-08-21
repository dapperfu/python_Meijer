package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.A0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
abstract class L0<T extends A0> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f85232a = Logger.getLogger(zzii.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static String f85233b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    L0() {
    }

    protected abstract T a();

    static <T extends A0> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = L0.class.getClassLoader();
        if (cls.equals(A0.class)) {
            str = f85233b;
        } else {
            if (!cls.getPackage().equals(L0.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return cls.cast(((L0) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(L0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((L0) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    Logger logger = f85232a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }
}
