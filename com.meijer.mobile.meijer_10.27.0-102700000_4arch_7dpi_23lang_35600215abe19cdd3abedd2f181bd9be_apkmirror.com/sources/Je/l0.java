package Je;

import Je.p0;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class l0 extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final p0 f15001a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f15002b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f15003c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15004d;

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f15003c;
    }

    public Integer e() {
        return this.f15004d;
    }

    public We.b f() {
        return this.f15002b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public p0 a() {
        return this.f15001a;
    }

    private l0(p0 p0Var, We.b bVar, We.a aVar, Integer num) {
        this.f15001a = p0Var;
        this.f15002b = bVar;
        this.f15003c = aVar;
        this.f15004d = num;
    }

    public static l0 d(p0 p0Var, We.b bVar, Integer num) throws GeneralSecurityException {
        p0.a aVarD = p0Var.d();
        p0.a aVar = p0.a.f15025c;
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

    private static We.a g(p0 p0Var, Integer num) {
        if (p0Var.d() == p0.a.f15025c) {
            return com.google.crypto.tink.internal.x.f88234a;
        }
        if (p0Var.d() == p0.a.f15024b) {
            return com.google.crypto.tink.internal.x.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + p0Var.d());
    }
}
