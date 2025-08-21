package Vh;

import bk.AbstractC6392a;
import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pk.EnumC16456b;
import pk.StoreDetails;
import wk.C17898a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpk/h;", "j$/time/LocalDateTime", "now", "LVh/e;", "a", "(Lpk/h;Lj$/time/LocalDateTime;)LVh/e;", "openTime", "closeTime", "currentTime", "", "d", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;)Ljava/lang/Boolean;", "", "c", "(Lj$/time/LocalDateTime;)Ljava/lang/String;", "", "stringResId", "Lbk/a;", "b", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;I)Lbk/a;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f {
    public static final AbstractC6392a b(LocalDateTime localDateTime, LocalDateTime localDateTime2, int i10) {
        String strC = localDateTime != null ? c(localDateTime) : null;
        String strC2 = localDateTime2 != null ? c(localDateTime2) : null;
        if (strC == null || strC.length() <= 0 || strC2 == null || strC2.length() <= 0) {
            return null;
        }
        return AbstractC6392a.INSTANCE.d(i10, strC, strC2);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayOfWeek.values().length];
            try {
                iArr[DayOfWeek.SATURDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayOfWeek.SUNDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StoreCardDecorator a(StoreDetails storeDetails, LocalDateTime now) {
        GasPriceItem gasPriceItem;
        GasPriceItem gasPriceItem2;
        Boolean bool;
        GasPriceItem gasPriceItem3;
        GasPriceItem gasPriceItem4;
        Intrinsics.j(storeDetails, "<this>");
        Intrinsics.j(now, "now");
        String name = storeDetails.getName();
        String str = name == null ? "" : name;
        int storeId = storeDetails.getStoreId();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int i10 = dayOfWeek == null ? -1 : a.$EnumSwitchMapping$0[dayOfWeek.ordinal()];
        AbstractC6392a abstractC6392aB = i10 != 1 ? i10 != 2 ? b(storeDetails.getStoreWeekdayOpen(), storeDetails.getStoreWeekDayClose(), Gh.h.f12823W4) : b(storeDetails.getStoreSundayOpen(), storeDetails.getStoreSundayClose(), Gh.h.f12823W4) : b(storeDetails.getStoreSaturdayOpen(), storeDetails.getStoreSaturdayClose(), Gh.h.f12823W4);
        DayOfWeek dayOfWeek2 = now.getDayOfWeek();
        int i11 = dayOfWeek2 == null ? -1 : a.$EnumSwitchMapping$0[dayOfWeek2.ordinal()];
        AbstractC6392a abstractC6392aB2 = i11 != 1 ? i11 != 2 ? b(storeDetails.getPharmacyWeekdayOpen(), storeDetails.getPharmacyWeekdayClose(), Gh.h.f12823W4) : b(storeDetails.getPharmacySunOpen(), storeDetails.getPharmacySunClose(), Gh.h.f12823W4) : b(storeDetails.getPharmacySatOpen(), storeDetails.getPharmacySatClose(), Gh.h.f12823W4);
        DayOfWeek dayOfWeek3 = now.getDayOfWeek();
        int i12 = dayOfWeek3 == null ? -1 : a.$EnumSwitchMapping$0[dayOfWeek3.ordinal()];
        AbstractC6392a abstractC6392aB3 = i12 != 1 ? i12 != 2 ? b(storeDetails.getPharmacyDriveThruWeekdayOpen(), storeDetails.getPharmacyDriveThruWeekdayClose(), Gh.h.f12823W4) : b(storeDetails.getPharmacyDriveThruSunOpen(), storeDetails.getPharmacyDriveThruSunClose(), Gh.h.f12823W4) : b(storeDetails.getPharmacyDriveThruSatOpen(), storeDetails.getPharmacyDriveThruSatClose(), Gh.h.f12823W4);
        DayOfWeek dayOfWeek4 = now.getDayOfWeek();
        int i13 = dayOfWeek4 == null ? -1 : a.$EnumSwitchMapping$0[dayOfWeek4.ordinal()];
        Boolean boolD = i13 != 1 ? i13 != 2 ? d(storeDetails.getPharmacyWeekdayOpen(), storeDetails.getPharmacyWeekdayClose(), now) : d(storeDetails.getPharmacySunOpen(), storeDetails.getPharmacySunClose(), now) : d(storeDetails.getPharmacySatOpen(), storeDetails.getPharmacySatClose(), now);
        DayOfWeek dayOfWeek5 = now.getDayOfWeek();
        int i14 = dayOfWeek5 == null ? -1 : a.$EnumSwitchMapping$0[dayOfWeek5.ordinal()];
        Boolean boolD2 = i14 != 1 ? i14 != 2 ? d(storeDetails.getPharmacyDriveThruWeekdayOpen(), storeDetails.getPharmacyDriveThruWeekdayClose(), now) : d(storeDetails.getPharmacyDriveThruSunOpen(), storeDetails.getPharmacyDriveThruSunClose(), now) : d(storeDetails.getPharmacyDriveThruSatOpen(), storeDetails.getPharmacyDriveThruSatClose(), now);
        DayOfWeek dayOfWeek6 = now.getDayOfWeek();
        int i15 = dayOfWeek6 != null ? a.$EnumSwitchMapping$0[dayOfWeek6.ordinal()] : -1;
        Boolean boolD3 = i15 != 1 ? i15 != 2 ? d(storeDetails.getStoreWeekdayOpen(), storeDetails.getStoreWeekDayClose(), now) : d(storeDetails.getStoreSundayOpen(), storeDetails.getStoreSundayClose(), now) : d(storeDetails.getStoreSaturdayOpen(), storeDetails.getStoreSaturdayClose(), now);
        EnumC16456b enumC16456b = EnumC16456b.f156604c;
        Double dI = storeDetails.i(enumC16456b);
        if (dI != null) {
            double dDoubleValue = dI.doubleValue();
            String fuelType = enumC16456b.getFuelType();
            if (fuelType == null) {
                fuelType = "";
            }
            gasPriceItem = new GasPriceItem(fuelType, Gk.g.f13088a.d(dDoubleValue));
        } else {
            gasPriceItem = null;
        }
        EnumC16456b enumC16456b2 = EnumC16456b.f156605d;
        Double dI2 = storeDetails.i(enumC16456b2);
        if (dI2 != null) {
            double dDoubleValue2 = dI2.doubleValue();
            String fuelType2 = enumC16456b2.getFuelType();
            if (fuelType2 == null) {
                fuelType2 = "";
            }
            gasPriceItem2 = new GasPriceItem(fuelType2, Gk.g.f13088a.d(dDoubleValue2));
        } else {
            gasPriceItem2 = null;
        }
        EnumC16456b enumC16456b3 = EnumC16456b.f156606e;
        Double dI3 = storeDetails.i(enumC16456b3);
        if (dI3 != null) {
            double dDoubleValue3 = dI3.doubleValue();
            String fuelType3 = enumC16456b3.getFuelType();
            if (fuelType3 == null) {
                fuelType3 = "";
            }
            bool = boolD3;
            gasPriceItem3 = new GasPriceItem(fuelType3, Gk.g.f13088a.d(dDoubleValue3));
        } else {
            bool = boolD3;
            gasPriceItem3 = null;
        }
        EnumC16456b enumC16456b4 = EnumC16456b.f156607f;
        Double dI4 = storeDetails.i(enumC16456b4);
        if (dI4 != null) {
            double dDoubleValue4 = dI4.doubleValue();
            String fuelType4 = enumC16456b4.getFuelType();
            gasPriceItem4 = new GasPriceItem(fuelType4 != null ? fuelType4 : "", Gk.g.f13088a.d(dDoubleValue4));
        } else {
            gasPriceItem4 = null;
        }
        return new StoreCardDecorator(str, storeId, abstractC6392aB, abstractC6392aB2, abstractC6392aB3, boolD, boolD2, bool, CollectionsKt.r(gasPriceItem, gasPriceItem2, gasPriceItem3, gasPriceItem4));
    }

    public static final String c(LocalDateTime localDateTime) {
        Intrinsics.j(localDateTime, "<this>");
        String str = localDateTime.format(C17898a.f167225a.B());
        Intrinsics.i(str, "format(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final Boolean d(LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3) {
        if (localDateTime == null || localDateTime2 == null) {
            return null;
        }
        return Boolean.valueOf((localDateTime3.isBefore(LocalDateTime.of(localDateTime3.l(), localDateTime.toLocalTime())) || localDateTime3.isAfter(LocalDateTime.of(localDateTime3.l(), localDateTime2.toLocalTime().minusSeconds(1L)))) ? false : true);
    }
}
