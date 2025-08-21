package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Cm.FulfillmentSlotDayDecorator;
import Cm.FulfillmentSlotErrorDecorator;
import Ik.Validation;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.G1;
import fj.AvailableFulfillmentEligibility;
import fj.DeliveryMode;
import fj.ShoppingCart;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jj.FulfillmentSlot;
import kl.CheckoutState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ul.FulfillmentDay;
import ul.FulfillmentSchedule;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/V;", "LEk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "Lul/d;", "fulfillmentSchedule", "Lkl/v;", "checkoutState", "", "isBopasEnabled", "isTimeslotRedesigned", "<init>", "(Lul/d;Lkl/v;ZZ)V", "Ljj/c;", "bopasSlot", "", "bopasSlotIndex", "d", "(Lul/d;Ljj/c;Ljava/lang/Integer;)Lul/d;", "oldState", "e", "(Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;)Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "b", "Lul/d;", "c", "Lkl/v;", "Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class V extends Ek.b<FulfillmentSlotsViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FulfillmentSchedule fulfillmentSchedule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CheckoutState checkoutState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isBopasEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isTimeslotRedesigned;

    public V(FulfillmentSchedule fulfillmentSchedule, CheckoutState checkoutState, boolean z10, boolean z11) {
        Intrinsics.j(fulfillmentSchedule, "fulfillmentSchedule");
        Intrinsics.j(checkoutState, "checkoutState");
        this.fulfillmentSchedule = fulfillmentSchedule;
        this.checkoutState = checkoutState;
        this.isBopasEnabled = z10;
        this.isTimeslotRedesigned = z11;
    }

    private final FulfillmentSchedule d(FulfillmentSchedule fulfillmentSchedule, FulfillmentSlot bopasSlot, Integer bopasSlotIndex) {
        if (bopasSlot == null) {
            return fulfillmentSchedule;
        }
        List<FulfillmentDay> listC = fulfillmentSchedule.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            FulfillmentDay fulfillmentDayB = (FulfillmentDay) obj;
            if (bopasSlotIndex != null && i10 == bopasSlotIndex.intValue()) {
                fulfillmentDayB = FulfillmentDay.b(fulfillmentDayB, null, CollectionsKt.j0(fulfillmentDayB.d(), 1), 1, null);
            }
            arrayList.add(fulfillmentDayB);
            i10 = i11;
        }
        return FulfillmentSchedule.b(fulfillmentSchedule, 0, arrayList, null, 5, null);
    }

    @Override // Ek.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public FulfillmentSlotsViewState b(FulfillmentSlotsViewState oldState) {
        G1 g12;
        Integer numValueOf;
        FulfillmentSlot fulfillmentSlot;
        boolean z10;
        int i10;
        FulfillmentSlot fulfillmentSlot2;
        List<FulfillmentSlot> listD;
        Intrinsics.j(oldState, "oldState");
        Boolean isExpressPickUp = this.checkoutState.getIsExpressPickUp();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (Intrinsics.e(isExpressPickUp, Boolean.TRUE)) {
            g12 = G1.a.f103503a;
        } else if (Intrinsics.e(isExpressPickUp, Boolean.FALSE)) {
            g12 = G1.b.f103504a;
        } else {
            if (isExpressPickUp != null) {
                throw new NoWhenBranchMatchedException();
            }
            g12 = null;
        }
        FulfillmentSlot fulfillmentSlotE = this.checkoutState.x().e();
        DeliveryMode deliveryModeE = this.checkoutState.m().e();
        String code = deliveryModeE != null ? deliveryModeE.getCode() : null;
        if (code == null) {
            code = "";
        }
        String str = code;
        boolean z11 = false;
        if (this.isBopasEnabled) {
            FulfillmentDay fulfillmentDay = (FulfillmentDay) CollectionsKt.u0(this.fulfillmentSchedule.c());
            if (fulfillmentDay == null || (listD = fulfillmentDay.d()) == null) {
                numValueOf = null;
                fulfillmentSlot2 = null;
            } else {
                numValueOf = null;
                fulfillmentSlot2 = null;
                int i11 = 0;
                for (Object obj : listD) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    FulfillmentSlot fulfillmentSlot3 = (FulfillmentSlot) obj;
                    if (fulfillmentSlot3.q()) {
                        numValueOf = Integer.valueOf(i11);
                        fulfillmentSlot2 = fulfillmentSlot3;
                    }
                    i11 = i12;
                }
                Unit unit = Unit.f143329a;
            }
            fulfillmentSlot = fulfillmentSlot2;
        } else {
            numValueOf = null;
            fulfillmentSlot = null;
        }
        FulfillmentSchedule fulfillmentScheduleD = d(this.fulfillmentSchedule, fulfillmentSlot, numValueOf);
        ShoppingCart shoppingCartE = this.checkoutState.i().e();
        List<AvailableFulfillmentEligibility> listC = shoppingCartE != null ? shoppingCartE.c() : null;
        if (listC == null) {
            listC = CollectionsKt.m();
        }
        FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecoratorA = this.isTimeslotRedesigned ? FulfillmentSlotErrorDecorator.INSTANCE.a(fulfillmentScheduleD.c(), Intrinsics.e(str, "delivery"), listC.size() > 1) : FulfillmentSlotErrorDecorator.INSTANCE.b((FulfillmentDay) CollectionsKt.u0(fulfillmentScheduleD.c()), Intrinsics.e(str, "delivery"));
        List<FulfillmentDay> listC2 = fulfillmentScheduleD.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC2, 10));
        Iterator<T> it = listC2.iterator();
        while (true) {
            int i13 = 2;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(new FulfillmentSlotDayDecorator((FulfillmentDay) it.next(), z11, i13, defaultConstructorMarker));
        }
        Validation validation = new Validation(arrayList, null, 2, null);
        CheckoutState checkoutState = this.checkoutState;
        List<FulfillmentDay> listC3 = fulfillmentScheduleD.c();
        if (!(listC3 instanceof Collection) || !listC3.isEmpty()) {
            Iterator<T> it2 = listC3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FulfillmentDay fulfillmentDay2 = (FulfillmentDay) it2.next();
                if (Intrinsics.e(fulfillmentDay2.getDate(), ZonedDateTime.now().l()) && !fulfillmentDay2.d().isEmpty()) {
                    z10 = Intrinsics.e(str, "delivery");
                }
            }
        }
        boolean z12 = fulfillmentSlot != null;
        if (g12 == null) {
            g12 = fulfillmentSlot != null ? G1.a.f103503a : G1.b.f103504a;
        }
        FulfillmentSlotsViewState fulfillmentSlotsViewStateM = FulfillmentSlotsViewState.m(oldState, false, fulfillmentSlotErrorDecoratorA, validation, false, false, str, checkoutState, null, z10, z12, fulfillmentSlot, false, false, g12, null, null, null, 120977, null);
        if (!fulfillmentSlotsViewStateM.F().e().isEmpty()) {
            List<FulfillmentSlotDayDecorator> listE = fulfillmentSlotsViewStateM.F().e();
            if ((listE instanceof Collection) && listE.isEmpty()) {
                return fulfillmentSlotsViewStateM;
            }
            Iterator<T> it3 = listE.iterator();
            while (it3.hasNext()) {
                if (((FulfillmentSlotDayDecorator) it3.next()).K()) {
                    if (fulfillmentSlotE != null) {
                        List<FulfillmentSlotDayDecorator> listE2 = fulfillmentSlotsViewStateM.F().e();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listE2, 10));
                        for (FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator : listE2) {
                            FulfillmentDay timeSlotDay = fulfillmentSlotDayDecorator.getTimeSlotDay();
                            List<FulfillmentSlot> listD2 = fulfillmentSlotDayDecorator.getTimeSlotDay().d();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listD2, 10));
                            for (FulfillmentSlot fulfillmentSlot4 : listD2) {
                                arrayList3.add(Intrinsics.e(fulfillmentSlot4.getId(), fulfillmentSlotE.getId()) ? FulfillmentSlot.d(fulfillmentSlot4, null, null, 0, null, null, null, null, false, null, null, null, true, null, 6143, null) : FulfillmentSlot.d(fulfillmentSlot4, null, null, 0, null, null, null, null, false, null, null, null, false, null, 6143, null));
                            }
                            FulfillmentDay fulfillmentDayB = FulfillmentDay.b(timeSlotDay, null, arrayList3, 1, null);
                            List<FulfillmentSlot> listD3 = fulfillmentSlotDayDecorator.getTimeSlotDay().d();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : listD3) {
                                if (Intrinsics.e(((FulfillmentSlot) obj2).getId(), fulfillmentSlotE.getId())) {
                                    arrayList4.add(obj2);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            arrayList2.add(fulfillmentSlotDayDecorator.o(fulfillmentDayB, arrayList4 != null));
                        }
                        return FulfillmentSlotsViewState.m(fulfillmentSlotsViewStateM, false, null, new Validation(arrayList2, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null);
                    }
                    Iterator<FulfillmentSlotDayDecorator> it4 = fulfillmentSlotsViewStateM.F().e().iterator();
                    int i14 = 0;
                    while (true) {
                        i10 = -1;
                        if (!it4.hasNext()) {
                            i14 = -1;
                            break;
                        }
                        if (it4.next().K()) {
                            break;
                        }
                        i14++;
                    }
                    Integer numValueOf2 = Integer.valueOf(i14);
                    if (numValueOf2.intValue() < 0) {
                        numValueOf2 = null;
                    }
                    int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                    Iterator<FulfillmentSlot> it5 = fulfillmentSlotsViewStateM.F().e().get(iIntValue).getTimeSlotDay().d().iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (it5.next().s()) {
                            i10 = i15;
                            break;
                        }
                        i15++;
                    }
                    List<FulfillmentSlotDayDecorator> listE3 = fulfillmentSlotsViewStateM.F().e();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.x(listE3, 10));
                    int i16 = 0;
                    for (Object obj3 : listE3) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.w();
                        }
                        FulfillmentSlotDayDecorator fulfillmentSlotDayDecoratorP = (FulfillmentSlotDayDecorator) obj3;
                        if (i16 == iIntValue) {
                            fulfillmentSlotDayDecoratorP = FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecoratorP, null, true, 1, null);
                        }
                        arrayList5.add(fulfillmentSlotDayDecoratorP);
                        i16 = i17;
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.x(arrayList5, 10));
                    int i18 = 0;
                    for (Object obj4 : arrayList5) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            CollectionsKt.w();
                        }
                        FulfillmentSlotDayDecorator fulfillmentSlotDayDecoratorP2 = (FulfillmentSlotDayDecorator) obj4;
                        if (i18 == iIntValue) {
                            FulfillmentDay timeSlotDay2 = fulfillmentSlotDayDecoratorP2.getTimeSlotDay();
                            List<FulfillmentSlot> listD4 = fulfillmentSlotDayDecoratorP2.getTimeSlotDay().d();
                            ArrayList arrayList7 = new ArrayList(CollectionsKt.x(listD4, 10));
                            int i20 = 0;
                            for (Object obj5 : listD4) {
                                int i21 = i20 + 1;
                                if (i20 < 0) {
                                    CollectionsKt.w();
                                }
                                FulfillmentSlot fulfillmentSlot5 = (FulfillmentSlot) obj5;
                                arrayList7.add(i20 == i10 ? FulfillmentSlot.d(fulfillmentSlot5, null, null, 0, null, null, null, null, false, null, null, null, true, null, 6143, null) : FulfillmentSlot.d(fulfillmentSlot5, null, null, 0, null, null, null, null, false, null, null, null, false, null, 6143, null));
                                i20 = i21;
                            }
                            fulfillmentSlotDayDecoratorP2 = FulfillmentSlotDayDecorator.p(fulfillmentSlotDayDecoratorP2, FulfillmentDay.b(timeSlotDay2, null, arrayList7, 1, null), false, 2, null);
                        }
                        arrayList6.add(fulfillmentSlotDayDecoratorP2);
                        i18 = i19;
                    }
                    return FulfillmentSlotsViewState.m(fulfillmentSlotsViewStateM, false, null, new Validation(arrayList6, null, 2, null), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null);
                }
            }
        }
        return fulfillmentSlotsViewStateM;
    }
}
