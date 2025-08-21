package com.meijer.mobile.meijer.activity.cart;

import Co.ProductFullDetails;
import fj.Entry;
import fj.EntryChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001\u0017BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/N0;", "", "LCo/h;", "product", "Lnk/g;", "thumbnail", "", "thumbnailUrl", "productName", "", "errorImageResource", "thumbnailDescription", "status", "<init>", "(LCo/h;Lnk/g;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "Lnk/g;", "getThumbnail", "()Lnk/g;", "c", "Ljava/lang/String;", "d", "e", "I", "getErrorImageResource", "f", "g", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.cart.N0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ChangeFulfillmentPreviewDecorator {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f102476i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.g thumbnail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int errorImageResource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailDescription;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer status;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/N0$a;", "", "<init>", "()V", "LCo/h;", "product", "Lfj/j$c;", "status", "Lcom/meijer/mobile/meijer/activity/cart/N0;", "a", "(LCo/h;Lfj/j$c;)Lcom/meijer/mobile/meijer/activity/cart/N0;", "", "Lfj/j;", "changes", "b", "(Ljava/util/List;)Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.cart.N0$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.N0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1425a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131921c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f131923e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EntryChange.c.f131925g.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EntryChange.c.f131924f.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EntryChange.c.f131926h.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChangeFulfillmentPreviewDecorator a(ProductFullDetails product, EntryChange.c status) {
            int i10;
            Intrinsics.j(product, "product");
            Intrinsics.j(status, "status");
            nk.g gVarB = O0.b(product);
            String name = product.getName();
            String url = gVarB != null ? gVarB.getUrl() : null;
            String altText = gVarB != null ? gVarB.getAltText() : null;
            int i11 = Cj.i.f4726O1;
            switch (C1425a.$EnumSwitchMapping$0[status.ordinal()]) {
                case 1:
                    i10 = com.meijer.mobile.meijer.Y.f100526L0;
                    break;
                case 2:
                    i10 = com.meijer.mobile.meijer.Y.f100412F0;
                    break;
                case 3:
                    i10 = com.meijer.mobile.meijer.Y.f100507K0;
                    break;
                case 4:
                    i10 = com.meijer.mobile.meijer.Y.f100583O0;
                    break;
                case 5:
                case 6:
                    i10 = com.meijer.mobile.meijer.Y.f100564N0;
                    break;
                case 7:
                    i10 = com.meijer.mobile.meijer.Y.f100488J0;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new ChangeFulfillmentPreviewDecorator(product, gVarB, url, name, i11, altText, Integer.valueOf(i10));
        }

        public final List<ChangeFulfillmentPreviewDecorator> b(List<EntryChange> changes) {
            Intrinsics.j(changes, "changes");
            ArrayList arrayList = new ArrayList();
            for (EntryChange entryChange : changes) {
                Entry entry = entryChange.getEntry();
                ChangeFulfillmentPreviewDecorator changeFulfillmentPreviewDecoratorA = entry != null ? ChangeFulfillmentPreviewDecorator.INSTANCE.a(entry.m(), entryChange.getStatusCode()) : null;
                if (changeFulfillmentPreviewDecoratorA != null) {
                    arrayList.add(changeFulfillmentPreviewDecoratorA);
                }
            }
            return arrayList;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeFulfillmentPreviewDecorator)) {
            return false;
        }
        ChangeFulfillmentPreviewDecorator changeFulfillmentPreviewDecorator = (ChangeFulfillmentPreviewDecorator) other;
        return Intrinsics.e(this.product, changeFulfillmentPreviewDecorator.product) && Intrinsics.e(this.thumbnail, changeFulfillmentPreviewDecorator.thumbnail) && Intrinsics.e(this.thumbnailUrl, changeFulfillmentPreviewDecorator.thumbnailUrl) && Intrinsics.e(this.productName, changeFulfillmentPreviewDecorator.productName) && this.errorImageResource == changeFulfillmentPreviewDecorator.errorImageResource && Intrinsics.e(this.thumbnailDescription, changeFulfillmentPreviewDecorator.thumbnailDescription) && Intrinsics.e(this.status, changeFulfillmentPreviewDecorator.status);
    }

    public int hashCode() {
        int iHashCode = this.product.hashCode() * 31;
        nk.g gVar = this.thumbnail;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.thumbnailUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.errorImageResource)) * 31;
        String str3 = this.thumbnailDescription;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ChangeFulfillmentPreviewDecorator(product=" + this.product + ", thumbnail=" + this.thumbnail + ", thumbnailUrl=" + this.thumbnailUrl + ", productName=" + this.productName + ", errorImageResource=" + this.errorImageResource + ", thumbnailDescription=" + this.thumbnailDescription + ", status=" + this.status + ')';
    }

    public ChangeFulfillmentPreviewDecorator(ProductFullDetails product, nk.g gVar, String str, String str2, int i10, String str3, Integer num) {
        Intrinsics.j(product, "product");
        this.product = product;
        this.thumbnail = gVar;
        this.thumbnailUrl = str;
        this.productName = str2;
        this.errorImageResource = i10;
        this.thumbnailDescription = str3;
        this.status = num;
    }

    /* renamed from: a, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: c, reason: from getter */
    public final String getThumbnailDescription() {
        return this.thumbnailDescription;
    }

    /* renamed from: d, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
}
