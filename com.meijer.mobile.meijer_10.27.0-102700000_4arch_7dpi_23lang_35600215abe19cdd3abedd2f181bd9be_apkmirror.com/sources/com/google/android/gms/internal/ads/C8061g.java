package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8061g implements InterfaceC7077Pq {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f74210a = 0;

    /* synthetic */ C8061g(C8275i c8275i) {
    }

    static {
        C7489ag0.a(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.f
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                int i10 = C8061g.f74210a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    if (objInvoke != null) {
                        return (InterfaceC7077Pq) objInvoke;
                    }
                    throw null;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
        });
    }
}
