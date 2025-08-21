package Le;

import Le.p0;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class l0 extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final p0 f18338a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18339b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18340c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18341d;

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18340c;
    }

    public Integer e() {
        return this.f18341d;
    }

    public Ye.b f() {
        return this.f18339b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public p0 a() {
        return this.f18338a;
    }

    private l0(p0 p0Var, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18338a = p0Var;
        this.f18339b = bVar;
        this.f18340c = aVar;
        this.f18341d = num;
    }

    public static l0 d(p0 p0Var, Ye.b bVar, Integer num) throws GeneralSecurityException {
        p0.a aVarD = p0Var.d();
        p0.a aVar = p0.a.f18362c;
        if (aVarD != aVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + p0Var.d() + " the value of idRequirement must be non-null");
        }
        if (p0Var.d() == aVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            return new l0(p0Var, bVar, g(p0Var, num), num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    private static Ye.a g(p0 p0Var, Integer num) {
        if (p0Var.d() == p0.a.f18362c) {
            return com.google.crypto.tink.internal.x.f89074a;
        }
        if (p0Var.d() == p0.a.f18361b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + p0Var.d());
    }
}
