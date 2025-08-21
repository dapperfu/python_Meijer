package Le;

import Le.V;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class U extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final V f18237a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.a f18238b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f18239c;

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18238b;
    }

    public Integer e() {
        return this.f18239c;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public V a() {
        return this.f18237a;
    }

    private U(V v10, Ye.a aVar, Integer num) {
        this.f18237a = v10;
        this.f18238b = aVar;
        this.f18239c = num;
    }

    public static U d(V v10, Integer num) throws GeneralSecurityException {
        Ye.a aVarB;
        if (v10.e() == V.d.f18256c) {
            if (num == null) {
                aVarB = com.google.crypto.tink.internal.x.f89074a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (v10.e() == V.d.f18255b) {
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
