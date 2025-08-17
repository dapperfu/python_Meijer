package vq;

import Jd.C3778l;
import Jd.C3779m;
import Jd.C3780n;
import Jd.InterfaceC3769c;
import Jd.p;
import Jd.r;
import Td.AbstractC5232j;
import Td.C5224b;
import Td.InterfaceC5227e;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0083@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0083@¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\b*\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\nJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0087@¢\u0006\u0004\b\u0018\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lvq/e;", "", "Landroid/content/Context;", "context", "LJd/r;", "settingsClient", "<init>", "(Landroid/content/Context;LJd/r;)V", "Lvq/a;", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "LTd/b;", "cancellationToken", "Lkotlin/Function0;", "LTd/j;", "Landroid/location/Location;", "action", "p", "(LTd/b;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Landroid/location/Location;)Lvq/a;", "Lvq/e$a;", "o", "n", "a", "Landroid/content/Context;", "b", "LJd/r;", "LJd/c;", "c", "LJd/c;", "fusedLocationProvider", "", "", "d", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "permissions", "e", "Ljava/lang/String;", "locationProvider", "Lcom/google/android/gms/location/LocationRequest;", "f", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "LJd/m;", "g", "LJd/m;", "locationSettingsRequest", "", "k", "()Z", "hasLocationPermission", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r settingsClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3769c fusedLocationProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> permissions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String locationProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final LocationRequest locationRequest;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C3779m locationSettingsRequest;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvq/e$a;", "", "", "hasLocationSettingEnabled", "Landroid/content/IntentSender;", "intentSender", "<init>", "(ZLandroid/content/IntentSender;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Landroid/content/IntentSender;", "getIntentSender", "()Landroid/content/IntentSender;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vq.e$a, reason: from toString */
    public static final /* data */ class LocationProviderStatus {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasLocationSettingEnabled;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IntentSender intentSender;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationProviderStatus)) {
                return false;
            }
            LocationProviderStatus locationProviderStatus = (LocationProviderStatus) other;
            return this.hasLocationSettingEnabled == locationProviderStatus.hasLocationSettingEnabled && Intrinsics.e(this.intentSender, locationProviderStatus.intentSender);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getHasLocationSettingEnabled() {
            return this.hasLocationSettingEnabled;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.hasLocationSettingEnabled) * 31;
            IntentSender intentSender = this.intentSender;
            return iHashCode + (intentSender == null ? 0 : intentSender.hashCode());
        }

        public String toString() {
            return "LocationProviderStatus(hasLocationSettingEnabled=" + this.hasLocationSettingEnabled + ", intentSender=" + this.intentSender + ')';
        }

        public LocationProviderStatus(boolean z10, IntentSender intentSender) {
            this.hasLocationSettingEnabled = z10;
            this.intentSender = intentSender;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.location.LocationHelper", f = "LocationHelper.kt", l = {126}, m = "getCurrentLocation")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f164926a;

        /* renamed from: c, reason: collision with root package name */
        int f164928c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164926a = obj;
            this.f164928c |= Integer.MIN_VALUE;
            return e.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.location.LocationHelper", f = "LocationHelper.kt", l = {153}, m = "getLastLocation")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f164929a;

        /* renamed from: c, reason: collision with root package name */
        int f164931c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164929a = obj;
            this.f164931c |= Integer.MIN_VALUE;
            return e.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.location.LocationHelper", f = "LocationHelper.kt", l = {111, 111}, m = "getLocation")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f164932a;

        /* renamed from: b, reason: collision with root package name */
        int f164933b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f164934c;

        /* renamed from: e, reason: collision with root package name */
        int f164936e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164934c = obj;
            this.f164936e |= Integer.MIN_VALUE;
            return e.this.n(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vq.e$e, reason: collision with other inner class name */
    static final class C2604e implements Function1<C3780n, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<LocationProviderStatus> f164938b;

        /* JADX WARN: Multi-variable type inference failed */
        C2604e(InterfaceC16654n<? super LocationProviderStatus> interfaceC16654n) {
            this.f164938b = interfaceC16654n;
        }

        public final void a(C3780n c3780n) {
            p pVarB;
            p pVarB2;
            p pVarB3;
            String str = e.this.locationProvider;
            boolean z10 = false;
            if (!Intrinsics.e(str, "gps") ? !(!Intrinsics.e(str, "network") ? (pVarB = c3780n.b()) == null || !pVarB.K0() : (pVarB2 = c3780n.b()) == null || !pVarB2.d1()) : !((pVarB3 = c3780n.b()) == null || !pVarB3.q0())) {
                z10 = true;
            }
            InterfaceC16654n<LocationProviderStatus> interfaceC16654n = this.f164938b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(new LocationProviderStatus(z10, null)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C3780n c3780n) {
            a(c3780n);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements InterfaceC5228f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<LocationProviderStatus> f164939a;

        /* JADX WARN: Multi-variable type inference failed */
        f(InterfaceC16654n<? super LocationProviderStatus> interfaceC16654n) {
            this.f164939a = interfaceC16654n;
        }

        @Override // Td.InterfaceC5228f
        public final void onFailure(Exception exception) {
            PendingIntent pendingIntentC;
            Intrinsics.j(exception, "exception");
            InterfaceC16654n<LocationProviderStatus> interfaceC16654n = this.f164939a;
            IntentSender intentSender = null;
            ResolvableApiException resolvableApiException = exception instanceof ResolvableApiException ? (ResolvableApiException) exception : null;
            if (resolvableApiException != null && (pendingIntentC = resolvableApiException.c()) != null) {
                intentSender = pendingIntentC.getIntentSender();
            }
            interfaceC16654n.resumeWith(Result.b(new LocationProviderStatus(false, intentSender)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements InterfaceC5229g {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f164940a;

        g(Function1 function) {
            Intrinsics.j(function, "function");
            this.f164940a = function;
        }

        @Override // Td.InterfaceC5229g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f164940a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5224b f164941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5232j<Location> f164942b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<TResult> implements InterfaceC5227e {

            /* renamed from: a, reason: collision with root package name */
            public static final a<TResult> f164943a = new a<>();

            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j<Location> task) {
                Intrinsics.j(task, "task");
                if (task.p()) {
                    uw.a.INSTANCE.a("Location request canceled.", new Object[0]);
                }
            }

            a() {
            }
        }

        h(C5224b c5224b, AbstractC5232j<Location> abstractC5232j) {
            this.f164941a = c5224b;
            this.f164942b = abstractC5232j;
        }

        public final void a(Throwable th2) {
            C5224b c5224b = this.f164941a;
            if (c5224b != null) {
                c5224b.a();
            }
            this.f164942b.c(a.f164943a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function1<Location, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<LocationData> f164944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f164945b;

        /* JADX WARN: Multi-variable type inference failed */
        i(InterfaceC16654n<? super LocationData> interfaceC16654n, e eVar) {
            this.f164944a = interfaceC16654n;
            this.f164945b = eVar;
        }

        public final void a(Location location) {
            InterfaceC16654n<LocationData> interfaceC16654n = this.f164944a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(location != null ? this.f164945b.r(location) : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            a(location);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements InterfaceC5228f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<LocationData> f164946a;

        /* JADX WARN: Multi-variable type inference failed */
        j(InterfaceC16654n<? super LocationData> interfaceC16654n) {
            this.f164946a = interfaceC16654n;
        }

        @Override // Td.InterfaceC5228f
        public final void onFailure(Exception exception) {
            Intrinsics.j(exception, "exception");
            uw.a.INSTANCE.f(exception, "Unable to retrieve location.", new Object[0]);
            InterfaceC16654n<LocationData> interfaceC16654n = this.f164946a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(ResultKt.a(exception)));
        }
    }

    public e(Context context, r settingsClient) {
        Intrinsics.j(context, "context");
        Intrinsics.j(settingsClient, "settingsClient");
        this.context = context;
        this.settingsClient = settingsClient;
        InterfaceC3769c interfaceC3769cB = C3778l.b(context);
        Intrinsics.i(interfaceC3769cB, "getFusedLocationProviderClient(...)");
        this.fusedLocationProvider = interfaceC3769cB;
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        this.permissions = CollectionsKt.j1(arrayList);
        this.locationProvider = "network";
        LocationRequest locationRequestA = new LocationRequest.a(3000L).i(1500L).j(100).a();
        Intrinsics.i(locationRequestA, "build(...)");
        this.locationRequest = locationRequestA;
        C3779m c3779mB = new C3779m.a().a(locationRequestA).c(true).b();
        Intrinsics.i(c3779mB, "build(...)");
        this.locationSettingsRequest = c3779mB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super vq.LocationData> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vq.e.b
            if (r0 == 0) goto L14
            r0 = r8
            vq.e$b r0 = (vq.e.b) r0
            int r1 = r0.f164928c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f164928c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            vq.e$b r0 = new vq.e$b
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f164926a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f164928c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.b(r8)
            goto L48
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.ResultKt.b(r8)
            vq.d r3 = new vq.d
            r3.<init>()
            r4.f164928c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r8 = q(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L48
            return r0
        L48:
            vq.a r8 = (vq.LocationData) r8
            if (r8 == 0) goto L82
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Using current location.\nLatitude: "
            r1.append(r2)
            double r2 = r8.getLatitude()
            r1.append(r2)
            java.lang.String r2 = "\nLongitude: "
            r1.append(r2)
            double r2 = r8.getLongitude()
            r1.append(r2)
            java.lang.String r2 = "\nisMock: "
            r1.append(r2)
            boolean r2 = r8.getIsMockedLocation()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.a(r1, r2)
            return r8
        L82:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.e.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5232j j(e eVar) {
        AbstractC5232j<Location> abstractC5232jE = eVar.fusedLocationProvider.e(100, new C5224b().b());
        Intrinsics.i(abstractC5232jE, "getCurrentLocation(...)");
        return abstractC5232jE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super vq.LocationData> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vq.e.c
            if (r0 == 0) goto L14
            r0 = r8
            vq.e$c r0 = (vq.e.c) r0
            int r1 = r0.f164931c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f164931c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            vq.e$c r0 = new vq.e$c
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f164929a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f164931c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.b(r8)
            goto L48
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.ResultKt.b(r8)
            vq.c r3 = new vq.c
            r3.<init>()
            r4.f164931c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r8 = q(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L48
            return r0
        L48:
            vq.a r8 = (vq.LocationData) r8
            if (r8 == 0) goto L82
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Using last location.\nLatitude: "
            r1.append(r2)
            double r2 = r8.getLatitude()
            r1.append(r2)
            java.lang.String r2 = "\nLongitude: "
            r1.append(r2)
            double r2 = r8.getLongitude()
            r1.append(r2)
            java.lang.String r2 = "\nisMock: "
            r1.append(r2)
            boolean r2 = r8.getIsMockedLocation()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.a(r1, r2)
            return r8
        L82:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.e.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5232j m(e eVar) {
        AbstractC5232j<Location> abstractC5232jL = eVar.fusedLocationProvider.l();
        Intrinsics.i(abstractC5232jL, "getLastLocation(...)");
        return abstractC5232jL;
    }

    private final Object p(C5224b c5224b, Function0<? extends AbstractC5232j<Location>> function0, Continuation<? super LocationData> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        AbstractC5232j<Location> abstractC5232jInvoke = function0.invoke();
        c16658p.F(new h(c5224b, abstractC5232jInvoke));
        abstractC5232jInvoke.g(new g(new i(c16658p, this)));
        abstractC5232jInvoke.e(new j(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    static /* synthetic */ Object q(e eVar, C5224b c5224b, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5224b = null;
        }
        return eVar.p(c5224b, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DeprecatedCall"})
    public final LocationData r(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? new LocationData(location.getLatitude(), location.getLongitude(), location.isMock()) : new LocationData(location.getLatitude(), location.getLongitude(), location.isFromMockProvider());
    }

    public final boolean k() {
        return Z1.b.a(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation<? super vq.LocationData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof vq.e.d
            if (r0 == 0) goto L13
            r0 = r6
            vq.e$d r0 = (vq.e.d) r0
            int r1 = r0.f164936e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164936e = r1
            goto L18
        L13:
            vq.e$d r0 = new vq.e$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f164934c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f164936e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f164932a
            vq.e r0 = (vq.e) r0
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L69
        L30:
            r6 = move-exception
            goto L70
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            int r2 = r0.f164933b
            java.lang.Object r4 = r0.f164932a
            vq.e r4 = (vq.e) r4
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L58
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L30
            r0.f164932a = r5     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f164933b = r2     // Catch: java.lang.Throwable -> L30
            r0.f164936e = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r6 = r5.i(r0)     // Catch: java.lang.Throwable -> L30
            if (r6 != r1) goto L57
            goto L68
        L57:
            r4 = r5
        L58:
            vq.a r6 = (vq.LocationData) r6     // Catch: java.lang.Throwable -> L30
            if (r6 != 0) goto L6b
            r0.f164932a = r4     // Catch: java.lang.Throwable -> L30
            r0.f164933b = r2     // Catch: java.lang.Throwable -> L30
            r0.f164936e = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r6 = r4.l(r0)     // Catch: java.lang.Throwable -> L30
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            vq.a r6 = (vq.LocationData) r6     // Catch: java.lang.Throwable -> L30
        L6b:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L7a
        L70:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L7a:
            boolean r0 = kotlin.Result.g(r6)
            if (r0 == 0) goto L81
            r6 = 0
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vq.e.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object o(Continuation<? super LocationProviderStatus> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        AbstractC5232j<C3780n> abstractC5232jI = this.settingsClient.i(this.locationSettingsRequest);
        abstractC5232jI.g(new g(new C2604e(c16658p)));
        abstractC5232jI.e(new f(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }
}
