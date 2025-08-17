package gm;

import Ji.C;
import ak.AbstractC5607a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import gm.AbstractC14275b;
import hi.C14476c;
import hi.C14480g;
import hi.InterfaceC14474a;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xr.InterfaceC18086a;
import xr.h;
import xr.i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0014\f\u0019\u001a\u0016\u001b\u0010B/\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018\u0082\u0001\u0007\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lgm/b;", "Lxr/a;", "Lhi/a;", "Lak/a;", "title", "", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lhi/f;", "trackingData", "<init>", "(Lak/a;ILak/a;Lhi/f;)V", "a", "Lak/a;", "getTitle", "()Lak/a;", "b", "I", "getIcon", "()I", "c", "getContentDescription", "d", "Lhi/f;", "()Lhi/f;", "e", "f", "g", "Lgm/b$a;", "Lgm/b$b;", "Lgm/b$c;", "Lgm/b$d;", "Lgm/b$e;", "Lgm/b$f;", "Lgm/b$g;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gm.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC14275b implements InterfaceC18086a, InterfaceC14474a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a contentDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TrackingData trackingData;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$a;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$a */
    public static final /* data */ class a extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f133807e = new a();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133808f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        private a() {
            super(AbstractC5607a.INSTANCE.d(i.f169888a, new Object[0]), C.b.g.a.f15452e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, 12, null);
        }

        public String toString() {
            return "Coupons";
        }

        public int hashCode() {
            return 1443777593;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$b;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2103b extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final C2103b f133809e = new C2103b();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133810f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof C2103b);
        }

        private C2103b() {
            super(AbstractC5607a.INSTANCE.d(i.f169889b, new Object[0]), C.b.c.j.f15406e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, new TrackingData(C14476c.a("event: home gas station button"), null, 2, null), 4, null);
        }

        public String toString() {
            return "GasStation";
        }

        public int hashCode() {
            return 1497093487;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lgm/b$c;", "Lgm/b;", "", "pointBalance", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "I", "getPointBalance", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$c, reason: from toString */
    public static final /* data */ class MPerks extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pointBalance;

        public MPerks(final int i10) {
            super(i10 == 0 ? AbstractC5607a.INSTANCE.d(i.f169890c, new Object[0]) : AbstractC5607a.INSTANCE.b(h.f169887a, i10, new Object[0]), C.b.d.h.f15419e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, C14480g.a(C14476c.a("event: home mperks button"), new Function1() { // from class: gm.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14275b.MPerks.c(i10, (TrackingData) obj);
                }
            }), 4, null);
            this.pointBalance = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MPerks) && this.pointBalance == ((MPerks) other).pointBalance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10, TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("mperksPoints", String.valueOf(i10));
            return Unit.f142422a;
        }

        public int hashCode() {
            return Integer.hashCode(this.pointBalance);
        }

        public String toString() {
            return "MPerks(pointBalance=" + this.pointBalance + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$d;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$d */
    public static final /* data */ class d extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final d f133812e = new d();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133813f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private d() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.d(i.f169892e, new Object[0]), C.b.h.C0259b.f15462e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), companion.d(i.f169895h, new Object[0]), C14480g.a(C14476c.a("event: home mperks id button"), new Function1() { // from class: gm.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14275b.d.c((TrackingData) obj);
                }
            }), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("home chip buttons", "deeplink");
            return Unit.f142422a;
        }

        public String toString() {
            return "MPerksBarcode";
        }

        public int hashCode() {
            return 1938388148;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$e;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$e */
    public static final /* data */ class e extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final e f133814e = new e();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133815f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        private e() {
            super(AbstractC5607a.INSTANCE.d(i.f169891d, new Object[0]), C.b.f.C0257f.f15446e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, C14480g.a(C14476c.a("event: home pharmacy button"), new Function1() { // from class: gm.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14275b.e.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("home chip buttons", "deeplink");
            return Unit.f142422a;
        }

        public String toString() {
            return "Pharmacy";
        }

        public int hashCode() {
            return 500763399;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$f;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$f */
    public static final /* data */ class f extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final f f133816e = new f();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133817f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        private f() {
            super(AbstractC5607a.INSTANCE.d(i.f169893f, new Object[0]), C.b.d.k.f15423e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, C14480g.a(C14476c.a("event: home shop and scan button"), new Function1() { // from class: gm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14275b.f.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("home chip buttons", "deeplink");
            return Unit.f142422a;
        }

        public String toString() {
            return "ShopAndScan";
        }

        public int hashCode() {
            return 1976514122;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/b$g;", "Lgm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gm.b$g */
    public static final /* data */ class g extends AbstractC14275b {

        /* renamed from: e, reason: collision with root package name */
        public static final g f133818e = new g();

        /* renamed from: f, reason: collision with root package name */
        public static final int f133819f = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        private g() {
            super(AbstractC5607a.INSTANCE.d(i.f169894g, new Object[0]), C.b.d.m.f15425e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, new TrackingData(C14476c.a("event: home weekly ad button"), null, 2, null), 4, null);
        }

        public String toString() {
            return "WeeklyAd";
        }

        public int hashCode() {
            return 1556034264;
        }
    }

    public /* synthetic */ AbstractC14275b(AbstractC5607a abstractC5607a, int i10, AbstractC5607a abstractC5607a2, TrackingData trackingData, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, i10, abstractC5607a2, trackingData);
    }

    private AbstractC14275b(AbstractC5607a abstractC5607a, int i10, AbstractC5607a abstractC5607a2, TrackingData trackingData) {
        this.title = abstractC5607a;
        this.icon = i10;
        this.contentDescription = abstractC5607a2;
        this.trackingData = trackingData;
    }

    @Override // hi.InterfaceC14474a
    /* renamed from: a, reason: from getter */
    public TrackingData getTrackingData() {
        return this.trackingData;
    }

    @Override // xr.InterfaceC18086a
    public AbstractC5607a getContentDescription() {
        return this.contentDescription;
    }

    @Override // xr.InterfaceC18086a
    public int getIcon() {
        return this.icon;
    }

    @Override // xr.InterfaceC18086a
    public AbstractC5607a getTitle() {
        return this.title;
    }

    public /* synthetic */ AbstractC14275b(AbstractC5607a abstractC5607a, int i10, AbstractC5607a abstractC5607a2, TrackingData trackingData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, i10, (i11 & 4) != 0 ? abstractC5607a : abstractC5607a2, (i11 & 8) != 0 ? null : trackingData, null);
    }
}
