package Zq;

import com.meijer.mobile.storeinfo.api.model.Store;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiException;
import com.squareup.moshi.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.E0;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"LZq/b;", "", "LZq/a;", "storeApi", "Lcom/squareup/moshi/t;", "moshi", "Lmv/K;", "ioDispatcher", "<init>", "(LZq/a;Lcom/squareup/moshi/t;Lmv/K;)V", "", "storeNumber", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "e", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "searchRadius", "maxStores", "", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "d", "(DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "zipCode", "c", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LZq/a;", "b", "Lcom/squareup/moshi/t;", "Lmv/K;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zq.a storeApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/storeinfo/api/model/Store;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.storeinfo.api.StoreInfoRepository$getNearbyStoreWithZip$2", f = "StoreInfoRepository.kt", l = {92}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Store>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f44091a;

        /* renamed from: b, reason: collision with root package name */
        Object f44092b;

        /* renamed from: c, reason: collision with root package name */
        Object f44093c;

        /* renamed from: d, reason: collision with root package name */
        Object f44094d;

        /* renamed from: e, reason: collision with root package name */
        int f44095e;

        /* renamed from: f, reason: collision with root package name */
        int f44096f;

        /* renamed from: g, reason: collision with root package name */
        int f44097g;

        /* renamed from: h, reason: collision with root package name */
        int f44098h;

        /* renamed from: i, reason: collision with root package name */
        int f44099i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f44100j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f44102l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f44103m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f44104n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i10, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f44102l = str;
            this.f44103m = i10;
            this.f44104n = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = b.this.new a(this.f44102l, this.f44103m, this.f44104n, continuation);
            aVar.f44100j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Store> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[PHI: r12
          0x00ce: PHI (r12v27 java.lang.Object) = (r12v9 java.lang.Object), (r12v11 java.lang.Object) binds: [B:26:0x0086, B:41:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Zq.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.storeinfo.api.StoreInfoRepository$getNearbyStores$2", f = "StoreInfoRepository.kt", l = {65}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Zq.b$b, reason: collision with other inner class name */
    static final class C0934b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends Store>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f44105a;

        /* renamed from: b, reason: collision with root package name */
        Object f44106b;

        /* renamed from: c, reason: collision with root package name */
        Object f44107c;

        /* renamed from: d, reason: collision with root package name */
        Object f44108d;

        /* renamed from: e, reason: collision with root package name */
        int f44109e;

        /* renamed from: f, reason: collision with root package name */
        int f44110f;

        /* renamed from: g, reason: collision with root package name */
        int f44111g;

        /* renamed from: h, reason: collision with root package name */
        int f44112h;

        /* renamed from: i, reason: collision with root package name */
        int f44113i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f44114j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ double f44116l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ double f44117m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f44118n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f44119o;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends Store>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<Store>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0934b(double d10, double d11, int i10, int i11, Continuation<? super C0934b> continuation) {
            super(2, continuation);
            this.f44116l = d10;
            this.f44117m = d11;
            this.f44118n = i10;
            this.f44119o = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0934b c0934b = b.this.new C0934b(this.f44116l, this.f44117m, this.f44118n, this.f44119o, continuation);
            c0934b.f44114j = obj;
            return c0934b;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<Store>> continuation) {
            return ((C0934b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: Exception -> 0x0082, TryCatch #3 {Exception -> 0x0082, blocks: (B:18:0x0068, B:20:0x0070, B:23:0x0085, B:24:0x008a, B:15:0x0061), top: B:43:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[Catch: Exception -> 0x0082, TryCatch #3 {Exception -> 0x0082, blocks: (B:18:0x0068, B:20:0x0070, B:23:0x0085, B:24:0x008a, B:15:0x0061), top: B:43:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r14.f44113i
                r2 = 1
                if (r1 == 0) goto L30
                if (r1 != r2) goto L28
                java.lang.Object r0 = r14.f44108d
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r14.f44107c
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r14.f44106b
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r14.f44105a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r14.f44114j
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r15)     // Catch: java.lang.Exception -> L24
                r11 = r14
                goto L68
            L24:
                r0 = move-exception
                r15 = r0
                r11 = r14
                goto L8e
            L28:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L30:
                kotlin.ResultKt.b(r15)
                java.lang.Object r15 = r14.f44114j
                mv.O r15 = (mv.InterfaceC15783O) r15
                Zq.b r1 = Zq.b.this
                double r4 = r14.f44116l
                double r6 = r14.f44117m
                int r8 = r14.f44118n
                int r9 = r14.f44119o
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L8b
                Zq.a r3 = Zq.b.b(r1)     // Catch: java.lang.Exception -> L8b
                r14.f44114j = r15     // Catch: java.lang.Exception -> L8b
                r14.f44105a = r15     // Catch: java.lang.Exception -> L8b
                r14.f44106b = r14     // Catch: java.lang.Exception -> L8b
                r14.f44107c = r14     // Catch: java.lang.Exception -> L8b
                r14.f44108d = r15     // Catch: java.lang.Exception -> L8b
                r15 = 0
                r14.f44109e = r15     // Catch: java.lang.Exception -> L8b
                r14.f44110f = r15     // Catch: java.lang.Exception -> L8b
                r14.f44111g = r15     // Catch: java.lang.Exception -> L8b
                r14.f44112h = r15     // Catch: java.lang.Exception -> L8b
                r14.f44113i = r2     // Catch: java.lang.Exception -> L8b
                r10 = 0
                r12 = 16
                r13 = 0
                r11 = r14
                java.lang.Object r15 = Zq.a.c(r3, r4, r6, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L82
                if (r15 != r0) goto L68
                return r0
            L68:
                retrofit2.Response r15 = (retrofit2.Response) r15     // Catch: java.lang.Exception -> L82
                boolean r0 = r15.isSuccessful()     // Catch: java.lang.Exception -> L82
                if (r0 == 0) goto L85
                java.lang.Object r15 = r15.body()     // Catch: java.lang.Exception -> L82
                kotlin.jvm.internal.Intrinsics.g(r15)     // Catch: java.lang.Exception -> L82
                com.meijer.mobile.storeinfo.api.model.StoreInfo r15 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r15     // Catch: java.lang.Exception -> L82
                java.util.List r15 = r15.a()     // Catch: java.lang.Exception -> L82
                java.lang.Object r15 = kotlin.Result.b(r15)     // Catch: java.lang.Exception -> L82
                goto L9f
            L82:
                r0 = move-exception
            L83:
                r15 = r0
                goto L8e
            L85:
                retrofit2.HttpException r0 = new retrofit2.HttpException     // Catch: java.lang.Exception -> L82
                r0.<init>(r15)     // Catch: java.lang.Exception -> L82
                throw r0     // Catch: java.lang.Exception -> L82
            L8b:
                r0 = move-exception
                r11 = r14
                goto L83
            L8e:
                kotlin.coroutines.CoroutineContext r0 = r14.getContext()
                mv.E0.i(r0)
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r15 = kotlin.ResultKt.a(r15)
                java.lang.Object r15 = kotlin.Result.b(r15)
            L9f:
                Zq.b r0 = Zq.b.this
                java.lang.Throwable r1 = kotlin.Result.e(r15)
                if (r1 != 0) goto La8
                goto Lbf
            La8:
                com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiException$a r15 = com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiException.INSTANCE     // Catch: java.lang.Throwable -> Lb3
                com.squareup.moshi.t r0 = Zq.b.a(r0)     // Catch: java.lang.Throwable -> Lb3
                java.lang.Throwable r15 = r15.a(r1, r0)     // Catch: java.lang.Throwable -> Lb3
                throw r15     // Catch: java.lang.Throwable -> Lb3
            Lb3:
                r0 = move-exception
                r15 = r0
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r15 = kotlin.ResultKt.a(r15)
                java.lang.Object r15 = kotlin.Result.b(r15)
            Lbf:
                kotlin.ResultKt.b(r15)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: Zq.b.C0934b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.storeinfo.api.StoreInfoRepository$getStoreInfo$2", f = "StoreInfoRepository.kt", l = {41}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super StoreInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f44120a;

        /* renamed from: b, reason: collision with root package name */
        Object f44121b;

        /* renamed from: c, reason: collision with root package name */
        Object f44122c;

        /* renamed from: d, reason: collision with root package name */
        Object f44123d;

        /* renamed from: e, reason: collision with root package name */
        int f44124e;

        /* renamed from: f, reason: collision with root package name */
        int f44125f;

        /* renamed from: g, reason: collision with root package name */
        int f44126g;

        /* renamed from: h, reason: collision with root package name */
        int f44127h;

        /* renamed from: i, reason: collision with root package name */
        int f44128i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f44129j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f44131l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f44131l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(this.f44131l, continuation);
            cVar.f44129j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super StoreInfo> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Response response;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f44128i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f44129j;
                    b bVar = b.this;
                    int i11 = this.f44131l;
                    Result.Companion companion = Result.INSTANCE;
                    Zq.a aVar = bVar.storeApi;
                    this.f44129j = interfaceC15783O;
                    this.f44120a = interfaceC15783O;
                    this.f44121b = this;
                    this.f44122c = this;
                    this.f44123d = interfaceC15783O;
                    this.f44124e = 0;
                    this.f44125f = 0;
                    this.f44126g = 0;
                    this.f44127h = 0;
                    this.f44128i = 1;
                    obj = aVar.e(i11, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                response = (Response) obj;
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                objB = Result.b(objBody);
                b bVar2 = b.this;
                Throwable thE = Result.e(objB);
                if (thE == null) {
                    ResultKt.b(objB);
                    return objB;
                }
                throw StoreInfoApiException.INSTANCE.a(thE, bVar2.moshi);
            }
            throw new HttpException(response);
        }
    }

    public b(Zq.a storeApi, t moshi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(storeApi, "storeApi");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.storeApi = storeApi;
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(String str, int i10, int i11, Continuation<? super Store> continuation) {
        return C15805i.g(this.ioDispatcher, new a(str, i10, i11, null), continuation);
    }

    public final Object d(double d10, double d11, int i10, int i11, Continuation<? super List<Store>> continuation) {
        return C15805i.g(this.ioDispatcher, new C0934b(d10, d11, i10, i11, null), continuation);
    }

    public final Object e(int i10, Continuation<? super StoreInfo> continuation) {
        return C15805i.g(this.ioDispatcher, new c(i10, null), continuation);
    }
}
