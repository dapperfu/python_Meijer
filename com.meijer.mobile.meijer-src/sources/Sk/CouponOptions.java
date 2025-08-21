package Sk;

import Pp.SearchQuery;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yk.C18327c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\b\u0007\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0004\b)\u0010(J\u001d\u0010.\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020,¢\u0006\u0004\b0\u00101J¤\u0001\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020,HÖ\u0001¢\u0006\u0004\b5\u00101J\u001a\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010:\u001a\u0004\b;\u0010(\"\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010@R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010B\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010?\u001a\u0004\bN\u0010\u001c\"\u0004\bO\u0010%R\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010?\u001a\u0004\bA\u0010\u001c\"\u0004\bP\u0010%R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010B\u001a\u0004\b\u000f\u0010D\"\u0004\bQ\u0010FR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010:R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010B\u001a\u0004\bS\u0010D\"\u0004\bT\u0010FR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010B\u001a\u0004\bV\u0010D\"\u0004\bW\u0010F¨\u0006X"}, d2 = {"LSk/a;", "Landroid/os/Parcelable;", "", "", "categories", "searchCriteria", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "sortType", "", "isShowCategoryHeaders", "isShowClippedCoupons", "", "rewardId", "tagId", "bundleName", "isShowOnlySpecialOffers", "offerIds", "upcList", "isShowRedeemedOffers", "isShowSpecialOffers", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupon/model/search/CouponsSortType;ZZJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZZ)V", "", "x", "(Lcom/meijer/mobile/coupon/model/search/CouponsSortType;)V", "i", "()Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "h", "()Ljava/lang/String;", "LPp/a;", "searchQuery", "s", "(LPp/a;)V", "couponOptions", "c", "(LSk/a;)V", "t", "(Ljava/lang/String;)V", "", "f", "()Ljava/util/List;", "k", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/coupon/model/search/CouponsSortType;ZZJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZZ)LSk/a;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "setCategories", "(Ljava/util/List;)V", "b", "Ljava/lang/String;", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "d", "Z", "n", "()Z", "v", "(Z)V", "o", "w", "J", "g", "()J", "setRewardId", "(J)V", "j", "setTagId", "setBundleName", "setShowOnlySpecialOffers", "l", "q", "setShowRedeemedOffers", "m", "r", "setShowSpecialOffers", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Sk.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CouponOptions implements Parcelable {
    public static final Parcelable.Creator<CouponOptions> CREATOR = new C0773a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private List<String> categories;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String searchCriteria;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private CouponsSortType sortType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowCategoryHeaders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowClippedCoupons;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private long rewardId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String tagId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String bundleName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowOnlySpecialOffers;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> offerIds;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> upcList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowRedeemedOffers;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isShowSpecialOffers;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sk.a$a, reason: collision with other inner class name */
    public static final class C0773a implements Parcelable.Creator<CouponOptions> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponOptions createFromParcel(Parcel parcel) {
            int i10;
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.j(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            CouponsSortType couponsSortTypeValueOf = CouponsSortType.valueOf(parcel.readString());
            boolean z13 = false;
            boolean z14 = 1;
            if (parcel.readInt() != 0) {
                i10 = 0;
                z13 = true;
            } else {
                i10 = 0;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = true;
                z14 = i10;
            }
            long j10 = parcel.readLong();
            String string2 = parcel.readString();
            boolean z15 = z10;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = z15 ? 1 : 0;
                z12 = z15;
            } else {
                z11 = z15 ? 1 : 0;
                z12 = i10;
            }
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = i10; i12 != i11; i12++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            return new CouponOptions(arrayListCreateStringArrayList, string, couponsSortTypeValueOf, z13, z14, j10, string2, string3, z12, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponOptions[] newArray(int i10) {
            return new CouponOptions[i10];
        }
    }

    @JvmOverloads
    public CouponOptions() {
        this(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponOptions)) {
            return false;
        }
        CouponOptions couponOptions = (CouponOptions) other;
        return Intrinsics.e(this.categories, couponOptions.categories) && Intrinsics.e(this.searchCriteria, couponOptions.searchCriteria) && this.sortType == couponOptions.sortType && this.isShowCategoryHeaders == couponOptions.isShowCategoryHeaders && this.isShowClippedCoupons == couponOptions.isShowClippedCoupons && this.rewardId == couponOptions.rewardId && Intrinsics.e(this.tagId, couponOptions.tagId) && Intrinsics.e(this.bundleName, couponOptions.bundleName) && this.isShowOnlySpecialOffers == couponOptions.isShowOnlySpecialOffers && Intrinsics.e(this.offerIds, couponOptions.offerIds) && Intrinsics.e(this.upcList, couponOptions.upcList) && this.isShowRedeemedOffers == couponOptions.isShowRedeemedOffers && this.isShowSpecialOffers == couponOptions.isShowSpecialOffers;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeStringList(this.categories);
        dest.writeString(this.searchCriteria);
        dest.writeString(this.sortType.name());
        dest.writeInt(this.isShowCategoryHeaders ? 1 : 0);
        dest.writeInt(this.isShowClippedCoupons ? 1 : 0);
        dest.writeLong(this.rewardId);
        dest.writeString(this.tagId);
        dest.writeString(this.bundleName);
        dest.writeInt(this.isShowOnlySpecialOffers ? 1 : 0);
        List<Long> list = this.offerIds;
        dest.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            dest.writeLong(it.next().longValue());
        }
        List<Long> list2 = this.upcList;
        dest.writeInt(list2.size());
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeLong(it2.next().longValue());
        }
        dest.writeInt(this.isShowRedeemedOffers ? 1 : 0);
        dest.writeInt(this.isShowSpecialOffers ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sk.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CouponsSortType.values().length];
            try {
                iArr[CouponsSortType.RELEVANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CouponsSortType.NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CouponsSortType.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CouponsSortType.EXPIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    public CouponOptions(List<String> categories, String searchCriteria, CouponsSortType sortType, boolean z10, boolean z11, long j10, String tagId, String bundleName, boolean z12, List<Long> offerIds, List<Long> upcList, boolean z13, boolean z14) {
        Intrinsics.j(categories, "categories");
        Intrinsics.j(searchCriteria, "searchCriteria");
        Intrinsics.j(sortType, "sortType");
        Intrinsics.j(tagId, "tagId");
        Intrinsics.j(bundleName, "bundleName");
        Intrinsics.j(offerIds, "offerIds");
        Intrinsics.j(upcList, "upcList");
        this.categories = categories;
        this.searchCriteria = searchCriteria;
        this.sortType = sortType;
        this.isShowCategoryHeaders = z10;
        this.isShowClippedCoupons = z11;
        this.rewardId = j10;
        this.tagId = tagId;
        this.bundleName = bundleName;
        this.isShowOnlySpecialOffers = z12;
        this.offerIds = offerIds;
        this.upcList = upcList;
        this.isShowRedeemedOffers = z13;
        this.isShowSpecialOffers = z14;
    }

    public final CouponOptions a(List<String> categories, String searchCriteria, CouponsSortType sortType, boolean isShowCategoryHeaders, boolean isShowClippedCoupons, long rewardId, String tagId, String bundleName, boolean isShowOnlySpecialOffers, List<Long> offerIds, List<Long> upcList, boolean isShowRedeemedOffers, boolean isShowSpecialOffers) {
        Intrinsics.j(categories, "categories");
        Intrinsics.j(searchCriteria, "searchCriteria");
        Intrinsics.j(sortType, "sortType");
        Intrinsics.j(tagId, "tagId");
        Intrinsics.j(bundleName, "bundleName");
        Intrinsics.j(offerIds, "offerIds");
        Intrinsics.j(upcList, "upcList");
        return new CouponOptions(categories, searchCriteria, sortType, isShowCategoryHeaders, isShowClippedCoupons, rewardId, tagId, bundleName, isShowOnlySpecialOffers, offerIds, upcList, isShowRedeemedOffers, isShowSpecialOffers);
    }

    public final void c(CouponOptions couponOptions) {
        Intrinsics.j(couponOptions, "couponOptions");
        this.categories.clear();
        this.categories.addAll(couponOptions.categories);
        this.sortType = couponOptions.sortType;
        t(couponOptions.searchCriteria);
        this.isShowCategoryHeaders = couponOptions.isShowCategoryHeaders;
        this.isShowClippedCoupons = couponOptions.isShowClippedCoupons;
        this.upcList.clear();
        this.upcList.addAll(couponOptions.upcList);
        this.rewardId = couponOptions.rewardId;
        this.tagId = couponOptions.tagId;
        this.bundleName = couponOptions.bundleName;
        this.isShowOnlySpecialOffers = couponOptions.isShowOnlySpecialOffers;
        this.isShowRedeemedOffers = couponOptions.isShowRedeemedOffers;
        this.isShowSpecialOffers = couponOptions.isShowSpecialOffers;
    }

    /* renamed from: d, reason: from getter */
    public final String getBundleName() {
        return this.bundleName;
    }

    public final List<String> e() {
        return this.categories;
    }

    public final List<Long> f() {
        return this.offerIds;
    }

    /* renamed from: g, reason: from getter */
    public final long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: h, reason: from getter */
    public final String getSearchCriteria() {
        return this.searchCriteria;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.categories.hashCode() * 31) + this.searchCriteria.hashCode()) * 31) + this.sortType.hashCode()) * 31) + Boolean.hashCode(this.isShowCategoryHeaders)) * 31) + Boolean.hashCode(this.isShowClippedCoupons)) * 31) + Long.hashCode(this.rewardId)) * 31) + this.tagId.hashCode()) * 31) + this.bundleName.hashCode()) * 31) + Boolean.hashCode(this.isShowOnlySpecialOffers)) * 31) + this.offerIds.hashCode()) * 31) + this.upcList.hashCode()) * 31) + Boolean.hashCode(this.isShowRedeemedOffers)) * 31) + Boolean.hashCode(this.isShowSpecialOffers);
    }

    public final CouponsSortType i() {
        if (this.isShowCategoryHeaders) {
            int i10 = b.$EnumSwitchMapping$0[this.sortType.ordinal()];
            if (i10 == 1) {
                return CouponsSortType.CATEGORY_RELEVANCE;
            }
            if (i10 == 2) {
                return CouponsSortType.CATEGORY_NEWEST;
            }
            if (i10 == 3) {
                return CouponsSortType.CATEGORY_VALUE;
            }
            if (i10 == 4) {
                return CouponsSortType.CATEGORY_EXPIRING;
            }
        }
        return this.sortType;
    }

    /* renamed from: j, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    public final List<Long> k() {
        return this.upcList;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsShowCategoryHeaders() {
        return this.isShowCategoryHeaders;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsShowClippedCoupons() {
        return this.isShowClippedCoupons;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsShowRedeemedOffers() {
        return this.isShowRedeemedOffers;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsShowSpecialOffers() {
        return this.isShowSpecialOffers;
    }

    public final void s(SearchQuery searchQuery) {
        String queryString;
        Long lX;
        Intrinsics.j(searchQuery, "searchQuery");
        if (searchQuery.getIsScannedUPC() && C18327c.a(searchQuery.getQueryString()) && (queryString = searchQuery.getQueryString()) != null && (lX = StringsKt.x(queryString)) != null) {
            this.upcList.add(Long.valueOf(lX.longValue()));
        }
        t(searchQuery.getQueryString());
    }

    public final void t(String searchCriteria) {
        if (searchCriteria == null) {
            searchCriteria = "";
        }
        this.searchCriteria = searchCriteria;
    }

    public String toString() {
        return "CouponOptions(categories=" + this.categories + ", searchCriteria=" + this.searchCriteria + ", sortType=" + this.sortType + ", isShowCategoryHeaders=" + this.isShowCategoryHeaders + ", isShowClippedCoupons=" + this.isShowClippedCoupons + ", rewardId=" + this.rewardId + ", tagId=" + this.tagId + ", bundleName=" + this.bundleName + ", isShowOnlySpecialOffers=" + this.isShowOnlySpecialOffers + ", offerIds=" + this.offerIds + ", upcList=" + this.upcList + ", isShowRedeemedOffers=" + this.isShowRedeemedOffers + ", isShowSpecialOffers=" + this.isShowSpecialOffers + ')';
    }

    public final void v(boolean z10) {
        this.isShowCategoryHeaders = z10;
    }

    public final void w(boolean z10) {
        this.isShowClippedCoupons = z10;
    }

    public final void x(CouponsSortType sortType) {
        if (sortType == null) {
            sortType = CouponsSortType.RELEVANCE;
        }
        this.sortType = sortType;
    }

    public /* synthetic */ CouponOptions(List list, String str, CouponsSortType couponsSortType, boolean z10, boolean z11, long j10, String str2, String str3, boolean z12, List list2, List list3, boolean z13, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? CouponsSortType.RELEVANCE : couponsSortType, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? "" : str2, (i10 & 128) == 0 ? str3 : "", (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? new ArrayList() : list2, (i10 & 1024) != 0 ? new ArrayList() : list3, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z14);
    }
}
