package Rl;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import nm.C15887a;
import om.C16103e;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00112\u0006\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020!H\u0096@¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020'H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\n\u0010\u000f\u001a\u00060\u000ej\u0002`-H\u0096@¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00105¨\u00066"}, d2 = {"LRl/b;", "LRl/a;", "LMl/a;", "greenvilleDataSource", "LMl/b;", "picklistDataSource", "Lom/e;", "productImagesDataSource", "Lnm/a;", "couponDataSource", "<init>", "(LMl/a;LMl/b;Lom/e;Lnm/a;)V", "", "barcode", "", "storeId", "storeZip", "Lkotlin/Result;", "LOk/a;", "n", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upc", "Lpm/a;", "p", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "request", "LOl/e;", "b", "(Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "a", "(Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "d", "(Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "c", "(Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "g", "(Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "e", "(Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/model/common/StoreId;", "", "LOl/d;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMl/a;", "LMl/b;", "Lom/e;", "Lnm/a;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b implements Rl.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ml.a greenvilleDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ml.b picklistDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C16103e productImagesDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15887a couponDataSource;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {73, 74, 79}, m = "addItem")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32276a;

        /* renamed from: b, reason: collision with root package name */
        Object f32277b;

        /* renamed from: c, reason: collision with root package name */
        Object f32278c;

        /* renamed from: d, reason: collision with root package name */
        Object f32279d;

        /* renamed from: e, reason: collision with root package name */
        Object f32280e;

        /* renamed from: f, reason: collision with root package name */
        Object f32281f;

        /* renamed from: g, reason: collision with root package name */
        Object f32282g;

        /* renamed from: h, reason: collision with root package name */
        Object f32283h;

        /* renamed from: i, reason: collision with root package name */
        Object f32284i;

        /* renamed from: j, reason: collision with root package name */
        int f32285j;

        /* renamed from: k, reason: collision with root package name */
        int f32286k;

        /* renamed from: l, reason: collision with root package name */
        int f32287l;

        /* renamed from: m, reason: collision with root package name */
        int f32288m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f32289n;

        /* renamed from: p, reason: collision with root package name */
        int f32291p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32289n = obj;
            this.f32291p |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {63}, m = "cancelTrip")
    /* renamed from: Rl.b$b, reason: collision with other inner class name */
    static final class C0724b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32292a;

        /* renamed from: b, reason: collision with root package name */
        Object f32293b;

        /* renamed from: c, reason: collision with root package name */
        Object f32294c;

        /* renamed from: d, reason: collision with root package name */
        Object f32295d;

        /* renamed from: e, reason: collision with root package name */
        Object f32296e;

        /* renamed from: f, reason: collision with root package name */
        int f32297f;

        /* renamed from: g, reason: collision with root package name */
        int f32298g;

        /* renamed from: h, reason: collision with root package name */
        int f32299h;

        /* renamed from: i, reason: collision with root package name */
        int f32300i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32301j;

        /* renamed from: l, reason: collision with root package name */
        int f32303l;

        C0724b(Continuation<? super C0724b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32301j = obj;
            this.f32303l |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {161}, m = "getCoupon-BWLJW6A")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32304a;

        /* renamed from: b, reason: collision with root package name */
        Object f32305b;

        /* renamed from: c, reason: collision with root package name */
        Object f32306c;

        /* renamed from: d, reason: collision with root package name */
        Object f32307d;

        /* renamed from: e, reason: collision with root package name */
        Object f32308e;

        /* renamed from: f, reason: collision with root package name */
        Object f32309f;

        /* renamed from: g, reason: collision with root package name */
        Object f32310g;

        /* renamed from: h, reason: collision with root package name */
        Object f32311h;

        /* renamed from: i, reason: collision with root package name */
        int f32312i;

        /* renamed from: j, reason: collision with root package name */
        int f32313j;

        /* renamed from: k, reason: collision with root package name */
        int f32314k;

        /* renamed from: l, reason: collision with root package name */
        int f32315l;

        /* renamed from: m, reason: collision with root package name */
        int f32316m;

        /* renamed from: n, reason: collision with root package name */
        int f32317n;

        /* renamed from: o, reason: collision with root package name */
        int f32318o;

        /* renamed from: p, reason: collision with root package name */
        long f32319p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f32320q;

        /* renamed from: s, reason: collision with root package name */
        int f32322s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32320q = obj;
            this.f32322s |= Integer.MIN_VALUE;
            Object objN = b.this.n(null, 0, null, this);
            return objN == IntrinsicsKt.f() ? objN : Result.a(objN);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {137}, m = "getPickList")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f32323a;

        /* renamed from: b, reason: collision with root package name */
        int f32324b;

        /* renamed from: c, reason: collision with root package name */
        int f32325c;

        /* renamed from: d, reason: collision with root package name */
        int f32326d;

        /* renamed from: e, reason: collision with root package name */
        int f32327e;

        /* renamed from: f, reason: collision with root package name */
        Object f32328f;

        /* renamed from: g, reason: collision with root package name */
        Object f32329g;

        /* renamed from: h, reason: collision with root package name */
        Object f32330h;

        /* renamed from: i, reason: collision with root package name */
        Object f32331i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32332j;

        /* renamed from: l, reason: collision with root package name */
        int f32334l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32332j = obj;
            this.f32334l |= Integer.MIN_VALUE;
            return b.this.f(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {HttpResponseStatus.SUCCESS_ACCEPTED}, m = "getProductImageUrl-gIAlu-s")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32335a;

        /* renamed from: b, reason: collision with root package name */
        Object f32336b;

        /* renamed from: c, reason: collision with root package name */
        Object f32337c;

        /* renamed from: d, reason: collision with root package name */
        Object f32338d;

        /* renamed from: e, reason: collision with root package name */
        Object f32339e;

        /* renamed from: f, reason: collision with root package name */
        int f32340f;

        /* renamed from: g, reason: collision with root package name */
        int f32341g;

        /* renamed from: h, reason: collision with root package name */
        int f32342h;

        /* renamed from: i, reason: collision with root package name */
        int f32343i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32344j;

        /* renamed from: l, reason: collision with root package name */
        int f32346l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32344j = obj;
            this.f32346l |= Integer.MIN_VALUE;
            Object objP = b.this.p(null, this);
            return objP == IntrinsicsKt.f() ? objP : Result.a(objP);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {178}, m = "getProductImageUrl_gIAlu_s$getEDaAProductImage")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32347a;

        /* renamed from: b, reason: collision with root package name */
        Object f32348b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32349c;

        /* renamed from: d, reason: collision with root package name */
        int f32350d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32349c = obj;
            this.f32350d |= Integer.MIN_VALUE;
            return b.q(null, null, this);
        }

        f(Continuation<? super f> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {118}, m = "removeItem")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32351a;

        /* renamed from: b, reason: collision with root package name */
        Object f32352b;

        /* renamed from: c, reason: collision with root package name */
        Object f32353c;

        /* renamed from: d, reason: collision with root package name */
        Object f32354d;

        /* renamed from: e, reason: collision with root package name */
        Object f32355e;

        /* renamed from: f, reason: collision with root package name */
        int f32356f;

        /* renamed from: g, reason: collision with root package name */
        int f32357g;

        /* renamed from: h, reason: collision with root package name */
        int f32358h;

        /* renamed from: i, reason: collision with root package name */
        int f32359i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32360j;

        /* renamed from: l, reason: collision with root package name */
        int f32362l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32360j = obj;
            this.f32362l |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {55}, m = "startTrip")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32363a;

        /* renamed from: b, reason: collision with root package name */
        Object f32364b;

        /* renamed from: c, reason: collision with root package name */
        Object f32365c;

        /* renamed from: d, reason: collision with root package name */
        Object f32366d;

        /* renamed from: e, reason: collision with root package name */
        Object f32367e;

        /* renamed from: f, reason: collision with root package name */
        int f32368f;

        /* renamed from: g, reason: collision with root package name */
        int f32369g;

        /* renamed from: h, reason: collision with root package name */
        int f32370h;

        /* renamed from: i, reason: collision with root package name */
        int f32371i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32372j;

        /* renamed from: l, reason: collision with root package name */
        int f32374l;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32372j = obj;
            this.f32374l |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {47}, m = "transferStatus")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32375a;

        /* renamed from: b, reason: collision with root package name */
        Object f32376b;

        /* renamed from: c, reason: collision with root package name */
        Object f32377c;

        /* renamed from: d, reason: collision with root package name */
        Object f32378d;

        /* renamed from: e, reason: collision with root package name */
        Object f32379e;

        /* renamed from: f, reason: collision with root package name */
        int f32380f;

        /* renamed from: g, reason: collision with root package name */
        int f32381g;

        /* renamed from: h, reason: collision with root package name */
        int f32382h;

        /* renamed from: i, reason: collision with root package name */
        int f32383i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32384j;

        /* renamed from: l, reason: collision with root package name */
        int f32386l;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32384j = obj;
            this.f32386l |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {99}, m = "updateItem")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32387a;

        /* renamed from: b, reason: collision with root package name */
        Object f32388b;

        /* renamed from: c, reason: collision with root package name */
        Object f32389c;

        /* renamed from: d, reason: collision with root package name */
        Object f32390d;

        /* renamed from: e, reason: collision with root package name */
        Object f32391e;

        /* renamed from: f, reason: collision with root package name */
        int f32392f;

        /* renamed from: g, reason: collision with root package name */
        int f32393g;

        /* renamed from: h, reason: collision with root package name */
        int f32394h;

        /* renamed from: i, reason: collision with root package name */
        int f32395i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f32396j;

        /* renamed from: l, reason: collision with root package name */
        int f32398l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32396j = obj;
            this.f32398l |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    private static final String o(String str) {
        if (!StringsKt.W(str, "2", false, 2, null)) {
            String strSubstring = str.substring(0, StringsKt.j0(str));
            Intrinsics.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, 6);
        Intrinsics.i(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        sb2.append("00000");
        return sb2.toString();
    }

    public b(Ml.a greenvilleDataSource, Ml.b picklistDataSource, C16103e productImagesDataSource, C15887a couponDataSource) {
        Intrinsics.j(greenvilleDataSource, "greenvilleDataSource");
        Intrinsics.j(picklistDataSource, "picklistDataSource");
        Intrinsics.j(productImagesDataSource, "productImagesDataSource");
        Intrinsics.j(couponDataSource, "couponDataSource");
        this.greenvilleDataSource = greenvilleDataSource;
        this.picklistDataSource = picklistDataSource;
        this.productImagesDataSource = productImagesDataSource;
        this.couponDataSource = couponDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r29, int r30, java.lang.String r31, kotlin.coroutines.Continuation<? super kotlin.Result<Ok.Coupon>> r32) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.n(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, kotlin.coroutines.Continuation<? super kotlin.Result<pm.ProductImage>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Rl.b.e
            if (r0 == 0) goto L13
            r0 = r6
            Rl.b$e r0 = (Rl.b.e) r0
            int r1 = r0.f32346l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32346l = r1
            goto L18
        L13:
            Rl.b$e r0 = new Rl.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32344j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32346l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f32339e
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32338d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32337c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32336b
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32335a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L68
        L3d:
            r5 = move-exception
            goto L6d
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            r0.f32335a = r5     // Catch: java.lang.Exception -> L3d
            r0.f32336b = r4     // Catch: java.lang.Exception -> L3d
            r0.f32337c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32338d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32339e = r4     // Catch: java.lang.Exception -> L3d
            r6 = 0
            r0.f32340f = r6     // Catch: java.lang.Exception -> L3d
            r0.f32341g = r6     // Catch: java.lang.Exception -> L3d
            r0.f32342h = r6     // Catch: java.lang.Exception -> L3d
            r0.f32343i = r6     // Catch: java.lang.Exception -> L3d
            r0.f32346l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = m(r4, r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L6d:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.p(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(Rl.b r5, java.lang.String r6, kotlin.coroutines.Continuation<? super pm.ProductImage> r7) {
        /*
            boolean r0 = r7 instanceof Rl.b.f
            if (r0 == 0) goto L13
            r0 = r7
            Rl.b$f r0 = (Rl.b.f) r0
            int r1 = r0.f32350d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32350d = r1
            goto L18
        L13:
            Rl.b$f r0 = new Rl.b$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32349c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32350d
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f32348b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f32347a
            Rl.b r5 = (Rl.b) r5
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.getValue()
            goto L5e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.b(r7)
            om.e r7 = r5.productImagesDataSource
            com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest r2 = new com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest
            java.lang.String r4 = s(r6)
            java.util.List r4 = kotlin.collections.CollectionsKt.e(r4)
            r2.<init>(r4)
            r0.f32347a = r5
            r0.f32348b = r6
            r0.f32350d = r3
            java.lang.Object r5 = r7.c(r2, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            kotlin.ResultKt.b(r5)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = kotlin.collections.CollectionsKt.u0(r5)
            com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse r5 = (com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse) r5
            if (r5 == 0) goto L8e
            java.util.List r5 = r5.j()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = kotlin.collections.CollectionsKt.u0(r5)
            com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse$ItemDocument r5 = (com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse.ItemDocument) r5
            if (r5 == 0) goto L8e
            java.lang.String r5 = r5.getItemDocumentValue()
            if (r5 == 0) goto L8e
            r6 = 115(0x73, float:1.61E-43)
            r7 = 4
            java.lang.String r5 = r(r5, r6, r7)
            if (r5 == 0) goto L8e
            pm.a r6 = new pm.a
            r6.<init>(r5)
            return r6
        L8e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.q(Rl.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final String r(String str, char c10, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.insert(i10, c10);
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r5, kotlin.coroutines.Continuation<? super Ol.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Rl.b.h
            if (r0 == 0) goto L13
            r0 = r6
            Rl.b$h r0 = (Rl.b.h) r0
            int r1 = r0.f32374l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32374l = r1
            goto L18
        L13:
            Rl.b$h r0 = new Rl.b$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32372j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32374l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f32367e
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32366d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32365c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32364b
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32363a
            com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r5 = (com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L6c
        L3d:
            r5 = move-exception
            goto L71
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ml.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f32363a = r5     // Catch: java.lang.Exception -> L3d
            r0.f32364b = r4     // Catch: java.lang.Exception -> L3d
            r0.f32365c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32366d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32367e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f32368f = r2     // Catch: java.lang.Exception -> L3d
            r0.f32369g = r2     // Catch: java.lang.Exception -> L3d
            r0.f32370h = r2     // Catch: java.lang.Exception -> L3d
            r0.f32371i = r2     // Catch: java.lang.Exception -> L3d
            r0.f32374l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.f(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Ol.e r5 = Pl.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.a(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r5, kotlin.coroutines.Continuation<? super Ol.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Rl.b.i
            if (r0 == 0) goto L13
            r0 = r6
            Rl.b$i r0 = (Rl.b.i) r0
            int r1 = r0.f32386l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32386l = r1
            goto L18
        L13:
            Rl.b$i r0 = new Rl.b$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32384j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32386l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f32379e
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32378d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32377c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32376b
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32375a
            com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r5 = (com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L6c
        L3d:
            r5 = move-exception
            goto L71
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ml.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f32375a = r5     // Catch: java.lang.Exception -> L3d
            r0.f32376b = r4     // Catch: java.lang.Exception -> L3d
            r0.f32377c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32378d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32379e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f32380f = r2     // Catch: java.lang.Exception -> L3d
            r0.f32381g = r2     // Catch: java.lang.Exception -> L3d
            r0.f32382h = r2     // Catch: java.lang.Exception -> L3d
            r0.f32383i = r2     // Catch: java.lang.Exception -> L3d
            r0.f32386l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.g(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Ol.e r5 = Pl.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.b(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r19, kotlin.coroutines.Continuation<? super Ol.Transaction> r20) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r5, kotlin.coroutines.Continuation<? super Ol.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Rl.b.C0724b
            if (r0 == 0) goto L13
            r0 = r6
            Rl.b$b r0 = (Rl.b.C0724b) r0
            int r1 = r0.f32303l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32303l = r1
            goto L18
        L13:
            Rl.b$b r0 = new Rl.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32301j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32303l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f32296e
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32295d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32294c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32293b
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32292a
            com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r5 = (com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L6c
        L3d:
            r5 = move-exception
            goto L71
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ml.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f32292a = r5     // Catch: java.lang.Exception -> L3d
            r0.f32293b = r4     // Catch: java.lang.Exception -> L3d
            r0.f32294c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32295d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32296e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f32297f = r2     // Catch: java.lang.Exception -> L3d
            r0.f32298g = r2     // Catch: java.lang.Exception -> L3d
            r0.f32299h = r2     // Catch: java.lang.Exception -> L3d
            r0.f32300i = r2     // Catch: java.lang.Exception -> L3d
            r0.f32303l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.d(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Ol.e r5 = Pl.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r7, kotlin.coroutines.Continuation<? super Ol.Transaction> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Rl.b.g
            if (r0 == 0) goto L13
            r0 = r8
            Rl.b$g r0 = (Rl.b.g) r0
            int r1 = r0.f32362l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32362l = r1
            goto L18
        L13:
            Rl.b$g r0 = new Rl.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32360j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32362l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f32355e
            Rl.b r7 = (Rl.b) r7
            java.lang.Object r7 = r0.f32354d
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f32353c
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f32352b
            Rl.b r7 = (Rl.b) r7
            java.lang.Object r7 = r0.f32351a
            com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r7 = (com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L6c
        L3d:
            r7 = move-exception
            goto L71
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ml.a r8 = j(r6)     // Catch: java.lang.Exception -> L3d
            r0.f32351a = r7     // Catch: java.lang.Exception -> L3d
            r0.f32352b = r6     // Catch: java.lang.Exception -> L3d
            r0.f32353c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32354d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32355e = r6     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f32356f = r2     // Catch: java.lang.Exception -> L3d
            r0.f32357g = r2     // Catch: java.lang.Exception -> L3d
            r0.f32358h = r2     // Catch: java.lang.Exception -> L3d
            r0.f32359i = r2     // Catch: java.lang.Exception -> L3d
            r0.f32362l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.e(r7, r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            qv.E0.i(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L82:
            boolean r8 = kotlin.Result.h(r7)
            r0 = 0
            if (r8 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r7 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r7
            r8 = 3
            Ol.e r7 = Pl.a.e(r7, r0, r0, r8, r0)
        L90:
            java.lang.Object r7 = kotlin.Result.b(r7)
            java.lang.Throwable r8 = kotlin.Result.e(r7)
            if (r8 != 0) goto L9b
            goto Lbb
        L9b:
            Ol.e r7 = new Ol.e
            Ol.c$a r1 = Ol.Header.INSTANCE
            Ol.c r1 = r1.a()
            Ol.a r2 = Ol.b.a()
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
            com.meijer.mobile.greenville.model.domain.TransactionException$ItemException r4 = new com.meijer.mobile.greenville.model.domain.TransactionException$ItemException
            java.lang.String r5 = r8.getMessage()
            r4.<init>(r0, r5, r8)
            r7.<init>(r1, r2, r3, r4)
            java.lang.Object r7 = kotlin.Result.b(r7)
        Lbb:
            kotlin.ResultKt.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r5, kotlin.coroutines.Continuation<? super java.util.List<Ol.PicklistItem>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Rl.b.d
            if (r0 == 0) goto L13
            r0 = r6
            Rl.b$d r0 = (Rl.b.d) r0
            int r1 = r0.f32334l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32334l = r1
            goto L18
        L13:
            Rl.b$d r0 = new Rl.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32332j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32334l
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.f32331i
            Rl.b r5 = (Rl.b) r5
            java.lang.Object r5 = r0.f32330h
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32329g
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f32328f
            Rl.b r5 = (Rl.b) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L39
            goto L68
        L39:
            r5 = move-exception
            goto L6d
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            Ml.b r6 = k(r4)     // Catch: java.lang.Exception -> L39
            r0.f32328f = r4     // Catch: java.lang.Exception -> L39
            r0.f32329g = r0     // Catch: java.lang.Exception -> L39
            r0.f32330h = r0     // Catch: java.lang.Exception -> L39
            r0.f32331i = r4     // Catch: java.lang.Exception -> L39
            r0.f32323a = r5     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f32324b = r2     // Catch: java.lang.Exception -> L39
            r0.f32325c = r2     // Catch: java.lang.Exception -> L39
            r0.f32326d = r2     // Catch: java.lang.Exception -> L39
            r0.f32327e = r2     // Catch: java.lang.Exception -> L39
            r0.f32334l = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.c(r5, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L39
            goto L7e
        L6d:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L7e:
            java.util.List r6 = kotlin.collections.CollectionsKt.m()
            boolean r0 = kotlin.Result.g(r5)
            if (r0 == 0) goto L89
            r5 = r6
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Rl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r7, kotlin.coroutines.Continuation<? super Ol.Transaction> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Rl.b.j
            if (r0 == 0) goto L13
            r0 = r8
            Rl.b$j r0 = (Rl.b.j) r0
            int r1 = r0.f32398l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32398l = r1
            goto L18
        L13:
            Rl.b$j r0 = new Rl.b$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32396j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32398l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f32391e
            Rl.b r7 = (Rl.b) r7
            java.lang.Object r7 = r0.f32390d
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f32389c
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f32388b
            Rl.b r7 = (Rl.b) r7
            java.lang.Object r7 = r0.f32387a
            com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r7 = (com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L6c
        L3d:
            r7 = move-exception
            goto L71
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ml.a r8 = j(r6)     // Catch: java.lang.Exception -> L3d
            r0.f32387a = r7     // Catch: java.lang.Exception -> L3d
            r0.f32388b = r6     // Catch: java.lang.Exception -> L3d
            r0.f32389c = r0     // Catch: java.lang.Exception -> L3d
            r0.f32390d = r0     // Catch: java.lang.Exception -> L3d
            r0.f32391e = r6     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f32392f = r2     // Catch: java.lang.Exception -> L3d
            r0.f32393g = r2     // Catch: java.lang.Exception -> L3d
            r0.f32394h = r2     // Catch: java.lang.Exception -> L3d
            r0.f32395i = r2     // Catch: java.lang.Exception -> L3d
            r0.f32398l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.h(r7, r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            qv.E0.i(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L82:
            boolean r8 = kotlin.Result.h(r7)
            r0 = 0
            if (r8 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r7 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r7
            r8 = 3
            Ol.e r7 = Pl.a.e(r7, r0, r0, r8, r0)
        L90:
            java.lang.Object r7 = kotlin.Result.b(r7)
            java.lang.Throwable r8 = kotlin.Result.e(r7)
            if (r8 != 0) goto L9b
            goto Lbb
        L9b:
            Ol.e r7 = new Ol.e
            Ol.c$a r1 = Ol.Header.INSTANCE
            Ol.c r1 = r1.a()
            Ol.a r2 = Ol.b.a()
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
            com.meijer.mobile.greenville.model.domain.TransactionException$ItemException r4 = new com.meijer.mobile.greenville.model.domain.TransactionException$ItemException
            java.lang.String r5 = r8.getMessage()
            r4.<init>(r0, r5, r8)
            r7.<init>(r1, r2, r3, r4)
            java.lang.Object r7 = kotlin.Result.b(r7)
        Lbb:
            kotlin.ResultKt.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Rl.b.g(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final String s(String str) {
        CharSequence charSequenceSubSequence;
        int i10 = 0;
        String strSubstring = str.substring(0, StringsKt.j0(str));
        Intrinsics.i(strSubstring, "substring(...)");
        int length = strSubstring.length();
        while (true) {
            if (i10 < length) {
                if (strSubstring.charAt(i10) == '0') {
                    i10++;
                } else {
                    charSequenceSubSequence = strSubstring.subSequence(i10, strSubstring.length());
                    break;
                }
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }
}
