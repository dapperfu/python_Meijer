package Le;

import Le.u0;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class q0 extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f18371a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18372b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18373c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18374d;

    public static q0 d(u0.a aVar, Ye.b bVar, Integer num) throws GeneralSecurityException {
        u0.a aVar2 = u0.a.f18399d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            u0 u0VarB = u0.b(aVar);
            return new q0(u0VarB, bVar, g(u0VarB, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18373c;
    }

    public Integer e() {
        return this.f18374d;
    }

    public Ye.b f() {
        return this.f18372b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public u0 a() {
        return this.f18371a;
    }

    private q0(u0 u0Var, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18371a = u0Var;
        this.f18372b = bVar;
        this.f18373c = aVar;
        this.f18374d = num;
    }

    private static Ye.a g(u0 u0Var, Integer num) {
        if (u0Var.c() == u0.a.f18399d) {
            return com.google.crypto.tink.internal.x.f89074a;
        }
        if (u0Var.c() == u0.a.f18398c) {
            return com.google.crypto.tink.internal.x.a(num.intValue());
        }
        if (u0Var.c() == u0.a.f18397b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + u0Var.c());
    }
}
