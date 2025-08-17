package V7;

import android.location.Location;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b#\u0010 R(\u0010*\u001a\u0004\u0018\u00010%2\b\u0010\u0014\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010,\u001a\u0004\u0018\u00010%2\b\u0010\u0014\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b+\u0010)R$\u00102\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b\"\u0010/\"\u0004\b0\u00101R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010.\u001a\u0004\b&\u0010/\"\u0004\b3\u00101R\"\u0010:\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00106\u001a\u0004\b\u001d\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010.\u001a\u0004\b;\u0010/\"\u0004\b<\u00101R$\u0010A\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010.\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R$\u0010C\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b\u0015\u0010/\"\u0004\bB\u00101R$\u0010I\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010E\u001a\u0004\b\u0011\u0010F\"\u0004\bG\u0010HR\"\u0010K\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b>\u0010/\"\u0004\bJ\u00101¨\u0006L"}, d2 = {"LV7/b;", "", "LZ7/g;", "metricsRepository", "<init>", "(LZ7/g;)V", "", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LV7/e;", "screenMetrics", "A", "(LV7/e;)V", "Landroid/location/Location;", "location", "w", "(Landroid/location/Location;)V", "a", "LZ7/g;", "", "value", "b", "I", "i", "()I", "deviceScreenWidth", "c", "h", "deviceScreenHeight", "d", "g", "v", "(I)V", "deviceOrientation", "e", "r", "deviceBatteryLevel", "", "f", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "locationLatitude", "k", "locationLongitude", "", "Ljava/lang/String;", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "deviceManufacturer", "u", "deviceModelIdentifier", "", "Z", "()Z", "s", "(Z)V", "deviceIsRooted", "m", "y", "osName", "l", "n", "z", "osVersion", "q", "bundle", "LV7/a;", "LV7/a;", "()LV7/a;", "p", "(LV7/a;)V", "appVersion", "x", "networkType", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z7.g metricsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int deviceScreenWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int deviceScreenHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int deviceOrientation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int deviceBatteryLevel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Double locationLatitude;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Double locationLongitude;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String deviceManufacturer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String deviceModelIdentifier;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean deviceIsRooted;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String osName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String osVersion;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String bundle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private AppVersion appVersion;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String networkType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.metrics.MetricsCache", f = "MetricsCache.kt", l = {108}, m = "loadDataFromRepository")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f36961a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36962b;

        /* renamed from: d, reason: collision with root package name */
        int f36964d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f36962b = obj;
            this.f36964d |= Integer.MIN_VALUE;
            return b.this.o(this);
        }
    }

    public final void A(e screenMetrics) {
        this.deviceScreenWidth = screenMetrics != null ? screenMetrics.b() : -1;
        this.deviceScreenHeight = screenMetrics != null ? screenMetrics.a() : -1;
    }

    public final void w(Location location) {
        this.locationLatitude = location != null ? Double.valueOf(location.getLatitude()) : null;
        this.locationLongitude = location != null ? Double.valueOf(location.getLongitude()) : null;
    }

    public b(Z7.g metricsRepository) {
        Intrinsics.j(metricsRepository, "metricsRepository");
        this.metricsRepository = metricsRepository;
        this.deviceScreenWidth = -1;
        this.deviceScreenHeight = -1;
        this.deviceOrientation = -1;
        this.deviceBatteryLevel = -1;
        this.osName = "";
        this.networkType = "";
    }

    /* renamed from: a, reason: from getter */
    public final AppVersion getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    /* renamed from: c, reason: from getter */
    public final int getDeviceBatteryLevel() {
        return this.deviceBatteryLevel;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getDeviceIsRooted() {
        return this.deviceIsRooted;
    }

    /* renamed from: e, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: f, reason: from getter */
    public final String getDeviceModelIdentifier() {
        return this.deviceModelIdentifier;
    }

    /* renamed from: g, reason: from getter */
    public final int getDeviceOrientation() {
        return this.deviceOrientation;
    }

    /* renamed from: h, reason: from getter */
    public final int getDeviceScreenHeight() {
        return this.deviceScreenHeight;
    }

    /* renamed from: i, reason: from getter */
    public final int getDeviceScreenWidth() {
        return this.deviceScreenWidth;
    }

    /* renamed from: j, reason: from getter */
    public final Double getLocationLatitude() {
        return this.locationLatitude;
    }

    /* renamed from: k, reason: from getter */
    public final Double getLocationLongitude() {
        return this.locationLongitude;
    }

    /* renamed from: l, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    /* renamed from: m, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    /* renamed from: n, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V7.b.a
            if (r0 == 0) goto L13
            r0 = r5
            V7.b$a r0 = (V7.b.a) r0
            int r1 = r0.f36964d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36964d = r1
            goto L18
        L13:
            V7.b$a r0 = new V7.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36962b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f36964d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f36961a
            V7.b r0 = (V7.b) r0
            kotlin.ResultKt.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            Z7.g r5 = r4.metricsRepository
            r0.f36961a = r4
            r0.f36964d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            Z7.d r5 = (Z7.MetricsDataModel) r5
            if (r5 != 0) goto L4d
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        L4d:
            int r1 = r5.getDeviceScreenWidth()
            r0.deviceScreenWidth = r1
            int r1 = r5.getDeviceScreenHeight()
            r0.deviceScreenHeight = r1
            int r1 = r5.getDeviceOrientation()
            r0.deviceOrientation = r1
            int r1 = r5.getDeviceBatteryLevel()
            r0.deviceBatteryLevel = r1
            java.lang.Double r1 = r5.getLocationLatitude()
            r0.locationLatitude = r1
            java.lang.Double r1 = r5.getLocationLongitude()
            r0.locationLongitude = r1
            java.lang.String r1 = r5.getDeviceManufacturer()
            r0.deviceManufacturer = r1
            java.lang.String r1 = r5.getDeviceModelIdentifier()
            r0.deviceModelIdentifier = r1
            boolean r1 = r5.getDeviceIsRooted()
            r0.deviceIsRooted = r1
            java.lang.String r1 = r5.getOsName()
            r0.osName = r1
            java.lang.String r1 = r5.getOsVersion()
            r0.osVersion = r1
            java.lang.String r1 = r5.getBundle()
            r0.bundle = r1
            V7.a r1 = r5.getAppVersion()
            r0.appVersion = r1
            java.lang.String r5 = r5.getNetworkType()
            r0.networkType = r5
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V7.b.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public final void q(String str) {
        this.bundle = str;
    }

    public final void r(int i10) {
        this.deviceBatteryLevel = i10;
    }

    public final void s(boolean z10) {
        this.deviceIsRooted = z10;
    }

    public final void t(String str) {
        this.deviceManufacturer = str;
    }

    public final void u(String str) {
        this.deviceModelIdentifier = str;
    }

    public final void v(int i10) {
        this.deviceOrientation = i10;
    }

    public final void x(String str) {
        Intrinsics.j(str, "<set-?>");
        this.networkType = str;
    }

    public final void y(String str) {
        Intrinsics.j(str, "<set-?>");
        this.osName = str;
    }

    public final void z(String str) {
        this.osVersion = str;
    }
}
