package Hl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003\"#\u001bB!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"LHl/b;", "Landroid/os/Parcelable;", "", "LHl/b$c;", "flyBuyOrderData", "LHl/b$d;", "flyBuyOrderPages", "<init>", "(Ljava/util/List;LHl/b$d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LHl/b$d;", "getFlyBuyOrderPages", "()LHl/b$d;", "c", "d", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hl.b, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FlyBuyOrderDetail implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FlyBuyOrder> flyBuyOrderData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pages flyBuyOrderPages;
    public static final Parcelable.Creator<FlyBuyOrderDetail> CREATOR = new C0215b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hl.b$b, reason: collision with other inner class name */
    public static final class C0215b implements Parcelable.Creator<FlyBuyOrderDetail> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FlyBuyOrderDetail createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(FlyBuyOrder.CREATOR.createFromParcel(parcel));
            }
            return new FlyBuyOrderDetail(arrayList, parcel.readInt() == 0 ? null : Pages.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FlyBuyOrderDetail[] newArray(int i10) {
            return new FlyBuyOrderDetail[i10];
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u00104J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u00106R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u00106R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010LR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bM\u0010CR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bN\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010>\u001a\u0004\bP\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bO\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u0010>\u001a\u0004\bU\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bY\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\bQ\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b\\\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b^\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010>\u001a\u0004\b`\u00106R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\be\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bf\u0010A\u001a\u0004\bR\u0010CR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010>\u001a\u0004\bh\u00106R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010>\u001a\u0004\bT\u00106R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010>\u001a\u0004\bH\u00106R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010>\u001a\u0004\b@\u00106R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010>\u001a\u0004\b=\u00106R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010>\u001a\u0004\bn\u00106R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010>\u001a\u0004\bp\u00106R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010>\u001a\u0004\br\u00106R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010>\u001a\u0004\bt\u00106R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bu\u0010>\u001a\u0004\bv\u00106R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010>\u001a\u0004\bx\u00106R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\by\u0010>\u001a\u0004\bz\u00106R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b{\u0010b\u001a\u0004\b|\u0010dR\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b}\u0010>\u001a\u0004\b~\u00106R\u001a\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010>\u001a\u0005\b\u0080\u0001\u00106¨\u0006\u0081\u0001"}, d2 = {"LHl/b$c;", "Landroid/os/Parcelable;", "", "type", "", "orderId", "LHl/b$a$b;", "orderState", "redemptionUrl", "LHl/b$a$a;", "customerState", PreferencesHelper.PREF_ID, "arrivedAt", "etaAt", "partnerIdentifier", "partnerDisplayIdentifier", "partnerIdentifierForCrew", "partnerIdentifierForCustomer", "state", "redemptionCode", "createdAt", "updatedAt", "areaName", "", "LHl/a;", "possibleAreas", "customerId", "siteId", "sitePartnerIdentifier", "spotIdentifier", "customerName", "customerCarType", "customerCarColor", "customerLicensePlate", "customerRatingValue", "customerRatingValueString", "customerRatingComments", "pickupWindow", "pickupType", "pushToken", "tagIds", "deliveryErrorReviewedAt", "deliveryErrorAt", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;LHl/b$a$b;Ljava/lang/String;LHl/b$a$a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "c", "LHl/b$a$b;", "g", "()LHl/b$a$b;", "d", "getRedemptionUrl", "e", "LHl/b$a$a;", "()LHl/b$a$a;", "getId", "getArrivedAt", "h", "getEtaAt", "i", "j", "getPartnerDisplayIdentifier", "k", "getPartnerIdentifierForCrew", "l", "getPartnerIdentifierForCustomer", "m", "getState", "n", "o", "getCreatedAt", "p", "getUpdatedAt", "q", "getAreaName", "r", "Ljava/util/List;", "getPossibleAreas", "()Ljava/util/List;", "s", "t", "u", "getSitePartnerIdentifier", "v", "w", "x", "y", "z", "getCustomerLicensePlate", "A", "getCustomerRatingValue", "B", "getCustomerRatingValueString", "C", "getCustomerRatingComments", "D", "getPickupWindow", "E", "getPickupType", "F", "getPushToken", "G", "getTagIds", "H", "getDeliveryErrorReviewedAt", "I", "getDeliveryErrorAt", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hl.b$c, reason: from toString */
    public static final /* data */ class FlyBuyOrder implements Parcelable {
        public static final Parcelable.Creator<FlyBuyOrder> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerRatingValue;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerRatingValueString;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerRatingComments;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupWindow;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupType;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pushToken;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> tagIds;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryErrorReviewedAt;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryErrorAt;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer orderId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Companion.EnumC0214b orderState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String redemptionUrl;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Companion.EnumC0213a customerState;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer id;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String arrivedAt;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String etaAt;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String partnerIdentifier;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String partnerDisplayIdentifier;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String partnerIdentifierForCrew;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String partnerIdentifierForCustomer;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String state;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String redemptionCode;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String createdAt;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String updatedAt;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String areaName;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FlyBuyArea> possibleAreas;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer customerId;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer siteId;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sitePartnerIdentifier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String spotIdentifier;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerName;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerCarType;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerCarColor;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerLicensePlate;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hl.b$c$a */
        public static final class a implements Parcelable.Creator<FlyBuyOrder> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FlyBuyOrder createFromParcel(Parcel parcel) {
                Integer num;
                ArrayList arrayList;
                ArrayList arrayList2;
                Intrinsics.j(parcel, "parcel");
                String string = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Companion.EnumC0214b enumC0214bValueOf = parcel.readInt() == 0 ? null : Companion.EnumC0214b.valueOf(parcel.readString());
                String string2 = parcel.readString();
                Companion.EnumC0213a enumC0213aValueOf = parcel.readInt() == 0 ? null : Companion.EnumC0213a.valueOf(parcel.readString());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int i11 = 0;
                while (i11 != i10) {
                    arrayList3.add(FlyBuyArea.CREATOR.createFromParcel(parcel));
                    i11++;
                    i10 = i10;
                }
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                String string24 = parcel.readString();
                String string25 = parcel.readString();
                if (parcel.readInt() == 0) {
                    num = numValueOf3;
                    arrayList = arrayList3;
                    arrayList2 = null;
                } else {
                    int i12 = parcel.readInt();
                    num = numValueOf3;
                    ArrayList arrayList4 = new ArrayList(i12);
                    arrayList = arrayList3;
                    int i13 = 0;
                    while (i13 != i12) {
                        arrayList4.add(Integer.valueOf(parcel.readInt()));
                        i13++;
                        i12 = i12;
                    }
                    arrayList2 = arrayList4;
                }
                return new FlyBuyOrder(string, numValueOf, enumC0214bValueOf, string2, enumC0213aValueOf, numValueOf2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, arrayList, num, numValueOf4, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, arrayList2, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FlyBuyOrder[] newArray(int i10) {
                return new FlyBuyOrder[i10];
            }
        }

        public FlyBuyOrder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlyBuyOrder)) {
                return false;
            }
            FlyBuyOrder flyBuyOrder = (FlyBuyOrder) other;
            return Intrinsics.e(this.type, flyBuyOrder.type) && Intrinsics.e(this.orderId, flyBuyOrder.orderId) && this.orderState == flyBuyOrder.orderState && Intrinsics.e(this.redemptionUrl, flyBuyOrder.redemptionUrl) && this.customerState == flyBuyOrder.customerState && Intrinsics.e(this.id, flyBuyOrder.id) && Intrinsics.e(this.arrivedAt, flyBuyOrder.arrivedAt) && Intrinsics.e(this.etaAt, flyBuyOrder.etaAt) && Intrinsics.e(this.partnerIdentifier, flyBuyOrder.partnerIdentifier) && Intrinsics.e(this.partnerDisplayIdentifier, flyBuyOrder.partnerDisplayIdentifier) && Intrinsics.e(this.partnerIdentifierForCrew, flyBuyOrder.partnerIdentifierForCrew) && Intrinsics.e(this.partnerIdentifierForCustomer, flyBuyOrder.partnerIdentifierForCustomer) && Intrinsics.e(this.state, flyBuyOrder.state) && Intrinsics.e(this.redemptionCode, flyBuyOrder.redemptionCode) && Intrinsics.e(this.createdAt, flyBuyOrder.createdAt) && Intrinsics.e(this.updatedAt, flyBuyOrder.updatedAt) && Intrinsics.e(this.areaName, flyBuyOrder.areaName) && Intrinsics.e(this.possibleAreas, flyBuyOrder.possibleAreas) && Intrinsics.e(this.customerId, flyBuyOrder.customerId) && Intrinsics.e(this.siteId, flyBuyOrder.siteId) && Intrinsics.e(this.sitePartnerIdentifier, flyBuyOrder.sitePartnerIdentifier) && Intrinsics.e(this.spotIdentifier, flyBuyOrder.spotIdentifier) && Intrinsics.e(this.customerName, flyBuyOrder.customerName) && Intrinsics.e(this.customerCarType, flyBuyOrder.customerCarType) && Intrinsics.e(this.customerCarColor, flyBuyOrder.customerCarColor) && Intrinsics.e(this.customerLicensePlate, flyBuyOrder.customerLicensePlate) && Intrinsics.e(this.customerRatingValue, flyBuyOrder.customerRatingValue) && Intrinsics.e(this.customerRatingValueString, flyBuyOrder.customerRatingValueString) && Intrinsics.e(this.customerRatingComments, flyBuyOrder.customerRatingComments) && Intrinsics.e(this.pickupWindow, flyBuyOrder.pickupWindow) && Intrinsics.e(this.pickupType, flyBuyOrder.pickupType) && Intrinsics.e(this.pushToken, flyBuyOrder.pushToken) && Intrinsics.e(this.tagIds, flyBuyOrder.tagIds) && Intrinsics.e(this.deliveryErrorReviewedAt, flyBuyOrder.deliveryErrorReviewedAt) && Intrinsics.e(this.deliveryErrorAt, flyBuyOrder.deliveryErrorAt);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.type);
            Integer num = this.orderId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Companion.EnumC0214b enumC0214b = this.orderState;
            if (enumC0214b == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(enumC0214b.name());
            }
            dest.writeString(this.redemptionUrl);
            Companion.EnumC0213a enumC0213a = this.customerState;
            if (enumC0213a == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(enumC0213a.name());
            }
            Integer num2 = this.id;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.arrivedAt);
            dest.writeString(this.etaAt);
            dest.writeString(this.partnerIdentifier);
            dest.writeString(this.partnerDisplayIdentifier);
            dest.writeString(this.partnerIdentifierForCrew);
            dest.writeString(this.partnerIdentifierForCustomer);
            dest.writeString(this.state);
            dest.writeString(this.redemptionCode);
            dest.writeString(this.createdAt);
            dest.writeString(this.updatedAt);
            dest.writeString(this.areaName);
            List<FlyBuyArea> list = this.possibleAreas;
            dest.writeInt(list.size());
            Iterator<FlyBuyArea> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            Integer num3 = this.customerId;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            Integer num4 = this.siteId;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num4.intValue());
            }
            dest.writeString(this.sitePartnerIdentifier);
            dest.writeString(this.spotIdentifier);
            dest.writeString(this.customerName);
            dest.writeString(this.customerCarType);
            dest.writeString(this.customerCarColor);
            dest.writeString(this.customerLicensePlate);
            dest.writeString(this.customerRatingValue);
            dest.writeString(this.customerRatingValueString);
            dest.writeString(this.customerRatingComments);
            dest.writeString(this.pickupWindow);
            dest.writeString(this.pickupType);
            dest.writeString(this.pushToken);
            List<Integer> list2 = this.tagIds;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<Integer> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeInt(it2.next().intValue());
                }
            }
            dest.writeString(this.deliveryErrorReviewedAt);
            dest.writeString(this.deliveryErrorAt);
        }

        public FlyBuyOrder(String str, Integer num, Companion.EnumC0214b enumC0214b, String str2, Companion.EnumC0213a enumC0213a, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<FlyBuyArea> possibleAreas, Integer num3, Integer num4, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<Integer> list, String str26, String str27) {
            Intrinsics.j(possibleAreas, "possibleAreas");
            this.type = str;
            this.orderId = num;
            this.orderState = enumC0214b;
            this.redemptionUrl = str2;
            this.customerState = enumC0213a;
            this.id = num2;
            this.arrivedAt = str3;
            this.etaAt = str4;
            this.partnerIdentifier = str5;
            this.partnerDisplayIdentifier = str6;
            this.partnerIdentifierForCrew = str7;
            this.partnerIdentifierForCustomer = str8;
            this.state = str9;
            this.redemptionCode = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.areaName = str13;
            this.possibleAreas = possibleAreas;
            this.customerId = num3;
            this.siteId = num4;
            this.sitePartnerIdentifier = str14;
            this.spotIdentifier = str15;
            this.customerName = str16;
            this.customerCarType = str17;
            this.customerCarColor = str18;
            this.customerLicensePlate = str19;
            this.customerRatingValue = str20;
            this.customerRatingValueString = str21;
            this.customerRatingComments = str22;
            this.pickupWindow = str23;
            this.pickupType = str24;
            this.pushToken = str25;
            this.tagIds = list;
            this.deliveryErrorReviewedAt = str26;
            this.deliveryErrorAt = str27;
        }

        /* renamed from: a, reason: from getter */
        public final String getCustomerCarColor() {
            return this.customerCarColor;
        }

        /* renamed from: b, reason: from getter */
        public final String getCustomerCarType() {
            return this.customerCarType;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getCustomerId() {
            return this.customerId;
        }

        /* renamed from: d, reason: from getter */
        public final String getCustomerName() {
            return this.customerName;
        }

        /* renamed from: e, reason: from getter */
        public final Companion.EnumC0213a getCustomerState() {
            return this.customerState;
        }

        /* renamed from: f, reason: from getter */
        public final Integer getOrderId() {
            return this.orderId;
        }

        /* renamed from: g, reason: from getter */
        public final Companion.EnumC0214b getOrderState() {
            return this.orderState;
        }

        /* renamed from: h, reason: from getter */
        public final String getPartnerIdentifier() {
            return this.partnerIdentifier;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.orderId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Companion.EnumC0214b enumC0214b = this.orderState;
            int iHashCode3 = (iHashCode2 + (enumC0214b == null ? 0 : enumC0214b.hashCode())) * 31;
            String str2 = this.redemptionUrl;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Companion.EnumC0213a enumC0213a = this.customerState;
            int iHashCode5 = (iHashCode4 + (enumC0213a == null ? 0 : enumC0213a.hashCode())) * 31;
            Integer num2 = this.id;
            int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.arrivedAt;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.etaAt;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.partnerIdentifier;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.partnerDisplayIdentifier;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.partnerIdentifierForCrew;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.partnerIdentifierForCustomer;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.state;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.redemptionCode;
            int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.createdAt;
            int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.updatedAt;
            int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.areaName;
            int iHashCode17 = (((iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31) + this.possibleAreas.hashCode()) * 31;
            Integer num3 = this.customerId;
            int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.siteId;
            int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str14 = this.sitePartnerIdentifier;
            int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.spotIdentifier;
            int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.customerName;
            int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.customerCarType;
            int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.customerCarColor;
            int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.customerLicensePlate;
            int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.customerRatingValue;
            int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.customerRatingValueString;
            int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.customerRatingComments;
            int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.pickupWindow;
            int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.pickupType;
            int iHashCode30 = (iHashCode29 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.pushToken;
            int iHashCode31 = (iHashCode30 + (str25 == null ? 0 : str25.hashCode())) * 31;
            List<Integer> list = this.tagIds;
            int iHashCode32 = (iHashCode31 + (list == null ? 0 : list.hashCode())) * 31;
            String str26 = this.deliveryErrorReviewedAt;
            int iHashCode33 = (iHashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.deliveryErrorAt;
            return iHashCode33 + (str27 != null ? str27.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getRedemptionCode() {
            return this.redemptionCode;
        }

        /* renamed from: j, reason: from getter */
        public final Integer getSiteId() {
            return this.siteId;
        }

        /* renamed from: k, reason: from getter */
        public final String getSpotIdentifier() {
            return this.spotIdentifier;
        }

        public String toString() {
            return "FlyBuyOrder(type=" + this.type + ", orderId=" + this.orderId + ", orderState=" + this.orderState + ", redemptionUrl=" + this.redemptionUrl + ", customerState=" + this.customerState + ", id=" + this.id + ", arrivedAt=" + this.arrivedAt + ", etaAt=" + this.etaAt + ", partnerIdentifier=" + this.partnerIdentifier + ", partnerDisplayIdentifier=" + this.partnerDisplayIdentifier + ", partnerIdentifierForCrew=" + this.partnerIdentifierForCrew + ", partnerIdentifierForCustomer=" + this.partnerIdentifierForCustomer + ", state=" + this.state + ", redemptionCode=" + this.redemptionCode + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", areaName=" + this.areaName + ", possibleAreas=" + this.possibleAreas + ", customerId=" + this.customerId + ", siteId=" + this.siteId + ", sitePartnerIdentifier=" + this.sitePartnerIdentifier + ", spotIdentifier=" + this.spotIdentifier + ", customerName=" + this.customerName + ", customerCarType=" + this.customerCarType + ", customerCarColor=" + this.customerCarColor + ", customerLicensePlate=" + this.customerLicensePlate + ", customerRatingValue=" + this.customerRatingValue + ", customerRatingValueString=" + this.customerRatingValueString + ", customerRatingComments=" + this.customerRatingComments + ", pickupWindow=" + this.pickupWindow + ", pickupType=" + this.pickupType + ", pushToken=" + this.pushToken + ", tagIds=" + this.tagIds + ", deliveryErrorReviewedAt=" + this.deliveryErrorReviewedAt + ", deliveryErrorAt=" + this.deliveryErrorAt + ')';
        }

        public /* synthetic */ FlyBuyOrder(String str, Integer num, Companion.EnumC0214b enumC0214b, String str2, Companion.EnumC0213a enumC0213a, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, Integer num3, Integer num4, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List list2, String str26, String str27, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? Companion.EnumC0214b.f13667c : enumC0214b, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? Companion.EnumC0213a.f13662h : enumC0213a, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str8, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str9, (i10 & 8192) != 0 ? null : str10, (i10 & 16384) != 0 ? null : str11, (i10 & 32768) != 0 ? null : str12, (i10 & 65536) != 0 ? null : str13, (i10 & 131072) != 0 ? CollectionsKt.m() : list, (i10 & 262144) != 0 ? null : num3, (i10 & 524288) != 0 ? null : num4, (i10 & 1048576) != 0 ? null : str14, (i10 & 2097152) != 0 ? null : str15, (i10 & 4194304) != 0 ? null : str16, (i10 & 8388608) != 0 ? null : str17, (i10 & 16777216) != 0 ? null : str18, (i10 & 33554432) != 0 ? null : str19, (i10 & 67108864) != 0 ? null : str20, (i10 & 134217728) != 0 ? null : str21, (i10 & 268435456) != 0 ? null : str22, (i10 & 536870912) != 0 ? null : str23, (i10 & 1073741824) != 0 ? null : str24, (i10 & Integer.MIN_VALUE) != 0 ? null : str25, (i11 & 1) != 0 ? CollectionsKt.m() : list2, (i11 & 2) != 0 ? null : str26, (i11 & 4) != 0 ? null : str27);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"LHl/b$d;", "Landroid/os/Parcelable;", "", "current", "count", "per", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getCurrent", "()Ljava/lang/Integer;", "b", "getCount", "c", "getPer", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hl.b$d, reason: from toString */
    public static final /* data */ class Pages implements Parcelable {
        public static final Parcelable.Creator<Pages> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer current;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer count;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer per;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hl.b$d$a */
        public static final class a implements Parcelable.Creator<Pages> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pages createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Pages(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pages[] newArray(int i10) {
                return new Pages[i10];
            }
        }

        public Pages() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pages)) {
                return false;
            }
            Pages pages = (Pages) other;
            return Intrinsics.e(this.current, pages.current) && Intrinsics.e(this.count, pages.count) && Intrinsics.e(this.per, pages.per);
        }

        public Pages(Integer num, Integer num2, Integer num3) {
            this.current = num;
            this.count = num2;
            this.per = num3;
        }

        public int hashCode() {
            Integer num = this.current;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.count;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.per;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "Pages(current=" + this.current + ", count=" + this.count + ", per=" + this.per + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            Integer num = this.current;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.count;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            Integer num3 = this.per;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
        }

        public /* synthetic */ Pages(Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2, (i10 & 4) != 0 ? 0 : num3);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyOrderDetail)) {
            return false;
        }
        FlyBuyOrderDetail flyBuyOrderDetail = (FlyBuyOrderDetail) other;
        return Intrinsics.e(this.flyBuyOrderData, flyBuyOrderDetail.flyBuyOrderData) && Intrinsics.e(this.flyBuyOrderPages, flyBuyOrderDetail.flyBuyOrderPages);
    }

    public FlyBuyOrderDetail(List<FlyBuyOrder> flyBuyOrderData, Pages pages) {
        Intrinsics.j(flyBuyOrderData, "flyBuyOrderData");
        this.flyBuyOrderData = flyBuyOrderData;
        this.flyBuyOrderPages = pages;
    }

    public final List<FlyBuyOrder> a() {
        return this.flyBuyOrderData;
    }

    public int hashCode() {
        int iHashCode = this.flyBuyOrderData.hashCode() * 31;
        Pages pages = this.flyBuyOrderPages;
        return iHashCode + (pages == null ? 0 : pages.hashCode());
    }

    public String toString() {
        return "FlyBuyOrderDetail(flyBuyOrderData=" + this.flyBuyOrderData + ", flyBuyOrderPages=" + this.flyBuyOrderPages + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        List<FlyBuyOrder> list = this.flyBuyOrderData;
        dest.writeInt(list.size());
        Iterator<FlyBuyOrder> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Pages pages = this.flyBuyOrderPages;
        if (pages == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pages.writeToParcel(dest, flags);
        }
    }
}
