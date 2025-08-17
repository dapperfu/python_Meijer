package kg;

import Hv.C3694e0;
import Hv.C3699h;
import Hv.C3712t;
import Hv.E;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002!%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b!\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u0006/"}, d2 = {"Lkg/h;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "f", "(Lkg/h;LGv/d;LFv/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: kg.h, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SessionConfigs {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean sessionsEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double sessionSamplingRate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sessionTimeoutSeconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cacheDurationSeconds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long cacheUpdatedTimeSeconds;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "LHv/z;", "Lkg/h;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lkg/h;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lkg/h;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: kg.h$a */
    public /* synthetic */ class a implements InterfaceC3718z<SessionConfigs> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141893a;
        private static final Fv.f descriptor;

        static {
            a aVar = new a();
            f141893a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            c3694e0.p("sessionsEnabled", false);
            c3694e0.p("sessionSamplingRate", false);
            c3694e0.p("sessionTimeoutSeconds", false);
            c3694e0.p("cacheDurationSeconds", false);
            c3694e0.p("cacheUpdatedTimeSeconds", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        public final Fv.f a() {
            return descriptor;
        }

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            Dv.b<?> bVarP = Ev.a.p(C3699h.f13331a);
            Dv.b<?> bVarP2 = Ev.a.p(C3712t.f13365a);
            E e10 = E.f13269a;
            return new Dv.b[]{bVarP, bVarP2, Ev.a.p(e10), Ev.a.p(e10), Ev.a.p(L.f13286a)};
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SessionConfigs d(Gv.e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            Boolean bool2 = null;
            if (cVarC.n()) {
                Boolean bool3 = (Boolean) cVarC.l(fVar, 0, C3699h.f13331a, null);
                Double d11 = (Double) cVarC.l(fVar, 1, C3712t.f13365a, null);
                E e10 = E.f13269a;
                Integer num3 = (Integer) cVarC.l(fVar, 2, e10, null);
                bool = bool3;
                num2 = (Integer) cVarC.l(fVar, 3, e10, null);
                l10 = (Long) cVarC.l(fVar, 4, L.f13286a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        bool2 = (Boolean) cVarC.l(fVar, 0, C3699h.f13331a, bool2);
                        i11 |= 1;
                    } else if (iV == 1) {
                        d12 = (Double) cVarC.l(fVar, 1, C3712t.f13365a, d12);
                        i11 |= 2;
                    } else if (iV == 2) {
                        num4 = (Integer) cVarC.l(fVar, 2, E.f13269a, num4);
                        i11 |= 4;
                    } else if (iV == 3) {
                        num5 = (Integer) cVarC.l(fVar, 3, E.f13269a, num5);
                        i11 |= 8;
                    } else {
                        if (iV != 4) {
                            throw new UnknownFieldException(iV);
                        }
                        l11 = (Long) cVarC.l(fVar, 4, L.f13286a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            cVarC.a(fVar);
            return new SessionConfigs(i10, bool, d10, num, num2, l10, null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, SessionConfigs value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            SessionConfigs.f(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkg/h$b;", "", "<init>", "()V", "LDv/b;", "Lkg/h;", "serializer", "()LDv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kg.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<SessionConfigs> serializer() {
            return a.f141893a;
        }
    }

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, n0 n0Var) {
        if (31 != (i10 & 31)) {
            Z.a(i10, 31, a.f141893a.a());
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return Intrinsics.e(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && Intrinsics.e(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && Intrinsics.e(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && Intrinsics.e(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && Intrinsics.e(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public SessionConfigs(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }

    @JvmStatic
    public static final /* synthetic */ void f(SessionConfigs self, Gv.d output, Fv.f serialDesc) {
        output.o(serialDesc, 0, C3699h.f13331a, self.sessionsEnabled);
        output.o(serialDesc, 1, C3712t.f13365a, self.sessionSamplingRate);
        E e10 = E.f13269a;
        output.o(serialDesc, 2, e10, self.sessionTimeoutSeconds);
        output.o(serialDesc, 3, e10, self.cacheDurationSeconds);
        output.o(serialDesc, 4, L.f13286a, self.cacheUpdatedTimeSeconds);
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    /* renamed from: b, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    /* renamed from: c, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }
}
