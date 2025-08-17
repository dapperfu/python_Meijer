package Je;

import Je.N;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public class M extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final N f14886a;

    /* renamed from: b, reason: collision with root package name */
    private final We.a f14887b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f14888c;

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f14887b;
    }

    public Integer e() {
        return this.f14888c;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public N a() {
        return this.f14886a;
    }

    private M(N n10, We.a aVar, Integer num) {
        this.f14886a = n10;
        this.f14887b = aVar;
        this.f14888c = num;
    }

    public static M d(N n10, Integer num) throws GeneralSecurityException {
        We.a aVarA;
        if (n10.d() == N.a.f14891b) {
            if (num != null) {
                aVarA = We.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (n10.d() == N.a.f14892c) {
            if (num == null) {
                aVarA = We.a.a(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: " + n10.d());
        }
        return new M(n10, aVarA, num);
    }
}
