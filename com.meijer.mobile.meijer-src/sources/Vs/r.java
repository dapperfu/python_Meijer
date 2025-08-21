package Vs;

import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.L;
import Dv.Z;
import Dv.n0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0012\u0010B#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"LVs/r;", "", "", "seen0", "", "issuedAt", "LDv/n0;", "serializationConstructorMarker", "<init>", "(IJLDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "b", "(LVs/r;LCv/d;LBv/f;)V", "a", "J", "()J", "getIssuedAt$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long issuedAt;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/TokenInitializationPayload.$serializer", "LDv/z;", "LVs/r;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LVs/r;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LVs/r;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<r> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40445a;
        private static final Bv.f descriptor;

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            return new zv.b[]{L.f6708a};
        }

        static {
            a aVar = new a();
            f40445a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.credential.TokenInitializationPayload", aVar, 1);
            c3136e0.p("iat", false);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final r c(Cv.e decoder) {
            long jC;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            int i10 = 1;
            if (cVarB.p()) {
                jC = cVarB.C(fVar, 0);
            } else {
                long jC2 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else {
                        if (iF != 0) {
                            throw new UnknownFieldException(iF);
                        }
                        jC2 = cVarB.C(fVar, 0);
                        i11 = 1;
                    }
                }
                jC = jC2;
                i10 = i11;
            }
            cVarB.a(fVar);
            return new r(i10, jC, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, r value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            r.b(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVs/r$b;", "", "<init>", "()V", "Lzv/b;", "LVs/r;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<r> serializer() {
            return a.f40445a;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void b(r self, Cv.d output, Bv.f serialDesc) {
        output.j(serialDesc, 0, self.issuedAt);
    }

    public /* synthetic */ r(int i10, long j10, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Z.a(i10, 1, a.f40445a.getDescriptor());
        }
        this.issuedAt = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getIssuedAt() {
        return this.issuedAt;
    }
}
