package Hq;

import android.security.keystore.UserNotAuthenticatedException;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.meijer.mobile.shoppinglist.service.requests.AddFavoritesItemsRequest;
import com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest;
import com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import retrofit2.Response;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"LHq/b;", "LHq/a;", "LHq/d;", "shoppingListAPI", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LHq/d;LYi/a;Lmv/K;)V", "", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favoriteListItem", "Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;", "d", "(Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;", "request", "Lretrofit2/Response;", "", "c", "(Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LHq/d;", "LYi/a;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements Hq.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Hq.d shoppingListAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.FavoritesListService$addItemToList$2", f = "FavoritesListService.kt", l = {37, 36}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FavoriteListAddItemResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13908a;

        /* renamed from: b, reason: collision with root package name */
        int f13909b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FavoriteListItemWireModel f13911d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FavoriteListItemWireModel favoriteListItemWireModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13911d = favoriteListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f13911d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FavoriteListAddItemResponse> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13909b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13908a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = b.this.shoppingListAPI;
                Yi.a aVar = b.this.authTokenProvider;
                this.f13908a = dVar;
                this.f13909b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            AddFavoritesItemsRequest addFavoritesItemsRequest = new AddFavoritesItemsRequest(this.f13911d);
            this.f13908a = null;
            this.f13909b = 2;
            Object objE = dVar.e((BearerToken) obj, addFavoritesItemsRequest, this);
            if (objE == objF) {
                return objF;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.FavoritesListService$addItemsToList$2", f = "FavoritesListService.kt", l = {46, 45}, m = "invokeSuspend")
    /* renamed from: Hq.b$b, reason: collision with other inner class name */
    static final class C0217b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FavoriteListAddItemResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13912a;

        /* renamed from: b, reason: collision with root package name */
        int f13913b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<FavoriteListItemWireModel> f13915d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0217b(List<FavoriteListItemWireModel> list, Continuation<? super C0217b> continuation) {
            super(2, continuation);
            this.f13915d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0217b(this.f13915d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FavoriteListAddItemResponse> continuation) {
            return ((C0217b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13913b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13912a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = b.this.shoppingListAPI;
                Yi.a aVar = b.this.authTokenProvider;
                this.f13912a = dVar;
                this.f13913b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            AddFavoritesItemsRequest addFavoritesItemsRequest = new AddFavoritesItemsRequest(this.f13915d);
            this.f13912a = null;
            this.f13913b = 2;
            Object objE = dVar.e((BearerToken) obj, addFavoritesItemsRequest, this);
            if (objE == objF) {
                return objF;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.FavoritesListService$deleteItems$2", f = "FavoritesListService.kt", l = {54, 54}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13916a;

        /* renamed from: b, reason: collision with root package name */
        int f13917b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DeleteFavoritesListItemsRequest f13919d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DeleteFavoritesListItemsRequest deleteFavoritesListItemsRequest, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f13919d = deleteFavoritesListItemsRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(this.f13919d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13917b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13916a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = b.this.shoppingListAPI;
                Yi.a aVar = b.this.authTokenProvider;
                this.f13916a = dVar;
                this.f13917b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            DeleteFavoritesListItemsRequest deleteFavoritesListItemsRequest = this.f13919d;
            this.f13916a = null;
            this.f13917b = 2;
            Object objC = dVar.c((BearerToken) obj, deleteFavoritesListItemsRequest, this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.FavoritesListService$getList$2", f = "FavoritesListService.kt", l = {30, 30}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends FavoriteListItemWireModel>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13920a;

        /* renamed from: b, reason: collision with root package name */
        int f13921b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends FavoriteListItemWireModel>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<FavoriteListItemWireModel>>) continuation);
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<FavoriteListItemWireModel>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f13921b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f13920a
                Hq.d r1 = (Hq.d) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Hq.b r5 = Hq.b.this
                Hq.d r1 = Hq.b.f(r5)
                Hq.b r5 = Hq.b.this
                Yi.a r5 = Hq.b.e(r5)
                r4.f13920a = r1
                r4.f13921b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f13920a = r3
                r4.f13921b = r2
                java.lang.Object r5 = r1.f(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                com.meijer.mobile.shoppinglist.service.responses.GetFavoritesListResponse r5 = (com.meijer.mobile.shoppinglist.service.responses.GetFavoritesListResponse) r5
                java.util.List r5 = r5.a()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Hq.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Hq.d shoppingListAPI, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(shoppingListAPI, "shoppingListAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.shoppingListAPI = shoppingListAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // Hq.a
    public Object a(List<FavoriteListItemWireModel> list, Continuation<? super FavoriteListAddItemResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new C0217b(list, null), continuation);
    }

    @Override // Hq.a
    public Object b(Continuation<? super List<FavoriteListItemWireModel>> continuation) {
        return C15805i.g(this.ioDispatcher, new d(null), continuation);
    }

    @Override // Hq.a
    public Object c(DeleteFavoritesListItemsRequest deleteFavoritesListItemsRequest, Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new c(deleteFavoritesListItemsRequest, null), continuation);
    }

    @Override // Hq.a
    public Object d(FavoriteListItemWireModel favoriteListItemWireModel, Continuation<? super FavoriteListAddItemResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new a(favoriteListItemWireModel, null), continuation);
    }
}
