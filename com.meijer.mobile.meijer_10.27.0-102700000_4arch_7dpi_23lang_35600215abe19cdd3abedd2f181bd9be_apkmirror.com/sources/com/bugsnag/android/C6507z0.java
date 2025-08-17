package com.bugsnag.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0016\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u001e\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!¨\u0006,"}, d2 = {"Lcom/bugsnag/android/z0;", "", "<init>", "()V", "", "name", "", "Ljava/lang/Class;", "parameterTypes", "Ljava/lang/reflect/Method;", "c", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Lcom/bugsnag/android/I0;", "plugin", "", "f", "(Lcom/bugsnag/android/I0;)V", "", "enabled", "e", "(Z)V", "", "", "a", "()Ljava/util/Map;", "b", "counts", "d", "(Ljava/util/Map;)V", "data", "g", "Lcom/bugsnag/android/I0;", "ndkPlugin", "Ljava/lang/reflect/Method;", "setInternalMetricsEnabled", "setStaticData", "getSignalUnwindStackFunction", "getCurrentCallbackSetCounts", "getCurrentNativeApiCallUsage", "initCallbackCounts", "h", "notifyAddCallback", "i", "notifyRemoveCallback", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6507z0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static I0 ndkPlugin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Method setInternalMetricsEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Method setStaticData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static Method getSignalUnwindStackFunction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Method getCurrentCallbackSetCounts;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Method getCurrentNativeApiCallUsage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static Method initCallbackCounts;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static Method notifyAddCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static Method notifyRemoveCallback;

    /* renamed from: j, reason: collision with root package name */
    public static final C6507z0 f63642j = new C6507z0();

    private final Method c(String name, Class<?>... parameterTypes) {
        I0 i02 = ndkPlugin;
        if (i02 == null) {
            return null;
        }
        return i02.getClass().getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
    }

    public final Map<String, Integer> a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = getCurrentCallbackSetCounts;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(ndkPlugin, null);
        if (objInvoke != null) {
            return (Map) objInvoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
    }

    public final Map<String, Boolean> b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = getCurrentNativeApiCallUsage;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(ndkPlugin, null);
        if (objInvoke != null) {
            return (Map) objInvoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
    }

    public final void d(Map<String, Integer> counts) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = initCallbackCounts;
        if (method != null) {
            method.invoke(ndkPlugin, counts);
        }
    }

    public final void e(boolean enabled) {
        Method method = setInternalMetricsEnabled;
        if (method != null) {
            method.invoke(ndkPlugin, Boolean.valueOf(enabled));
        }
    }

    public final void f(I0 plugin) {
        if (plugin != null) {
            ndkPlugin = plugin;
            setInternalMetricsEnabled = c("setInternalMetricsEnabled", Boolean.TYPE);
            setStaticData = c("setStaticData", Map.class);
            getSignalUnwindStackFunction = c("getSignalUnwindStackFunction", new Class[0]);
            getCurrentCallbackSetCounts = c("getCurrentCallbackSetCounts", new Class[0]);
            getCurrentNativeApiCallUsage = c("getCurrentNativeApiCallUsage", new Class[0]);
            initCallbackCounts = c("initCallbackCounts", Map.class);
            notifyAddCallback = c("notifyAddCallback", String.class);
            notifyRemoveCallback = c("notifyRemoveCallback", String.class);
        }
    }

    public final void g(Map<String, ? extends Object> data) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = setStaticData;
        if (method != null) {
            method.invoke(ndkPlugin, data);
        }
    }

    private C6507z0() {
    }
}
