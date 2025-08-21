package b8;

import B2.InterfaceC2911h;
import F2.f;
import X7.AppVersion;
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
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lb8/f;", "", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "", "versionCode", "", "versionName", "LX7/a;", "c", "(Ljava/lang/Long;Ljava/lang/String;)LX7/a;", "T", "LF2/c;", "preferences", "LF2/f$a;", "key", "value", "", "f", "(LF2/c;LF2/f$a;Ljava/lang/Object;)V", "Lb8/d;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metrics", "e", "(Lb8/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<F2.f> dataStore;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u001c\u0010\tR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u001e\u0010\tR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b \u0010\tR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b'\u0010\tR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b\"\u0010\tR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b,\u0010\tR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0007\u001a\u0004\b.\u0010\tR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0007\u001a\u0004\b)\u0010\t¨\u00063"}, d2 = {"Lb8/f$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "k", "()LF2/f$a;", "DEVICE_SCREEN_WIDTH", "c", "j", "DEVICE_SCREEN_HEIGHT", "d", "i", "DEVICE_ORIENTATION", "e", "DEVICE_BATTERY_LEVEL", "", "f", "g", "DEVICE_MANUFACTURER", "h", "DEVICE_MODEL_IDENTIFIER", "", "DEVICE_IS_ROOTED", "", "m", "LOCATION_LATITUDE", "n", "LOCATION_LONGITUDE", "p", "OS_NAME", "l", "q", "OS_VERSION", "BUNDLE", "", "a", "APP_VERSION_CODE", "o", "APP_VERSION_NAME", "INSTANCE_ID", "s", "SESSION_ID", "r", "SESSION_ACTIVE", "CRASH_REPORTING", "t", "NETWORK_TYPE", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60155a = new a();

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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC16561f<MetricsDataModel> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f60175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f60176b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f60177a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f60178b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1$2", f = "MetricsDiskDataSource.kt", l = {50}, m = "emit")
            /* renamed from: b8.f$b$a$a, reason: collision with other inner class name */
            public static final class C1198a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f60179a;

                /* renamed from: b, reason: collision with root package name */
                int f60180b;

                public C1198a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f60179a = obj;
                    this.f60180b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, f fVar) {
                this.f60177a = interfaceC16562g;
                this.f60178b = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Type inference failed for: r9v0, types: [b8.d] */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
                /*
                    Method dump skipped, instructions count: 397
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: b8.f.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC16561f interfaceC16561f, f fVar) {
            this.f60175a = interfaceC16561f;
            this.f60176b = fVar;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super MetricsDataModel> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f60175a.collect(new a(interfaceC16562g, this.f60176b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {76}, m = "getMetrics")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f60182a;

        /* renamed from: c, reason: collision with root package name */
        int f60184c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60182a = obj;
            this.f60184c |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC16562g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60185a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60186b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super F2.f> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f60186b = th2;
            return dVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60185a == 0) {
                ResultKt.b(obj);
                z8.f.b("dtxStorage", "reading data: preferences could not be retrieved", (Throwable) this.f60186b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lb8/d;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC16562g<? super MetricsDataModel>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60187a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60188b;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super MetricsDataModel> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f60188b = th2;
            return eVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60187a == 0) {
                ResultKt.b(obj);
                z8.f.b("dtxStorage", "mapping data: Metrics could not be retrieved", (Throwable) this.f60188b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource", f = "MetricsDiskDataSource.kt", l = {101}, m = "setMetrics")
    /* renamed from: b8.f$f, reason: collision with other inner class name */
    static final class C1199f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f60189a;

        /* renamed from: c, reason: collision with root package name */
        int f60191c;

        C1199f(Continuation<? super C1199f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60189a = obj;
            this.f60191c |= Integer.MIN_VALUE;
            return f.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2", f = "MetricsDiskDataSource.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60192a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MetricsDataModel f60194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f60195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MetricsDataModel metricsDataModel, f fVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f60194c = metricsDataModel;
            this.f60195d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f60194c, this.f60195d, continuation);
            gVar.f60193b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((g) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60192a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f60193b;
                MetricsDataModel metricsDataModel = this.f60194c;
                f fVar = this.f60195d;
                a aVar = a.f60155a;
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
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(InterfaceC2911h<F2.f> dataStore) {
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
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super b8.MetricsDataModel> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b8.f.c
            if (r0 == 0) goto L13
            r0 = r6
            b8.f$c r0 = (b8.f.c) r0
            int r1 = r0.f60184c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60184c = r1
            goto L18
        L13:
            b8.f$c r0 = new b8.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60182a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f60184c
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
            pv.f r6 = r6.getData()     // Catch: java.lang.Exception -> L2a
            b8.f$d r2 = new b8.f$d     // Catch: java.lang.Exception -> L2a
            r2.<init>(r4)     // Catch: java.lang.Exception -> L2a
            pv.f r6 = pv.C16563h.g(r6, r2)     // Catch: java.lang.Exception -> L2a
            b8.f$b r2 = new b8.f$b     // Catch: java.lang.Exception -> L2a
            r2.<init>(r6, r5)     // Catch: java.lang.Exception -> L2a
            b8.f$e r6 = new b8.f$e     // Catch: java.lang.Exception -> L2a
            r6.<init>(r4)     // Catch: java.lang.Exception -> L2a
            pv.f r6 = pv.C16563h.g(r2, r6)     // Catch: java.lang.Exception -> L2a
            r0.f60184c = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = pv.C16563h.A(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L5d
            return r1
        L5d:
            b8.d r6 = (b8.MetricsDataModel) r6     // Catch: java.lang.Exception -> L2a
            return r6
        L60:
            java.lang.String r0 = "dtxStorage"
            java.lang.String r1 = "there is no metrics available"
            z8.f.b(r0, r1, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.f.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(b8.MetricsDataModel r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b8.f.C1199f
            if (r0 == 0) goto L13
            r0 = r8
            b8.f$f r0 = (b8.f.C1199f) r0
            int r1 = r0.f60191c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60191c = r1
            goto L18
        L13:
            b8.f$f r0 = new b8.f$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f60189a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f60191c
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
            z8.f.a(r3, r8)
            B2.h<F2.f> r8 = r6.dataStore     // Catch: java.lang.Exception -> L2b
            b8.f$g r2 = new b8.f$g     // Catch: java.lang.Exception -> L2b
            r5 = 0
            r2.<init>(r7, r6, r5)     // Catch: java.lang.Exception -> L2b
            r0.f60191c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = F2.j.a(r8, r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L62
            return r1
        L5d:
            java.lang.String r8 = "metrics preferences can't be stored"
            z8.f.b(r3, r8, r7)
        L62:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.f.e(b8.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
