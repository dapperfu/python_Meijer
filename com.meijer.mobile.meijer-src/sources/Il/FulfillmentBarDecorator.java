package Il;

import Cj.i;
import bk.AbstractC6392a;
import di.CustomerAddress;
import fj.DeliveryMode;
import fj.Entry;
import fj.ShoppingCart;
import j$.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import wk.C17898a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001\u001cBw\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b7\u0010\u0016R\u0017\u0010:\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u00104R\u0014\u0010;\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00104R\u0011\u0010<\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00104R\u0011\u0010=\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00104R\u0011\u0010>\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0011\u0010?\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0011\u0010@\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010C\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\b'\u0010BR\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b \u0010B¨\u0006F"}, d2 = {"LIl/a;", "", "", "Lfj/i;", "initialEntries", "Lfj/h;", "deliveryMode", "", "pickupLocationName", "deliveryLocationName", "Ljj/c;", "fulfillmentSlot", "", "currentItemCount", "itemCount", "", "isUnderModification", "fromSearchProducts", "error", "<init>", "(Ljava/util/List;Lfj/h;Ljava/lang/String;Ljava/lang/String;Ljj/c;IIZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Lfj/h;", "getDeliveryMode", "()Lfj/h;", "c", "Ljava/lang/String;", "getPickupLocationName", "d", "getDeliveryLocationName", "e", "Ljj/c;", "getFulfillmentSlot", "()Ljj/c;", "I", "getCurrentItemCount", "g", "getItemCount", "h", "Z", "j", "()Z", "i", "getFromSearchProducts", "getError", "k", "getShowSmallHeader", "showSmallHeader", "canDisplayOrderUpdateMessage", "isPickupOrder", "isDeliveryOrder", "startingFulfillmentTime", "fulfillmentDay", "fulfillmentLogoDrawableResource", "Lbk/a;", "()Lbk/a;", "fulfillmentLocationName", "fulfillmentAvailabilityTime", "l", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Il.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentBarDecorator {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f14849m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Entry> initialEntries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickupLocationName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryLocationName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlot fulfillmentSlot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentItemCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUnderModification;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean fromSearchProducts;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean showSmallHeader;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJK\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LIl/a$a;", "", "<init>", "()V", "", "Lfj/i;", "initialEntries", "updatedEntries", "", "a", "(Ljava/util/List;Ljava/util/List;)I", "Lfj/C;", "cart", "Ljj/c;", "fulfillmentSlot", "", "error", "", "fromSearchProducts", "LIl/a;", "b", "(Lfj/C;Ljava/util/List;Ljj/c;Ljava/lang/String;Z)LIl/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Il.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final int a(List<Entry> initialEntries, List<Entry> updatedEntries) {
            Iterator<T> it = initialEntries.iterator();
            double actualQuantity = 0.0d;
            double actualQuantity2 = 0.0d;
            while (it.hasNext()) {
                actualQuantity2 += ((Entry) it.next()).getActualQuantity();
            }
            Iterator<T> it2 = updatedEntries.iterator();
            while (it2.hasNext()) {
                actualQuantity += ((Entry) it2.next()).getActualQuantity();
            }
            int i10 = (int) (actualQuantity > actualQuantity2 ? actualQuantity - actualQuantity2 : actualQuantity2 - actualQuantity);
            if (actualQuantity < actualQuantity2) {
                return 0;
            }
            return i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FulfillmentBarDecorator c(Companion companion, ShoppingCart shoppingCart, List list, FulfillmentSlot fulfillmentSlot, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shoppingCart = null;
            }
            if ((i10 & 2) != 0) {
                list = CollectionsKt.m();
            }
            if ((i10 & 4) != 0) {
                fulfillmentSlot = null;
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return companion.b(shoppingCart, list, fulfillmentSlot, str, z10);
        }

        public final FulfillmentBarDecorator b(ShoppingCart cart, List<Entry> initialEntries, FulfillmentSlot fulfillmentSlot, String error, boolean fromSearchProducts) {
            Intrinsics.j(initialEntries, "initialEntries");
            if (cart == null) {
                return new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, error, 511, null);
            }
            int size = cart.p().size();
            DeliveryMode deliveryMode = cart.getDeliveryMode();
            String displayName = cart.getPointOfService().getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            CustomerAddress deliveryAddress = cart.getDeliveryAddress();
            String line1 = deliveryAddress != null ? deliveryAddress.getLine1() : null;
            if (line1 == null) {
                line1 = "";
            }
            return new FulfillmentBarDecorator(initialEntries, deliveryMode, displayName, line1, fulfillmentSlot, size, FulfillmentBarDecorator.INSTANCE.a(initialEntries, cart.p()), cart.P(), fromSearchProducts, null, 512, null);
        }
    }

    public FulfillmentBarDecorator() {
        this(null, null, null, null, null, 0, 0, false, false, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentBarDecorator)) {
            return false;
        }
        FulfillmentBarDecorator fulfillmentBarDecorator = (FulfillmentBarDecorator) other;
        return Intrinsics.e(this.initialEntries, fulfillmentBarDecorator.initialEntries) && Intrinsics.e(this.deliveryMode, fulfillmentBarDecorator.deliveryMode) && Intrinsics.e(this.pickupLocationName, fulfillmentBarDecorator.pickupLocationName) && Intrinsics.e(this.deliveryLocationName, fulfillmentBarDecorator.deliveryLocationName) && Intrinsics.e(this.fulfillmentSlot, fulfillmentBarDecorator.fulfillmentSlot) && this.currentItemCount == fulfillmentBarDecorator.currentItemCount && this.itemCount == fulfillmentBarDecorator.itemCount && this.isUnderModification == fulfillmentBarDecorator.isUnderModification && this.fromSearchProducts == fulfillmentBarDecorator.fromSearchProducts && Intrinsics.e(this.error, fulfillmentBarDecorator.error);
    }

    public FulfillmentBarDecorator(List<Entry> initialEntries, DeliveryMode deliveryMode, String pickupLocationName, String deliveryLocationName, FulfillmentSlot fulfillmentSlot, int i10, int i11, boolean z10, boolean z11, String str) {
        Intrinsics.j(initialEntries, "initialEntries");
        Intrinsics.j(pickupLocationName, "pickupLocationName");
        Intrinsics.j(deliveryLocationName, "deliveryLocationName");
        this.initialEntries = initialEntries;
        this.deliveryMode = deliveryMode;
        this.pickupLocationName = pickupLocationName;
        this.deliveryLocationName = deliveryLocationName;
        this.fulfillmentSlot = fulfillmentSlot;
        this.currentItemCount = i10;
        this.itemCount = i11;
        this.isUnderModification = z10;
        this.fromSearchProducts = z11;
        this.error = str;
        this.showSmallHeader = fulfillmentSlot != null;
    }

    private final boolean a() {
        return this.isUnderModification && this.fromSearchProducts;
    }

    public final String c() {
        String lowerCase;
        LocalDate date;
        String strValueOf;
        FulfillmentSlot fulfillmentSlot = this.fulfillmentSlot;
        if (fulfillmentSlot == null || (date = fulfillmentSlot.getDate()) == null) {
            lowerCase = null;
        } else {
            LocalDate localDateNow = LocalDate.now();
            if (localDateNow.isEqual(date)) {
                lowerCase = "Today";
            } else if (localDateNow.until(date).getDays() > 6) {
                lowerCase = C17898a.NUMERIC_MONTH_DAY.format(date);
            } else {
                String string = date.getDayOfWeek().toString();
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                lowerCase = string.toLowerCase(US);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    char cCharAt = lowerCase.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        Intrinsics.i(US, "US");
                        strValueOf = CharsKt.e(cCharAt, US);
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb2.append((Object) strValueOf);
                    String strSubstring = lowerCase.substring(1);
                    Intrinsics.i(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    lowerCase = sb2.toString();
                }
            }
        }
        return lowerCase == null ? "" : lowerCase;
    }

    public final List<Entry> f() {
        return this.initialEntries;
    }

    public final String g() {
        String lowerCase;
        FulfillmentSlot fulfillmentSlot = this.fulfillmentSlot;
        if (fulfillmentSlot != null) {
            String str = C17898a.f167225a.B().format(fulfillmentSlot.getStartTime());
            Intrinsics.i(str, "format(...)");
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return lowerCase == null ? "" : lowerCase;
    }

    public final boolean h() {
        DeliveryMode deliveryMode = this.deliveryMode;
        return Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "delivery");
    }

    public int hashCode() {
        int iHashCode = this.initialEntries.hashCode() * 31;
        DeliveryMode deliveryMode = this.deliveryMode;
        int iHashCode2 = (((((iHashCode + (deliveryMode == null ? 0 : deliveryMode.hashCode())) * 31) + this.pickupLocationName.hashCode()) * 31) + this.deliveryLocationName.hashCode()) * 31;
        FulfillmentSlot fulfillmentSlot = this.fulfillmentSlot;
        int iHashCode3 = (((((((((iHashCode2 + (fulfillmentSlot == null ? 0 : fulfillmentSlot.hashCode())) * 31) + Integer.hashCode(this.currentItemCount)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Boolean.hashCode(this.isUnderModification)) * 31) + Boolean.hashCode(this.fromSearchProducts)) * 31;
        String str = this.error;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean i() {
        DeliveryMode deliveryMode = this.deliveryMode;
        return Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "pickup");
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsUnderModification() {
        return this.isUnderModification;
    }

    public String toString() {
        return "FulfillmentBarDecorator(initialEntries=" + this.initialEntries + ", deliveryMode=" + this.deliveryMode + ", pickupLocationName=" + this.pickupLocationName + ", deliveryLocationName=" + this.deliveryLocationName + ", fulfillmentSlot=" + this.fulfillmentSlot + ", currentItemCount=" + this.currentItemCount + ", itemCount=" + this.itemCount + ", isUnderModification=" + this.isUnderModification + ", fromSearchProducts=" + this.fromSearchProducts + ", error=" + this.error + ')';
    }

    public final AbstractC6392a b() {
        Object objG;
        Object objG2;
        if (a()) {
            return AbstractC6392a.INSTANCE.d(h.f14949j0, String.valueOf(this.itemCount));
        }
        if (i()) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = h.f14914K;
            String strC = c();
            if (Intrinsics.e(g(), "12pm")) {
                objG2 = companion.d(h.f14947i0, new Object[0]);
            } else {
                objG2 = g();
            }
            return companion.d(i10, strC, objG2);
        }
        if (h()) {
            if (!StringsKt.s0(c()) && !StringsKt.s0(g())) {
                AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                int i11 = h.f14948j;
                String strC2 = c();
                if (Intrinsics.e(g(), "12pm")) {
                    objG = companion2.d(h.f14947i0, new Object[0]);
                } else {
                    objG = g();
                }
                return companion2.d(i11, strC2, objG);
            }
            return AbstractC6392a.INSTANCE.a();
        }
        return null;
    }

    public final AbstractC6392a d() {
        if (a()) {
            return AbstractC6392a.INSTANCE.d(h.f14951k0, new Object[0]);
        }
        if (i()) {
            return AbstractC6392a.INSTANCE.d(h.f14913J, this.pickupLocationName);
        }
        if (h()) {
            return AbstractC6392a.INSTANCE.d(h.f14961u, this.deliveryLocationName);
        }
        return AbstractC6392a.INSTANCE.d(h.f14915L, new Object[0]);
    }

    public final int e() {
        if (i()) {
            return i.f4740T0;
        }
        if (h()) {
            return i.f4779e2;
        }
        return i.f4740T0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FulfillmentBarDecorator(java.util.List r3, fj.DeliveryMode r4, java.lang.String r5, java.lang.String r6, jj.FulfillmentSlot r7, int r8, int r9, boolean r10, boolean r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L8
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L8:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto Le
            r4 = r0
        Le:
            r14 = r13 & 4
            java.lang.String r1 = ""
            if (r14 == 0) goto L15
            r5 = r1
        L15:
            r14 = r13 & 8
            if (r14 == 0) goto L1a
            r6 = r1
        L1a:
            r14 = r13 & 16
            if (r14 == 0) goto L1f
            r7 = r0
        L1f:
            r14 = r13 & 32
            r1 = 0
            if (r14 == 0) goto L25
            r8 = r1
        L25:
            r14 = r13 & 64
            if (r14 == 0) goto L2a
            r9 = r1
        L2a:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L2f
            r10 = r1
        L2f:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L34
            r11 = r1
        L34:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L44
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L4f
        L44:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L4f:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Il.FulfillmentBarDecorator.<init>(java.util.List, fj.h, java.lang.String, java.lang.String, jj.c, int, int, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
