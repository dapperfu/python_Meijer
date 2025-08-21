package cn;

import Co.Image;
import Co.ProductVariant;
import Co.StockInfo;
import android.icu.text.NumberFormat;
import bk.AbstractC6392a;
import io.constructor.data.local.PreferencesHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0016B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lcn/i;", "", "Lnk/f;", PreferencesHelper.PREF_ID, "", "title", "LCo/e;", "image", "Lbk/a;", "priceText", "", "isOutOfStock", "<init>", "(Lnk/f;Ljava/lang/String;LCo/e;Lbk/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "b", "Ljava/lang/String;", "d", "c", "LCo/e;", "()LCo/e;", "Lbk/a;", "()Lbk/a;", "e", "Z", "()Z", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cn.i, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductVariantDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f62652g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.f id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image image;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a priceText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOutOfStock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcn/i$a;", "", "<init>", "()V", "Lnk/b;", "itemPrice", "Lbk/a;", "b", "(Lnk/b;)Lbk/a;", "LCo/j;", "item", "Lcn/i;", "a", "(LCo/j;)Lcn/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: cn.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final AbstractC6392a b(nk.b itemPrice) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            String str = NumberFormat.getCurrencyInstance(Locale.US).format(itemPrice.getValue());
            Intrinsics.i(str, "format(...)");
            return companion.c(str);
        }

        public final ProductVariantDecorator a(ProductVariant item) {
            Intrinsics.j(item, "item");
            nk.f id2 = item.getId();
            String attribute = item.getAttribute();
            Image image = item.getImage();
            nk.b price = item.getPrice();
            AbstractC6392a abstractC6392aB = price != null ? ProductVariantDecorator.INSTANCE.b(price) : null;
            StockInfo stock = item.getStock();
            return new ProductVariantDecorator(id2, attribute, image, abstractC6392aB, stock != null ? stock.e() : false);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariantDecorator)) {
            return false;
        }
        ProductVariantDecorator productVariantDecorator = (ProductVariantDecorator) other;
        return Intrinsics.e(this.id, productVariantDecorator.id) && Intrinsics.e(this.title, productVariantDecorator.title) && Intrinsics.e(this.image, productVariantDecorator.image) && Intrinsics.e(this.priceText, productVariantDecorator.priceText) && this.isOutOfStock == productVariantDecorator.isOutOfStock;
    }

    public ProductVariantDecorator(nk.f id2, String title, Image image, AbstractC6392a abstractC6392a, boolean z10) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        this.id = id2;
        this.title = title;
        this.image = image;
        this.priceText = abstractC6392a;
        this.isOutOfStock = z10;
    }

    /* renamed from: a, reason: from getter */
    public final nk.f getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getPriceText() {
        return this.priceText;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsOutOfStock() {
        return this.isOutOfStock;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        AbstractC6392a abstractC6392a = this.priceText;
        return ((iHashCode2 + (abstractC6392a != null ? abstractC6392a.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOutOfStock);
    }

    public String toString() {
        return "ProductVariantDecorator(id=" + this.id + ", title=" + this.title + ", image=" + this.image + ", priceText=" + this.priceText + ", isOutOfStock=" + this.isOutOfStock + ')';
    }
}
