package jg;

import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.n0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\"&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\"\u0010%¨\u0006("}, d2 = {"Ljg/W;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "LDv/n0;", "serializationConstructorMarker", "(IJJJLDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "d", "(Ljg/W;LCv/d;LBv/f;)V", "time", "Lkotlin/time/Duration;", "c", "(Ljg/W;)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMs", "()J", "b", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.W, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Time {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ms;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long us;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long seconds;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/Time.$serializer", "LDv/z;", "Ljg/W;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Ljg/W;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Ljg/W;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    /* renamed from: jg.W$a */
    public /* synthetic */ class a implements InterfaceC3160z<Time> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f140537a;
        private static final Bv.f descriptor;

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            Dv.L l10 = Dv.L.f6708a;
            return new zv.b[]{l10, l10, l10};
        }

        static {
            a aVar = new a();
            f140537a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.google.firebase.sessions.Time", aVar, 3);
            c3136e0.p("ms", false);
            c3136e0.p("us", true);
            c3136e0.p("seconds", true);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        public final Bv.f a() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Time c(Cv.e decoder) {
            int i10;
            long jC;
            long j10;
            long j11;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            if (cVarB.p()) {
                long jC2 = cVarB.C(fVar, 0);
                long jC3 = cVarB.C(fVar, 1);
                jC = cVarB.C(fVar, 2);
                i10 = 7;
                j10 = jC2;
                j11 = jC3;
            } else {
                long jC4 = 0;
                boolean z10 = true;
                int i11 = 0;
                long jC5 = 0;
                long jC6 = 0;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        jC5 = cVarB.C(fVar, 0);
                        i11 |= 1;
                    } else if (iF == 1) {
                        jC6 = cVarB.C(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iF != 2) {
                            throw new UnknownFieldException(iF);
                        }
                        jC4 = cVarB.C(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jC = jC4;
                j10 = jC5;
                j11 = jC6;
            }
            cVarB.a(fVar);
            return new Time(i10, j10, j11, jC, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, Time value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            Time.d(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljg/W$b;", "", "<init>", "()V", "Lzv/b;", "Ljg/W;", "serializer", "()Lzv/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: jg.W$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<Time> serializer() {
            return a.f140537a;
        }
    }

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Dv.Z.a(i10, 1, a.f140537a.a());
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
    public static final /* synthetic */ void d(Time self, Cv.d output, Bv.f serialDesc) {
        output.j(serialDesc, 0, self.ms);
        if (output.z(serialDesc, 1) || self.us != self.ms * 1000) {
            output.j(serialDesc, 1, self.us);
        }
        if (!output.z(serialDesc, 2) && self.seconds == self.ms / 1000) {
            return;
        }
        output.j(serialDesc, 2, self.seconds);
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
        return DurationKt.t(this.ms - time.ms, DurationUnit.f148416d);
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
