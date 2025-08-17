package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Image;
import Co.ProductFullDetails;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsDecorator;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import mk.InterfaceC15637a;
import vk.C17590a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0001(BÓ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00101\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b(\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b,\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b=\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010@\u001a\u0004\b>\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\b;\u0010FR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010E\u001a\u0004\b2\u0010FR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\b7\u0010FR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\b<\u0010FR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bH\u0010FR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010FR\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bI\u0010FR\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bG\u0010DR\u0017\u0010\u001c\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\b\u001c\u0010F¨\u0006N"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "", "LCo/h;", "product", "Lmk/f;", PreferencesHelper.PREF_ID, "Lmk/c;", "name", "Lak/a;", "title", "description", "disclaimers", "ingredients", "priceGoodThroughDate", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "images", "", "maxOrderQuantity", "", "hasChokingWarning", "hasAgeRestriction", "hasAlcoholWarning", "hasCoupons", "isBOPAS", "isOnSale", "isMap", "qtyIncrement", "isSubscriptionAvailable", "<init>", "(LCo/h;Lmk/f;Lmk/c;Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;Ljava/util/List;DZZZZZZZDZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "getProduct", "()LCo/h;", "b", "Lmk/f;", "g", "()Lmk/f;", "getId$annotations", "()V", "c", "Lmk/c;", "k", "()Lmk/c;", "getName$annotations", "d", "Lak/a;", "n", "()Lak/a;", "e", "f", "i", "h", "l", "Ljava/util/List;", "()Ljava/util/List;", "j", "D", "()D", "Z", "()Z", "m", "o", "p", "q", "r", "s", "t", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.h1, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ProductDetailsDecorator {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f108834u = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.f id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.c name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a disclaimers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a ingredients;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a priceGoodThroughDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductImageViewModel> images;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxOrderQuantity;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasChokingWarning;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasAgeRestriction;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasAlcoholWarning;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasCoupons;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBOPAS;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMap;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscriptionAvailable;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1$a;", "", "<init>", "()V", "LCo/h;", "product", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "b", "(LCo/h;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.h1$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.h1$a$a, reason: collision with other inner class name */
        public static final class C1646a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((ProductImageViewModel) t11).z()), Boolean.valueOf(((ProductImageViewModel) t10).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.h1$a$b */
        public static final class b<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f108854a;

            public b(Comparator comparator) {
                this.f108854a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f108854a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((ProductImageViewModel) t10).a1(), ((ProductImageViewModel) t11).a1());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.h1$a$c */
        public static final class c<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(Image it) {
            Intrinsics.j(it, "it");
            return it.h();
        }

        public final ProductDetailsDecorator b(ProductFullDetails product) {
            OffsetDateTime priceGoodThrough;
            Intrinsics.j(product, "product");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            AbstractC5607a abstractC5607aC = companion.c(product.getName());
            String description = product.getDescription();
            AbstractC5607a abstractC5607aD = null;
            AbstractC5607a abstractC5607aC2 = description != null ? companion.c(description) : null;
            AbstractC5607a abstractC5607aC3 = companion.c(StringsKt.Q(product.getDisclaimer(), "\\n", "\n", false, 4, null));
            String ingredients = product.getIngredients();
            AbstractC5607a abstractC5607aC4 = ingredients != null ? !StringsKt.r0(ingredients) ? companion.c(ingredients) : null : null;
            InterfaceC15637a discount = product.getDiscount();
            if (discount != null && (priceGoodThrough = discount.getPriceGoodThrough()) != null) {
                abstractC5607aD = companion.d(com.meijer.mobile.meijer.Y.f100101hc, priceGoodThrough.format(C17590a.DATE_SLASHES_SHORT));
            }
            AbstractC5607a abstractC5607a = abstractC5607aD;
            Sequence sequenceB = SequencesKt.B(CollectionsKt.f0(product.j()), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ProductDetailsDecorator.Companion.c((Image) obj));
                }
            });
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : sequenceB) {
                String strA1 = ((Image) obj).a1();
                Object arrayList = linkedHashMap.get(strA1);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strA1, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList<Pair> arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List listZ0 = CollectionsKt.Z0((List) ((Map.Entry) it.next()).getValue(), new c());
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : listZ0) {
                    if (((Image) obj2).f() <= 200) {
                        arrayList3.add(obj2);
                    } else {
                        arrayList4.add(obj2);
                    }
                }
                arrayList2.add(new Pair(arrayList3, arrayList4));
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.x(arrayList2, 10));
            for (Pair pair : arrayList2) {
                List list = (List) pair.a();
                List list2 = (List) pair.b();
                Image imageJ = (Image) CollectionsKt.F0(list);
                if (imageJ == null) {
                    imageJ = ((Image) CollectionsKt.s0(list2)).j(HttpResponseStatus.SUCCESS_OK);
                }
                Image imageJ2 = (Image) CollectionsKt.F0(list2);
                if (imageJ2 == null) {
                    imageJ2 = ((Image) CollectionsKt.D0(list)).j(1200);
                }
                arrayList5.add(new ProductImageViewModel(imageJ, imageJ2, false, 4, null));
            }
            return new ProductDetailsDecorator(product, null, null, abstractC5607aC, abstractC5607aC2, abstractC5607aC3, abstractC5607aC4, abstractC5607a, CollectionsKt.j1(CollectionsKt.Z0(arrayList5, new b(new C1646a()))), product.getMaxOrderQuantity() != null ? r0.intValue() : 2.147483647E9d, product.getIsChokingHazard(), product.getIsAgeRestricted(), product.getIsAlcohol(), product.getHasMPerksOffers(), product.getIsBopas(), (product.getDiscount() == null || product.getDiscountedPrice() == null || product.getIsMap()) ? false : true, product.getIsMap(), product.getQtyIncrement(), product.getIsSubscriptionAvailable(), 6, null);
        }
    }

    public ProductDetailsDecorator() {
        this(null, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, 0.0d, false, 524287, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsDecorator)) {
            return false;
        }
        ProductDetailsDecorator productDetailsDecorator = (ProductDetailsDecorator) other;
        return Intrinsics.e(this.product, productDetailsDecorator.product) && Intrinsics.e(this.id, productDetailsDecorator.id) && Intrinsics.e(this.name, productDetailsDecorator.name) && Intrinsics.e(this.title, productDetailsDecorator.title) && Intrinsics.e(this.description, productDetailsDecorator.description) && Intrinsics.e(this.disclaimers, productDetailsDecorator.disclaimers) && Intrinsics.e(this.ingredients, productDetailsDecorator.ingredients) && Intrinsics.e(this.priceGoodThroughDate, productDetailsDecorator.priceGoodThroughDate) && Intrinsics.e(this.images, productDetailsDecorator.images) && Double.compare(this.maxOrderQuantity, productDetailsDecorator.maxOrderQuantity) == 0 && this.hasChokingWarning == productDetailsDecorator.hasChokingWarning && this.hasAgeRestriction == productDetailsDecorator.hasAgeRestriction && this.hasAlcoholWarning == productDetailsDecorator.hasAlcoholWarning && this.hasCoupons == productDetailsDecorator.hasCoupons && this.isBOPAS == productDetailsDecorator.isBOPAS && this.isOnSale == productDetailsDecorator.isOnSale && this.isMap == productDetailsDecorator.isMap && Double.compare(this.qtyIncrement, productDetailsDecorator.qtyIncrement) == 0 && this.isSubscriptionAvailable == productDetailsDecorator.isSubscriptionAvailable;
    }

    public int hashCode() {
        int iHashCode = ((((((this.product.hashCode() * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.description;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.disclaimers;
        int iHashCode3 = (iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.ingredients;
        int iHashCode4 = (iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        AbstractC5607a abstractC5607a4 = this.priceGoodThroughDate;
        return ((((((((((((((((((((((iHashCode4 + (abstractC5607a4 != null ? abstractC5607a4.hashCode() : 0)) * 31) + this.images.hashCode()) * 31) + Double.hashCode(this.maxOrderQuantity)) * 31) + Boolean.hashCode(this.hasChokingWarning)) * 31) + Boolean.hashCode(this.hasAgeRestriction)) * 31) + Boolean.hashCode(this.hasAlcoholWarning)) * 31) + Boolean.hashCode(this.hasCoupons)) * 31) + Boolean.hashCode(this.isBOPAS)) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.isMap)) * 31) + Double.hashCode(this.qtyIncrement)) * 31) + Boolean.hashCode(this.isSubscriptionAvailable);
    }

    public String toString() {
        return "ProductDetailsDecorator(product=" + this.product + ", id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", disclaimers=" + this.disclaimers + ", ingredients=" + this.ingredients + ", priceGoodThroughDate=" + this.priceGoodThroughDate + ", images=" + this.images + ", maxOrderQuantity=" + this.maxOrderQuantity + ", hasChokingWarning=" + this.hasChokingWarning + ", hasAgeRestriction=" + this.hasAgeRestriction + ", hasAlcoholWarning=" + this.hasAlcoholWarning + ", hasCoupons=" + this.hasCoupons + ", isBOPAS=" + this.isBOPAS + ", isOnSale=" + this.isOnSale + ", isMap=" + this.isMap + ", qtyIncrement=" + this.qtyIncrement + ", isSubscriptionAvailable=" + this.isSubscriptionAvailable + ')';
    }

    public ProductDetailsDecorator(ProductFullDetails product, mk.f id2, mk.c name, AbstractC5607a title, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, List<ProductImageViewModel> images, double d10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, double d11, boolean z17) {
        Intrinsics.j(product, "product");
        Intrinsics.j(id2, "id");
        Intrinsics.j(name, "name");
        Intrinsics.j(title, "title");
        Intrinsics.j(images, "images");
        this.product = product;
        this.id = id2;
        this.name = name;
        this.title = title;
        this.description = abstractC5607a;
        this.disclaimers = abstractC5607a2;
        this.ingredients = abstractC5607a3;
        this.priceGoodThroughDate = abstractC5607a4;
        this.images = images;
        this.maxOrderQuantity = d10;
        this.hasChokingWarning = z10;
        this.hasAgeRestriction = z11;
        this.hasAlcoholWarning = z12;
        this.hasCoupons = z13;
        this.isBOPAS = z14;
        this.isOnSale = z15;
        this.isMap = z16;
        this.qtyIncrement = d11;
        this.isSubscriptionAvailable = z17;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDisclaimers() {
        return this.disclaimers;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasAgeRestriction() {
        return this.hasAgeRestriction;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasAlcoholWarning() {
        return this.hasAlcoholWarning;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHasChokingWarning() {
        return this.hasChokingWarning;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getHasCoupons() {
        return this.hasCoupons;
    }

    /* renamed from: g, reason: from getter */
    public final mk.f getId() {
        return this.id;
    }

    public final List<ProductImageViewModel> h() {
        return this.images;
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC5607a getIngredients() {
        return this.ingredients;
    }

    /* renamed from: j, reason: from getter */
    public final double getMaxOrderQuantity() {
        return this.maxOrderQuantity;
    }

    /* renamed from: k, reason: from getter */
    public final mk.c getName() {
        return this.name;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC5607a getPriceGoodThroughDate() {
        return this.priceGoodThroughDate;
    }

    /* renamed from: m, reason: from getter */
    public final double getQtyIncrement() {
        return this.qtyIncrement;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsBOPAS() {
        return this.isBOPAS;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsMap() {
        return this.isMap;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsOnSale() {
        return this.isOnSale;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductDetailsDecorator(ProductFullDetails productFullDetails, mk.f fVar, mk.c cVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, List list, double d10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, double d11, boolean z17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ProductFullDetails productFullDetails2 = (i10 & 1) != 0 ? new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null) : productFullDetails;
        this(productFullDetails2, (i10 & 2) != 0 ? productFullDetails2 : fVar, (i10 & 4) != 0 ? productFullDetails2 : cVar, (i10 & 8) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 16) != 0 ? null : abstractC5607a2, (i10 & 32) != 0 ? null : abstractC5607a3, (i10 & 64) != 0 ? null : abstractC5607a4, (i10 & 128) == 0 ? abstractC5607a5 : null, (i10 & 256) != 0 ? CollectionsKt.m() : list, (i10 & 512) != 0 ? 0.0d : d10, (i10 & 1024) != 0 ? false : z10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z12, (i10 & 8192) != 0 ? false : z13, (i10 & 16384) != 0 ? false : z14, (i10 & 32768) != 0 ? false : z15, (i10 & 65536) != 0 ? false : z16, (i10 & 131072) != 0 ? 0.0d : d11, (i10 & 262144) != 0 ? false : z17);
    }
}
