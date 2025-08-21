package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import androidx.view.c0;
import androidx.view.d0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.activity.enrollment.C12188a;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.a;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.m;
import com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall;
import com.meijer.mobile.storeinfo.api.model.Store;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0001\u0018\u0000 X2\u00020\u0001:\u0001.B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010 \u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u0002050=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010ER\u0018\u0010N\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010HR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006Y"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/o;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "searchStoresCall", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "createAccountRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;Lcom/meijer/mobile/meijer/activity/enrollment/a;Lhi/a;)V", "", "r", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isLocationUsed", "A", "(Z)V", "", "latitude", "longitude", "t", "(DD)V", "", "searchTerm", "y", "(Ljava/lang/String;)V", "", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "storesList", "", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "list", "w", "(Ljava/util/List;Ljava/util/List;)V", "s", "(Ljava/util/List;)V", PlaceTypes.STORE, "C", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;)V", "v", "()V", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "action", "x", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;)V", "onCleared", "a", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "c", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "d", "Lpv/B;", "_storeListState", "LJu/a;", "e", "LJu/a;", "disposables", "Lpv/P;", "f", "Lpv/P;", "u", "()Lpv/P;", "stateFlow", "", "g", "I", "pointer", "h", "Ljava/util/List;", "currentList", "i", "totalNumberOfStores", "j", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "currentSelectedStore", "k", "fullStoreList", "l", "Z", "m", "Ljava/lang/String;", "zipInUse", "n", "searchMethod", "o", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o extends c0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f107125p = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SearchStoresCall searchStoresCall;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C12188a createAccountRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<m> _storeListState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<m> stateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pointer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<m.d.StoreDetailsItemState> currentList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int totalNumberOfStores;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private m.d.StoreDetailsItemState currentSelectedStore;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<List<m.d.StoreDetailsItemState>> fullStoreList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isLocationUsed;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String zipInUse;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String searchMethod;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListViewModel", f = "StoreListViewModel.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "createAccount")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f107140a;

        /* renamed from: b, reason: collision with root package name */
        int f107141b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f107142c;

        /* renamed from: e, reason: collision with root package name */
        int f107144e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f107142c = obj;
            this.f107144e |= Integer.MIN_VALUE;
            return o.this.r(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListViewModel$fetchStoresByGeolocation$1", f = "StoreListViewModel.kt", l = {136}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107145a;

        /* renamed from: b, reason: collision with root package name */
        int f107146b;

        /* renamed from: c, reason: collision with root package name */
        int f107147c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f107148d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f107150f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f107151g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<m.d.StoreDetailsItemState> f107152h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(double d10, double d11, List<m.d.StoreDetailsItemState> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f107150f = d10;
            this.f107151g = d11;
            this.f107152h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = o.this.new c(this.f107150f, this.f107151g, this.f107152h, continuation);
            cVar.f107148d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f107147c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r13.f107145a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r13.f107148d
                r1 = r0
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L1a
                r12 = r13
                goto L50
            L1a:
                r0 = move-exception
                r14 = r0
                r12 = r13
                goto L5d
            L1e:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L26:
                kotlin.ResultKt.b(r14)
                java.lang.Object r14 = r13.f107148d
                r1 = r14
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r14 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                double r5 = r13.f107150f
                double r7 = r13.f107151g
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5a
                com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall r4 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.o(r14)     // Catch: java.lang.Throwable -> L5a
                pk.i r11 = pk.i.f156745c     // Catch: java.lang.Throwable -> L5a
                r13.f107148d = r1     // Catch: java.lang.Throwable -> L5a
                r13.f107145a = r1     // Catch: java.lang.Throwable -> L5a
                r13.f107146b = r2     // Catch: java.lang.Throwable -> L5a
                r13.f107147c = r3     // Catch: java.lang.Throwable -> L5a
                r9 = 50
                r10 = 50
                r12 = r13
                java.lang.Object r14 = r4.getObservable(r5, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L57
                if (r14 != r0) goto L50
                return r0
            L50:
                java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> L57
                java.lang.Object r14 = kotlin.Result.b(r14)     // Catch: java.lang.Throwable -> L57
                goto L67
            L57:
                r0 = move-exception
            L58:
                r14 = r0
                goto L5d
            L5a:
                r0 = move-exception
                r12 = r13
                goto L58
            L5d:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r14 = kotlin.ResultKt.a(r14)
                java.lang.Object r14 = kotlin.Result.b(r14)
            L67:
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                java.util.List<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$a> r3 = r12.f107152h
                boolean r4 = kotlin.Result.h(r14)
                if (r4 == 0) goto L78
                java.util.List r14 = (java.util.List) r14
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.q(r0, r14, r3)
                kotlin.Unit r14 = kotlin.Unit.f143329a
            L78:
                java.lang.Object r14 = kotlin.Result.b(r14)
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                java.util.List<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$a> r3 = r12.f107152h
                java.lang.Throwable r14 = kotlin.Result.e(r14)
                if (r14 == 0) goto Lb2
                kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
                mv.E0.i(r1)
                boolean r1 = r14 instanceof java.lang.Error
                if (r1 != 0) goto Lb1
                qw.a$a r1 = qw.a.INSTANCE
                java.lang.String r4 = "Failed to Load Nearby Stores by Geolocation."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.f(r14, r4, r2)
                pv.B r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.p(r0)
            L9e:
                java.lang.Object r14 = r0.getValue()
                r1 = r14
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r1 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.m) r1
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$b r1 = new com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$b
                r1.<init>(r3)
                boolean r14 = r0.e(r14, r1)
                if (r14 == 0) goto L9e
                goto Lb2
            Lb1:
                throw r14
            Lb2:
                kotlin.Unit r14 = kotlin.Unit.f143329a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListViewModel$onAction$6", f = "StoreListViewModel.kt", l = {93}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107153a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107153a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                o oVar = o.this;
                this.f107153a = 1;
                if (oVar.r(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListViewModel$searchStoresWithZipCode$1", f = "StoreListViewModel.kt", l = {159}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f107155a;

        /* renamed from: b, reason: collision with root package name */
        int f107156b;

        /* renamed from: c, reason: collision with root package name */
        int f107157c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f107158d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f107160f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<m.d.StoreDetailsItemState> f107161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, List<m.d.StoreDetailsItemState> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f107160f = str;
            this.f107161g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = o.this.new e(this.f107160f, this.f107161g, continuation);
            eVar.f107158d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f107157c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r11.f107155a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r11.f107158d
                r1 = r0
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1a
                r10 = r11
                goto L4f
            L1a:
                r0 = move-exception
                r12 = r0
                r10 = r11
                goto L5c
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f107158d
                r1 = r12
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r12 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                java.lang.String r5 = r11.f107160f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L59
                com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall r4 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.o(r12)     // Catch: java.lang.Throwable -> L59
                pk.i r9 = pk.i.f156745c     // Catch: java.lang.Throwable -> L59
                r11.f107158d = r1     // Catch: java.lang.Throwable -> L59
                r11.f107155a = r1     // Catch: java.lang.Throwable -> L59
                r11.f107156b = r2     // Catch: java.lang.Throwable -> L59
                r11.f107157c = r3     // Catch: java.lang.Throwable -> L59
                r6 = 50
                r7 = 50
                r8 = 0
                r10 = r11
                java.lang.Object r12 = r4.getObservable(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L56
                if (r12 != r0) goto L4f
                return r0
            L4f:
                java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L56
                java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L56
                goto L66
            L56:
                r0 = move-exception
            L57:
                r12 = r0
                goto L5c
            L59:
                r0 = move-exception
                r10 = r11
                goto L57
            L5c:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r12 = kotlin.ResultKt.a(r12)
                java.lang.Object r12 = kotlin.Result.b(r12)
            L66:
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                java.util.List<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$a> r3 = r10.f107161g
                boolean r4 = kotlin.Result.h(r12)
                if (r4 == 0) goto L77
                java.util.List r12 = (java.util.List) r12
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.q(r0, r12, r3)
                kotlin.Unit r12 = kotlin.Unit.f143329a
            L77:
                java.lang.Object r12 = kotlin.Result.b(r12)
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.this
                java.util.List<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$a> r3 = r10.f107161g
                java.lang.Throwable r12 = kotlin.Result.e(r12)
                if (r12 == 0) goto Lb1
                kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
                mv.E0.i(r1)
                boolean r1 = r12 instanceof java.lang.Error
                if (r1 != 0) goto Lb0
                qw.a$a r1 = qw.a.INSTANCE
                java.lang.String r4 = "Failed to Load Nearby Stores by Zip Code."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.f(r12, r4, r2)
                pv.B r0 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.p(r0)
            L9d:
                java.lang.Object r12 = r0.getValue()
                r1 = r12
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r1 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.m) r1
                com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$b r1 = new com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$b
                r1.<init>(r3)
                boolean r12 = r0.e(r12, r1)
                if (r12 == 0) goto L9d
                goto Lb1
            Lb0:
                throw r12
            Lb1:
                kotlin.Unit r12 = kotlin.Unit.f143329a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(List<Store> storesList, List<m.d.StoreDetailsItemState> list) {
        List<Store> list2 = storesList;
        if (list2 == null || list2.isEmpty()) {
            InterfaceC16549B<m> interfaceC16549B = this._storeListState;
            while (!interfaceC16549B.e(interfaceC16549B.getValue(), new m.d.StoreListAdapterState(list))) {
            }
            return;
        }
        for (Store store : storesList) {
            list.add(new m.d.StoreDetailsItemState(store.getName(), store.getMilesFrom(), store.getAddress(), store.getStoreHours(), Integer.valueOf(store.getStoreId()), store.getCity(), store.getState(), store.getZipCode()));
        }
        s(list);
    }

    public o(SearchStoresCall searchStoresCall, C12188a createAccountRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(searchStoresCall, "searchStoresCall");
        Intrinsics.j(createAccountRepository, "createAccountRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.searchStoresCall = searchStoresCall;
        this.createAccountRepository = createAccountRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<m> interfaceC16549BA = S.a(m.e.f107120a);
        this._storeListState = interfaceC16549BA;
        this.disposables = new Ju.a();
        this.stateFlow = interfaceC16549BA;
        this.currentList = new ArrayList();
        this.fullStoreList = new ArrayList();
        this.zipInUse = "";
        this.searchMethod = "";
    }

    private final void A(boolean isLocationUsed) {
        this.searchMethod = isLocationUsed ? "locationShared" : "zipEntered";
        this.analyticsEngine.b(C14756c.h("meijer: create account: primary store selection: store list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.storeLocation.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.B(this.f107123a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(o oVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        track.h("homeStoreId", "158");
        track.h("currentStoreId", "158");
        track.h(oVar.searchMethod, "1");
        if (Intrinsics.e(oVar.searchMethod, "zipEntered")) {
            track.h("zipUsed", oVar.zipInUse);
        }
        return Unit.f143329a;
    }

    private final void C(m.d.StoreDetailsItemState store) {
        this.currentSelectedStore = store;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.b
            if (r0 == 0) goto L13
            r0 = r8
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.o$b r0 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.b) r0
            int r1 = r0.f107144e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107144e = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.o$b r0 = new com.meijer.mobile.meijer.activity.enrollment.storeLocation.o$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f107142c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f107144e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f107140a
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.o r0 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.o) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L2e:
            r8 = move-exception
            goto L53
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2e
            com.meijer.mobile.meijer.activity.enrollment.a r8 = r7.createAccountRepository     // Catch: java.lang.Throwable -> L2e
            r0.f107140a = r7     // Catch: java.lang.Throwable -> L2e
            r0.f107141b = r3     // Catch: java.lang.Throwable -> L2e
            r0.f107144e = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 != r1) goto L4c
            return r1
        L4c:
            Cs.a r8 = (Cs.MeijerAccount) r8     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L5d
        L53:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L5d:
            boolean r0 = kotlin.Result.h(r8)
            if (r0 == 0) goto L9a
            r0 = r8
            Cs.a r0 = (Cs.MeijerAccount) r0
            if (r0 == 0) goto L89
            pv.B<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m> r1 = r7._storeListState
        L6a:
            java.lang.Object r2 = r1.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r4 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.m) r4
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$a r4 = new com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$a
            com.meijer.mobile.meijer.activity.enrollment.a r5 = r7.createAccountRepository
            boolean r5 = r5.getTextAdsCheckbox()
            com.meijer.mobile.meijer.activity.enrollment.a r6 = r7.createAccountRepository
            boolean r6 = r6.getWeeklyAdCheckbox()
            r4.<init>(r0, r5, r6)
            boolean r2 = r1.e(r2, r4)
            if (r2 == 0) goto L6a
            goto L9a
        L89:
            pv.B<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m> r0 = r7._storeListState
        L8b:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r2 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.m) r2
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$b r2 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.m.b.f107107a
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L8b
        L9a:
            java.lang.Throwable r8 = kotlin.Result.e(r8)
            if (r8 == 0) goto Lba
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "Account creation failed"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.f(r8, r1, r2)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.storeLocation.m> r8 = r7._storeListState
        Lab:
            java.lang.Object r0 = r8.getValue()
            r1 = r0
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m r1 = (com.meijer.mobile.meijer.activity.enrollment.storeLocation.m) r1
            com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$b r1 = com.meijer.mobile.meijer.activity.enrollment.storeLocation.m.b.f107107a
            boolean r0 = r8.e(r0, r1)
            if (r0 == 0) goto Lab
        Lba:
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.storeLocation.o.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void t(double latitude, double longitude) {
        C15809k.d(d0.a(this), null, null, new c(latitude, longitude, new ArrayList(), null), 3, null);
    }

    private final void v() {
        int i10 = this.totalNumberOfStores / 5;
        int i11 = this.pointer;
        if (i10 > i11 - 1) {
            this.currentList.addAll(this.fullStoreList.get(i11));
            this.pointer++;
        }
    }

    private final void y(String searchTerm) {
        ArrayList arrayList = new ArrayList();
        if (searchTerm.length() > 0) {
            C15809k.d(d0.a(this), null, null, new e(searchTerm, arrayList, null), 3, null);
        } else {
            InterfaceC16549B<m> interfaceC16549B = this._storeListState;
            while (!interfaceC16549B.e(interfaceC16549B.getValue(), new m.d.StoreListAdapterState(arrayList))) {
            }
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final P<m> u() {
        return this.stateFlow;
    }

    public final void x(a action) {
        m value;
        List<m.d.StoreDetailsItemState> list;
        Intrinsics.j(action, "action");
        if (action instanceof a.FetchStoresWithLocationPermission) {
            this.isLocationUsed = true;
            InterfaceC16549B<m> interfaceC16549B = this._storeListState;
            while (!interfaceC16549B.e(interfaceC16549B.getValue(), m.e.f107120a)) {
            }
            a.FetchStoresWithLocationPermission fetchStoresWithLocationPermission = (a.FetchStoresWithLocationPermission) action;
            t(fetchStoresWithLocationPermission.getLatitude(), fetchStoresWithLocationPermission.getLongitude());
            return;
        }
        if (action instanceof a.SearchWithZipOrAddress) {
            InterfaceC16549B<m> interfaceC16549B2 = this._storeListState;
            while (!interfaceC16549B2.e(interfaceC16549B2.getValue(), m.e.f107120a)) {
            }
            this.currentList.clear();
            this.pointer = 0;
            a.SearchWithZipOrAddress searchWithZipOrAddress = (a.SearchWithZipOrAddress) action;
            this.zipInUse = searchWithZipOrAddress.getZipOrAddressOrCity();
            y(searchWithZipOrAddress.getZipOrAddressOrCity());
            return;
        }
        if (action instanceof a.UpdateSelectedStore) {
            C(((a.UpdateSelectedStore) action).getStore());
            InterfaceC16549B<m> interfaceC16549B3 = this._storeListState;
            while (!interfaceC16549B3.e(interfaceC16549B3.getValue(), m.g.f107122a)) {
            }
            return;
        }
        if (!(action instanceof a.d)) {
            if (action instanceof a.g) {
                v();
                InterfaceC16549B<m> interfaceC16549B4 = this._storeListState;
                do {
                    value = interfaceC16549B4.getValue();
                    list = this.currentList;
                } while (!interfaceC16549B4.e(value, new m.LoadMoreStores(list, list.size(), this.totalNumberOfStores / 5 < this.pointer)));
                return;
            }
            if (action instanceof a.C1594a) {
                C15809k.d(d0.a(this), null, null, new d(null), 3, null);
                return;
            } else {
                if (!(action instanceof a.TrackState)) {
                    throw new NoWhenBranchMatchedException();
                }
                A(((a.TrackState) action).getIsLocationUsed());
                return;
            }
        }
        m.d.StoreDetailsItemState storeDetailsItemState = this.currentSelectedStore;
        if (storeDetailsItemState != null) {
            C12188a c12188a = this.createAccountRepository;
            Intrinsics.g(storeDetailsItemState);
            Integer storeId = storeDetailsItemState.getStoreId();
            Intrinsics.g(storeId);
            int iIntValue = storeId.intValue();
            m.d.StoreDetailsItemState storeDetailsItemState2 = this.currentSelectedStore;
            Intrinsics.g(storeDetailsItemState2);
            String zipCode = storeDetailsItemState2.getZipCode();
            Intrinsics.g(zipCode);
            c12188a.f(iIntValue, zipCode);
            InterfaceC16549B<m> interfaceC16549B5 = this._storeListState;
            while (!interfaceC16549B5.e(interfaceC16549B5.getValue(), m.f.f107121a)) {
            }
        }
    }

    private final void s(List<m.d.StoreDetailsItemState> list) {
        this.totalNumberOfStores = list.size();
        this.fullStoreList.clear();
        this.fullStoreList.addAll(CollectionsKt.g0(list, 5));
        v();
        InterfaceC16549B<m> interfaceC16549B = this._storeListState;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), new m.d.StoreListAdapterState(this.currentList))) {
        }
    }
}
