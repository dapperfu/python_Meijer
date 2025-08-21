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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.E0;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgp/a;", "Lgp/b;", "Lgp/c;", "multiProductsApi", "Lmv/K;", "ioDispatcher", "<init>", "(Lgp/c;Lmv/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upcs", "LCo/h;", "a", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgp/c;", "b", "Lmv/K;", "multi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14399a implements InterfaceC14400b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14401c multiProductsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LCo/h;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.multi.api.ConstructorMultiUpcProductDataSource$getMultiUpc$2", f = "ConstructorMultiUpcProductDataSource.kt", l = {l3.f93325e}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: gp.a$a, reason: collision with other inner class name */
    static final class C2125a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f134367a;

        /* renamed from: b, reason: collision with root package name */
        Object f134368b;

        /* renamed from: c, reason: collision with root package name */
        Object f134369c;

        /* renamed from: d, reason: collision with root package name */
        Object f134370d;

        /* renamed from: e, reason: collision with root package name */
        int f134371e;

        /* renamed from: f, reason: collision with root package name */
        int f134372f;

        /* renamed from: g, reason: collision with root package name */
        int f134373g;

        /* renamed from: h, reason: collision with root package name */
        int f134374h;

        /* renamed from: i, reason: collision with root package name */
        int f134375i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<String> f134376j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C14399a f134377k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f134378l;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2125a(List<String> list, C14399a c14399a, int i10, Continuation<? super C2125a> continuation) {
            super(2, continuation);
            this.f134376j = list;
            this.f134377k = c14399a;
            this.f134378l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2125a(this.f134376j, this.f134377k, this.f134378l, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((C2125a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            List<Result> listM;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134375i;
            try {
            } catch (Exception e10) {
                E0.i(getF143270a());
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
                List<String> list = this.f134376j;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    C14399a c14399a = this.f134377k;
                    int i11 = this.f134378l;
                    List<String> list2 = this.f134376j;
                    Result.Companion companion2 = kotlin.Result.INSTANCE;
                    InterfaceC14401c interfaceC14401c = c14399a.multiProductsApi;
                    ProductMultiRequest productMultiRequest = new ProductMultiRequest(Boxing.d(i11), list2);
                    this.f134367a = list;
                    this.f134368b = this;
                    this.f134369c = this;
                    this.f134370d = list;
                    this.f134371e = 0;
                    this.f134372f = 0;
                    this.f134373g = 0;
                    this.f134374h = 0;
                    this.f134375i = 1;
                    obj = interfaceC14401c.a(productMultiRequest, this);
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
                    int i12 = this.f134378l;
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

    public C14399a(InterfaceC14401c multiProductsApi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(multiProductsApi, "multiProductsApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.multiProductsApi = multiProductsApi;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // gp.InterfaceC14400b
    public Object a(int i10, List<String> list, Continuation<? super List<ProductFullDetails>> continuation) {
        return C15805i.g(this.ioDispatcher, new C2125a(list, this, i10, null), continuation);
    }
}
