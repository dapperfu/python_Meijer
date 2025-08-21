package Tp;

import Up.ShopAndScanCouponEntity;
import Z.C5603a;
import androidx.room.AbstractC6263g;
import androidx.room.AbstractC6265i;
import androidx.room.G;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import pv.InterfaceC16561f;
import s4.C17019j;
import w4.C17824b;
import w4.C17832j;
import w4.C17836n;
import w4.C17840r;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u001dH\u0096@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&H\u0016¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0096@¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b/\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00105¨\u00067"}, d2 = {"LTp/p;", "LTp/g;", "Landroidx/room/G;", "__db", "<init>", "(Landroidx/room/G;)V", "", "_value", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$c;", "r", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$c;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "s", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "p", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "q", "(Ljava/lang/String;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "LA4/b;", "_connection", "LZ/a;", "", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "_map", "", "t", "(LA4/b;LZ/a;)V", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "trip", "d", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entity", "c", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lpv/f;", "LTp/q;", "b", "()Lpv/f;", "tripId", "", "isIsCheckoutInProgress", "g", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/room/G;", "Landroidx/room/i;", "Landroidx/room/i;", "__insertAdapterOfShopAndScanTripEntity", "Landroidx/room/g;", "Landroidx/room/g;", "__updateAdapterOfShopAndScanTripEntity", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements g {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f36668e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G __db;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6265i<ShopAndScanTripEntity> __insertAdapterOfShopAndScanTripEntity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6263g<ShopAndScanTripEntity> __updateAdapterOfShopAndScanTripEntity;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Tp/p$a", "Landroidx/room/i;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "", "b", "()Ljava/lang/String;", "LA4/d;", "statement", "entity", "", "d", "(LA4/d;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends AbstractC6265i<ShopAndScanTripEntity> {
        @Override // androidx.room.AbstractC6265i
        protected String b() {
            return "INSERT OR REPLACE INTO `Trip` (`tripId`,`startTime`,`isGreenville`,`isCheckoutInProgress`,`digitalId`,`mPerksBarcode`,`id`,`name`,`zip`,`wasTotal`,`nowTotal`,`totalTax`,`totalSavings`,`totalPriceWithTax`,`mmaAppVersion`,`osVersion`,`phoneModel`,`storeId`,`transactionDateTime`,`transactionDateTimeUTC`,`eventTimeStamp`,`eventTimeStampUTC`,`deviceId`,`deviceOS`,`deviceAppVersion`,`deviceOSVersion`,`transactionStatus`,`transactionId`,`trackingId`,`transactionNumber`,`terminal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6265i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(A4.d statement, ShopAndScanTripEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.u0(1, entity.getTripId());
            statement.u0(2, entity.getStartTime());
            statement.C(3, entity.getIsGreenville() ? 1L : 0L);
            statement.C(4, entity.getIsCheckoutInProgress() ? 1L : 0L);
            ShopAndScanTripEntity.User user = entity.getUser();
            statement.C(5, user.getDigitalId());
            statement.u0(6, user.getMPerksBarcode());
            ShopAndScanTripEntity.Store store = entity.getStore();
            statement.C(7, store.getId());
            statement.u0(8, store.getName());
            statement.u0(9, store.getZip());
            ShopAndScanTripEntity.Cart cart = entity.getCart();
            statement.o(10, cart.getWasTotal());
            statement.o(11, cart.getNowTotal());
            statement.o(12, cart.getTotalTax());
            statement.o(13, cart.getTotalSavings());
            statement.o(14, cart.getTotalPriceWithTax());
            ShopAndScanTripEntity.Audit audit = entity.getAudit();
            statement.u0(15, audit.getMmaAppVersion());
            statement.u0(16, audit.getOsVersion());
            statement.u0(17, audit.getPhoneModel());
            ShopAndScanTripEntity.TransactionHeader header = entity.getHeader();
            if (header != null) {
                statement.C(18, header.getStoreId());
                statement.u0(19, header.getTransactionDateTime());
                statement.u0(20, header.getTransactionDateTimeUTC());
                statement.u0(21, header.getEventTimeStamp());
                statement.u0(22, header.getEventTimeStampUTC());
                statement.u0(23, header.getDeviceId());
                statement.u0(24, header.getDeviceOS());
                statement.u0(25, header.getDeviceAppVersion());
                statement.u0(26, header.getDeviceOSVersion());
                statement.u0(27, header.getTransactionStatus());
                statement.u0(28, header.getTransactionId());
                statement.u0(29, header.getTrackingId());
                statement.C(30, header.getTransactionNumber());
                statement.C(31, header.getTerminal());
                return;
            }
            statement.I(18);
            statement.I(19);
            statement.I(20);
            statement.I(21);
            statement.I(22);
            statement.I(23);
            statement.I(24);
            statement.I(25);
            statement.I(26);
            statement.I(27);
            statement.I(28);
            statement.I(29);
            statement.I(30);
            statement.I(31);
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Tp/p$b", "Landroidx/room/g;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "", "b", "()Ljava/lang/String;", "LA4/d;", "statement", "entity", "", "d", "(LA4/d;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends AbstractC6263g<ShopAndScanTripEntity> {
        @Override // androidx.room.AbstractC6263g
        protected String b() {
            return "UPDATE OR ABORT `Trip` SET `tripId` = ?,`startTime` = ?,`isGreenville` = ?,`isCheckoutInProgress` = ?,`digitalId` = ?,`mPerksBarcode` = ?,`id` = ?,`name` = ?,`zip` = ?,`wasTotal` = ?,`nowTotal` = ?,`totalTax` = ?,`totalSavings` = ?,`totalPriceWithTax` = ?,`mmaAppVersion` = ?,`osVersion` = ?,`phoneModel` = ?,`storeId` = ?,`transactionDateTime` = ?,`transactionDateTimeUTC` = ?,`eventTimeStamp` = ?,`eventTimeStampUTC` = ?,`deviceId` = ?,`deviceOS` = ?,`deviceAppVersion` = ?,`deviceOSVersion` = ?,`transactionStatus` = ?,`transactionId` = ?,`trackingId` = ?,`transactionNumber` = ?,`terminal` = ? WHERE `tripId` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6263g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(A4.d statement, ShopAndScanTripEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.u0(1, entity.getTripId());
            statement.u0(2, entity.getStartTime());
            statement.C(3, entity.getIsGreenville() ? 1L : 0L);
            statement.C(4, entity.getIsCheckoutInProgress() ? 1L : 0L);
            ShopAndScanTripEntity.User user = entity.getUser();
            statement.C(5, user.getDigitalId());
            statement.u0(6, user.getMPerksBarcode());
            ShopAndScanTripEntity.Store store = entity.getStore();
            statement.C(7, store.getId());
            statement.u0(8, store.getName());
            statement.u0(9, store.getZip());
            ShopAndScanTripEntity.Cart cart = entity.getCart();
            statement.o(10, cart.getWasTotal());
            statement.o(11, cart.getNowTotal());
            statement.o(12, cart.getTotalTax());
            statement.o(13, cart.getTotalSavings());
            statement.o(14, cart.getTotalPriceWithTax());
            ShopAndScanTripEntity.Audit audit = entity.getAudit();
            statement.u0(15, audit.getMmaAppVersion());
            statement.u0(16, audit.getOsVersion());
            statement.u0(17, audit.getPhoneModel());
            ShopAndScanTripEntity.TransactionHeader header = entity.getHeader();
            if (header != null) {
                statement.C(18, header.getStoreId());
                statement.u0(19, header.getTransactionDateTime());
                statement.u0(20, header.getTransactionDateTimeUTC());
                statement.u0(21, header.getEventTimeStamp());
                statement.u0(22, header.getEventTimeStampUTC());
                statement.u0(23, header.getDeviceId());
                statement.u0(24, header.getDeviceOS());
                statement.u0(25, header.getDeviceAppVersion());
                statement.u0(26, header.getDeviceOSVersion());
                statement.u0(27, header.getTransactionStatus());
                statement.u0(28, header.getTransactionId());
                statement.u0(29, header.getTrackingId());
                statement.C(30, header.getTransactionNumber());
                statement.C(31, header.getTerminal());
            } else {
                statement.I(18);
                statement.I(19);
                statement.I(20);
                statement.I(21);
                statement.I(22);
                statement.I(23);
                statement.I(24);
                statement.I(25);
                statement.I(26);
                statement.I(27);
                statement.I(28);
                statement.I(29);
                statement.I(30);
                statement.I(31);
            }
            statement.u0(32, entity.getTripId());
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LTp/p$c;", "", "<init>", "()V", "", "Lkotlin/reflect/KClass;", "a", "()Ljava/util/List;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tp.p$c, reason: from kotlin metadata */
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

    public p(G __db) {
        Intrinsics.j(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfShopAndScanTripEntity = new a();
        this.__updateAdapterOfShopAndScanTripEntity = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(p pVar, ShopAndScanTripEntity shopAndScanTripEntity, A4.b _connection) {
        Intrinsics.j(_connection, "_connection");
        pVar.__updateAdapterOfShopAndScanTripEntity.c(_connection, shopAndScanTripEntity);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(String str, boolean z10, String str2, A4.b _connection) {
        Intrinsics.j(_connection, "_connection");
        A4.d dVarS3 = _connection.S3(str);
        try {
            dVarS3.C(1, z10 ? 1L : 0L);
            dVarS3.u0(2, str2);
            dVarS3.N3();
            dVarS3.close();
            return Unit.f143329a;
        } catch (Throwable th2) {
            dVarS3.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(final A4.b _connection, C5603a<String, List<ShopAndScanItemEntity>> _map) {
        ShopAndScanItemEntity.Price price;
        ShopAndScanItemEntity.Deposit deposit;
        ShopAndScanItemEntity.Savings savings;
        int i10;
        ShopAndScanItemEntity.Restriction restriction;
        ShopAndScanCouponEntity shopAndScanCouponEntity;
        final p pVar = this;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i11 = 1;
        if (_map.getSize() > 999) {
            C17832j.a(_map, true, new Function1() { // from class: Tp.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.u(this.f36663a, _connection, (C5603a) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `itemId`,`source`,`remoteId`,`title`,`quantity`,`state`,`action`,`imageUrl`,`exception`,`isAddedToCart`,`isQuantityUpdateAllowed`,`itemTripId`,`timeAdded`,`timeUpdated`,`data`,`type`,`wasPrice`,`nowPrice`,`netPrice`,`netPriceWithDeposit`,`pricingText`,`unitDeposit`,`totalDeposit`,`unitSavings`,`totalSavings`,`restrictionTitle`,`restrictionMessage`,`isDismissed`,`offerId`,`couponTitle`,`description`,`redemptionStartDate`,`redemptionEndDate`,`productImageUrl`,`isClipped` FROM `Items` WHERE `itemTripId` IN (");
        C17840r.a(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        A4.d dVarS3 = _connection.S3(string);
        Iterator<String> it = setKeySet.iterator();
        int i12 = 1;
        while (it.hasNext()) {
            dVarS3.u0(i12, it.next());
            i12++;
        }
        try {
            int iC = C17836n.c(dVarS3, "itemTripId");
            if (iC == -1) {
                dVarS3.close();
                return;
            }
            while (dVarS3.N3()) {
                List<ShopAndScanItemEntity> list = _map.get(dVarS3.O2(iC));
                if (list != null) {
                    String strO2 = dVarS3.O2(0);
                    ShopAndScanItemEntity.c cVarR = dVarS3.isNull(i11) ? null : pVar.r(dVarS3.O2(i11));
                    String strO22 = dVarS3.isNull(2) ? null : dVarS3.O2(2);
                    String strO23 = dVarS3.O2(3);
                    int i13 = (int) dVarS3.getLong(4);
                    ShopAndScanItemEntity.h hVarS = pVar.s(dVarS3.O2(5));
                    ShopAndScanItemEntity.a aVarP = pVar.p(dVarS3.O2(6));
                    String strO24 = dVarS3.isNull(7) ? null : dVarS3.O2(7);
                    String strO25 = dVarS3.isNull(8) ? null : dVarS3.O2(8);
                    boolean z10 = ((int) dVarS3.getLong(9)) != 0 ? i11 : 0;
                    boolean z11 = ((int) dVarS3.getLong(10)) != 0 ? i11 : 0;
                    String strO26 = dVarS3.O2(11);
                    ShopAndScanItemEntity.Timestamp timestamp = new ShopAndScanItemEntity.Timestamp(dVarS3.O2(12), dVarS3.O2(13));
                    ShopAndScanItemEntity.Barcode barcode = new ShopAndScanItemEntity.Barcode(dVarS3.O2(14), pVar.q(dVarS3.O2(15)));
                    if (dVarS3.isNull(16) && dVarS3.isNull(17) && dVarS3.isNull(18) && dVarS3.isNull(19) && dVarS3.isNull(20)) {
                        price = null;
                    } else {
                        price = new ShopAndScanItemEntity.Price(dVarS3.isNull(16) ? null : Double.valueOf(dVarS3.getDouble(16)), dVarS3.isNull(17) ? null : Double.valueOf(dVarS3.getDouble(17)), dVarS3.isNull(18) ? null : Double.valueOf(dVarS3.getDouble(18)), dVarS3.isNull(19) ? null : Double.valueOf(dVarS3.getDouble(19)), dVarS3.isNull(20) ? null : dVarS3.O2(20));
                    }
                    if (dVarS3.isNull(21) && dVarS3.isNull(22)) {
                        deposit = null;
                    } else {
                        deposit = new ShopAndScanItemEntity.Deposit(dVarS3.isNull(21) ? null : Double.valueOf(dVarS3.getDouble(21)), dVarS3.isNull(22) ? null : Double.valueOf(dVarS3.getDouble(22)));
                    }
                    if (dVarS3.isNull(23) && dVarS3.isNull(24)) {
                        savings = null;
                    } else {
                        savings = new ShopAndScanItemEntity.Savings(dVarS3.isNull(23) ? null : Double.valueOf(dVarS3.getDouble(23)), dVarS3.isNull(24) ? null : Double.valueOf(dVarS3.getDouble(24)));
                    }
                    if (dVarS3.isNull(25) && dVarS3.isNull(26) && dVarS3.isNull(27)) {
                        i10 = iC;
                        restriction = null;
                    } else {
                        i10 = iC;
                        restriction = new ShopAndScanItemEntity.Restriction(dVarS3.O2(25), dVarS3.O2(26), ((int) dVarS3.getLong(27)) != 0);
                    }
                    if (dVarS3.isNull(28) && dVarS3.isNull(29) && dVarS3.isNull(30) && dVarS3.isNull(31) && dVarS3.isNull(32) && dVarS3.isNull(33) && dVarS3.isNull(34)) {
                        shopAndScanCouponEntity = null;
                    } else {
                        shopAndScanCouponEntity = new ShopAndScanCouponEntity(dVarS3.getLong(28), dVarS3.O2(29), dVarS3.O2(30), dVarS3.O2(31), dVarS3.O2(32), dVarS3.isNull(33) ? null : dVarS3.O2(33), ((int) dVarS3.getLong(34)) != 0);
                    }
                    list.add(new ShopAndScanItemEntity(strO2, timestamp, barcode, price, deposit, savings, restriction, shopAndScanCouponEntity, cVarR, strO22, strO23, i13, hVarS, aVarP, strO24, strO25, z10, z11, strO26));
                    pVar = this;
                    iC = i10;
                    i11 = 1;
                } else {
                    pVar = this;
                }
            }
            dVarS3.close();
        } catch (Throwable th2) {
            dVarS3.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(p pVar, A4.b bVar, C5603a _tmpMap) {
        Intrinsics.j(_tmpMap, "_tmpMap");
        pVar.t(bVar, _tmpMap);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(String str, A4.b _connection) {
        Intrinsics.j(_connection, "_connection");
        A4.d dVarS3 = _connection.S3(str);
        try {
            dVarS3.N3();
            dVarS3.close();
            return Unit.f143329a;
        } catch (Throwable th2) {
            dVarS3.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopAndScanTripEntity w(String str, A4.b _connection) {
        ShopAndScanTripEntity.User user;
        ShopAndScanTripEntity.Store store;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ShopAndScanTripEntity.Audit audit;
        ShopAndScanTripEntity.TransactionHeader transactionHeader;
        Intrinsics.j(_connection, "_connection");
        A4.d dVarS3 = _connection.S3(str);
        try {
            int iD = C17836n.d(dVarS3, "tripId");
            int iD2 = C17836n.d(dVarS3, "startTime");
            int iD3 = C17836n.d(dVarS3, "isGreenville");
            int iD4 = C17836n.d(dVarS3, "isCheckoutInProgress");
            int iD5 = C17836n.d(dVarS3, "digitalId");
            int iD6 = C17836n.d(dVarS3, "mPerksBarcode");
            int iD7 = C17836n.d(dVarS3, PreferencesHelper.PREF_ID);
            int iD8 = C17836n.d(dVarS3, "name");
            int iD9 = C17836n.d(dVarS3, "zip");
            int iD10 = C17836n.d(dVarS3, "wasTotal");
            int iD11 = C17836n.d(dVarS3, "nowTotal");
            int iD12 = C17836n.d(dVarS3, "totalTax");
            int iD13 = C17836n.d(dVarS3, "totalSavings");
            int iD14 = C17836n.d(dVarS3, "totalPriceWithTax");
            int iD15 = C17836n.d(dVarS3, "mmaAppVersion");
            int iD16 = C17836n.d(dVarS3, "osVersion");
            int iD17 = C17836n.d(dVarS3, "phoneModel");
            int iD18 = C17836n.d(dVarS3, "storeId");
            int iD19 = C17836n.d(dVarS3, "transactionDateTime");
            int iD20 = C17836n.d(dVarS3, "transactionDateTimeUTC");
            int iD21 = C17836n.d(dVarS3, "eventTimeStamp");
            int iD22 = C17836n.d(dVarS3, "eventTimeStampUTC");
            int iD23 = C17836n.d(dVarS3, "deviceId");
            int iD24 = C17836n.d(dVarS3, "deviceOS");
            int iD25 = C17836n.d(dVarS3, "deviceAppVersion");
            int iD26 = C17836n.d(dVarS3, "deviceOSVersion");
            int iD27 = C17836n.d(dVarS3, "transactionStatus");
            int iD28 = C17836n.d(dVarS3, "transactionId");
            int iD29 = C17836n.d(dVarS3, "trackingId");
            int iD30 = C17836n.d(dVarS3, "transactionNumber");
            int iD31 = C17836n.d(dVarS3, "terminal");
            ShopAndScanTripEntity shopAndScanTripEntity = null;
            if (dVarS3.N3()) {
                String strO2 = dVarS3.O2(iD);
                String strO22 = dVarS3.O2(iD2);
                boolean z10 = ((int) dVarS3.getLong(iD3)) != 0;
                boolean z11 = ((int) dVarS3.getLong(iD4)) != 0;
                ShopAndScanTripEntity.User user2 = new ShopAndScanTripEntity.User(dVarS3.getLong(iD5), dVarS3.O2(iD6));
                ShopAndScanTripEntity.Store store2 = new ShopAndScanTripEntity.Store((int) dVarS3.getLong(iD7), dVarS3.O2(iD8), dVarS3.O2(iD9));
                ShopAndScanTripEntity.Cart cart = new ShopAndScanTripEntity.Cart(dVarS3.getDouble(iD10), dVarS3.getDouble(iD11), dVarS3.getDouble(iD12), dVarS3.getDouble(iD13), dVarS3.getDouble(iD14));
                ShopAndScanTripEntity.Audit audit2 = new ShopAndScanTripEntity.Audit(dVarS3.O2(iD15), dVarS3.O2(iD16), dVarS3.O2(iD17));
                if (dVarS3.isNull(iD18)) {
                    i10 = iD19;
                    if (dVarS3.isNull(i10)) {
                        i11 = iD20;
                        if (dVarS3.isNull(i11)) {
                            i12 = iD21;
                            if (dVarS3.isNull(i12)) {
                                i13 = iD22;
                                if (dVarS3.isNull(i13)) {
                                    i14 = iD23;
                                    if (dVarS3.isNull(i14)) {
                                        i15 = iD24;
                                        if (dVarS3.isNull(i15)) {
                                            i16 = iD25;
                                            if (dVarS3.isNull(i16)) {
                                                i17 = iD26;
                                                if (dVarS3.isNull(i17)) {
                                                    i18 = iD27;
                                                    if (dVarS3.isNull(i18)) {
                                                        i19 = iD28;
                                                        if (dVarS3.isNull(i19)) {
                                                            user = user2;
                                                            i20 = iD29;
                                                            if (dVarS3.isNull(i20)) {
                                                                store = store2;
                                                                if (dVarS3.isNull(iD30) && dVarS3.isNull(iD31)) {
                                                                    audit = audit2;
                                                                    transactionHeader = null;
                                                                    shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                                                } else {
                                                                    iD30 = iD30;
                                                                }
                                                            } else {
                                                                store = store2;
                                                            }
                                                            audit = audit2;
                                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                                            shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                                        } else {
                                                            user = user2;
                                                            store = store2;
                                                            i20 = iD29;
                                                            audit = audit2;
                                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                                            shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                                        }
                                                    } else {
                                                        user = user2;
                                                        store = store2;
                                                        i19 = iD28;
                                                        i20 = iD29;
                                                        audit = audit2;
                                                        transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                                        shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                                    }
                                                } else {
                                                    user = user2;
                                                    store = store2;
                                                    i18 = iD27;
                                                    i19 = iD28;
                                                    i20 = iD29;
                                                    audit = audit2;
                                                    transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                                    shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                                }
                                            } else {
                                                user = user2;
                                                store = store2;
                                                i17 = iD26;
                                                i18 = iD27;
                                                i19 = iD28;
                                                i20 = iD29;
                                                audit = audit2;
                                                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                                shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                            }
                                        } else {
                                            user = user2;
                                            store = store2;
                                            i16 = iD25;
                                            i17 = iD26;
                                            i18 = iD27;
                                            i19 = iD28;
                                            i20 = iD29;
                                            audit = audit2;
                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                            shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                        }
                                    } else {
                                        user = user2;
                                        store = store2;
                                        i15 = iD24;
                                        i16 = iD25;
                                        i17 = iD26;
                                        i18 = iD27;
                                        i19 = iD28;
                                        i20 = iD29;
                                        audit = audit2;
                                        transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                        shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                    }
                                } else {
                                    user = user2;
                                    store = store2;
                                    i14 = iD23;
                                    i15 = iD24;
                                    i16 = iD25;
                                    i17 = iD26;
                                    i18 = iD27;
                                    i19 = iD28;
                                    i20 = iD29;
                                    audit = audit2;
                                    transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                    shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                                }
                            } else {
                                user = user2;
                                store = store2;
                                i13 = iD22;
                                i14 = iD23;
                                i15 = iD24;
                                i16 = iD25;
                                i17 = iD26;
                                i18 = iD27;
                                i19 = iD28;
                                i20 = iD29;
                                audit = audit2;
                                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                                shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                            }
                        } else {
                            user = user2;
                            store = store2;
                            i12 = iD21;
                            i13 = iD22;
                            i14 = iD23;
                            i15 = iD24;
                            i16 = iD25;
                            i17 = iD26;
                            i18 = iD27;
                            i19 = iD28;
                            i20 = iD29;
                            audit = audit2;
                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                            shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
                        }
                    } else {
                        user = user2;
                        store = store2;
                    }
                } else {
                    user = user2;
                    store = store2;
                    i10 = iD19;
                }
                i11 = iD20;
                i12 = iD21;
                i13 = iD22;
                i14 = iD23;
                i15 = iD24;
                i16 = iD25;
                i17 = iD26;
                i18 = iD27;
                i19 = iD28;
                i20 = iD29;
                audit = audit2;
                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(i20), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(iD31));
                shopAndScanTripEntity = new ShopAndScanTripEntity(strO2, user, store, cart, audit, transactionHeader, strO22, z10, z11);
            }
            dVarS3.close();
            return shopAndScanTripEntity;
        } catch (Throwable th2) {
            dVarS3.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(String str, A4.b _connection) {
        Intrinsics.j(_connection, "_connection");
        A4.d dVarS3 = _connection.S3(str);
        try {
            if (dVarS3.N3()) {
                return dVarS3.O2(0);
            }
            throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <kotlin.String>.");
        } finally {
            dVarS3.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopAndScanTripWithItems y(String str, p pVar, A4.b _connection) {
        ShopAndScanTripWithItems shopAndScanTripWithItems;
        ShopAndScanTripEntity.User user;
        ShopAndScanTripEntity.Store store;
        ShopAndScanTripEntity.Audit audit;
        C5603a<String, List<ShopAndScanItemEntity>> c5603a;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ShopAndScanTripEntity.TransactionHeader transactionHeader;
        Intrinsics.j(_connection, "_connection");
        A4.d dVarS3 = _connection.S3(str);
        try {
            int iD = C17836n.d(dVarS3, "tripId");
            int iD2 = C17836n.d(dVarS3, "startTime");
            int iD3 = C17836n.d(dVarS3, "isGreenville");
            int iD4 = C17836n.d(dVarS3, "isCheckoutInProgress");
            int iD5 = C17836n.d(dVarS3, "digitalId");
            int iD6 = C17836n.d(dVarS3, "mPerksBarcode");
            int iD7 = C17836n.d(dVarS3, PreferencesHelper.PREF_ID);
            int iD8 = C17836n.d(dVarS3, "name");
            int iD9 = C17836n.d(dVarS3, "zip");
            int iD10 = C17836n.d(dVarS3, "wasTotal");
            int iD11 = C17836n.d(dVarS3, "nowTotal");
            int iD12 = C17836n.d(dVarS3, "totalTax");
            int iD13 = C17836n.d(dVarS3, "totalSavings");
            int iD14 = C17836n.d(dVarS3, "totalPriceWithTax");
            int iD15 = C17836n.d(dVarS3, "mmaAppVersion");
            int iD16 = C17836n.d(dVarS3, "osVersion");
            int iD17 = C17836n.d(dVarS3, "phoneModel");
            int iD18 = C17836n.d(dVarS3, "storeId");
            int iD19 = C17836n.d(dVarS3, "transactionDateTime");
            int iD20 = C17836n.d(dVarS3, "transactionDateTimeUTC");
            int iD21 = C17836n.d(dVarS3, "eventTimeStamp");
            int iD22 = C17836n.d(dVarS3, "eventTimeStampUTC");
            int iD23 = C17836n.d(dVarS3, "deviceId");
            int iD24 = C17836n.d(dVarS3, "deviceOS");
            int iD25 = C17836n.d(dVarS3, "deviceAppVersion");
            int iD26 = C17836n.d(dVarS3, "deviceOSVersion");
            int iD27 = C17836n.d(dVarS3, "transactionStatus");
            int iD28 = C17836n.d(dVarS3, "transactionId");
            int iD29 = C17836n.d(dVarS3, "trackingId");
            int iD30 = C17836n.d(dVarS3, "transactionNumber");
            int iD31 = C17836n.d(dVarS3, "terminal");
            C5603a<String, List<ShopAndScanItemEntity>> c5603a2 = new C5603a<>();
            while (dVarS3.N3()) {
                int i21 = iD13;
                String strO2 = dVarS3.O2(iD);
                if (c5603a2.containsKey(strO2)) {
                    iD13 = i21;
                } else {
                    c5603a2.put(strO2, new ArrayList());
                    iD13 = i21;
                    iD12 = iD12;
                }
            }
            int i22 = iD12;
            int i23 = iD13;
            dVarS3.reset();
            pVar.t(_connection, c5603a2);
            if (dVarS3.N3()) {
                String strO22 = dVarS3.O2(iD);
                String strO23 = dVarS3.O2(iD2);
                boolean z10 = ((int) dVarS3.getLong(iD3)) != 0;
                boolean z11 = ((int) dVarS3.getLong(iD4)) != 0;
                ShopAndScanTripEntity.User user2 = new ShopAndScanTripEntity.User(dVarS3.getLong(iD5), dVarS3.O2(iD6));
                ShopAndScanTripEntity.Store store2 = new ShopAndScanTripEntity.Store((int) dVarS3.getLong(iD7), dVarS3.O2(iD8), dVarS3.O2(iD9));
                ShopAndScanTripEntity.Cart cart = new ShopAndScanTripEntity.Cart(dVarS3.getDouble(iD10), dVarS3.getDouble(iD11), dVarS3.getDouble(i22), dVarS3.getDouble(i23), dVarS3.getDouble(iD14));
                ShopAndScanTripEntity.Audit audit2 = new ShopAndScanTripEntity.Audit(dVarS3.O2(iD15), dVarS3.O2(iD16), dVarS3.O2(iD17));
                if (dVarS3.isNull(iD18)) {
                    i10 = iD19;
                    if (dVarS3.isNull(i10)) {
                        i11 = iD20;
                        if (dVarS3.isNull(i11)) {
                            i12 = iD21;
                            if (dVarS3.isNull(i12)) {
                                i13 = iD22;
                                if (dVarS3.isNull(i13)) {
                                    i14 = iD23;
                                    if (dVarS3.isNull(i14)) {
                                        i15 = iD24;
                                        if (dVarS3.isNull(i15)) {
                                            i16 = iD25;
                                            if (dVarS3.isNull(i16)) {
                                                i17 = iD26;
                                                if (dVarS3.isNull(i17)) {
                                                    i18 = iD27;
                                                    if (dVarS3.isNull(i18)) {
                                                        user = user2;
                                                        i19 = iD28;
                                                        if (dVarS3.isNull(i19)) {
                                                            store = store2;
                                                            if (dVarS3.isNull(iD29)) {
                                                                audit = audit2;
                                                                if (dVarS3.isNull(iD30)) {
                                                                    c5603a = c5603a2;
                                                                    i20 = iD31;
                                                                    if (dVarS3.isNull(i20)) {
                                                                        transactionHeader = null;
                                                                        ShopAndScanTripEntity shopAndScanTripEntity = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                                        Object objL = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                                        Intrinsics.i(objL, "getValue(...)");
                                                                        shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity, (List) objL);
                                                                    }
                                                                } else {
                                                                    c5603a = c5603a2;
                                                                    i20 = iD31;
                                                                }
                                                                iD29 = iD29;
                                                                iD30 = iD30;
                                                            } else {
                                                                audit = audit2;
                                                                c5603a = c5603a2;
                                                                i20 = iD31;
                                                                iD29 = iD29;
                                                            }
                                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                                            ShopAndScanTripEntity shopAndScanTripEntity2 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                            Object objL2 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                            Intrinsics.i(objL2, "getValue(...)");
                                                            shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity2, (List) objL2);
                                                        } else {
                                                            store = store2;
                                                            audit = audit2;
                                                            c5603a = c5603a2;
                                                            i20 = iD31;
                                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                                            ShopAndScanTripEntity shopAndScanTripEntity22 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                            Object objL22 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                            Intrinsics.i(objL22, "getValue(...)");
                                                            shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity22, (List) objL22);
                                                        }
                                                    } else {
                                                        user = user2;
                                                        store = store2;
                                                        audit = audit2;
                                                        c5603a = c5603a2;
                                                        i19 = iD28;
                                                        i20 = iD31;
                                                        transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                                        ShopAndScanTripEntity shopAndScanTripEntity222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                        Object objL222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                        Intrinsics.i(objL222, "getValue(...)");
                                                        shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity222, (List) objL222);
                                                    }
                                                } else {
                                                    user = user2;
                                                    store = store2;
                                                    audit = audit2;
                                                    c5603a = c5603a2;
                                                    i18 = iD27;
                                                    i19 = iD28;
                                                    i20 = iD31;
                                                    transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                                    ShopAndScanTripEntity shopAndScanTripEntity2222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                    Object objL2222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                    Intrinsics.i(objL2222, "getValue(...)");
                                                    shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity2222, (List) objL2222);
                                                }
                                            } else {
                                                user = user2;
                                                store = store2;
                                                audit = audit2;
                                                c5603a = c5603a2;
                                                i17 = iD26;
                                                i18 = iD27;
                                                i19 = iD28;
                                                i20 = iD31;
                                                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                                ShopAndScanTripEntity shopAndScanTripEntity22222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                                Object objL22222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                                Intrinsics.i(objL22222, "getValue(...)");
                                                shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity22222, (List) objL22222);
                                            }
                                        } else {
                                            user = user2;
                                            store = store2;
                                            audit = audit2;
                                            c5603a = c5603a2;
                                            i16 = iD25;
                                            i17 = iD26;
                                            i18 = iD27;
                                            i19 = iD28;
                                            i20 = iD31;
                                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                            ShopAndScanTripEntity shopAndScanTripEntity222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                            Object objL222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                            Intrinsics.i(objL222222, "getValue(...)");
                                            shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity222222, (List) objL222222);
                                        }
                                    } else {
                                        user = user2;
                                        store = store2;
                                        audit = audit2;
                                        c5603a = c5603a2;
                                        i15 = iD24;
                                        i16 = iD25;
                                        i17 = iD26;
                                        i18 = iD27;
                                        i19 = iD28;
                                        i20 = iD31;
                                        transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                        ShopAndScanTripEntity shopAndScanTripEntity2222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                        Object objL2222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                        Intrinsics.i(objL2222222, "getValue(...)");
                                        shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity2222222, (List) objL2222222);
                                    }
                                } else {
                                    user = user2;
                                    store = store2;
                                    audit = audit2;
                                    c5603a = c5603a2;
                                    i14 = iD23;
                                    i15 = iD24;
                                    i16 = iD25;
                                    i17 = iD26;
                                    i18 = iD27;
                                    i19 = iD28;
                                    i20 = iD31;
                                    transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                    ShopAndScanTripEntity shopAndScanTripEntity22222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                    Object objL22222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                    Intrinsics.i(objL22222222, "getValue(...)");
                                    shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity22222222, (List) objL22222222);
                                }
                            } else {
                                user = user2;
                                store = store2;
                                audit = audit2;
                                c5603a = c5603a2;
                                i13 = iD22;
                                i14 = iD23;
                                i15 = iD24;
                                i16 = iD25;
                                i17 = iD26;
                                i18 = iD27;
                                i19 = iD28;
                                i20 = iD31;
                                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                                ShopAndScanTripEntity shopAndScanTripEntity222222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                                Object objL222222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                                Intrinsics.i(objL222222222, "getValue(...)");
                                shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity222222222, (List) objL222222222);
                            }
                        } else {
                            user = user2;
                            store = store2;
                            audit = audit2;
                            c5603a = c5603a2;
                            i12 = iD21;
                            i13 = iD22;
                            i14 = iD23;
                            i15 = iD24;
                            i16 = iD25;
                            i17 = iD26;
                            i18 = iD27;
                            i19 = iD28;
                            i20 = iD31;
                            transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                            ShopAndScanTripEntity shopAndScanTripEntity2222222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                            Object objL2222222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                            Intrinsics.i(objL2222222222, "getValue(...)");
                            shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity2222222222, (List) objL2222222222);
                        }
                    } else {
                        user = user2;
                        store = store2;
                        audit = audit2;
                        c5603a = c5603a2;
                    }
                } else {
                    user = user2;
                    store = store2;
                    audit = audit2;
                    c5603a = c5603a2;
                    i10 = iD19;
                }
                i11 = iD20;
                i12 = iD21;
                i13 = iD22;
                i14 = iD23;
                i15 = iD24;
                i16 = iD25;
                i17 = iD26;
                i18 = iD27;
                i19 = iD28;
                i20 = iD31;
                transactionHeader = new ShopAndScanTripEntity.TransactionHeader((int) dVarS3.getLong(iD18), dVarS3.O2(i10), dVarS3.O2(i11), dVarS3.O2(i12), dVarS3.O2(i13), dVarS3.O2(i14), dVarS3.O2(i15), dVarS3.O2(i16), dVarS3.O2(i17), dVarS3.O2(i18), dVarS3.O2(i19), dVarS3.O2(iD29), (int) dVarS3.getLong(iD30), (int) dVarS3.getLong(i20));
                ShopAndScanTripEntity shopAndScanTripEntity22222222222 = new ShopAndScanTripEntity(strO22, user, store, cart, audit, transactionHeader, strO23, z10, z11);
                Object objL22222222222 = MapsKt.l(c5603a, dVarS3.O2(iD));
                Intrinsics.i(objL22222222222, "getValue(...)");
                shopAndScanTripWithItems = new ShopAndScanTripWithItems(shopAndScanTripEntity22222222222, (List) objL22222222222);
            } else {
                shopAndScanTripWithItems = null;
            }
            dVarS3.close();
            return shopAndScanTripWithItems;
        } catch (Throwable th2) {
            dVarS3.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(p pVar, ShopAndScanTripEntity shopAndScanTripEntity, A4.b _connection) {
        Intrinsics.j(_connection, "_connection");
        pVar.__insertAdapterOfShopAndScanTripEntity.c(_connection, shopAndScanTripEntity);
        return Unit.f143329a;
    }

    @Override // Tp.g
    public Object a(Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM Trip";
        Object objF = C17824b.f(this.__db, false, true, new Function1() { // from class: Tp.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.v(str, (A4.b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    @Override // Tp.g
    public InterfaceC16561f<ShopAndScanTripWithItems> b() {
        final String str = "SELECT * FROM Trip";
        return C17019j.a(this.__db, true, new String[]{"Items", "Trip"}, new Function1() { // from class: Tp.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.y(str, this, (A4.b) obj);
            }
        });
    }

    @Override // Tp.g
    public Object c(final ShopAndScanTripEntity shopAndScanTripEntity, Continuation<? super Unit> continuation) {
        Object objF = C17824b.f(this.__db, false, true, new Function1() { // from class: Tp.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.A(this.f36659a, shopAndScanTripEntity, (A4.b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    @Override // Tp.g
    public Object d(final ShopAndScanTripEntity shopAndScanTripEntity, Continuation<? super Unit> continuation) {
        Object objF = C17824b.f(this.__db, false, true, new Function1() { // from class: Tp.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.z(this.f36665a, shopAndScanTripEntity, (A4.b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
    }

    @Override // Tp.g
    public Object e(Continuation<? super String> continuation) {
        final String str = "SELECT tripId FROM Trip";
        return C17824b.f(this.__db, true, false, new Function1() { // from class: Tp.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.x(str, (A4.b) obj);
            }
        }, continuation);
    }

    @Override // Tp.g
    public Object f(Continuation<? super ShopAndScanTripEntity> continuation) {
        final String str = "SELECT * FROM Trip";
        return C17824b.f(this.__db, true, false, new Function1() { // from class: Tp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.w(str, (A4.b) obj);
            }
        }, continuation);
    }

    @Override // Tp.g
    public Object g(final String str, final boolean z10, Continuation<? super Unit> continuation) {
        final String str2 = "UPDATE Trip SET isCheckoutInProgress = ? WHERE tripId = ?";
        Object objF = C17824b.f(this.__db, false, true, new Function1() { // from class: Tp.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.B(str2, z10, str, (A4.b) obj);
            }
        }, continuation);
        return objF == IntrinsicsKt.f() ? objF : Unit.f143329a;
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
    private final ShopAndScanItemEntity.a p(String _value) {
        switch (_value.hashCode()) {
            case -1881281404:
                if (_value.equals("REMOVE")) {
                    return ShopAndScanItemEntity.a.f117753b;
                }
                break;
            case -1785516855:
                if (_value.equals("UPDATE")) {
                    return ShopAndScanItemEntity.a.f117754c;
                }
                break;
            case 64641:
                if (_value.equals("ADD")) {
                    return ShopAndScanItemEntity.a.f117752a;
                }
                break;
            case 2242516:
                if (_value.equals("IDLE")) {
                    return ShopAndScanItemEntity.a.f117755d;
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
    private final ShopAndScanItemEntity.Barcode.a q(String _value) {
        switch (_value.hashCode()) {
            case 2593:
                if (_value.equals("QR")) {
                    return ShopAndScanItemEntity.Barcode.a.f117767h;
                }
                break;
            case 79321:
                if (_value.equals("PLU")) {
                    return ShopAndScanItemEntity.Barcode.a.f117766g;
                }
                break;
            case 2120518:
                if (_value.equals("EAN8")) {
                    return ShopAndScanItemEntity.Barcode.a.f117763d;
                }
                break;
            case 2405588:
                if (_value.equals("NSC2")) {
                    return ShopAndScanItemEntity.Barcode.a.f117762c;
                }
                break;
            case 2611257:
                if (_value.equals("UPCA")) {
                    return ShopAndScanItemEntity.Barcode.a.f117760a;
                }
                break;
            case 2611261:
                if (_value.equals("UPCE")) {
                    return ShopAndScanItemEntity.Barcode.a.f117761b;
                }
                break;
            case 65735892:
                if (_value.equals("EAN13")) {
                    return ShopAndScanItemEntity.Barcode.a.f117764e;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return ShopAndScanItemEntity.Barcode.a.f117768i;
                }
                break;
            case 1659811114:
                if (_value.equals("CODE128")) {
                    return ShopAndScanItemEntity.Barcode.a.f117765f;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    private final ShopAndScanItemEntity.c r(String _value) {
        int iHashCode = _value.hashCode();
        if (iHashCode != -2008257171) {
            if (iHashCode != -1533221995) {
                if (iHashCode == 167852591 && _value.equals("GREENVILLE")) {
                    return ShopAndScanItemEntity.c.f117773c;
                }
            } else if (_value.equals("LIGHTNING_CART")) {
                return ShopAndScanItemEntity.c.f117772b;
            }
        } else if (_value.equals("CENTRAL_SERVER")) {
            return ShopAndScanItemEntity.c.f117771a;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }

    private final ShopAndScanItemEntity.h s(String _value) {
        int iHashCode = _value.hashCode();
        if (iHashCode != -1834164102) {
            if (iHashCode != -1024508089) {
                if (iHashCode == 66247144 && _value.equals("ERROR")) {
                    return ShopAndScanItemEntity.h.f117790c;
                }
            } else if (_value.equals("SYNCING")) {
                return ShopAndScanItemEntity.h.f117788a;
            }
        } else if (_value.equals("SYNCED")) {
            return ShopAndScanItemEntity.h.f117789b;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
