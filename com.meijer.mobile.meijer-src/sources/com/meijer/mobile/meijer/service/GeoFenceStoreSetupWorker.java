package com.meijer.mobile.meijer.service;

import O4.EnumC4361i;
import O4.O;
import O4.y;
import Tq.j;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.meijer.mobile.storeinfo.api.model.Store;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import java.util.ArrayList;
import jk.AddStoreGeoFencesEvent;
import jk.C15047c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.E0;
import mv.InterfaceC15783O;
import pk.StoreDetails;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 32\u00020\u0001:\u00014BI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00102\u001a\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/meijer/mobile/meijer/service/GeoFenceStoreSetupWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "LZq/b;", "storeInfoRepository", "LTq/j;", "storeProvider", "LDk/b;", "bus", "Landroid/location/LocationManager;", "locationManager", "Lmv/K;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LZq/b;LTq/j;LDk/b;Landroid/location/LocationManager;Lmv/K;)V", "", "i", "()V", "Landroidx/work/c$a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "LZq/b;", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "j", "LDk/b;", "getBus", "()LDk/b;", "setBus", "(LDk/b;)V", "k", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "l", "Lmv/K;", "Ljava/util/ArrayList;", "Ljk/c;", "Lkotlin/collections/ArrayList;", "m", "Ljava/util/ArrayList;", "stores", "n", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GeoFenceStoreSetupWorker extends CoroutineWorker {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f114323o = 8;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Zq.b storeInfoRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private j storeProvider;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Dk.b bus;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private LocationManager locationManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ArrayList<C15047c> stores;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/service/GeoFenceStoreSetupWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "", "STORE_SEARCH_RADIUS_MILES", "I", "", "GEO_FENCE_STORE_WORKER", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void a(Context context) {
            Intrinsics.j(context, "context");
            O.INSTANCE.a(context).f("store worker", EnumC4361i.REPLACE, new y.a(GeoFenceStoreSetupWorker.class).b());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker", f = "GeoFenceStoreSetupWorker.kt", l = {61, 92}, m = "doWork")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f114330a;

        /* renamed from: b, reason: collision with root package name */
        Object f114331b;

        /* renamed from: c, reason: collision with root package name */
        Object f114332c;

        /* renamed from: d, reason: collision with root package name */
        int f114333d;

        /* renamed from: e, reason: collision with root package name */
        int f114334e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f114335f;

        /* renamed from: h, reason: collision with root package name */
        int f114337h;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114335f = obj;
            this.f114337h |= Integer.MIN_VALUE;
            return GeoFenceStoreSetupWorker.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker$doWork$3$1", f = "GeoFenceStoreSetupWorker.kt", l = {63}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114338a;

        /* renamed from: b, reason: collision with root package name */
        int f114339b;

        /* renamed from: c, reason: collision with root package name */
        int f114340c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114341d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f114343f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f114343f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = GeoFenceStoreSetupWorker.this.new c(this.f114343f, continuation);
            cVar.f114341d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            double dDoubleValue;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114340c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f114341d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f114341d;
                    GeoFenceStoreSetupWorker geoFenceStoreSetupWorker = GeoFenceStoreSetupWorker.this;
                    int i11 = this.f114343f;
                    Result.Companion companion = Result.INSTANCE;
                    Zq.b bVar = geoFenceStoreSetupWorker.storeInfoRepository;
                    this.f114341d = r14;
                    this.f114338a = r14;
                    this.f114339b = 0;
                    this.f114340c = 1;
                    obj = bVar.e(i11, this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((StoreInfo) obj);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            GeoFenceStoreSetupWorker geoFenceStoreSetupWorker2 = GeoFenceStoreSetupWorker.this;
            if (Result.h(objB)) {
                StoreDetails storeDetailsA = Store.INSTANCE.a((Store) CollectionsKt.s0(((StoreInfo) objB).a()));
                ArrayList arrayList = geoFenceStoreSetupWorker2.stores;
                Double latitude = storeDetailsA.getLatitude();
                double dDoubleValue2 = 0.0d;
                if (latitude != null) {
                    dDoubleValue = latitude.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                Double longitude = storeDetailsA.getLongitude();
                if (longitude != null) {
                    dDoubleValue2 = longitude.doubleValue();
                }
                arrayList.add(new C15047c(dDoubleValue, dDoubleValue2, storeDetailsA.getStoreId()));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.f(thE, "Failed to load home store!", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker$doWork$5$1", f = "GeoFenceStoreSetupWorker.kt", l = {94}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114344a;

        /* renamed from: b, reason: collision with root package name */
        int f114345b;

        /* renamed from: c, reason: collision with root package name */
        int f114346c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114347d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Location f114349f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Location location, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f114349f = location;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = GeoFenceStoreSetupWorker.this.new d(this.f114349f, continuation);
            dVar.f114347d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoFenceStoreSetupWorker(Context context, WorkerParameters workerParams, Zq.b storeInfoRepository, j storeProvider, Dk.b bus, LocationManager locationManager, AbstractC15779K ioDispatcher) {
        super(context, workerParams);
        Intrinsics.j(context, "context");
        Intrinsics.j(workerParams, "workerParams");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(bus, "bus");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.storeInfoRepository = storeInfoRepository;
        this.storeProvider = storeProvider;
        this.bus = bus;
        this.locationManager = locationManager;
        this.ioDispatcher = ioDispatcher;
        this.stores = new ArrayList<>();
    }

    private final void i() {
        if (this.stores.isEmpty()) {
            qw.a.INSTANCE.s("No stores to add fences for!", new Object[0]);
        } else {
            this.bus.a(new AddStoreGeoFencesEvent(this.stores));
            qw.a.INSTANCE.a("adding %s stores to the geofence list", Integer.valueOf(this.stores.size()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (mv.C15805i.g(r2, r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation<? super androidx.work.c.a> r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
