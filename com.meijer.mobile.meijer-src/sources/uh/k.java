package uh;

import com.meijer.mobile.accounts.payments.api.models.network.AccountAddressDTO;
import com.meijer.mobile.accounts.payments.api.models.network.AccountCreditCardDTOV2;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.squareup.moshi.t;
import j$.time.LocalDateTime;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import retrofit2.Response;
import vh.AccountCreditCard;
import vh.AccountCreditCardResponse;
import vh.EnumC17676d;
import vh.EnumC17677e;
import vh.PaymentInfoResponse;
import wk.C17898a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Luh/k;", "", "LYi/a;", "tokenProvider", "Luh/h;", "paymentsApi", "Lcom/squareup/moshi/t;", "moshi", "Lmv/K;", "ioDispatcher", "<init>", "(LYi/a;Luh/h;Lcom/squareup/moshi/t;Lmv/K;)V", "", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "cardsList", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountAddressDTO;", "addressList", "Lvh/a;", "f", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lvh/b;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardToUpdate", "", "saveCardEnabled", "j$/time/LocalDateTime", "currentTime", "", "cartCode", "Lvh/f;", "j", "(Lvh/a;ZLj$/time/LocalDateTime;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardId", "g", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "b", "Luh/h;", "c", "Lcom/squareup/moshi/t;", "d", "Lmv/K;", "Lpv/B;", "e", "Lpv/B;", "_paymentsFlow", "Lpv/P;", "Lpv/P;", "i", "()Lpv/P;", "paymentsFlow", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h paymentsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AccountCreditCardResponse> _paymentsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<AccountCreditCardResponse> paymentsFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentsRepository$deleteCreditCard$2", f = "PaymentsRepository.kt", l = {163, 163, 167}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f164041a;

        /* renamed from: b, reason: collision with root package name */
        Object f164042b;

        /* renamed from: c, reason: collision with root package name */
        Object f164043c;

        /* renamed from: d, reason: collision with root package name */
        Object f164044d;

        /* renamed from: e, reason: collision with root package name */
        Object f164045e;

        /* renamed from: f, reason: collision with root package name */
        Object f164046f;

        /* renamed from: g, reason: collision with root package name */
        long f164047g;

        /* renamed from: h, reason: collision with root package name */
        int f164048h;

        /* renamed from: i, reason: collision with root package name */
        int f164049i;

        /* renamed from: j, reason: collision with root package name */
        int f164050j;

        /* renamed from: k, reason: collision with root package name */
        int f164051k;

        /* renamed from: l, reason: collision with root package name */
        int f164052l;

        /* renamed from: m, reason: collision with root package name */
        boolean f164053m;

        /* renamed from: n, reason: collision with root package name */
        int f164054n;

        /* renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f164055o;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f164057q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f164057q = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = k.this.new a(this.f164057q, continuation);
            aVar.f164055o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Boolean> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0108 A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:8:0x002c, B:38:0x0144, B:15:0x005c, B:29:0x0100, B:31:0x0108, B:33:0x011f, B:39:0x0149, B:40:0x014e, B:18:0x0089, B:25:0x00d1, B:21:0x009c), top: B:88:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0149 A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:8:0x002c, B:38:0x0144, B:15:0x005c, B:29:0x0100, B:31:0x0108, B:33:0x011f, B:39:0x0149, B:40:0x014e, B:18:0x0089, B:25:0x00d1, B:21:0x009c), top: B:88:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 497
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lvh/b;", "<anonymous>", "(Lmv/O;)Lvh/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentsRepository$getAccountCreditCards$2", f = "PaymentsRepository.kt", l = {69, 77, BinsView.LABEL_WIDTH_DP, 81}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AccountCreditCardResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f164058a;

        /* renamed from: b, reason: collision with root package name */
        Object f164059b;

        /* renamed from: c, reason: collision with root package name */
        Object f164060c;

        /* renamed from: d, reason: collision with root package name */
        Object f164061d;

        /* renamed from: e, reason: collision with root package name */
        Object f164062e;

        /* renamed from: f, reason: collision with root package name */
        Object f164063f;

        /* renamed from: g, reason: collision with root package name */
        int f164064g;

        /* renamed from: h, reason: collision with root package name */
        int f164065h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f164066i;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountAddressDTO;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentsRepository$getAccountCreditCards$2$1$accountAddressesResponse$1", f = "PaymentsRepository.kt", l = {74}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<List<? extends AccountAddressDTO>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f164068a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f164069b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BearerToken f164070c;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<? extends AccountAddressDTO>>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super Response<List<AccountAddressDTO>>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, BearerToken bearerToken, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f164069b = kVar;
                this.f164070c = bearerToken;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f164069b, this.f164070c, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<AccountAddressDTO>>> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f164068a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                h hVar = this.f164069b.paymentsApi;
                BearerToken bearerToken = this.f164070c;
                this.f164068a = 1;
                Object objA = hVar.a(bearerToken, this);
                if (objA == objF) {
                    return objF;
                }
                return objA;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentsRepository$getAccountCreditCards$2$1$creditCardsResponse$1", f = "PaymentsRepository.kt", l = {71}, m = "invokeSuspend")
        /* renamed from: uh.k$b$b, reason: collision with other inner class name */
        static final class C2598b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<List<? extends AccountCreditCardDTOV2>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f164071a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f164072b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BearerToken f164073c;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<? extends AccountCreditCardDTOV2>>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super Response<List<AccountCreditCardDTOV2>>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2598b(k kVar, BearerToken bearerToken, Continuation<? super C2598b> continuation) {
                super(2, continuation);
                this.f164072b = kVar;
                this.f164073c = bearerToken;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2598b(this.f164072b, this.f164073c, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<AccountCreditCardDTOV2>>> continuation) {
                return ((C2598b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f164071a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                h hVar = this.f164072b.paymentsApi;
                BearerToken bearerToken = this.f164073c;
                this.f164071a = 1;
                Object objB = hVar.b(bearerToken, this);
                if (objB == objF) {
                    return objF;
                }
                return objB;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = k.this.new b(continuation);
            bVar.f164066i = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AccountCreditCardResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lvh/f;", "<anonymous>", "(Lmv/O;)Lvh/f;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentsRepository$updateCreditCard$2", f = "PaymentsRepository.kt", l = {118, 117, 131}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super PaymentInfoResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f164074a;

        /* renamed from: b, reason: collision with root package name */
        Object f164075b;

        /* renamed from: c, reason: collision with root package name */
        Object f164076c;

        /* renamed from: d, reason: collision with root package name */
        Object f164077d;

        /* renamed from: e, reason: collision with root package name */
        Object f164078e;

        /* renamed from: f, reason: collision with root package name */
        Object f164079f;

        /* renamed from: g, reason: collision with root package name */
        Object f164080g;

        /* renamed from: h, reason: collision with root package name */
        Object f164081h;

        /* renamed from: i, reason: collision with root package name */
        Object f164082i;

        /* renamed from: j, reason: collision with root package name */
        boolean f164083j;

        /* renamed from: k, reason: collision with root package name */
        int f164084k;

        /* renamed from: l, reason: collision with root package name */
        int f164085l;

        /* renamed from: m, reason: collision with root package name */
        int f164086m;

        /* renamed from: n, reason: collision with root package name */
        int f164087n;

        /* renamed from: o, reason: collision with root package name */
        int f164088o;

        /* renamed from: p, reason: collision with root package name */
        int f164089p;

        /* renamed from: q, reason: collision with root package name */
        int f164090q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f164091r;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AccountCreditCard f164093t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f164094u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f164095v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f164096w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AccountCreditCard accountCreditCard, boolean z10, LocalDateTime localDateTime, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f164093t = accountCreditCard;
            this.f164094u = z10;
            this.f164095v = localDateTime;
            this.f164096w = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = k.this.new c(this.f164093t, this.f164094u, this.f164095v, this.f164096w, continuation);
            cVar.f164091r = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super PaymentInfoResponse> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:106)|(1:(1:(1:(8:7|8|9|41|57|(7:103|60|(1:62)(1:65)|(13:67|108|68|(1:75)(1:72)|76|79|(1:81)|82|(1:84)(1:85)|86|(1:96)(3:90|(1:92)(1:93)|94)|95|112)(1:97)|63|64|98)|99|100)(2:13|14))(6:15|16|17|33|107|(2:35|(2:37|(1:111)(6:40|41|57|(0)|99|100))(5:44|(1:46)|47|48|49))(2:52|53)))(3:18|19|20))(3:21|22|(2:24|39)(1:25))|105|26|27|101|28|29|(2:31|110)(4:32|33|107|(0)(0))|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01c0, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01e0, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01e1, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0175 A[Catch: Exception -> 0x01c0, TryCatch #2 {Exception -> 0x01c0, blocks: (B:41:0x01ba, B:33:0x016d, B:35:0x0175, B:37:0x0188, B:44:0x01c3, B:26:0x0121, B:29:0x014d), top: B:105:0x0121 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01d9 A[Catch: Exception -> 0x01d7, TryCatch #4 {Exception -> 0x01d7, blocks: (B:48:0x01d3, B:49:0x01d6, B:52:0x01d9, B:53:0x01df), top: B:107:0x0173 }] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3, types: [uh.k] */
        /* JADX WARN: Type inference failed for: r14v9 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable, retrofit2.HttpException] */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws com.meijer.mobile.accounts.payments.api.models.PaymentApiException {
            /*
                Method dump skipped, instructions count: 656
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uh.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(Yi.a tokenProvider, h paymentsApi, t moshi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(paymentsApi, "paymentsApi");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.paymentsApi = paymentsApi;
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
        InterfaceC16549B<AccountCreditCardResponse> interfaceC16549BA = S.a(new AccountCreditCardResponse(null, 1, null));
        this._paymentsFlow = interfaceC16549BA;
        this.paymentsFlow = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [vh.a] */
    public final List<AccountCreditCard> f(List<AccountCreditCardDTOV2> cardsList, List<AccountAddressDTO> addressList) {
        LocalDateTime accountCreditCard;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (AccountCreditCardDTOV2 accountCreditCardDTOV2 : cardsList) {
            Iterator it = addressList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AccountAddressDTO) next).getId() == accountCreditCardDTOV2.getAccountAddressId()) {
                    break;
                }
            }
            AccountAddressDTO accountAddressDTO = (AccountAddressDTO) next;
            if (accountAddressDTO != null) {
                long jR = accountCreditCardDTOV2.getId();
                String strH = accountCreditCardDTOV2.getCardName();
                String strJ = accountCreditCardDTOV2.getCardTypeName();
                String strS = accountCreditCardDTOV2.getLastFourDigits();
                EnumC17677e enumC17677eN = accountCreditCardDTOV2.n();
                String strQ = accountCreditCardDTOV2.getExpirationDate();
                C17898a c17898a = C17898a.f167225a;
                Object objA = wk.d.a(strQ, c17898a.z(), new i());
                Intrinsics.i(objA, "toDateTime(...)");
                YearMonth yearMonth = (YearMonth) objA;
                String strO = accountCreditCardDTOV2.getDescription();
                String strG = accountCreditCardDTOV2.getCardGuid();
                String strE = accountCreditCardDTOV2.getCardAuthToken();
                if (strE == null) {
                    strE = "-1";
                }
                String str = strE;
                boolean zU = accountCreditCardDTOV2.getMperksFlag();
                boolean zT = accountCreditCardDTOV2.getLinkToMPerks();
                boolean zA = accountCreditCardDTOV2.getIsPrimary();
                String strV = accountCreditCardDTOV2.getPhoneNumber();
                String strX = accountCreditCardDTOV2.getTermsOfServiceAgreementDate();
                LocalDateTime localDateTime = strX != null ? (LocalDateTime) wk.d.b(strX, c17898a.s(), new j()) : null;
                long jP = accountCreditCardDTOV2.getDigitalAccountId();
                String strF = accountCreditCardDTOV2.getCardCcTokenType();
                long id2 = accountAddressDTO.getId();
                String name = accountAddressDTO.getName();
                String addressLine1 = accountAddressDTO.getAddressLine1();
                String addressLine2 = accountAddressDTO.getAddressLine2();
                String city = accountAddressDTO.getCity();
                String state = accountAddressDTO.getState();
                String zipCode = accountAddressDTO.getZipCode();
                EnumC17676d enumC17676dT = accountAddressDTO.t();
                long contactId = accountAddressDTO.getContactId();
                String nameFirst = accountAddressDTO.getNameFirst();
                String str2 = nameFirst == null ? "" : nameFirst;
                String nameLast = accountAddressDTO.getNameLast();
                accountCreditCard = new AccountCreditCard(jR, strH, strJ, strS, enumC17677eN, yearMonth, strO, strG, str, zT, zA, strV, localDateTime, null, null, jP, id2, name, addressLine1, addressLine2, city, state, zipCode, enumC17676dT, contactId, str2, nameLast == null ? "" : nameLast, accountAddressDTO.getAddressNickname(), accountAddressDTO.getPhoneNumber(), accountAddressDTO.getIsPrimary(), null, strF, zU, 1073766400, 0, null);
            }
            if (accountCreditCard != null) {
                arrayList.add(accountCreditCard);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object k(k kVar, AccountCreditCard accountCreditCard, boolean z10, LocalDateTime localDateTime, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            localDateTime = LocalDateTime.now(wk.e.EASTERN);
        }
        LocalDateTime localDateTime2 = localDateTime;
        if ((i10 & 8) != 0) {
            str = "";
        }
        return kVar.j(accountCreditCard, z10, localDateTime2, str, continuation);
    }

    public final Object g(long j10, Continuation<? super Boolean> continuation) {
        return C15805i.g(this.ioDispatcher, new a(j10, null), continuation);
    }

    public final Object h(Continuation<? super AccountCreditCardResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new b(null), continuation);
    }

    public final P<AccountCreditCardResponse> i() {
        return this.paymentsFlow;
    }

    public final Object j(AccountCreditCard accountCreditCard, boolean z10, LocalDateTime localDateTime, String str, Continuation<? super PaymentInfoResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new c(accountCreditCard, z10, localDateTime, str, null), continuation);
    }
}
