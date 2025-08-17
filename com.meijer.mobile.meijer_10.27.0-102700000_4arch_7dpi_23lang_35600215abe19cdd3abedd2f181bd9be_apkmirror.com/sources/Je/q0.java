package Je;

import Je.u0;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class q0 extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f15034a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f15035b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f15036c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15037d;

    public static q0 d(u0.a aVar, We.b bVar, Integer num) throws GeneralSecurityException {
        u0.a aVar2 = u0.a.f15062d;
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

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f15036c;
    }

    public Integer e() {
        return this.f15037d;
    }

    public We.b f() {
        return this.f15035b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public u0 a() {
        return this.f15034a;
    }

    private q0(u0 u0Var, We.b bVar, We.a aVar, Integer num) {
        this.f15034a = u0Var;
        this.f15035b = bVar;
        this.f15036c = aVar;
        this.f15037d = num;
    }

    private static We.a g(u0 u0Var, Integer num) {
        if (u0Var.c() == u0.a.f15062d) {
            return com.google.crypto.tink.internal.x.f88234a;
        }
        if (u0Var.c() == u0.a.f15061c) {
            return com.google.crypto.tink.internal.x.a(num.intValue());
        }
        if (u0Var.c() == u0.a.f15060b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + u0Var.c());
    }
}
