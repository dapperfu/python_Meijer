package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "", "<init>", "()V", "c", "b", "f", "d", "e", "g", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1585a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1585a f106221a = new C1585a();

        private C1585a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1585a);
        }

        public int hashCode() {
            return -2028404098;
        }

        public String toString() {
            return "CreateAccount";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "", "latitude", "longitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.a$b, reason: from toString */
    public static final /* data */ class FetchStoresWithLocationPermission extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double latitude;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double longitude;

        public FetchStoresWithLocationPermission(double d10, double d11) {
            super(null);
            this.latitude = d10;
            this.longitude = d11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchStoresWithLocationPermission)) {
                return false;
            }
            FetchStoresWithLocationPermission fetchStoresWithLocationPermission = (FetchStoresWithLocationPermission) other;
            return Double.compare(this.latitude, fetchStoresWithLocationPermission.latitude) == 0 && Double.compare(this.longitude, fetchStoresWithLocationPermission.longitude) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
        }

        public String toString() {
            return "FetchStoresWithLocationPermission(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "", "zipOrAddressOrCity", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.a$c, reason: from toString */
    public static final /* data */ class SearchWithZipOrAddress extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String zipOrAddressOrCity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchWithZipOrAddress) && Intrinsics.e(this.zipOrAddressOrCity, ((SearchWithZipOrAddress) other).zipOrAddressOrCity);
        }

        public int hashCode() {
            return this.zipOrAddressOrCity.hashCode();
        }

        public String toString() {
            return "SearchWithZipOrAddress(zipOrAddressOrCity=" + this.zipOrAddressOrCity + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchWithZipOrAddress(String zipOrAddressOrCity) {
            super(null);
            Intrinsics.j(zipOrAddressOrCity, "zipOrAddressOrCity");
            this.zipOrAddressOrCity = zipOrAddressOrCity;
        }

        /* renamed from: a, reason: from getter */
        public final String getZipOrAddressOrCity() {
            return this.zipOrAddressOrCity;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f106225a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1399477958;
        }

        public String toString() {
            return "SetStoreInformation";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "", "isLocationUsed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.a$e, reason: from toString */
    public static final /* data */ class TrackState extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLocationUsed;

        public TrackState(boolean z10) {
            super(null);
            this.isLocationUsed = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TrackState) && this.isLocationUsed == ((TrackState) other).isLocationUsed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocationUsed);
        }

        public String toString() {
            return "TrackState(isLocationUsed=" + this.isLocationUsed + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsLocationUsed() {
            return this.isLocationUsed;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", PlaceTypes.STORE, "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "()Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.a$f, reason: from toString */
    public static final /* data */ class UpdateSelectedStore extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m.d.StoreDetailsItemState store;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateSelectedStore) && Intrinsics.e(this.store, ((UpdateSelectedStore) other).store);
        }

        public int hashCode() {
            return this.store.hashCode();
        }

        public String toString() {
            return "UpdateSelectedStore(store=" + this.store + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSelectedStore(m.d.StoreDetailsItemState store) {
            super(null);
            Intrinsics.j(store, "store");
            this.store = store;
        }

        /* renamed from: a, reason: from getter */
        public final m.d.StoreDetailsItemState getStore() {
            return this.store;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f106228a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return 790542984;
        }

        public String toString() {
            return "ViewMoreStoresClicked";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
