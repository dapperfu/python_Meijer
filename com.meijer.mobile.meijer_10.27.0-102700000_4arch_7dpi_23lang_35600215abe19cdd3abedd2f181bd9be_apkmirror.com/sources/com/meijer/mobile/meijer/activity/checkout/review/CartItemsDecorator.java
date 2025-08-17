package com.meijer.mobile.meijer.activity.checkout.review;

import Hk.Validation;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import ej.Entry;
import ej.ShoppingCart;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0001\u0015BI\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "", "", "Lcom/meijer/mobile/meijer/activity/checkout/review/P1;", "showItems", "totalCartItems", "", "extraItemCount", "", "error", "", "isEbtEligible", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Z", "()Z", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.u, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CartItemsDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f105033g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryDecorator> showItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryDecorator> totalCartItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extraItemCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEbtEligible;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/u$a;", "", "<init>", "()V", "LHk/b;", "Lej/C;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "g", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "", "Lej/i;", "entryList", "", "error", "c", "(Ljava/util/List;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.u$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.u$a$a, reason: collision with other inner class name */
        public static final class C1529a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Entry) t10).getEntryNumber()), Integer.valueOf(((Entry) t11).getEntryNumber()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.u$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Entry) t11).getEntryNumber()), Integer.valueOf(((Entry) t10).getEntryNumber()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CartItemsDecorator d(Companion companion, List list, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.c(list, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EntryDecorator e(Entry it) {
            Intrinsics.j(it, "it");
            return EntryDecorator.INSTANCE.a(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EntryDecorator f(Entry it) {
            Intrinsics.j(it, "it");
            return EntryDecorator.INSTANCE.a(it);
        }

        public final CartItemsDecorator c(List<Entry> entryList, String error) {
            String string;
            List listW = SequencesKt.W(SequencesKt.T(SequencesKt.N(SequencesKt.S(CollectionsKt.f0(entryList == null ? CollectionsKt.m() : entryList), new b()), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CartItemsDecorator.Companion.e((Entry) obj);
                }
            }), 3));
            List listW2 = SequencesKt.W(SequencesKt.N(SequencesKt.S(CollectionsKt.f0(entryList == null ? CollectionsKt.m() : entryList), new C1529a()), new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CartItemsDecorator.Companion.f((Entry) obj);
                }
            }));
            Integer numValueOf = Integer.valueOf((entryList == null ? CollectionsKt.m() : entryList).size() - 3);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('+');
                sb2.append(iIntValue);
                string = sb2.toString();
            } else {
                string = null;
            }
            Integer numValueOf2 = (error == null || error.length() == 0) ? null : Integer.valueOf(com.meijer.mobile.meijer.Y.f99712Na);
            if (entryList == null) {
                entryList = CollectionsKt.m();
            }
            List<Entry> list = entryList;
            boolean z10 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Entry) it.next()).m().getIsEbtProduct()) {
                        z10 = true;
                        break;
                    }
                }
            }
            return new CartItemsDecorator(listW, listW2, string, numValueOf2, z10);
        }

        public final CartItemsDecorator g(Validation<ShoppingCart> validation) {
            Intrinsics.j(validation, "validation");
            ShoppingCart shoppingCartE = validation.e();
            List<Entry> listP = shoppingCartE != null ? shoppingCartE.p() : null;
            Hk.c cVar = (Hk.c) CollectionsKt.u0(validation.getResult().a());
            return c(listP, cVar != null ? cVar.getMessage() : null);
        }
    }

    public CartItemsDecorator() {
        this(null, null, null, null, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemsDecorator)) {
            return false;
        }
        CartItemsDecorator cartItemsDecorator = (CartItemsDecorator) other;
        return Intrinsics.e(this.showItems, cartItemsDecorator.showItems) && Intrinsics.e(this.totalCartItems, cartItemsDecorator.totalCartItems) && Intrinsics.e(this.extraItemCount, cartItemsDecorator.extraItemCount) && Intrinsics.e(this.error, cartItemsDecorator.error) && this.isEbtEligible == cartItemsDecorator.isEbtEligible;
    }

    public int hashCode() {
        int iHashCode = ((this.showItems.hashCode() * 31) + this.totalCartItems.hashCode()) * 31;
        String str = this.extraItemCount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.error;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEbtEligible);
    }

    public String toString() {
        return "CartItemsDecorator(showItems=" + this.showItems + ", totalCartItems=" + this.totalCartItems + ", extraItemCount=" + this.extraItemCount + ", error=" + this.error + ", isEbtEligible=" + this.isEbtEligible + ')';
    }

    public CartItemsDecorator(List<EntryDecorator> showItems, List<EntryDecorator> totalCartItems, String str, Integer num, boolean z10) {
        Intrinsics.j(showItems, "showItems");
        Intrinsics.j(totalCartItems, "totalCartItems");
        this.showItems = showItems;
        this.totalCartItems = totalCartItems;
        this.extraItemCount = str;
        this.error = num;
        this.isEbtEligible = z10;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final String getExtraItemCount() {
        return this.extraItemCount;
    }

    public final List<EntryDecorator> c() {
        return this.showItems;
    }

    public final List<EntryDecorator> d() {
        return this.totalCartItems;
    }

    public /* synthetic */ CartItemsDecorator(List list, List list2, String str, Integer num, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? CollectionsKt.m() : list2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? false : z10);
    }
}
