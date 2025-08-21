package com.meijer.mobile.meijer.activity.find.filter;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/k;", "", "<init>", "()V", "", "a", "()Z", "seeResultsButtonIsEnabled", "b", "Lcom/meijer/mobile/meijer/activity/find/filter/k$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class k {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/k$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "", "seeResultsButtonIsEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.k$a, reason: from toString */
    public static final /* data */ class Loading extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean seeResultsButtonIsEnabled;

        public Loading() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.seeResultsButtonIsEnabled == ((Loading) other).seeResultsButtonIsEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.seeResultsButtonIsEnabled);
        }

        public String toString() {
            return "Loading(seeResultsButtonIsEnabled=" + this.seeResultsButtonIsEnabled + ')';
        }

        public Loading(boolean z10) {
            super(null);
            this.seeResultsButtonIsEnabled = z10;
        }

        @Override // com.meijer.mobile.meijer.activity.find.filter.k
        /* renamed from: a, reason: from getter */
        public boolean getSeeResultsButtonIsEnabled() {
            return this.seeResultsButtonIsEnabled;
        }

        public /* synthetic */ Loading(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "items", "", "topBarName", "", "isSortOnly", "seeResultsButtonIsEnabled", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "b", "(Ljava/util/List;Ljava/lang/String;ZZ)Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "c", "Z", "f", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.k$b, reason: from toString */
    public static final /* data */ class SortAndFilterPageState extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<s> items;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String topBarName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSortOnly;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean seeResultsButtonIsEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SortAndFilterPageState c(SortAndFilterPageState sortAndFilterPageState, List list, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = sortAndFilterPageState.items;
            }
            if ((i10 & 2) != 0) {
                str = sortAndFilterPageState.topBarName;
            }
            if ((i10 & 4) != 0) {
                z10 = sortAndFilterPageState.isSortOnly;
            }
            if ((i10 & 8) != 0) {
                z11 = sortAndFilterPageState.seeResultsButtonIsEnabled;
            }
            return sortAndFilterPageState.b(list, str, z10, z11);
        }

        public final SortAndFilterPageState b(List<? extends s> items, String topBarName, boolean isSortOnly, boolean seeResultsButtonIsEnabled) {
            Intrinsics.j(items, "items");
            return new SortAndFilterPageState(items, topBarName, isSortOnly, seeResultsButtonIsEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortAndFilterPageState)) {
                return false;
            }
            SortAndFilterPageState sortAndFilterPageState = (SortAndFilterPageState) other;
            return Intrinsics.e(this.items, sortAndFilterPageState.items) && Intrinsics.e(this.topBarName, sortAndFilterPageState.topBarName) && this.isSortOnly == sortAndFilterPageState.isSortOnly && this.seeResultsButtonIsEnabled == sortAndFilterPageState.seeResultsButtonIsEnabled;
        }

        public int hashCode() {
            int iHashCode = this.items.hashCode() * 31;
            String str = this.topBarName;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSortOnly)) * 31) + Boolean.hashCode(this.seeResultsButtonIsEnabled);
        }

        public String toString() {
            return "SortAndFilterPageState(items=" + this.items + ", topBarName=" + this.topBarName + ", isSortOnly=" + this.isSortOnly + ", seeResultsButtonIsEnabled=" + this.seeResultsButtonIsEnabled + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SortAndFilterPageState(List<? extends s> items, String str, boolean z10, boolean z11) {
            super(null);
            Intrinsics.j(items, "items");
            this.items = items;
            this.topBarName = str;
            this.isSortOnly = z10;
            this.seeResultsButtonIsEnabled = z11;
        }

        @Override // com.meijer.mobile.meijer.activity.find.filter.k
        /* renamed from: a, reason: from getter */
        public boolean getSeeResultsButtonIsEnabled() {
            return this.seeResultsButtonIsEnabled;
        }

        public final List<s> d() {
            return this.items;
        }

        /* renamed from: e, reason: from getter */
        public final String getTopBarName() {
            return this.topBarName;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsSortOnly() {
            return this.isSortOnly;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract boolean getSeeResultsButtonIsEnabled();

    private k() {
    }
}
