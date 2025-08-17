package Vs;

import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.L;
import Hv.Z;
import Hv.n0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0012\u0010B#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"LVs/r;", "", "", "seen0", "", "issuedAt", "LHv/n0;", "serializationConstructorMarker", "<init>", "(IJLHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "b", "(LVs/r;LGv/d;LFv/f;)V", "a", "J", "()J", "getIssuedAt$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long issuedAt;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/TokenInitializationPayload.$serializer", "LHv/z;", "LVs/r;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LVs/r;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LVs/r;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3718z<r> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38018a;
        private static final Fv.f descriptor;

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            return new Dv.b[]{L.f13286a};
        }

        static {
            a aVar = new a();
            f38018a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.credential.TokenInitializationPayload", aVar, 1);
            c3694e0.p("iat", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final Fv.f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final r d(Gv.e decoder) {
            long jY;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            int i10 = 1;
            if (cVarC.n()) {
                jY = cVarC.y(fVar, 0);
            } else {
                long jY2 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else {
                        if (iV != 0) {
                            throw new UnknownFieldException(iV);
                        }
                        jY2 = cVarC.y(fVar, 0);
                        i11 = 1;
                    }
                }
                jY = jY2;
                i10 = i11;
            }
            cVarC.a(fVar);
            return new r(i10, jY, null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, r value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            r.b(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVs/r$b;", "", "<init>", "()V", "LDv/b;", "LVs/r;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<r> serializer() {
            return a.f38018a;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void b(r self, Gv.d output, Fv.f serialDesc) {
        output.e(serialDesc, 0, self.issuedAt);
    }

    public /* synthetic */ r(int i10, long j10, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Z.a(i10, 1, a.f38018a.getDescriptor());
        }
        this.issuedAt = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getIssuedAt() {
        return this.issuedAt;
    }
}
