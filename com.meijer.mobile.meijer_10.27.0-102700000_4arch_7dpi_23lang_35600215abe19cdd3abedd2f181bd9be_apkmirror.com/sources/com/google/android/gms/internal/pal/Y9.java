package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class Y9 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f82976a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f82977b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f82978c;

    public abstract EnumC10862qd b();

    public abstract InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi;

    public abstract String d();

    public abstract void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException;

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f82978c;
    }

    public final Class h() {
        return this.f82976a;
    }

    public W9 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public final Object i(InterfaceC10690g1 interfaceC10690g1, Class cls) throws GeneralSecurityException {
        AbstractC10827oa abstractC10827oa = (AbstractC10827oa) this.f82977b.get(cls);
        if (abstractC10827oa != null) {
            return abstractC10827oa.a(interfaceC10690g1);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f82977b.keySet();
    }

    @SafeVarargs
    protected Y9(Class cls, AbstractC10827oa... abstractC10827oaArr) {
        this.f82976a = cls;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            AbstractC10827oa abstractC10827oa = abstractC10827oaArr[i10];
            if (!map.containsKey(abstractC10827oa.b())) {
                map.put(abstractC10827oa.b(), abstractC10827oa);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(abstractC10827oa.b().getCanonicalName())));
            }
        }
        this.f82978c = abstractC10827oaArr[0].b();
        this.f82977b = Collections.unmodifiableMap(map);
    }
}
