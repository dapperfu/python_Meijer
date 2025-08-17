package hg;

import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.n0;
import Hv.r0;
import hg.ProcessData;
import hg.SessionDetails;
import hg.Time;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002#\u0019B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lhg/E;", "", "Lhg/H;", "sessionDetails", "Lhg/W;", "backgroundTime", "", "", "Lhg/v;", "processDataMap", "<init>", "(Lhg/H;Lhg/W;Ljava/util/Map;)V", "", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILhg/H;Lhg/W;Ljava/util/Map;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "g", "(Lhg/E;LGv/d;LFv/f;)V", "b", "(Lhg/H;Lhg/W;Ljava/util/Map;)Lhg/E;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg/H;", "f", "()Lhg/H;", "Lhg/W;", "d", "()Lhg/W;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.E, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SessionData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    private static final Dv.b<Object>[] f134736d = {null, null, new Hv.H(r0.f13359a, ProcessData.a.f134944a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SessionDetails sessionDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Time backgroundTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, ProcessData> processDataMap;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "LHv/z;", "Lhg/E;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lhg/E;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lhg/E;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: hg.E$a */
    public /* synthetic */ class a implements InterfaceC3718z<SessionData> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f134740a;
        private static final Fv.f descriptor;

        static {
            a aVar = new a();
            f134740a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.google.firebase.sessions.SessionData", aVar, 3);
            c3694e0.p("sessionDetails", false);
            c3694e0.p("backgroundTime", true);
            c3694e0.p("processDataMap", true);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final Fv.f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SessionData d(Gv.e decoder) {
            int i10;
            SessionDetails sessionDetails;
            Time time;
            Map map;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            Dv.b[] bVarArr = SessionData.f134736d;
            SessionDetails sessionDetails2 = null;
            if (cVarC.n()) {
                SessionDetails sessionDetails3 = (SessionDetails) cVarC.m(fVar, 0, SessionDetails.a.f134747a, null);
                Time time2 = (Time) cVarC.l(fVar, 1, Time.a.f134842a, null);
                map = (Map) cVarC.l(fVar, 2, bVarArr[2], null);
                sessionDetails = sessionDetails3;
                i10 = 7;
                time = time2;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Time time3 = null;
                Map map2 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        sessionDetails2 = (SessionDetails) cVarC.m(fVar, 0, SessionDetails.a.f134747a, sessionDetails2);
                        i11 |= 1;
                    } else if (iV == 1) {
                        time3 = (Time) cVarC.l(fVar, 1, Time.a.f134842a, time3);
                        i11 |= 2;
                    } else {
                        if (iV != 2) {
                            throw new UnknownFieldException(iV);
                        }
                        map2 = (Map) cVarC.l(fVar, 2, bVarArr[2], map2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                sessionDetails = sessionDetails2;
                time = time3;
                map = map2;
            }
            cVarC.a(fVar);
            return new SessionData(i10, sessionDetails, time, map, (n0) null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, SessionData value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            SessionData.g(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            return new Dv.b[]{SessionDetails.a.f134747a, Ev.a.p(Time.a.f134842a), Ev.a.p(SessionData.f134736d[2])};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhg/E$b;", "", "<init>", "()V", "LDv/b;", "Lhg/E;", "serializer", "()LDv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: hg.E$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<SessionData> serializer() {
            return a.f134740a;
        }
    }

    public /* synthetic */ SessionData(int i10, SessionDetails sessionDetails, Time time, Map map, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Hv.Z.a(i10, 1, a.f134740a.getDescriptor());
        }
        this.sessionDetails = sessionDetails;
        if ((i10 & 2) == 0) {
            this.backgroundTime = null;
        } else {
            this.backgroundTime = time;
        }
        if ((i10 & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) other;
        return Intrinsics.e(this.sessionDetails, sessionData.sessionDetails) && Intrinsics.e(this.backgroundTime, sessionData.backgroundTime) && Intrinsics.e(this.processDataMap, sessionData.processDataMap);
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map<String, ProcessData> map) {
        Intrinsics.j(sessionDetails, "sessionDetails");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData c(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
        }
        if ((i10 & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i10 & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.b(sessionDetails, time, map);
    }

    @JvmStatic
    public static final /* synthetic */ void g(SessionData self, Gv.d output, Fv.f serialDesc) {
        Dv.b<Object>[] bVarArr = f134736d;
        output.z(serialDesc, 0, SessionDetails.a.f134747a, self.sessionDetails);
        if (output.m(serialDesc, 1) || self.backgroundTime != null) {
            output.o(serialDesc, 1, Time.a.f134842a, self.backgroundTime);
        }
        if (!output.m(serialDesc, 2) && self.processDataMap == null) {
            return;
        }
        output.o(serialDesc, 2, bVarArr[2], self.processDataMap);
    }

    public final SessionData b(SessionDetails sessionDetails, Time backgroundTime, Map<String, ProcessData> processDataMap) {
        Intrinsics.j(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, backgroundTime, processDataMap);
    }

    /* renamed from: d, reason: from getter */
    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> e() {
        return this.processDataMap;
    }

    /* renamed from: f, reason: from getter */
    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int iHashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int iHashCode2 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map<String, ProcessData> map = this.processDataMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + ')';
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionDetails, (i10 & 2) != 0 ? null : time, (i10 & 4) != 0 ? null : map);
    }
}
