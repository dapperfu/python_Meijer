package com.meijer.mobile.shopandscan.data.local.entity;

import Up.ShopAndScanCouponEntity;
import Xp.ShopAndScanCoupon;
import Xp.ShopAndScanItem;
import Xp.a;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import com.meijer.mobile.shopandscan.data.model.error.ShopAndScanItemException;
import j$.time.LocalDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wq.C17908a;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.\u001a\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"", "tripId", "LXp/a;", "barcode", "", "quantity", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "a", "(Ljava/lang/String;LXp/a;I)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "LXp/c;", "k", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;)LXp/c;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$g;", "entity", "LXp/c$d;", "h", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$g;)LXp/c$d;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$d;", "LXp/c$b;", "e", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$d;)LXp/c$b;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$e;", "LXp/c$c;", "f", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$e;)LXp/c$c;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$i;", "LXp/c$g;", "j", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$i;)LXp/c$g;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b;", "c", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b;)LXp/a;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "state", "LXp/c$f;", "i", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;)LXp/c$f;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "action", "LXp/c$a;", "b", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;)LXp/c$a;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$f;", "restriction", "LXp/c$e;", "g", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$f;)LXp/c$e;", "LUp/a;", "data", "LXp/b;", "d", "(LUp/a;)LXp/b;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.shopandscan.data.local.entity.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1897a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ShopAndScanItemEntity.Barcode.a.values().length];
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117760a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117761b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117763d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117764e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117765f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117766g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117767h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShopAndScanItemEntity.Barcode.a.f117768i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShopAndScanItemEntity.h.values().length];
            try {
                iArr2[ShopAndScanItemEntity.h.f117788a.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ShopAndScanItemEntity.h.f117789b.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ShopAndScanItemEntity.h.f117790c.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ShopAndScanItemEntity.a.values().length];
            try {
                iArr3[ShopAndScanItemEntity.a.f117752a.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f117753b.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f117754c.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f117755d.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final ShopAndScanItemEntity a(String tripId, Xp.a barcode, int i10) {
        Intrinsics.j(tripId, "tripId");
        Intrinsics.j(barcode, "barcode");
        ShopAndScanItemEntity.h hVar = ShopAndScanItemEntity.h.f117788a;
        ShopAndScanItemEntity.a aVar = ShopAndScanItemEntity.a.f117755d;
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        ShopAndScanItemEntity.Barcode barcode2 = new ShopAndScanItemEntity.Barcode(barcode.getData(), C17908a.a(barcode));
        String data = barcode.getData();
        String string2 = LocalDateTime.now().toString();
        Intrinsics.i(string2, "toString(...)");
        String string3 = LocalDateTime.now().toString();
        Intrinsics.i(string3, "toString(...)");
        return new ShopAndScanItemEntity(string, new ShopAndScanItemEntity.Timestamp(string2, string3), barcode2, null, null, null, null, null, null, null, data, i10, hVar, aVar, null, null, false, false, tripId, 164096, null);
    }

    private static final ShopAndScanItem.a b(ShopAndScanItemEntity.a aVar) {
        int i10 = C1897a.$EnumSwitchMapping$2[aVar.ordinal()];
        if (i10 == 1) {
            return ShopAndScanItem.a.f42407a;
        }
        if (i10 == 2) {
            return ShopAndScanItem.a.f42408b;
        }
        if (i10 == 3) {
            return ShopAndScanItem.a.f42409c;
        }
        if (i10 == 4) {
            return ShopAndScanItem.a.f42410d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final ShopAndScanItem.Deposit e(ShopAndScanItemEntity.Deposit deposit) {
        return new ShopAndScanItem.Deposit(deposit.getUnitDeposit(), deposit.getTotalDeposit());
    }

    private static final ShopAndScanItem.Price f(ShopAndScanItemEntity.Price price) {
        return new ShopAndScanItem.Price(price.getWasPrice(), price.getNowPrice(), price.getNetPrice(), price.getNetPriceWithDeposit(), price.getPricingText());
    }

    private static final ShopAndScanItem.ShopAndScanItemRestriction g(ShopAndScanItemEntity.Restriction restriction) {
        return new ShopAndScanItem.ShopAndScanItemRestriction(restriction.getRestrictionTitle(), restriction.getRestrictionMessage(), restriction.getIsDismissed());
    }

    private static final ShopAndScanItem.Savings h(ShopAndScanItemEntity.Savings savings) {
        return new ShopAndScanItem.Savings(savings.getUnitSavings(), savings.getTotalSavings());
    }

    private static final ShopAndScanItem.f i(ShopAndScanItemEntity.h hVar) {
        int i10 = C1897a.$EnumSwitchMapping$1[hVar.ordinal()];
        if (i10 == 1) {
            return ShopAndScanItem.f.f42425a;
        }
        if (i10 == 2) {
            return ShopAndScanItem.f.f42426b;
        }
        if (i10 == 3) {
            return ShopAndScanItem.f.f42427c;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final ShopAndScanItem.Timestamp j(ShopAndScanItemEntity.Timestamp timestamp) {
        LocalDateTime localDateTime = LocalDateTime.parse(timestamp.getTimeAdded());
        Intrinsics.i(localDateTime, "parse(...)");
        LocalDateTime localDateTime2 = LocalDateTime.parse(timestamp.getTimeUpdated());
        Intrinsics.i(localDateTime2, "parse(...)");
        return new ShopAndScanItem.Timestamp(localDateTime, localDateTime2);
    }

    public static final ShopAndScanItem k(ShopAndScanItemEntity shopAndScanItemEntity) {
        ShopAndScanItem.Timestamp timestamp;
        Intrinsics.j(shopAndScanItemEntity, "<this>");
        String itemId = shopAndScanItemEntity.getItemId();
        String remoteId = shopAndScanItemEntity.getRemoteId();
        String itemTripId = shopAndScanItemEntity.getItemTripId();
        Xp.a aVarC = c(shopAndScanItemEntity.getBarcode());
        String title = shopAndScanItemEntity.getTitle();
        int quantity = shopAndScanItemEntity.getQuantity();
        ShopAndScanItem.f fVarI = i(shopAndScanItemEntity.getState());
        ShopAndScanItem.a aVarB = b(shopAndScanItemEntity.getAction());
        ShopAndScanItemEntity.Restriction restriction = shopAndScanItemEntity.getRestriction();
        ShopAndScanItemException shopAndScanItemException = null;
        ShopAndScanItem.ShopAndScanItemRestriction shopAndScanItemRestrictionG = restriction != null ? g(restriction) : null;
        ShopAndScanItem.Timestamp timestampJ = j(shopAndScanItemEntity.getTimestamps());
        ShopAndScanItemEntity.Price price = shopAndScanItemEntity.getPrice();
        ShopAndScanItem.Price priceF = price != null ? f(price) : null;
        ShopAndScanItemEntity.Deposit deposit = shopAndScanItemEntity.getDeposit();
        ShopAndScanItem.Deposit depositE = deposit != null ? e(deposit) : null;
        ShopAndScanItem.Savings savingsH = shopAndScanItemEntity.getSavings() != null ? h(shopAndScanItemEntity.getSavings()) : null;
        boolean isAddedToCart = shopAndScanItemEntity.getIsAddedToCart();
        boolean isQuantityUpdateAllowed = shopAndScanItemEntity.getIsQuantityUpdateAllowed();
        String imageUrl = shopAndScanItemEntity.getImageUrl();
        ShopAndScanCouponEntity coupon = shopAndScanItemEntity.getCoupon();
        ShopAndScanCoupon shopAndScanCouponD = coupon != null ? d(coupon) : null;
        if (shopAndScanItemEntity.getException() != null) {
            timestamp = timestampJ;
            shopAndScanItemException = new ShopAndScanItemException(shopAndScanItemEntity.getException(), null);
        } else {
            timestamp = timestampJ;
        }
        return new ShopAndScanItem(itemTripId, itemId, remoteId, timestamp, fVarI, aVarB, aVarC, title, quantity, priceF, depositE, savingsH, imageUrl, shopAndScanCouponD, shopAndScanItemRestrictionG, shopAndScanItemException, isAddedToCart, isQuantityUpdateAllowed);
    }

    private static final Xp.a c(ShopAndScanItemEntity.Barcode barcode) {
        switch (C1897a.$EnumSwitchMapping$0[barcode.getType().ordinal()]) {
            case 1:
                return new a.UPCA(barcode.getData());
            case 2:
                return new a.UPCE(barcode.getData());
            case 3:
                return new a.NSC2(barcode.getData());
            case 4:
                return new a.EAN8(barcode.getData());
            case 5:
                return new a.EAN13(barcode.getData());
            case 6:
                return new a.CODE128(barcode.getData());
            case 7:
                return new a.PLU(barcode.getData());
            case 8:
                return new a.QR(barcode.getData());
            case 9:
                return new a.UNKNOWN(barcode.getData());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final ShopAndScanCoupon d(ShopAndScanCouponEntity shopAndScanCouponEntity) {
        return new ShopAndScanCoupon(shopAndScanCouponEntity.getOfferId(), shopAndScanCouponEntity.getCouponTitle(), shopAndScanCouponEntity.getDescription(), shopAndScanCouponEntity.getRedemptionStartDate(), shopAndScanCouponEntity.getRedemptionEndDate(), shopAndScanCouponEntity.getProductImageUrl(), shopAndScanCouponEntity.getIsClipped());
    }
}
