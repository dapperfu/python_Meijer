package Q7;

import I7.j;
import P7.e;
import Z7.g;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import s7.h;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"LQ7/a;", "", "Landroid/content/Context;", "context", "Lw7/a;", "timeProvider", "", "retentionTime", "Ls7/h;", "rumEventDispatcher", "LI7/j;", "sessionInformationProvider", "LZ7/g;", "metricsRepository", "LZ7/a;", "exitReasonTimestampDataSource", "", "isNativeCrashReportingEnabled", "isAnrReportingEnabled", "<init>", "(Landroid/content/Context;Lw7/a;JLs7/h;LI7/j;LZ7/g;LZ7/a;ZZ)V", "LO7/a;", "a", "()LO7/a;", "Landroid/content/Context;", "b", "Lw7/a;", "c", "J", "d", "Ls7/h;", "e", "LI7/j;", "f", "LZ7/g;", "g", "LZ7/a;", "h", "Z", "i", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long retentionTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g metricsRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z7.a exitReasonTimestampDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isNativeCrashReportingEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnrReportingEnabled;

    public a(Context context, InterfaceC17801a timeProvider, long j10, h rumEventDispatcher, j sessionInformationProvider, g metricsRepository, Z7.a exitReasonTimestampDataSource, boolean z10, boolean z11) {
        Intrinsics.j(context, "context");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.j(metricsRepository, "metricsRepository");
        Intrinsics.j(exitReasonTimestampDataSource, "exitReasonTimestampDataSource");
        this.context = context;
        this.timeProvider = timeProvider;
        this.retentionTime = j10;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.metricsRepository = metricsRepository;
        this.exitReasonTimestampDataSource = exitReasonTimestampDataSource;
        this.isNativeCrashReportingEnabled = z10;
        this.isAnrReportingEnabled = z11;
    }

    public final O7.a a() {
        return new O7.a(new e(), this.exitReasonTimestampDataSource, this.timeProvider, this.retentionTime, this.context, this.rumEventDispatcher, this.sessionInformationProvider, this.metricsRepository, this.isNativeCrashReportingEnabled, this.isAnrReportingEnabled);
    }

    public /* synthetic */ a(Context context, InterfaceC17801a interfaceC17801a, long j10, h hVar, j jVar, g gVar, Z7.a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC17801a, (i10 & 4) != 0 ? 540000L : j10, hVar, jVar, gVar, aVar, z10, z11);
    }
}
