package Cm;

import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.q2;
import com.meijer.mobile.meijer.Y;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jj.FulfillmentSlot;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ul.FulfillmentDay;
import wk.C17898a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001b\u0010&\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\fR\u001b\u0010)\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001b\u0010,\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR!\u00102\u001a\b\u0012\u0004\u0012\u00020.0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u00101R!\u00105\u001a\b\u0012\u0004\u0012\u00020.0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u00101R!\u00108\u001a\b\u0012\u0004\u0012\u00020.0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u00101R!\u0010;\u001a\b\u0012\u0004\u0012\u00020.0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u00101R\u001d\u0010>\u001a\u0004\u0018\u00010\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001fR\u001d\u0010A\u001a\u0004\u0018\u00010\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b@\u0010\u001fR\u0011\u0010C\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u001aR\u0013\u0010G\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000f¨\u0006K"}, d2 = {"LCm/m;", "", "Lul/c;", "timeSlotDay", "", "isDaySelected", "<init>", "(Lul/c;Z)V", "o", "(Lul/c;Z)LCm/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lul/c;", "I", "()Lul/c;", "b", "Z", "J", "()Z", "Lbk/a;", "c", "Lkotlin/Lazy;", "A", "()Lbk/a;", "dayDate", "d", "C", "dayDayOfWeek", "e", "E", "monthShortAndDay", "f", "B", "dayDateInWords", "g", "z", "currentSelection", "", "LCm/q;", "h", "F", "()Ljava/util/List;", "morningSlots", "i", "v", "afternoonSlots", "j", "x", "afternoonSlotsRedesigned", "k", "D", "eveningSlots", "l", "G", "morningSlotsAvailableCount", "m", "w", "afternoonSlotsAvailableCount", "K", "isEnabled", "Ljj/c;", "H", "()Ljj/c;", "selectedTimeSlot", "y", "availableSlotCount", "n", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Cm.m, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentSlotDayDecorator {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f5208o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentDay timeSlotDay;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDaySelected;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy dayDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy dayDayOfWeek;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy monthShortAndDay;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy dayDateInWords;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy currentSelection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy morningSlots;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy afternoonSlots;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy afternoonSlotsRedesigned;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy eveningSlots;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy morningSlotsAvailableCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy afternoonSlotsAvailableCount;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LCm/m$a;", "", "<init>", "()V", "j$/time/LocalDate", "date", "", "useShortDayOfWeek", "", "a", "(Lj$/time/LocalDate;Z)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cm.m$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String b(Companion companion, LocalDate localDate, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(localDate, z10);
        }

        public final String a(LocalDate date, boolean useShortDayOfWeek) {
            Intrinsics.j(date, "date");
            String str = date.format(C17898a.f167225a.b(useShortDayOfWeek));
            Intrinsics.g(str);
            return date.atStartOfDay().isEqual(LocalDate.now().atStartOfDay()) ? "Today" : ((String[]) StringsKt.b1(str, new String[]{","}, false, 0, 6, null).toArray(new String[0]))[0];
        }
    }

    public FulfillmentSlotDayDecorator(FulfillmentDay timeSlotDay, boolean z10) {
        Intrinsics.j(timeSlotDay, "timeSlotDay");
        this.timeSlotDay = timeSlotDay;
        this.isDaySelected = z10;
        this.dayDate = LazyKt.b(new Function0() { // from class: Cm.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.s(this.f5196a);
            }
        });
        this.dayDayOfWeek = LazyKt.b(new Function0() { // from class: Cm.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.t(this.f5199a);
            }
        });
        this.monthShortAndDay = LazyKt.b(new Function0() { // from class: Cm.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.L(this.f5200a);
            }
        });
        this.dayDateInWords = LazyKt.b(new Function0() { // from class: Cm.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.r(this.f5201a);
            }
        });
        this.currentSelection = LazyKt.b(new Function0() { // from class: Cm.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.q(this.f5202a);
            }
        });
        this.morningSlots = LazyKt.b(new Function0() { // from class: Cm.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.N(this.f5203a);
            }
        });
        this.afternoonSlots = LazyKt.b(new Function0() { // from class: Cm.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.n(this.f5204a);
            }
        });
        this.afternoonSlotsRedesigned = LazyKt.b(new Function0() { // from class: Cm.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.m(this.f5205a);
            }
        });
        this.eveningSlots = LazyKt.b(new Function0() { // from class: Cm.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.u(this.f5206a);
            }
        });
        this.morningSlotsAvailableCount = LazyKt.b(new Function0() { // from class: Cm.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.M(this.f5197a);
            }
        });
        this.afternoonSlotsAvailableCount = LazyKt.b(new Function0() { // from class: Cm.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotDayDecorator.l(this.f5198a);
            }
        });
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotDayDecorator)) {
            return false;
        }
        FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) other;
        return Intrinsics.e(this.timeSlotDay, fulfillmentSlotDayDecorator.timeSlotDay) && this.isDaySelected == fulfillmentSlotDayDecorator.isDaySelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String L(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        return fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.SHORT_MONTH_WITH_DAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a M(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        return AbstractC6392a.INSTANCE.d(Y.f100908eh, String.valueOf(fulfillmentSlotDayDecorator.F().size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        List<FulfillmentSlot> listD = fulfillmentSlotDayDecorator.timeSlotDay.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((FulfillmentSlot) obj).s()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((FulfillmentSlot) obj2).getStartTime().getHour() < 12) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new FulfillmentSlotTimeDecorator((FulfillmentSlot) it.next()));
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a l(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        return AbstractC6392a.INSTANCE.d(Y.f100908eh, String.valueOf(fulfillmentSlotDayDecorator.v().size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        List<FulfillmentSlot> listD = fulfillmentSlotDayDecorator.timeSlotDay.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((FulfillmentSlot) obj).s()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            int hour = ((FulfillmentSlot) obj2).getStartTime().getHour();
            if (12 <= hour && hour < 17) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new FulfillmentSlotTimeDecorator((FulfillmentSlot) it.next()));
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        List<FulfillmentSlot> listD = fulfillmentSlotDayDecorator.timeSlotDay.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((FulfillmentSlot) obj).s()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((FulfillmentSlot) obj2).getStartTime().getHour() >= 12) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new FulfillmentSlotTimeDecorator((FulfillmentSlot) it.next()));
        }
        return arrayList3;
    }

    public static /* synthetic */ FulfillmentSlotDayDecorator p(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator, FulfillmentDay fulfillmentDay, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fulfillmentDay = fulfillmentSlotDayDecorator.timeSlotDay;
        }
        if ((i10 & 2) != 0) {
            z10 = fulfillmentSlotDayDecorator.isDaySelected;
        }
        return fulfillmentSlotDayDecorator.o(fulfillmentDay, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a r(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        String str = fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.NUMERIC_MONTH_DAY);
        Intrinsics.i(str, "format(...)");
        List listB1 = StringsKt.b1(str, new String[]{q2.f93563c}, false, 0, 6, null);
        if (fulfillmentSlotDayDecorator.isDaySelected) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return companion.d(Y.f101156r6, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), listB1.get(0), listB1.get(1), companion.d(Y.f101196t6, new Object[0]));
        }
        if (fulfillmentSlotDayDecorator.K()) {
            return AbstractC6392a.INSTANCE.d(Y.f101176s6, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), listB1.get(0), listB1.get(1));
        }
        AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
        return companion2.d(Y.f101156r6, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), listB1.get(0), listB1.get(1), companion2.d(Y.f101216u6, new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        return INSTANCE.a(fulfillmentSlotDayDecorator.timeSlotDay.getDate(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        List<FulfillmentSlot> listD = fulfillmentSlotDayDecorator.timeSlotDay.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((FulfillmentSlot) obj).s()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((FulfillmentSlot) obj2).getStartTime().getHour() >= 17) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new FulfillmentSlotTimeDecorator((FulfillmentSlot) it.next()));
        }
        return arrayList3;
    }

    public final AbstractC6392a A() {
        return (AbstractC6392a) this.dayDate.getValue();
    }

    public final AbstractC6392a B() {
        return (AbstractC6392a) this.dayDateInWords.getValue();
    }

    public final String C() {
        return (String) this.dayDayOfWeek.getValue();
    }

    public final List<FulfillmentSlotTimeDecorator> D() {
        return (List) this.eveningSlots.getValue();
    }

    public final String E() {
        Object value = this.monthShortAndDay.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (String) value;
    }

    public final List<FulfillmentSlotTimeDecorator> F() {
        return (List) this.morningSlots.getValue();
    }

    public final AbstractC6392a G() {
        return (AbstractC6392a) this.morningSlotsAvailableCount.getValue();
    }

    public final FulfillmentSlot H() {
        Object next;
        Iterator<T> it = this.timeSlotDay.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfillmentSlot) next).getIsSlotSelected()) {
                break;
            }
        }
        return (FulfillmentSlot) next;
    }

    /* renamed from: I, reason: from getter */
    public final FulfillmentDay getTimeSlotDay() {
        return this.timeSlotDay;
    }

    /* renamed from: J, reason: from getter */
    public final boolean getIsDaySelected() {
        return this.isDaySelected;
    }

    public final boolean K() {
        return this.timeSlotDay.e();
    }

    public int hashCode() {
        return (this.timeSlotDay.hashCode() * 31) + Boolean.hashCode(this.isDaySelected);
    }

    public final FulfillmentSlotDayDecorator o(FulfillmentDay timeSlotDay, boolean isDaySelected) {
        Intrinsics.j(timeSlotDay, "timeSlotDay");
        return new FulfillmentSlotDayDecorator(timeSlotDay, isDaySelected);
    }

    public String toString() {
        return "FulfillmentSlotDayDecorator(timeSlotDay=" + this.timeSlotDay + ", isDaySelected=" + this.isDaySelected + ')';
    }

    public final List<FulfillmentSlotTimeDecorator> v() {
        return (List) this.afternoonSlots.getValue();
    }

    public final AbstractC6392a w() {
        return (AbstractC6392a) this.afternoonSlotsAvailableCount.getValue();
    }

    public final List<FulfillmentSlotTimeDecorator> x() {
        return (List) this.afternoonSlotsRedesigned.getValue();
    }

    public final AbstractC6392a z() {
        return (AbstractC6392a) this.currentSelection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a q(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        if (fulfillmentSlotDayDecorator.K()) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = Y.f100888dh;
            String strB = Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null);
            String str = fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.NUMERIC_MONTH_DAY);
            for (FulfillmentSlot fulfillmentSlot : fulfillmentSlotDayDecorator.timeSlotDay.d()) {
                if (fulfillmentSlot.getIsSlotSelected()) {
                    return companion.d(i10, strB, str, new FulfillmentSlotTimeDecorator(fulfillmentSlot).f());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
        return companion2.d(Y.f100713Ug, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.NUMERIC_MONTH_DAY), companion2.d(Y.f101216u6, new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a s(FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator) {
        if (fulfillmentSlotDayDecorator.K()) {
            return AbstractC6392a.INSTANCE.d(Y.f100732Vg, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.NUMERIC_MONTH_DAY));
        }
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        return companion.d(Y.f100713Ug, Companion.b(INSTANCE, fulfillmentSlotDayDecorator.timeSlotDay.getDate(), false, 2, null), fulfillmentSlotDayDecorator.timeSlotDay.getDate().format(C17898a.NUMERIC_MONTH_DAY), companion.d(Y.f101216u6, new Object[0]));
    }

    public final int y() {
        return F().size() + v().size();
    }

    public /* synthetic */ FulfillmentSlotDayDecorator(FulfillmentDay fulfillmentDay, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fulfillmentDay, (i10 & 2) != 0 ? false : z10);
    }
}
