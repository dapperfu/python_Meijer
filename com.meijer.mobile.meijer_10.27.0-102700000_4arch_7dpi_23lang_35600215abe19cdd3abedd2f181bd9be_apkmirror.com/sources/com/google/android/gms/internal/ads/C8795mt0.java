package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8795mt0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C8795mt0 f76915b = new C8795mt0(new C8902nt0());

    /* renamed from: c, reason: collision with root package name */
    public static final C8795mt0 f76916c = new C8795mt0(new C9329rt0());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8581kt0 f76917a;

    static {
        new C8795mt0(new C9543tt0());
        new C8795mt0(new C9436st0());
        new C8795mt0(new C9009ot0());
        new C8795mt0(new C9223qt0());
        new C8795mt0(new C9116pt0());
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
        return this.f76917a.zza(str);
    }

    public C8795mt0(InterfaceC9650ut0 interfaceC9650ut0) {
        InterfaceC8581kt0 c8474jt0;
        if (!C8038fo0.b()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                c8474jt0 = new C8262ht0(interfaceC9650ut0, null);
            } else {
                c8474jt0 = new C8367it0(interfaceC9650ut0, null);
            }
        } else {
            c8474jt0 = new C8474jt0(interfaceC9650ut0, null);
        }
        this.f76917a = c8474jt0;
    }
}
