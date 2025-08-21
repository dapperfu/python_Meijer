package Le;

import Le.N;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public class M extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final N f18223a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.a f18224b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f18225c;

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18224b;
    }

    public Integer e() {
        return this.f18225c;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public N a() {
        return this.f18223a;
    }

    private M(N n10, Ye.a aVar, Integer num) {
        this.f18223a = n10;
        this.f18224b = aVar;
        this.f18225c = num;
    }

    public static M d(N n10, Integer num) throws GeneralSecurityException {
        Ye.a aVarA;
        if (n10.d() == N.a.f18228b) {
            if (num != null) {
                aVarA = Ye.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (n10.d() == N.a.f18229c) {
            if (num == null) {
                aVarA = Ye.a.a(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: " + n10.d());
        }
        return new M(n10, aVarA, num);
    }
}
