package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
final class S5 {

    /* renamed from: c, reason: collision with root package name */
    private static final S5 f82821c = new S5();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f82822d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f82824b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final W5 f82823a = new B5();

    public static S5 a() {
        return f82821c;
    }

    public final V5 b(Class cls) {
        C10611o5.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f82824b;
        V5 v5Zza = (V5) concurrentMap.get(cls);
        if (v5Zza == null) {
            v5Zza = this.f82823a.zza(cls);
            C10611o5.a(cls, "messageType");
            V5 v52 = (V5) concurrentMap.putIfAbsent(cls, v5Zza);
            if (v52 != null) {
                return v52;
            }
        }
        return v5Zza;
    }

    private S5() {
    }
}
