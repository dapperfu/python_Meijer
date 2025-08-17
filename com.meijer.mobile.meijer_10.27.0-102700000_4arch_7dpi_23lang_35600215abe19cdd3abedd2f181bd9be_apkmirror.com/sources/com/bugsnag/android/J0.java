package com.bugsnag.android;

import Q6.ImmutableConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001!B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u001dJ\u001b\u0010!\u001a\u0004\u0018\u00010\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*¨\u0006+"}, d2 = {"Lcom/bugsnag/android/J0;", "", "", "Lcom/bugsnag/android/I0;", "userPlugins", "LQ6/f;", "immutableConfig", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Ljava/util/Set;LQ6/f;Lcom/bugsnag/android/t0;)V", "", "clz", "", "isWarningEnabled", "c", "(Ljava/lang/String;Z)Lcom/bugsnag/android/I0;", "plugin", "Lcom/bugsnag/android/p;", "client", "", "d", "(Lcom/bugsnag/android/I0;Lcom/bugsnag/android/p;)V", "b", "()Lcom/bugsnag/android/I0;", "e", "(Lcom/bugsnag/android/p;)V", "autoNotify", "g", "(Lcom/bugsnag/android/p;Z)V", "autoDetectAnrs", "f", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Lcom/bugsnag/android/I0;", "Ljava/util/Set;", "plugins", "Lcom/bugsnag/android/I0;", "ndkPlugin", "anrPlugin", "rnPlugin", "LQ6/f;", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<I0> plugins;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I0 ndkPlugin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final I0 anrPlugin;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I0 rnPlugin;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig immutableConfig;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    private final I0 c(String clz, boolean isWarningEnabled) {
        try {
            Object objNewInstance = Class.forName(clz).getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance != null) {
                return (I0) objNewInstance;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            if (isWarningEnabled) {
                this.logger.d("Plugin '" + clz + "' is not on the classpath - functionality will not be enabled.");
            }
            return null;
        } catch (Throwable th2) {
            this.logger.c("Failed to load plugin '" + clz + '\'', th2);
            return null;
        }
    }

    public final I0 a(Class<?> clz) {
        Object next;
        Iterator<T> it = this.plugins.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((I0) next).getClass(), clz)) {
                break;
            }
        }
        return (I0) next;
    }

    /* renamed from: b, reason: from getter */
    public final I0 getNdkPlugin() {
        return this.ndkPlugin;
    }

    public final void e(C6487p client) {
        for (I0 i02 : this.plugins) {
            try {
                d(i02, client);
            } catch (Throwable th2) {
                this.logger.c("Failed to load plugin " + i02 + ", continuing with initialisation.", th2);
            }
        }
    }

    public final void f(C6487p client, boolean autoDetectAnrs) {
        if (autoDetectAnrs) {
            I0 i02 = this.anrPlugin;
            if (i02 != null) {
                i02.load(client);
                return;
            }
            return;
        }
        I0 i03 = this.anrPlugin;
        if (i03 != null) {
            i03.unload();
        }
    }

    public J0(Set<? extends I0> set, ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0) {
        this.immutableConfig = immutableConfig;
        this.logger = interfaceC6495t0;
        I0 i0C = c("com.bugsnag.android.NdkPlugin", immutableConfig.getEnabledErrorTypes().getNdkCrashes());
        this.ndkPlugin = i0C;
        I0 i0C2 = c("com.bugsnag.android.AnrPlugin", immutableConfig.getEnabledErrorTypes().getAnrs());
        this.anrPlugin = i0C2;
        I0 i0C3 = c("com.bugsnag.android.BugsnagReactNativePlugin", immutableConfig.getEnabledErrorTypes().getUnhandledRejections());
        this.rnPlugin = i0C3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        if (i0C != null) {
            linkedHashSet.add(i0C);
        }
        if (i0C2 != null) {
            linkedHashSet.add(i0C2);
        }
        if (i0C3 != null) {
            linkedHashSet.add(i0C3);
        }
        this.plugins = CollectionsKt.o1(linkedHashSet);
    }

    private final void d(I0 plugin, C6487p client) {
        String name = plugin.getClass().getName();
        U enabledErrorTypes = this.immutableConfig.getEnabledErrorTypes();
        if (Intrinsics.e(name, "com.bugsnag.android.NdkPlugin")) {
            if (enabledErrorTypes.getNdkCrashes()) {
                plugin.load(client);
            }
        } else {
            if (Intrinsics.e(name, "com.bugsnag.android.AnrPlugin")) {
                if (enabledErrorTypes.getAnrs()) {
                    plugin.load(client);
                    return;
                }
                return;
            }
            plugin.load(client);
        }
    }

    public final void g(C6487p client, boolean autoNotify) {
        f(client, autoNotify);
        if (autoNotify) {
            I0 i02 = this.ndkPlugin;
            if (i02 != null) {
                i02.load(client);
                return;
            }
            return;
        }
        I0 i03 = this.ndkPlugin;
        if (i03 != null) {
            i03.unload();
        }
    }
}
