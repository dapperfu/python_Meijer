package Wq;

import Vq.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pk.StoreDetails;
import pk.i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0016\u0017\u0011\u000f\u000b\u0018\u0015B-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LWq/a;", "", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "a", "Lpk/h;", "getStoreDetails", "()Lpk/h;", "b", "Lpk/i;", "c", "()Lpk/i;", "I", "()I", "d", "f", "e", "g", "LWq/a$a;", "LWq/a$b;", "LWq/a$c;", "LWq/a$d;", "LWq/a$e;", "LWq/a$f;", "LWq/a$g;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StoreDetails storeDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i storeSearchType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int labelNew;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$a;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "getStoreDetails", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class ChangePickupStore extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ ChangePickupStore(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, (i12 & 2) != 0 ? i.f156747e : iVar, (i12 & 4) != 0 ? c.f40151U : i10, (i12 & 8) != 0 ? c.f40151U : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangePickupStore)) {
                return false;
            }
            ChangePickupStore changePickupStore = (ChangePickupStore) other;
            return Intrinsics.e(this.storeDetails, changePickupStore.storeDetails) && this.storeSearchType == changePickupStore.storeSearchType && this.label == changePickupStore.label && this.labelNew == changePickupStore.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "ChangePickupStore(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangePickupStore(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$b;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "d", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$b, reason: from toString */
    public static final /* data */ class FindGasStation extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ FindGasStation(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40171h : i10, (i12 & 8) != 0 ? c.f40171h : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindGasStation)) {
                return false;
            }
            FindGasStation findGasStation = (FindGasStation) other;
            return Intrinsics.e(this.storeDetails, findGasStation.storeDetails) && this.storeSearchType == findGasStation.storeSearchType && this.label == findGasStation.label && this.labelNew == findGasStation.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        /* renamed from: d, reason: from getter */
        public StoreDetails getStoreDetails() {
            return this.storeDetails;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "FindGasStation(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FindGasStation(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$c;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "getStoreDetails", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$c, reason: from toString */
    public static final /* data */ class FindStore extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ FindStore(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40141K : i10, (i12 & 8) != 0 ? c.f40141K : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindStore)) {
                return false;
            }
            FindStore findStore = (FindStore) other;
            return Intrinsics.e(this.storeDetails, findStore.storeDetails) && this.storeSearchType == findStore.storeSearchType && this.label == findStore.label && this.labelNew == findStore.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "FindStore(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FindStore(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"LWq/a$d;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "", "phoneNumber", "<init>", "(Lpk/h;Lpk/i;IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "getStoreDetails", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "i", "Ljava/lang/String;", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$d, reason: from toString */
    public static final /* data */ class PhoneCall extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        public /* synthetic */ PhoneCall(StoreDetails storeDetails, i iVar, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40165e : i10, (i12 & 8) != 0 ? c.f40165e : i11, str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneCall)) {
                return false;
            }
            PhoneCall phoneCall = (PhoneCall) other;
            return Intrinsics.e(this.storeDetails, phoneCall.storeDetails) && this.storeSearchType == phoneCall.storeSearchType && this.label == phoneCall.label && this.labelNew == phoneCall.labelNew && Intrinsics.e(this.phoneNumber, phoneCall.phoneNumber);
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        /* renamed from: d, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return (((((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew)) * 31) + this.phoneNumber.hashCode();
        }

        public String toString() {
            return "PhoneCall(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ", phoneNumber=" + this.phoneNumber + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneCall(StoreDetails storeDetails, i storeSearchType, int i10, int i11, String phoneNumber) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            Intrinsics.j(phoneNumber, "phoneNumber");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
            this.phoneNumber = phoneNumber;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$e;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "d", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$e, reason: from toString */
    public static final /* data */ class SetCartStore extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ SetCartStore(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40153W : i10, (i12 & 8) != 0 ? c.f40154X : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetCartStore)) {
                return false;
            }
            SetCartStore setCartStore = (SetCartStore) other;
            return Intrinsics.e(this.storeDetails, setCartStore.storeDetails) && this.storeSearchType == setCartStore.storeSearchType && this.label == setCartStore.label && this.labelNew == setCartStore.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        /* renamed from: d, reason: from getter */
        public StoreDetails getStoreDetails() {
            return this.storeDetails;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "SetCartStore(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCartStore(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$f;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "d", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$f, reason: from toString */
    public static final /* data */ class SetHomeStore extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ SetHomeStore(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40142L : i10, (i12 & 8) != 0 ? c.f40154X : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetHomeStore)) {
                return false;
            }
            SetHomeStore setHomeStore = (SetHomeStore) other;
            return Intrinsics.e(this.storeDetails, setHomeStore.storeDetails) && this.storeSearchType == setHomeStore.storeSearchType && this.label == setHomeStore.label && this.labelNew == setHomeStore.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        /* renamed from: d, reason: from getter */
        public StoreDetails getStoreDetails() {
            return this.storeDetails;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "SetHomeStore(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetHomeStore(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"LWq/a$g;", "LWq/a;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "", "label", "labelNew", "<init>", "(Lpk/h;Lpk/i;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lpk/h;", "d", "()Lpk/h;", "f", "Lpk/i;", "c", "()Lpk/i;", "g", "I", "a", "h", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wq.a$g, reason: from toString */
    public static final /* data */ class ShowDirections extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails storeDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final i storeSearchType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int label;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelNew;

        public /* synthetic */ ShowDirections(StoreDetails storeDetails, i iVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(storeDetails, iVar, (i12 & 4) != 0 ? c.f40139I : i10, (i12 & 8) != 0 ? c.f40139I : i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowDirections)) {
                return false;
            }
            ShowDirections showDirections = (ShowDirections) other;
            return Intrinsics.e(this.storeDetails, showDirections.storeDetails) && this.storeSearchType == showDirections.storeSearchType && this.label == showDirections.label && this.labelNew == showDirections.labelNew;
        }

        @Override // Wq.a
        /* renamed from: a, reason: from getter */
        public int getLabel() {
            return this.label;
        }

        @Override // Wq.a
        /* renamed from: b, reason: from getter */
        public int getLabelNew() {
            return this.labelNew;
        }

        @Override // Wq.a
        /* renamed from: c, reason: from getter */
        public i getStoreSearchType() {
            return this.storeSearchType;
        }

        /* renamed from: d, reason: from getter */
        public StoreDetails getStoreDetails() {
            return this.storeDetails;
        }

        public int hashCode() {
            return (((((this.storeDetails.hashCode() * 31) + this.storeSearchType.hashCode()) * 31) + Integer.hashCode(this.label)) * 31) + Integer.hashCode(this.labelNew);
        }

        public String toString() {
            return "ShowDirections(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ", label=" + this.label + ", labelNew=" + this.labelNew + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDirections(StoreDetails storeDetails, i storeSearchType, int i10, int i11) {
            super(storeDetails, storeSearchType, i10, i11, null);
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(storeSearchType, "storeSearchType");
            this.storeDetails = storeDetails;
            this.storeSearchType = storeSearchType;
            this.label = i10;
            this.labelNew = i11;
        }
    }

    public /* synthetic */ a(StoreDetails storeDetails, i iVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storeDetails, iVar, i10, i11);
    }

    private a(StoreDetails storeDetails, i iVar, int i10, int i11) {
        this.storeDetails = storeDetails;
        this.storeSearchType = iVar;
        this.label = i10;
        this.labelNew = i11;
    }

    /* renamed from: a, reason: from getter */
    public int getLabel() {
        return this.label;
    }

    /* renamed from: b, reason: from getter */
    public int getLabelNew() {
        return this.labelNew;
    }

    /* renamed from: c, reason: from getter */
    public i getStoreSearchType() {
        return this.storeSearchType;
    }
}
