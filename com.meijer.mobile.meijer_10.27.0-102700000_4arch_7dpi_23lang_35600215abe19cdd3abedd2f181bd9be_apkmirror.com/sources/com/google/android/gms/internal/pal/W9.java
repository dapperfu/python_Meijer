package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class W9 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f82937a;

    public W9(Class cls) {
        this.f82937a = cls;
    }

    public abstract InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException;

    public abstract InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi;

    public abstract void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException;

    public final Class e() {
        return this.f82937a;
    }

    public Map c() throws GeneralSecurityException {
        return Collections.EMPTY_MAP;
    }
}
