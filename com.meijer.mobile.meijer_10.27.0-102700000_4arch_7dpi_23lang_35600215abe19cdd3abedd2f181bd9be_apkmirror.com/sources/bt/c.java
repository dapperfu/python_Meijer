package bt;

import Fv.f;
import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.Z;
import Hv.n0;
import Hv.r0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u0018B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lbt/c;", "", "", "seen0", "", "alg", "kid", "LHv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "c", "(Lbt/c;LGv/d;LFv/f;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getAlg$annotations", "()V", "b", "getKid$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String alg;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String kid;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/JwtHeader.$serializer", "LHv/z;", "Lbt/c;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lbt/c;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lbt/c;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3718z<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60755a;
        private static final f descriptor;

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            r0 r0Var = r0.f13359a;
            return new Dv.b[]{r0Var, r0Var};
        }

        static {
            a aVar = new a();
            f60755a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.jwt.JwtHeader", aVar, 2);
            c3694e0.p("alg", false);
            c3694e0.p("kid", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final c d(Gv.e decoder) {
            String strR;
            String strR2;
            int i10;
            Intrinsics.j(decoder, "decoder");
            f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            n0 n0Var = null;
            if (cVarC.n()) {
                strR = cVarC.r(fVar, 0);
                strR2 = cVarC.r(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strR = null;
                String strR3 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        strR = cVarC.r(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iV != 1) {
                            throw new UnknownFieldException(iV);
                        }
                        strR3 = cVarC.r(fVar, 1);
                        i11 |= 2;
                    }
                }
                strR2 = strR3;
                i10 = i11;
            }
            cVarC.a(fVar);
            return new c(i10, strR, strR2, n0Var);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, c value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            c.c(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/c$b;", "", "<init>", "()V", "LDv/b;", "Lbt/c;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<c> serializer() {
            return a.f60755a;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void c(c self, Gv.d output, f serialDesc) {
        output.v(serialDesc, 0, self.alg);
        output.v(serialDesc, 1, self.kid);
    }

    public /* synthetic */ c(int i10, String str, String str2, n0 n0Var) {
        if (3 != (i10 & 3)) {
            Z.a(i10, 3, a.f60755a.getDescriptor());
        }
        this.alg = str;
        this.kid = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    /* renamed from: b, reason: from getter */
    public final String getKid() {
        return this.kid;
    }
}
