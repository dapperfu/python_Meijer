package mg;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmg/j;", "", "Lmg/o;", "localOverrideSettings", "remoteSettings", "<init>", "(Lmg/o;Lmg/o;)V", "", "samplingRate", "", "d", "(D)Z", "Lkotlin/time/Duration;", "sessionRestartTimeout", "e", "(J)Z", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lmg/o;", "b", "c", "()Z", "sessionsEnabled", "()D", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o localOverrideSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o remoteSettings;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, 99}, m = "updateSettings")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151045a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f151046b;

        /* renamed from: d, reason: collision with root package name */
        int f151048d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151046b = obj;
            this.f151048d |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        Intrinsics.j(localOverrideSettings, "localOverrideSettings");
        Intrinsics.j(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean d(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    public final double a() {
        Double dC = this.localOverrideSettings.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.remoteSettings.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        Duration durationB = this.localOverrideSettings.b();
        if (durationB != null) {
            long rawValue = durationB.getRawValue();
            if (e(rawValue)) {
                return rawValue;
            }
        }
        Duration durationB2 = this.remoteSettings.b();
        if (durationB2 != null) {
            long rawValue2 = durationB2.getRawValue();
            if (e(rawValue2)) {
                return rawValue2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.s(30, DurationUnit.f148418f);
    }

    public final boolean c() {
        Boolean boolA = this.localOverrideSettings.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.remoteSettings.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.j.b
            if (r0 == 0) goto L13
            r0 = r6
            mg.j$b r0 = (mg.j.b) r0
            int r1 = r0.f151048d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151048d = r1
            goto L18
        L13:
            mg.j$b r0 = new mg.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f151046b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151048d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f151045a
            mg.j r2 = (mg.j) r2
            kotlin.ResultKt.b(r6)
            goto L4d
        L3c:
            kotlin.ResultKt.b(r6)
            mg.o r6 = r5.localOverrideSettings
            r0.f151045a = r5
            r0.f151048d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            mg.o r6 = r2.remoteSettings
            r2 = 0
            r0.f151045a = r2
            r0.f151048d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean e(long sessionRestartTimeout) {
        if (Duration.U(sessionRestartTimeout) && Duration.P(sessionRestartTimeout)) {
            return true;
        }
        return false;
    }
}
