package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import Cs.MeijerAccount;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "", "<init>", "()V", "e", "d", "g", "f", "b", "a", "c", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class m {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "LCs/a;", "meijerAccount", "", "subscribeTexts", "subscribeEmails", "<init>", "(LCs/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCs/a;", "()LCs/a;", "b", "Z", "c", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$a, reason: from toString */
    public static final /* data */ class AccountCreated extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerAccount meijerAccount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean subscribeTexts;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean subscribeEmails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountCreated)) {
                return false;
            }
            AccountCreated accountCreated = (AccountCreated) other;
            return Intrinsics.e(this.meijerAccount, accountCreated.meijerAccount) && this.subscribeTexts == accountCreated.subscribeTexts && this.subscribeEmails == accountCreated.subscribeEmails;
        }

        public int hashCode() {
            return (((this.meijerAccount.hashCode() * 31) + Boolean.hashCode(this.subscribeTexts)) * 31) + Boolean.hashCode(this.subscribeEmails);
        }

        public String toString() {
            return "AccountCreated(meijerAccount=" + this.meijerAccount + ", subscribeTexts=" + this.subscribeTexts + ", subscribeEmails=" + this.subscribeEmails + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountCreated(MeijerAccount meijerAccount, boolean z10, boolean z11) {
            super(null);
            Intrinsics.j(meijerAccount, "meijerAccount");
            this.meijerAccount = meijerAccount;
            this.subscribeTexts = z10;
            this.subscribeEmails = z11;
        }

        /* renamed from: a, reason: from getter */
        public final MeijerAccount getMeijerAccount() {
            return this.meijerAccount;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getSubscribeEmails() {
            return this.subscribeEmails;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getSubscribeTexts() {
            return this.subscribeTexts;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f107107a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1355748001;
        }

        public String toString() {
            return "FailureToCreate";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "itemStates", "", "noOfStoresDisplayed", "", "toggleViewMore", "<init>", "(Ljava/util/List;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "getNoOfStoresDisplayed", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$c, reason: from toString */
    public static final /* data */ class LoadMoreStores extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d.StoreDetailsItemState> itemStates;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int noOfStoresDisplayed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean toggleViewMore;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreStores)) {
                return false;
            }
            LoadMoreStores loadMoreStores = (LoadMoreStores) other;
            return Intrinsics.e(this.itemStates, loadMoreStores.itemStates) && this.noOfStoresDisplayed == loadMoreStores.noOfStoresDisplayed && this.toggleViewMore == loadMoreStores.toggleViewMore;
        }

        public int hashCode() {
            return (((this.itemStates.hashCode() * 31) + Integer.hashCode(this.noOfStoresDisplayed)) * 31) + Boolean.hashCode(this.toggleViewMore);
        }

        public String toString() {
            return "LoadMoreStores(itemStates=" + this.itemStates + ", noOfStoresDisplayed=" + this.noOfStoresDisplayed + ", toggleViewMore=" + this.toggleViewMore + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreStores(List<d.StoreDetailsItemState> itemStates, int i10, boolean z10) {
            super(null);
            Intrinsics.j(itemStates, "itemStates");
            this.itemStates = itemStates;
            this.noOfStoresDisplayed = i10;
            this.toggleViewMore = z10;
        }

        public final List<d.StoreDetailsItemState> a() {
            return this.itemStates;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getToggleViewMore() {
            return this.toggleViewMore;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d extends m {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d;", "", "name", "", "distance", PlaceTypes.ADDRESS, "hours", "", "storeId", "city", "state", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "d", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "f", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$a, reason: from toString */
        public static final /* data */ class StoreDetailsItemState extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Double distance;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String address;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hours;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer storeId;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String city;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String state;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String zipCode;

            public StoreDetailsItemState(String str, Double d10, String str2, String str3, Integer num, String str4, String str5, String str6) {
                super(null);
                this.name = str;
                this.distance = d10;
                this.address = str2;
                this.hours = str3;
                this.storeId = num;
                this.city = str4;
                this.state = str5;
                this.zipCode = str6;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StoreDetailsItemState)) {
                    return false;
                }
                StoreDetailsItemState storeDetailsItemState = (StoreDetailsItemState) other;
                return Intrinsics.e(this.name, storeDetailsItemState.name) && Intrinsics.e(this.distance, storeDetailsItemState.distance) && Intrinsics.e(this.address, storeDetailsItemState.address) && Intrinsics.e(this.hours, storeDetailsItemState.hours) && Intrinsics.e(this.storeId, storeDetailsItemState.storeId) && Intrinsics.e(this.city, storeDetailsItemState.city) && Intrinsics.e(this.state, storeDetailsItemState.state) && Intrinsics.e(this.zipCode, storeDetailsItemState.zipCode);
            }

            public int hashCode() {
                String str = this.name;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Double d10 = this.distance;
                int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
                String str2 = this.address;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.hours;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.storeId;
                int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                String str4 = this.city;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.state;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.zipCode;
                return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
            }

            public String toString() {
                return "StoreDetailsItemState(name=" + this.name + ", distance=" + this.distance + ", address=" + this.address + ", hours=" + this.hours + ", storeId=" + this.storeId + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            /* renamed from: b, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* renamed from: c, reason: from getter */
            public final Double getDistance() {
                return this.distance;
            }

            /* renamed from: d, reason: from getter */
            public final String getHours() {
                return this.hours;
            }

            /* renamed from: e, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: f, reason: from getter */
            public final String getState() {
                return this.state;
            }

            /* renamed from: g, reason: from getter */
            public final Integer getStoreId() {
                return this.storeId;
            }

            /* renamed from: h, reason: from getter */
            public final String getZipCode() {
                return this.zipCode;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d;", "", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$d$a;", "itemStates", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.storeLocation.m$d$b, reason: from toString */
        public static final /* data */ class StoreListAdapterState extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<StoreDetailsItemState> itemStates;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StoreListAdapterState) && Intrinsics.e(this.itemStates, ((StoreListAdapterState) other).itemStates);
            }

            public int hashCode() {
                return this.itemStates.hashCode();
            }

            public String toString() {
                return "StoreListAdapterState(itemStates=" + this.itemStates + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoreListAdapterState(List<StoreDetailsItemState> itemStates) {
                super(null);
                Intrinsics.j(itemStates, "itemStates");
                this.itemStates = itemStates;
            }

            public final List<StoreDetailsItemState> a() {
                return this.itemStates;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final e f107120a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 590155162;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final f f107121a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 1879632091;
        }

        public String toString() {
            return "ManageAccountTransition";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/storeLocation/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class g extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final g f107122a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return 200133754;
        }

        public String toString() {
            return "StoreSelected";
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private m() {
    }
}
