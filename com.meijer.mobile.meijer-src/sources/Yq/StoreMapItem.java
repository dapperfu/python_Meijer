package Yq;

import Jr.IndicatorIcon;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pk.StoreDetails;
import pk.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b1\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b9\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b6\u0010@¨\u0006A"}, d2 = {"LYq/d;", "", "", "index", "Lpk/h;", PlaceTypes.STORE, "preferredStore", "homeStore", "cartStore", "Lpk/i;", "searchType", "Lbk/a;", "name", "addressLine1", "addressLine2", "", "markerId", "", "isPreferredStore", "LYq/e;", "marker", "LJr/a;", "indicatorIcon", "<init>", "(ILpk/h;Lpk/h;Lpk/h;Lpk/h;Lpk/i;Lbk/a;Lbk/a;Lbk/a;Ljava/lang/String;ZLYq/e;LJr/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "i", "b", "Lpk/h;", "o", "()Lpk/h;", "c", "getPreferredStore", "d", "getHomeStore", "e", "getCartStore", "f", "Lpk/i;", "n", "()Lpk/i;", "g", "Lbk/a;", "m", "()Lbk/a;", "h", "j", "Ljava/lang/String;", "l", "k", "Z", "p", "()Z", "LYq/e;", "()LYq/e;", "LJr/a;", "()LJr/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Yq.d, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StoreMapItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails preferredStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails homeStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails cartStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final i searchType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a name;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a addressLine1;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a addressLine2;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String markerId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPreferredStore;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreMarker marker;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final IndicatorIcon indicatorIcon;

    public StoreMapItem(int i10, StoreDetails store, StoreDetails storeDetails, StoreDetails storeDetails2, StoreDetails storeDetails3, i searchType, AbstractC6392a name, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String markerId, boolean z10, StoreMarker marker, IndicatorIcon indicatorIcon) {
        Intrinsics.j(store, "store");
        Intrinsics.j(searchType, "searchType");
        Intrinsics.j(name, "name");
        Intrinsics.j(markerId, "markerId");
        Intrinsics.j(marker, "marker");
        this.index = i10;
        this.store = store;
        this.preferredStore = storeDetails;
        this.homeStore = storeDetails2;
        this.cartStore = storeDetails3;
        this.searchType = searchType;
        this.name = name;
        this.addressLine1 = abstractC6392a;
        this.addressLine2 = abstractC6392a2;
        this.markerId = markerId;
        this.isPreferredStore = z10;
        this.marker = marker;
        this.indicatorIcon = indicatorIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreMapItem)) {
            return false;
        }
        StoreMapItem storeMapItem = (StoreMapItem) other;
        return this.index == storeMapItem.index && Intrinsics.e(this.store, storeMapItem.store) && Intrinsics.e(this.preferredStore, storeMapItem.preferredStore) && Intrinsics.e(this.homeStore, storeMapItem.homeStore) && Intrinsics.e(this.cartStore, storeMapItem.cartStore) && this.searchType == storeMapItem.searchType && Intrinsics.e(this.name, storeMapItem.name) && Intrinsics.e(this.addressLine1, storeMapItem.addressLine1) && Intrinsics.e(this.addressLine2, storeMapItem.addressLine2) && Intrinsics.e(this.markerId, storeMapItem.markerId) && this.isPreferredStore == storeMapItem.isPreferredStore && Intrinsics.e(this.marker, storeMapItem.marker) && Intrinsics.e(this.indicatorIcon, storeMapItem.indicatorIcon);
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6392a getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6392a getAddressLine2() {
        return this.addressLine2;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.index) * 31) + this.store.hashCode()) * 31;
        StoreDetails storeDetails = this.preferredStore;
        int iHashCode2 = (iHashCode + (storeDetails == null ? 0 : storeDetails.hashCode())) * 31;
        StoreDetails storeDetails2 = this.homeStore;
        int iHashCode3 = (iHashCode2 + (storeDetails2 == null ? 0 : storeDetails2.hashCode())) * 31;
        StoreDetails storeDetails3 = this.cartStore;
        int iHashCode4 = (((((iHashCode3 + (storeDetails3 == null ? 0 : storeDetails3.hashCode())) * 31) + this.searchType.hashCode()) * 31) + this.name.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.addressLine1;
        int iHashCode5 = (iHashCode4 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.addressLine2;
        int iHashCode6 = (((((((iHashCode5 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31) + this.markerId.hashCode()) * 31) + Boolean.hashCode(this.isPreferredStore)) * 31) + this.marker.hashCode()) * 31;
        IndicatorIcon indicatorIcon = this.indicatorIcon;
        return iHashCode6 + (indicatorIcon != null ? indicatorIcon.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: j, reason: from getter */
    public final IndicatorIcon getIndicatorIcon() {
        return this.indicatorIcon;
    }

    /* renamed from: k, reason: from getter */
    public final StoreMarker getMarker() {
        return this.marker;
    }

    /* renamed from: l, reason: from getter */
    public final String getMarkerId() {
        return this.markerId;
    }

    /* renamed from: m, reason: from getter */
    public final AbstractC6392a getName() {
        return this.name;
    }

    /* renamed from: n, reason: from getter */
    public final i getSearchType() {
        return this.searchType;
    }

    /* renamed from: o, reason: from getter */
    public final StoreDetails getStore() {
        return this.store;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsPreferredStore() {
        return this.isPreferredStore;
    }

    public String toString() {
        return "StoreMapItem(index=" + this.index + ", store=" + this.store + ", preferredStore=" + this.preferredStore + ", homeStore=" + this.homeStore + ", cartStore=" + this.cartStore + ", searchType=" + this.searchType + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", markerId=" + this.markerId + ", isPreferredStore=" + this.isPreferredStore + ", marker=" + this.marker + ", indicatorIcon=" + this.indicatorIcon + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StoreMapItem(int r17, pk.StoreDetails r18, pk.StoreDetails r19, pk.StoreDetails r20, pk.StoreDetails r21, pk.i r22, bk.AbstractC6392a r23, bk.AbstractC6392a r24, bk.AbstractC6392a r25, java.lang.String r26, boolean r27, Yq.StoreMarker r28, Jr.IndicatorIcon r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Yq.StoreMapItem.<init>(int, pk.h, pk.h, pk.h, pk.h, pk.i, bk.a, bk.a, bk.a, java.lang.String, boolean, Yq.e, Jr.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
