package Sk;

import Wk.ProductComplexPromo;
import com.meijer.mobile.coupon.service.complexpromos.api.models.ProductComplexPromoJson;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"LSk/a;", "", "LTk/a;", "complexPromoApi", "Lqv/K;", "ioDispatcher", "<init>", "(LTk/a;Lqv/K;)V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LWk/a;", "b", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LTk/a;", "Lqv/K;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tk.a complexPromoApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LWk/a;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.service.complexpromos.ComplexPromoDataSource$getComplexPromos$2", f = "ComplexPromoDataSource.kt", l = {38}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Sk.a$a, reason: collision with other inner class name */
    static final class C0759a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductComplexPromo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f33826a;

        /* renamed from: b, reason: collision with root package name */
        Object f33827b;

        /* renamed from: c, reason: collision with root package name */
        Object f33828c;

        /* renamed from: d, reason: collision with root package name */
        Object f33829d;

        /* renamed from: e, reason: collision with root package name */
        int f33830e;

        /* renamed from: f, reason: collision with root package name */
        int f33831f;

        /* renamed from: g, reason: collision with root package name */
        int f33832g;

        /* renamed from: h, reason: collision with root package name */
        int f33833h;

        /* renamed from: i, reason: collision with root package name */
        int f33834i;

        /* renamed from: j, reason: collision with root package name */
        int f33835j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f33836k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f33838m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f33839n;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductComplexPromo>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductComplexPromo>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0759a(String str, int i10, Continuation<? super C0759a> continuation) {
            super(2, continuation);
            this.f33838m = str;
            this.f33839n = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0759a c0759a = a.this.new C0759a(this.f33838m, this.f33839n, continuation);
            c0759a.f33836k = obj;
            return c0759a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductComplexPromo>> continuation) {
            return ((C0759a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            int i10;
            Response response;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f33835j;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        i10 = this.f33830e;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f33836k;
                    a aVar = a.this;
                    String str = this.f33838m;
                    int i12 = this.f33839n;
                    Result.Companion companion = Result.INSTANCE;
                    Tk.a aVar2 = aVar.complexPromoApi;
                    this.f33836k = interfaceC16622O;
                    this.f33826a = interfaceC16622O;
                    this.f33827b = this;
                    this.f33828c = this;
                    this.f33829d = interfaceC16622O;
                    this.f33830e = i12;
                    this.f33831f = 0;
                    this.f33832g = 0;
                    this.f33833h = 0;
                    this.f33834i = 0;
                    this.f33835j = 1;
                    obj = aVar2.a(str, i12, this);
                    if (obj == objF) {
                        return objF;
                    }
                    i10 = i12;
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
                Iterable iterable = (Iterable) objBody;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uk.a.a((ProductComplexPromoJson) it.next(), i10));
                }
                objB = Result.b(arrayList);
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    try {
                        if ((thE instanceof HttpException) && ((HttpException) thE).code() == 404) {
                            objB = Result.b(CollectionsKt.m());
                        } else {
                            throw thE;
                        }
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objB = Result.b(ResultKt.a(th2));
                    }
                }
                ResultKt.b(objB);
                return objB;
            }
            throw new HttpException(response);
        }
    }

    public a(Tk.a complexPromoApi, AbstractC16618K ioDispatcher) {
        Intrinsics.j(complexPromoApi, "complexPromoApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.complexPromoApi = complexPromoApi;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object b(String str, int i10, Continuation<? super List<ProductComplexPromo>> continuation) {
        return C16644i.g(this.ioDispatcher, new C0759a(str, i10, null), continuation);
    }
}
