package wl;

import Tq.PointOfService;
import Tq.h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import di.CustomerAddress;
import fj.DeliveryMode;
import fj.ShoppingCart;
import fj.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.e;
import nk.f;
import nk.n;
import qw.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0019\u00100\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00105\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010@\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0014\u0010B\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u00107R\u0018\u0010E\u001a\u00060\u0018j\u0002`C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001aR\u0011\u0010G\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bF\u0010\fR\u0011\u0010I\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bH\u0010\f¨\u0006J"}, d2 = {"Lwl/b;", "", "Lnk/f;", "product", "LTq/h;", PlaceTypes.STORE, "Lfj/C;", "cart", "<init>", "(Lnk/f;LTq/h;Lfj/C;)V", "Lwl/b$a;", "g", "()Lwl/b$a;", "", "checkCart", "a", "(Z)Lwl/b$a;", "d", "c", "h", "f", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "getProduct", "()Lnk/f;", "b", "LTq/h;", "getStore", "()LTq/h;", "Lfj/C;", "getCart", "()Lfj/C;", "Lnk/e;", "Lnk/e;", "productAvailability", "LTq/c;", "e", "LTq/c;", "getFulfillmentStore", "()LTq/c;", "fulfillmentStore", "Lfj/n;", "Lfj/n;", "j", "()Lfj/n;", "fulfillmentMode", "r", "()Z", "isProductDeliverable", "q", "isProductAvailableForPickup", "m", "storeSupportsAlcoholDelivery", "n", "storeSupportsAlcoholPickup", "o", "storeSupportsDelivery", "p", "storeSupportsPickup", "Lcom/meijer/mobile/core/model/common/StoreId;", "l", "storeId", "k", "status", "i", "availability", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wl.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ProductEligibility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingCart cart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e productAvailability;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PointOfService fulfillmentStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n fulfillmentMode;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lwl/b$a;", "", "<init>", "()V", "a", "e", "i", "j", "g", "h", "f", "l", "c", "b", "d", "k", "Lwl/b$a$a;", "Lwl/b$a$b;", "Lwl/b$a$c;", "Lwl/b$a$d;", "Lwl/b$a$e;", "Lwl/b$a$f;", "Lwl/b$a$g;", "Lwl/b$a$h;", "Lwl/b$a$i;", "Lwl/b$a$j;", "Lwl/b$a$k;", "Lwl/b$a$l;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wl.b$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$a;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2660a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2660a f167269a = new C2660a();

            private C2660a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2660a);
            }

            public String toString() {
                return "Available";
            }

            public int hashCode() {
                return -1774283644;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$b;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C2661b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2661b f167270a = new C2661b();

            private C2661b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2661b);
            }

            public String toString() {
                return "InStoreOnly";
            }

            public int hashCode() {
                return 478594947;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$c;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$c */
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f167271a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "LowStock";
            }

            public int hashCode() {
                return 1180216071;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$d;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$d */
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f167272a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "MissingFulfillmentInformation";
            }

            public int hashCode() {
                return -147263569;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$e;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$e */
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f167273a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "MissingInformation";
            }

            public int hashCode() {
                return -1130260341;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$f;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$f */
        public static final /* data */ class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f167274a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "NotAvailableAtYourStore";
            }

            public int hashCode() {
                return -726765344;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$g;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$g */
        public static final /* data */ class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f167275a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "NotAvailableForDelivery";
            }

            public int hashCode() {
                return -1473706174;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$h;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$h */
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f167276a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "NotAvailableForPickup";
            }

            public int hashCode() {
                return 1999073610;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$i;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$i */
        public static final /* data */ class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final i f167277a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "NotAvailableForPurchase";
            }

            public int hashCode() {
                return -553848753;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$j;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$j */
        public static final /* data */ class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final j f167278a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public String toString() {
                return "NotAvailableOnMobile";
            }

            public int hashCode() {
                return 1085068828;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$k;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$k */
        public static final /* data */ class k extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final k f167279a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public String toString() {
                return "OrderNotEligibleForAlcohol";
            }

            public int hashCode() {
                return 1902867558;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwl/b$a$l;", "Lwl/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wl.b$a$l */
        public static final /* data */ class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f167280a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public String toString() {
                return "OutOfStock";
            }

            public int hashCode() {
                return 1152248310;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @JvmOverloads
    public ProductEligibility(f product, h hVar, ShoppingCart shoppingCart) {
        DeliveryMode deliveryMode;
        Intrinsics.j(product, "product");
        this.product = product;
        this.store = hVar;
        this.cart = shoppingCart;
        n delivery = null;
        this.productAvailability = product instanceof e ? (e) product : null;
        this.fulfillmentStore = shoppingCart != null ? shoppingCart.getPointOfService() : null;
        String code = (shoppingCart == null || (deliveryMode = shoppingCart.getDeliveryMode()) == null) ? null : deliveryMode.getCode();
        if (Intrinsics.e(code, "pickup")) {
            delivery = new n.Pickup(Integer.valueOf(shoppingCart.getPointOfService().getStoreId()));
        } else if (Intrinsics.e(code, "delivery")) {
            Integer numValueOf = Integer.valueOf(shoppingCart.getPointOfService().getStoreId());
            CustomerAddress deliveryAddress = shoppingCart.getDeliveryAddress();
            if (deliveryAddress == null) {
                throw new IllegalStateException("Delivery mode `delivery` must have delivery address, but was `null`");
            }
            delivery = new n.Delivery(numValueOf, deliveryAddress, shoppingCart.getDeliveryAddressIsAlcoholEligible());
        }
        this.fulfillmentMode = delivery;
    }

    static /* synthetic */ a b(ProductEligibility productEligibility, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return productEligibility.a(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final wl.ProductEligibility.a d(boolean r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L37
            fj.n r1 = r3.fulfillmentMode
            boolean r1 = r1 instanceof fj.n.Pickup
            if (r1 == 0) goto L37
            boolean r4 = r3.q()
            if (r4 == 0) goto L18
            boolean r4 = r3.p()
            if (r4 == 0) goto L18
        L15:
            r4 = r0
            goto L93
        L18:
            boolean r4 = r3.r()
            if (r4 == 0) goto L28
            boolean r4 = r3.o()
            if (r4 == 0) goto L28
            wl.b$a$h r4 = wl.ProductEligibility.a.h.f167276a
            goto L93
        L28:
            boolean r4 = r3.q()
            if (r4 == 0) goto L34
            boolean r4 = r3.p()
            if (r4 != 0) goto L15
        L34:
            wl.b$a$f r4 = wl.ProductEligibility.a.f.f167274a
            goto L93
        L37:
            if (r4 == 0) goto L6a
            fj.n r1 = r3.fulfillmentMode
            boolean r1 = r1 instanceof fj.n.Delivery
            if (r1 == 0) goto L6a
            boolean r4 = r3.r()
            if (r4 == 0) goto L4c
            boolean r4 = r3.o()
            if (r4 == 0) goto L4c
            goto L15
        L4c:
            boolean r4 = r3.q()
            if (r4 == 0) goto L5b
            boolean r4 = r3.p()
            if (r4 == 0) goto L5b
            wl.b$a$g r4 = wl.ProductEligibility.a.g.f167275a
            goto L93
        L5b:
            boolean r4 = r3.r()
            if (r4 == 0) goto L67
            boolean r4 = r3.o()
            if (r4 != 0) goto L15
        L67:
            wl.b$a$f r4 = wl.ProductEligibility.a.f.f167274a
            goto L93
        L6a:
            if (r4 != 0) goto L79
            boolean r4 = r3.q()
            if (r4 != 0) goto L15
            boolean r4 = r3.r()
            if (r4 == 0) goto L79
            goto L15
        L79:
            boolean r4 = r3.q()
            if (r4 == 0) goto L85
            boolean r4 = r3.p()
            if (r4 != 0) goto L15
        L85:
            boolean r4 = r3.r()
            if (r4 == 0) goto L91
            boolean r4 = r3.o()
            if (r4 != 0) goto L15
        L91:
            wl.b$a$f r4 = wl.ProductEligibility.a.f.f167274a
        L93:
            if (r4 == 0) goto Lbd
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed on: checkGeneralAvailability(upc="
            r1.append(r2)
            nk.f r2 = r3.product
            java.lang.String r2 = r2.getCode()
            r1.append(r2)
            java.lang.String r2 = " with "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.q(r1, r2)
            return r4
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.ProductEligibility.d(boolean):wl.b$a");
    }

    static /* synthetic */ a e(ProductEligibility productEligibility, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return productEligibility.d(z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductEligibility)) {
            return false;
        }
        ProductEligibility productEligibility = (ProductEligibility) other;
        return Intrinsics.e(this.product, productEligibility.product) && Intrinsics.e(this.store, productEligibility.store) && Intrinsics.e(this.cart, productEligibility.cart);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final wl.ProductEligibility.a a(boolean r4) {
        /*
            r3 = this;
            nk.e r0 = r3.productAvailability
            r1 = 0
            if (r0 != 0) goto L9
            wl.b$a$i r4 = wl.ProductEligibility.a.i.f167277a
            goto L7c
        L9:
            boolean r0 = r0.getIsAlcohol()
            if (r0 != 0) goto L12
        Lf:
            r4 = r1
            goto L7c
        L12:
            fj.C r0 = r3.cart
            if (r0 == 0) goto L20
            boolean r0 = r0.getIsEditingDryOrder()
            r2 = 1
            if (r0 != r2) goto L20
            wl.b$a$k r4 = wl.ProductEligibility.a.k.f167279a
            goto L7c
        L20:
            if (r4 == 0) goto L43
            fj.n r0 = r3.fulfillmentMode
            boolean r2 = r0 instanceof fj.n.Delivery
            if (r2 == 0) goto L43
            fj.n$a r0 = (fj.n.Delivery) r0
            boolean r4 = r0.getIsAlcoholAllowed()
            if (r4 == 0) goto L37
            boolean r4 = r3.m()
            if (r4 == 0) goto L37
            goto Lf
        L37:
            boolean r4 = r3.n()
            if (r4 == 0) goto L40
            wl.b$a$g r4 = wl.ProductEligibility.a.g.f167275a
            goto L7c
        L40:
            wl.b$a$b r4 = wl.ProductEligibility.a.C2661b.f167270a
            goto L7c
        L43:
            if (r4 == 0) goto L5e
            fj.n r4 = r3.fulfillmentMode
            boolean r4 = r4 instanceof fj.n.Pickup
            if (r4 == 0) goto L5e
            boolean r4 = r3.n()
            if (r4 == 0) goto L52
            goto Lf
        L52:
            boolean r4 = r3.m()
            if (r4 == 0) goto L5b
            wl.b$a$h r4 = wl.ProductEligibility.a.h.f167276a
            goto L7c
        L5b:
            wl.b$a$b r4 = wl.ProductEligibility.a.C2661b.f167270a
            goto L7c
        L5e:
            boolean r4 = r3.m()
            if (r4 != 0) goto L6d
            boolean r4 = r3.n()
            if (r4 != 0) goto L6d
            wl.b$a$b r4 = wl.ProductEligibility.a.C2661b.f167270a
            goto L7c
        L6d:
            boolean r4 = r3.n()
            if (r4 != 0) goto Lf
            boolean r4 = r3.m()
            if (r4 == 0) goto L7a
            goto Lf
        L7a:
            wl.b$a$f r4 = wl.ProductEligibility.a.f.f167274a
        L7c:
            if (r4 == 0) goto L98
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed on: checkAlcoholRestricted with "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.q(r1, r2)
            return r4
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.ProductEligibility.a(boolean):wl.b$a");
    }

    private final a c() {
        a aVar = this.fulfillmentStore == null ? a.d.f167272a : l() != this.fulfillmentStore.getStoreId() ? a.f.f167274a : null;
        if (aVar == null) {
            return null;
        }
        a.Companion companion = qw.a.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed on: checkFulfillmentDetails(storeId=");
        sb2.append(l());
        sb2.append(", fulfillmentStore=");
        PointOfService pointOfService = this.fulfillmentStore;
        sb2.append(pointOfService != null ? Integer.valueOf(pointOfService.getStoreId()) : null);
        sb2.append(" with ");
        sb2.append(aVar);
        companion.q(sb2.toString(), new Object[0]);
        return aVar;
    }

    private final a f() {
        a.i iVar;
        e eVar = this.productAvailability;
        Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.getIsBuyable()) : null;
        e eVar2 = this.productAvailability;
        Boolean boolValueOf2 = eVar2 != null ? Boolean.valueOf(eVar2.getIsDisplayable()) : null;
        e eVar3 = this.productAvailability;
        List listP = CollectionsKt.p(boolValueOf, boolValueOf2, Boolean.valueOf((eVar3 == null || eVar3.getIsDisabled()) ? false : true));
        List list = listP;
        if ((list instanceof Collection) && list.isEmpty()) {
            iVar = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.e((Boolean) it.next(), Boolean.TRUE)) {
                    iVar = a.i.f167277a;
                    break;
                }
            }
            iVar = null;
        }
        if (iVar == null) {
            return null;
        }
        qw.a.INSTANCE.q("Failed on: checkProductProperties(" + listP + ") with " + iVar, new Object[0]);
        return iVar;
    }

    private final a g() {
        e eVar = this.productAvailability;
        nk.n nVarQ1 = eVar != null ? eVar.Q1() : null;
        a aVar = nVarQ1 == null ? a.f.f167274a : nVarQ1 instanceof n.InStoreOnly ? a.C2661b.f167270a : nVarQ1 instanceof n.d ? a.l.f167280a : nVarQ1 instanceof n.LowStock ? a.c.f167271a : null;
        if (aVar == null) {
            return null;
        }
        qw.a.INSTANCE.q("Failed on: checkStockLevel(upc=" + this.product.getCode() + ") with " + aVar, new Object[0]);
        return aVar;
    }

    private final int l() {
        e eVar = this.productAvailability;
        if (eVar != null) {
            Integer numValueOf = Integer.valueOf(eVar.getStoreId());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        h hVar = this.store;
        if (hVar != null) {
            return hVar.getStoreId();
        }
        return 0;
    }

    private final boolean m() {
        PointOfService pointOfService = this.fulfillmentStore;
        if (pointOfService != null) {
            return pointOfService.getIsAlcoholDeliveryEnabled();
        }
        return false;
    }

    private final boolean n() {
        PointOfService pointOfService = this.fulfillmentStore;
        if (pointOfService != null) {
            return pointOfService.getIsAlcoholPickupEnabled();
        }
        return false;
    }

    private final boolean o() {
        PointOfService pointOfService = this.fulfillmentStore;
        if (pointOfService != null) {
            return pointOfService.getIsEligibleForDelivery();
        }
        return false;
    }

    private final boolean p() {
        PointOfService pointOfService = this.fulfillmentStore;
        if (pointOfService != null) {
            return pointOfService.getCurbSideEligibility();
        }
        return false;
    }

    private final boolean q() {
        e eVar = this.productAvailability;
        return eVar != null && eVar.getIsAvailableForPickup();
    }

    private final boolean r() {
        e eVar = this.productAvailability;
        return (eVar == null || eVar.getIsHomeDeliveryNotAvailable()) ? false : true;
    }

    public int hashCode() {
        int iHashCode = this.product.hashCode() * 31;
        h hVar = this.store;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        ShoppingCart shoppingCart = this.cart;
        return iHashCode2 + (shoppingCart != null ? shoppingCart.hashCode() : 0);
    }

    /* renamed from: j, reason: from getter */
    public final fj.n getFulfillmentMode() {
        return this.fulfillmentMode;
    }

    public String toString() {
        return "ProductEligibility(product=" + this.product + ", store=" + this.store + ", cart=" + this.cart + ')';
    }

    private final a h() {
        a.e eVar;
        if (l() == 0) {
            eVar = a.e.f167273a;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        qw.a.INSTANCE.q("Failed on: checkStoreContext(storeId = " + l() + ") with " + eVar, new Object[0]);
        return eVar;
    }

    public final a i() {
        a aVarH = h();
        if (aVarH == null && (aVarH = f()) == null && (aVarH = g()) == null) {
            a aVarA = a(false);
            if (aVarA == null) {
                a aVarD = d(false);
                if (aVarD == null) {
                    return a.C2660a.f167269a;
                }
                return aVarD;
            }
            return aVarA;
        }
        return aVarH;
    }

    public final a k() {
        a aVarH = h();
        if (aVarH == null && (aVarH = f()) == null && (aVarH = g()) == null && (aVarH = c()) == null) {
            a aVarB = b(this, false, 1, null);
            if (aVarB == null) {
                a aVarE = e(this, false, 1, null);
                if (aVarE == null) {
                    return a.C2660a.f167269a;
                }
                return aVarE;
            }
            return aVarB;
        }
        return aVarH;
    }

    public /* synthetic */ ProductEligibility(f fVar, h hVar, ShoppingCart shoppingCart, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? null : shoppingCart);
    }
}
