package com.meijer.mobile.meijer.activity.checkout.outofstock;

import com.meijer.mobile.meijer.activity.checkout.outofstock.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;", "", "<init>", "()V", "c", "a", "b", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;", "", "", "codes", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Dismiss extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> codes;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dismiss) && Intrinsics.e(this.codes, ((Dismiss) other).codes);
        }

        public int hashCode() {
            return this.codes.hashCode();
        }

        public String toString() {
            return "Dismiss(codes=" + this.codes + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(List<String> codes) {
            super(null);
            Intrinsics.j(codes, "codes");
            this.codes = codes;
        }

        public final List<String> a() {
            return this.codes;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$b;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;", "Ljava/util/ArrayList;", "Lvs/b;", "Lkotlin/collections/ArrayList;", "outOfStockList", "<init>", "(Ljava/util/ArrayList;)V", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<CartProductListDecorator> outOfStockList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList<CartProductListDecorator> outOfStockList) {
            super(null);
            Intrinsics.j(outOfStockList, "outOfStockList");
            this.outOfStockList = outOfStockList;
        }

        public final ArrayList<CartProductListDecorator> a() {
            return this.outOfStockList;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a$c;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "itemToSubstitute", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "()Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.outofstock.a$c, reason: from toString */
    public static final /* data */ class SearchForReplacement extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.b.OutOfStockItemState itemToSubstitute;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchForReplacement) && Intrinsics.e(this.itemToSubstitute, ((SearchForReplacement) other).itemToSubstitute);
        }

        public int hashCode() {
            return this.itemToSubstitute.hashCode();
        }

        public String toString() {
            return "SearchForReplacement(itemToSubstitute=" + this.itemToSubstitute + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchForReplacement(l.b.OutOfStockItemState itemToSubstitute) {
            super(null);
            Intrinsics.j(itemToSubstitute, "itemToSubstitute");
            this.itemToSubstitute = itemToSubstitute;
        }

        /* renamed from: a, reason: from getter */
        public final l.b.OutOfStockItemState getItemToSubstitute() {
            return this.itemToSubstitute;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
