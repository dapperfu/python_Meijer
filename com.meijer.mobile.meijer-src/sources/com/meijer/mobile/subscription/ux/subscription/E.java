package com.meijer.mobile.subscription.ux.subscription;

import Co.Image;
import Co.ProductFullDetails;
import Eh.AccountAddress;
import Eh.EnumC3241e;
import Tq.SimpleStoreSummary;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.C;
import com.meijer.mobile.subscription.ux.subscription.J;
import com.meijer.mobile.subscription.ux.subscription.K;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import cr.SubscriptionDetails;
import di.Country;
import di.CustomerAddress;
import di.Region;
import dr.CustomerDeliveryAddressRequest;
import dr.PreferredTimeslotRequest;
import dr.ProductInfoRequest;
import dr.SubscriptionProductRequest;
import ir.C14846a;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kr.C15410d;
import mr.FulfillmentDay;
import mr.FulfillmentSlot;
import mr.TimeSlotDayDecorator;
import mr.TimeSlotTimeDecorator;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import wk.C17898a;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\b\u0012\u0004\u0012\u00020+0!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0010¢\u0006\u0004\bC\u0010BJ\u001b\u0010E\u001a\u00020\u00102\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bE\u0010FJ#\u0010I\u001a\b\u0012\u0004\u0012\u00020H0!2\f\u0010G\u001a\b\u0012\u0004\u0012\u0002050!H\u0001¢\u0006\u0004\bI\u0010-J?\u0010N\u001a\b\u0012\u0004\u0012\u00020M0!2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020H0!2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020H0!2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020H0!H\u0001¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020[0_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020\u000e0i8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u0002010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006v"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/E;", "Landroidx/lifecycle/c0;", "Lir/a;", "subscriptionRepository", "Lcom/meijer/mobile/subscription/ux/subscription/D;", "staticConfig", "LCh/a;", "accountAddressesRepository", "Lmr/m;", "labelProvider", "Luh/k;", "paymentsRepository", "<init>", "(Lir/a;Lcom/meijer/mobile/subscription/ux/subscription/D;LCh/a;Lmr/m;Luh/k;)V", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "screen", "", "D", "(Lcom/meijer/mobile/subscription/ux/subscription/C;)V", "", "quantity", "I", "(I)V", "frequency", "H", "Lcom/meijer/mobile/subscription/ux/subscription/y;", "decorator", "N", "(Lcom/meijer/mobile/subscription/ux/subscription/y;)V", "Lcr/j;", "subscriptionDetails", "v", "(Lcr/j;)V", "", "LEh/a;", "savedAddresses", "K", "(Ljava/util/List;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)V", "addressList", "Ldi/c;", "C", "(Ljava/util/List;)Ljava/util/List;", "selectedAddresses", "G", "(Ldi/c;)V", "Lmr/l;", "fulfillmentSlotDayDecorator", "F", "(Lmr/l;)V", "", "slotId", "L", "(Ljava/lang/String;)V", "LCo/h;", "product", "O", "(LCo/h;)V", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "action", "E", "(Lcom/meijer/mobile/subscription/ux/subscription/k;)V", "M", "()V", "w", "selectedDayIndex", "y", "(Ljava/lang/Integer;)V", "labels", "Lmr/n;", "P", "morning", "afternoon", "evening", "Lcom/meijer/mobile/subscription/ux/subscription/J;", "u", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "a", "Lir/a;", "b", "Lcom/meijer/mobile/subscription/ux/subscription/D;", "c", "LCh/a;", "d", "Lmr/m;", "e", "Luh/k;", "Lpv/B;", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "f", "Lpv/B;", "_viewState", "Lpv/P;", "g", "Lpv/P;", "B", "()Lpv/P;", "viewState", "Lpv/A;", "h", "Lpv/A;", "_screenFlow", "Lpv/F;", "i", "Lpv/F;", "x", "()Lpv/F;", "screenFlow", "Lcom/meijer/mobile/subscription/ux/subscription/K;", "j", "Lcom/meijer/mobile/subscription/ux/subscription/K;", "selectedDayState", "k", "Ljava/util/List;", "availableDayDecorators", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class E extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14846a subscriptionRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SubscriptionStaticConfig staticConfig;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ch.a accountAddressesRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mr.m labelProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final uh.k paymentsRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<SubscriptionViewState> _viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionViewState> viewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<C> _screenFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<C> screenFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private K selectedDayState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<TimeSlotDayDecorator> availableDayDecorators;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$cancelProductSubscription$1", f = "SubscriptionViewModel.kt", l = {228}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119873a;

        /* renamed from: b, reason: collision with root package name */
        Object f119874b;

        /* renamed from: c, reason: collision with root package name */
        int f119875c;

        /* renamed from: d, reason: collision with root package name */
        int f119876d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f119877e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119879g;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = E.this.new a(this.f119879g, continuation);
            aVar.f119877e = obj;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SubscriptionDetails subscriptionDetails, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119879g = subscriptionDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscription.E.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$fetchDeliveryAddresses$1", f = "SubscriptionViewModel.kt", l = {270}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119880a;

        /* renamed from: b, reason: collision with root package name */
        Object f119881b;

        /* renamed from: c, reason: collision with root package name */
        Object f119882c;

        /* renamed from: d, reason: collision with root package name */
        Object f119883d;

        /* renamed from: e, reason: collision with root package name */
        int f119884e;

        /* renamed from: f, reason: collision with root package name */
        int f119885f;

        /* renamed from: g, reason: collision with root package name */
        int f119886g;

        /* renamed from: h, reason: collision with root package name */
        int f119887h;

        /* renamed from: i, reason: collision with root package name */
        int f119888i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f119889j;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = E.this.new b(continuation);
            bVar.f119889j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119888i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f119889j;
                    InterfaceC16549B interfaceC16549B = E.this._viewState;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, SubscriptionViewState.b((SubscriptionViewState) value, true, false, false, null, null, null, 0, null, null, null, 1022, null)));
                    E e10 = E.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.a aVar = e10.accountAddressesRepository;
                    this.f119889j = r23;
                    this.f119880a = r23;
                    this.f119881b = this;
                    this.f119882c = this;
                    this.f119883d = r23;
                    this.f119884e = 0;
                    this.f119885f = 0;
                    this.f119886g = 0;
                    this.f119887h = 0;
                    this.f119888i = 1;
                    objC = aVar.c(this);
                    i10 = r23;
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f119889j;
                    ResultKt.b(obj);
                    objC = obj;
                    i10 = r24;
                }
                objB = Result.b(objC);
                r22 = i10;
            } catch (Exception e11) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e11));
                r22 = i10;
            }
            E e12 = E.this;
            if (Result.h(objB)) {
                e12.K((List) objB);
            }
            E e13 = E.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                e13.J(thE);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$navigateTo$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119891a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f119893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f119893c = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return E.this.new c(this.f119893c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f119891a == 0) {
                ResultKt.b(obj);
                E.this._screenFlow.b(this.f119893c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119894a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return E.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f119894a == 0) {
                ResultKt.b(obj);
                E.this.D(C.c.b.f119850c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$2", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119896a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return E.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f119896a == 0) {
                ResultKt.b(obj);
                E.this.D(C.c.a.f119849c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$3", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119898a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return E.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f119898a == 0) {
                ResultKt.b(obj);
                E.this.D(C.c.C1935c.f119851c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$4", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119900a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return E.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f119900a == 0) {
                ResultKt.b(obj);
                E.this.D(C.c.d.f119852c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$saveSubscription$1", f = "SubscriptionViewModel.kt", l = {HttpResponseStatus.SUCCESS_OK}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119902a;

        /* renamed from: b, reason: collision with root package name */
        Object f119903b;

        /* renamed from: c, reason: collision with root package name */
        Object f119904c;

        /* renamed from: d, reason: collision with root package name */
        int f119905d;

        /* renamed from: e, reason: collision with root package name */
        int f119906e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f119907f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SubscriptionDecorator f119909h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(SubscriptionDecorator subscriptionDecorator, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f119909h = subscriptionDecorator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = E.this.new i(this.f119909h, continuation);
            iVar.f119907f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            SubscriptionViewState subscriptionViewState;
            String localizedMessage;
            Object value2;
            Object value3;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119906e;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f119907f;
                    InterfaceC16549B interfaceC16549B = E.this._viewState;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, SubscriptionViewState.b((SubscriptionViewState) value3, true, false, false, null, null, null, 0, null, null, null, 1022, null)));
                    SubscriptionDecorator subscriptionDecoratorC = this.f119909h.c(E.this.staticConfig);
                    SubscriptionProductRequest subscriptionProductRequestA = z.a(subscriptionDecoratorC);
                    E e10 = E.this;
                    Result.Companion companion = Result.INSTANCE;
                    C14846a c14846a = e10.subscriptionRepository;
                    this.f119907f = interfaceC15783O;
                    this.f119902a = subscriptionDecoratorC;
                    this.f119903b = subscriptionProductRequestA;
                    this.f119904c = interfaceC15783O;
                    this.f119905d = 0;
                    this.f119906e = 1;
                    objA = c14846a.a(subscriptionProductRequestA, this);
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objA = obj;
                }
                objB = Result.b((SubscriptionDetails) objA);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            E e11 = E.this;
            if (Result.h(objB)) {
                InterfaceC16549B interfaceC16549B2 = e11._viewState;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, SubscriptionViewState.b((SubscriptionViewState) value2, false, true, false, null, null, null, 0, null, null, null, 1012, null)));
                e11.D(C.a.f119846b);
            }
            E e12 = E.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC16549B interfaceC16549B3 = e12._viewState;
                do {
                    value = interfaceC16549B3.getValue();
                    subscriptionViewState = (SubscriptionViewState) value;
                    localizedMessage = thE.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "Something went wrong";
                    }
                } while (!interfaceC16549B3.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, localizedMessage, null, null, 0, null, null, null, 1012, null)));
            }
            return Unit.f143329a;
        }
    }

    public E(C14846a subscriptionRepository, SubscriptionStaticConfig staticConfig, Ch.a accountAddressesRepository, mr.m labelProvider, uh.k paymentsRepository) {
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        Intrinsics.j(staticConfig, "staticConfig");
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        Intrinsics.j(labelProvider, "labelProvider");
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        this.subscriptionRepository = subscriptionRepository;
        this.staticConfig = staticConfig;
        this.accountAddressesRepository = accountAddressesRepository;
        this.labelProvider = labelProvider;
        this.paymentsRepository = paymentsRepository;
        InterfaceC16549B<SubscriptionViewState> interfaceC16549BA = S.a(new SubscriptionViewState(false, false, false, null, null, null, 0, null, null, null, 1023, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<C> interfaceC16548AB = C16555H.b(0, 1, null, 5, null);
        this._screenFlow = interfaceC16548AB;
        this.screenFlow = C16563h.b(interfaceC16548AB);
        this.selectedDayState = K.b.f119931a;
        IntRange intRangeX = RangesKt.x(0, 7);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeX, 10));
        Iterator<Integer> it = intRangeX.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            LocalDate localDatePlusDays = LocalDate.now().plusDays(iNextInt);
            Intrinsics.g(localDatePlusDays);
            arrayList.add(new TimeSlotDayDecorator(new FulfillmentDay(localDatePlusDays, CollectionsKt.m()), iNextInt == 0));
        }
        this.availableDayDecorators = arrayList;
    }

    public static /* synthetic */ void A(E e10, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        e10.y(num);
    }

    private final List<CustomerAddress> C(List<AccountAddress> addressList) {
        List<AccountAddress> list = addressList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (AccountAddress accountAddress : list) {
            String strValueOf = String.valueOf(accountAddress.getId());
            Country country = new Country("US", null, 2, null);
            boolean isPrimary = accountAddress.getIsPrimary();
            String name = accountAddress.getName();
            String firstName = accountAddress.getFirstName();
            String str = firstName == null ? "" : firstName;
            String lastName = accountAddress.getLastName();
            String str2 = lastName == null ? "" : lastName;
            String addressLine1 = accountAddress.getAddressLine1();
            String str3 = addressLine1 == null ? "" : addressLine1;
            String addressLine2 = accountAddress.getAddressLine2();
            String phoneNumber = accountAddress.getPhoneNumber();
            String zipCode = accountAddress.getZipCode();
            String str4 = zipCode == null ? "" : zipCode;
            Region region = new Region("US-" + accountAddress.getState(), null, accountAddress.getState(), null, 10, null);
            boolean z10 = accountAddress.getAddressType() == EnumC3241e.f7540d;
            String state = accountAddress.getState();
            String city = accountAddress.getCity();
            arrayList.add(new CustomerAddress(strValueOf, name, null, null, str, str2, null, str3, addressLine2, city == null ? "" : city, region, str4, country, phoneNumber, null, z10, false, isPrimary, false, state, 344140, null));
        }
        return arrayList;
    }

    private final void F(TimeSlotDayDecorator fulfillmentSlotDayDecorator) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        ArrayList arrayList;
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            subscriptionViewState = value;
            List<TimeSlotDayDecorator> listD = subscriptionViewState.d();
            arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            for (TimeSlotDayDecorator timeSlotDayDecorator : listD) {
                arrayList.add(Intrinsics.e(timeSlotDayDecorator, fulfillmentSlotDayDecorator) ? TimeSlotDayDecorator.b(timeSlotDayDecorator, null, true, 1, null) : TimeSlotDayDecorator.b(timeSlotDayDecorator, null, false, 1, null));
            }
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, null, null, 0, null, arrayList, null, 767, null)));
        this.selectedDayState = new K.Decorator(fulfillmentSlotDayDecorator);
    }

    private final void H(int frequency) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            subscriptionViewState = value;
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, frequency, null, null, null, null, null, null, null, null, null, null, 16375, null), null, 0, null, null, null, 1007, null)));
    }

    private final void I(int quantity) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        SubscriptionDecorator subscriptionDecorator;
        ProductInfoRequest productInfo;
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            subscriptionViewState = value;
            subscriptionDecorator = subscriptionViewState.getSubscriptionDecorator();
            productInfo = subscriptionViewState.getSubscriptionDecorator().getProductInfo();
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionDecorator, null, null, null, 0, null, null, null, null, productInfo != null ? ProductInfoRequest.b(productInfo, null, null, null, null, quantity, null, 47, null) : null, null, null, null, null, null, 16127, null), null, 0, null, null, null, 1007, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Throwable throwable) {
        SubscriptionViewState value;
        qw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(throwable), "Failed to load saved addresses", new Object[0]);
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(value, false, false, false, String.valueOf(throwable.getMessage()), null, null, 0, null, null, null, 1012, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(List<AccountAddress> savedAddresses) {
        SubscriptionViewState value;
        ArrayList arrayList = new ArrayList();
        for (Object obj : savedAddresses) {
            if (((AccountAddress) obj).getAddressType() == EnumC3241e.f7540d) {
                arrayList.add(obj);
            }
        }
        List<AccountAddress> listZ0 = CollectionsKt.Z0(arrayList, new h());
        if (listZ0.isEmpty()) {
            InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, SubscriptionViewState.b(value, false, false, false, null, null, CollectionsKt.m(), 0, null, null, null, 926, null)));
        } else {
            List<CustomerAddress> listC = C(listZ0);
            InterfaceC16549B<SubscriptionViewState> interfaceC16549B2 = this._viewState;
            while (true) {
                SubscriptionViewState value2 = interfaceC16549B2.getValue();
                List<AccountAddress> list = listZ0;
                if (interfaceC16549B2.e(value2, SubscriptionViewState.b(value2, false, false, false, null, null, listC, listZ0.size(), null, null, null, 926, null))) {
                    return;
                } else {
                    listZ0 = list;
                }
            }
        }
    }

    private final void L(String slotId) {
        FulfillmentDay timeSlotDay;
        Object next;
        K k10 = this.selectedDayState;
        if (k10 instanceof K.Decorator) {
            timeSlotDay = ((K.Decorator) k10).getDecorator().getTimeSlotDay();
        } else {
            if (!Intrinsics.e(k10, K.b.f119931a)) {
                throw new NoWhenBranchMatchedException();
            }
            timeSlotDay = null;
        }
        List<J> listH = this._viewState.getValue().h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (obj instanceof J.SlotItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((J.SlotItem) it.next()).getSlotDecorator());
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.e(((TimeSlotTimeDecorator) next).getSlot().getId(), slotId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TimeSlotTimeDecorator timeSlotTimeDecorator = (TimeSlotTimeDecorator) next;
        if (timeSlotTimeDecorator == null || timeSlotDay == null) {
            return;
        }
        DayOfWeek dayOfWeek = timeSlotDay.getDate().getDayOfWeek();
        Intrinsics.i(dayOfWeek, "getDayOfWeek(...)");
        PreferredTimeslotRequest preferredTimeslotRequest = new PreferredTimeslotRequest(dayOfWeek, timeSlotTimeDecorator.getSlot().getStartTime(), timeSlotTimeDecorator.getSlot().getEndTime());
        List<J> listH2 = this._viewState.getValue().h();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listH2, 10));
        for (Object objA : listH2) {
            if (objA instanceof J.SlotItem) {
                J.SlotItem slotItem = (J.SlotItem) objA;
                objA = slotItem.a(TimeSlotTimeDecorator.b(slotItem.getSlotDecorator(), null, Intrinsics.e(slotItem.getSlotDecorator().getSlot().getId(), slotId), 1, null));
            }
            arrayList3.add(objA);
        }
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        while (true) {
            SubscriptionViewState value = interfaceC16549B.getValue();
            SubscriptionViewState subscriptionViewState = value;
            PreferredTimeslotRequest preferredTimeslotRequest2 = preferredTimeslotRequest;
            ArrayList arrayList4 = arrayList3;
            if (interfaceC16549B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, 0, null, null, null, null, null, null, null, null, null, preferredTimeslotRequest2, 8191, null), null, 0, arrayList4, null, null, 879, null))) {
                return;
            }
            arrayList3 = arrayList4;
            preferredTimeslotRequest = preferredTimeslotRequest2;
        }
    }

    public final P<SubscriptionViewState> B() {
        return this.viewState;
    }

    public final void E(AbstractC13119k action) {
        SubscriptionViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC13119k.d) {
            C15809k.d(d0.a(this), null, null, new d(null), 3, null);
            return;
        }
        if (action instanceof AbstractC13119k.CancelAndNavigateToPDP) {
            v(((AbstractC13119k.CancelAndNavigateToPDP) action).getSubscriptionDetails());
            return;
        }
        if (action instanceof AbstractC13119k.f) {
            C15809k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (action instanceof AbstractC13119k.m) {
            return;
        }
        if (action instanceof AbstractC13119k.e) {
            C15809k.d(d0.a(this), null, null, new f(null), 3, null);
            return;
        }
        if (action instanceof AbstractC13119k.g) {
            C15809k.d(d0.a(this), null, null, new g(null), 3, null);
            return;
        }
        if (action instanceof AbstractC13119k.ChangeFrequency) {
            H(((AbstractC13119k.ChangeFrequency) action).getFrequency());
            return;
        }
        if (action instanceof AbstractC13119k.ChangeQuantity) {
            I(((AbstractC13119k.ChangeQuantity) action).getQuantity());
            return;
        }
        if (action instanceof AbstractC13119k.SaveSubscription) {
            N(((AbstractC13119k.SaveSubscription) action).getSubscriptionDecorator());
            return;
        }
        if (action instanceof AbstractC13119k.SetSelectedDeliveryAddress) {
            G(((AbstractC13119k.SetSelectedDeliveryAddress) action).getAddress());
            return;
        }
        if (action instanceof AbstractC13119k.SetSelectedDay) {
            F(((AbstractC13119k.SetSelectedDay) action).getFulfillmentSlotDayDecorator());
            return;
        }
        if (action instanceof AbstractC13119k.SetSelectedTimeSlot) {
            L(((AbstractC13119k.SetSelectedTimeSlot) action).getFulfillmentSlotId());
        } else {
            if (!(action instanceof AbstractC13119k.l)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, SubscriptionViewState.b(value, false, false, true, null, null, null, 0, null, null, null, 1019, null)));
        }
    }

    public final void M() {
        SubscriptionViewState value;
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(value, false, false, false, null, null, null, 0, null, null, null, 1019, null)));
    }

    public final void O(ProductFullDetails product) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        String code;
        String url;
        Intrinsics.j(product, "product");
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            subscriptionViewState = value;
            code = product.getCode();
            Image image = (Image) CollectionsKt.v0(product.j(), 0);
            url = image != null ? image.getUrl() : null;
            if (url == null) {
                url = "";
            }
        } while (!interfaceC16549B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, 0, null, null, null, new SimpleStoreSummary(product.getStoreId(), null, null, 0.0d, 14, null), new ProductInfoRequest(code, url, product.getName(), product.getPrice().getFormattedValue(), 0.0d, product.getUnit()), null, null, null, null, null, 15999, null), null, 0, null, null, null, 1007, null)));
    }

    public final List<TimeSlotTimeDecorator> P(List<String> labels) {
        Intrinsics.j(labels, "labels");
        List<String> list = labels;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (String str : list) {
            List listB1 = StringsKt.b1(str, new String[]{" - "}, false, 0, 6, null);
            String str2 = (String) listB1.get(0);
            String str3 = (String) listB1.get(1);
            String string = StringsKt.C1(str2).toString();
            Locale locale = Locale.ROOT;
            String upperCase = string.toUpperCase(locale);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            C17898a c17898a = C17898a.f167225a;
            LocalTime localTime = LocalTime.parse(upperCase, c17898a.C());
            String upperCase2 = StringsKt.C1(str3).toString().toUpperCase(locale);
            Intrinsics.i(upperCase2, "toUpperCase(...)");
            LocalTime localTime2 = LocalTime.parse(upperCase2, c17898a.C());
            Intrinsics.g(localTime);
            Intrinsics.g(localTime2);
            arrayList.add(new TimeSlotTimeDecorator(new FulfillmentSlot(str, localTime, localTime2, true), false, 2, null));
        }
        return arrayList;
    }

    public final List<J> u(List<TimeSlotTimeDecorator> morning, List<TimeSlotTimeDecorator> afternoon, List<TimeSlotTimeDecorator> evening) {
        Intrinsics.j(morning, "morning");
        Intrinsics.j(afternoon, "afternoon");
        Intrinsics.j(evening, "evening");
        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
        spreadBuilder.a(new J.HeaderItem(AbstractC6392a.INSTANCE.d(C15410d.f148769Z, new Object[0])));
        List<TimeSlotTimeDecorator> list = morning;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new J.SlotItem((TimeSlotTimeDecorator) it.next()));
        }
        spreadBuilder.b(arrayList.toArray(new J.SlotItem[0]));
        spreadBuilder.a(new J.HeaderItem(AbstractC6392a.INSTANCE.d(C15410d.f148776d, new Object[0])));
        List<TimeSlotTimeDecorator> list2 = afternoon;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new J.SlotItem((TimeSlotTimeDecorator) it2.next()));
        }
        spreadBuilder.b(arrayList2.toArray(new J.SlotItem[0]));
        spreadBuilder.a(new J.HeaderItem(AbstractC6392a.INSTANCE.d(C15410d.f148737C, new Object[0])));
        List<TimeSlotTimeDecorator> list3 = evening;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new J.SlotItem((TimeSlotTimeDecorator) it3.next()));
        }
        spreadBuilder.b(arrayList3.toArray(new J.SlotItem[0]));
        return CollectionsKt.r(spreadBuilder.d(new J[spreadBuilder.c()]));
    }

    public final InterfaceC16553F<C> x() {
        return this.screenFlow;
    }

    public final void y(Integer selectedDayIndex) {
        int iF;
        LocalDate localDateNow = LocalDate.now();
        if (selectedDayIndex != null) {
            iF = selectedDayIndex.intValue();
        } else {
            Iterator<TimeSlotDayDecorator> it = this.availableDayDecorators.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (it.next().getTimeSlotDay().getDate().isEqual(localDateNow)) {
                    break;
                } else {
                    i10++;
                }
            }
            iF = RangesKt.f(i10, 0);
        }
        List<TimeSlotDayDecorator> list = this.availableDayDecorators;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            arrayList.add(TimeSlotDayDecorator.b((TimeSlotDayDecorator) obj, null, i11 == iF, 1, null));
            i11 = i12;
        }
        this.selectedDayState = new K.Decorator((TimeSlotDayDecorator) arrayList.get(iF));
        List<J> listU = u(P(this.labelProvider.c()), P(this.labelProvider.a()), P(this.labelProvider.b()));
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        interfaceC16549B.setValue(SubscriptionViewState.b(interfaceC16549B.getValue(), false, false, false, null, null, null, 0, listU, arrayList, null, 638, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(C screen) {
        C15809k.d(d0.a(this), null, null, new c(screen, null), 3, null);
    }

    private final void G(CustomerAddress selectedAddresses) {
        CustomerDeliveryAddressRequest customerDeliveryAddressRequestA = C13118j.a(selectedAddresses);
        InterfaceC16549B<SubscriptionViewState> interfaceC16549B = this._viewState;
        while (true) {
            SubscriptionViewState value = interfaceC16549B.getValue();
            SubscriptionViewState subscriptionViewState = value;
            InterfaceC16549B<SubscriptionViewState> interfaceC16549B2 = interfaceC16549B;
            if (interfaceC16549B2.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, 0, null, null, null, null, null, null, customerDeliveryAddressRequestA, null, null, null, 15359, null), null, 0, null, null, null, 1007, null))) {
                return;
            } else {
                interfaceC16549B = interfaceC16549B2;
            }
        }
    }

    private final void N(SubscriptionDecorator decorator) {
        C15809k.d(d0.a(this), null, null, new i(decorator, null), 3, null);
    }

    private final void v(SubscriptionDetails subscriptionDetails) {
        C15809k.d(d0.a(this), null, null, new a(subscriptionDetails, null), 3, null);
    }

    public final void w() {
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }
}
