package vs;

import Pj.a;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lvs/a;", "", "", "banner", "key", "LPj/a;", "loadingState", "", "bannerErrorImageResource", "title", "deepLink", "Lkk/a;", "carouselType", "<init>", "(Ljava/lang/String;Ljava/lang/String;LPj/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkk/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "LPj/a;", "f", "()LPj/a;", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "Lkk/a;", "()Lkk/a;", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vs.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CarouselDecorator {

    /* renamed from: h, reason: collision with root package name */
    public static final int f166181h = Pj.a.f26096c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String banner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pj.a loadingState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bannerErrorImageResource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deepLink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC15218a carouselType;

    public CarouselDecorator(String str, String key, Pj.a loadingState, Integer num, String title, String deepLink, EnumC15218a carouselType) {
        Intrinsics.j(key, "key");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(title, "title");
        Intrinsics.j(deepLink, "deepLink");
        Intrinsics.j(carouselType, "carouselType");
        this.banner = str;
        this.key = key;
        this.loadingState = loadingState;
        this.bannerErrorImageResource = num;
        this.title = title;
        this.deepLink = deepLink;
        this.carouselType = carouselType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselDecorator)) {
            return false;
        }
        CarouselDecorator carouselDecorator = (CarouselDecorator) other;
        return Intrinsics.e(this.banner, carouselDecorator.banner) && Intrinsics.e(this.key, carouselDecorator.key) && Intrinsics.e(this.loadingState, carouselDecorator.loadingState) && Intrinsics.e(this.bannerErrorImageResource, carouselDecorator.bannerErrorImageResource) && Intrinsics.e(this.title, carouselDecorator.title) && Intrinsics.e(this.deepLink, carouselDecorator.deepLink) && this.carouselType == carouselDecorator.carouselType;
    }

    /* renamed from: a, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getBannerErrorImageResource() {
        return this.bannerErrorImageResource;
    }

    /* renamed from: c, reason: from getter */
    public final EnumC15218a getCarouselType() {
        return this.carouselType;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: e, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: f, reason: from getter */
    public final Pj.a getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.banner;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.key.hashCode()) * 31) + this.loadingState.hashCode()) * 31;
        Integer num = this.bannerErrorImageResource;
        return ((((((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.deepLink.hashCode()) * 31) + this.carouselType.hashCode();
    }

    public String toString() {
        return "CarouselDecorator(banner=" + this.banner + ", key=" + this.key + ", loadingState=" + this.loadingState + ", bannerErrorImageResource=" + this.bannerErrorImageResource + ", title=" + this.title + ", deepLink=" + this.deepLink + ", carouselType=" + this.carouselType + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CarouselDecorator(String str, String str2, Pj.a aVar, Integer num, String str3, String str4, EnumC15218a enumC15218a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        EnumC15218a enumC15218a2;
        String str5;
        String str6;
        Integer num2;
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? "" : str2;
        aVar = (i10 & 4) != 0 ? new a.NotLoading(null, 1, null) : aVar;
        if ((i10 & 8) != 0) {
            enumC15218a2 = enumC15218a;
            str5 = str4;
            str6 = str3;
            num2 = null;
        } else {
            enumC15218a2 = enumC15218a;
            str5 = str4;
            str6 = str3;
            num2 = num;
        }
        this(str, str2, aVar, num2, str6, str5, enumC15218a2);
    }
}
