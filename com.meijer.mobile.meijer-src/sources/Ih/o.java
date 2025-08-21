package Ih;

import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import j$.time.YearMonth;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import vh.AccountCreditCard;
import vh.AccountCreditCardResponse;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LIh/o;", "Landroidx/lifecycle/c0;", "Luh/k;", "paymentsRepository", "<init>", "(Luh/k;)V", "", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvh/b;", "response", "isFailure", "", "s", "(Lvh/b;Z)V", "p", "()V", "a", "Luh/k;", "Lpv/B;", "LIh/o$a;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "r", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class o extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uh.k paymentsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<PaymentsCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<PaymentsCardViewState> viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ^\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"LIh/o$a;", "", "", "isLoading", "isPrimary", "isExpired", "", "cardIcon", "Lbk/a;", "emptyOrErrorCardMessage", "creditCardDescription", "creditCardCountMessage", "<init>", "(ZZZLjava/lang/Integer;Lbk/a;Lbk/a;Lbk/a;)V", "a", "(ZZZLjava/lang/Integer;Lbk/a;Lbk/a;Lbk/a;)LIh/o$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "h", "()Z", "b", "i", "c", "g", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Lbk/a;", "f", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.o$a, reason: from toString */
    public static final /* data */ class PaymentsCardViewState {

        /* renamed from: h, reason: collision with root package name */
        public static final int f14683h = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPrimary;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isExpired;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer cardIcon;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a emptyOrErrorCardMessage;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a creditCardDescription;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a creditCardCountMessage;

        public PaymentsCardViewState() {
            this(false, false, false, null, null, null, null, l3.f93324d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentsCardViewState)) {
                return false;
            }
            PaymentsCardViewState paymentsCardViewState = (PaymentsCardViewState) other;
            return this.isLoading == paymentsCardViewState.isLoading && this.isPrimary == paymentsCardViewState.isPrimary && this.isExpired == paymentsCardViewState.isExpired && Intrinsics.e(this.cardIcon, paymentsCardViewState.cardIcon) && Intrinsics.e(this.emptyOrErrorCardMessage, paymentsCardViewState.emptyOrErrorCardMessage) && Intrinsics.e(this.creditCardDescription, paymentsCardViewState.creditCardDescription) && Intrinsics.e(this.creditCardCountMessage, paymentsCardViewState.creditCardCountMessage);
        }

        public PaymentsCardViewState(boolean z10, boolean z11, boolean z12, Integer num, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3) {
            this.isLoading = z10;
            this.isPrimary = z11;
            this.isExpired = z12;
            this.cardIcon = num;
            this.emptyOrErrorCardMessage = abstractC6392a;
            this.creditCardDescription = abstractC6392a2;
            this.creditCardCountMessage = abstractC6392a3;
        }

        public static /* synthetic */ PaymentsCardViewState b(PaymentsCardViewState paymentsCardViewState, boolean z10, boolean z11, boolean z12, Integer num, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = paymentsCardViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                z11 = paymentsCardViewState.isPrimary;
            }
            if ((i10 & 4) != 0) {
                z12 = paymentsCardViewState.isExpired;
            }
            if ((i10 & 8) != 0) {
                num = paymentsCardViewState.cardIcon;
            }
            if ((i10 & 16) != 0) {
                abstractC6392a = paymentsCardViewState.emptyOrErrorCardMessage;
            }
            if ((i10 & 32) != 0) {
                abstractC6392a2 = paymentsCardViewState.creditCardDescription;
            }
            if ((i10 & 64) != 0) {
                abstractC6392a3 = paymentsCardViewState.creditCardCountMessage;
            }
            AbstractC6392a abstractC6392a4 = abstractC6392a2;
            AbstractC6392a abstractC6392a5 = abstractC6392a3;
            AbstractC6392a abstractC6392a6 = abstractC6392a;
            boolean z13 = z12;
            return paymentsCardViewState.a(z10, z11, z13, num, abstractC6392a6, abstractC6392a4, abstractC6392a5);
        }

        public final PaymentsCardViewState a(boolean isLoading, boolean isPrimary, boolean isExpired, Integer cardIcon, AbstractC6392a emptyOrErrorCardMessage, AbstractC6392a creditCardDescription, AbstractC6392a creditCardCountMessage) {
            return new PaymentsCardViewState(isLoading, isPrimary, isExpired, cardIcon, emptyOrErrorCardMessage, creditCardDescription, creditCardCountMessage);
        }

        /* renamed from: c, reason: from getter */
        public final Integer getCardIcon() {
            return this.cardIcon;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getCreditCardCountMessage() {
            return this.creditCardCountMessage;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC6392a getCreditCardDescription() {
            return this.creditCardDescription;
        }

        /* renamed from: f, reason: from getter */
        public final AbstractC6392a getEmptyOrErrorCardMessage() {
            return this.emptyOrErrorCardMessage;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isPrimary)) * 31) + Boolean.hashCode(this.isExpired)) * 31;
            Integer num = this.cardIcon;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            AbstractC6392a abstractC6392a = this.emptyOrErrorCardMessage;
            int iHashCode3 = (iHashCode2 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.creditCardDescription;
            int iHashCode4 = (iHashCode3 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.creditCardCountMessage;
            return iHashCode4 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsPrimary() {
            return this.isPrimary;
        }

        public String toString() {
            return "PaymentsCardViewState(isLoading=" + this.isLoading + ", isPrimary=" + this.isPrimary + ", isExpired=" + this.isExpired + ", cardIcon=" + this.cardIcon + ", emptyOrErrorCardMessage=" + this.emptyOrErrorCardMessage + ", creditCardDescription=" + this.creditCardDescription + ", creditCardCountMessage=" + this.creditCardCountMessage + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PaymentsCardViewState(boolean r2, boolean r3, boolean r4, java.lang.Integer r5, bk.AbstractC6392a r6, bk.AbstractC6392a r7, bk.AbstractC6392a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L5
                r2 = 1
            L5:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lb
                r3 = r0
            Lb:
                r10 = r9 & 4
                if (r10 == 0) goto L10
                r4 = r0
            L10:
                r10 = r9 & 8
                r0 = 0
                if (r10 == 0) goto L16
                r5 = r0
            L16:
                r10 = r9 & 16
                if (r10 == 0) goto L1b
                r6 = r0
            L1b:
                r10 = r9 & 32
                if (r10 == 0) goto L20
                r7 = r0
            L20:
                r9 = r9 & 64
                if (r9 == 0) goto L2d
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L35
            L2d:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L35:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.o.PaymentsCardViewState.<init>(boolean, boolean, boolean, java.lang.Integer, bk.a, bk.a, bk.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.PaymentsCardViewModel$fetchPaymentsCardInfo$2", f = "PaymentsCardViewModel.kt", l = {39}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14691a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvh/b;", "response", "", "<anonymous>", "(Lvh/b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.PaymentsCardViewModel$fetchPaymentsCardInfo$2$1", f = "PaymentsCardViewModel.kt", l = {42}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<AccountCreditCardResponse, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f14693a;

            /* renamed from: b, reason: collision with root package name */
            Object f14694b;

            /* renamed from: c, reason: collision with root package name */
            int f14695c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f14696d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ o f14697e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14697e = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f14697e, continuation);
                aVar.f14696d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AccountCreditCardResponse accountCreditCardResponse, Continuation<? super Unit> continuation) {
                return ((a) create(accountCreditCardResponse, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                o oVar;
                AccountCreditCardResponse accountCreditCardResponse;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f14695c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        accountCreditCardResponse = (AccountCreditCardResponse) this.f14694b;
                        oVar = (o) this.f14693a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AccountCreditCardResponse accountCreditCardResponse2 = (AccountCreditCardResponse) this.f14696d;
                    oVar = this.f14697e;
                    this.f14696d = accountCreditCardResponse2;
                    this.f14693a = oVar;
                    this.f14694b = accountCreditCardResponse2;
                    this.f14695c = 1;
                    Object objQ = oVar.q(this);
                    if (objQ == objF) {
                        return objF;
                    }
                    accountCreditCardResponse = accountCreditCardResponse2;
                    obj = objQ;
                }
                oVar.s(accountCreditCardResponse, ((Boolean) obj).booleanValue());
                return Unit.f143329a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14691a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<AccountCreditCardResponse> pI = o.this.paymentsRepository.i();
                a aVar = new a(o.this, null);
                this.f14691a = 1;
                if (C16563h.k(pI, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.PaymentsCardViewModel", f = "PaymentsCardViewModel.kt", l = {49}, m = "getPaymentCard")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f14698a;

        /* renamed from: b, reason: collision with root package name */
        Object f14699b;

        /* renamed from: c, reason: collision with root package name */
        Object f14700c;

        /* renamed from: d, reason: collision with root package name */
        Object f14701d;

        /* renamed from: e, reason: collision with root package name */
        int f14702e;

        /* renamed from: f, reason: collision with root package name */
        int f14703f;

        /* renamed from: g, reason: collision with root package name */
        int f14704g;

        /* renamed from: h, reason: collision with root package name */
        int f14705h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14706i;

        /* renamed from: k, reason: collision with root package name */
        int f14708k;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14706i = obj;
            this.f14708k |= Integer.MIN_VALUE;
            return o.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountCreditCard) t11).getIsPrimary()), Boolean.valueOf(((AccountCreditCard) t10).getIsPrimary()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(AccountCreditCardResponse response, boolean isFailure) {
        PaymentsCardViewState value;
        PaymentsCardViewState paymentsCardViewState;
        boolean isPrimary;
        boolean zIsBefore;
        AbstractC6392a abstractC6392aD;
        Integer numValueOf;
        AbstractC6392a abstractC6392aB;
        AbstractC6392a abstractC6392aD2;
        boolean z10 = isFailure || response.b().isEmpty();
        List listZ0 = CollectionsKt.Z0(response.b(), new d());
        InterfaceC16549B<PaymentsCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            paymentsCardViewState = value;
            isPrimary = z10 ? false : ((AccountCreditCard) CollectionsKt.s0(listZ0)).getIsPrimary();
            zIsBefore = z10 ? false : ((AccountCreditCard) CollectionsKt.s0(listZ0)).getExpirationDate().isBefore(YearMonth.now());
            abstractC6392aD = null;
            numValueOf = z10 ? null : Integer.valueOf(((AccountCreditCard) CollectionsKt.s0(listZ0)).getCardType().b());
            abstractC6392aB = z10 ? null : AbstractC6392a.INSTANCE.b(Gh.f.f12662a, listZ0.size(), new Object[0]);
            abstractC6392aD2 = z10 ? null : AbstractC6392a.INSTANCE.d(Gh.h.f12685D, ((AccountCreditCard) CollectionsKt.s0(listZ0)).getCardLastFourDigits());
            if (isFailure) {
                abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12731J3, new Object[0]);
            } else if (response.b().isEmpty()) {
                abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12724I3, new Object[0]);
            }
        } while (!interfaceC16549B.e(value, paymentsCardViewState.a(false, isPrimary, zIsBefore, numValueOf, abstractC6392aD, abstractC6392aD2, abstractC6392aB)));
    }

    public o(uh.k paymentsRepository) {
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        this.paymentsRepository = paymentsRepository;
        InterfaceC16549B<PaymentsCardViewState> interfaceC16549BA = S.a(new PaymentsCardViewState(false, false, false, null, null, null, null, l3.f93324d, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Ih.o.c
            if (r0 == 0) goto L13
            r0 = r5
            Ih.o$c r0 = (Ih.o.c) r0
            int r1 = r0.f14708k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14708k = r1
            goto L18
        L13:
            Ih.o$c r0 = new Ih.o$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14706i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f14708k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f14701d
            Ih.o r1 = (Ih.o) r1
            java.lang.Object r1 = r0.f14700c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f14699b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f14698a
            Ih.o r1 = (Ih.o) r1
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L39
            goto L66
        L39:
            r5 = move-exception
            goto L6b
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L43:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            uh.k r5 = n(r4)     // Catch: java.lang.Exception -> L39
            r0.f14698a = r4     // Catch: java.lang.Exception -> L39
            r0.f14699b = r0     // Catch: java.lang.Exception -> L39
            r0.f14700c = r0     // Catch: java.lang.Exception -> L39
            r0.f14701d = r4     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f14702e = r2     // Catch: java.lang.Exception -> L39
            r0.f14703f = r2     // Catch: java.lang.Exception -> L39
            r0.f14704g = r2     // Catch: java.lang.Exception -> L39
            r0.f14705h = r2     // Catch: java.lang.Exception -> L39
            r0.f14708k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r5 = r5.h(r0)     // Catch: java.lang.Exception -> L39
            if (r5 != r1) goto L66
            return r1
        L66:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L39
            goto L7c
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L7c:
            boolean r5 = kotlin.Result.g(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.o.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        PaymentsCardViewState value;
        InterfaceC16549B<PaymentsCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PaymentsCardViewState.b(value, true, false, false, null, null, null, null, 126, null)));
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final P<PaymentsCardViewState> r() {
        return this.viewState;
    }
}
