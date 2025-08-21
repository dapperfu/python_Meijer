package nk;

import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Lnk/h;", "LTq/h;", "Landroid/os/Parcelable;", "Lnk/b;", "l", "()Lnk/b;", "price", "Lnk/a;", "e0", "()Lnk/a;", "discount", "k0", "discountedPrice", "", "P3", "()Z", "isMap", "Q0", "depositPrice", "", "r2", "()D", "qtyIncrement", "", "H0", "()Ljava/lang/Integer;", "maxOrderQuantity", "d3", "isSale", "", "f1", "()Ljava/lang/String;", "priceUnit", "z1", "priceUnitAbbreviation", "Y", "unitAbbreviation", "p", "unit", "D", "currentPrice", "w3", "a", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public interface h extends Tq.h, Parcelable {

    /* renamed from: w3, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f152496a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnk/h$a;", "", "<init>", "()V", "", "name", "a", "(Ljava/lang/String;)Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f152496a = new Companion();

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public final String a(String name) {
            Intrinsics.j(name, "name");
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String upperCase = name.toUpperCase(US);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -1935095995:
                    if (upperCase.equals("PIECES")) {
                        return "";
                    }
                    break;
                case -89079770:
                    if (upperCase.equals("PACKAGE")) {
                        return "pkg";
                    }
                    break;
                case 2204:
                    if (upperCase.equals("EA")) {
                        return "ea";
                    }
                    break;
                case 65512:
                    if (upperCase.equals("BAG")) {
                        return "bag";
                    }
                    break;
                case 2120193:
                    if (upperCase.equals("EACH")) {
                        return "ea";
                    }
                    break;
                case 63561728:
                    if (upperCase.equals("BUNCH")) {
                        return "bunch";
                    }
                    break;
                case 76319340:
                    if (upperCase.equals("POUND")) {
                        return "lb";
                    }
                    break;
                case 1973778439:
                    if (upperCase.equals("BYCASE")) {
                        return "case";
                    }
                    break;
            }
            Intrinsics.i(US, "US");
            String lowerCase = name.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        private Companion() {
        }
    }

    /* renamed from: H0 */
    Integer getMaxOrderQuantity();

    /* renamed from: P3 */
    boolean getIsMap();

    /* renamed from: Q0 */
    b getDepositPrice();

    /* renamed from: d3 */
    boolean getIsSale();

    /* renamed from: e0 */
    InterfaceC15960a getDiscount();

    /* renamed from: f1 */
    String getPriceUnit();

    /* renamed from: k0 */
    b getDiscountedPrice();

    /* renamed from: l */
    b getPrice();

    /* renamed from: p */
    String getUnit();

    /* renamed from: r2 */
    double getQtyIncrement();

    default String Y() {
        Companion companion = INSTANCE;
        String unit = getUnit();
        if (unit == null) {
            unit = "";
        }
        return companion.a(unit);
    }

    default b D() {
        b discountedPrice = getDiscountedPrice();
        if (discountedPrice == null) {
            return getPrice();
        }
        return discountedPrice;
    }

    default String z1() {
        String priceUnit = getPriceUnit();
        if (priceUnit != null) {
            return INSTANCE.a(priceUnit);
        }
        return null;
    }
}
