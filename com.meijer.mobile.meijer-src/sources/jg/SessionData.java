package jg;

import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.n0;
import Dv.r0;
import java.util.Map;
import jg.ProcessData;
import jg.SessionDetails;
import jg.Time;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002#\u0019B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ljg/E;", "", "Ljg/H;", "sessionDetails", "Ljg/W;", "backgroundTime", "", "", "Ljg/v;", "processDataMap", "<init>", "(Ljg/H;Ljg/W;Ljava/util/Map;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjg/H;Ljg/W;Ljava/util/Map;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "g", "(Ljg/E;LCv/d;LBv/f;)V", "b", "(Ljg/H;Ljg/W;Ljava/util/Map;)Ljg/E;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljg/H;", "f", "()Ljg/H;", "Ljg/W;", "d", "()Ljg/W;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.E, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class SessionData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    private static final zv.b<Object>[] f140431d = {null, null, new Dv.H(r0.f6781a, ProcessData.a.f140639a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SessionDetails sessionDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Time backgroundTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, ProcessData> processDataMap;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "LDv/z;", "Ljg/E;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Ljg/E;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Ljg/E;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: jg.E$a */
    public /* synthetic */ class a implements InterfaceC3160z<SessionData> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f140435a;
        private static final Bv.f descriptor;

        static {
            a aVar = new a();
            f140435a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.google.firebase.sessions.SessionData", aVar, 3);
            c3136e0.p("sessionDetails", false);
            c3136e0.p("backgroundTime", true);
            c3136e0.p("processDataMap", true);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SessionData c(Cv.e decoder) {
            int i10;
            SessionDetails sessionDetails;
            Time time;
            Map map;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            zv.b[] bVarArr = SessionData.f140431d;
            SessionDetails sessionDetails2 = null;
            if (cVarB.p()) {
                SessionDetails sessionDetails3 = (SessionDetails) cVarB.e(fVar, 0, SessionDetails.a.f140442a, null);
                Time time2 = (Time) cVarB.u(fVar, 1, Time.a.f140537a, null);
                map = (Map) cVarB.u(fVar, 2, bVarArr[2], null);
                sessionDetails = sessionDetails3;
                i10 = 7;
                time = time2;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Time time3 = null;
                Map map2 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        sessionDetails2 = (SessionDetails) cVarB.e(fVar, 0, SessionDetails.a.f140442a, sessionDetails2);
                        i11 |= 1;
                    } else if (iF == 1) {
                        time3 = (Time) cVarB.u(fVar, 1, Time.a.f140537a, time3);
                        i11 |= 2;
                    } else {
                        if (iF != 2) {
                            throw new UnknownFieldException(iF);
                        }
                        map2 = (Map) cVarB.u(fVar, 2, bVarArr[2], map2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                sessionDetails = sessionDetails2;
                time = time3;
                map = map2;
            }
            cVarB.a(fVar);
            return new SessionData(i10, sessionDetails, time, map, (n0) null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, SessionData value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            SessionData.g(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            return new zv.b[]{SessionDetails.a.f140442a, Av.a.p(Time.a.f140537a), Av.a.p(SessionData.f140431d[2])};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljg/E$b;", "", "<init>", "()V", "Lzv/b;", "Ljg/E;", "serializer", "()Lzv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: jg.E$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<SessionData> serializer() {
            return a.f140435a;
        }
    }

    public /* synthetic */ SessionData(int i10, SessionDetails sessionDetails, Time time, Map map, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Dv.Z.a(i10, 1, a.f140435a.getDescriptor());
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
    public static final /* synthetic */ void g(SessionData self, Cv.d output, Bv.f serialDesc) {
        zv.b<Object>[] bVarArr = f140431d;
        output.l(serialDesc, 0, SessionDetails.a.f140442a, self.sessionDetails);
        if (output.z(serialDesc, 1) || self.backgroundTime != null) {
            output.t(serialDesc, 1, Time.a.f140537a, self.backgroundTime);
        }
        if (!output.z(serialDesc, 2) && self.processDataMap == null) {
            return;
        }
        output.t(serialDesc, 2, bVarArr[2], self.processDataMap);
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
