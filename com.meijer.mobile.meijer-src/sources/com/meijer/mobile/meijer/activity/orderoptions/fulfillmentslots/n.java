package com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots;

import Cm.FulfillmentSlotDayDecorator;
import Ik.Validation;
import androidx.view.c0;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import ev.C13889a;
import fj.ShoppingCart;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import qw.a;
import ul.FulfillmentDay;
import ul.FulfillmentSchedule;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n;", "Landroidx/lifecycle/c0;", "Ltl/h;", "timeSlotRepository", "Lil/m;", "cartRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Ltl/h;Lil/m;Lmv/K;)V", "", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "fulfillmentStateDetails", "", "v", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;)V", "", "isLoading", "b", "(Z)V", "onCleared", "()V", "LCm/m;", "fulfillmentSlotDayDecorator", "H", "(LCm/m;)V", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a;", "action", "G", "(Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a;)V", "a", "Ltl/h;", "Lil/m;", "c", "Lmv/K;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "d", "Lpv/B;", "_viewState", "Lpv/P;", "e", "Lpv/P;", "F", "()Lpv/P;", "viewState", "LJu/a;", "f", "LJu/a;", "disposables", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class n extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<FulfillmentSlotsViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<FulfillmentSlotsViewState> viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a;", "", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "fulfillmentStateDetails", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "()Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class FetchFulfillmentSchedule extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deliveryMode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final FulfillmentStateDetails fulfillmentStateDetails;

            public FetchFulfillmentSchedule(String str, FulfillmentStateDetails fulfillmentStateDetails) {
                super(null);
                this.deliveryMode = str;
                this.fulfillmentStateDetails = fulfillmentStateDetails;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchFulfillmentSchedule)) {
                    return false;
                }
                FetchFulfillmentSchedule fetchFulfillmentSchedule = (FetchFulfillmentSchedule) other;
                return Intrinsics.e(this.deliveryMode, fetchFulfillmentSchedule.deliveryMode) && Intrinsics.e(this.fulfillmentStateDetails, fetchFulfillmentSchedule.fulfillmentStateDetails);
            }

            public int hashCode() {
                String str = this.deliveryMode;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                FulfillmentStateDetails fulfillmentStateDetails = this.fulfillmentStateDetails;
                return iHashCode + (fulfillmentStateDetails != null ? fulfillmentStateDetails.hashCode() : 0);
            }

            public String toString() {
                return "FetchFulfillmentSchedule(deliveryMode=" + this.deliveryMode + ", fulfillmentStateDetails=" + this.fulfillmentStateDetails + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getDeliveryMode() {
                return this.deliveryMode;
            }

            /* renamed from: b, reason: from getter */
            public final FulfillmentStateDetails getFulfillmentStateDetails() {
                return this.fulfillmentStateDetails;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a$b;", "Lcom/meijer/mobile/meijer/activity/orderoptions/fulfillmentslots/n$a;", "LCm/m;", "fulfillmentSlotDayDecorator", "<init>", "(LCm/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCm/m;", "()LCm/m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n$a$b, reason: from toString */
        public static final /* data */ class SelectDay extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectDay) && Intrinsics.e(this.fulfillmentSlotDayDecorator, ((SelectDay) other).fulfillmentSlotDayDecorator);
            }

            public int hashCode() {
                return this.fulfillmentSlotDayDecorator.hashCode();
            }

            public String toString() {
                return "SelectDay(fulfillmentSlotDayDecorator=" + this.fulfillmentSlotDayDecorator + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectDay(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
                super(null);
                Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
                this.fulfillmentSlotDayDecorator = fulfillmentSlotDayDecorator;
            }

            /* renamed from: a, reason: from getter */
            public final FulfillmentSlotDayDecorator getFulfillmentSlotDayDecorator() {
                return this.fulfillmentSlotDayDecorator;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/d;", "<anonymous>", "(Lmv/O;)Lul/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsViewModel$getFulfillmentSchedule$2$1", f = "OrderOptionsFulfillmentSlotsViewModel.kt", l = {67}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FulfillmentSchedule>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110802a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ uk.c<ShoppingCart> f110804c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f110805d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FulfillmentStateDetails f110806e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new b(this.f110804c, this.f110805d, this.f110806e, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uk.c<ShoppingCart> cVar, String str, FulfillmentStateDetails fulfillmentStateDetails, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f110804c = cVar;
            this.f110805d = str;
            this.f110806e = fulfillmentStateDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FulfillmentSchedule> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r58) {
            /*
                Method dump skipped, instructions count: 545
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void v(final String deliveryMode, final FulfillmentStateDetails fulfillmentStateDetails) {
        b(true);
        io.reactivex.l<uk.c<ShoppingCart>> lVarSubscribeOn = this.cartRepository.b().take(1L).subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n.w((uk.c) obj));
            }
        };
        io.reactivex.l<uk.c<ShoppingCart>> lVarFilter = lVarSubscribeOn.filter(new Lu.q() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.g
            @Override // Lu.q
            public final boolean test(Object obj) {
                return n.x(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.B(this.f110785a, deliveryMode, fulfillmentStateDetails, (uk.c) obj);
            }
        };
        io.reactivex.l<R> lVarFlatMapSingle = lVarFilter.flatMapSingle(new Lu.o() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.i
            @Override // Lu.o
            public final Object apply(Object obj) {
                return n.C(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.D(this.f110789a, (FulfillmentSchedule) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.k
            @Override // Lu.g
            public final void accept(Object obj) {
                n.E(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.y(this.f110791a, (Throwable) obj);
            }
        };
        Dk.a.a(lVarFlatMapSingle.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.m
            @Override // Lu.g
            public final void accept(Object obj) {
                n.A(function14, obj);
            }
        }), this.disposables);
    }

    public n(tl.h timeSlotRepository, il.m cartRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.timeSlotRepository = timeSlotRepository;
        this.cartRepository = cartRepository;
        this.ioDispatcher = ioDispatcher;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549BA = S.a(new FulfillmentSlotsViewState(false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131071, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.disposables = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y B(n nVar, String str, FulfillmentStateDetails fulfillmentStateDetails, uk.c cartResource) {
        Intrinsics.j(cartResource, "cartResource");
        return tv.n.b(nVar.ioDispatcher, nVar.new b(cartResource, str, fulfillmentStateDetails, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y C(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (y) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(n nVar, FulfillmentSchedule fulfillmentSchedule) {
        FulfillmentSlotsViewState value;
        FulfillmentSlotsViewState fulfillmentSlotsViewState;
        ArrayList arrayList;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = nVar._viewState;
        do {
            value = interfaceC16549B.getValue();
            fulfillmentSlotsViewState = value;
            List<FulfillmentDay> listC = fulfillmentSchedule.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    break;
                }
                FulfillmentDay fulfillmentDay = (FulfillmentDay) it.next();
                Iterator<T> it2 = fulfillmentSchedule.c().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((FulfillmentDay) next).e()) {
                            obj = next;
                            break;
                        }
                    }
                }
                arrayList.add(new FulfillmentSlotDayDecorator(fulfillmentDay, Intrinsics.e(obj, fulfillmentDay)));
            }
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState, false, null, new Validation(arrayList, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131059, null)));
        return Unit.f143329a;
    }

    private final void b(boolean isLoading) {
        FulfillmentSlotsViewState value;
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, null, isLoading, false, null, null, null, false, false, null, false, false, null, null, null, null, 131063, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(uk.c cartResource) {
        Intrinsics.j(cartResource, "cartResource");
        return cartResource.a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(n nVar, Throwable th2) {
        FulfillmentSlotsViewState value;
        a.Companion companion = qw.a.INSTANCE;
        Intrinsics.g(th2);
        companion.f(com.meijer.mobile.core.networking.exceptions.a.a(th2), "Failed to fetch fulfillmentSchedule", new Object[0]);
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = nVar._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(value, false, null, new Validation(CollectionsKt.m(), null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131059, null)));
        return Unit.f143329a;
    }

    public final P<FulfillmentSlotsViewState> F() {
        return this.viewState;
    }

    public final void G(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.FetchFulfillmentSchedule) {
            a.FetchFulfillmentSchedule fetchFulfillmentSchedule = (a.FetchFulfillmentSchedule) action;
            v(fetchFulfillmentSchedule.getDeliveryMode(), fetchFulfillmentSchedule.getFulfillmentStateDetails());
        } else {
            if (!(action instanceof a.SelectDay)) {
                throw new NoWhenBranchMatchedException();
            }
            H(((a.SelectDay) action).getFulfillmentSlotDayDecorator());
        }
    }

    public final void H(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        FulfillmentSlotsViewState value;
        FulfillmentSlotsViewState fulfillmentSlotsViewState;
        ArrayList arrayList;
        Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
        InterfaceC16549B<FulfillmentSlotsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            fulfillmentSlotsViewState = value;
            List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewState.F().e();
            arrayList = new ArrayList(CollectionsKt.x(listE, 10));
            for (FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator2 : listE) {
                arrayList.add(Intrinsics.e(fulfillmentSlotDayDecorator2, fulfillmentSlotDayDecorator) ? FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecorator2, null, true, 1, null) : FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecorator2, null, false, 1, null));
            }
        } while (!interfaceC16549B.e(value, FulfillmentSlotsViewState.m(fulfillmentSlotsViewState, false, null, new Validation(arrayList, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null)));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
