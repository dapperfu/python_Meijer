package Sl;

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
import om.C16221a;
import pm.C16468e;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00112\u0006\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020!H\u0096@¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020'H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\n\u0010\u000f\u001a\u00060\u000ej\u0002`-H\u0096@¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00105¨\u00066"}, d2 = {"LSl/b;", "LSl/a;", "LNl/a;", "greenvilleDataSource", "LNl/b;", "picklistDataSource", "Lpm/e;", "productImagesDataSource", "Lom/a;", "couponDataSource", "<init>", "(LNl/a;LNl/b;Lpm/e;Lom/a;)V", "", "barcode", "", "storeId", "storeZip", "Lkotlin/Result;", "LPk/a;", "n", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upc", "Lqm/a;", "p", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "request", "LPl/e;", "b", "(Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "a", "(Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "d", "(Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "c", "(Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "g", "(Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "e", "(Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/model/common/StoreId;", "", "LPl/d;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LNl/a;", "LNl/b;", "Lpm/e;", "Lom/a;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b implements Sl.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Nl.a greenvilleDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Nl.b picklistDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C16468e productImagesDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16221a couponDataSource;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {73, 74, 79}, m = "addItem")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34632a;

        /* renamed from: b, reason: collision with root package name */
        Object f34633b;

        /* renamed from: c, reason: collision with root package name */
        Object f34634c;

        /* renamed from: d, reason: collision with root package name */
        Object f34635d;

        /* renamed from: e, reason: collision with root package name */
        Object f34636e;

        /* renamed from: f, reason: collision with root package name */
        Object f34637f;

        /* renamed from: g, reason: collision with root package name */
        Object f34638g;

        /* renamed from: h, reason: collision with root package name */
        Object f34639h;

        /* renamed from: i, reason: collision with root package name */
        Object f34640i;

        /* renamed from: j, reason: collision with root package name */
        int f34641j;

        /* renamed from: k, reason: collision with root package name */
        int f34642k;

        /* renamed from: l, reason: collision with root package name */
        int f34643l;

        /* renamed from: m, reason: collision with root package name */
        int f34644m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f34645n;

        /* renamed from: p, reason: collision with root package name */
        int f34647p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34645n = obj;
            this.f34647p |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {63}, m = "cancelTrip")
    /* renamed from: Sl.b$b, reason: collision with other inner class name */
    static final class C0774b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34648a;

        /* renamed from: b, reason: collision with root package name */
        Object f34649b;

        /* renamed from: c, reason: collision with root package name */
        Object f34650c;

        /* renamed from: d, reason: collision with root package name */
        Object f34651d;

        /* renamed from: e, reason: collision with root package name */
        Object f34652e;

        /* renamed from: f, reason: collision with root package name */
        int f34653f;

        /* renamed from: g, reason: collision with root package name */
        int f34654g;

        /* renamed from: h, reason: collision with root package name */
        int f34655h;

        /* renamed from: i, reason: collision with root package name */
        int f34656i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34657j;

        /* renamed from: l, reason: collision with root package name */
        int f34659l;

        C0774b(Continuation<? super C0774b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34657j = obj;
            this.f34659l |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {161}, m = "getCoupon-BWLJW6A")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34660a;

        /* renamed from: b, reason: collision with root package name */
        Object f34661b;

        /* renamed from: c, reason: collision with root package name */
        Object f34662c;

        /* renamed from: d, reason: collision with root package name */
        Object f34663d;

        /* renamed from: e, reason: collision with root package name */
        Object f34664e;

        /* renamed from: f, reason: collision with root package name */
        Object f34665f;

        /* renamed from: g, reason: collision with root package name */
        Object f34666g;

        /* renamed from: h, reason: collision with root package name */
        Object f34667h;

        /* renamed from: i, reason: collision with root package name */
        int f34668i;

        /* renamed from: j, reason: collision with root package name */
        int f34669j;

        /* renamed from: k, reason: collision with root package name */
        int f34670k;

        /* renamed from: l, reason: collision with root package name */
        int f34671l;

        /* renamed from: m, reason: collision with root package name */
        int f34672m;

        /* renamed from: n, reason: collision with root package name */
        int f34673n;

        /* renamed from: o, reason: collision with root package name */
        int f34674o;

        /* renamed from: p, reason: collision with root package name */
        long f34675p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f34676q;

        /* renamed from: s, reason: collision with root package name */
        int f34678s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34676q = obj;
            this.f34678s |= Integer.MIN_VALUE;
            Object objN = b.this.n(null, 0, null, this);
            return objN == IntrinsicsKt.f() ? objN : Result.a(objN);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {137}, m = "getPickList")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f34679a;

        /* renamed from: b, reason: collision with root package name */
        int f34680b;

        /* renamed from: c, reason: collision with root package name */
        int f34681c;

        /* renamed from: d, reason: collision with root package name */
        int f34682d;

        /* renamed from: e, reason: collision with root package name */
        int f34683e;

        /* renamed from: f, reason: collision with root package name */
        Object f34684f;

        /* renamed from: g, reason: collision with root package name */
        Object f34685g;

        /* renamed from: h, reason: collision with root package name */
        Object f34686h;

        /* renamed from: i, reason: collision with root package name */
        Object f34687i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34688j;

        /* renamed from: l, reason: collision with root package name */
        int f34690l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34688j = obj;
            this.f34690l |= Integer.MIN_VALUE;
            return b.this.f(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {HttpResponseStatus.SUCCESS_ACCEPTED}, m = "getProductImageUrl-gIAlu-s")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34691a;

        /* renamed from: b, reason: collision with root package name */
        Object f34692b;

        /* renamed from: c, reason: collision with root package name */
        Object f34693c;

        /* renamed from: d, reason: collision with root package name */
        Object f34694d;

        /* renamed from: e, reason: collision with root package name */
        Object f34695e;

        /* renamed from: f, reason: collision with root package name */
        int f34696f;

        /* renamed from: g, reason: collision with root package name */
        int f34697g;

        /* renamed from: h, reason: collision with root package name */
        int f34698h;

        /* renamed from: i, reason: collision with root package name */
        int f34699i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34700j;

        /* renamed from: l, reason: collision with root package name */
        int f34702l;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34700j = obj;
            this.f34702l |= Integer.MIN_VALUE;
            Object objP = b.this.p(null, this);
            return objP == IntrinsicsKt.f() ? objP : Result.a(objP);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {178}, m = "getProductImageUrl_gIAlu_s$getEDaAProductImage")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34703a;

        /* renamed from: b, reason: collision with root package name */
        Object f34704b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34705c;

        /* renamed from: d, reason: collision with root package name */
        int f34706d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34705c = obj;
            this.f34706d |= Integer.MIN_VALUE;
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
        Object f34707a;

        /* renamed from: b, reason: collision with root package name */
        Object f34708b;

        /* renamed from: c, reason: collision with root package name */
        Object f34709c;

        /* renamed from: d, reason: collision with root package name */
        Object f34710d;

        /* renamed from: e, reason: collision with root package name */
        Object f34711e;

        /* renamed from: f, reason: collision with root package name */
        int f34712f;

        /* renamed from: g, reason: collision with root package name */
        int f34713g;

        /* renamed from: h, reason: collision with root package name */
        int f34714h;

        /* renamed from: i, reason: collision with root package name */
        int f34715i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34716j;

        /* renamed from: l, reason: collision with root package name */
        int f34718l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34716j = obj;
            this.f34718l |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {55}, m = "startTrip")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34719a;

        /* renamed from: b, reason: collision with root package name */
        Object f34720b;

        /* renamed from: c, reason: collision with root package name */
        Object f34721c;

        /* renamed from: d, reason: collision with root package name */
        Object f34722d;

        /* renamed from: e, reason: collision with root package name */
        Object f34723e;

        /* renamed from: f, reason: collision with root package name */
        int f34724f;

        /* renamed from: g, reason: collision with root package name */
        int f34725g;

        /* renamed from: h, reason: collision with root package name */
        int f34726h;

        /* renamed from: i, reason: collision with root package name */
        int f34727i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34728j;

        /* renamed from: l, reason: collision with root package name */
        int f34730l;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34728j = obj;
            this.f34730l |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {47}, m = "transferStatus")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34731a;

        /* renamed from: b, reason: collision with root package name */
        Object f34732b;

        /* renamed from: c, reason: collision with root package name */
        Object f34733c;

        /* renamed from: d, reason: collision with root package name */
        Object f34734d;

        /* renamed from: e, reason: collision with root package name */
        Object f34735e;

        /* renamed from: f, reason: collision with root package name */
        int f34736f;

        /* renamed from: g, reason: collision with root package name */
        int f34737g;

        /* renamed from: h, reason: collision with root package name */
        int f34738h;

        /* renamed from: i, reason: collision with root package name */
        int f34739i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34740j;

        /* renamed from: l, reason: collision with root package name */
        int f34742l;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34740j = obj;
            this.f34742l |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.repository.GreenvilleRepositoryImpl", f = "GreenvilleRepositoryImpl.kt", l = {99}, m = "updateItem")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34743a;

        /* renamed from: b, reason: collision with root package name */
        Object f34744b;

        /* renamed from: c, reason: collision with root package name */
        Object f34745c;

        /* renamed from: d, reason: collision with root package name */
        Object f34746d;

        /* renamed from: e, reason: collision with root package name */
        Object f34747e;

        /* renamed from: f, reason: collision with root package name */
        int f34748f;

        /* renamed from: g, reason: collision with root package name */
        int f34749g;

        /* renamed from: h, reason: collision with root package name */
        int f34750h;

        /* renamed from: i, reason: collision with root package name */
        int f34751i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34752j;

        /* renamed from: l, reason: collision with root package name */
        int f34754l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34752j = obj;
            this.f34754l |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    private static final String o(String str) {
        if (!StringsKt.W(str, "2", false, 2, null)) {
            String strSubstring = str.substring(0, StringsKt.k0(str));
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

    public b(Nl.a greenvilleDataSource, Nl.b picklistDataSource, C16468e productImagesDataSource, C16221a couponDataSource) {
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
    public final java.lang.Object n(java.lang.String r29, int r30, java.lang.String r31, kotlin.coroutines.Continuation<? super kotlin.Result<Pk.Coupon>> r32) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.n(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, kotlin.coroutines.Continuation<? super kotlin.Result<qm.ProductImage>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Sl.b.e
            if (r0 == 0) goto L13
            r0 = r6
            Sl.b$e r0 = (Sl.b.e) r0
            int r1 = r0.f34702l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34702l = r1
            goto L18
        L13:
            Sl.b$e r0 = new Sl.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34700j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34702l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f34695e
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34694d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34693c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34692b
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34691a
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
            r0.f34691a = r5     // Catch: java.lang.Exception -> L3d
            r0.f34692b = r4     // Catch: java.lang.Exception -> L3d
            r0.f34693c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34694d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34695e = r4     // Catch: java.lang.Exception -> L3d
            r6 = 0
            r0.f34696f = r6     // Catch: java.lang.Exception -> L3d
            r0.f34697g = r6     // Catch: java.lang.Exception -> L3d
            r0.f34698h = r6     // Catch: java.lang.Exception -> L3d
            r0.f34699i = r6     // Catch: java.lang.Exception -> L3d
            r0.f34702l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = m(r4, r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L6d:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.p(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(Sl.b r5, java.lang.String r6, kotlin.coroutines.Continuation<? super qm.ProductImage> r7) {
        /*
            boolean r0 = r7 instanceof Sl.b.f
            if (r0 == 0) goto L13
            r0 = r7
            Sl.b$f r0 = (Sl.b.f) r0
            int r1 = r0.f34706d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34706d = r1
            goto L18
        L13:
            Sl.b$f r0 = new Sl.b$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34705c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34706d
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f34704b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f34703a
            Sl.b r5 = (Sl.b) r5
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
            pm.e r7 = r5.productImagesDataSource
            com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest r2 = new com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest
            java.lang.String r4 = s(r6)
            java.util.List r4 = kotlin.collections.CollectionsKt.e(r4)
            r2.<init>(r4)
            r0.f34703a = r5
            r0.f34704b = r6
            r0.f34706d = r3
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
            qm.a r6 = new qm.a
            r6.<init>(r5)
            return r6
        L8e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.q(Sl.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final String r(String str, char c10, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.insert(i10, c10);
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r5, kotlin.coroutines.Continuation<? super Pl.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Sl.b.h
            if (r0 == 0) goto L13
            r0 = r6
            Sl.b$h r0 = (Sl.b.h) r0
            int r1 = r0.f34730l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34730l = r1
            goto L18
        L13:
            Sl.b$h r0 = new Sl.b$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34728j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34730l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f34723e
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34722d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34721c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34720b
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34719a
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
            Nl.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f34719a = r5     // Catch: java.lang.Exception -> L3d
            r0.f34720b = r4     // Catch: java.lang.Exception -> L3d
            r0.f34721c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34722d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34723e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f34724f = r2     // Catch: java.lang.Exception -> L3d
            r0.f34725g = r2     // Catch: java.lang.Exception -> L3d
            r0.f34726h = r2     // Catch: java.lang.Exception -> L3d
            r0.f34727i = r2     // Catch: java.lang.Exception -> L3d
            r0.f34730l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.f(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Pl.e r5 = Ql.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.a(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r5, kotlin.coroutines.Continuation<? super Pl.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Sl.b.i
            if (r0 == 0) goto L13
            r0 = r6
            Sl.b$i r0 = (Sl.b.i) r0
            int r1 = r0.f34742l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34742l = r1
            goto L18
        L13:
            Sl.b$i r0 = new Sl.b$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34740j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34742l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f34735e
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34734d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34733c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34732b
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34731a
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
            Nl.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f34731a = r5     // Catch: java.lang.Exception -> L3d
            r0.f34732b = r4     // Catch: java.lang.Exception -> L3d
            r0.f34733c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34734d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34735e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f34736f = r2     // Catch: java.lang.Exception -> L3d
            r0.f34737g = r2     // Catch: java.lang.Exception -> L3d
            r0.f34738h = r2     // Catch: java.lang.Exception -> L3d
            r0.f34739i = r2     // Catch: java.lang.Exception -> L3d
            r0.f34742l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.g(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Pl.e r5 = Ql.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.b(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r19, kotlin.coroutines.Continuation<? super Pl.Transaction> r20) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r5, kotlin.coroutines.Continuation<? super Pl.Transaction> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Sl.b.C0774b
            if (r0 == 0) goto L13
            r0 = r6
            Sl.b$b r0 = (Sl.b.C0774b) r0
            int r1 = r0.f34659l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34659l = r1
            goto L18
        L13:
            Sl.b$b r0 = new Sl.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34657j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34659l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f34652e
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34651d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34650c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34649b
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34648a
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
            Nl.a r6 = j(r4)     // Catch: java.lang.Exception -> L3d
            r0.f34648a = r5     // Catch: java.lang.Exception -> L3d
            r0.f34649b = r4     // Catch: java.lang.Exception -> L3d
            r0.f34650c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34651d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34652e = r4     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f34653f = r2     // Catch: java.lang.Exception -> L3d
            r0.f34654g = r2     // Catch: java.lang.Exception -> L3d
            r0.f34655h = r2     // Catch: java.lang.Exception -> L3d
            r0.f34656i = r2     // Catch: java.lang.Exception -> L3d
            r0.f34659l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.d(r5, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L82:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r5 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r5
            r6 = 3
            r0 = 0
            Pl.e r5 = Ql.a.e(r5, r0, r0, r6, r0)
        L90:
            java.lang.Object r5 = kotlin.Result.b(r5)
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r7, kotlin.coroutines.Continuation<? super Pl.Transaction> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Sl.b.g
            if (r0 == 0) goto L13
            r0 = r8
            Sl.b$g r0 = (Sl.b.g) r0
            int r1 = r0.f34718l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34718l = r1
            goto L18
        L13:
            Sl.b$g r0 = new Sl.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34716j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34718l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f34711e
            Sl.b r7 = (Sl.b) r7
            java.lang.Object r7 = r0.f34710d
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f34709c
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f34708b
            Sl.b r7 = (Sl.b) r7
            java.lang.Object r7 = r0.f34707a
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
            Nl.a r8 = j(r6)     // Catch: java.lang.Exception -> L3d
            r0.f34707a = r7     // Catch: java.lang.Exception -> L3d
            r0.f34708b = r6     // Catch: java.lang.Exception -> L3d
            r0.f34709c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34710d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34711e = r6     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f34712f = r2     // Catch: java.lang.Exception -> L3d
            r0.f34713g = r2     // Catch: java.lang.Exception -> L3d
            r0.f34714h = r2     // Catch: java.lang.Exception -> L3d
            r0.f34715i = r2     // Catch: java.lang.Exception -> L3d
            r0.f34718l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.e(r7, r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            mv.E0.i(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L82:
            boolean r8 = kotlin.Result.h(r7)
            r0 = 0
            if (r8 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r7 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r7
            r8 = 3
            Pl.e r7 = Ql.a.e(r7, r0, r0, r8, r0)
        L90:
            java.lang.Object r7 = kotlin.Result.b(r7)
            java.lang.Throwable r8 = kotlin.Result.e(r7)
            if (r8 != 0) goto L9b
            goto Lbb
        L9b:
            Pl.e r7 = new Pl.e
            Pl.c$a r1 = Pl.Header.INSTANCE
            Pl.c r1 = r1.a()
            Pl.a r2 = Pl.b.a()
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
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r5, kotlin.coroutines.Continuation<? super java.util.List<Pl.PicklistItem>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Sl.b.d
            if (r0 == 0) goto L13
            r0 = r6
            Sl.b$d r0 = (Sl.b.d) r0
            int r1 = r0.f34690l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34690l = r1
            goto L18
        L13:
            Sl.b$d r0 = new Sl.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34688j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34690l
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.f34687i
            Sl.b r5 = (Sl.b) r5
            java.lang.Object r5 = r0.f34686h
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34685g
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f34684f
            Sl.b r5 = (Sl.b) r5
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
            Nl.b r6 = k(r4)     // Catch: java.lang.Exception -> L39
            r0.f34684f = r4     // Catch: java.lang.Exception -> L39
            r0.f34685g = r0     // Catch: java.lang.Exception -> L39
            r0.f34686h = r0     // Catch: java.lang.Exception -> L39
            r0.f34687i = r4     // Catch: java.lang.Exception -> L39
            r0.f34679a = r5     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f34680b = r2     // Catch: java.lang.Exception -> L39
            r0.f34681c = r2     // Catch: java.lang.Exception -> L39
            r0.f34682d = r2     // Catch: java.lang.Exception -> L39
            r0.f34683e = r2     // Catch: java.lang.Exception -> L39
            r0.f34690l = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.c(r5, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L39
            goto L7e
        L6d:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.f(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Sl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r7, kotlin.coroutines.Continuation<? super Pl.Transaction> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Sl.b.j
            if (r0 == 0) goto L13
            r0 = r8
            Sl.b$j r0 = (Sl.b.j) r0
            int r1 = r0.f34754l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34754l = r1
            goto L18
        L13:
            Sl.b$j r0 = new Sl.b$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34752j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34754l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.f34747e
            Sl.b r7 = (Sl.b) r7
            java.lang.Object r7 = r0.f34746d
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f34745c
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r7 = r0.f34744b
            Sl.b r7 = (Sl.b) r7
            java.lang.Object r7 = r0.f34743a
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
            Nl.a r8 = j(r6)     // Catch: java.lang.Exception -> L3d
            r0.f34743a = r7     // Catch: java.lang.Exception -> L3d
            r0.f34744b = r6     // Catch: java.lang.Exception -> L3d
            r0.f34745c = r0     // Catch: java.lang.Exception -> L3d
            r0.f34746d = r0     // Catch: java.lang.Exception -> L3d
            r0.f34747e = r6     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f34748f = r2     // Catch: java.lang.Exception -> L3d
            r0.f34749g = r2     // Catch: java.lang.Exception -> L3d
            r0.f34750h = r2     // Catch: java.lang.Exception -> L3d
            r0.f34751i = r2     // Catch: java.lang.Exception -> L3d
            r0.f34754l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.h(r7, r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L6c
            return r1
        L6c:
            java.lang.Object r7 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L82
        L71:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            mv.E0.i(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L82:
            boolean r8 = kotlin.Result.h(r7)
            r0 = 0
            if (r8 == 0) goto L90
            com.meijer.mobile.greenville.model.response.TransactionResponse r7 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r7
            r8 = 3
            Pl.e r7 = Ql.a.e(r7, r0, r0, r8, r0)
        L90:
            java.lang.Object r7 = kotlin.Result.b(r7)
            java.lang.Throwable r8 = kotlin.Result.e(r7)
            if (r8 != 0) goto L9b
            goto Lbb
        L9b:
            Pl.e r7 = new Pl.e
            Pl.c$a r1 = Pl.Header.INSTANCE
            Pl.c r1 = r1.a()
            Pl.a r2 = Pl.b.a()
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
        throw new UnsupportedOperationException("Method not decompiled: Sl.b.g(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final String s(String str) {
        CharSequence charSequenceSubSequence;
        int i10 = 0;
        String strSubstring = str.substring(0, StringsKt.k0(str));
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
