package Z7;

import B2.InterfaceC2943h;
import F2.f;
import V7.AppVersion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LZ7/f;", "", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "", "versionCode", "", "versionName", "LV7/a;", "c", "(Ljava/lang/Long;Ljava/lang/String;)LV7/a;", "T", "LF2/c;", "preferences", "LF2/f$a;", "key", "value", "", "f", "(LF2/c;LF2/f$a;Ljava/lang/Object;)V", "LZ7/d;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metrics", "e", "(LZ7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<F2.f> dataStore;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u001c\u0010\tR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b \u0010\tR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b'\u0010\tR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b\"\u0010\tR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b,\u0010\tR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b.\u0010\tR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0007\u001a\u0004\b)\u0010\t¨\u00063"}, d2 = {"LZ7/f$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "k", "()LF2/f$a;", "DEVICE_SCREEN_WIDTH", "c", "j", "DEVICE_SCREEN_HEIGHT", "d", "i", "DEVICE_ORIENTATION", "e", "DEVICE_BATTERY_LEVEL", "", "f", "g", "DEVICE_MANUFACTURER", "h", "DEVICE_MODEL_IDENTIFIER", "", "DEVICE_IS_ROOTED", "", "m", "LOCATION_LATITUDE", "n", "LOCATION_LONGITUDE", "p", "OS_NAME", "l", "q", "OS_VERSION", "BUNDLE", "", "a", "APP_VERSION_CODE", "o", "APP_VERSION_NAME", "INSTANCE_ID", "s", "SESSION_ID", "r", "SESSION_ACTIVE", "CRASH_REPORTING", "t", "NETWORK_TYPE", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42488a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> DEVICE_SCREEN_WIDTH = F2.i.e("mt_deviceScreenWidth");

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> DEVICE_SCREEN_HEIGHT = F2.i.e("mt_deviceScreenHeight");

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> DEVICE_ORIENTATION = F2.i.e("mt_deviceOrientation");

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> DEVICE_BATTERY_LEVEL = F2.i.e("mt_deviceBatteryLevel");

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> DEVICE_MANUFACTURER = F2.i.g("mt_deviceManufacturer");

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> DEVICE_MODEL_IDENTIFIER = F2.i.g("mt_deviceModelIdentifier");

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Boolean> DEVICE_IS_ROOTED = F2.i.a("mt_deviceIsRooted");

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Double> LOCATION_LATITUDE = F2.i.c("mt_locationLatitude");

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Double> LOCATION_LONGITUDE = F2.i.c("mt_locationLongitude");

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> OS_NAME = F2.i.g("mt_osName");

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> OS_VERSION = F2.i.g("mt_osVersion");

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> BUNDLE = F2.i.g("mt_bundle");

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Long> APP_VERSION_CODE = F2.i.f("mt_versionCode");

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> APP_VERSION_NAME = F2.i.g("mt_versionName");

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> INSTANCE_ID = F2.i.g("mt_instanceId");

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> SESSION_ID = F2.i.g("mt_sessionId");

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Boolean> SESSION_ACTIVE = F2.i.a("mt_sessionActive");

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Boolean> CRASH_REPORTING = F2.i.a("mt_crashReporting");

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> NETWORK_TYPE = F2.i.g("mt_networkType");

        public final f.a<Long> a() {
            return APP_VERSION_CODE;
        }

        public final f.a<String> b() {
            return APP_VERSION_NAME;
        }

        public final f.a<String> c() {
            return BUNDLE;
        }

        public final f.a<Boolean> d() {
            return CRASH_REPORTING;
        }

        public final f.a<Integer> e() {
            return DEVICE_BATTERY_LEVEL;
        }

        public final f.a<Boolean> f() {
            return DEVICE_IS_ROOTED;
        }

        public final f.a<String> g() {
            return DEVICE_MANUFACTURER;
        }

        public final f.a<String> h() {
            return DEVICE_MODEL_IDENTIFIER;
        }

        public final f.a<Integer> i() {
            return DEVICE_ORIENTATION;
        }

        public final f.a<Integer> j() {
            return DEVICE_SCREEN_HEIGHT;
        }

        public final f.a<Integer> k() {
            return DEVICE_SCREEN_WIDTH;
        }

        public final f.a<String> l() {
            return INSTANCE_ID;
        }

        public final f.a<Double> m() {
            return LOCATION_LATITUDE;
        }

        public final f.a<Double> n() {
            return LOCATION_LONGITUDE;
        }

        public final f.a<String> o() {
            return NETWORK_TYPE;
        }

        public final f.a<String> p() {
            return OS_NAME;
        }

        public final f.a<String> q() {
            return OS_VERSION;
        }

        public final f.a<Boolean> r() {
            return SESSION_ACTIVE;
        }

        public final f.a<String> s() {
            return SESSION_ID;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC17152f<MetricsDataModel> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f42508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f42509b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f42510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f42511b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1$2", f = "MetricsDiskDataSource.kt", l = {50}, m = "emit")
            /* renamed from: Z7.f$b$a$a, reason: collision with other inner class name */
            public static final class C0909a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42512a;

                /* renamed from: b, reason: collision with root package name */
                int f42513b;

                public C0909a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f42512a = obj;
                    this.f42513b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, f fVar) {
                this.f42510a = interfaceC17153g;
                this.f42511b = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Type inference failed for: r9v0, types: [Z7.d] */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
                /*
                    Method dump skipped, instructions count: 397
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Z7.f.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC17152f interfaceC17152f, f fVar) {
            this.f42508a = interfaceC17152f;
            this.f42509b = fVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super MetricsDataModel> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f42508a.collect(new a(interfaceC17153g, this.f42509b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {76}, m = "getMetrics")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f42515a;

        /* renamed from: c, reason: collision with root package name */
        int f42517c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42515a = obj;
            this.f42517c |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42518a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42519b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super F2.f> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f42519b = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42518a == 0) {
                ResultKt.b(obj);
                x8.f.b("dtxStorage", "reading data: preferences could not be retrieved", (Throwable) this.f42519b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LZ7/d;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC17153g<? super MetricsDataModel>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42520a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42521b;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super MetricsDataModel> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f42521b = th2;
            return eVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42520a == 0) {
                ResultKt.b(obj);
                x8.f.b("dtxStorage", "mapping data: Metrics could not be retrieved", (Throwable) this.f42521b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {101}, m = "setMetrics")
    /* renamed from: Z7.f$f, reason: collision with other inner class name */
    static final class C0910f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f42522a;

        /* renamed from: c, reason: collision with root package name */
        int f42524c;

        C0910f(Continuation<? super C0910f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42522a = obj;
            this.f42524c |= Integer.MIN_VALUE;
            return f.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42525a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MetricsDataModel f42527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f42528d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MetricsDataModel metricsDataModel, f fVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f42527c = metricsDataModel;
            this.f42528d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f42527c, this.f42528d, continuation);
            gVar.f42526b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((g) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42525a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f42526b;
                MetricsDataModel metricsDataModel = this.f42527c;
                f fVar = this.f42528d;
                a aVar = a.f42488a;
                cVar.i(aVar.k(), Boxing.d(metricsDataModel.getDeviceScreenWidth()));
                cVar.i(aVar.j(), Boxing.d(metricsDataModel.getDeviceScreenHeight()));
                cVar.i(aVar.i(), Boxing.d(metricsDataModel.getDeviceOrientation()));
                cVar.i(aVar.e(), Boxing.d(metricsDataModel.getDeviceBatteryLevel()));
                cVar.i(aVar.f(), Boxing.a(metricsDataModel.getDeviceIsRooted()));
                cVar.i(aVar.p(), metricsDataModel.getOsName());
                cVar.i(aVar.l(), metricsDataModel.getInstanceId());
                cVar.i(aVar.s(), metricsDataModel.getSessionId());
                cVar.i(aVar.r(), Boxing.a(metricsDataModel.getSessionActive()));
                cVar.i(aVar.d(), Boxing.a(metricsDataModel.getCrashReportingOptIn()));
                cVar.i(aVar.o(), metricsDataModel.getNetworkType());
                fVar.f(cVar, aVar.g(), metricsDataModel.getDeviceManufacturer());
                fVar.f(cVar, aVar.h(), metricsDataModel.getDeviceModelIdentifier());
                fVar.f(cVar, aVar.m(), metricsDataModel.getLocationLatitude());
                fVar.f(cVar, aVar.n(), metricsDataModel.getLocationLongitude());
                fVar.f(cVar, aVar.q(), metricsDataModel.getOsVersion());
                fVar.f(cVar, aVar.c(), metricsDataModel.getBundle());
                AppVersion appVersion = metricsDataModel.getAppVersion();
                if (appVersion != null) {
                    cVar.i(aVar.a(), Boxing.e(appVersion.getVersionCode()));
                    fVar.f(cVar, aVar.b(), appVersion.getVersionName());
                } else {
                    cVar.h(aVar.a());
                    cVar.h(aVar.b());
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(InterfaceC2943h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppVersion c(Long versionCode, String versionName) {
        if (versionCode == null || versionCode.longValue() < 1) {
            return null;
        }
        return new AppVersion(versionCode.longValue(), versionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void f(F2.c preferences, f.a<T> key, T value) {
        if (value != null) {
            preferences.i(key, value);
        } else {
            preferences.h(key);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super Z7.MetricsDataModel> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Z7.f.c
            if (r0 == 0) goto L13
            r0 = r6
            Z7.f$c r0 = (Z7.f.c) r0
            int r1 = r0.f42517c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42517c = r1
            goto L18
        L13:
            Z7.f$c r0 = new Z7.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f42515a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42517c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L5d
        L2a:
            r6 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            B2.h<F2.f> r6 = r5.dataStore     // Catch: java.lang.Exception -> L2a
            tv.f r6 = r6.getData()     // Catch: java.lang.Exception -> L2a
            Z7.f$d r2 = new Z7.f$d     // Catch: java.lang.Exception -> L2a
            r2.<init>(r4)     // Catch: java.lang.Exception -> L2a
            tv.f r6 = tv.C17154h.g(r6, r2)     // Catch: java.lang.Exception -> L2a
            Z7.f$b r2 = new Z7.f$b     // Catch: java.lang.Exception -> L2a
            r2.<init>(r6, r5)     // Catch: java.lang.Exception -> L2a
            Z7.f$e r6 = new Z7.f$e     // Catch: java.lang.Exception -> L2a
            r6.<init>(r4)     // Catch: java.lang.Exception -> L2a
            tv.f r6 = tv.C17154h.g(r2, r6)     // Catch: java.lang.Exception -> L2a
            r0.f42517c = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = tv.C17154h.A(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L5d
            return r1
        L5d:
            Z7.d r6 = (Z7.MetricsDataModel) r6     // Catch: java.lang.Exception -> L2a
            return r6
        L60:
            java.lang.String r0 = "dtxStorage"
            java.lang.String r1 = "there is no metrics available"
            x8.f.b(r0, r1, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z7.f.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(Z7.MetricsDataModel r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Z7.f.C0910f
            if (r0 == 0) goto L13
            r0 = r8
            Z7.f$f r0 = (Z7.f.C0910f) r0
            int r1 = r0.f42524c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42524c = r1
            goto L18
        L13:
            Z7.f$f r0 = new Z7.f$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f42522a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f42524c
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2b
            goto L62
        L2b:
            r7 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "metrics are updated: "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            x8.f.a(r3, r8)
            B2.h<F2.f> r8 = r6.dataStore     // Catch: java.lang.Exception -> L2b
            Z7.f$g r2 = new Z7.f$g     // Catch: java.lang.Exception -> L2b
            r5 = 0
            r2.<init>(r7, r6, r5)     // Catch: java.lang.Exception -> L2b
            r0.f42524c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = F2.j.a(r8, r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L62
            return r1
        L5d:
            java.lang.String r8 = "metrics preferences can't be stored"
            x8.f.b(r3, r8, r7)
        L62:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z7.f.e(Z7.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
