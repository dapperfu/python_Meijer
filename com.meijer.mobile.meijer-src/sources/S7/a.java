package S7;

import K7.j;
import R7.e;
import android.content.Context;
import b8.C6337a;
import b8.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u7.h;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"LS7/a;", "", "Landroid/content/Context;", "context", "Ly7/a;", "timeProvider", "", "retentionTime", "Lu7/h;", "rumEventDispatcher", "LK7/j;", "sessionInformationProvider", "Lb8/g;", "metricsRepository", "Lb8/a;", "exitReasonTimestampDataSource", "", "isNativeCrashReportingEnabled", "isAnrReportingEnabled", "<init>", "(Landroid/content/Context;Ly7/a;JLu7/h;LK7/j;Lb8/g;Lb8/a;ZZ)V", "LQ7/a;", "a", "()LQ7/a;", "Landroid/content/Context;", "b", "Ly7/a;", "c", "J", "d", "Lu7/h;", "e", "LK7/j;", "f", "Lb8/g;", "g", "Lb8/a;", "h", "Z", "i", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long retentionTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g metricsRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C6337a exitReasonTimestampDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isNativeCrashReportingEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnrReportingEnabled;

    public a(Context context, InterfaceC18294a timeProvider, long j10, h rumEventDispatcher, j sessionInformationProvider, g metricsRepository, C6337a exitReasonTimestampDataSource, boolean z10, boolean z11) {
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

    public final Q7.a a() {
        return new Q7.a(new e(), this.exitReasonTimestampDataSource, this.timeProvider, this.retentionTime, this.context, this.rumEventDispatcher, this.sessionInformationProvider, this.metricsRepository, this.isNativeCrashReportingEnabled, this.isAnrReportingEnabled);
    }

    public /* synthetic */ a(Context context, InterfaceC18294a interfaceC18294a, long j10, h hVar, j jVar, g gVar, C6337a c6337a, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC18294a, (i10 & 4) != 0 ? 540000L : j10, hVar, jVar, gVar, c6337a, z10, z11);
    }
}
