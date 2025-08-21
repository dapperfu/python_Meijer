package Ui;

import Eh.AccountAddress;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import requests.TaxAreaLookup;
import requests.TaxAreaRequest;
import requests.VertexRequest;
import responses.PostalAddress;
import responses.TaxAreaResponse;
import responses.TaxAreaResult;
import responses.VertexResponse;
import retrofit2.HttpException;
import retrofit2.Response;
import uk.c;
import uk.e;
import wk.C17898a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LUi/d;", "", "LUi/a;", "addressApi", "Lmv/K;", "ioDispatcher", "<init>", "(LUi/a;Lmv/K;)V", "Lretrofit2/Response;", "Lresponses/VertexResponse;", "response", "Lresponses/PostalAddress;", "f", "(Lretrofit2/Response;)Lresponses/PostalAddress;", "LEh/a;", "Lrequests/VertexRequest;", "j", "(LEh/a;)Lrequests/VertexRequest;", "accountAddress", "i", "(LEh/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LUi/a;", "b", "Lmv/K;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ui.a addressApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lresponses/PostalAddress;", "<anonymous>", "(Lmv/O;)Lresponses/PostalAddress;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.api.AddressRepository$formatAddress$2", f = "AddressRepository.kt", l = {45}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super PostalAddress>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f37558a;

        /* renamed from: b, reason: collision with root package name */
        Object f37559b;

        /* renamed from: c, reason: collision with root package name */
        int f37560c;

        /* renamed from: d, reason: collision with root package name */
        int f37561d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f37562e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AccountAddress f37564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AccountAddress accountAddress, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37564g = accountAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(this.f37564g, continuation);
            aVar.f37562e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super PostalAddress> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            d dVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f37561d;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        dVar = (d) this.f37559b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f37562e;
                    d dVar2 = d.this;
                    AccountAddress accountAddress = this.f37564g;
                    Result.Companion companion = Result.INSTANCE;
                    Ui.a aVar = dVar2.addressApi;
                    VertexRequest vertexRequestJ = dVar2.j(accountAddress);
                    this.f37562e = interfaceC15783O;
                    this.f37558a = interfaceC15783O;
                    this.f37559b = dVar2;
                    this.f37560c = 0;
                    this.f37561d = 1;
                    obj = aVar.a(vertexRequestJ, this);
                    if (obj == objF) {
                        return objF;
                    }
                    dVar = dVar2;
                }
                objB = Result.b(dVar.f((Response) obj));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.e(thE);
            }
            ResultKt.b(objB);
            return objB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable h(Throwable th2) {
        return th2;
    }

    public d(Ui.a addressApi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(addressApi, "addressApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.addressApi = addressApi;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostalAddress f(final Response<VertexResponse> response) throws Throwable {
        PostalAddress postalAddress;
        String city;
        String mainDivision;
        String postalCode;
        PostalAddress postalAddress2 = null;
        uk.c cVarB = e.b(c.Companion.c(uk.c.INSTANCE, null, null, new Function0() { // from class: Ui.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.g(response);
            }
        }, 3, null), new Function1() { // from class: Ui.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.h((Throwable) obj);
            }
        });
        TaxAreaResult taxAreaResult = (TaxAreaResult) cVarB.a();
        if ((taxAreaResult != null ? taxAreaResult.getAddressCleansingResultMessage() : null) != null) {
            qw.a.INSTANCE.d("No address match found", new Object[0]);
            return null;
        }
        TaxAreaResult taxAreaResult2 = (TaxAreaResult) cVarB.a();
        if (taxAreaResult2 != null && (postalAddress = taxAreaResult2.getPostalAddress()) != null) {
            String streetAddress1 = postalAddress.getStreetAddress1();
            if (streetAddress1 != null && !StringsKt.s0(streetAddress1) && (city = postalAddress.getCity()) != null && !StringsKt.s0(city) && (mainDivision = postalAddress.getMainDivision()) != null && !StringsKt.s0(mainDivision) && (postalCode = postalAddress.getPostalCode()) != null && !StringsKt.s0(postalCode)) {
                postalAddress2 = postalAddress;
            }
            if (postalAddress2 != null) {
                return postalAddress2;
            }
        }
        throw new IllegalStateException("Malformed or null PostalAddress returned!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VertexRequest j(AccountAddress accountAddress) {
        return new VertexRequest(new TaxAreaRequest(new TaxAreaLookup(LocalDate.now().format(C17898a.ISO_LOCAL_DATE), "", new PostalAddress(accountAddress.getAddressLine1(), null, accountAddress.getCity(), accountAddress.getState(), null, accountAddress.getZipCode(), null, 82, null))));
    }

    public final Object i(AccountAddress accountAddress, Continuation<? super PostalAddress> continuation) {
        return C15805i.g(this.ioDispatcher, new a(accountAddress, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxAreaResult g(Response response) {
        TaxAreaResponse taxAreaResponse;
        if (response.isSuccessful()) {
            VertexResponse vertexResponse = (VertexResponse) response.body();
            if (vertexResponse != null && (taxAreaResponse = vertexResponse.getTaxAreaResponse()) != null) {
                return taxAreaResponse.getTaxAreaResult();
            }
            return null;
        }
        throw new HttpException(response);
    }
}
