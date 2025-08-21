package Tk;

import Xk.ProductComplexPromo;
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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.E0;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"LTk/a;", "", "LUk/a;", "complexPromoApi", "Lmv/K;", "ioDispatcher", "<init>", "(LUk/a;Lmv/K;)V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LXk/a;", "b", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LUk/a;", "Lmv/K;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uk.a complexPromoApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LXk/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.coupon.service.complexpromos.ComplexPromoDataSource$getComplexPromos$2", f = "ComplexPromoDataSource.kt", l = {38}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Tk.a$a, reason: collision with other inner class name */
    static final class C0802a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductComplexPromo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f36423a;

        /* renamed from: b, reason: collision with root package name */
        Object f36424b;

        /* renamed from: c, reason: collision with root package name */
        Object f36425c;

        /* renamed from: d, reason: collision with root package name */
        Object f36426d;

        /* renamed from: e, reason: collision with root package name */
        int f36427e;

        /* renamed from: f, reason: collision with root package name */
        int f36428f;

        /* renamed from: g, reason: collision with root package name */
        int f36429g;

        /* renamed from: h, reason: collision with root package name */
        int f36430h;

        /* renamed from: i, reason: collision with root package name */
        int f36431i;

        /* renamed from: j, reason: collision with root package name */
        int f36432j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f36433k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f36435m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f36436n;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductComplexPromo>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductComplexPromo>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0802a(String str, int i10, Continuation<? super C0802a> continuation) {
            super(2, continuation);
            this.f36435m = str;
            this.f36436n = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0802a c0802a = a.this.new C0802a(this.f36435m, this.f36436n, continuation);
            c0802a.f36433k = obj;
            return c0802a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductComplexPromo>> continuation) {
            return ((C0802a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            int i10;
            Response response;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f36432j;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        i10 = this.f36427e;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f36433k;
                    a aVar = a.this;
                    String str = this.f36435m;
                    int i12 = this.f36436n;
                    Result.Companion companion = Result.INSTANCE;
                    Uk.a aVar2 = aVar.complexPromoApi;
                    this.f36433k = interfaceC15783O;
                    this.f36423a = interfaceC15783O;
                    this.f36424b = this;
                    this.f36425c = this;
                    this.f36426d = interfaceC15783O;
                    this.f36427e = i12;
                    this.f36428f = 0;
                    this.f36429g = 0;
                    this.f36430h = 0;
                    this.f36431i = 0;
                    this.f36432j = 1;
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
                    arrayList.add(Vk.a.a((ProductComplexPromoJson) it.next(), i10));
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

    public a(Uk.a complexPromoApi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(complexPromoApi, "complexPromoApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.complexPromoApi = complexPromoApi;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object b(String str, int i10, Continuation<? super List<ProductComplexPromo>> continuation) {
        return C15805i.g(this.ioDispatcher, new C0802a(str, i10, null), continuation);
    }
}
