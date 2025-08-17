package Tp;

import Up.ShopAndScanCouponEntity;
import androidx.room.AbstractC6123i;
import androidx.room.G;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import w4.C17754b;
import z4.InterfaceC18380b;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH\u0096@¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\bH\u0096@¢\u0006\u0004\b&\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u0006+"}, d2 = {"LTp/f;", "LTp/a;", "Landroidx/room/G;", "__db", "<init>", "(Landroidx/room/G;)V", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$c;", "_value", "", "m", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$c;)Ljava/lang/String;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "o", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;)Ljava/lang/String;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "i", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;)Ljava/lang/String;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "k", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$c;", "p", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "j", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "l", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "item", "", "b", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PreferencesHelper.PREF_ID, "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "barcode", "c", "d", "Landroidx/room/G;", "Landroidx/room/i;", "Landroidx/room/i;", "__insertAdapterOfShopAndScanItemEntity", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements Tp.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35299d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G __db;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6123i<ShopAndScanItemEntity> __insertAdapterOfShopAndScanItemEntity;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Tp/f$a", "Landroidx/room/i;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "", "b", "()Ljava/lang/String;", "Lz4/d;", "statement", "entity", "", "d", "(Lz4/d;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends AbstractC6123i<ShopAndScanItemEntity> {
        a() {
        }

        @Override // androidx.room.AbstractC6123i
        protected String b() {
            return "INSERT OR REPLACE INTO `Items` (`itemId`,`source`,`remoteId`,`title`,`quantity`,`state`,`action`,`imageUrl`,`exception`,`isAddedToCart`,`isQuantityUpdateAllowed`,`itemTripId`,`timeAdded`,`timeUpdated`,`data`,`type`,`wasPrice`,`nowPrice`,`netPrice`,`netPriceWithDeposit`,`pricingText`,`unitDeposit`,`totalDeposit`,`unitSavings`,`totalSavings`,`restrictionTitle`,`restrictionMessage`,`isDismissed`,`offerId`,`couponTitle`,`description`,`redemptionStartDate`,`redemptionEndDate`,`productImageUrl`,`isClipped`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6123i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC18382d statement, ShopAndScanItemEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.u0(1, entity.getItemId());
            ShopAndScanItemEntity.c source = entity.getSource();
            if (source == null) {
                statement.I(2);
            } else {
                statement.u0(2, f.this.m(source));
            }
            String remoteId = entity.getRemoteId();
            if (remoteId == null) {
                statement.I(3);
            } else {
                statement.u0(3, remoteId);
            }
            statement.u0(4, entity.getTitle());
            statement.C(5, entity.getQuantity());
            statement.u0(6, f.this.o(entity.getState()));
            statement.u0(7, f.this.i(entity.getAction()));
            String imageUrl = entity.getImageUrl();
            if (imageUrl == null) {
                statement.I(8);
            } else {
                statement.u0(8, imageUrl);
            }
            String exception = entity.getException();
            if (exception == null) {
                statement.I(9);
            } else {
                statement.u0(9, exception);
            }
            statement.C(10, entity.getIsAddedToCart() ? 1L : 0L);
            statement.C(11, entity.getIsQuantityUpdateAllowed() ? 1L : 0L);
            statement.u0(12, entity.getItemTripId());
            ShopAndScanItemEntity.Timestamp timestamps = entity.getTimestamps();
            statement.u0(13, timestamps.getTimeAdded());
            statement.u0(14, timestamps.getTimeUpdated());
            ShopAndScanItemEntity.Barcode barcode = entity.getBarcode();
            statement.u0(15, barcode.getData());
            statement.u0(16, f.this.k(barcode.getType()));
            ShopAndScanItemEntity.Price price = entity.getPrice();
            if (price != null) {
                Double wasPrice = price.getWasPrice();
                if (wasPrice == null) {
                    statement.I(17);
                } else {
                    statement.o(17, wasPrice.doubleValue());
                }
                Double nowPrice = price.getNowPrice();
                if (nowPrice == null) {
                    statement.I(18);
                } else {
                    statement.o(18, nowPrice.doubleValue());
                }
                Double netPrice = price.getNetPrice();
                if (netPrice == null) {
                    statement.I(19);
                } else {
                    statement.o(19, netPrice.doubleValue());
                }
                Double netPriceWithDeposit = price.getNetPriceWithDeposit();
                if (netPriceWithDeposit == null) {
                    statement.I(20);
                } else {
                    statement.o(20, netPriceWithDeposit.doubleValue());
                }
                String pricingText = price.getPricingText();
                if (pricingText == null) {
                    statement.I(21);
                } else {
                    statement.u0(21, pricingText);
                }
            } else {
                statement.I(17);
                statement.I(18);
                statement.I(19);
                statement.I(20);
                statement.I(21);
            }
            ShopAndScanItemEntity.Deposit deposit = entity.getDeposit();
            if (deposit != null) {
                Double unitDeposit = deposit.getUnitDeposit();
                if (unitDeposit == null) {
                    statement.I(22);
                } else {
                    statement.o(22, unitDeposit.doubleValue());
                }
                Double totalDeposit = deposit.getTotalDeposit();
                if (totalDeposit == null) {
                    statement.I(23);
                } else {
                    statement.o(23, totalDeposit.doubleValue());
                }
            } else {
                statement.I(22);
                statement.I(23);
            }
            ShopAndScanItemEntity.Savings savings = entity.getSavings();
            if (savings != null) {
                Double unitSavings = savings.getUnitSavings();
                if (unitSavings == null) {
                    statement.I(24);
                } else {
                    statement.o(24, unitSavings.doubleValue());
                }
                Double totalSavings = savings.getTotalSavings();
                if (totalSavings == null) {
                    statement.I(25);
                } else {
                    statement.o(25, totalSavings.doubleValue());
                }
            } else {
                statement.I(24);
                statement.I(25);
            }
            ShopAndScanItemEntity.Restriction restriction = entity.getRestriction();
            if (restriction != null) {
                statement.u0(26, restriction.getRestrictionTitle());
                statement.u0(27, restriction.getRestrictionMessage());
                statement.C(28, restriction.getIsDismissed() ? 1L : 0L);
            } else {
                statement.I(26);
                statement.I(27);
                statement.I(28);
            }
            ShopAndScanCouponEntity coupon = entity.getCoupon();
            if (coupon == null) {
                statement.I(29);
                statement.I(30);
                statement.I(31);
                statement.I(32);
                statement.I(33);
                statement.I(34);
                statement.I(35);
                return;
            }
            statement.C(29, coupon.getOfferId());
            statement.u0(30, coupon.getCouponTitle());
            statement.u0(31, coupon.getDescription());
            statement.u0(32, coupon.getRedemptionStartDate());
            statement.u0(33, coupon.getRedemptionEndDate());
            String productImageUrl = coupon.getProductImageUrl();
            if (productImageUrl == null) {
                statement.I(34);
            } else {
                statement.u0(34, productImageUrl);
            }
            statement.C(35, coupon.getIsClipped() ? 1L : 0L);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LTp/f$b;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "a", "()Ljava/util/List;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tp.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> a() {
            return CollectionsKt.m();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ShopAndScanItemEntity.c.values().length];
            try {
                iArr[ShopAndScanItemEntity.c.f116826a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopAndScanItemEntity.c.f116827b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopAndScanItemEntity.c.f116828c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShopAndScanItemEntity.h.values().length];
            try {
                iArr2[ShopAndScanItemEntity.h.f116843a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShopAndScanItemEntity.h.f116844b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShopAndScanItemEntity.h.f116845c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ShopAndScanItemEntity.a.values().length];
            try {
                iArr3[ShopAndScanItemEntity.a.f116807a.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f116808b.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f116809c.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ShopAndScanItemEntity.a.f116810d.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ShopAndScanItemEntity.Barcode.a.values().length];
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116815a.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116816b.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116817c.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116818d.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116819e.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116820f.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116821g.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116822h.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ShopAndScanItemEntity.Barcode.a.f116823i.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public f(G __db) {
        Intrinsics.j(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfShopAndScanItemEntity = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(ShopAndScanItemEntity.a _value) {
        int i10 = c.$EnumSwitchMapping$2[_value.ordinal()];
        if (i10 == 1) {
            return "ADD";
        }
        if (i10 == 2) {
            return "REMOVE";
        }
        if (i10 == 3) {
            return "UPDATE";
        }
        if (i10 == 4) {
            return "IDLE";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(ShopAndScanItemEntity.Barcode.a _value) {
        switch (c.$EnumSwitchMapping$3[_value.ordinal()]) {
            case 1:
                return "UPCA";
            case 2:
                return "UPCE";
            case 3:
                return "NSC2";
            case 4:
                return "EAN8";
            case 5:
                return "EAN13";
            case 6:
                return "CODE128";
            case 7:
                return "PLU";
            case 8:
                return "QR";
            case 9:
                return "UNKNOWN";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m(ShopAndScanItemEntity.c _value) {
        int i10 = c.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 == 1) {
            return "CENTRAL_SERVER";
        }
        if (i10 == 2) {
            return "LIGHTNING_CART";
        }
        if (i10 == 3) {
            return "GREENVILLE";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(ShopAndScanItemEntity.h _value) {
        int i10 = c.$EnumSwitchMapping$1[_value.ordinal()];
        if (i10 == 1) {
            return "SYNCING";
        }
        if (i10 == 2) {
            return "SYNCED";
        }
        if (i10 == 3) {
            return "ERROR";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, String str2, InterfaceC18380b _connection) {
        Intrinsics.j(_connection, "_connection");
        InterfaceC18382d interfaceC18382dS3 = _connection.S3(str);
        try {
            interfaceC18382dS3.u0(1, str2);
            interfaceC18382dS3.N3();
            interfaceC18382dS3.close();
            return Unit.f142422a;
        } catch (Throwable th2) {
            interfaceC18382dS3.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c4 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02da A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0316 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0374 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fe A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0210 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0222 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0234 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0246 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029a A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0119, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126), top: B:156:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity v(java.lang.String r57, java.lang.String r58, Tp.f r59, z4.InterfaceC18380b r60) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Tp.f.v(java.lang.String, java.lang.String, Tp.f, z4.b):com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c4 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02da A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0316 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0374 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fe A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0210 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0222 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0234 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0246 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0284 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029a A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3 A[Catch: all -> 0x01e6, TryCatch #0 {all -> 0x01e6, blocks: (B:3:0x0012, B:5:0x0117, B:9:0x0130, B:13:0x013f, B:17:0x0167, B:21:0x0176, B:25:0x0183, B:29:0x018f, B:31:0x01bf, B:33:0x01c7, B:35:0x01cf, B:37:0x01d7, B:48:0x01f5, B:52:0x0207, B:56:0x0219, B:60:0x022b, B:64:0x023d, B:68:0x024c, B:69:0x0254, B:71:0x025a, B:77:0x026a, B:81:0x027b, B:85:0x028c, B:86:0x0294, B:88:0x029a, B:94:0x02aa, B:98:0x02bb, B:102:0x02cc, B:103:0x02d4, B:105:0x02da, B:107:0x02e2, B:114:0x02f6, B:118:0x0308, B:119:0x0310, B:121:0x0316, B:123:0x031e, B:125:0x0326, B:127:0x032e, B:129:0x0336, B:131:0x033e, B:150:0x0391, B:140:0x0357, B:144:0x0379, B:149:0x0388, B:143:0x0374, B:101:0x02c4, B:97:0x02b3, B:84:0x0284, B:80:0x0273, B:67:0x0246, B:63:0x0234, B:59:0x0222, B:55:0x0210, B:51:0x01fe, B:20:0x0170, B:16:0x0161, B:12:0x0139, B:8:0x0126, B:153:0x03a0, B:154:0x03a7), top: B:157:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity w(java.lang.String r56, java.lang.String r57, Tp.f r58, z4.InterfaceC18380b r59) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Tp.f.w(java.lang.String, java.lang.String, Tp.f, z4.b):com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(f fVar, ShopAndScanItemEntity shopAndScanItemEntity, InterfaceC18380b _connection) {
        Intrinsics.j(_connection, "_connection");
        fVar.__insertAdapterOfShopAndScanItemEntity.c(_connection, shopAndScanItemEntity);
        return Unit.f142422a;
    }

    @Override // Tp.a
    public Object a(final String str, Continuation<? super ShopAndScanItemEntity> continuation) {
        final String str2 = "SELECT * FROM Items WHERE itemId = ?";
        return C17754b.f(this.__db, true, false, new Function1() { // from class: Tp.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.w(str2, str, this, (InterfaceC18380b) obj);
            }
        }, continuation);
    }

    @Override // Tp.a
    public Object b(final ShopAndScanItemEntity shopAndScanItemEntity, Continuation<? super Unit> continuation) {
        Object objF = C17754b.f(this.__db, false, true, new Function1() { // from class: Tp.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.x(this.f35288a, shopAndScanItemEntity, (InterfaceC18380b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f142422a;
    }

    @Override // Tp.a
    public Object c(final String str, Continuation<? super ShopAndScanItemEntity> continuation) {
        final String str2 = "SELECT * FROM Items WHERE data = ?";
        return C17754b.f(this.__db, true, false, new Function1() { // from class: Tp.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.v(str2, str, this, (InterfaceC18380b) obj);
            }
        }, continuation);
    }

    @Override // Tp.a
    public Object d(final String str, Continuation<? super Unit> continuation) {
        final String str2 = "DELETE FROM Items WHERE itemId = ?";
        Object objF = C17754b.f(this.__db, false, true, new Function1() { // from class: Tp.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.u(str2, str, (InterfaceC18380b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f142422a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final ShopAndScanItemEntity.a j(String _value) {
        switch (_value.hashCode()) {
            case -1881281404:
                if (_value.equals("REMOVE")) {
                    return ShopAndScanItemEntity.a.f116808b;
                }
                break;
            case -1785516855:
                if (_value.equals("UPDATE")) {
                    return ShopAndScanItemEntity.a.f116809c;
                }
                break;
            case 64641:
                if (_value.equals("ADD")) {
                    return ShopAndScanItemEntity.a.f116807a;
                }
                break;
            case 2242516:
                if (_value.equals("IDLE")) {
                    return ShopAndScanItemEntity.a.f116810d;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final ShopAndScanItemEntity.Barcode.a l(String _value) {
        switch (_value.hashCode()) {
            case 2593:
                if (_value.equals("QR")) {
                    return ShopAndScanItemEntity.Barcode.a.f116822h;
                }
                break;
            case 79321:
                if (_value.equals("PLU")) {
                    return ShopAndScanItemEntity.Barcode.a.f116821g;
                }
                break;
            case 2120518:
                if (_value.equals("EAN8")) {
                    return ShopAndScanItemEntity.Barcode.a.f116818d;
                }
                break;
            case 2405588:
                if (_value.equals("NSC2")) {
                    return ShopAndScanItemEntity.Barcode.a.f116817c;
                }
                break;
            case 2611257:
                if (_value.equals("UPCA")) {
                    return ShopAndScanItemEntity.Barcode.a.f116815a;
                }
                break;
            case 2611261:
                if (_value.equals("UPCE")) {
                    return ShopAndScanItemEntity.Barcode.a.f116816b;
                }
                break;
            case 65735892:
                if (_value.equals("EAN13")) {
                    return ShopAndScanItemEntity.Barcode.a.f116819e;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return ShopAndScanItemEntity.Barcode.a.f116823i;
                }
                break;
            case 1659811114:
                if (_value.equals("CODE128")) {
                    return ShopAndScanItemEntity.Barcode.a.f116820f;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    private final ShopAndScanItemEntity.c n(String _value) {
        int iHashCode = _value.hashCode();
        if (iHashCode != -2008257171) {
            if (iHashCode != -1533221995) {
                if (iHashCode == 167852591 && _value.equals("GREENVILLE")) {
                    return ShopAndScanItemEntity.c.f116828c;
                }
            } else if (_value.equals("LIGHTNING_CART")) {
                return ShopAndScanItemEntity.c.f116827b;
            }
        } else if (_value.equals("CENTRAL_SERVER")) {
            return ShopAndScanItemEntity.c.f116826a;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    private final ShopAndScanItemEntity.h p(String _value) {
        int iHashCode = _value.hashCode();
        if (iHashCode != -1834164102) {
            if (iHashCode != -1024508089) {
                if (iHashCode == 66247144 && _value.equals("ERROR")) {
                    return ShopAndScanItemEntity.h.f116845c;
                }
            } else if (_value.equals("SYNCING")) {
                return ShopAndScanItemEntity.h.f116843a;
            }
        } else if (_value.equals("SYNCED")) {
            return ShopAndScanItemEntity.h.f116844b;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
