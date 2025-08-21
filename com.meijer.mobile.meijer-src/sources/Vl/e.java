package Vl;

import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LVl/e;", "", "<init>", "()V", "b", "f", "a", "e", "c", "d", "LVl/e$a;", "LVl/e$b;", "LVl/e$c;", "LVl/e$d;", "LVl/e$e;", "LVl/e$f;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LVl/e$a;", "LVl/e;", "<init>", "()V", "a", "b", "LVl/e$a$a;", "LVl/e$a$b;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$a$a;", "LVl/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vl.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0856a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0856a f39987a = new C0856a();

            private C0856a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0856a);
            }

            public String toString() {
                return "MarketingBanner";
            }

            public int hashCode() {
                return -223570548;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$a$b;", "LVl/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f39988a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "SpecialOffersBanner";
            }

            public int hashCode() {
                return 746016406;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LVl/e$b;", "LVl/e;", "<init>", "()V", "a", "LVl/e$b$a;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends e {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LVl/e$b$a;", "LVl/e$b;", "", "itemCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vl.e$b$a, reason: from toString */
        public static final /* data */ class SpecialOffers extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int itemCount;

            public SpecialOffers() {
                this(0, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpecialOffers) && this.itemCount == ((SpecialOffers) other).itemCount;
            }

            public SpecialOffers(int i10) {
                super(null);
                this.itemCount = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getItemCount() {
                return this.itemCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.itemCount);
            }

            public String toString() {
                return "SpecialOffers(itemCount=" + this.itemCount + ')';
            }

            public /* synthetic */ SpecialOffers(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? 10 : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LVl/e$c;", "LVl/e;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "LVl/e$c$a;", "LVl/e$c$b;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c extends e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$c$a;", "LVl/e$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final a f39991b = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(HomeViewModel.SeasonalCarouselLoadingKey, null);
            }

            public String toString() {
                return "SeasonalCarousel";
            }

            public int hashCode() {
                return 1479160342;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$c$b;", "LVl/e$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final b f39992b = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super("shopByDepartmentV2", null);
            }

            public String toString() {
                return "ShopByDepartmentV2";
            }

            public int hashCode() {
                return -1240467901;
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private c(String str) {
            super(null);
            this.id = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\fBC\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\u000f\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"LVl/e$d;", "LVl/e;", "", PreferencesHelper.PREF_ID, "", "title", "description", "actionButtonTitle", "image", "destinationDeeplink", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "e", "()I", "c", "d", "f", "LVl/e$d$a;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d extends e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int title;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int description;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int actionButtonTitle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int image;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String destinationDeeplink;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$d$a;", "LVl/e$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: g, reason: collision with root package name */
            public static final a f39999g = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super("teachers_list", Tl.c.f36444c, Tl.c.f36443b, Tl.c.f36442a, Tl.b.f36441a, "meijerapp://teacherlists", null);
            }

            public String toString() {
                return "TeacherListComponent";
            }

            public int hashCode() {
                return -2084346578;
            }
        }

        public /* synthetic */ d(String str, int i10, int i11, int i12, int i13, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, i12, i13, str2);
        }

        private d(String str, int i10, int i11, int i12, int i13, String str2) {
            super(null);
            this.id = str;
            this.title = i10;
            this.description = i11;
            this.actionButtonTitle = i12;
            this.image = i13;
            this.destinationDeeplink = str2;
        }

        /* renamed from: a, reason: from getter */
        public final int getActionButtonTitle() {
            return this.actionButtonTitle;
        }

        /* renamed from: b, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        /* renamed from: c, reason: from getter */
        public final String getDestinationDeeplink() {
            return this.destinationDeeplink;
        }

        /* renamed from: d, reason: from getter */
        public final int getImage() {
            return this.image;
        }

        /* renamed from: e, reason: from getter */
        public final int getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$e;", "LVl/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vl.e$e, reason: collision with other inner class name */
    public static final /* data */ class C0857e extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0857e f40000a = new C0857e();

        private C0857e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0857e);
        }

        public String toString() {
            return "MPerksComponent";
        }

        public int hashCode() {
            return 765753233;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u0011\u000e\u0014B'\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\u0082\u0001\u0004\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LVl/e$f;", "LVl/e;", "", "itemCount", "", PreferencesHelper.PREF_ID, "Lnk/d;", "listType", "<init>", "(ILjava/lang/String;Lnk/d;)V", "a", "I", "getItemCount", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lnk/d;", "()Lnk/d;", "d", "LVl/e$f$a;", "LVl/e$f$b;", "LVl/e$f$c;", "LVl/e$f$d;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int itemCount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final nk.d listType;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$a;", "LVl/e$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: d, reason: collision with root package name */
            public static final a f40004d = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(0, "buyAgainV2", nk.d.f152479b, 1, null);
            }

            public String toString() {
                return "BuyAgain";
            }

            public int hashCode() {
                return 847296838;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"LVl/e$f$b;", "LVl/e$f;", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;)V", "a", "b", "c", "LVl/e$f$b$a;", "LVl/e$f$b$b;", "LVl/e$f$b$c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class b extends f {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$b$a;", "LVl/e$f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends b {

                /* renamed from: d, reason: collision with root package name */
                public static final a f40005d = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super("marketing-carousel-1", null);
                }

                public String toString() {
                    return "CuratedCarousel1";
                }

                public int hashCode() {
                    return -1124265433;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$b$b;", "LVl/e$f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Vl.e$f$b$b, reason: collision with other inner class name */
            public static final /* data */ class C0858b extends b {

                /* renamed from: d, reason: collision with root package name */
                public static final C0858b f40006d = new C0858b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0858b);
                }

                private C0858b() {
                    super("marketing-carousel-2", null);
                }

                public String toString() {
                    return "CuratedCarousel2";
                }

                public int hashCode() {
                    return -1124265432;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$b$c;", "LVl/e$f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends b {

                /* renamed from: d, reason: collision with root package name */
                public static final c f40007d = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super("marketing-carousel-3", null);
                }

                public String toString() {
                    return "CuratedCarousel3";
                }

                public int hashCode() {
                    return -1124265431;
                }
            }

            public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private b(String str) {
                super(0, str, null, 5, null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$c;", "LVl/e$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends f {

            /* renamed from: d, reason: collision with root package name */
            public static final c f40008d = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(0, "favoritesOnSaleV2", nk.d.f152478a, 1, null);
            }

            public String toString() {
                return "FavoritesOnSale";
            }

            public int hashCode() {
                return -2020465231;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"LVl/e$f$d;", "LVl/e$f;", "", "homeId", "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "getHomeId", "()Ljava/lang/String;", "a", "LVl/e$f$d$a;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class d extends f {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String homeId;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVl/e$f$d$a;", "LVl/e$f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final a f40010e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super("meijerRecommendations", null);
                }

                public String toString() {
                    return "WhiteLabelCarousel";
                }

                public int hashCode() {
                    return -1037220688;
                }
            }

            public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            private d(String str) {
                super(0, str, null, 5, null);
                this.homeId = str;
            }
        }

        public /* synthetic */ f(int i10, String str, nk.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, dVar);
        }

        public /* synthetic */ f(int i10, String str, nk.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 10 : i10, str, (i11 & 4) != 0 ? null : dVar, null);
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final nk.d getListType() {
            return this.listType;
        }

        private f(int i10, String str, nk.d dVar) {
            super(null);
            this.itemCount = i10;
            this.id = str;
            this.listType = dVar;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
