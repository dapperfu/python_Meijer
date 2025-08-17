package ds;

import Oj.a;
import Ul.HomeDepartment;
import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010\u0011R\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lds/c;", "", "Lak/a;", "carouselTitle", "viewAllTitle", "", "LUl/g;", "carouselItems", "LOj/a;", "loadingState", "", "seeAllDeeplink", "<init>", "(Lak/a;Lak/a;Ljava/util/List;LOj/a;Ljava/lang/String;)V", "a", "(Lak/a;Lak/a;Ljava/util/List;LOj/a;Ljava/lang/String;)Lds/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "d", "()Lak/a;", "b", "h", "c", "Ljava/util/List;", "()Ljava/util/List;", "LOj/a;", "e", "()LOj/a;", "Ljava/lang/String;", "f", "g", "()Z", "shouldShowError", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ds.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class DepartmentCarouselDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a carouselTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a viewAllTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HomeDepartment> carouselItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Oj.a loadingState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String seeAllDeeplink;

    public DepartmentCarouselDecorator() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentCarouselDecorator)) {
            return false;
        }
        DepartmentCarouselDecorator departmentCarouselDecorator = (DepartmentCarouselDecorator) other;
        return Intrinsics.e(this.carouselTitle, departmentCarouselDecorator.carouselTitle) && Intrinsics.e(this.viewAllTitle, departmentCarouselDecorator.viewAllTitle) && Intrinsics.e(this.carouselItems, departmentCarouselDecorator.carouselItems) && Intrinsics.e(this.loadingState, departmentCarouselDecorator.loadingState) && Intrinsics.e(this.seeAllDeeplink, departmentCarouselDecorator.seeAllDeeplink);
    }

    public DepartmentCarouselDecorator(AbstractC5607a carouselTitle, AbstractC5607a viewAllTitle, List<HomeDepartment> carouselItems, Oj.a loadingState, String seeAllDeeplink) {
        Intrinsics.j(carouselTitle, "carouselTitle");
        Intrinsics.j(viewAllTitle, "viewAllTitle");
        Intrinsics.j(carouselItems, "carouselItems");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(seeAllDeeplink, "seeAllDeeplink");
        this.carouselTitle = carouselTitle;
        this.viewAllTitle = viewAllTitle;
        this.carouselItems = carouselItems;
        this.loadingState = loadingState;
        this.seeAllDeeplink = seeAllDeeplink;
    }

    public static /* synthetic */ DepartmentCarouselDecorator b(DepartmentCarouselDecorator departmentCarouselDecorator, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, List list, Oj.a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5607a = departmentCarouselDecorator.carouselTitle;
        }
        if ((i10 & 2) != 0) {
            abstractC5607a2 = departmentCarouselDecorator.viewAllTitle;
        }
        if ((i10 & 4) != 0) {
            list = departmentCarouselDecorator.carouselItems;
        }
        if ((i10 & 8) != 0) {
            aVar = departmentCarouselDecorator.loadingState;
        }
        if ((i10 & 16) != 0) {
            str = departmentCarouselDecorator.seeAllDeeplink;
        }
        String str2 = str;
        List list2 = list;
        return departmentCarouselDecorator.a(abstractC5607a, abstractC5607a2, list2, aVar, str2);
    }

    public final DepartmentCarouselDecorator a(AbstractC5607a carouselTitle, AbstractC5607a viewAllTitle, List<HomeDepartment> carouselItems, Oj.a loadingState, String seeAllDeeplink) {
        Intrinsics.j(carouselTitle, "carouselTitle");
        Intrinsics.j(viewAllTitle, "viewAllTitle");
        Intrinsics.j(carouselItems, "carouselItems");
        Intrinsics.j(loadingState, "loadingState");
        Intrinsics.j(seeAllDeeplink, "seeAllDeeplink");
        return new DepartmentCarouselDecorator(carouselTitle, viewAllTitle, carouselItems, loadingState, seeAllDeeplink);
    }

    public final List<HomeDepartment> c() {
        return this.carouselItems;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getCarouselTitle() {
        return this.carouselTitle;
    }

    /* renamed from: e, reason: from getter */
    public final Oj.a getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: f, reason: from getter */
    public final String getSeeAllDeeplink() {
        return this.seeAllDeeplink;
    }

    public final boolean g() {
        return this.loadingState instanceof a.Failed;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC5607a getViewAllTitle() {
        return this.viewAllTitle;
    }

    public int hashCode() {
        return (((((((this.carouselTitle.hashCode() * 31) + this.viewAllTitle.hashCode()) * 31) + this.carouselItems.hashCode()) * 31) + this.loadingState.hashCode()) * 31) + this.seeAllDeeplink.hashCode();
    }

    public String toString() {
        return "DepartmentCarouselDecorator(carouselTitle=" + this.carouselTitle + ", viewAllTitle=" + this.viewAllTitle + ", carouselItems=" + this.carouselItems + ", loadingState=" + this.loadingState + ", seeAllDeeplink=" + this.seeAllDeeplink + ')';
    }

    public /* synthetic */ DepartmentCarouselDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, List list, Oj.a aVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 16) != 0 ? "" : str);
    }
}
