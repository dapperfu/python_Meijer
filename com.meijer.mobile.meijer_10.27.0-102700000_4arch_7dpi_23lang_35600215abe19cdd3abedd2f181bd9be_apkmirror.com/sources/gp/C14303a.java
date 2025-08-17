package gp;

import Co.ProductFullDetails;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.service.multi.api.NoProductAvailableException;
import com.meijer.mobile.product.service.multi.api.model.ProductMultiRequest;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.search.SearchResponse;
import io.constructor.data.model.search.SearchResponseInner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgp/a;", "Lgp/b;", "Lgp/c;", "multiProductsApi", "Lqv/K;", "ioDispatcher", "<init>", "(Lgp/c;Lqv/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upcs", "LCo/h;", "a", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgp/c;", "b", "Lqv/K;", "multi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14303a implements InterfaceC14304b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14305c multiProductsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.multi.api.ConstructorMultiUpcProductDataSource$getMultiUpc$2", f = "ConstructorMultiUpcProductDataSource.kt", l = {l3.f92486e}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: gp.a$a, reason: collision with other inner class name */
    static final class C2113a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f133998a;

        /* renamed from: b, reason: collision with root package name */
        Object f133999b;

        /* renamed from: c, reason: collision with root package name */
        Object f134000c;

        /* renamed from: d, reason: collision with root package name */
        Object f134001d;

        /* renamed from: e, reason: collision with root package name */
        int f134002e;

        /* renamed from: f, reason: collision with root package name */
        int f134003f;

        /* renamed from: g, reason: collision with root package name */
        int f134004g;

        /* renamed from: h, reason: collision with root package name */
        int f134005h;

        /* renamed from: i, reason: collision with root package name */
        int f134006i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<String> f134007j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C14303a f134008k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f134009l;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2113a(List<String> list, C14303a c14303a, int i10, Continuation<? super C2113a> continuation) {
            super(2, continuation);
            this.f134007j = list;
            this.f134008k = c14303a;
            this.f134009l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2113a(this.f134007j, this.f134008k, this.f134009l, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((C2113a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            List<Result> listM;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134006i;
            try {
            } catch (Exception e10) {
                E0.i(getF142363a());
                Result.Companion companion = kotlin.Result.INSTANCE;
                objB = kotlin.Result.b(ResultKt.a(e10));
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                List<String> list = this.f134007j;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    C14303a c14303a = this.f134008k;
                    int i11 = this.f134009l;
                    List<String> list2 = this.f134007j;
                    Result.Companion companion2 = kotlin.Result.INSTANCE;
                    InterfaceC14305c interfaceC14305c = c14303a.multiProductsApi;
                    ProductMultiRequest productMultiRequest = new ProductMultiRequest(Boxing.d(i11), list2);
                    this.f133998a = list;
                    this.f133999b = this;
                    this.f134000c = this;
                    this.f134001d = list;
                    this.f134002e = 0;
                    this.f134003f = 0;
                    this.f134004g = 0;
                    this.f134005h = 0;
                    this.f134006i = 1;
                    obj = interfaceC14305c.a(productMultiRequest, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return CollectionsKt.m();
            }
            Response response = (Response) obj;
            if (response.code() != 204) {
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.g(objBody);
                    objB = kotlin.Result.b((SearchResponse) objBody);
                    int i12 = this.f134009l;
                    if (kotlin.Result.h(objB)) {
                        SearchResponseInner response2 = ((SearchResponse) objB).getResponse();
                        if (response2 != null) {
                            listM = response2.getResults();
                        } else {
                            listM = null;
                        }
                        if (listM == null) {
                            listM = CollectionsKt.m();
                        }
                        List<io.constructor.data.model.common.Result> list3 = listM;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Bo.c.c((io.constructor.data.model.common.Result) it.next(), i12, null, 2, null));
                        }
                        objB2 = kotlin.Result.b(arrayList);
                    } else {
                        objB2 = kotlin.Result.b(objB);
                    }
                    ResultKt.b(objB2);
                    List list4 = (List) objB2;
                    if (list4 != null) {
                        return list4;
                    }
                    return CollectionsKt.m();
                }
                throw new HttpException(response);
            }
            String strMessage = response.message();
            Intrinsics.i(strMessage, "message(...)");
            throw new NoProductAvailableException(strMessage);
        }
    }

    public C14303a(InterfaceC14305c multiProductsApi, AbstractC16618K ioDispatcher) {
        Intrinsics.j(multiProductsApi, "multiProductsApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.multiProductsApi = multiProductsApi;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // gp.InterfaceC14304b
    public Object a(int i10, List<String> list, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new C2113a(list, this, i10, null), continuation);
    }
}
