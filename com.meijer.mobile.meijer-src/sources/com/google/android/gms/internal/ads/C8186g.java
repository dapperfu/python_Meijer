package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8186g implements InterfaceC7202Pq {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f75050a = 0;

    /* synthetic */ C8186g(C8400i c8400i) {
    }

    static {
        C7614ag0.a(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.f
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                int i10 = C8186g.f75050a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (objInvoke != null) {
                        return (InterfaceC7202Pq) objInvoke;
                    }
                    throw null;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
        });
    }
}
