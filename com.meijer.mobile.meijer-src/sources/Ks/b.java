package Ks;

import Js.WeeklyAdItem;
import Js.WeeklyAdPrintPage;
import Js.WeeklyAdPublication;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0011J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"LKs/b;", "", "LKs/a;", "flippWeeklyAdApi", "", "flippAccessToken", "flippMerchantId", "Lmv/K;", "ioDispatcher", "<init>", "(LKs/a;Ljava/lang/String;Ljava/lang/String;Lmv/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LJs/e;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flyerId", "LJs/b;", "f", "itemId", "e", "LJs/c;", "d", "a", "LKs/a;", "b", "Ljava/lang/String;", "c", "Lmv/K;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ks.a flippWeeklyAdApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String flippAccessToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String flippMerchantId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LJs/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.FlippWeeklyAdDataSource$getPages$2", f = "FlippWeeklyAdDataSource.kt", l = {112}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends WeeklyAdPrintPage>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f17693a;

        /* renamed from: b, reason: collision with root package name */
        int f17694b;

        /* renamed from: c, reason: collision with root package name */
        int f17695c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f17696d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17698f;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends WeeklyAdPrintPage>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<WeeklyAdPrintPage>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17698f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = b.this.new a(this.f17698f, continuation);
            aVar.f17696d = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<WeeklyAdPrintPage>> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0069, B:22:0x006f, B:23:0x007d, B:24:0x0082, B:25:0x0087), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0069, B:22:0x006f, B:23:0x007d, B:24:0x0082, B:25:0x0087), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f17695c
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r7.f17693a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f17696d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L49
            L17:
                r8 = move-exception
                goto L8c
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f17696d
                mv.O r8 = (mv.InterfaceC15783O) r8
                Ks.b r1 = Ks.b.this
                int r3 = r7.f17698f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L88
                Ks.a r4 = Ks.b.c(r1)     // Catch: java.lang.Throwable -> L88
                java.lang.String r1 = Ks.b.a(r1)     // Catch: java.lang.Throwable -> L88
                r7.f17696d = r8     // Catch: java.lang.Throwable -> L88
                r7.f17693a = r8     // Catch: java.lang.Throwable -> L88
                r5 = 0
                r7.f17694b = r5     // Catch: java.lang.Throwable -> L88
                r7.f17695c = r2     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r4.c(r3, r1, r7)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r8
                r8 = r1
            L49:
                retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Throwable -> L17
                boolean r1 = r8.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L82
                java.lang.Object r8 = r8.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r8)     // Catch: java.lang.Throwable -> L17
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L17
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r8, r2)     // Catch: java.lang.Throwable -> L17
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L17
            L69:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r2 == 0) goto L7d
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPrintPageJson r2 = (com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPrintPageJson) r2     // Catch: java.lang.Throwable -> L17
                Js.c r2 = Ms.c.a(r2)     // Catch: java.lang.Throwable -> L17
                r1.add(r2)     // Catch: java.lang.Throwable -> L17
                goto L69
            L7d:
                java.lang.Object r8 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L17
                goto L96
            L82:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r8)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L88:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L8c:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L96:
                java.lang.Throwable r1 = kotlin.Result.e(r8)
                if (r1 != 0) goto L9d
                goto Lbe
            L9d:
                kotlin.coroutines.CoroutineContext r8 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> La9
                mv.E0.i(r8)     // Catch: java.lang.Throwable -> La9
                boolean r8 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> La9
                if (r8 == 0) goto Lab
                throw r1     // Catch: java.lang.Throwable -> La9
            La9:
                r8 = move-exception
                goto Lb4
            Lab:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r8 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> La9
                sk.d r0 = sk.d.f160830c     // Catch: java.lang.Throwable -> La9
                com.meijer.mobile.core.networking.exceptions.RetrofitException r8 = r8.e(r0, r1)     // Catch: java.lang.Throwable -> La9
                throw r8     // Catch: java.lang.Throwable -> La9
            Lb4:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            Lbe:
                kotlin.ResultKt.b(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ks.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LJs/b;", "<anonymous>", "(Lmv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.FlippWeeklyAdDataSource$getProductDetails$2", f = "FlippWeeklyAdDataSource.kt", l = {91}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Ks.b$b, reason: collision with other inner class name */
    static final class C0320b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super WeeklyAdItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f17699a;

        /* renamed from: b, reason: collision with root package name */
        int f17700b;

        /* renamed from: c, reason: collision with root package name */
        int f17701c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f17702d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17704f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0320b(int i10, Continuation<? super C0320b> continuation) {
            super(2, continuation);
            this.f17704f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0320b c0320b = b.this.new C0320b(this.f17704f, continuation);
            c0320b.f17702d = obj;
            return c0320b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super WeeklyAdItem> continuation) {
            return ((C0320b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0048, B:19:0x0050, B:20:0x0062, B:21:0x0067), top: B:38:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0048, B:19:0x0050, B:20:0x0062, B:21:0x0067), top: B:38:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f17701c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r7.f17699a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f17702d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L48
            L17:
                r8 = move-exception
                goto L6c
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f17702d
                mv.O r8 = (mv.InterfaceC15783O) r8
                Ks.b r1 = Ks.b.this
                int r3 = r7.f17704f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L68
                Ks.a r4 = Ks.b.c(r1)     // Catch: java.lang.Throwable -> L68
                java.lang.String r1 = Ks.b.a(r1)     // Catch: java.lang.Throwable -> L68
                r7.f17702d = r8     // Catch: java.lang.Throwable -> L68
                r7.f17699a = r8     // Catch: java.lang.Throwable -> L68
                r5 = 0
                r7.f17700b = r5     // Catch: java.lang.Throwable -> L68
                r7.f17701c = r2     // Catch: java.lang.Throwable -> L68
                java.lang.Object r1 = r4.b(r3, r1, r7)     // Catch: java.lang.Throwable -> L68
                if (r1 != r0) goto L46
                return r0
            L46:
                r0 = r8
                r8 = r1
            L48:
                retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Throwable -> L17
                boolean r1 = r8.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L62
                java.lang.Object r8 = r8.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r8)     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJson r8 = (com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJson) r8     // Catch: java.lang.Throwable -> L17
                Js.b r8 = Ms.b.b(r8)     // Catch: java.lang.Throwable -> L17
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L76
            L62:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r8)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L68:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L6c:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L76:
                java.lang.Throwable r1 = kotlin.Result.e(r8)
                if (r1 != 0) goto L7d
                goto L9e
            L7d:
                kotlin.coroutines.CoroutineContext r8 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> L89
                mv.E0.i(r8)     // Catch: java.lang.Throwable -> L89
                boolean r8 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L89
                if (r8 == 0) goto L8b
                throw r1     // Catch: java.lang.Throwable -> L89
            L89:
                r8 = move-exception
                goto L94
            L8b:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r8 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> L89
                sk.d r0 = sk.d.f160831d     // Catch: java.lang.Throwable -> L89
                com.meijer.mobile.core.networking.exceptions.RetrofitException r8 = r8.e(r0, r1)     // Catch: java.lang.Throwable -> L89
                throw r8     // Catch: java.lang.Throwable -> L89
            L94:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L9e:
                kotlin.ResultKt.b(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ks.b.C0320b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LJs/b;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.FlippWeeklyAdDataSource$getProducts$2", f = "FlippWeeklyAdDataSource.kt", l = {68}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends WeeklyAdItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f17705a;

        /* renamed from: b, reason: collision with root package name */
        int f17706b;

        /* renamed from: c, reason: collision with root package name */
        int f17707c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f17708d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17710f;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends WeeklyAdItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<WeeklyAdItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f17710f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(this.f17710f, continuation);
            cVar.f17708d = obj;
            return cVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<WeeklyAdItem>> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0069, B:22:0x006f, B:23:0x007d, B:24:0x0082, B:25:0x0087), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0069, B:22:0x006f, B:23:0x007d, B:24:0x0082, B:25:0x0087), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f17707c
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r7.f17705a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f17708d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L17
                goto L49
            L17:
                r8 = move-exception
                goto L8c
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f17708d
                mv.O r8 = (mv.InterfaceC15783O) r8
                Ks.b r1 = Ks.b.this
                int r3 = r7.f17710f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L88
                Ks.a r4 = Ks.b.c(r1)     // Catch: java.lang.Throwable -> L88
                java.lang.String r1 = Ks.b.a(r1)     // Catch: java.lang.Throwable -> L88
                r7.f17708d = r8     // Catch: java.lang.Throwable -> L88
                r7.f17705a = r8     // Catch: java.lang.Throwable -> L88
                r5 = 0
                r7.f17706b = r5     // Catch: java.lang.Throwable -> L88
                r7.f17707c = r2     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r4.d(r3, r1, r7)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r8
                r8 = r1
            L49:
                retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Throwable -> L17
                boolean r1 = r8.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L82
                java.lang.Object r8 = r8.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r8)     // Catch: java.lang.Throwable -> L17
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L17
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r8, r2)     // Catch: java.lang.Throwable -> L17
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L17
            L69:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r2 == 0) goto L7d
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJson r2 = (com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJson) r2     // Catch: java.lang.Throwable -> L17
                Js.b r2 = Ms.b.b(r2)     // Catch: java.lang.Throwable -> L17
                r1.add(r2)     // Catch: java.lang.Throwable -> L17
                goto L69
            L7d:
                java.lang.Object r8 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L17
                goto L96
            L82:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r8)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L88:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L8c:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L96:
                java.lang.Throwable r1 = kotlin.Result.e(r8)
                if (r1 != 0) goto L9d
                goto Lbe
            L9d:
                kotlin.coroutines.CoroutineContext r8 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> La9
                mv.E0.i(r8)     // Catch: java.lang.Throwable -> La9
                boolean r8 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> La9
                if (r8 == 0) goto Lab
                throw r1     // Catch: java.lang.Throwable -> La9
            La9:
                r8 = move-exception
                goto Lb4
            Lab:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r8 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> La9
                sk.d r0 = sk.d.f160831d     // Catch: java.lang.Throwable -> La9
                com.meijer.mobile.core.networking.exceptions.RetrofitException r8 = r8.e(r0, r1)     // Catch: java.lang.Throwable -> La9
                throw r8     // Catch: java.lang.Throwable -> La9
            Lb4:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            Lbe:
                kotlin.ResultKt.b(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ks.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LJs/e;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.FlippWeeklyAdDataSource$getPublications$2", f = "FlippWeeklyAdDataSource.kt", l = {46}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends WeeklyAdPublication>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f17711a;

        /* renamed from: b, reason: collision with root package name */
        int f17712b;

        /* renamed from: c, reason: collision with root package name */
        int f17713c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f17714d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17716f;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends WeeklyAdPublication>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<WeeklyAdPublication>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f17716f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = b.this.new d(this.f17716f, continuation);
            dVar.f17714d = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<WeeklyAdPublication>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x004d, B:19:0x0055, B:20:0x006d, B:22:0x0073, B:23:0x0081, B:24:0x0086, B:25:0x008b), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x004d, B:19:0x0055, B:20:0x006d, B:22:0x0073, B:23:0x0081, B:24:0x0086, B:25:0x008b), top: B:42:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f17713c
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r8.f17711a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r8.f17714d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L17
                goto L4d
            L17:
                r9 = move-exception
                goto L90
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f17714d
                mv.O r9 = (mv.InterfaceC15783O) r9
                Ks.b r1 = Ks.b.this
                int r3 = r8.f17716f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8c
                Ks.a r4 = Ks.b.c(r1)     // Catch: java.lang.Throwable -> L8c
                java.lang.String r5 = Ks.b.b(r1)     // Catch: java.lang.Throwable -> L8c
                java.lang.String r1 = Ks.b.a(r1)     // Catch: java.lang.Throwable -> L8c
                r8.f17714d = r9     // Catch: java.lang.Throwable -> L8c
                r8.f17711a = r9     // Catch: java.lang.Throwable -> L8c
                r6 = 0
                r8.f17712b = r6     // Catch: java.lang.Throwable -> L8c
                r8.f17713c = r2     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r1 = r4.e(r5, r3, r1, r8)     // Catch: java.lang.Throwable -> L8c
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r0 = r9
                r9 = r1
            L4d:
                retrofit2.Response r9 = (retrofit2.Response) r9     // Catch: java.lang.Throwable -> L17
                boolean r1 = r9.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L86
                java.lang.Object r9 = r9.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r9)     // Catch: java.lang.Throwable -> L17
                java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L17
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r9, r2)     // Catch: java.lang.Throwable -> L17
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
                java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
            L6d:
                boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r2 == 0) goto L81
                java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPublicationJson r2 = (com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPublicationJson) r2     // Catch: java.lang.Throwable -> L17
                Js.e r2 = Ms.d.a(r2)     // Catch: java.lang.Throwable -> L17
                r1.add(r2)     // Catch: java.lang.Throwable -> L17
                goto L6d
            L81:
                java.lang.Object r9 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L17
                goto L9a
            L86:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r9)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L8c:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L90:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L9a:
                java.lang.Throwable r1 = kotlin.Result.e(r9)
                if (r1 != 0) goto La1
                goto Lc2
            La1:
                kotlin.coroutines.CoroutineContext r9 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> Lad
                mv.E0.i(r9)     // Catch: java.lang.Throwable -> Lad
                boolean r9 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto Laf
                throw r1     // Catch: java.lang.Throwable -> Lad
            Lad:
                r9 = move-exception
                goto Lb8
            Laf:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r9 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> Lad
                sk.d r0 = sk.d.f160829b     // Catch: java.lang.Throwable -> Lad
                com.meijer.mobile.core.networking.exceptions.RetrofitException r9 = r9.e(r0, r1)     // Catch: java.lang.Throwable -> Lad
                throw r9     // Catch: java.lang.Throwable -> Lad
            Lb8:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            Lc2:
                kotlin.ResultKt.b(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Ks.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Ks.a flippWeeklyAdApi, String flippAccessToken, String flippMerchantId, AbstractC15779K ioDispatcher) {
        Intrinsics.j(flippWeeklyAdApi, "flippWeeklyAdApi");
        Intrinsics.j(flippAccessToken, "flippAccessToken");
        Intrinsics.j(flippMerchantId, "flippMerchantId");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.flippWeeklyAdApi = flippWeeklyAdApi;
        this.flippAccessToken = flippAccessToken;
        this.flippMerchantId = flippMerchantId;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object d(int i10, Continuation<? super List<WeeklyAdPrintPage>> continuation) {
        return C15805i.g(this.ioDispatcher, new a(i10, null), continuation);
    }

    public final Object e(int i10, Continuation<? super WeeklyAdItem> continuation) {
        return C15805i.g(this.ioDispatcher, new C0320b(i10, null), continuation);
    }

    public final Object f(int i10, Continuation<? super List<WeeklyAdItem>> continuation) {
        return C15805i.g(this.ioDispatcher, new c(i10, null), continuation);
    }

    public final Object g(int i10, Continuation<? super List<WeeklyAdPublication>> continuation) {
        return C15805i.g(this.ioDispatcher, new d(i10, null), continuation);
    }
}
