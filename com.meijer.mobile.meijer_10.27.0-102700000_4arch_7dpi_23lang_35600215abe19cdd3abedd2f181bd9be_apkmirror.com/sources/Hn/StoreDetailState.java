package Hn;

import In.DailySchedule;
import In.StoreHoursPresenter;
import Wq.a;
import ak.AbstractC5607a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.activity.home.legacy.view.FuelItem;
import com.meijer.mobile.serverapi.rxjava.observables.reward.FetchGasStationAndRewardsCall;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import ok.EnumC16091b;
import ok.GasStationAmenity;
import ok.GasStationHour;
import ok.StoreAuxUnitInfo;
import ok.StoreDetails;
import vk.C17590a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0001\u0010B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0007\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\b\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010,\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010/\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u0019\u00101\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b%\u0010)R\u0019\u00103\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b&\u0010)R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010;R\u0011\u0010>\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b=\u0010$R\u0011\u0010@\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b?\u0010\u0014R\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bE\u0010\u0014R\u0013\u0010G\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0011\u0010I\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bH\u0010$R\u0011\u0010K\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bJ\u00106R\u0013\u0010O\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001d\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09098F¢\u0006\u0006\u001a\u0004\b0\u0010;R\u0011\u0010R\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0011\u0010T\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bS\u0010\u0017¨\u0006U"}, d2 = {"LHn/J;", "", "Lok/h;", "storeDetails", "Lok/i;", "storeSearchType", "", "isFromGasStationDetails", "isNewAddressQualifierUIEnabled", "<init>", "(Lok/h;Lok/i;ZZ)V", "Lok/b;", "fuelType", "Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "f", "(Lok/b;Lok/h;)Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "a", "(Lok/h;Lok/i;ZZ)LHn/J;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lok/h;", "u", "()Lok/h;", "b", "Lok/i;", "w", "()Lok/i;", "c", "Z", "()Z", "d", "e", "Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "s", "()Lcom/meijer/mobile/meijer/activity/home/legacy/view/FuelItem;", "regularFuelPrice", "l", "midGradeFuelPrice", "g", "q", "premiumFuelPrice", "h", "dieselFuel", "i", "e85FuelPrice", "LIn/j;", "p", "()LIn/j;", "pharmacyHours", "gasStationHours", "", "Lok/d;", "()Ljava/util/List;", "gasStationAmenities", "x", "isGasStationOpen24Hours", "v", "storePhoneNumber", "", "o", "()Ljava/lang/CharSequence;", "pharmacyGasStationPhone", "m", "milesFrom", PlaceTypes.ADDRESS, "t", "showGasStationSection", "n", "pharmacyGasStationHours", "LWq/a;", "r", "()LWq/a;", "primaryAction", "gasStationAmenitiesGrid", "k", "gasStationPharmacyStoreHoursContentDescription", "j", "gasStationPharmacyPhoneNumberContentDescription", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Hn.J, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class StoreDetailState {

    /* renamed from: k, reason: collision with root package name */
    public static final int f12947k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails storeDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ok.i storeSearchType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromGasStationDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNewAddressQualifierUIEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FuelItem regularFuelPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final FuelItem midGradeFuelPrice;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FuelItem premiumFuelPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final FuelItem dieselFuel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final FuelItem e85FuelPrice;

    public StoreDetailState() {
        this(null, null, false, false, 15, null);
    }

    private final FuelItem f(EnumC16091b fuelType, StoreDetails storeDetails) {
        FuelItem fuelItem = null;
        Double dI = storeDetails != null ? storeDetails.i(fuelType) : null;
        if (dI != null && dI.doubleValue() > 0.0d) {
            String fuelType2 = fuelType.getFuelType();
            if (fuelType2 == null) {
                fuelType2 = "";
            }
            fuelItem = new FuelItem(fuelType2, dI.doubleValue());
        }
        return fuelItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreDetailState)) {
            return false;
        }
        StoreDetailState storeDetailState = (StoreDetailState) other;
        return Intrinsics.e(this.storeDetails, storeDetailState.storeDetails) && this.storeSearchType == storeDetailState.storeSearchType && this.isFromGasStationDetails == storeDetailState.isFromGasStationDetails && this.isNewAddressQualifierUIEnabled == storeDetailState.isNewAddressQualifierUIEnabled;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hn.J$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ok.i.values().length];
            try {
                iArr[ok.i.f153983a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ok.i.f153984b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ok.i.f153985c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ok.i.f153986d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ok.i.f153987e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoreDetailState(StoreDetails storeDetails, ok.i storeSearchType, boolean z10, boolean z11) {
        Intrinsics.j(storeSearchType, "storeSearchType");
        this.storeDetails = storeDetails;
        this.storeSearchType = storeSearchType;
        this.isFromGasStationDetails = z10;
        this.isNewAddressQualifierUIEnabled = z11;
        this.regularFuelPrice = f(EnumC16091b.f153844c, storeDetails);
        this.midGradeFuelPrice = f(EnumC16091b.f153845d, storeDetails);
        this.premiumFuelPrice = f(EnumC16091b.f153846e, storeDetails);
        this.dieselFuel = f(EnumC16091b.f153847f, storeDetails);
        this.e85FuelPrice = f(EnumC16091b.f153848g, storeDetails);
    }

    public static /* synthetic */ StoreDetailState b(StoreDetailState storeDetailState, StoreDetails storeDetails, ok.i iVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeDetails = storeDetailState.storeDetails;
        }
        if ((i10 & 2) != 0) {
            iVar = storeDetailState.storeSearchType;
        }
        if ((i10 & 4) != 0) {
            z10 = storeDetailState.isFromGasStationDetails;
        }
        if ((i10 & 8) != 0) {
            z11 = storeDetailState.isNewAddressQualifierUIEnabled;
        }
        return storeDetailState.a(storeDetails, iVar, z10, z11);
    }

    private final List<GasStationAmenity> g() {
        List<GasStationAmenity> gasStationAmenities = FetchGasStationAndRewardsCall.INSTANCE.getGasStationAmenities();
        if (this.storeSearchType != ok.i.f153983a) {
            gasStationAmenities = null;
        }
        return gasStationAmenities == null ? CollectionsKt.m() : gasStationAmenities;
    }

    private final StoreHoursPresenter i() {
        StoreHoursPresenter storeHoursPresenter;
        String lowerCase;
        String lowerCase2;
        String str;
        String str2;
        StoreDetails storeDetails = this.storeDetails;
        List<GasStationHour> listK = storeDetails != null ? storeDetails.k() : null;
        if (listK == null || listK.isEmpty() || x()) {
            return new StoreHoursPresenter(false, null, 3, null);
        }
        StoreDetails storeDetails2 = this.storeDetails;
        if (storeDetails2 != null) {
            List<GasStationHour> listK2 = storeDetails2.k();
            if (listK2 != null) {
                List<GasStationHour> list = listK2;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (GasStationHour gasStationHour : list) {
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    String dayOfTheWeek = gasStationHour.getDayOfTheWeek();
                    String str3 = "";
                    if (dayOfTheWeek == null) {
                        dayOfTheWeek = "";
                    }
                    AbstractC5607a abstractC5607aC = companion.c(dayOfTheWeek);
                    int i10 = Vq.c.f37752l;
                    LocalTime openTime = gasStationHour.getOpenTime();
                    if (openTime == null || (str2 = openTime.format(C17590a.f164803a.q())) == null) {
                        lowerCase = null;
                    } else {
                        Locale US = Locale.US;
                        Intrinsics.i(US, "US");
                        lowerCase = str2.toLowerCase(US);
                        Intrinsics.i(lowerCase, "toLowerCase(...)");
                    }
                    if (lowerCase == null) {
                        lowerCase = "";
                    }
                    LocalTime closeTime = gasStationHour.getCloseTime();
                    if (closeTime == null || (str = closeTime.format(C17590a.f164803a.q())) == null) {
                        lowerCase2 = null;
                    } else {
                        Locale US2 = Locale.US;
                        Intrinsics.i(US2, "US");
                        lowerCase2 = str.toLowerCase(US2);
                        Intrinsics.i(lowerCase2, "toLowerCase(...)");
                    }
                    if (lowerCase2 != null) {
                        str3 = lowerCase2;
                    }
                    arrayList.add(new DailySchedule(abstractC5607aC, companion.d(i10, lowerCase, str3)));
                }
                storeHoursPresenter = new StoreHoursPresenter(false, arrayList);
            } else {
                storeHoursPresenter = null;
            }
            if (storeHoursPresenter != null) {
                return storeHoursPresenter;
            }
        }
        return new StoreHoursPresenter(false, null, 3, null);
    }

    private final StoreHoursPresenter p() {
        LocalDateTime pharmacySunClose;
        LocalDateTime pharmacySunOpen;
        LocalDateTime pharmacySatClose;
        LocalDateTime pharmacySatOpen;
        LocalDateTime pharmacyWeekdayClose;
        LocalDateTime pharmacyWeekdayOpen;
        StoreDetails storeDetails = this.storeDetails;
        AbstractC5607a abstractC5607aD = this.isNewAddressQualifierUIEnabled ? AbstractC5607a.INSTANCE.d(Vq.c.f37722S, new Object[0]) : AbstractC5607a.INSTANCE.d(Vq.c.f37721R, new Object[0]);
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        String str = null;
        sb2.append((storeDetails == null || (pharmacyWeekdayOpen = storeDetails.getPharmacyWeekdayOpen()) == null) ? null : pharmacyWeekdayOpen.format(C17590a.f164803a.r()));
        sb2.append(" - ");
        sb2.append((storeDetails == null || (pharmacyWeekdayClose = storeDetails.getPharmacyWeekdayClose()) == null) ? null : pharmacyWeekdayClose.format(C17590a.f164803a.r()));
        DailySchedule dailySchedule = new DailySchedule(abstractC5607aD, companion.c(sb2.toString()));
        AbstractC5607a abstractC5607aD2 = this.isNewAddressQualifierUIEnabled ? companion.d(Vq.c.f37718O, new Object[0]) : companion.d(Vq.c.f37717N, new Object[0]);
        StringBuilder sb3 = new StringBuilder();
        sb3.append((storeDetails == null || (pharmacySatOpen = storeDetails.getPharmacySatOpen()) == null) ? null : pharmacySatOpen.format(C17590a.f164803a.r()));
        sb3.append(" - ");
        sb3.append((storeDetails == null || (pharmacySatClose = storeDetails.getPharmacySatClose()) == null) ? null : pharmacySatClose.format(C17590a.f164803a.r()));
        DailySchedule dailySchedule2 = new DailySchedule(abstractC5607aD2, companion.c(sb3.toString()));
        AbstractC5607a abstractC5607aD3 = this.isNewAddressQualifierUIEnabled ? companion.d(Vq.c.f37720Q, new Object[0]) : companion.d(Vq.c.f37719P, new Object[0]);
        StringBuilder sb4 = new StringBuilder();
        sb4.append((storeDetails == null || (pharmacySunOpen = storeDetails.getPharmacySunOpen()) == null) ? null : pharmacySunOpen.format(C17590a.f164803a.r()));
        sb4.append(" - ");
        if (storeDetails != null && (pharmacySunClose = storeDetails.getPharmacySunClose()) != null) {
            str = pharmacySunClose.format(C17590a.f164803a.r());
        }
        sb4.append(str);
        return new StoreHoursPresenter(false, CollectionsKt.p(dailySchedule, dailySchedule2, new DailySchedule(abstractC5607aD3, companion.c(sb4.toString()))));
    }

    public final StoreDetailState a(StoreDetails storeDetails, ok.i storeSearchType, boolean isFromGasStationDetails, boolean isNewAddressQualifierUIEnabled) {
        Intrinsics.j(storeSearchType, "storeSearchType");
        return new StoreDetailState(storeDetails, storeSearchType, isFromGasStationDetails, isNewAddressQualifierUIEnabled);
    }

    public final String c() {
        String zipCode;
        StoreDetails storeDetails;
        StoreAuxUnitInfo auxUnitInfo;
        String zipCode2;
        StoreAuxUnitInfo auxUnitInfo2;
        StoreAuxUnitInfo auxUnitInfo3;
        StoreAuxUnitInfo auxUnitInfo4;
        StoreAuxUnitInfo auxUnitInfo5;
        StoreAuxUnitInfo auxUnitInfo6;
        StoreAuxUnitInfo auxUnitInfo7;
        String strSubstring = null;
        if (this.storeSearchType == ok.i.f153983a && ((storeDetails = this.storeDetails) == null || !storeDetails.T())) {
            StoreDetails storeDetails2 = this.storeDetails;
            String address = (storeDetails2 == null || (auxUnitInfo7 = storeDetails2.getAuxUnitInfo()) == null) ? null : auxUnitInfo7.getAddress();
            if (address != null && address.length() != 0) {
                StoreDetails storeDetails3 = this.storeDetails;
                String city = (storeDetails3 == null || (auxUnitInfo6 = storeDetails3.getAuxUnitInfo()) == null) ? null : auxUnitInfo6.getCity();
                if (city != null && city.length() != 0) {
                    StoreDetails storeDetails4 = this.storeDetails;
                    String zipCode3 = (storeDetails4 == null || (auxUnitInfo5 = storeDetails4.getAuxUnitInfo()) == null) ? null : auxUnitInfo5.getZipCode();
                    if (zipCode3 != null && zipCode3.length() != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        StoreDetails storeDetails5 = this.storeDetails;
                        sb2.append((storeDetails5 == null || (auxUnitInfo4 = storeDetails5.getAuxUnitInfo()) == null) ? null : auxUnitInfo4.getAddress());
                        sb2.append(", ");
                        StoreDetails storeDetails6 = this.storeDetails;
                        sb2.append((storeDetails6 == null || (auxUnitInfo3 = storeDetails6.getAuxUnitInfo()) == null) ? null : auxUnitInfo3.getCity());
                        sb2.append(", ");
                        StoreDetails storeDetails7 = this.storeDetails;
                        sb2.append((storeDetails7 == null || (auxUnitInfo2 = storeDetails7.getAuxUnitInfo()) == null) ? null : auxUnitInfo2.getState());
                        sb2.append(' ');
                        StoreDetails storeDetails8 = this.storeDetails;
                        if (storeDetails8 != null && (auxUnitInfo = storeDetails8.getAuxUnitInfo()) != null && (zipCode2 = auxUnitInfo.getZipCode()) != null) {
                            strSubstring = zipCode2.substring(0, 5);
                            Intrinsics.i(strSubstring, "substring(...)");
                        }
                        sb2.append(strSubstring);
                        return sb2.toString();
                    }
                }
            }
            return null;
        }
        StoreDetails storeDetails9 = this.storeDetails;
        String streetAddress = storeDetails9 != null ? storeDetails9.getStreetAddress() : null;
        if (streetAddress != null && streetAddress.length() != 0) {
            StoreDetails storeDetails10 = this.storeDetails;
            String city2 = storeDetails10 != null ? storeDetails10.getCity() : null;
            if (city2 != null && city2.length() != 0) {
                StoreDetails storeDetails11 = this.storeDetails;
                String state = storeDetails11 != null ? storeDetails11.getState() : null;
                if (state != null && state.length() != 0) {
                    StoreDetails storeDetails12 = this.storeDetails;
                    String zipCode4 = storeDetails12 != null ? storeDetails12.getZipCode() : null;
                    if (zipCode4 != null && zipCode4.length() != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        StoreDetails storeDetails13 = this.storeDetails;
                        sb3.append(storeDetails13 != null ? storeDetails13.getStreetAddress() : null);
                        sb3.append(", ");
                        StoreDetails storeDetails14 = this.storeDetails;
                        sb3.append(storeDetails14 != null ? storeDetails14.getCity() : null);
                        sb3.append(", ");
                        StoreDetails storeDetails15 = this.storeDetails;
                        sb3.append(storeDetails15 != null ? storeDetails15.getState() : null);
                        sb3.append(' ');
                        StoreDetails storeDetails16 = this.storeDetails;
                        if (storeDetails16 != null && (zipCode = storeDetails16.getZipCode()) != null) {
                            strSubstring = zipCode.substring(0, 5);
                            Intrinsics.i(strSubstring, "substring(...)");
                        }
                        sb3.append(strSubstring);
                        return sb3.toString();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final FuelItem getDieselFuel() {
        return this.dieselFuel;
    }

    /* renamed from: e, reason: from getter */
    public final FuelItem getE85FuelPrice() {
        return this.e85FuelPrice;
    }

    public int hashCode() {
        StoreDetails storeDetails = this.storeDetails;
        return ((((((storeDetails == null ? 0 : storeDetails.hashCode()) * 31) + this.storeSearchType.hashCode()) * 31) + Boolean.hashCode(this.isFromGasStationDetails)) * 31) + Boolean.hashCode(this.isNewAddressQualifierUIEnabled);
    }

    public final int j() {
        return this.storeSearchType == ok.i.f153983a ? Vq.c.f37734c : Vq.c.f37736d;
    }

    public final int k() {
        return this.storeSearchType == ok.i.f153983a ? Vq.c.f37750k : Vq.c.f37716M;
    }

    /* renamed from: l, reason: from getter */
    public final FuelItem getMidGradeFuelPrice() {
        return this.midGradeFuelPrice;
    }

    public final String m() {
        Double milesFrom;
        StoreDetails storeDetails = this.storeDetails;
        if (storeDetails != null && (milesFrom = storeDetails.getMilesFrom()) != null) {
            double dDoubleValue = milesFrom.doubleValue();
            if (dDoubleValue > 0.0d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
                String str = String.format(Locale.US, "$.1f mi", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
                Intrinsics.i(str, "format(...)");
                return str;
            }
        }
        return null;
    }

    public final StoreHoursPresenter n() {
        return this.storeSearchType == ok.i.f153983a ? i() : p();
    }

    public final CharSequence o() {
        CharSequence charSequenceA;
        StoreDetails storeDetails;
        StoreAuxUnitInfo auxUnitInfo;
        if (this.storeSearchType != ok.i.f153983a || ((storeDetails = this.storeDetails) != null && storeDetails.T())) {
            StoreDetails storeDetails2 = this.storeDetails;
            charSequenceA = Ds.g.a(storeDetails2 != null ? storeDetails2.getPharmacyPhone() : null);
        } else {
            StoreDetails storeDetails3 = this.storeDetails;
            if (storeDetails3 != null && (auxUnitInfo = storeDetails3.getAuxUnitInfo()) != null) {
                phoneNumber = auxUnitInfo.getPhoneNumber();
            }
            charSequenceA = Ds.g.a(phoneNumber);
        }
        Intrinsics.g(charSequenceA);
        return charSequenceA;
    }

    /* renamed from: q, reason: from getter */
    public final FuelItem getPremiumFuelPrice() {
        return this.premiumFuelPrice;
    }

    public final Wq.a r() {
        StoreDetails storeDetails = this.storeDetails;
        if (storeDetails != null) {
            int i10 = b.$EnumSwitchMapping$0[this.storeSearchType.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new a.FindStore(storeDetails, this.storeSearchType, 0, 0, 12, null);
                }
                if (i10 == 3) {
                    return new a.SetHomeStore(storeDetails, this.storeSearchType, 0, 0, 12, null);
                }
                if (i10 == 4) {
                    return new a.ChangePickupStore(storeDetails, ok.i.f153987e, 0, 0, 12, null);
                }
                if (i10 == 5) {
                    return new a.SetCartStore(storeDetails, this.storeSearchType, 0, 0, 12, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            a.FindGasStation findGasStation = new a.FindGasStation(storeDetails, this.storeSearchType, 0, 0, 12, null);
            if (this.isFromGasStationDetails) {
                return findGasStation;
            }
        }
        return null;
    }

    /* renamed from: s, reason: from getter */
    public final FuelItem getRegularFuelPrice() {
        return this.regularFuelPrice;
    }

    public final boolean t() {
        return this.storeSearchType == ok.i.f153983a;
    }

    public String toString() {
        return "StoreDetailState(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", isFromGasStationDetails=" + this.isFromGasStationDetails + ", isNewAddressQualifierUIEnabled=" + this.isNewAddressQualifierUIEnabled + ')';
    }

    /* renamed from: u, reason: from getter */
    public final StoreDetails getStoreDetails() {
        return this.storeDetails;
    }

    public final String v() {
        CharSequence charSequenceA;
        StoreDetails storeDetails;
        StoreAuxUnitInfo auxUnitInfo;
        if (this.storeSearchType != ok.i.f153983a || ((storeDetails = this.storeDetails) != null && storeDetails.T())) {
            StoreDetails storeDetails2 = this.storeDetails;
            charSequenceA = Ds.g.a(storeDetails2 != null ? storeDetails2.getStorePhoneNumber() : null);
        } else {
            StoreDetails storeDetails3 = this.storeDetails;
            if (storeDetails3 != null && (auxUnitInfo = storeDetails3.getAuxUnitInfo()) != null) {
                phoneNumber = auxUnitInfo.getPhoneNumber();
            }
            charSequenceA = Ds.g.a(phoneNumber);
        }
        return charSequenceA.toString();
    }

    /* renamed from: w, reason: from getter */
    public final ok.i getStoreSearchType() {
        return this.storeSearchType;
    }

    public final boolean x() {
        Boolean boolValueOf;
        StoreDetails storeDetails = this.storeDetails;
        if (storeDetails != null) {
            boolean zH = true;
            if (storeDetails.T()) {
                zH = StringsKt.H(storeDetails.getStoreHours(), "24 hrs a day, 364 days a year.", true);
            } else {
                List<GasStationAmenity> listJ = storeDetails.j();
                if (listJ == null) {
                    listJ = CollectionsKt.m();
                }
                List<GasStationAmenity> list = listJ;
                if ((list instanceof Collection) && list.isEmpty()) {
                    zH = false;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.e(((GasStationAmenity) it.next()).getAmenityType(), "Open 24 Hrs")) {
                            break;
                        }
                    }
                    zH = false;
                }
            }
            boolValueOf = Boolean.valueOf(zH);
        } else {
            boolValueOf = null;
        }
        Boolean bool = this.storeSearchType == ok.i.f153983a ? boolValueOf : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final List<List<GasStationAmenity>> h() {
        return CollectionsKt.r1(g(), 2, 2, false, 4, null);
    }

    public /* synthetic */ StoreDetailState(StoreDetails storeDetails, ok.i iVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new StoreDetails(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null) : storeDetails, (i10 & 2) != 0 ? ok.i.f153985c : iVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) == 0 ? z11 : false);
    }
}
