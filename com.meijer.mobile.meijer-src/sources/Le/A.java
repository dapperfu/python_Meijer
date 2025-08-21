package Le;

import Le.E;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class A extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final E f18200a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18201b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18202c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18203d;

    public static A d(E.a aVar, Ye.b bVar, Integer num) throws GeneralSecurityException {
        E.a aVar2 = E.a.f18210d;
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

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18202c;
    }

    public Integer e() {
        return this.f18203d;
    }

    public Ye.b f() {
        return this.f18201b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public E a() {
        return this.f18200a;
    }

    private A(E e10, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18200a = e10;
        this.f18201b = bVar;
        this.f18202c = aVar;
        this.f18203d = num;
    }

    private static Ye.a g(E e10, Integer num) {
        if (e10.c() == E.a.f18210d) {
            return com.google.crypto.tink.internal.x.f89074a;
        }
        if (e10.c() == E.a.f18209c) {
            return com.google.crypto.tink.internal.x.a(num.intValue());
        }
        if (e10.c() == E.a.f18208b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e10.c());
    }
}
