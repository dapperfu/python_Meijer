package mr;

import Dh.AccountAddress;
import Dh.EnumC3372e;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import androidx.view.c0;
import androidx.view.d0;
import ci.Country;
import ci.CustomerAddress;
import ci.Region;
import com.google.android.libraries.places.api.model.PlaceTypes;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kr.C15307d;
import mr.s;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u000e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020<0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020F0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010>R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020F0@8\u0006¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010>R\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0@8\u0006¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010DR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010>R\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0@8\u0006¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\bT\u0010DR\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010>R\u001f\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0@8\u0006¢\u0006\f\n\u0004\bY\u0010B\u001a\u0004\bZ\u0010DR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010>R\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020\\0@8\u0006¢\u0006\f\n\u0004\b_\u0010B\u001a\u0004\b`\u0010DR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020 0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lmr/a;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LBh/a;", "accountAddressesRepository", "Lth/k;", "paymentsRepository", "Lmr/t;", "labelProvider", "<init>", "(LBh/a;Lth/k;Lmr/t;)V", "", "LDh/a;", "savedAddresses", "", "y", "(Ljava/util/List;)V", "", "throwable", "x", "(Ljava/lang/Throwable;)V", "", "labels", "Lmr/u;", "D", "(Ljava/util/List;)Ljava/util/List;", "morning", "afternoon", "evening", "Lmr/s;", "q", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lmr/r;", "fulfillmentSlotDayDecorator", "C", "(Lmr/r;)V", "slotId", "B", "(Ljava/lang/String;)V", "r", "()V", "Lci/c;", PlaceTypes.ADDRESS, "A", "(Lci/c;)V", "", "selectedDayIndex", "t", "(Ljava/lang/Integer;)V", "Lmr/a$a;", "action", "w", "(Lmr/a$a;)V", "a", "LBh/a;", "b", "Lth/k;", "c", "Lmr/t;", "Ltv/B;", "Lmr/n;", "d", "Ltv/B;", "_viewDeliveryAddressesState", "Ltv/P;", "e", "Ltv/P;", "s", "()Ltv/P;", "deliveryAddressesViewState", "Lmr/P;", "f", "_viewTimeSlotsState", "g", "v", "timeSlotsViewState", "h", "_selectedDeliveryAddress", "i", "getSelectedDeliveryAddress", "selectedDeliveryAddress", "j", "_selectedDay", "k", "getSelectedDay", "selectedDay", "Lmr/s$b;", "l", "_selectedTimeSlot", "m", "getSelectedTimeSlot", "selectedTimeSlot", "Lmr/q;", "n", "_paymentsViewState", "o", "getPaymentsViewState", "paymentsViewState", "p", "Ljava/util/List;", "availableDayDecorators", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15689a extends c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.a accountAddressesRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final th.k paymentsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t labelProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<DeliveryAddressesViewState> _viewDeliveryAddressesState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tv.P<DeliveryAddressesViewState> deliveryAddressesViewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<TimeSlotsViewState> _viewTimeSlotsState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tv.P<TimeSlotsViewState> timeSlotsViewState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<CustomerAddress> _selectedDeliveryAddress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final tv.P<CustomerAddress> selectedDeliveryAddress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<TimeSlotDayDecorator> _selectedDay;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final tv.P<TimeSlotDayDecorator> selectedDay;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<s.SlotItem> _selectedTimeSlot;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final tv.P<s.SlotItem> selectedTimeSlot;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<PaymentsViewState> _paymentsViewState;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final tv.P<PaymentsViewState> paymentsViewState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final List<TimeSlotDayDecorator> availableDayDecorators;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmr/a$a;", "", "<init>", "()V", "b", "a", "Lmr/a$a$a;", "Lmr/a$a$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mr.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2318a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmr/a$a$a;", "Lmr/a$a;", "Lmr/r;", "fulfillmentSlotDayDecorator", "<init>", "(Lmr/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmr/r;", "()Lmr/r;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.a$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class SelectDay extends AbstractC2318a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TimeSlotDayDecorator fulfillmentSlotDayDecorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectDay) && Intrinsics.e(this.fulfillmentSlotDayDecorator, ((SelectDay) other).fulfillmentSlotDayDecorator);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectDay(TimeSlotDayDecorator fulfillmentSlotDayDecorator) {
                super(null);
                Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
                this.fulfillmentSlotDayDecorator = fulfillmentSlotDayDecorator;
            }

            /* renamed from: a, reason: from getter */
            public final TimeSlotDayDecorator getFulfillmentSlotDayDecorator() {
                return this.fulfillmentSlotDayDecorator;
            }

            public int hashCode() {
                return this.fulfillmentSlotDayDecorator.hashCode();
            }

            public String toString() {
                return "SelectDay(fulfillmentSlotDayDecorator=" + this.fulfillmentSlotDayDecorator + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lmr/a$a$b;", "Lmr/a$a;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "fulfillmentSlotId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mr.a$a$b, reason: from toString */
        public static final /* data */ class SelectTimeSlot extends AbstractC2318a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fulfillmentSlotId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectTimeSlot) && Intrinsics.e(this.fulfillmentSlotId, ((SelectTimeSlot) other).fulfillmentSlotId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectTimeSlot(String fulfillmentSlotId) {
                super(null);
                Intrinsics.j(fulfillmentSlotId, "fulfillmentSlotId");
                this.fulfillmentSlotId = fulfillmentSlotId;
            }

            /* renamed from: a, reason: from getter */
            public final String getFulfillmentSlotId() {
                return this.fulfillmentSlotId;
            }

            public int hashCode() {
                return this.fulfillmentSlotId.hashCode();
            }

            public String toString() {
                return "SelectTimeSlot(fulfillmentSlotId=" + this.fulfillmentSlotId + ')';
            }
        }

        public /* synthetic */ AbstractC2318a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2318a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.checkout.CheckoutSubscriptionViewModel$fetchDeliveryAddresses$1", f = "CheckoutSubscriptionViewModel.kt", l = {70}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: mr.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f150622a;

        /* renamed from: b, reason: collision with root package name */
        Object f150623b;

        /* renamed from: c, reason: collision with root package name */
        Object f150624c;

        /* renamed from: d, reason: collision with root package name */
        Object f150625d;

        /* renamed from: e, reason: collision with root package name */
        int f150626e;

        /* renamed from: f, reason: collision with root package name */
        int f150627f;

        /* renamed from: g, reason: collision with root package name */
        int f150628g;

        /* renamed from: h, reason: collision with root package name */
        int f150629h;

        /* renamed from: i, reason: collision with root package name */
        int f150630i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f150631j;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C15689a.this.new b(continuation);
            bVar.f150631j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v9, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f150630i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f150631j;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f150631j;
                    InterfaceC17140B interfaceC17140B = C15689a.this._viewDeliveryAddressesState;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, DeliveryAddressesViewState.b((DeliveryAddressesViewState) value, true, null, 0, false, null, 30, null)));
                    C15689a c15689a = C15689a.this;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.a aVar = c15689a.accountAddressesRepository;
                    this.f150631j = r14;
                    this.f150622a = r14;
                    this.f150623b = this;
                    this.f150624c = this;
                    this.f150625d = r14;
                    this.f150626e = 0;
                    this.f150627f = 0;
                    this.f150628g = 0;
                    this.f150629h = 0;
                    this.f150630i = 1;
                    obj = aVar.c(this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
                r12 = i10;
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
                r12 = i10;
            }
            C15689a c15689a2 = C15689a.this;
            if (Result.h(objB)) {
                c15689a2.y((List) objB);
            }
            C15689a c15689a3 = C15689a.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    c15689a3.x(thE);
                } else {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: mr.a$c */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    public C15689a(Bh.a accountAddressesRepository, th.k paymentsRepository, t labelProvider) {
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(labelProvider, "labelProvider");
        this.accountAddressesRepository = accountAddressesRepository;
        this.paymentsRepository = paymentsRepository;
        this.labelProvider = labelProvider;
        InterfaceC17140B<DeliveryAddressesViewState> interfaceC17140BA = S.a(new DeliveryAddressesViewState(false, null, 0, false, null, 31, null));
        this._viewDeliveryAddressesState = interfaceC17140BA;
        this.deliveryAddressesViewState = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<TimeSlotsViewState> interfaceC17140BA2 = S.a(new TimeSlotsViewState(false, null, null, false, null, 31, null));
        this._viewTimeSlotsState = interfaceC17140BA2;
        this.timeSlotsViewState = C17154h.c(interfaceC17140BA2);
        InterfaceC17140B<CustomerAddress> interfaceC17140BA3 = S.a(null);
        this._selectedDeliveryAddress = interfaceC17140BA3;
        this.selectedDeliveryAddress = C17154h.c(interfaceC17140BA3);
        InterfaceC17140B<TimeSlotDayDecorator> interfaceC17140BA4 = S.a(null);
        this._selectedDay = interfaceC17140BA4;
        this.selectedDay = C17154h.c(interfaceC17140BA4);
        InterfaceC17140B<s.SlotItem> interfaceC17140BA5 = S.a(null);
        this._selectedTimeSlot = interfaceC17140BA5;
        this.selectedTimeSlot = C17154h.c(interfaceC17140BA5);
        InterfaceC17140B<PaymentsViewState> interfaceC17140BA6 = S.a(new PaymentsViewState(false, null, false, null, 15, null));
        this._paymentsViewState = interfaceC17140BA6;
        this.paymentsViewState = C17154h.c(interfaceC17140BA6);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void B(String slotId) {
        List<s> listD = this._viewTimeSlotsState.getValue().d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        for (Object objA : listD) {
            if (objA instanceof s.SlotItem) {
                s.SlotItem slotItem = (s.SlotItem) objA;
                boolean zE = Intrinsics.e(slotItem.getSlotDecorator().getSlot().getId(), slotId);
                if (zE) {
                    this._selectedTimeSlot.setValue(objA);
                }
                objA = slotItem.a(TimeSlotTimeDecorator.b(slotItem.getSlotDecorator(), null, zE, 1, null));
            }
            arrayList.add(objA);
        }
        InterfaceC17140B<TimeSlotsViewState> interfaceC17140B = this._viewTimeSlotsState;
        interfaceC17140B.setValue(TimeSlotsViewState.b(interfaceC17140B.getValue(), false, arrayList, null, false, null, 29, null));
    }

    private final void C(TimeSlotDayDecorator fulfillmentSlotDayDecorator) {
        TimeSlotsViewState value;
        TimeSlotsViewState timeSlotsViewState;
        ArrayList arrayList;
        InterfaceC17140B<TimeSlotsViewState> interfaceC17140B = this._viewTimeSlotsState;
        do {
            value = interfaceC17140B.getValue();
            timeSlotsViewState = value;
            List<TimeSlotDayDecorator> listC = timeSlotsViewState.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            for (TimeSlotDayDecorator timeSlotDayDecorator : listC) {
                arrayList.add(Intrinsics.e(timeSlotDayDecorator, fulfillmentSlotDayDecorator) ? TimeSlotDayDecorator.b(timeSlotDayDecorator, null, true, 1, null) : TimeSlotDayDecorator.b(timeSlotDayDecorator, null, false, 1, null));
            }
        } while (!interfaceC17140B.e(value, TimeSlotsViewState.b(timeSlotsViewState, false, null, arrayList, false, null, 27, null)));
        this._selectedDay.setValue(fulfillmentSlotDayDecorator);
    }

    private final List<TimeSlotTimeDecorator> D(List<String> labels) {
        List<String> list = labels;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (String str : list) {
            LocalTime MIDNIGHT = LocalTime.MIDNIGHT;
            Intrinsics.i(MIDNIGHT, "MIDNIGHT");
            Intrinsics.i(MIDNIGHT, "MIDNIGHT");
            arrayList.add(new TimeSlotTimeDecorator(new FulfillmentSlot(str, MIDNIGHT, MIDNIGHT, true), false, 2, null));
        }
        return arrayList;
    }

    private final List<s> q(List<TimeSlotTimeDecorator> morning, List<TimeSlotTimeDecorator> afternoon, List<TimeSlotTimeDecorator> evening) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
        spreadBuilder.a(new s.HeaderItem(AbstractC5607a.INSTANCE.d(C15307d.f147859Z, new Object[0])));
        List<TimeSlotTimeDecorator> list = morning;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new s.SlotItem((TimeSlotTimeDecorator) it.next()));
        }
        spreadBuilder.b(arrayList.toArray(new s.SlotItem[0]));
        spreadBuilder.a(new s.HeaderItem(AbstractC5607a.INSTANCE.d(C15307d.f147866d, new Object[0])));
        List<TimeSlotTimeDecorator> list2 = afternoon;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new s.SlotItem((TimeSlotTimeDecorator) it2.next()));
        }
        spreadBuilder.b(arrayList2.toArray(new s.SlotItem[0]));
        spreadBuilder.a(new s.HeaderItem(AbstractC5607a.INSTANCE.d(C15307d.f147829C, new Object[0])));
        List<TimeSlotTimeDecorator> list3 = evening;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new s.SlotItem((TimeSlotTimeDecorator) it3.next()));
        }
        spreadBuilder.b(arrayList3.toArray(new s.SlotItem[0]));
        return CollectionsKt.r(spreadBuilder.d(new s[spreadBuilder.c()]));
    }

    public static /* synthetic */ void u(C15689a c15689a, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        c15689a.t(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Throwable throwable) {
        DeliveryAddressesViewState value;
        uw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(throwable), "Failed to load saved addresses", new Object[0]);
        InterfaceC17140B<DeliveryAddressesViewState> interfaceC17140B = this._viewDeliveryAddressesState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, DeliveryAddressesViewState.b(value, false, null, 0, false, String.valueOf(throwable.getMessage()), 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(List<AccountAddress> savedAddresses) {
        DeliveryAddressesViewState value;
        DeliveryAddressesViewState value2;
        DeliveryAddressesViewState deliveryAddressesViewState;
        int size;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : savedAddresses) {
            if (((AccountAddress) obj).getAddressType() == EnumC3372e.f6514d) {
                arrayList2.add(obj);
            }
        }
        List listZ0 = CollectionsKt.Z0(arrayList2, new c());
        if (listZ0.isEmpty()) {
            InterfaceC17140B<DeliveryAddressesViewState> interfaceC17140B = this._viewDeliveryAddressesState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, DeliveryAddressesViewState.b(value, false, CollectionsKt.m(), 0, false, null, 24, null)));
            return;
        }
        InterfaceC17140B<DeliveryAddressesViewState> interfaceC17140B2 = this._viewDeliveryAddressesState;
        do {
            value2 = interfaceC17140B2.getValue();
            deliveryAddressesViewState = value2;
            size = listZ0.size();
            List<AccountAddress> list = listZ0;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
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
                boolean z10 = accountAddress.getAddressType() == EnumC3372e.f6514d;
                String city = accountAddress.getCity();
                arrayList.add(new CustomerAddress(strValueOf, name, null, null, str, str2, null, str3, addressLine2, city == null ? "" : city, region, str4, country, phoneNumber, null, z10, false, isPrimary, false, 344140, null));
            }
        } while (!interfaceC17140B2.e(value2, DeliveryAddressesViewState.b(deliveryAddressesViewState, false, arrayList, size, false, null, 24, null)));
    }

    public final void A(CustomerAddress address) {
        Intrinsics.j(address, "address");
        this._selectedDeliveryAddress.setValue(address);
    }

    public final tv.P<DeliveryAddressesViewState> s() {
        return this.deliveryAddressesViewState;
    }

    public final tv.P<TimeSlotsViewState> v() {
        return this.timeSlotsViewState;
    }

    public final void w(AbstractC2318a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC2318a.SelectTimeSlot) {
            B(((AbstractC2318a.SelectTimeSlot) action).getFulfillmentSlotId());
        } else {
            if (!(action instanceof AbstractC2318a.SelectDay)) {
                throw new NoWhenBranchMatchedException();
            }
            C(((AbstractC2318a.SelectDay) action).getFulfillmentSlotDayDecorator());
        }
    }

    public final void r() {
        C16648k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final void t(Integer selectedDayIndex) {
        int iF;
        boolean z10;
        LocalDate localDateNow = LocalDate.now();
        if (selectedDayIndex != null) {
            iF = selectedDayIndex.intValue();
        } else {
            Iterator<TimeSlotDayDecorator> it = this.availableDayDecorators.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getTimeSlotDay().getDate().isEqual(localDateNow)) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
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
            TimeSlotDayDecorator timeSlotDayDecorator = (TimeSlotDayDecorator) obj;
            if (i11 == iF) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(TimeSlotDayDecorator.b(timeSlotDayDecorator, null, z10, 1, null));
            i11 = i12;
        }
        List<s> listQ = q(D(this.labelProvider.c()), D(this.labelProvider.a()), D(this.labelProvider.b()));
        InterfaceC17140B<TimeSlotsViewState> interfaceC17140B = this._viewTimeSlotsState;
        interfaceC17140B.setValue(TimeSlotsViewState.b(interfaceC17140B.getValue(), false, listQ, arrayList, false, null, 24, null));
    }
}
