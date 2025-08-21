package cn;

import Co.ProductVariant;
import Co.ProductVariantGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcn/j;", "", "", "name", "", "Lcn/i;", "products", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cn.j, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductVariantGroupDecorator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f62659d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductVariantDecorator> products;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcn/j$a;", "", "<init>", "()V", "LCo/k;", "group", "Lcn/j;", "a", "(LCo/k;)Lcn/j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cn.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductVariantGroupDecorator a(ProductVariantGroup group) {
            Intrinsics.j(group, "group");
            String name = group.getName();
            List<ProductVariant> listA = group.a();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(ProductVariantDecorator.INSTANCE.a((ProductVariant) it.next()));
            }
            return new ProductVariantGroupDecorator(name, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductVariantGroupDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariantGroupDecorator)) {
            return false;
        }
        ProductVariantGroupDecorator productVariantGroupDecorator = (ProductVariantGroupDecorator) other;
        return Intrinsics.e(this.name, productVariantGroupDecorator.name) && Intrinsics.e(this.products, productVariantGroupDecorator.products);
    }

    public ProductVariantGroupDecorator(String str, List<ProductVariantDecorator> products) {
        Intrinsics.j(products, "products");
        this.name = str;
        this.products = products;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<ProductVariantDecorator> b() {
        return this.products;
    }

    public int hashCode() {
        String str = this.name;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.products.hashCode();
    }

    public String toString() {
        return "ProductVariantGroupDecorator(name=" + this.name + ", products=" + this.products + ')';
    }

    public /* synthetic */ ProductVariantGroupDecorator(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
