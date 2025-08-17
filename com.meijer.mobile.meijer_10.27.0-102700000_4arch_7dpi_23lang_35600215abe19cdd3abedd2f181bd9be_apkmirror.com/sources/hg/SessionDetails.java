package hg;

import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.n0;
import Hv.r0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u001f!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lhg/H;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "e", "(Lhg/H;LGv/d;LFv/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "J", "()J", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.H, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SessionDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstSessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sessionIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long sessionStartTimestampUs;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionDetails.$serializer", "LHv/z;", "Lhg/H;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lhg/H;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lhg/H;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: hg.H$a */
    public /* synthetic */ class a implements InterfaceC3718z<SessionDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f134747a;
        private static final Fv.f descriptor;

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            r0 r0Var = r0.f13359a;
            return new Dv.b[]{r0Var, r0Var, Hv.E.f13269a, Hv.L.f13286a};
        }

        static {
            a aVar = new a();
            f134747a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.google.firebase.sessions.SessionDetails", aVar, 4);
            c3694e0.p("sessionId", false);
            c3694e0.p("firstSessionId", false);
            c3694e0.p("sessionIndex", false);
            c3694e0.p("sessionStartTimestampUs", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        public final Fv.f a() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SessionDetails d(Gv.e decoder) {
            String strR;
            int i10;
            int iF;
            String str;
            long jY;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            if (cVarC.n()) {
                strR = cVarC.r(fVar, 0);
                String strR2 = cVarC.r(fVar, 1);
                i10 = 15;
                iF = cVarC.F(fVar, 2);
                str = strR2;
                jY = cVarC.y(fVar, 3);
            } else {
                strR = null;
                String strR3 = null;
                boolean z10 = true;
                long jY2 = 0;
                int i11 = 0;
                int iF2 = 0;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        strR = cVarC.r(fVar, 0);
                        i11 |= 1;
                    } else if (iV == 1) {
                        strR3 = cVarC.r(fVar, 1);
                        i11 |= 2;
                    } else if (iV == 2) {
                        iF2 = cVarC.F(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iV != 3) {
                            throw new UnknownFieldException(iV);
                        }
                        jY2 = cVarC.y(fVar, 3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                iF = iF2;
                str = strR3;
                jY = jY2;
            }
            String str2 = strR;
            cVarC.a(fVar);
            return new SessionDetails(i10, str2, str, iF, jY, null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, SessionDetails value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            SessionDetails.e(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhg/H$b;", "", "<init>", "()V", "LDv/b;", "Lhg/H;", "serializer", "()LDv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: hg.H$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<SessionDetails> serializer() {
            return a.f134747a;
        }
    }

    public /* synthetic */ SessionDetails(int i10, String str, String str2, int i11, long j10, n0 n0Var) {
        if (15 != (i10 & 15)) {
            Hv.Z.a(i10, 15, a.f134747a.a());
        }
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i11;
        this.sessionStartTimestampUs = j10;
    }

    @JvmStatic
    public static final /* synthetic */ void e(SessionDetails self, Gv.d output, Fv.f serialDesc) {
        output.v(serialDesc, 0, self.sessionId);
        output.v(serialDesc, 1, self.firstSessionId);
        output.f(serialDesc, 2, self.sessionIndex);
        output.e(serialDesc, 3, self.sessionStartTimestampUs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return Intrinsics.e(this.sessionId, sessionDetails.sessionId) && Intrinsics.e(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public SessionDetails(String sessionId, String firstSessionId, int i10, long j10) {
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }

    /* renamed from: a, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* renamed from: b, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: c, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* renamed from: d, reason: from getter */
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.sessionStartTimestampUs);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }
}
