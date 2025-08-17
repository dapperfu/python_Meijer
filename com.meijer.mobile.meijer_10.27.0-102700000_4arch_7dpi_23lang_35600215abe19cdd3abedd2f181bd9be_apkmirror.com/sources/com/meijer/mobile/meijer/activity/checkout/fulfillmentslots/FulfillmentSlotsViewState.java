package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Bm.FulfillmentPartnerDecorator;
import Bm.FulfillmentSlotDayDecorator;
import Bm.FulfillmentSlotErrorDecorator;
import Hk.Validation;
import Hk.c;
import Tq.PointOfService;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11853l;
import ej.Entry;
import ej.EntryChange;
import ij.FulfillmentSlot;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jl.CheckoutFlowState;
import jl.CheckoutState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import tl.FulfillmentDay;
import ts.ProductCardDecorator;
import vs.ProductPriceDecorator;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0007¢\u0006\u0004\b(\u0010)JØ\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u00108R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bQ\u00108R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\bX\u00108R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u00106\u001a\u0004\bZ\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010)R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0006¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bc\u0010)R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010l\u001a\u00020h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010i\u001a\u0004\bj\u0010kR\u001b\u0010m\u001a\u00020h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010i\u001a\u0004\b[\u0010kR\u001b\u0010o\u001a\u00020h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010i\u001a\u0004\bn\u0010kR\u001b\u0010p\u001a\u00020h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010i\u001a\u0004\b_\u0010kR$\u0010q\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001010\u00060\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0011\u0010s\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\br\u0010kR\u0011\u0010t\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bb\u0010kR\u0011\u0010v\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bu\u0010kR\u0011\u0010x\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bw\u0010kR\u0013\u0010z\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\by\u0010kR\u0011\u0010{\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\bd\u00100R\u0013\u0010}\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b|\u0010WR\u0013\u0010\u0081\u0001\u001a\u00020~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "LHk/a;", "", "changingFulfillmentSelection", "LBm/n;", "fulfillmentSlotError", "LHk/b;", "", "LBm/m;", "fulfillmentSlotDays", "isLoading", "isEarlyDeliveryChecked", "", "fulfillmentMode", "Ljl/v;", "checkoutState", "Ljl/f;", "checkoutFlowState", "canDisplayEarlyTimeSlotsBanner", "canDisplayBopasOption", "Lij/c;", "bopasSlot", "isTimeslotSelected", "isShowTimeSlotExpiredWarning", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "pickupOption", "LBm/a;", "fulfillmentPartnerDecorator", "Lej/j;", "cartProductOutOfStockList", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "errorState", "<init>", "(ZLBm/n;LHk/b;ZZLjava/lang/String;Ljl/v;Ljl/f;ZZLij/c;ZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;)V", "S", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "dayDecorator", "R", "(LBm/m;)Z", "Lts/a;", "B", "()Ljava/util/List;", "l", "(ZLBm/n;LHk/b;ZZLjava/lang/String;Ljl/v;Ljl/f;ZZLij/c;ZZLcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;)Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getChangingFulfillmentSelection", "()Z", "b", "LBm/n;", "G", "()LBm/n;", "c", "LHk/b;", "F", "()LHk/b;", "d", "M", "e", "L", "f", "Ljava/lang/String;", "C", "g", "Ljl/v;", "v", "()Ljl/v;", "h", "Ljl/f;", "u", "()Ljl/f;", "i", "t", "j", "s", "k", "Lij/c;", "r", "()Lij/c;", "O", "m", "N", "n", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "J", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/G1;", "o", "Ljava/util/List;", "E", "p", "getCartProductOutOfStockList", "q", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "z", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "Lak/a;", "Lkotlin/Lazy;", "H", "()Lak/a;", "morningSlotsFooterText", "afternoonSlotsFooterText", "I", "morningSlotsSectionHeader", "afternoonSlotsSectionHeader", "validations", "D", "fulfillmentModeText", "appBarTitleText", "x", "dayHeaderText", "y", "daySubheaderText", "w", "currentTimeSlot", "availableSlotsCount", "A", "firstAvailableSlot", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "K", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "spcFulfillmentHeader", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentSlotsViewState implements Hk.a<FulfillmentSlotsViewState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean changingFulfillmentSelection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlotErrorDecorator fulfillmentSlotError;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<List<FulfillmentSlotDayDecorator>> fulfillmentSlotDays;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEarlyDeliveryChecked;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutState checkoutState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckoutFlowState checkoutFlowState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canDisplayEarlyTimeSlotsBanner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canDisplayBopasOption;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlot bopasSlot;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTimeslotSelected;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowTimeSlotExpiredWarning;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final G1 pickupOption;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentPartnerDecorator> fulfillmentPartnerDecorator;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryChange> cartProductOutOfStockList;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC11853l errorState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy morningSlotsFooterText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy afternoonSlotsFooterText;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy morningSlotsSectionHeader;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy afternoonSlotsSectionHeader;

    public FulfillmentSlotsViewState() {
        this(false, null, null, false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ FulfillmentSlotsViewState m(FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator, Validation validation, boolean z11, boolean z12, String str, CheckoutState checkoutState, CheckoutFlowState fVar, boolean z13, boolean z14, FulfillmentSlot fulfillmentSlot, boolean z15, boolean z16, G1 g12, List list, List list2, AbstractC11853l abstractC11853l, int i10, Object obj) {
        AbstractC11853l abstractC11853l2;
        List list3;
        boolean z17;
        FulfillmentSlotsViewState fulfillmentSlotsViewState2;
        List list4;
        FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator2;
        Validation validation2;
        boolean z18;
        boolean z19;
        String str2;
        CheckoutState checkoutState2;
        CheckoutFlowState fVar2;
        boolean z20;
        boolean z21;
        FulfillmentSlot fulfillmentSlot2;
        boolean z22;
        boolean z23;
        G1 g13;
        boolean z24 = (i10 & 1) != 0 ? fulfillmentSlotsViewState.changingFulfillmentSelection : z10;
        FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator3 = (i10 & 2) != 0 ? fulfillmentSlotsViewState.fulfillmentSlotError : fulfillmentSlotErrorDecorator;
        Validation validation3 = (i10 & 4) != 0 ? fulfillmentSlotsViewState.fulfillmentSlotDays : validation;
        boolean z25 = (i10 & 8) != 0 ? fulfillmentSlotsViewState.isLoading : z11;
        boolean z26 = (i10 & 16) != 0 ? fulfillmentSlotsViewState.isEarlyDeliveryChecked : z12;
        String str3 = (i10 & 32) != 0 ? fulfillmentSlotsViewState.fulfillmentMode : str;
        CheckoutState checkoutState3 = (i10 & 64) != 0 ? fulfillmentSlotsViewState.checkoutState : checkoutState;
        CheckoutFlowState fVar3 = (i10 & 128) != 0 ? fulfillmentSlotsViewState.checkoutFlowState : fVar;
        boolean z27 = (i10 & 256) != 0 ? fulfillmentSlotsViewState.canDisplayEarlyTimeSlotsBanner : z13;
        boolean z28 = (i10 & 512) != 0 ? fulfillmentSlotsViewState.canDisplayBopasOption : z14;
        FulfillmentSlot fulfillmentSlot3 = (i10 & 1024) != 0 ? fulfillmentSlotsViewState.bopasSlot : fulfillmentSlot;
        boolean z29 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? fulfillmentSlotsViewState.isTimeslotSelected : z15;
        boolean z30 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? fulfillmentSlotsViewState.isShowTimeSlotExpiredWarning : z16;
        G1 g14 = (i10 & 8192) != 0 ? fulfillmentSlotsViewState.pickupOption : g12;
        boolean z31 = z24;
        List list5 = (i10 & 16384) != 0 ? fulfillmentSlotsViewState.fulfillmentPartnerDecorator : list;
        List list6 = (i10 & 32768) != 0 ? fulfillmentSlotsViewState.cartProductOutOfStockList : list2;
        if ((i10 & 65536) != 0) {
            list3 = list6;
            abstractC11853l2 = fulfillmentSlotsViewState.errorState;
            list4 = list5;
            fulfillmentSlotErrorDecorator2 = fulfillmentSlotErrorDecorator3;
            validation2 = validation3;
            z18 = z25;
            z19 = z26;
            str2 = str3;
            checkoutState2 = checkoutState3;
            fVar2 = fVar3;
            z20 = z27;
            z21 = z28;
            fulfillmentSlot2 = fulfillmentSlot3;
            z22 = z29;
            z23 = z30;
            g13 = g14;
            z17 = z31;
            fulfillmentSlotsViewState2 = fulfillmentSlotsViewState;
        } else {
            abstractC11853l2 = abstractC11853l;
            list3 = list6;
            z17 = z31;
            fulfillmentSlotsViewState2 = fulfillmentSlotsViewState;
            list4 = list5;
            fulfillmentSlotErrorDecorator2 = fulfillmentSlotErrorDecorator3;
            validation2 = validation3;
            z18 = z25;
            z19 = z26;
            str2 = str3;
            checkoutState2 = checkoutState3;
            fVar2 = fVar3;
            z20 = z27;
            z21 = z28;
            fulfillmentSlot2 = fulfillmentSlot3;
            z22 = z29;
            z23 = z30;
            g13 = g14;
        }
        return fulfillmentSlotsViewState2.l(z17, fulfillmentSlotErrorDecorator2, validation2, z18, z19, str2, checkoutState2, fVar2, z20, z21, fulfillmentSlot2, z22, z23, g13, list4, list3, abstractC11853l2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotsViewState)) {
            return false;
        }
        FulfillmentSlotsViewState fulfillmentSlotsViewState = (FulfillmentSlotsViewState) other;
        return this.changingFulfillmentSelection == fulfillmentSlotsViewState.changingFulfillmentSelection && Intrinsics.e(this.fulfillmentSlotError, fulfillmentSlotsViewState.fulfillmentSlotError) && Intrinsics.e(this.fulfillmentSlotDays, fulfillmentSlotsViewState.fulfillmentSlotDays) && this.isLoading == fulfillmentSlotsViewState.isLoading && this.isEarlyDeliveryChecked == fulfillmentSlotsViewState.isEarlyDeliveryChecked && Intrinsics.e(this.fulfillmentMode, fulfillmentSlotsViewState.fulfillmentMode) && Intrinsics.e(this.checkoutState, fulfillmentSlotsViewState.checkoutState) && Intrinsics.e(this.checkoutFlowState, fulfillmentSlotsViewState.checkoutFlowState) && this.canDisplayEarlyTimeSlotsBanner == fulfillmentSlotsViewState.canDisplayEarlyTimeSlotsBanner && this.canDisplayBopasOption == fulfillmentSlotsViewState.canDisplayBopasOption && Intrinsics.e(this.bopasSlot, fulfillmentSlotsViewState.bopasSlot) && this.isTimeslotSelected == fulfillmentSlotsViewState.isTimeslotSelected && this.isShowTimeSlotExpiredWarning == fulfillmentSlotsViewState.isShowTimeSlotExpiredWarning && Intrinsics.e(this.pickupOption, fulfillmentSlotsViewState.pickupOption) && Intrinsics.e(this.fulfillmentPartnerDecorator, fulfillmentSlotsViewState.fulfillmentPartnerDecorator) && Intrinsics.e(this.cartProductOutOfStockList, fulfillmentSlotsViewState.cartProductOutOfStockList) && Intrinsics.e(this.errorState, fulfillmentSlotsViewState.errorState);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.changingFulfillmentSelection) * 31) + this.fulfillmentSlotError.hashCode()) * 31) + this.fulfillmentSlotDays.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isEarlyDeliveryChecked)) * 31) + this.fulfillmentMode.hashCode()) * 31) + this.checkoutState.hashCode()) * 31;
        CheckoutFlowState fVar = this.checkoutFlowState;
        int iHashCode2 = (((((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.canDisplayEarlyTimeSlotsBanner)) * 31) + Boolean.hashCode(this.canDisplayBopasOption)) * 31;
        FulfillmentSlot fulfillmentSlot = this.bopasSlot;
        int iHashCode3 = (((((iHashCode2 + (fulfillmentSlot == null ? 0 : fulfillmentSlot.hashCode())) * 31) + Boolean.hashCode(this.isTimeslotSelected)) * 31) + Boolean.hashCode(this.isShowTimeSlotExpiredWarning)) * 31;
        G1 g12 = this.pickupOption;
        return ((((((iHashCode3 + (g12 != null ? g12.hashCode() : 0)) * 31) + this.fulfillmentPartnerDecorator.hashCode()) * 31) + this.cartProductOutOfStockList.hashCode()) * 31) + this.errorState.hashCode();
    }

    public String toString() {
        return "FulfillmentSlotsViewState(changingFulfillmentSelection=" + this.changingFulfillmentSelection + ", fulfillmentSlotError=" + this.fulfillmentSlotError + ", fulfillmentSlotDays=" + this.fulfillmentSlotDays + ", isLoading=" + this.isLoading + ", isEarlyDeliveryChecked=" + this.isEarlyDeliveryChecked + ", fulfillmentMode=" + this.fulfillmentMode + ", checkoutState=" + this.checkoutState + ", checkoutFlowState=" + this.checkoutFlowState + ", canDisplayEarlyTimeSlotsBanner=" + this.canDisplayEarlyTimeSlotsBanner + ", canDisplayBopasOption=" + this.canDisplayBopasOption + ", bopasSlot=" + this.bopasSlot + ", isTimeslotSelected=" + this.isTimeslotSelected + ", isShowTimeSlotExpiredWarning=" + this.isShowTimeSlotExpiredWarning + ", pickupOption=" + this.pickupOption + ", fulfillmentPartnerDecorator=" + this.fulfillmentPartnerDecorator + ", cartProductOutOfStockList=" + this.cartProductOutOfStockList + ", errorState=" + this.errorState + ')';
    }

    public FulfillmentSlotsViewState(boolean z10, FulfillmentSlotErrorDecorator fulfillmentSlotError, Validation<List<FulfillmentSlotDayDecorator>> fulfillmentSlotDays, boolean z11, boolean z12, String fulfillmentMode, CheckoutState checkoutState, CheckoutFlowState fVar, boolean z13, boolean z14, FulfillmentSlot fulfillmentSlot, boolean z15, boolean z16, G1 g12, List<FulfillmentPartnerDecorator> fulfillmentPartnerDecorator, List<EntryChange> cartProductOutOfStockList, AbstractC11853l errorState) {
        Intrinsics.j(fulfillmentSlotError, "fulfillmentSlotError");
        Intrinsics.j(fulfillmentSlotDays, "fulfillmentSlotDays");
        Intrinsics.j(fulfillmentMode, "fulfillmentMode");
        Intrinsics.j(checkoutState, "checkoutState");
        Intrinsics.j(fulfillmentPartnerDecorator, "fulfillmentPartnerDecorator");
        Intrinsics.j(cartProductOutOfStockList, "cartProductOutOfStockList");
        Intrinsics.j(errorState, "errorState");
        this.changingFulfillmentSelection = z10;
        this.fulfillmentSlotError = fulfillmentSlotError;
        this.fulfillmentSlotDays = fulfillmentSlotDays;
        this.isLoading = z11;
        this.isEarlyDeliveryChecked = z12;
        this.fulfillmentMode = fulfillmentMode;
        this.checkoutState = checkoutState;
        this.checkoutFlowState = fVar;
        this.canDisplayEarlyTimeSlotsBanner = z13;
        this.canDisplayBopasOption = z14;
        this.bopasSlot = fulfillmentSlot;
        this.isTimeslotSelected = z15;
        this.isShowTimeSlotExpiredWarning = z16;
        this.pickupOption = g12;
        this.fulfillmentPartnerDecorator = fulfillmentPartnerDecorator;
        this.cartProductOutOfStockList = cartProductOutOfStockList;
        this.errorState = errorState;
        this.morningSlotsFooterText = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsViewState.P(this.f103214a);
            }
        });
        this.afternoonSlotsFooterText = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.A1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsViewState.j(this.f102543a);
            }
        });
        this.morningSlotsSectionHeader = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.B1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsViewState.Q();
            }
        });
        this.afternoonSlotsSectionHeader = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.C1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotsViewState.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a P(FulfillmentSlotsViewState fulfillmentSlotsViewState) {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100396w8, fulfillmentSlotsViewState.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a Q() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100356u8, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T(Ik.k validator) {
        List listM;
        Intrinsics.j(validator, "$this$validator");
        Iterable iterable = (Iterable) validator.i();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((FulfillmentSlotDayDecorator) it.next()).getTimeSlotDay().d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            FulfillmentSlot fulfillmentSlot = (FulfillmentSlot) obj;
            if (fulfillmentSlot.getIsSlotSelected() && fulfillmentSlot.s()) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return (arrayList2 == null || (listM = CollectionsKt.m()) == null) ? CollectionsKt.e(new c.Invalid(validator.getFieldName(), "No time slot selection", "Valid timeslot should be selected")) : listM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a j(FulfillmentSlotsViewState fulfillmentSlotsViewState) {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99739P, fulfillmentSlotsViewState.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a k() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99701N, new Object[0]);
    }

    public final FulfillmentSlot A() {
        Object next;
        FulfillmentDay timeSlotDay;
        List<FulfillmentSlot> listD;
        Iterator<T> it = this.fulfillmentSlotDays.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfillmentSlotDayDecorator) next).K()) {
                break;
            }
        }
        FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) next;
        if (fulfillmentSlotDayDecorator == null || (timeSlotDay = fulfillmentSlotDayDecorator.getTimeSlotDay()) == null || (listD = timeSlotDay.d()) == null) {
            return null;
        }
        for (FulfillmentSlot fulfillmentSlot : listD) {
            if (fulfillmentSlot.s()) {
                return fulfillmentSlot;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final List<ProductCardDecorator> B() {
        ProductCardDecorator productCardDecorator;
        List<EntryChange> list = this.cartProductOutOfStockList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Entry entry = ((EntryChange) it.next()).getEntry();
            if (entry != null) {
                ProductPriceDecorator productPriceDecorator = new ProductPriceDecorator(entry.m(), false, 0.0d, 6, null);
                productCardDecorator = new ProductCardDecorator(entry.m(), false, productPriceDecorator.b(), null, null, null, null, productPriceDecorator.f(), null, null, 0, 0.0d, 0.0d, entry.m().getItemUnitOfMeasure(), 0.0d, false, false, false, false, null, null, false, false, false, false, null, null, null, 267935610, null);
            } else {
                productCardDecorator = null;
            }
            if (productCardDecorator != null) {
                arrayList.add(productCardDecorator);
            }
        }
        return arrayList;
    }

    /* renamed from: C, reason: from getter */
    public final String getFulfillmentMode() {
        return this.fulfillmentMode;
    }

    public final AbstractC5607a D() {
        return AbstractC5607a.INSTANCE.d(Intrinsics.e(this.fulfillmentMode, "delivery") ? com.meijer.mobile.meijer.Y.f99499C6 : com.meijer.mobile.meijer.Y.f99537E6, new Object[0]);
    }

    public final List<FulfillmentPartnerDecorator> E() {
        return this.fulfillmentPartnerDecorator;
    }

    public final Validation<List<FulfillmentSlotDayDecorator>> F() {
        return this.fulfillmentSlotDays;
    }

    /* renamed from: G, reason: from getter */
    public final FulfillmentSlotErrorDecorator getFulfillmentSlotError() {
        return this.fulfillmentSlotError;
    }

    public final AbstractC5607a H() {
        return (AbstractC5607a) this.morningSlotsFooterText.getValue();
    }

    public final AbstractC5607a I() {
        return (AbstractC5607a) this.morningSlotsSectionHeader.getValue();
    }

    /* renamed from: J, reason: from getter */
    public final G1 getPickupOption() {
        return this.pickupOption;
    }

    public final SpcFulfillmentHeader K() {
        AbstractC5607a abstractC5607aD;
        AbstractC5607a abstractC5607aD2;
        AbstractC5607a abstractC5607aC;
        String str = this.fulfillmentMode;
        if (!Intrinsics.e(str, "pickup")) {
            if (!Intrinsics.e(str, "delivery")) {
                return SpcFulfillmentHeader.INSTANCE.a();
            }
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            return new SpcFulfillmentHeader(companion.d(com.meijer.mobile.meijer.Y.f99716Ne, companion.d(com.meijer.mobile.meijer.Y.f99499C6, new Object[0])), this.isTimeslotSelected ? companion.c(this.checkoutState.q().e()) : companion.d(com.meijer.mobile.meijer.Y.f99735Oe, this.checkoutState.q().e()), this.isTimeslotSelected ? w() : null);
        }
        if (this.isTimeslotSelected) {
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            int i10 = com.meijer.mobile.meijer.Y.f99754Pe;
            PointOfService pointOfServiceE = this.checkoutState.v().e();
            String displayName = pointOfServiceE != null ? pointOfServiceE.getDisplayName() : null;
            if (displayName == null) {
                displayName = "";
            }
            abstractC5607aD = companion2.d(i10, displayName);
        } else {
            AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
            abstractC5607aD = companion3.d(com.meijer.mobile.meijer.Y.f99716Ne, companion3.d(com.meijer.mobile.meijer.Y.f99537E6, new Object[0]));
        }
        if (this.isTimeslotSelected) {
            abstractC5607aD2 = AbstractC5607a.INSTANCE.c(this.checkoutState.q().e());
        } else {
            AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
            int i11 = com.meijer.mobile.meijer.Y.f99754Pe;
            PointOfService pointOfServiceE2 = this.checkoutState.v().e();
            String displayName2 = pointOfServiceE2 != null ? pointOfServiceE2.getDisplayName() : null;
            abstractC5607aD2 = companion4.d(i11, displayName2 != null ? displayName2 : "");
        }
        if (this.isTimeslotSelected) {
            abstractC5607aC = w();
            if (abstractC5607aC == null) {
                abstractC5607aC = AbstractC5607a.INSTANCE.a();
            }
        } else {
            abstractC5607aC = AbstractC5607a.INSTANCE.c(this.checkoutState.q().e());
        }
        return new SpcFulfillmentHeader(abstractC5607aD, abstractC5607aD2, abstractC5607aC);
    }

    /* renamed from: L, reason: from getter */
    public final boolean getIsEarlyDeliveryChecked() {
        return this.isEarlyDeliveryChecked;
    }

    /* renamed from: M, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: N, reason: from getter */
    public final boolean getIsShowTimeSlotExpiredWarning() {
        return this.isShowTimeSlotExpiredWarning;
    }

    /* renamed from: O, reason: from getter */
    public final boolean getIsTimeslotSelected() {
        return this.isTimeslotSelected;
    }

    public final boolean R(FulfillmentSlotDayDecorator dayDecorator) {
        Intrinsics.j(dayDecorator, "dayDecorator");
        if (!dayDecorator.F().isEmpty()) {
            return false;
        }
        ZoneId zoneId = vk.e.EASTERN;
        return LocalTime.now(zoneId).getHour() >= 12 && dayDecorator.getTimeSlotDay().getDate().isEqual(LocalDate.now(zoneId));
    }

    public FulfillmentSlotsViewState S() {
        return m(this, false, null, this.fulfillmentSlotDays.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FulfillmentSlotsViewState) this.receiver).F();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.D1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FulfillmentSlotsViewState.T((Ik.k) obj);
            }
        })), false, false, null, null, null, false, false, null, false, false, null, null, null, null, 131067, null);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.e(this.fulfillmentSlotDays);
    }

    public final FulfillmentSlotsViewState l(boolean changingFulfillmentSelection, FulfillmentSlotErrorDecorator fulfillmentSlotError, Validation<List<FulfillmentSlotDayDecorator>> fulfillmentSlotDays, boolean isLoading, boolean isEarlyDeliveryChecked, String fulfillmentMode, CheckoutState checkoutState, CheckoutFlowState checkoutFlowState, boolean canDisplayEarlyTimeSlotsBanner, boolean canDisplayBopasOption, FulfillmentSlot bopasSlot, boolean isTimeslotSelected, boolean isShowTimeSlotExpiredWarning, G1 pickupOption, List<FulfillmentPartnerDecorator> fulfillmentPartnerDecorator, List<EntryChange> cartProductOutOfStockList, AbstractC11853l errorState) {
        Intrinsics.j(fulfillmentSlotError, "fulfillmentSlotError");
        Intrinsics.j(fulfillmentSlotDays, "fulfillmentSlotDays");
        Intrinsics.j(fulfillmentMode, "fulfillmentMode");
        Intrinsics.j(checkoutState, "checkoutState");
        Intrinsics.j(fulfillmentPartnerDecorator, "fulfillmentPartnerDecorator");
        Intrinsics.j(cartProductOutOfStockList, "cartProductOutOfStockList");
        Intrinsics.j(errorState, "errorState");
        return new FulfillmentSlotsViewState(changingFulfillmentSelection, fulfillmentSlotError, fulfillmentSlotDays, isLoading, isEarlyDeliveryChecked, fulfillmentMode, checkoutState, checkoutFlowState, canDisplayEarlyTimeSlotsBanner, canDisplayBopasOption, bopasSlot, isTimeslotSelected, isShowTimeSlotExpiredWarning, pickupOption, fulfillmentPartnerDecorator, cartProductOutOfStockList, errorState);
    }

    public final AbstractC5607a n() {
        return (AbstractC5607a) this.afternoonSlotsFooterText.getValue();
    }

    public final AbstractC5607a o() {
        return (AbstractC5607a) this.afternoonSlotsSectionHeader.getValue();
    }

    public final AbstractC5607a p() {
        return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99966ah, D());
    }

    public final int q() {
        List<FulfillmentSlotDayDecorator> listE = this.fulfillmentSlotDays.e();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FulfillmentSlotDayDecorator) it.next()).y()));
        }
        return arrayList.size();
    }

    /* renamed from: r, reason: from getter */
    public final FulfillmentSlot getBopasSlot() {
        return this.bopasSlot;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getCanDisplayBopasOption() {
        return this.canDisplayBopasOption;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getCanDisplayEarlyTimeSlotsBanner() {
        return this.canDisplayEarlyTimeSlotsBanner;
    }

    /* renamed from: u, reason: from getter */
    public final CheckoutFlowState getCheckoutFlowState() {
        return this.checkoutFlowState;
    }

    /* renamed from: v, reason: from getter */
    public final CheckoutState getCheckoutState() {
        return this.checkoutState;
    }

    public final AbstractC5607a w() {
        Object next;
        Iterator<T> it = this.fulfillmentSlotDays.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfillmentSlotDayDecorator) next).H() != null) {
                break;
            }
        }
        FulfillmentSlotDayDecorator fulfillmentSlotDayDecorator = (FulfillmentSlotDayDecorator) next;
        if (fulfillmentSlotDayDecorator != null) {
            return fulfillmentSlotDayDecorator.z();
        }
        return null;
    }

    public final AbstractC5607a x() {
        Object next;
        AbstractC5607a abstractC5607aG;
        if (!Intrinsics.e(this.fulfillmentMode, "delivery")) {
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100086gh, D());
        }
        Iterator<T> it = this.fulfillmentPartnerDecorator.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfillmentPartnerDecorator) next).getIsPartnerSelected()) {
                break;
            }
        }
        FulfillmentPartnerDecorator aVar = (FulfillmentPartnerDecorator) next;
        return (aVar == null || (abstractC5607aG = aVar.getPartnerTitle()) == null) ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100086gh, D()) : abstractC5607aG;
    }

    public final AbstractC5607a y() {
        Object next;
        AbstractC5607a abstractC5607aF;
        if (!Intrinsics.e(this.fulfillmentMode, "delivery")) {
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100125ih, new Object[0]);
        }
        Iterator<T> it = this.fulfillmentPartnerDecorator.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FulfillmentPartnerDecorator) next).getIsPartnerSelected()) {
                break;
            }
        }
        FulfillmentPartnerDecorator aVar = (FulfillmentPartnerDecorator) next;
        return (aVar == null || (abstractC5607aF = aVar.getPartnerSubDescription()) == null) ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100106hh, new Object[0]) : abstractC5607aF;
    }

    /* renamed from: z, reason: from getter */
    public final AbstractC11853l getErrorState() {
        return this.errorState;
    }

    public /* synthetic */ FulfillmentSlotsViewState(boolean z10, FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator, Validation validation, boolean z11, boolean z12, String str, CheckoutState checkoutState, CheckoutFlowState fVar, boolean z13, boolean z14, FulfillmentSlot fulfillmentSlot, boolean z15, boolean z16, G1 g12, List list, List list2, AbstractC11853l abstractC11853l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new FulfillmentSlotErrorDecorator(null, 1, null) : fulfillmentSlotErrorDecorator, (i10 & 4) != 0 ? new Validation(CollectionsKt.m(), null, 2, null) : validation, (i10 & 8) == 0 ? z11 : true, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? "pickup" : str, (i10 & 64) != 0 ? new CheckoutState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 131071, null) : checkoutState, (i10 & 128) != 0 ? null : fVar, (i10 & 256) != 0 ? false : z13, (i10 & 512) != 0 ? false : z14, (i10 & 1024) != 0 ? null : fulfillmentSlot, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z15, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? z16 : false, (i10 & 8192) == 0 ? g12 : null, (i10 & 16384) != 0 ? CollectionsKt.m() : list, (i10 & 32768) != 0 ? CollectionsKt.m() : list2, (i10 & 65536) != 0 ? AbstractC11853l.b.f102993d : abstractC11853l);
    }
}
