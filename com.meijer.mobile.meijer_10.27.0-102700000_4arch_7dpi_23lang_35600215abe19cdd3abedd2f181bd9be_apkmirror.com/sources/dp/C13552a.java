package dp;

import Co.Department;
import Co.ProductFullDetails;
import com.meijer.mobile.product.model.hybris.api.models.HybrisDepartment;
import ei.InterfaceC13669f;
import ep.InterfaceC13720a;
import ep.InterfaceC13721b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;
import yl.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0001\u001aB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0015\u001a\u00020\u00142\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Ldp/a;", "", "Lep/b;", "productsOccApi", "Lep/a;", "departmentTiersApi", "Lyl/k;", "featureManager", "Lei/f;", "experienceCloudIdProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lep/b;Lep/a;Lyl/k;Lei/f;Lqv/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "f", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCo/b;", "e", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lep/b;", "b", "Lep/a;", "c", "Lyl/k;", "d", "Lei/f;", "Lqv/K;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13552a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13721b productsOccApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13720a departmentTiersApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13669f experienceCloudIdProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LCo/b;", "<anonymous>", "(Lqv/O;)LCo/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.hybris.HybrisProductDataSource$getDepartmentTiers$2", f = "HybrisProductDataSource.kt", l = {53}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: dp.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Department>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127484a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f127486c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f127486c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13552a.this.new b(this.f127486c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Department> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f127484a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13720a interfaceC13720a = C13552a.this.departmentTiersApi;
                int i11 = this.f127486c;
                this.f127484a = 1;
                obj = interfaceC13720a.a(i11, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                HybrisDepartment hybrisDepartment = (HybrisDepartment) response.body();
                if (hybrisDepartment == null) {
                    return null;
                }
                return Io.b.b(hybrisDepartment, null, 1, null);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LCo/h;", "<anonymous>", "(Lqv/O;)LCo/h;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.hybris.HybrisProductDataSource$getProductDetails$2", f = "HybrisProductDataSource.kt", l = {45, 41}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: dp.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ProductFullDetails>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f127487a;

        /* renamed from: b, reason: collision with root package name */
        Object f127488b;

        /* renamed from: c, reason: collision with root package name */
        int f127489c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f127491e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f127492f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f127491e = str;
            this.f127492f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13552a.this.new c(this.f127491e, this.f127492f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ProductFullDetails> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            if (r0 == r11) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r75) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dp.C13552a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13552a(InterfaceC13721b productsOccApi, InterfaceC13720a departmentTiersApi, k featureManager, InterfaceC13669f experienceCloudIdProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(productsOccApi, "productsOccApi");
        Intrinsics.j(departmentTiersApi, "departmentTiersApi");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(experienceCloudIdProvider, "experienceCloudIdProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsOccApi = productsOccApi;
        this.departmentTiersApi = departmentTiersApi;
        this.featureManager = featureManager;
        this.experienceCloudIdProvider = experienceCloudIdProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object e(int i10, Continuation<? super Department> continuation) {
        return C16644i.g(this.ioDispatcher, new b(i10, null), continuation);
    }

    public final Object f(int i10, String str, Continuation<? super ProductFullDetails> continuation) {
        return C16644i.g(this.ioDispatcher, new c(str, i10, null), continuation);
    }
}
