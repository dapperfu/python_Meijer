package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class W9 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f83777a;

    public W9(Class cls) {
        this.f83777a = cls;
    }

    public abstract InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException;

    public abstract InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi;

    public abstract void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException;

    public final Class e() {
        return this.f83777a;
    }

    public Map c() throws GeneralSecurityException {
        return Collections.EMPTY_MAP;
    }
}
