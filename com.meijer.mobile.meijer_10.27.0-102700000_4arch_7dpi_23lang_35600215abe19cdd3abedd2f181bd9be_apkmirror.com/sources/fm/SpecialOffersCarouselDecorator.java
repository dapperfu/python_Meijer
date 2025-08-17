package fm;

import Oj.a;
import ak.AbstractC5607a;
import com.medallia.digital.mobilesdk.l3;
import dl.SpecialOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010Jh\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\"\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b(\u0010\u0016R\u0011\u0010/\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lfm/c;", "", "Lak/a;", "carouselTitle", "", "subtitleSegments", "Ldl/b;", "carouselItems", "", "bannerResource", "", "bannerErrorImageResource", "LOj/a;", "loadingState", "carouselItemsCount", "<init>", "(Lak/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;LOj/a;I)V", "a", "(Lak/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;LOj/a;I)Lfm/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "g", "()Lak/a;", "b", "Ljava/util/List;", "getSubtitleSegments", "()Ljava/util/List;", "c", "e", "d", "Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "LOj/a;", "h", "()LOj/a;", "I", "i", "()Z", "isErrorVisible", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.c, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class SpecialOffersCarouselDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a carouselTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AbstractC5607a> subtitleSegments;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SpecialOffer> carouselItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerResource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bannerErrorImageResource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Oj.a loadingState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int carouselItemsCount;

    public SpecialOffersCarouselDecorator() {
        this(null, null, null, null, null, null, 0, l3.f92485d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialOffersCarouselDecorator)) {
            return false;
        }
        SpecialOffersCarouselDecorator specialOffersCarouselDecorator = (SpecialOffersCarouselDecorator) other;
        return Intrinsics.e(this.carouselTitle, specialOffersCarouselDecorator.carouselTitle) && Intrinsics.e(this.subtitleSegments, specialOffersCarouselDecorator.subtitleSegments) && Intrinsics.e(this.carouselItems, specialOffersCarouselDecorator.carouselItems) && Intrinsics.e(this.bannerResource, specialOffersCarouselDecorator.bannerResource) && Intrinsics.e(this.bannerErrorImageResource, specialOffersCarouselDecorator.bannerErrorImageResource) && Intrinsics.e(this.loadingState, specialOffersCarouselDecorator.loadingState) && this.carouselItemsCount == specialOffersCarouselDecorator.carouselItemsCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpecialOffersCarouselDecorator(AbstractC5607a abstractC5607a, List<? extends AbstractC5607a> subtitleSegments, List<SpecialOffer> carouselItems, String str, Integer num, Oj.a loadingState, int i10) {
        Intrinsics.j(subtitleSegments, "subtitleSegments");
        Intrinsics.j(carouselItems, "carouselItems");
        Intrinsics.j(loadingState, "loadingState");
        this.carouselTitle = abstractC5607a;
        this.subtitleSegments = subtitleSegments;
        this.carouselItems = carouselItems;
        this.bannerResource = str;
        this.bannerErrorImageResource = num;
        this.loadingState = loadingState;
        this.carouselItemsCount = i10;
    }

    public static /* synthetic */ SpecialOffersCarouselDecorator b(SpecialOffersCarouselDecorator specialOffersCarouselDecorator, AbstractC5607a abstractC5607a, List list, List list2, String str, Integer num, Oj.a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC5607a = specialOffersCarouselDecorator.carouselTitle;
        }
        if ((i11 & 2) != 0) {
            list = specialOffersCarouselDecorator.subtitleSegments;
        }
        if ((i11 & 4) != 0) {
            list2 = specialOffersCarouselDecorator.carouselItems;
        }
        if ((i11 & 8) != 0) {
            str = specialOffersCarouselDecorator.bannerResource;
        }
        if ((i11 & 16) != 0) {
            num = specialOffersCarouselDecorator.bannerErrorImageResource;
        }
        if ((i11 & 32) != 0) {
            aVar = specialOffersCarouselDecorator.loadingState;
        }
        if ((i11 & 64) != 0) {
            i10 = specialOffersCarouselDecorator.carouselItemsCount;
        }
        Oj.a aVar2 = aVar;
        int i12 = i10;
        Integer num2 = num;
        List list3 = list2;
        return specialOffersCarouselDecorator.a(abstractC5607a, list, list3, str, num2, aVar2, i12);
    }

    public final SpecialOffersCarouselDecorator a(AbstractC5607a carouselTitle, List<? extends AbstractC5607a> subtitleSegments, List<SpecialOffer> carouselItems, String bannerResource, Integer bannerErrorImageResource, Oj.a loadingState, int carouselItemsCount) {
        Intrinsics.j(subtitleSegments, "subtitleSegments");
        Intrinsics.j(carouselItems, "carouselItems");
        Intrinsics.j(loadingState, "loadingState");
        return new SpecialOffersCarouselDecorator(carouselTitle, subtitleSegments, carouselItems, bannerResource, bannerErrorImageResource, loadingState, carouselItemsCount);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getBannerErrorImageResource() {
        return this.bannerErrorImageResource;
    }

    /* renamed from: d, reason: from getter */
    public final String getBannerResource() {
        return this.bannerResource;
    }

    public final List<SpecialOffer> e() {
        return this.carouselItems;
    }

    /* renamed from: f, reason: from getter */
    public final int getCarouselItemsCount() {
        return this.carouselItemsCount;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC5607a getCarouselTitle() {
        return this.carouselTitle;
    }

    /* renamed from: h, reason: from getter */
    public final Oj.a getLoadingState() {
        return this.loadingState;
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.carouselTitle;
        int iHashCode = (((((abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31) + this.subtitleSegments.hashCode()) * 31) + this.carouselItems.hashCode()) * 31;
        String str = this.bannerResource;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.bannerErrorImageResource;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.loadingState.hashCode()) * 31) + Integer.hashCode(this.carouselItemsCount);
    }

    public final boolean i() {
        return this.loadingState instanceof a.Failed;
    }

    public String toString() {
        return "SpecialOffersCarouselDecorator(carouselTitle=" + this.carouselTitle + ", subtitleSegments=" + this.subtitleSegments + ", carouselItems=" + this.carouselItems + ", bannerResource=" + this.bannerResource + ", bannerErrorImageResource=" + this.bannerErrorImageResource + ", loadingState=" + this.loadingState + ", carouselItemsCount=" + this.carouselItemsCount + ')';
    }

    public /* synthetic */ SpecialOffersCarouselDecorator(AbstractC5607a abstractC5607a, List list, List list2, String str, Integer num, Oj.a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : abstractC5607a, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? CollectionsKt.m() : list2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i11 & 64) != 0 ? 0 : i10);
    }
}
