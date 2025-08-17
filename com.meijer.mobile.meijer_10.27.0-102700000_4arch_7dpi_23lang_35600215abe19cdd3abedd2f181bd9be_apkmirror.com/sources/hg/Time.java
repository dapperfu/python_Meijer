package hg;

import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.n0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\"&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\"\u0010%¨\u0006("}, d2 = {"Lhg/W;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "LHv/n0;", "serializationConstructorMarker", "(IJJJLHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "d", "(Lhg/W;LGv/d;LFv/f;)V", "time", "Lkotlin/time/Duration;", "c", "(Lhg/W;)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMs", "()J", "b", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.W, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class Time {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ms;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long us;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long seconds;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/Time.$serializer", "LHv/z;", "Lhg/W;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lhg/W;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lhg/W;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: hg.W$a */
    public /* synthetic */ class a implements InterfaceC3718z<Time> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f134842a;
        private static final Fv.f descriptor;

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            Hv.L l10 = Hv.L.f13286a;
            return new Dv.b[]{l10, l10, l10};
        }

        static {
            a aVar = new a();
            f134842a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.google.firebase.sessions.Time", aVar, 3);
            c3694e0.p("ms", false);
            c3694e0.p("us", true);
            c3694e0.p("seconds", true);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        public final Fv.f a() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Time d(Gv.e decoder) {
            int i10;
            long jY;
            long j10;
            long j11;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            if (cVarC.n()) {
                long jY2 = cVarC.y(fVar, 0);
                long jY3 = cVarC.y(fVar, 1);
                jY = cVarC.y(fVar, 2);
                i10 = 7;
                j10 = jY2;
                j11 = jY3;
            } else {
                long jY4 = 0;
                boolean z10 = true;
                int i11 = 0;
                long jY5 = 0;
                long jY6 = 0;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else if (iV == 0) {
                        jY5 = cVarC.y(fVar, 0);
                        i11 |= 1;
                    } else if (iV == 1) {
                        jY6 = cVarC.y(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iV != 2) {
                            throw new UnknownFieldException(iV);
                        }
                        jY4 = cVarC.y(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jY = jY4;
                j10 = jY5;
                j11 = jY6;
            }
            cVarC.a(fVar);
            return new Time(i10, j10, j11, jY, null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, Time value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            Time.d(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhg/W$b;", "", "<init>", "()V", "LDv/b;", "Lhg/W;", "serializer", "()LDv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: hg.W$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<Time> serializer() {
            return a.f134842a;
        }
    }

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Hv.Z.a(i10, 1, a.f134842a.a());
        }
        this.ms = j10;
        this.us = (i10 & 2) == 0 ? 1000 * j10 : j11;
        if ((i10 & 4) == 0) {
            this.seconds = j10 / 1000;
        } else {
            this.seconds = j12;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void d(Time self, Gv.d output, Fv.f serialDesc) {
        output.e(serialDesc, 0, self.ms);
        if (output.m(serialDesc, 1) || self.us != self.ms * 1000) {
            output.e(serialDesc, 1, self.us);
        }
        if (!output.m(serialDesc, 2) && self.seconds == self.ms / 1000) {
            return;
        }
        output.e(serialDesc, 2, self.seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    /* renamed from: a, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* renamed from: b, reason: from getter */
    public final long getUs() {
        return this.us;
    }

    public final long c(Time time) {
        Intrinsics.j(time, "time");
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.t(this.ms - time.ms, DurationUnit.f147508d);
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j10) {
        this.ms = j10;
        long j11 = 1000;
        this.us = j10 * j11;
        this.seconds = j10 / j11;
    }
}
