package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8920mt0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C8920mt0 f77755b = new C8920mt0(new C9027nt0());

    /* renamed from: c, reason: collision with root package name */
    public static final C8920mt0 f77756c = new C8920mt0(new C9454rt0());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8706kt0 f77757a;

    static {
        new C8920mt0(new C9668tt0());
        new C8920mt0(new C9561st0());
        new C8920mt0(new C9134ot0());
        new C8920mt0(new C9348qt0());
        new C8920mt0(new C9241pt0());
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        return this.f77757a.zza(str);
    }

    public C8920mt0(InterfaceC9775ut0 interfaceC9775ut0) {
        InterfaceC8706kt0 c8599jt0;
        if (!C8163fo0.b()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                c8599jt0 = new C8387ht0(interfaceC9775ut0, null);
            } else {
                c8599jt0 = new C8492it0(interfaceC9775ut0, null);
            }
        } else {
            c8599jt0 = new C8599jt0(interfaceC9775ut0, null);
        }
        this.f77757a = c8599jt0;
    }
}
