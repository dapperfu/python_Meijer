package Je;

import Je.E;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class A extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final E f14863a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f14864b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f14865c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f14866d;

    public static A d(E.a aVar, We.b bVar, Integer num) throws GeneralSecurityException {
        E.a aVar2 = E.a.f14873d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            E eB = E.b(aVar);
            return new A(eB, bVar, g(eB, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f14865c;
    }

    public Integer e() {
        return this.f14866d;
    }

    public We.b f() {
        return this.f14864b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public E a() {
        return this.f14863a;
    }

    private A(E e10, We.b bVar, We.a aVar, Integer num) {
        this.f14863a = e10;
        this.f14864b = bVar;
        this.f14865c = aVar;
        this.f14866d = num;
    }

    private static We.a g(E e10, Integer num) {
        if (e10.c() == E.a.f14873d) {
            return com.google.crypto.tink.internal.x.f88234a;
        }
        if (e10.c() == E.a.f14872c) {
            return com.google.crypto.tink.internal.x.a(num.intValue());
        }
        if (e10.c() == E.a.f14871b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e10.c());
    }
}
