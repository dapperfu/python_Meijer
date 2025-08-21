package hq;

import Xp.ShopAndScanCoupon;
import Xp.ShopAndScanItem;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.shopandscan.data.model.error.ShopAndScanItemException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import wk.C17898a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u0002'$B·\u0001\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b'\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b-\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b+\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\b\u0018\u0010AR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b:\u0010AR\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\b>\u0010AR\u0011\u0010D\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0011\u0010E\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0011\u0010F\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b7\u0010A¨\u0006G"}, d2 = {"Lhq/f;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "localId", "Lbk/a;", "topText", "primaryText", "primarySupportingText", "bottomText", "bottomSupportingText", "", "quantity", "imageUrl", "Lhq/f$b;", "imageType", "Lhq/e;", "coupon", "Lhq/i;", "restriction", "Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "exception", "", "isLoading", "isAddedToCart", "showQuantityStepper", "showSalePriceFormat", "<init>", "(Ljava/lang/String;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ILjava/lang/String;Lhq/f$b;Lhq/e;Lhq/i;Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;ZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lbk/a;", "n", "()Lbk/a;", "c", "h", "d", "g", "e", "I", "i", "Lhq/f$b;", "()Lhq/f$b;", "j", "Lhq/e;", "()Lhq/e;", "k", "Lhq/i;", "()Lhq/i;", "l", "Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "getException", "()Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "m", "Z", "p", "()Z", "o", "q", "isRestriction", "isError", "showItemActionButtons", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanItemDecorator {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f136104r = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String localId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a topText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a primaryText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a primarySupportingText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a bottomText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a bottomSupportingText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final b imageType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanCouponDecorator coupon;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanRestrictionDecorator restriction;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanItemException exception;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedToCart;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showQuantityStepper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showSalePriceFormat;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0013\u0010\u0014\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0015\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lhq/f$a;", "", "<init>", "()V", "LXp/c;", "Lhq/f;", "p", "(LXp/c;)Lhq/f;", "o", "b", "Lbk/a;", "e", "(LXp/c;)Lbk/a;", "k", "i", "c", "d", "l", "m", "j", "f", "g", "h", "", "n", "(LXp/c;)Z", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hq.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hq.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2156a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ShopAndScanItem.f.values().length];
                try {
                    iArr[ShopAndScanItem.f.f42425a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShopAndScanItem.f.f42426b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShopAndScanItem.f.f42427c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ShopAndScanItem.a.values().length];
                try {
                    iArr2[ShopAndScanItem.a.f42407a.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ShopAndScanItem.a.f42408b.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ShopAndScanItem.a.f42409c.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[ShopAndScanItem.a.f42410d.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        private final AbstractC6392a d(ShopAndScanItem shopAndScanItem) {
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117968x, shopAndScanItem.getBarcode().getData());
        }

        private final AbstractC6392a i(ShopAndScanItem shopAndScanItem) {
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117863I1, shopAndScanItem.getTimestamp().getTimeAdded().format(C17898a.f167225a.r()));
        }

        private final AbstractC6392a j(ShopAndScanItem shopAndScanItem) {
            return AbstractC6392a.INSTANCE.c(shopAndScanItem.getTitle());
        }

        public final ShopAndScanItemDecorator a(ShopAndScanItem shopAndScanItem) {
            Intrinsics.j(shopAndScanItem, "<this>");
            int i10 = C2156a.$EnumSwitchMapping$0[shopAndScanItem.getState().ordinal()];
            if (i10 == 1) {
                return p(shopAndScanItem);
            }
            if (i10 == 2) {
                return o(shopAndScanItem);
            }
            if (i10 == 3) {
                return b(shopAndScanItem);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final ShopAndScanItemDecorator b(ShopAndScanItem shopAndScanItem) {
            ShopAndScanCouponDecorator shopAndScanCouponDecoratorA;
            ShopAndScanRestrictionDecorator shopAndScanRestrictionDecoratorA;
            String message;
            String localId = shopAndScanItem.getLocalId();
            AbstractC6392a abstractC6392aD = d(shopAndScanItem);
            AbstractC6392a abstractC6392aD2 = AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117857G1, new Object[0]);
            AbstractC6392a abstractC6392aI = i(shopAndScanItem);
            int quantity = shopAndScanItem.getQuantity();
            b bVar = b.f136123c;
            ShopAndScanCoupon coupon = shopAndScanItem.getCoupon();
            if (coupon != null) {
                shopAndScanCouponDecoratorA = ShopAndScanCouponDecorator.INSTANCE.a(coupon);
            } else {
                shopAndScanCouponDecoratorA = null;
            }
            ShopAndScanItem.ShopAndScanItemRestriction restriction = shopAndScanItem.getRestriction();
            if (restriction != null) {
                shopAndScanRestrictionDecoratorA = ShopAndScanRestrictionDecorator.INSTANCE.a(restriction, shopAndScanItem.getRestriction().getIsDismissed());
            } else {
                shopAndScanRestrictionDecoratorA = null;
            }
            ShopAndScanItemException exception = shopAndScanItem.getException();
            if (exception != null) {
                message = exception.getMessage();
            } else {
                message = null;
            }
            return new ShopAndScanItemDecorator(localId, abstractC6392aD, abstractC6392aD2, null, abstractC6392aI, null, quantity, null, bVar, shopAndScanCouponDecoratorA, shopAndScanRestrictionDecoratorA, new ShopAndScanItemException(message, null), false, false, false, false, 41000, null);
        }

        private final AbstractC6392a c(ShopAndScanItem shopAndScanItem) {
            int i10 = C2156a.$EnumSwitchMapping$1[shopAndScanItem.getAction().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117860H1, new Object[0]);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117866J1, new Object[0]);
                }
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117961u1, new Object[0]);
            }
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117914f, new Object[0]);
        }

        private final AbstractC6392a e(ShopAndScanItem shopAndScanItem) {
            double dDoubleValue;
            Double netPrice;
            Double netPriceWithDeposit;
            if (shopAndScanItem.getDeposit() != null) {
                ShopAndScanItem.Price price = shopAndScanItem.getPrice();
                if (price != null) {
                    netPriceWithDeposit = price.getNetPriceWithDeposit();
                } else {
                    netPriceWithDeposit = null;
                }
                if (netPriceWithDeposit != null) {
                    return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117938n, shopAndScanItem.getPrice().getNetPriceWithDeposit());
                }
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = com.meijer.mobile.shopandscan.e.f117938n;
            ShopAndScanItem.Price price2 = shopAndScanItem.getPrice();
            if (price2 != null && (netPrice = price2.getNetPrice()) != null) {
                dDoubleValue = netPrice.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            return companion.d(i10, Double.valueOf(dDoubleValue));
        }

        private final AbstractC6392a f(ShopAndScanItem shopAndScanItem) {
            String pricingText;
            AbstractC6392a abstractC6392aC;
            ShopAndScanItem.Price price = shopAndScanItem.getPrice();
            if (price != null && (pricingText = price.getPricingText()) != null && (abstractC6392aC = AbstractC6392a.INSTANCE.c(pricingText)) != null) {
                return abstractC6392aC;
            }
            return AbstractC6392a.INSTANCE.a();
        }

        private final AbstractC6392a g(ShopAndScanItem shopAndScanItem) {
            String title;
            AbstractC6392a abstractC6392aC;
            ShopAndScanItem.ShopAndScanItemRestriction restriction = shopAndScanItem.getRestriction();
            if (restriction != null && (title = restriction.getTitle()) != null && (abstractC6392aC = AbstractC6392a.INSTANCE.c(title)) != null) {
                return abstractC6392aC;
            }
            return AbstractC6392a.INSTANCE.a();
        }

        private final AbstractC6392a h(ShopAndScanItem shopAndScanItem) {
            Double totalSavings;
            ShopAndScanItem.Savings savings = shopAndScanItem.getSavings();
            if (savings != null && (totalSavings = savings.getTotalSavings()) != null) {
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117932l, Double.valueOf(totalSavings.doubleValue()));
            }
            return null;
        }

        private final AbstractC6392a k(ShopAndScanItem shopAndScanItem) {
            Double wasPrice;
            ShopAndScanItem.Price price = shopAndScanItem.getPrice();
            if (price != null) {
                wasPrice = price.getWasPrice();
            } else {
                wasPrice = null;
            }
            if (wasPrice == null) {
                return null;
            }
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117938n, shopAndScanItem.getPrice().getWasPrice());
        }

        private final ShopAndScanItemDecorator l(ShopAndScanItem shopAndScanItem) {
            ShopAndScanCouponDecorator shopAndScanCouponDecoratorA;
            String localId = shopAndScanItem.getLocalId();
            AbstractC6392a abstractC6392aJ = j(shopAndScanItem);
            AbstractC6392a abstractC6392aE = e(shopAndScanItem);
            AbstractC6392a abstractC6392aK = k(shopAndScanItem);
            AbstractC6392a abstractC6392aF = f(shopAndScanItem);
            AbstractC6392a abstractC6392aH = h(shopAndScanItem);
            int quantity = shopAndScanItem.getQuantity();
            boolean isQuantityUpdateAllowed = shopAndScanItem.getIsQuantityUpdateAllowed();
            boolean zN = n(shopAndScanItem);
            ShopAndScanCoupon coupon = shopAndScanItem.getCoupon();
            ShopAndScanRestrictionDecorator shopAndScanRestrictionDecoratorA = null;
            if (coupon != null) {
                shopAndScanCouponDecoratorA = ShopAndScanCouponDecorator.INSTANCE.a(coupon);
            } else {
                shopAndScanCouponDecoratorA = null;
            }
            ShopAndScanItem.ShopAndScanItemRestriction restriction = shopAndScanItem.getRestriction();
            if (restriction != null) {
                shopAndScanRestrictionDecoratorA = ShopAndScanRestrictionDecorator.INSTANCE.a(restriction, shopAndScanItem.getRestriction().getIsDismissed());
            }
            ShopAndScanItemDecorator shopAndScanItemDecorator = new ShopAndScanItemDecorator(localId, abstractC6392aJ, abstractC6392aE, abstractC6392aK, abstractC6392aF, abstractC6392aH, quantity, shopAndScanItem.getImageUrl(), b.f136124d, shopAndScanCouponDecoratorA, shopAndScanRestrictionDecoratorA, null, false, false, isQuantityUpdateAllowed, zN, 10240, null);
            qw.a.INSTANCE.z("ShopAndScan").q(StringsKt.n("\n                        Decorating Item with Pricing Details\n                            Item: " + shopAndScanItemDecorator + "\n                        "), new Object[0]);
            return shopAndScanItemDecorator;
        }

        private final ShopAndScanItemDecorator m(ShopAndScanItem shopAndScanItem) {
            ShopAndScanCouponDecorator shopAndScanCouponDecoratorA;
            String localId = shopAndScanItem.getLocalId();
            AbstractC6392a abstractC6392aG = g(shopAndScanItem);
            AbstractC6392a abstractC6392aD = d(shopAndScanItem);
            AbstractC6392a abstractC6392aI = i(shopAndScanItem);
            int quantity = shopAndScanItem.getQuantity();
            ShopAndScanCoupon coupon = shopAndScanItem.getCoupon();
            ShopAndScanRestrictionDecorator shopAndScanRestrictionDecoratorA = null;
            if (coupon != null) {
                shopAndScanCouponDecoratorA = ShopAndScanCouponDecorator.INSTANCE.a(coupon);
            } else {
                shopAndScanCouponDecoratorA = null;
            }
            ShopAndScanItem.ShopAndScanItemRestriction restriction = shopAndScanItem.getRestriction();
            if (restriction != null) {
                shopAndScanRestrictionDecoratorA = ShopAndScanRestrictionDecorator.INSTANCE.a(restriction, shopAndScanItem.getRestriction().getIsDismissed());
            }
            ShopAndScanItemDecorator shopAndScanItemDecorator = new ShopAndScanItemDecorator(localId, abstractC6392aD, abstractC6392aG, null, abstractC6392aI, null, quantity, shopAndScanItem.getImageUrl(), b.f136122b, shopAndScanCouponDecoratorA, shopAndScanRestrictionDecoratorA, null, false, false, false, false, 59424, null);
            qw.a.INSTANCE.z("ShopAndScan").q(StringsKt.n("\n                        Decorating Item with Restriction Details\n                            Item: " + shopAndScanItemDecorator + "\n                        "), new Object[0]);
            return shopAndScanItemDecorator;
        }

        private final boolean n(ShopAndScanItem shopAndScanItem) {
            Double wasPrice;
            ShopAndScanItem.Price price = shopAndScanItem.getPrice();
            if (price != null) {
                wasPrice = price.getWasPrice();
            } else {
                wasPrice = null;
            }
            if (wasPrice == null || shopAndScanItem.getPrice().getNowPrice() == null || shopAndScanItem.getPrice().getWasPrice().doubleValue() <= shopAndScanItem.getPrice().getNowPrice().doubleValue()) {
                return false;
            }
            return true;
        }

        private final ShopAndScanItemDecorator o(ShopAndScanItem shopAndScanItem) {
            if (shopAndScanItem.getIsAddedToCart()) {
                return l(shopAndScanItem);
            }
            return m(shopAndScanItem);
        }

        private final ShopAndScanItemDecorator p(ShopAndScanItem shopAndScanItem) {
            ShopAndScanCouponDecorator shopAndScanCouponDecoratorA;
            String localId = shopAndScanItem.getLocalId();
            AbstractC6392a abstractC6392aC = c(shopAndScanItem);
            AbstractC6392a abstractC6392aD = d(shopAndScanItem);
            AbstractC6392a abstractC6392aI = i(shopAndScanItem);
            ShopAndScanCoupon coupon = shopAndScanItem.getCoupon();
            if (coupon != null) {
                shopAndScanCouponDecoratorA = ShopAndScanCouponDecorator.INSTANCE.a(coupon);
            } else {
                shopAndScanCouponDecoratorA = null;
            }
            return new ShopAndScanItemDecorator(localId, abstractC6392aD, abstractC6392aC, null, null, abstractC6392aI, 0, null, null, shopAndScanCouponDecoratorA, null, null, true, false, false, false, 43352, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lhq/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hq.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f136121a = new b("URL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f136122b = new b("WARNING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f136123c = new b("ERROR", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f136124d = new b("DEFAULT", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f136125e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f136126f;

        static {
            b[] bVarArrA = a();
            f136125e = bVarArrA;
            f136126f = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f136121a, f136122b, f136123c, f136124d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f136125e.clone();
        }

        private b(String str, int i10) {
        }
    }

    public ShopAndScanItemDecorator() {
        this(null, null, null, null, null, null, 0, null, null, null, null, null, false, false, false, false, 65535, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanItemDecorator)) {
            return false;
        }
        ShopAndScanItemDecorator shopAndScanItemDecorator = (ShopAndScanItemDecorator) other;
        return Intrinsics.e(this.localId, shopAndScanItemDecorator.localId) && Intrinsics.e(this.topText, shopAndScanItemDecorator.topText) && Intrinsics.e(this.primaryText, shopAndScanItemDecorator.primaryText) && Intrinsics.e(this.primarySupportingText, shopAndScanItemDecorator.primarySupportingText) && Intrinsics.e(this.bottomText, shopAndScanItemDecorator.bottomText) && Intrinsics.e(this.bottomSupportingText, shopAndScanItemDecorator.bottomSupportingText) && this.quantity == shopAndScanItemDecorator.quantity && Intrinsics.e(this.imageUrl, shopAndScanItemDecorator.imageUrl) && this.imageType == shopAndScanItemDecorator.imageType && Intrinsics.e(this.coupon, shopAndScanItemDecorator.coupon) && Intrinsics.e(this.restriction, shopAndScanItemDecorator.restriction) && Intrinsics.e(this.exception, shopAndScanItemDecorator.exception) && this.isLoading == shopAndScanItemDecorator.isLoading && this.isAddedToCart == shopAndScanItemDecorator.isAddedToCart && this.showQuantityStepper == shopAndScanItemDecorator.showQuantityStepper && this.showSalePriceFormat == shopAndScanItemDecorator.showSalePriceFormat;
    }

    public ShopAndScanItemDecorator(String localId, AbstractC6392a topText, AbstractC6392a primaryText, AbstractC6392a abstractC6392a, AbstractC6392a bottomText, AbstractC6392a abstractC6392a2, int i10, String str, b imageType, ShopAndScanCouponDecorator shopAndScanCouponDecorator, ShopAndScanRestrictionDecorator shopAndScanRestrictionDecorator, ShopAndScanItemException shopAndScanItemException, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(localId, "localId");
        Intrinsics.j(topText, "topText");
        Intrinsics.j(primaryText, "primaryText");
        Intrinsics.j(bottomText, "bottomText");
        Intrinsics.j(imageType, "imageType");
        this.localId = localId;
        this.topText = topText;
        this.primaryText = primaryText;
        this.primarySupportingText = abstractC6392a;
        this.bottomText = bottomText;
        this.bottomSupportingText = abstractC6392a2;
        this.quantity = i10;
        this.imageUrl = str;
        this.imageType = imageType;
        this.coupon = shopAndScanCouponDecorator;
        this.restriction = shopAndScanRestrictionDecorator;
        this.exception = shopAndScanItemException;
        this.isLoading = z10;
        this.isAddedToCart = z11;
        this.showQuantityStepper = z12;
        this.showSalePriceFormat = z13;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getBottomSupportingText() {
        return this.bottomSupportingText;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getBottomText() {
        return this.bottomText;
    }

    /* renamed from: c, reason: from getter */
    public final ShopAndScanCouponDecorator getCoupon() {
        return this.coupon;
    }

    /* renamed from: d, reason: from getter */
    public final b getImageType() {
        return this.imageType;
    }

    /* renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: f, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getPrimarySupportingText() {
        return this.primarySupportingText;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getPrimaryText() {
        return this.primaryText;
    }

    public int hashCode() {
        int iHashCode = ((((this.localId.hashCode() * 31) + this.topText.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.primarySupportingText;
        int iHashCode2 = (((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + this.bottomText.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.bottomSupportingText;
        int iHashCode3 = (((iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
        String str = this.imageUrl;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.imageType.hashCode()) * 31;
        ShopAndScanCouponDecorator shopAndScanCouponDecorator = this.coupon;
        int iHashCode5 = (iHashCode4 + (shopAndScanCouponDecorator == null ? 0 : shopAndScanCouponDecorator.hashCode())) * 31;
        ShopAndScanRestrictionDecorator shopAndScanRestrictionDecorator = this.restriction;
        int iHashCode6 = (iHashCode5 + (shopAndScanRestrictionDecorator == null ? 0 : shopAndScanRestrictionDecorator.hashCode())) * 31;
        ShopAndScanItemException shopAndScanItemException = this.exception;
        return ((((((((iHashCode6 + (shopAndScanItemException != null ? shopAndScanItemException.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isAddedToCart)) * 31) + Boolean.hashCode(this.showQuantityStepper)) * 31) + Boolean.hashCode(this.showSalePriceFormat);
    }

    /* renamed from: i, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: j, reason: from getter */
    public final ShopAndScanRestrictionDecorator getRestriction() {
        return this.restriction;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getShowQuantityStepper() {
        return this.showQuantityStepper;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getShowSalePriceFormat() {
        return this.showSalePriceFormat;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC6392a getTopText() {
        return this.topText;
    }

    public final boolean o() {
        return this.exception != null;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final boolean q() {
        return (this.isAddedToCart || this.restriction == null) ? false : true;
    }

    public String toString() {
        return "ShopAndScanItemDecorator(localId=" + this.localId + ", topText=" + this.topText + ", primaryText=" + this.primaryText + ", primarySupportingText=" + this.primarySupportingText + ", bottomText=" + this.bottomText + ", bottomSupportingText=" + this.bottomSupportingText + ", quantity=" + this.quantity + ", imageUrl=" + this.imageUrl + ", imageType=" + this.imageType + ", coupon=" + this.coupon + ", restriction=" + this.restriction + ", exception=" + this.exception + ", isLoading=" + this.isLoading + ", isAddedToCart=" + this.isAddedToCart + ", showQuantityStepper=" + this.showQuantityStepper + ", showSalePriceFormat=" + this.showSalePriceFormat + ')';
    }

    public final boolean k() {
        return o();
    }

    public /* synthetic */ ShopAndScanItemDecorator(String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, int i10, String str2, b bVar, ShopAndScanCouponDecorator shopAndScanCouponDecorator, ShopAndScanRestrictionDecorator shopAndScanRestrictionDecorator, ShopAndScanItemException shopAndScanItemException, boolean z10, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a, (i11 & 4) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a2, (i11 & 8) != 0 ? null : abstractC6392a3, (i11 & 16) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a4, (i11 & 32) != 0 ? null : abstractC6392a5, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : str2, (i11 & 256) != 0 ? b.f136124d : bVar, (i11 & 512) != 0 ? null : shopAndScanCouponDecorator, (i11 & 1024) != 0 ? null : shopAndScanRestrictionDecorator, (i11 & RecyclerView.m.FLAG_MOVED) == 0 ? shopAndScanItemException : null, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z10, (i11 & 8192) != 0 ? false : z11, (i11 & 16384) != 0 ? false : z12, (i11 & 32768) != 0 ? false : z13);
    }
}
