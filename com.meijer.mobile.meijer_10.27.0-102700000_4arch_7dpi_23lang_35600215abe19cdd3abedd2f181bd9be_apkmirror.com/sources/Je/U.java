package Je;

import Je.V;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class U extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final V f14900a;

    /* renamed from: b, reason: collision with root package name */
    private final We.a f14901b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f14902c;

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f14901b;
    }

    public Integer e() {
        return this.f14902c;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public V a() {
        return this.f14900a;
    }

    private U(V v10, We.a aVar, Integer num) {
        this.f14900a = v10;
        this.f14901b = aVar;
        this.f14902c = num;
    }

    public static U d(V v10, Integer num) throws GeneralSecurityException {
        We.a aVarB;
        if (v10.e() == V.d.f14919c) {
            if (num == null) {
                aVarB = com.google.crypto.tink.internal.x.f88234a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (v10.e() == V.d.f14918b) {
            if (num != null) {
                aVarB = com.google.crypto.tink.internal.x.b(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: " + v10.e());
        }
        return new U(v10, aVarB, num);
    }
}
