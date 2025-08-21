package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class Y9 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f83816a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f83817b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f83818c;

    public abstract EnumC10987qd b();

    public abstract InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi;

    public abstract String d();

    public abstract void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException;

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f83818c;
    }

    public final Class h() {
        return this.f83816a;
    }

    public W9 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public final Object i(InterfaceC10815g1 interfaceC10815g1, Class cls) throws GeneralSecurityException {
        AbstractC10952oa abstractC10952oa = (AbstractC10952oa) this.f83817b.get(cls);
        if (abstractC10952oa != null) {
            return abstractC10952oa.a(interfaceC10815g1);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f83817b.keySet();
    }

    @SafeVarargs
    protected Y9(Class cls, AbstractC10952oa... abstractC10952oaArr) {
        this.f83816a = cls;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            AbstractC10952oa abstractC10952oa = abstractC10952oaArr[i10];
            if (!map.containsKey(abstractC10952oa.b())) {
                map.put(abstractC10952oa.b(), abstractC10952oa);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(abstractC10952oa.b().getCanonicalName())));
            }
        }
        this.f83818c = abstractC10952oaArr[0].b();
        this.f83817b = Collections.unmodifiableMap(map);
    }
}
