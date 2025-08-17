package com.meijer.mobile.meijer.activity.cart;

import ak.AbstractC5607a;
import ej.HighValuePromoData;
import ej.ShoppingCart;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tr.C17135b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0014B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/m0;", "", "", "totalOffers", "availableOffers", "appliedOffers", "Lak/a;", "availableAndAppliedOffers", "appliedOffersNotification", "<init>", "(IIILak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTotalOffers", "b", "c", "d", "Lak/a;", "getAvailableAndAppliedOffers", "()Lak/a;", "e", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.cart.m0, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CartMperksOfferDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f101868g = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalOffers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int availableOffers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int appliedOffers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a availableAndAppliedOffers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a appliedOffersNotification;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/m0$a;", "", "<init>", "()V", "Lej/C;", "cart", "Lcom/meijer/mobile/meijer/activity/cart/m0;", "a", "(Lej/C;)Lcom/meijer/mobile/meijer/activity/cart/m0;", "", "DEFER", "Ljava/lang/String;", "EXECUTE", "UNKNOWN", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.cart.m0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CartMperksOfferDecorator a(ShoppingCart cart) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            AbstractC5607a abstractC5607aB = null;
            if (cart == null) {
                return null;
            }
            int size = cart.t().size();
            List<HighValuePromoData> listT = cart.t();
            if ((listT instanceof Collection) && listT.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (HighValuePromoData highValuePromoData : listT) {
                    if (Intrinsics.e(highValuePromoData.getPromptResponse(), "defer") || Intrinsics.e(highValuePromoData.getPromptResponse(), "?")) {
                        i10++;
                        if (i10 < 0) {
                            CollectionsKt.v();
                        }
                    }
                }
            }
            List<HighValuePromoData> listT2 = cart.t();
            if ((listT2 instanceof Collection) && listT2.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = listT2.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.e(((HighValuePromoData) it.next()).getPromptResponse(), "execute") && (i11 = i11 + 1) < 0) {
                        CollectionsKt.v();
                    }
                }
            }
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i15 = C17135b.f162025i;
            List<HighValuePromoData> listT3 = cart.t();
            if ((listT3 instanceof Collection) && listT3.isEmpty()) {
                i12 = 0;
            } else {
                i12 = 0;
                for (HighValuePromoData highValuePromoData2 : listT3) {
                    if (Intrinsics.e(highValuePromoData2.getPromptResponse(), "defer") || Intrinsics.e(highValuePromoData2.getPromptResponse(), "?")) {
                        i12++;
                        if (i12 < 0) {
                            CollectionsKt.v();
                        }
                    }
                }
            }
            Integer numValueOf = Integer.valueOf(i12);
            List<HighValuePromoData> listT4 = cart.t();
            if ((listT4 instanceof Collection) && listT4.isEmpty()) {
                i13 = 0;
            } else {
                Iterator<T> it2 = listT4.iterator();
                i13 = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.e(((HighValuePromoData) it2.next()).getPromptResponse(), "execute") && (i13 = i13 + 1) < 0) {
                        CollectionsKt.v();
                    }
                }
            }
            AbstractC5607a abstractC5607aD = companion.d(i15, numValueOf, Integer.valueOf(i13));
            List<HighValuePromoData> listT5 = cart.t();
            if (!(listT5 instanceof Collection) || !listT5.isEmpty()) {
                Iterator<T> it3 = listT5.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.e(((HighValuePromoData) it3.next()).getPromptResponse(), "execute")) {
                        AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
                        int i16 = com.meijer.mobile.meijer.X.f99447f;
                        List<HighValuePromoData> listT6 = cart.t();
                        if ((listT6 instanceof Collection) && listT6.isEmpty()) {
                            i14 = 0;
                        } else {
                            Iterator<T> it4 = listT6.iterator();
                            i14 = 0;
                            while (it4.hasNext()) {
                                if (Intrinsics.e(((HighValuePromoData) it4.next()).getPromptResponse(), "execute") && (i14 = i14 + 1) < 0) {
                                    CollectionsKt.v();
                                }
                            }
                        }
                        abstractC5607aB = companion2.b(i16, i14, new Object[0]);
                    }
                }
            }
            return new CartMperksOfferDecorator(size, i10, i11, abstractC5607aD, abstractC5607aB);
        }

        private Companion() {
        }
    }

    public CartMperksOfferDecorator() {
        this(0, 0, 0, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartMperksOfferDecorator)) {
            return false;
        }
        CartMperksOfferDecorator cartMperksOfferDecorator = (CartMperksOfferDecorator) other;
        return this.totalOffers == cartMperksOfferDecorator.totalOffers && this.availableOffers == cartMperksOfferDecorator.availableOffers && this.appliedOffers == cartMperksOfferDecorator.appliedOffers && Intrinsics.e(this.availableAndAppliedOffers, cartMperksOfferDecorator.availableAndAppliedOffers) && Intrinsics.e(this.appliedOffersNotification, cartMperksOfferDecorator.appliedOffersNotification);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.totalOffers) * 31) + Integer.hashCode(this.availableOffers)) * 31) + Integer.hashCode(this.appliedOffers)) * 31;
        AbstractC5607a abstractC5607a = this.availableAndAppliedOffers;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.appliedOffersNotification;
        return iHashCode2 + (abstractC5607a2 != null ? abstractC5607a2.hashCode() : 0);
    }

    public String toString() {
        return "CartMperksOfferDecorator(totalOffers=" + this.totalOffers + ", availableOffers=" + this.availableOffers + ", appliedOffers=" + this.appliedOffers + ", availableAndAppliedOffers=" + this.availableAndAppliedOffers + ", appliedOffersNotification=" + this.appliedOffersNotification + ')';
    }

    public CartMperksOfferDecorator(int i10, int i11, int i12, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
        this.totalOffers = i10;
        this.availableOffers = i11;
        this.appliedOffers = i12;
        this.availableAndAppliedOffers = abstractC5607a;
        this.appliedOffersNotification = abstractC5607a2;
    }

    /* renamed from: a, reason: from getter */
    public final int getAppliedOffers() {
        return this.appliedOffers;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getAppliedOffersNotification() {
        return this.appliedOffersNotification;
    }

    /* renamed from: c, reason: from getter */
    public final int getAvailableOffers() {
        return this.availableOffers;
    }

    public /* synthetic */ CartMperksOfferDecorator(int i10, int i11, int i12, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : abstractC5607a, (i13 & 16) != 0 ? null : abstractC5607a2);
    }
}
