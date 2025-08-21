package hm;

import Ki.C;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import hm.AbstractC14537b;
import ii.C14756c;
import ii.C14760g;
import ii.InterfaceC14754a;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xr.InterfaceC18214a;
import xr.i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\b\u0016\u0010\u001a\u001b\u0019\u001c\u0014\fB/\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018\u0082\u0001\u0007\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lhm/b;", "Lxr/a;", "Lii/a;", "Lbk/a;", "title", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "contentDescription", "Lii/f;", "trackingData", "<init>", "(Lbk/a;LKi/C;Lbk/a;Lii/f;)V", "a", "Lbk/a;", "getTitle", "()Lbk/a;", "b", "LKi/C;", "getIcon", "()LKi/C;", "c", "getContentDescription", "d", "Lii/f;", "()Lii/f;", "e", "f", "g", "h", "Lhm/b$b;", "Lhm/b$c;", "Lhm/b$d;", "Lhm/b$e;", "Lhm/b$f;", "Lhm/b$g;", "Lhm/b$h;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC14537b implements InterfaceC18214a, InterfaceC14754a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f135870f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a contentDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TrackingData trackingData;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$b;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2144b extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final C2144b f135875g = new C2144b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135876h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof C2144b);
        }

        private C2144b() {
            super(AbstractC6392a.INSTANCE.d(i.f170980a, new Object[0]), C.b.g.a.f16996e, null, null, 12, null);
        }

        public String toString() {
            return "Coupons";
        }

        public int hashCode() {
            return 1443777593;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$c;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$c */
    public static final /* data */ class c extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final c f135877g = new c();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135878h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        private c() {
            super(AbstractC6392a.INSTANCE.d(i.f170981b, new Object[0]), C.b.c.j.f16950e, null, C14760g.a(C14756c.a("event: home gas station button"), new Function1() { // from class: hm.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.c.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.n("home");
            TrackingData.v("dashboard");
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public String toString() {
            return "GasStation";
        }

        public int hashCode() {
            return 1497093487;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lhm/b$d;", "Lhm/b;", "", "pointBalance", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "I", "getPointBalance", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$d, reason: from toString */
    public static final /* data */ class MPerks extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pointBalance;

        public MPerks(final int i10) {
            super(i10 == 0 ? AbstractC6392a.INSTANCE.d(i.f170982c, new Object[0]) : AbstractC6392a.INSTANCE.b(xr.h.f170979a, i10, new Object[0]), C.b.d.h.f16963e, null, C14760g.a(C14756c.a("event: home mperks button"), new Function1() { // from class: hm.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.MPerks.c(i10, (TrackingData) obj);
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
            TrackingData.n("home");
            TrackingData.v("dashboard");
            TrackingData.h("mperksPoints", String.valueOf(i10));
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public int hashCode() {
            return Integer.hashCode(this.pointBalance);
        }

        public String toString() {
            return "MPerks(pointBalance=" + this.pointBalance + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$e;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$e */
    public static final /* data */ class e extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final e f135880g = new e();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135881h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            super(companion.d(i.f170984e, new Object[0]), C.b.h.C0301b.f17006e, companion.d(i.f170987h, new Object[0]), C14760g.a(C14756c.a("event: home mperks id button"), new Function1() { // from class: hm.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.e.c((TrackingData) obj);
                }
            }), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.h("home chip buttons", "deeplink");
            TrackingData.v("dashboard");
            TrackingData.n("home");
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public String toString() {
            return "MPerksBarcode";
        }

        public int hashCode() {
            return 1938388148;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$f;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$f */
    public static final /* data */ class f extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final f f135882g = new f();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135883h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        private f() {
            super(AbstractC6392a.INSTANCE.d(i.f170983d, new Object[0]), C.b.f.C0299f.f16990e, null, C14760g.a(C14756c.a("event: home pharmacy button"), new Function1() { // from class: hm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.f.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.n("home");
            TrackingData.v("dashboard");
            TrackingData.h("home chip buttons", "deeplink");
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public String toString() {
            return "Pharmacy";
        }

        public int hashCode() {
            return 500763399;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$g;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$g */
    public static final /* data */ class g extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final g f135884g = new g();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135885h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        private g() {
            super(AbstractC6392a.INSTANCE.d(i.f170985f, new Object[0]), C.b.d.k.f16967e, null, C14760g.a(C14756c.a("event: home shop and scan button"), new Function1() { // from class: hm.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.g.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.n("home");
            TrackingData.v("dashboard");
            TrackingData.h("home chip buttons", "deeplink");
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public String toString() {
            return "ShopAndScan";
        }

        public int hashCode() {
            return 1976514122;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm/b$h;", "Lhm/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hm.b$h */
    public static final /* data */ class h extends AbstractC14537b {

        /* renamed from: g, reason: collision with root package name */
        public static final h f135886g = new h();

        /* renamed from: h, reason: collision with root package name */
        public static final int f135887h = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        private h() {
            super(AbstractC6392a.INSTANCE.d(i.f170986g, new Object[0]), C.b.d.m.f16969e, null, C14760g.a(C14756c.a("event: home weekly ad button"), new Function1() { // from class: hm.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC14537b.h.c((TrackingData) obj);
                }
            }), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(TrackingData TrackingData) {
            Intrinsics.j(TrackingData, "$this$TrackingData");
            TrackingData.n("home");
            TrackingData.v("dashboard");
            TrackingData.h("screenName", "New home screen");
            return Unit.f143329a;
        }

        public String toString() {
            return "WeeklyAd";
        }

        public int hashCode() {
            return 1556034264;
        }
    }

    public /* synthetic */ AbstractC14537b(AbstractC6392a abstractC6392a, C c10, AbstractC6392a abstractC6392a2, TrackingData trackingData, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6392a, c10, abstractC6392a2, trackingData);
    }

    private AbstractC14537b(AbstractC6392a abstractC6392a, C c10, AbstractC6392a abstractC6392a2, TrackingData trackingData) {
        this.title = abstractC6392a;
        this.icon = c10;
        this.contentDescription = abstractC6392a2;
        this.trackingData = trackingData;
    }

    @Override // ii.InterfaceC14754a
    /* renamed from: a, reason: from getter */
    public TrackingData getTrackingData() {
        return this.trackingData;
    }

    @Override // xr.InterfaceC18214a
    public AbstractC6392a getContentDescription() {
        return this.contentDescription;
    }

    @Override // xr.InterfaceC18214a
    public C getIcon() {
        return this.icon;
    }

    @Override // xr.InterfaceC18214a
    public AbstractC6392a getTitle() {
        return this.title;
    }

    public /* synthetic */ AbstractC14537b(AbstractC6392a abstractC6392a, C c10, AbstractC6392a abstractC6392a2, TrackingData trackingData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6392a, c10, (i10 & 4) != 0 ? abstractC6392a : abstractC6392a2, (i10 & 8) != 0 ? null : trackingData, null);
    }
}
