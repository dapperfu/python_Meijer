package mg;

import Dv.C3136e0;
import Dv.C3141h;
import Dv.C3154t;
import Dv.E;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002!%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b!\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u0006/"}, d2 = {"Lmg/h;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "f", "(Lmg/h;LCv/d;LBv/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: mg.h, reason: from toString */
/* loaded from: classes8.dex */
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

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "LDv/z;", "Lmg/h;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lmg/h;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lmg/h;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: mg.h$a */
    public /* synthetic */ class a implements InterfaceC3160z<SessionConfigs> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151039a;
        private static final Bv.f descriptor;

        static {
            a aVar = new a();
            f151039a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            c3136e0.p("sessionsEnabled", false);
            c3136e0.p("sessionSamplingRate", false);
            c3136e0.p("sessionTimeoutSeconds", false);
            c3136e0.p("cacheDurationSeconds", false);
            c3136e0.p("cacheUpdatedTimeSeconds", false);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        public final Bv.f a() {
            return descriptor;
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            zv.b<?> bVarP = Av.a.p(C3141h.f6753a);
            zv.b<?> bVarP2 = Av.a.p(C3154t.f6787a);
            E e10 = E.f6691a;
            return new zv.b[]{bVarP, bVarP2, Av.a.p(e10), Av.a.p(e10), Av.a.p(L.f6708a)};
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SessionConfigs c(Cv.e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            Boolean bool2 = null;
            if (cVarB.p()) {
                Boolean bool3 = (Boolean) cVarB.u(fVar, 0, C3141h.f6753a, null);
                Double d11 = (Double) cVarB.u(fVar, 1, C3154t.f6787a, null);
                E e10 = E.f6691a;
                Integer num3 = (Integer) cVarB.u(fVar, 2, e10, null);
                bool = bool3;
                num2 = (Integer) cVarB.u(fVar, 3, e10, null);
                l10 = (Long) cVarB.u(fVar, 4, L.f6708a, null);
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
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        bool2 = (Boolean) cVarB.u(fVar, 0, C3141h.f6753a, bool2);
                        i11 |= 1;
                    } else if (iF == 1) {
                        d12 = (Double) cVarB.u(fVar, 1, C3154t.f6787a, d12);
                        i11 |= 2;
                    } else if (iF == 2) {
                        num4 = (Integer) cVarB.u(fVar, 2, E.f6691a, num4);
                        i11 |= 4;
                    } else if (iF == 3) {
                        num5 = (Integer) cVarB.u(fVar, 3, E.f6691a, num5);
                        i11 |= 8;
                    } else {
                        if (iF != 4) {
                            throw new UnknownFieldException(iF);
                        }
                        l11 = (Long) cVarB.u(fVar, 4, L.f6708a, l11);
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
            cVarB.a(fVar);
            return new SessionConfigs(i10, bool, d10, num, num2, l10, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, SessionConfigs value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            SessionConfigs.f(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmg/h$b;", "", "<init>", "()V", "Lzv/b;", "Lmg/h;", "serializer", "()Lzv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: mg.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<SessionConfigs> serializer() {
            return a.f151039a;
        }
    }

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, n0 n0Var) {
        if (31 != (i10 & 31)) {
            Z.a(i10, 31, a.f151039a.a());
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
    public static final /* synthetic */ void f(SessionConfigs self, Cv.d output, Bv.f serialDesc) {
        output.t(serialDesc, 0, C3141h.f6753a, self.sessionsEnabled);
        output.t(serialDesc, 1, C3154t.f6787a, self.sessionSamplingRate);
        E e10 = E.f6691a;
        output.t(serialDesc, 2, e10, self.sessionTimeoutSeconds);
        output.t(serialDesc, 3, e10, self.cacheDurationSeconds);
        output.t(serialDesc, 4, L.f6708a, self.cacheUpdatedTimeSeconds);
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
