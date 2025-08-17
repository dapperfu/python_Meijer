package ds;

import Ul.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lds/b;", "", "<init>", "()V", "c", "b", "a", "Lds/b$a;", "Lds/b$b;", "Lds/b$c;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ds.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13565b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lds/b$a;", "Lds/b;", "", "deeplink", "name", "carouselTitle", "LUl/e$c;", "carouselType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LUl/e$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "LUl/e$c;", "()LUl/e$c;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ds.b$a, reason: from toString */
    public static final /* data */ class DepartmentClicked extends AbstractC13565b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deeplink;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepartmentClicked)) {
                return false;
            }
            DepartmentClicked departmentClicked = (DepartmentClicked) other;
            return Intrinsics.e(this.deeplink, departmentClicked.deeplink) && Intrinsics.e(this.name, departmentClicked.name) && Intrinsics.e(this.carouselTitle, departmentClicked.carouselTitle) && Intrinsics.e(this.carouselType, departmentClicked.carouselType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepartmentClicked(String deeplink, String name, String carouselTitle, e.c carouselType) {
            super(null);
            Intrinsics.j(deeplink, "deeplink");
            Intrinsics.j(name, "name");
            Intrinsics.j(carouselTitle, "carouselTitle");
            Intrinsics.j(carouselType, "carouselType");
            this.deeplink = deeplink;
            this.name = name;
            this.carouselTitle = carouselTitle;
            this.carouselType = carouselType;
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        /* renamed from: b, reason: from getter */
        public final e.c getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((((this.deeplink.hashCode() * 31) + this.name.hashCode()) * 31) + this.carouselTitle.hashCode()) * 31) + this.carouselType.hashCode();
        }

        public String toString() {
            return "DepartmentClicked(deeplink=" + this.deeplink + ", name=" + this.name + ", carouselTitle=" + this.carouselTitle + ", carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lds/b$b;", "Lds/b;", "LUl/e$c;", "carouselType", "<init>", "(LUl/e$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUl/e$c;", "()LUl/e$c;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ds.b$b, reason: collision with other inner class name and from toString */
    public static final /* data */ class Retry extends AbstractC13565b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c carouselType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retry) && Intrinsics.e(this.carouselType, ((Retry) other).carouselType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(e.c carouselType) {
            super(null);
            Intrinsics.j(carouselType, "carouselType");
            this.carouselType = carouselType;
        }

        /* renamed from: a, reason: from getter */
        public final e.c getCarouselType() {
            return this.carouselType;
        }

        public int hashCode() {
            return this.carouselType.hashCode();
        }

        public String toString() {
            return "Retry(carouselType=" + this.carouselType + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lds/b$c;", "Lds/b;", "LUl/e$c;", "carouselType", "", "carouselTitle", "deeplink", "<init>", "(LUl/e$c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LUl/e$c;", "b", "()LUl/e$c;", "Ljava/lang/String;", "c", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ds.b$c, reason: from toString */
    public static final /* data */ class ViewAll extends AbstractC13565b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c carouselType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deeplink;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAll)) {
                return false;
            }
            ViewAll viewAll = (ViewAll) other;
            return Intrinsics.e(this.carouselType, viewAll.carouselType) && Intrinsics.e(this.carouselTitle, viewAll.carouselTitle) && Intrinsics.e(this.deeplink, viewAll.deeplink);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewAll(e.c carouselType, String carouselTitle, String deeplink) {
            super(null);
            Intrinsics.j(carouselType, "carouselType");
            Intrinsics.j(carouselTitle, "carouselTitle");
            Intrinsics.j(deeplink, "deeplink");
            this.carouselType = carouselType;
            this.carouselTitle = carouselTitle;
            this.deeplink = deeplink;
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        /* renamed from: b, reason: from getter */
        public final e.c getCarouselType() {
            return this.carouselType;
        }

        /* renamed from: c, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return (((this.carouselType.hashCode() * 31) + this.carouselTitle.hashCode()) * 31) + this.deeplink.hashCode();
        }

        public String toString() {
            return "ViewAll(carouselType=" + this.carouselType + ", carouselTitle=" + this.carouselTitle + ", deeplink=" + this.deeplink + ')';
        }
    }

    public /* synthetic */ AbstractC13565b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13565b() {
    }
}
