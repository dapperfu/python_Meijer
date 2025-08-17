package O7;

import I7.j;
import P7.e;
import Z7.g;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;
import s7.h;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001'BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0083@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0018H\u0003¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u0018H\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cH\u0087@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104¨\u00066"}, d2 = {"LO7/a;", "", "LP7/e;", "exitReasonEventConvertor", "LZ7/a;", "exitReasonTimestampDataSource", "Lw7/a;", "timeProvider", "", "retentionTime", "Landroid/content/Context;", "context", "Ls7/h;", "rumEventDispatcher", "LI7/j;", "sessionInformationProvider", "LZ7/g;", "metricsRepository", "", "isNativeCrashReportingEnabled", "isAnrReportingEnabled", "<init>", "(LP7/e;LZ7/a;Lw7/a;JLandroid/content/Context;Ls7/h;LI7/j;LZ7/g;ZZ)V", "", "Landroid/app/ApplicationExitInfo;", "exitReasons", "LZ7/d;", "metricsData", "", "d", "(Ljava/util/List;LZ7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationExitInfo", "e", "(Landroid/app/ApplicationExitInfo;)Z", "LO7/a$a;", "b", "(Landroid/app/ApplicationExitInfo;)LO7/a$a;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LP7/e;", "LZ7/a;", "Lw7/a;", "J", "Landroid/content/Context;", "f", "Ls7/h;", "g", "LI7/j;", "h", "LZ7/g;", "i", "Z", "j", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e exitReasonEventConvertor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z7.a exitReasonTimestampDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long retentionTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g metricsRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isNativeCrashReportingEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnrReportingEnabled;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LO7/a$a;", "", "Lorg/json/JSONObject;", "event", "", "timestamp", "<init>", "(Lorg/json/JSONObject;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "b", "J", "()J", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: O7.a$a, reason: collision with other inner class name and from toString */
    private static final /* data */ class EventWithTimestamp {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final JSONObject event;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventWithTimestamp)) {
                return false;
            }
            EventWithTimestamp eventWithTimestamp = (EventWithTimestamp) other;
            return Intrinsics.e(this.event, eventWithTimestamp.event) && this.timestamp == eventWithTimestamp.timestamp;
        }

        public EventWithTimestamp(JSONObject event, long j10) {
            Intrinsics.j(event, "event");
            this.event = event;
            this.timestamp = j10;
        }

        /* renamed from: a, reason: from getter */
        public final JSONObject getEvent() {
            return this.event;
        }

        /* renamed from: b, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return (this.event.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "EventWithTimestamp(event=" + this.event + ", timestamp=" + this.timestamp + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.exitreason.ExitReasonProcessor", f = "ExitReasonProcessor.kt", l = {72, 98, 107, 118}, m = "process")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f23374a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23375b;

        /* renamed from: d, reason: collision with root package name */
        int f23377d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23375b = obj;
            this.f23377d |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.exitreason.ExitReasonProcessor", f = "ExitReasonProcessor.kt", l = {134, 161}, m = "processExitReasons")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f23378a;

        /* renamed from: b, reason: collision with root package name */
        Object f23379b;

        /* renamed from: c, reason: collision with root package name */
        Object f23380c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f23381d;

        /* renamed from: f, reason: collision with root package name */
        int f23383f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23381d = obj;
            this.f23383f |= Integer.MIN_VALUE;
            return a.this.d(null, null, this);
        }
    }

    public a(e exitReasonEventConvertor, Z7.a exitReasonTimestampDataSource, InterfaceC17801a timeProvider, long j10, Context context, h rumEventDispatcher, j sessionInformationProvider, g metricsRepository, boolean z10, boolean z11) {
        Intrinsics.j(exitReasonEventConvertor, "exitReasonEventConvertor");
        Intrinsics.j(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(context, "context");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.j(metricsRepository, "metricsRepository");
        this.exitReasonEventConvertor = exitReasonEventConvertor;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.timeProvider = timeProvider;
        this.retentionTime = j10;
        this.context = context;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.isNativeCrashReportingEnabled = z10;
        this.isAnrReportingEnabled = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List<android.app.ApplicationExitInfo> r22, Z7.MetricsDataModel r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.a.d(java.util.List, Z7.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (r2.d(r8, r13, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
    
        if (r13.b(r2, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        if (r13.b(r4, r0) == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final EventWithTimestamp b(ApplicationExitInfo applicationExitInfo) throws JSONException, IOException {
        JSONObject jSONObjectD;
        int reason = applicationExitInfo.getReason();
        if (reason != 5) {
            if (reason != 6) {
                jSONObjectD = null;
            } else {
                jSONObjectD = this.exitReasonEventConvertor.c(applicationExitInfo);
            }
        } else {
            jSONObjectD = this.exitReasonEventConvertor.d(applicationExitInfo);
        }
        if (jSONObjectD == null) {
            return null;
        }
        return new EventWithTimestamp(jSONObjectD, applicationExitInfo.getTimestamp());
    }

    private final boolean e(ApplicationExitInfo applicationExitInfo) {
        int reason = applicationExitInfo.getReason();
        if (reason != 5) {
            if (reason != 6) {
                return false;
            }
            return this.isAnrReportingEnabled;
        }
        return this.isNativeCrashReportingEnabled;
    }
}
