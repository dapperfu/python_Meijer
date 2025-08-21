package Cm;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import fj.AvailableFulfillmentEligibility;
import fj.ShoppingCart;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0001\u0013BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jl\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b&\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u0017\u0010/\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\"\u0010%¨\u00061"}, d2 = {"LCm/a;", "", "", "isPartnerSelected", "", "partnerIcon", "Lbk/a;", "partnerTitle", "partnerDescription", "partnerSubDescription", "", "deliveryCost", "Lfj/o;", "fulfillmentPartner", "", "storeId", "isAlcoholEligible", "<init>", "(ZILbk/a;Lbk/a;Lbk/a;Ljava/lang/Double;Lfj/o;Ljava/lang/String;Z)V", "a", "(ZILbk/a;Lbk/a;Lbk/a;Ljava/lang/Double;Lfj/o;Ljava/lang/String;Z)LCm/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "()Z", "b", "I", "getPartnerIcon", "c", "Lbk/a;", "g", "()Lbk/a;", "d", "e", "f", "Ljava/lang/Double;", "Lfj/o;", "()Lfj/o;", "h", "Ljava/lang/String;", "i", "deliveryCostFormatted", "k", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Cm.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentPartnerDecorator {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f5185l = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPartnerSelected;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int partnerIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a partnerTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a partnerDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a partnerSubDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double deliveryCost;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final fj.o fulfillmentPartner;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholEligible;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a deliveryCostFormatted;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LCm/a$a;", "", "<init>", "()V", "", "partnerEligibility", "Lfj/o;", "selectedPartner", "", "isSpc", "b", "(Ljava/lang/String;Lfj/o;Z)Z", "Lfj/C;", "shoppingCart", "", "bunchaDeliveryFee", "sortAscending", "", "LCm/a;", "a", "(Lfj/C;Ljava/lang/Double;ZLfj/o;Z)Ljava/util/List;", "SCHEDULED_DELIVERY_PRICE", "D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cm.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Cm.a$a$a, reason: collision with other inner class name */
        public static final class C0093a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(((FulfillmentPartnerDecorator) t10).getFulfillmentPartner().getPartnerName(), ((FulfillmentPartnerDecorator) t11).getFulfillmentPartner().getPartnerName());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Cm.a$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(((FulfillmentPartnerDecorator) t11).getFulfillmentPartner().getPartnerName(), ((FulfillmentPartnerDecorator) t10).getFulfillmentPartner().getPartnerName());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean b(String partnerEligibility, fj.o selectedPartner, boolean isSpc) {
            if (isSpc) {
                return StringsKt.H(partnerEligibility, selectedPartner != null ? selectedPartner.name() : null, true);
            }
            return false;
        }

        public final List<FulfillmentPartnerDecorator> a(ShoppingCart shoppingCart, Double bunchaDeliveryFee, boolean sortAscending, fj.o selectedPartner, boolean isSpc) {
            AvailableFulfillmentEligibility availableFulfillmentEligibility;
            List<AvailableFulfillmentEligibility> listC;
            FulfillmentPartnerDecorator fulfillmentPartnerDecorator;
            List<AvailableFulfillmentEligibility> listC2;
            Object next;
            List listM = null;
            if (shoppingCart == null || (listC2 = shoppingCart.c()) == null) {
                availableFulfillmentEligibility = null;
            } else {
                Iterator<T> it = listC2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((AvailableFulfillmentEligibility) next).getFulfillmentPartner() == fj.o.f131941f) {
                        break;
                    }
                }
                availableFulfillmentEligibility = (AvailableFulfillmentEligibility) next;
            }
            boolean z10 = availableFulfillmentEligibility != null;
            if (shoppingCart != null && (listC = shoppingCart.c()) != null) {
                List<AvailableFulfillmentEligibility> list = listC;
                listM = new ArrayList(CollectionsKt.x(list, 10));
                for (AvailableFulfillmentEligibility availableFulfillmentEligibility2 : list) {
                    if (Intrinsics.e(availableFulfillmentEligibility2.getPartnerEligibility(), fj.o.f131941f.getPartnerName())) {
                        int i10 = Cj.i.f4723N1;
                        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                        fulfillmentPartnerDecorator = new FulfillmentPartnerDecorator(availableFulfillmentEligibility2.getIsSelected() || FulfillmentPartnerDecorator.INSTANCE.b(availableFulfillmentEligibility2.getPartnerEligibility(), selectedPartner, isSpc), i10, companion.d(Y.f101296y6, new Object[0]), companion.d(Y.f101256w6, new Object[0]), companion.d(Y.f101276x6, new Object[0]), bunchaDeliveryFee, fj.o.INSTANCE.a(availableFulfillmentEligibility2.getPartnerEligibility()), availableFulfillmentEligibility2.getStoreId(), availableFulfillmentEligibility2.getAlcoholEligible());
                    } else {
                        double value = z10 ? 9.95d : shoppingCart.getDeliveryCost().getValue();
                        int i11 = Cj.i.f4776e;
                        AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                        fulfillmentPartnerDecorator = new FulfillmentPartnerDecorator(availableFulfillmentEligibility2.getIsSelected() || FulfillmentPartnerDecorator.INSTANCE.b(availableFulfillmentEligibility2.getPartnerEligibility(), selectedPartner, isSpc), i11, companion2.d(Y.f100358C6, new Object[0]), companion2.d(Y.f100318A6, new Object[0]), companion2.d(Y.f100338B6, new Object[0]), Double.valueOf(value), fj.o.INSTANCE.a(availableFulfillmentEligibility2.getPartnerEligibility()), availableFulfillmentEligibility2.getStoreId(), availableFulfillmentEligibility2.getAlcoholEligible());
                    }
                    listM.add(fulfillmentPartnerDecorator);
                }
            }
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return sortAscending ? CollectionsKt.Z0(listM, new C0093a()) : CollectionsKt.Z0(listM, new b());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentPartnerDecorator)) {
            return false;
        }
        FulfillmentPartnerDecorator fulfillmentPartnerDecorator = (FulfillmentPartnerDecorator) other;
        return this.isPartnerSelected == fulfillmentPartnerDecorator.isPartnerSelected && this.partnerIcon == fulfillmentPartnerDecorator.partnerIcon && Intrinsics.e(this.partnerTitle, fulfillmentPartnerDecorator.partnerTitle) && Intrinsics.e(this.partnerDescription, fulfillmentPartnerDecorator.partnerDescription) && Intrinsics.e(this.partnerSubDescription, fulfillmentPartnerDecorator.partnerSubDescription) && Intrinsics.e(this.deliveryCost, fulfillmentPartnerDecorator.deliveryCost) && this.fulfillmentPartner == fulfillmentPartnerDecorator.fulfillmentPartner && Intrinsics.e(this.storeId, fulfillmentPartnerDecorator.storeId) && this.isAlcoholEligible == fulfillmentPartnerDecorator.isAlcoholEligible;
    }

    public FulfillmentPartnerDecorator(boolean z10, int i10, AbstractC6392a partnerTitle, AbstractC6392a partnerDescription, AbstractC6392a partnerSubDescription, Double d10, fj.o fulfillmentPartner, String storeId, boolean z11) {
        Intrinsics.j(partnerTitle, "partnerTitle");
        Intrinsics.j(partnerDescription, "partnerDescription");
        Intrinsics.j(partnerSubDescription, "partnerSubDescription");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(storeId, "storeId");
        this.isPartnerSelected = z10;
        this.partnerIcon = i10;
        this.partnerTitle = partnerTitle;
        this.partnerDescription = partnerDescription;
        this.partnerSubDescription = partnerSubDescription;
        this.deliveryCost = d10;
        this.fulfillmentPartner = fulfillmentPartner;
        this.storeId = storeId;
        this.isAlcoholEligible = z11;
        this.deliveryCostFormatted = d10 == null ? AbstractC6392a.INSTANCE.a() : AbstractC6392a.INSTANCE.d(Y.f101236v6, d10);
    }

    public static /* synthetic */ FulfillmentPartnerDecorator b(FulfillmentPartnerDecorator fulfillmentPartnerDecorator, boolean z10, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Double d10, fj.o oVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = fulfillmentPartnerDecorator.isPartnerSelected;
        }
        if ((i11 & 2) != 0) {
            i10 = fulfillmentPartnerDecorator.partnerIcon;
        }
        if ((i11 & 4) != 0) {
            abstractC6392a = fulfillmentPartnerDecorator.partnerTitle;
        }
        if ((i11 & 8) != 0) {
            abstractC6392a2 = fulfillmentPartnerDecorator.partnerDescription;
        }
        if ((i11 & 16) != 0) {
            abstractC6392a3 = fulfillmentPartnerDecorator.partnerSubDescription;
        }
        if ((i11 & 32) != 0) {
            d10 = fulfillmentPartnerDecorator.deliveryCost;
        }
        if ((i11 & 64) != 0) {
            oVar = fulfillmentPartnerDecorator.fulfillmentPartner;
        }
        if ((i11 & 128) != 0) {
            str = fulfillmentPartnerDecorator.storeId;
        }
        if ((i11 & 256) != 0) {
            z11 = fulfillmentPartnerDecorator.isAlcoholEligible;
        }
        String str2 = str;
        boolean z12 = z11;
        Double d11 = d10;
        fj.o oVar2 = oVar;
        AbstractC6392a abstractC6392a4 = abstractC6392a3;
        AbstractC6392a abstractC6392a5 = abstractC6392a;
        return fulfillmentPartnerDecorator.a(z10, i10, abstractC6392a5, abstractC6392a2, abstractC6392a4, d11, oVar2, str2, z12);
    }

    public final FulfillmentPartnerDecorator a(boolean isPartnerSelected, int partnerIcon, AbstractC6392a partnerTitle, AbstractC6392a partnerDescription, AbstractC6392a partnerSubDescription, Double deliveryCost, fj.o fulfillmentPartner, String storeId, boolean isAlcoholEligible) {
        Intrinsics.j(partnerTitle, "partnerTitle");
        Intrinsics.j(partnerDescription, "partnerDescription");
        Intrinsics.j(partnerSubDescription, "partnerSubDescription");
        Intrinsics.j(fulfillmentPartner, "fulfillmentPartner");
        Intrinsics.j(storeId, "storeId");
        return new FulfillmentPartnerDecorator(isPartnerSelected, partnerIcon, partnerTitle, partnerDescription, partnerSubDescription, deliveryCost, fulfillmentPartner, storeId, isAlcoholEligible);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getDeliveryCostFormatted() {
        return this.deliveryCostFormatted;
    }

    /* renamed from: d, reason: from getter */
    public final fj.o getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC6392a getPartnerDescription() {
        return this.partnerDescription;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC6392a getPartnerSubDescription() {
        return this.partnerSubDescription;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getPartnerTitle() {
        return this.partnerTitle;
    }

    /* renamed from: h, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isPartnerSelected) * 31) + Integer.hashCode(this.partnerIcon)) * 31) + this.partnerTitle.hashCode()) * 31) + this.partnerDescription.hashCode()) * 31) + this.partnerSubDescription.hashCode()) * 31;
        Double d10 = this.deliveryCost;
        return ((((((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.fulfillmentPartner.hashCode()) * 31) + this.storeId.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholEligible);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsAlcoholEligible() {
        return this.isAlcoholEligible;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsPartnerSelected() {
        return this.isPartnerSelected;
    }

    public String toString() {
        return "FulfillmentPartnerDecorator(isPartnerSelected=" + this.isPartnerSelected + ", partnerIcon=" + this.partnerIcon + ", partnerTitle=" + this.partnerTitle + ", partnerDescription=" + this.partnerDescription + ", partnerSubDescription=" + this.partnerSubDescription + ", deliveryCost=" + this.deliveryCost + ", fulfillmentPartner=" + this.fulfillmentPartner + ", storeId=" + this.storeId + ", isAlcoholEligible=" + this.isAlcoholEligible + ')';
    }
}
