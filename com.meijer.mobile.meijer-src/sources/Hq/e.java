package Hq;

import android.security.keystore.UserNotAuthenticatedException;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.meijer.mobile.shoppinglist.service.requests.AddFavoriteItemsToShoppingListRequest;
import com.meijer.mobile.shoppinglist.service.requests.ShoppingListAddItemRequest;
import com.meijer.mobile.shoppinglist.service.requests.ShoppingListItemReorderRequest;
import com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import retrofit2.Response;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001#B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\rJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0019\u0010\u0014J\u001e\u0010\u001b\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\nH\u0096@¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&¨\u0006'"}, d2 = {"LHq/e;", "LHq/c;", "LHq/d;", "shoppingListAPI", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LHq/d;LYi/a;Lmv/K;)V", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "j", "h", "shoppingListItem", "d", "(Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "b", "g", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "e", "shoppingListItems", "i", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;", "request", "c", "(Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "favoriteListItems", "a", "LHq/d;", "LYi/a;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements Hq.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Hq.d shoppingListAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$addFavoriteItemToList$2", f = "ShoppingListService.kt", l = {134, 133}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListAddItemResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13927a;

        /* renamed from: b, reason: collision with root package name */
        Object f13928b;

        /* renamed from: c, reason: collision with root package name */
        int f13929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<FavoriteListItemWireModel> f13930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f13931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<FavoriteListItemWireModel> list, e eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f13930d = list;
            this.f13931e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f13930d, this.f13931e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListAddItemResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            AddFavoriteItemsToShoppingListRequest addFavoriteItemsToShoppingListRequest;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13929c;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13928b;
                addFavoriteItemsToShoppingListRequest = (AddFavoriteItemsToShoppingListRequest) this.f13927a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                AddFavoriteItemsToShoppingListRequest addFavoriteItemsToShoppingListRequestA = AddFavoriteItemsToShoppingListRequest.INSTANCE.a(this.f13930d);
                dVar = this.f13931e.shoppingListAPI;
                Yi.a aVar = this.f13931e.authTokenProvider;
                this.f13927a = addFavoriteItemsToShoppingListRequestA;
                this.f13928b = dVar;
                this.f13929c = 1;
                Object objC = aVar.c(this);
                if (objC != objF) {
                    addFavoriteItemsToShoppingListRequest = addFavoriteItemsToShoppingListRequestA;
                    obj = objC;
                }
                return objF;
            }
            this.f13927a = addFavoriteItemsToShoppingListRequest;
            this.f13928b = null;
            this.f13929c = 2;
            Object objL = dVar.l((BearerToken) obj, addFavoriteItemsToShoppingListRequest, this);
            if (objL == objF) {
                return objF;
            }
            return objL;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$addItem$2", f = "ShoppingListService.kt", l = {107, 106}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListAddItemResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13932a;

        /* renamed from: b, reason: collision with root package name */
        int f13933b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemWireModel f13935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f13935d = shoppingListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new c(this.f13935d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListAddItemResponse> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13933b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13932a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13932a = dVar;
                this.f13933b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            ShoppingListAddItemRequest shoppingListAddItemRequest = new ShoppingListAddItemRequest(this.f13935d);
            this.f13932a = null;
            this.f13933b = 2;
            Object objB = dVar.b((BearerToken) obj, shoppingListAddItemRequest, this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$addItems$2", f = "ShoppingListService.kt", l = {116, 115}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListAddItemResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13936a;

        /* renamed from: b, reason: collision with root package name */
        int f13937b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItemWireModel> f13939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<ShoppingListItemWireModel> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f13939d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new d(this.f13939d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListAddItemResponse> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13937b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13936a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13936a = dVar;
                this.f13937b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            ShoppingListAddItemRequest shoppingListAddItemRequest = new ShoppingListAddItemRequest(this.f13939d);
            this.f13936a = null;
            this.f13937b = 2;
            Object objB = dVar.b((BearerToken) obj, shoppingListAddItemRequest, this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$completeItem$2", f = "ShoppingListService.kt", l = {77, 76}, m = "invokeSuspend")
    /* renamed from: Hq.e$e, reason: collision with other inner class name */
    static final class C0218e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13940a;

        /* renamed from: b, reason: collision with root package name */
        int f13941b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemWireModel f13943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0218e(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super C0218e> continuation) {
            super(2, continuation);
            this.f13943d = shoppingListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new C0218e(this.f13943d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((C0218e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13941b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13940a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13940a = dVar;
                this.f13941b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            long listItemId = this.f13943d.getListItemId();
            this.f13940a = null;
            this.f13941b = 2;
            Object objK = dVar.k((BearerToken) obj, listItemId, this);
            if (objK == objF) {
                return objF;
            }
            return objK;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$deleteAllItems$2", f = "ShoppingListService.kt", l = {40, 40}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13944a;

        /* renamed from: b, reason: collision with root package name */
        int f13945b;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13945b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13944a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13944a = dVar;
                this.f13945b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            Map<String, Boolean> mapK = MapsKt.k();
            this.f13944a = null;
            this.f13945b = 2;
            Object objI = dVar.i((BearerToken) obj, mapK, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$deleteCompletedItems$2", f = "ShoppingListService.kt", l = {45, 44}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13947a;

        /* renamed from: b, reason: collision with root package name */
        int f13948b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13948b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13947a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13947a = dVar;
                this.f13948b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            Map<String, Boolean> mapG = MapsKt.g(TuplesKt.a("deletecompleted", Boxing.a(true)));
            this.f13947a = null;
            this.f13948b = 2;
            Object objI = dVar.i((BearerToken) obj, mapG, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$deleteItem$2", f = "ShoppingListService.kt", l = {60, 60}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13950a;

        /* renamed from: b, reason: collision with root package name */
        int f13951b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemWireModel f13953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f13953d = shoppingListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new h(this.f13953d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13951b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13950a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13950a = dVar;
                this.f13951b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            long listItemId = this.f13953d.getListItemId();
            this.f13950a = null;
            this.f13951b = 2;
            Object objD = dVar.d((BearerToken) obj, listItemId, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$getShoppingList$2", f = "ShoppingListService.kt", l = {34, 35}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItemWireModel>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13954a;

        /* renamed from: b, reason: collision with root package name */
        int f13955b;

        /* renamed from: c, reason: collision with root package name */
        int f13956c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItemWireModel>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItemWireModel>>) continuation);
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new i(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItemWireModel>> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f13956c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f13954a
                com.meijer.mobile.authentication.core.model.BearerToken r0 = (com.meijer.mobile.authentication.core.model.BearerToken) r0
                kotlin.ResultKt.b(r5)
                goto L4c
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                kotlin.ResultKt.b(r5)
                goto L34
            L22:
                kotlin.ResultKt.b(r5)
                Hq.e r5 = Hq.e.this
                Yi.a r5 = Hq.e.l(r5)
                r4.f13956c = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L34
                goto L4b
            L34:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                if (r5 == 0) goto L56
                Hq.e r1 = Hq.e.this
                Hq.d r1 = Hq.e.m(r1)
                r4.f13954a = r5
                r3 = 0
                r4.f13955b = r3
                r4.f13956c = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                com.meijer.mobile.shoppinglist.service.responses.GetShoppingListResponse r5 = (com.meijer.mobile.shoppinglist.service.responses.GetShoppingListResponse) r5
                java.util.List r5 = r5.b()
                if (r5 != 0) goto L55
                goto L56
            L55:
                return r5
            L56:
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Hq.e.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$reorderItem$2", f = "ShoppingListService.kt", l = {124, 124}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13958a;

        /* renamed from: b, reason: collision with root package name */
        int f13959b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemReorderRequest f13961d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShoppingListItemReorderRequest shoppingListItemReorderRequest, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f13961d = shoppingListItemReorderRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new j(this.f13961d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13959b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13958a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13958a = dVar;
                this.f13959b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            ShoppingListItemReorderRequest shoppingListItemReorderRequest = this.f13961d;
            this.f13958a = null;
            this.f13959b = 2;
            Object objG = dVar.g((BearerToken) obj, shoppingListItemReorderRequest, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$uncompleteItem$2", f = "ShoppingListService.kt", l = {86, 85}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13962a;

        /* renamed from: b, reason: collision with root package name */
        int f13963b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemWireModel f13965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f13965d = shoppingListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new k(this.f13965d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Unit>> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13963b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13962a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13962a = dVar;
                this.f13963b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            long listItemId = this.f13965d.getListItemId();
            this.f13962a = null;
            this.f13963b = 2;
            Object objA = dVar.a((BearerToken) obj, listItemId, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.service.ShoppingListService$updateItem$2", f = "ShoppingListService.kt", l = {67, 66}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListItemWireModel>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f13966a;

        /* renamed from: b, reason: collision with root package name */
        int f13967b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItemWireModel f13969d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f13969d = shoppingListItemWireModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new l(this.f13969d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListItemWireModel> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            Hq.d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13967b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Hq.d) this.f13966a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                dVar = e.this.shoppingListAPI;
                Yi.a aVar = e.this.authTokenProvider;
                this.f13966a = dVar;
                this.f13967b = 1;
                obj = aVar.c(this);
                if (obj != objF) {
                }
                return objF;
            }
            Hq.d dVar2 = dVar;
            long listItemId = this.f13969d.getListItemId();
            ShoppingListItemWireModel shoppingListItemWireModel = this.f13969d;
            this.f13966a = null;
            this.f13967b = 2;
            Object objJ = dVar2.j((BearerToken) obj, listItemId, shoppingListItemWireModel, this);
            if (objJ == objF) {
                return objF;
            }
            return objJ;
        }
    }

    public e(Hq.d shoppingListAPI, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(shoppingListAPI, "shoppingListAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.shoppingListAPI = shoppingListAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // Hq.c
    public Object a(List<FavoriteListItemWireModel> list, Continuation<? super ShoppingListAddItemResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new b(list, this, null), continuation);
    }

    @Override // Hq.c
    public Object b(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new C0218e(shoppingListItemWireModel, null), continuation);
    }

    @Override // Hq.c
    public Object c(ShoppingListItemReorderRequest shoppingListItemReorderRequest, Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new j(shoppingListItemReorderRequest, null), continuation);
    }

    @Override // Hq.c
    public Object d(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new h(shoppingListItemWireModel, null), continuation);
    }

    @Override // Hq.c
    public Object e(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super ShoppingListAddItemResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new c(shoppingListItemWireModel, null), continuation);
    }

    @Override // Hq.c
    public Object f(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super ShoppingListItemWireModel> continuation) {
        return C15805i.g(this.ioDispatcher, new l(shoppingListItemWireModel, null), continuation);
    }

    @Override // Hq.c
    public Object g(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new k(shoppingListItemWireModel, null), continuation);
    }

    @Override // Hq.c
    public Object h(Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new g(null), continuation);
    }

    @Override // Hq.c
    public Object i(List<ShoppingListItemWireModel> list, Continuation<? super ShoppingListAddItemResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new d(list, null), continuation);
    }

    @Override // Hq.c
    public Object j(Continuation<? super Response<Unit>> continuation) {
        return C15805i.g(this.ioDispatcher, new f(null), continuation);
    }

    @Override // Hq.c
    public Object k(Continuation<? super List<ShoppingListItemWireModel>> continuation) {
        return C15805i.g(this.ioDispatcher, new i(null), continuation);
    }
}
