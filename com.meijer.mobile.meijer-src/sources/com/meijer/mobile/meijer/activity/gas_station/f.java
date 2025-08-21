package com.meijer.mobile.meijer.activity.gas_station;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 :2\u00020\u0001:\u0004($ \"B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020'0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f;", "Landroidx/lifecycle/c0;", "LZq/b;", "storeInfoRepository", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "searchStoresCall", "Lyo/f;", "storeManager", "<init>", "(LZq/b;Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;Lyo/f;)V", "", "latitude", "longitude", "", "searchRadius", "", "w", "(DDI)V", "v", "()V", "", "isInProgress", "x", "(Z)V", "", "title", "y", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/gas_station/f$a;", "action", "u", "(Lcom/meijer/mobile/meijer/activity/gas_station/f$a;)V", "a", "LZq/b;", "b", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "c", "Lyo/f;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$d;", "d", "Lpv/B;", "_viewState", "Lpv/P;", "e", "Lpv/P;", "t", "()Lpv/P;", "viewState", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "f", "Lpv/A;", "_events", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class f extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f109971h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SearchStoresCall searchStoresCall;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<GasStationViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<GasStationViewState> viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c> _events;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$a;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/gas_station/f$a$a;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$a$a;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1664a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1664a f109978a = new C1664a();

            private C1664a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1664a);
            }

            public int hashCode() {
                return 399607046;
            }

            public String toString() {
                return "SearchGasStationNearbyHomeStore";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$a$b;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$a;", "", "latitude", "longitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$a$b, reason: from toString */
        public static final /* data */ class SearchNearbyGasStation extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double latitude;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double longitude;

            public SearchNearbyGasStation(double d10, double d11) {
                super(null);
                this.latitude = d10;
                this.longitude = d11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchNearbyGasStation)) {
                    return false;
                }
                SearchNearbyGasStation searchNearbyGasStation = (SearchNearbyGasStation) other;
                return Double.compare(this.latitude, searchNearbyGasStation.latitude) == 0 && Double.compare(this.longitude, searchNearbyGasStation.longitude) == 0;
            }

            public int hashCode() {
                return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
            }

            public String toString() {
                return "SearchNearbyGasStation(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
            }

            /* renamed from: a, reason: from getter */
            public final double getLatitude() {
                return this.latitude;
            }

            /* renamed from: b, reason: from getter */
            public final double getLongitude() {
                return this.longitude;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/gas_station/f$c$a;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$c$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$c$a;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "", "homeStoreId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHomeStoreId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$c$a, reason: from toString */
        public static final /* data */ class NavigateToFindAGasStation extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int homeStoreId;

            public NavigateToFindAGasStation(int i10) {
                super(null);
                this.homeStoreId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToFindAGasStation) && this.homeStoreId == ((NavigateToFindAGasStation) other).homeStoreId;
            }

            public int hashCode() {
                return Integer.hashCode(this.homeStoreId);
            }

            public String toString() {
                return "NavigateToFindAGasStation(homeStoreId=" + this.homeStoreId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$c$b;", "Lcom/meijer/mobile/meijer/activity/gas_station/f$c;", "", "storeId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$c$b, reason: from toString */
        public static final /* data */ class NavigateToGasStationDetails extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public NavigateToGasStationDetails(int i10) {
                super(null);
                this.storeId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToGasStationDetails) && this.storeId == ((NavigateToGasStationDetails) other).storeId;
            }

            public int hashCode() {
                return Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "NavigateToGasStationDetails(storeId=" + this.storeId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/gas_station/f$d;", "", "", "isLoading", "", "title", "<init>", "(ZLjava/lang/String;)V", "a", "(ZLjava/lang/String;)Lcom/meijer/mobile/meijer/activity/gas_station/f$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$d, reason: from toString */
    public static final /* data */ class GasStationViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public GasStationViewState() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ GasStationViewState b(GasStationViewState gasStationViewState, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = gasStationViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                str = gasStationViewState.title;
            }
            return gasStationViewState.a(z10, str);
        }

        public final GasStationViewState a(boolean isLoading, String title) {
            return new GasStationViewState(isLoading, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GasStationViewState)) {
                return false;
            }
            GasStationViewState gasStationViewState = (GasStationViewState) other;
            return this.isLoading == gasStationViewState.isLoading && Intrinsics.e(this.title, gasStationViewState.title);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            String str = this.title;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GasStationViewState(isLoading=" + this.isLoading + ", title=" + this.title + ')';
        }

        public GasStationViewState(boolean z10, String str) {
            this.isLoading = z10;
            this.title = str;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ GasStationViewState(boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailViewModel$searchGasStationNearbyHomeStore$1", f = "GasStationDetailViewModel.kt", l = {103, 115}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109985a;

        /* renamed from: b, reason: collision with root package name */
        Object f109986b;

        /* renamed from: c, reason: collision with root package name */
        Object f109987c;

        /* renamed from: d, reason: collision with root package name */
        Object f109988d;

        /* renamed from: e, reason: collision with root package name */
        int f109989e;

        /* renamed from: f, reason: collision with root package name */
        int f109990f;

        /* renamed from: g, reason: collision with root package name */
        int f109991g;

        /* renamed from: h, reason: collision with root package name */
        int f109992h;

        /* renamed from: i, reason: collision with root package name */
        int f109993i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109994j;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = f.this.new e(continuation);
            eVar.f109994j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.gas_station.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.gas_station.GasStationDetailViewModel$searchNearbyGasStation$1", f = "GasStationDetailViewModel.kt", l = {73, 86, 89, 92}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.gas_station.f$f, reason: collision with other inner class name */
    static final class C1665f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109996a;

        /* renamed from: b, reason: collision with root package name */
        Object f109997b;

        /* renamed from: c, reason: collision with root package name */
        Object f109998c;

        /* renamed from: d, reason: collision with root package name */
        Object f109999d;

        /* renamed from: e, reason: collision with root package name */
        int f110000e;

        /* renamed from: f, reason: collision with root package name */
        int f110001f;

        /* renamed from: g, reason: collision with root package name */
        int f110002g;

        /* renamed from: h, reason: collision with root package name */
        int f110003h;

        /* renamed from: i, reason: collision with root package name */
        int f110004i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110005j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ double f110007l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ double f110008m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f110009n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1665f(double d10, double d11, int i10, Continuation<? super C1665f> continuation) {
            super(2, continuation);
            this.f110007l = d10;
            this.f110008m = d11;
            this.f110009n = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1665f c1665f = f.this.new C1665f(this.f110007l, this.f110008m, this.f110009n, continuation);
            c1665f.f110005j = obj;
            return c1665f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1665f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0143 A[PHI: r0 r1
          0x0143: PHI (r0v14 java.lang.Object) = (r0v11 java.lang.Object), (r0v11 java.lang.Object), (r0v11 java.lang.Object), (r0v34 java.lang.Object) binds: [B:33:0x00c5, B:43:0x0140, B:40:0x011a, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]
          0x0143: PHI (r1v9 mv.O) = (r1v7 mv.O), (r1v7 mv.O), (r1v7 mv.O), (r1v16 mv.O) binds: [B:33:0x00c5, B:43:0x0140, B:40:0x011a, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.gas_station.f.C1665f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Zq.b storeInfoRepository, SearchStoresCall searchStoresCall, yo.f storeManager) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(searchStoresCall, "searchStoresCall");
        Intrinsics.j(storeManager, "storeManager");
        this.storeInfoRepository = storeInfoRepository;
        this.searchStoresCall = searchStoresCall;
        this.storeManager = storeManager;
        InterfaceC16549B<GasStationViewState> interfaceC16549BA = S.a(new GasStationViewState(false, null, 3, 0 == true ? 1 : 0));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this._events = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(boolean isInProgress) {
        GasStationViewState value;
        InterfaceC16549B<GasStationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, GasStationViewState.b(value, isInProgress, null, 2, null)));
    }

    public final InterfaceC16553F<c> getEvents() {
        return C16563h.b(this._events);
    }

    public final P<GasStationViewState> t() {
        return this.viewState;
    }

    public final void u(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.SearchNearbyGasStation) {
            x(true);
            a.SearchNearbyGasStation searchNearbyGasStation = (a.SearchNearbyGasStation) action;
            w(searchNearbyGasStation.getLatitude(), searchNearbyGasStation.getLongitude(), 50);
        } else {
            if (!Intrinsics.e(action, a.C1664a.f109978a)) {
                throw new NoWhenBranchMatchedException();
            }
            x(true);
            v();
        }
    }

    public final void y(String title) {
        GasStationViewState value;
        InterfaceC16549B<GasStationViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, GasStationViewState.b(value, false, title, 1, null)));
    }

    private final void v() {
        C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(double latitude, double longitude, int searchRadius) {
        C15809k.d(d0.a(this), null, null, new C1665f(latitude, longitude, searchRadius, null), 3, null);
    }
}
