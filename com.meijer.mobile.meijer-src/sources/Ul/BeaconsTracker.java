package Ul;

import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0088\u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b+\u0010'¨\u0006,"}, d2 = {"LUl/b;", "", "", "viewBeaconUrl", "loadBeaconUrl", "", "viewBeaconsSent", "loadBeaconsSent", "clickBeaconsSent", "basketChangeBeacon", "viewBeaconsSentBuyAgain", "viewBeaconsSentFavoritesOnSale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lkk/a;", "carouselType", "g", "(Lkk/a;)Ljava/util/List;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)LUl/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "setViewBeaconUrl", "(Ljava/lang/String;)V", "b", "e", "setLoadBeaconUrl", "c", "Ljava/util/List;", "getViewBeaconsSent", "()Ljava/util/List;", "d", "f", "i", "j", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ul.b, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class BeaconsTracker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String viewBeaconUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String loadBeaconUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> viewBeaconsSent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> loadBeaconsSent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> clickBeaconsSent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> basketChangeBeacon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> viewBeaconsSentBuyAgain;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> viewBeaconsSentFavoritesOnSale;

    public BeaconsTracker() {
        this(null, null, null, null, null, null, null, null, l3.f93323c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeaconsTracker)) {
            return false;
        }
        BeaconsTracker beaconsTracker = (BeaconsTracker) other;
        return Intrinsics.e(this.viewBeaconUrl, beaconsTracker.viewBeaconUrl) && Intrinsics.e(this.loadBeaconUrl, beaconsTracker.loadBeaconUrl) && Intrinsics.e(this.viewBeaconsSent, beaconsTracker.viewBeaconsSent) && Intrinsics.e(this.loadBeaconsSent, beaconsTracker.loadBeaconsSent) && Intrinsics.e(this.clickBeaconsSent, beaconsTracker.clickBeaconsSent) && Intrinsics.e(this.basketChangeBeacon, beaconsTracker.basketChangeBeacon) && Intrinsics.e(this.viewBeaconsSentBuyAgain, beaconsTracker.viewBeaconsSentBuyAgain) && Intrinsics.e(this.viewBeaconsSentFavoritesOnSale, beaconsTracker.viewBeaconsSentFavoritesOnSale);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ul.b$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15218a.values().length];
            try {
                iArr[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BeaconsTracker(String str, String str2, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> clickBeaconsSent, List<String> basketChangeBeacon, List<String> viewBeaconsSentBuyAgain, List<String> viewBeaconsSentFavoritesOnSale) {
        Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
        Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
        Intrinsics.j(clickBeaconsSent, "clickBeaconsSent");
        Intrinsics.j(basketChangeBeacon, "basketChangeBeacon");
        Intrinsics.j(viewBeaconsSentBuyAgain, "viewBeaconsSentBuyAgain");
        Intrinsics.j(viewBeaconsSentFavoritesOnSale, "viewBeaconsSentFavoritesOnSale");
        this.viewBeaconUrl = str;
        this.loadBeaconUrl = str2;
        this.viewBeaconsSent = viewBeaconsSent;
        this.loadBeaconsSent = loadBeaconsSent;
        this.clickBeaconsSent = clickBeaconsSent;
        this.basketChangeBeacon = basketChangeBeacon;
        this.viewBeaconsSentBuyAgain = viewBeaconsSentBuyAgain;
        this.viewBeaconsSentFavoritesOnSale = viewBeaconsSentFavoritesOnSale;
    }

    public static /* synthetic */ BeaconsTracker b(BeaconsTracker beaconsTracker, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = beaconsTracker.viewBeaconUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = beaconsTracker.loadBeaconUrl;
        }
        if ((i10 & 4) != 0) {
            list = beaconsTracker.viewBeaconsSent;
        }
        if ((i10 & 8) != 0) {
            list2 = beaconsTracker.loadBeaconsSent;
        }
        if ((i10 & 16) != 0) {
            list3 = beaconsTracker.clickBeaconsSent;
        }
        if ((i10 & 32) != 0) {
            list4 = beaconsTracker.basketChangeBeacon;
        }
        if ((i10 & 64) != 0) {
            list5 = beaconsTracker.viewBeaconsSentBuyAgain;
        }
        if ((i10 & 128) != 0) {
            list6 = beaconsTracker.viewBeaconsSentFavoritesOnSale;
        }
        List list7 = list5;
        List list8 = list6;
        List list9 = list3;
        List list10 = list4;
        return beaconsTracker.a(str, str2, list, list2, list9, list10, list7, list8);
    }

    public final BeaconsTracker a(String viewBeaconUrl, String loadBeaconUrl, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> clickBeaconsSent, List<String> basketChangeBeacon, List<String> viewBeaconsSentBuyAgain, List<String> viewBeaconsSentFavoritesOnSale) {
        Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
        Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
        Intrinsics.j(clickBeaconsSent, "clickBeaconsSent");
        Intrinsics.j(basketChangeBeacon, "basketChangeBeacon");
        Intrinsics.j(viewBeaconsSentBuyAgain, "viewBeaconsSentBuyAgain");
        Intrinsics.j(viewBeaconsSentFavoritesOnSale, "viewBeaconsSentFavoritesOnSale");
        return new BeaconsTracker(viewBeaconUrl, loadBeaconUrl, viewBeaconsSent, loadBeaconsSent, clickBeaconsSent, basketChangeBeacon, viewBeaconsSentBuyAgain, viewBeaconsSentFavoritesOnSale);
    }

    public final List<String> c() {
        return this.basketChangeBeacon;
    }

    public final List<String> d() {
        return this.clickBeaconsSent;
    }

    /* renamed from: e, reason: from getter */
    public final String getLoadBeaconUrl() {
        return this.loadBeaconUrl;
    }

    public final List<String> f() {
        return this.loadBeaconsSent;
    }

    public final List<String> g(EnumC15218a carouselType) {
        Intrinsics.j(carouselType, "carouselType");
        int i10 = a.$EnumSwitchMapping$0[carouselType.ordinal()];
        return i10 != 1 ? i10 != 2 ? CollectionsKt.m() : this.viewBeaconsSentFavoritesOnSale : this.viewBeaconsSentBuyAgain;
    }

    /* renamed from: h, reason: from getter */
    public final String getViewBeaconUrl() {
        return this.viewBeaconUrl;
    }

    public int hashCode() {
        String str = this.viewBeaconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadBeaconUrl;
        return ((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.viewBeaconsSent.hashCode()) * 31) + this.loadBeaconsSent.hashCode()) * 31) + this.clickBeaconsSent.hashCode()) * 31) + this.basketChangeBeacon.hashCode()) * 31) + this.viewBeaconsSentBuyAgain.hashCode()) * 31) + this.viewBeaconsSentFavoritesOnSale.hashCode();
    }

    public final List<String> i() {
        return this.viewBeaconsSentBuyAgain;
    }

    public final List<String> j() {
        return this.viewBeaconsSentFavoritesOnSale;
    }

    public String toString() {
        return "BeaconsTracker(viewBeaconUrl=" + this.viewBeaconUrl + ", loadBeaconUrl=" + this.loadBeaconUrl + ", viewBeaconsSent=" + this.viewBeaconsSent + ", loadBeaconsSent=" + this.loadBeaconsSent + ", clickBeaconsSent=" + this.clickBeaconsSent + ", basketChangeBeacon=" + this.basketChangeBeacon + ", viewBeaconsSentBuyAgain=" + this.viewBeaconsSentBuyAgain + ", viewBeaconsSentFavoritesOnSale=" + this.viewBeaconsSentFavoritesOnSale + ')';
    }

    public /* synthetic */ BeaconsTracker(String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? CollectionsKt.m() : list2, (i10 & 16) != 0 ? CollectionsKt.m() : list3, (i10 & 32) != 0 ? CollectionsKt.m() : list4, (i10 & 64) != 0 ? CollectionsKt.m() : list5, (i10 & 128) != 0 ? CollectionsKt.m() : list6);
    }
}
