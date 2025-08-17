package hq;

import Xp.ShopAndScanItem;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lhq/i;", "", "Lak/a;", "title", "description", "inline", "", "isDismissed", "<init>", "(Lak/a;Lak/a;Lak/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "d", "Z", "()Z", "e", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.i, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanRestrictionDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f136228f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a inline;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDismissed;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhq/i$a;", "", "<init>", "()V", "LXp/c$e;", "", "isDismissed", "Lhq/i;", "a", "(LXp/c$e;Z)Lhq/i;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hq.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShopAndScanRestrictionDecorator a(ShopAndScanItem.ShopAndScanItemRestriction shopAndScanItemRestriction, boolean z10) {
            Intrinsics.j(shopAndScanItemRestriction, "<this>");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            return new ShopAndScanRestrictionDecorator(companion.c(shopAndScanItemRestriction.getTitle()), companion.c(shopAndScanItemRestriction.getMessage()), companion.c(shopAndScanItemRestriction.getTitle()), z10);
        }
    }

    public ShopAndScanRestrictionDecorator() {
        this(null, null, null, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanRestrictionDecorator)) {
            return false;
        }
        ShopAndScanRestrictionDecorator shopAndScanRestrictionDecorator = (ShopAndScanRestrictionDecorator) other;
        return Intrinsics.e(this.title, shopAndScanRestrictionDecorator.title) && Intrinsics.e(this.description, shopAndScanRestrictionDecorator.description) && Intrinsics.e(this.inline, shopAndScanRestrictionDecorator.inline) && this.isDismissed == shopAndScanRestrictionDecorator.isDismissed;
    }

    public ShopAndScanRestrictionDecorator(AbstractC5607a title, AbstractC5607a description, AbstractC5607a inline, boolean z10) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(inline, "inline");
        this.title = title;
        this.description = description;
        this.inline = inline;
        this.isDismissed = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getInline() {
        return this.inline;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.inline.hashCode()) * 31) + Boolean.hashCode(this.isDismissed);
    }

    public String toString() {
        return "ShopAndScanRestrictionDecorator(title=" + this.title + ", description=" + this.description + ", inline=" + this.inline + ", isDismissed=" + this.isDismissed + ')';
    }

    public /* synthetic */ ShopAndScanRestrictionDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a2, (i10 & 4) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a3, (i10 & 8) != 0 ? false : z10);
    }
}
