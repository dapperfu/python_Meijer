package bt;

import Bv.f;
import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u0018B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lbt/c;", "", "", "seen0", "", "alg", "kid", "LDv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "c", "(Lbt/c;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getAlg$annotations", "()V", "b", "getKid$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String alg;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String kid;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/JwtHeader.$serializer", "LDv/z;", "Lbt/c;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lbt/c;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lbt/c;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60629a;
        private static final f descriptor;

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            r0 r0Var = r0.f6781a;
            return new zv.b[]{r0Var, r0Var};
        }

        static {
            a aVar = new a();
            f60629a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.jwt.JwtHeader", aVar, 2);
            c3136e0.p("alg", false);
            c3136e0.p("kid", false);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final c c(Cv.e decoder) {
            String strQ;
            String strQ2;
            int i10;
            Intrinsics.j(decoder, "decoder");
            f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            n0 n0Var = null;
            if (cVarB.p()) {
                strQ = cVarB.q(fVar, 0);
                strQ2 = cVarB.q(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strQ = null;
                String strQ3 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        strQ = cVarB.q(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iF != 1) {
                            throw new UnknownFieldException(iF);
                        }
                        strQ3 = cVarB.q(fVar, 1);
                        i11 |= 2;
                    }
                }
                strQ2 = strQ3;
                i10 = i11;
            }
            cVarB.a(fVar);
            return new c(i10, strQ, strQ2, n0Var);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, c value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            c.c(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/c$b;", "", "<init>", "()V", "Lzv/b;", "Lbt/c;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<c> serializer() {
            return a.f60629a;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void c(c self, Cv.d output, f serialDesc) {
        output.o(serialDesc, 0, self.alg);
        output.o(serialDesc, 1, self.kid);
    }

    public /* synthetic */ c(int i10, String str, String str2, n0 n0Var) {
        if (3 != (i10 & 3)) {
            Z.a(i10, 3, a.f60629a.getDescriptor());
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
