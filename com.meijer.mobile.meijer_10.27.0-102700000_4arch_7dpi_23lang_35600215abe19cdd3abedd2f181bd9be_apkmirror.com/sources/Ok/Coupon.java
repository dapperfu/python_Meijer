package Ok;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00048<;MBÓ\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010%\u001a\u00020\u0007\u0012\b\b\u0002\u0010&\u001a\u00020\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u001d\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u000201¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b;\u00109JÞ\u0002\u0010<\u001a\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u000201HÖ\u0001¢\u0006\u0004\b@\u00107J\u001a\u0010C\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010H\u001a\u0004\b\b\u00109R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010H\u001a\u0004\bI\u00109\"\u0004\bE\u0010JR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\bL\u0010?R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010?R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u00109\"\u0004\bQ\u0010JR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u00109R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010?R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bT\u0010?R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\bW\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bd\u0010H\u001a\u0004\be\u00109R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bf\u0010H\u001a\u0004\bg\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bh\u0010K\u001a\u0004\b[\u0010?R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bj\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bk\u0010K\u001a\u0004\bl\u0010?R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bm\u0010H\u001a\u0004\bn\u00109R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bl\u0010o\u001a\u0004\bi\u0010pR\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bq\u0010o\u001a\u0004\bf\u0010pR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\br\u0010o\u001a\u0004\bd\u0010pR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bO\u0010uR\u0019\u0010$\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bR\u0010?R\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010H\u001a\u0004\bs\u00109\"\u0004\bv\u0010JR\"\u0010&\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010H\u001a\u0004\b&\u00109\"\u0004\bx\u0010JR$\u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010K\u001a\u0004\br\u0010?\"\u0004\by\u0010zR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\be\u0010{\u001a\u0004\bV\u0010|R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bg\u0010}\u001a\u0004\bk\u0010~R\u0018\u0010,\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\u007f\u0010H\u001a\u0005\b\u0080\u0001\u00109R\u0012\u0010\u0081\u0001\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bm\u0010?¨\u0006\u0082\u0001"}, d2 = {"LOk/a;", "LOk/c;", "LOk/f;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "isSuggested", "isHidden", "", "couponInclusionGroupTag", "couponExpirationGroupTag", "isClipped", "isSpecialOffer", "title", "description", "", "tags", "hatText", "LOk/a$d;", "hatColor", "LOk/a$a;", "borderColor", "isMeijerBuck", "isShowLargeImage", "imageURL", "largeImageURL", "termsAndConditions", "isManufacturerCoupon", "j$/time/LocalDateTime", "redemptionStartDate", "redemptionEndDate", "redemptionDate", "LOk/b;", "category", "categoryName", "isAddedToShoppingList", "isHideBundleTag", "validThrough", "LOk/a$c;", "earnCondition", "LOk/a$e;", "reward", "isSpecialBuyCouponType", "<init>", "(JZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LOk/a$d;LOk/a$a;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;LOk/b;Ljava/lang/String;ZZLjava/lang/String;LOk/a$c;LOk/a$e;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "()Z", "b", "c", "d", "(JZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LOk/a$d;LOk/a$a;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;LOk/b;Ljava/lang/String;ZZLjava/lang/String;LOk/a$c;LOk/a$e;Z)LOk/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "Z0", "()J", "Z", "y", "(Z)V", "Ljava/lang/String;", "getCouponInclusionGroupTag", "e", "getCouponExpirationGroupTag", "f", "x", "I", "g", "F", "h", "getTitle", "i", "j", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "k", "l", "LOk/a$d;", "getHatColor", "()LOk/a$d;", "m", "LOk/a$a;", "getBorderColor", "()LOk/a$a;", "n", "B", "o", "C", "p", "q", "getLargeImageURL", "r", "t", "s", "A", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "u", "v", "w", "LOk/b;", "()LOk/b;", "G", "z", "setHideBundleTag", "setValidThrough", "(Ljava/lang/String;)V", "LOk/a$c;", "()LOk/a$c;", "LOk/a$e;", "()LOk/a$e;", "D", "E", "tagId", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ok.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class Coupon implements Ok.c, f, Parcelable {
    public static final Parcelable.Creator<Coupon> CREATOR = new b();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private String validThrough;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final c earnCondition;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final e reward;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpecialBuyCouponType;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuggested;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isHidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponInclusionGroupTag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponExpirationGroupTag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isClipped;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpecialOffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tags;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hatText;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final d hatColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC0417a borderColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMeijerBuck;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowLargeImage;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String largeImageURL;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsAndConditions;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isManufacturerCoupon;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime redemptionStartDate;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime redemptionEndDate;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime redemptionDate;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponCategory category;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String categoryName;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAddedToShoppingList;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isHideBundleTag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LOk/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$a, reason: collision with other inner class name */
    public static final class EnumC0417a {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0417a f24012a = new EnumC0417a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0417a f24013b = new EnumC0417a("BLUE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0417a f24014c = new EnumC0417a("RED", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC0417a[] f24015d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24016e;

        static {
            EnumC0417a[] enumC0417aArrA = a();
            f24015d = enumC0417aArrA;
            f24016e = EnumEntriesKt.a(enumC0417aArrA);
        }

        private static final /* synthetic */ EnumC0417a[] a() {
            return new EnumC0417a[]{f24012a, f24013b, f24014c};
        }

        public static EnumC0417a valueOf(String str) {
            return (EnumC0417a) Enum.valueOf(EnumC0417a.class, str);
        }

        public static EnumC0417a[] values() {
            return (EnumC0417a[]) f24015d.clone();
        }

        private EnumC0417a(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$b */
    public static final class b implements Parcelable.Creator<Coupon> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Coupon createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            d dVar;
            EnumC0417a enumC0417a;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            LocalDateTime localDateTime;
            LocalDateTime localDateTime2;
            LocalDateTime localDateTime3;
            CouponCategory bVar;
            boolean z20;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            boolean z21 = false;
            boolean z22 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z21 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z22 = z10;
            }
            String string = parcel.readString();
            boolean z23 = z11;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z23;
            } else {
                z12 = z23;
                z23 = z10;
            }
            if (parcel.readInt() != 0) {
                z13 = z12;
            } else {
                z13 = z12;
                z12 = z10;
            }
            String string3 = parcel.readString();
            boolean z24 = z13;
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
            EnumC0417a enumC0417aValueOf = EnumC0417a.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z14 = z24;
                dVar = dVarValueOf;
                enumC0417a = enumC0417aValueOf;
                z15 = z14;
            } else {
                z14 = z24;
                dVar = dVarValueOf;
                enumC0417a = enumC0417aValueOf;
                z15 = z10;
            }
            if (parcel.readInt() != 0) {
                z16 = z14;
            } else {
                z16 = z14;
                z14 = z10;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z25 = z16;
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z17 = z25;
            } else {
                z17 = z25;
                z25 = z10;
            }
            LocalDateTime localDateTime4 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime5 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime6 = (LocalDateTime) parcel.readSerializable();
            CouponCategory bVarCreateFromParcel = parcel.readInt() == 0 ? null : CouponCategory.CREATOR.createFromParcel(parcel);
            boolean z26 = false;
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z18 = false;
                z26 = z17;
            } else {
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                z19 = z18;
                z18 = z17;
            } else {
                z19 = z18;
            }
            String string10 = parcel.readString();
            c cVar = (c) parcel.readParcelable(Coupon.class.getClassLoader());
            e eVar = (e) parcel.readParcelable(Coupon.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z20 = z17;
                localDateTime = localDateTime4;
                localDateTime2 = localDateTime5;
                localDateTime3 = localDateTime6;
                bVar = bVarCreateFromParcel;
            } else {
                localDateTime = localDateTime4;
                localDateTime2 = localDateTime5;
                localDateTime3 = localDateTime6;
                bVar = bVarCreateFromParcel;
                z20 = z19;
            }
            return new Coupon(j10, z21, z22, string, string2, z23, z12, string3, string4, arrayListCreateStringArrayList, string5, dVar, enumC0417a, z15, z14, string6, string7, string8, z25, localDateTime, localDateTime2, localDateTime3, bVar, string9, z26, z18, string10, cVar, eVar, z20);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Coupon[] newArray(int i10) {
            return new Coupon[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LOk/a$c;", "Landroid/os/Parcelable;", "", "goal", "<init>", "(D)V", "a", "D", "()D", "b", "c", "LOk/a$c$a;", "LOk/a$c$b;", "LOk/a$c$c;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$c */
    public static abstract class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final double goal;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOk/a$c$a;", "LOk/a$c;", "", "goal", "<init>", "(D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "a", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$c$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Buy extends c {
            public static final Parcelable.Creator<Buy> CREATOR = new C0419a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double goal;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$c$a$a, reason: collision with other inner class name */
            public static final class C0419a implements Parcelable.Creator<Buy> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Buy createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new Buy(parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Buy[] newArray(int i10) {
                    return new Buy[i10];
                }
            }

            public Buy(double d10) {
                super(d10, null);
                this.goal = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Buy) && Double.compare(this.goal, ((Buy) other).goal) == 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeDouble(this.goal);
            }

            @Override // Ok.Coupon.c
            /* renamed from: a, reason: from getter */
            public double getGoal() {
                return this.goal;
            }

            public int hashCode() {
                return Double.hashCode(this.goal);
            }

            public String toString() {
                return "Buy(goal=" + this.goal + ')';
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LOk/a$c$b;", "LOk/a$c;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final b f24019b = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0420a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$c$b$a, reason: collision with other inner class name */
            public static final class C0420a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f24019b;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            private b() {
                super(0.0d, 1, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeInt(1);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 387000900;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOk/a$c$c;", "LOk/a$c;", "", "goal", "<init>", "(D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "a", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class Spend extends c {
            public static final Parcelable.Creator<Spend> CREATOR = new C0422a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double goal;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$c$c$a, reason: collision with other inner class name */
            public static final class C0422a implements Parcelable.Creator<Spend> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Spend createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new Spend(parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Spend[] newArray(int i10) {
                    return new Spend[i10];
                }
            }

            public Spend(double d10) {
                super(d10, null);
                this.goal = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Spend) && Double.compare(this.goal, ((Spend) other).goal) == 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeDouble(this.goal);
            }

            @Override // Ok.Coupon.c
            /* renamed from: a, reason: from getter */
            public double getGoal() {
                return this.goal;
            }

            public int hashCode() {
                return Double.hashCode(this.goal);
            }

            public String toString() {
                return "Spend(goal=" + this.goal + ')';
            }
        }

        public /* synthetic */ c(double d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10);
        }

        private c(double d10) {
            this.goal = d10;
        }

        /* renamed from: a, reason: from getter */
        public double getGoal() {
            return this.goal;
        }

        public /* synthetic */ c(double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LOk/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24021a = new d("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f24022b = new d("BLUE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f24023c = new d("RED", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f24024d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24025e;

        static {
            d[] dVarArrA = a();
            f24024d = dVarArrA;
            f24025e = EnumEntriesKt.a(dVarArrA);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f24021a, f24022b, f24023c};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f24024d.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LOk/a$e;", "Landroid/os/Parcelable;", "", "value", "<init>", "(D)V", "a", "D", "getValue", "()D", "b", "d", "c", "LOk/a$e$a;", "LOk/a$e$b;", "LOk/a$e$c;", "LOk/a$e$d;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$e */
    public static abstract class e implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final double value;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOk/a$e$a;", "LOk/a$e;", "", "value", "<init>", "(D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getValue", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$e$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class Free extends e {
            public static final Parcelable.Creator<Free> CREATOR = new C0424a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double value;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$e$a$a, reason: collision with other inner class name */
            public static final class C0424a implements Parcelable.Creator<Free> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Free createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new Free(parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Free[] newArray(int i10) {
                    return new Free[i10];
                }
            }

            public Free(double d10) {
                super(d10, null);
                this.value = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Free) && Double.compare(this.value, ((Free) other).value) == 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeDouble(this.value);
            }

            @Override // Ok.Coupon.e
            public double getValue() {
                return this.value;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            public String toString() {
                return "Free(value=" + this.value + ')';
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LOk/a$e$b;", "LOk/a$e;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$e$b */
        public static final /* data */ class b extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final b f24028b = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0425a();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$e$b$a, reason: collision with other inner class name */
            public static final class C0425a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    parcel.readInt();
                    return b.f24028b;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeInt(1);
            }

            private b() {
                super(0.0d, null);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return -52783658;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOk/a$e$c;", "LOk/a$e;", "", "value", "<init>", "(D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getValue", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$e$c, reason: from toString */
        public static final /* data */ class PercentDiscount extends e {
            public static final Parcelable.Creator<PercentDiscount> CREATOR = new C0426a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double value;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$e$c$a, reason: collision with other inner class name */
            public static final class C0426a implements Parcelable.Creator<PercentDiscount> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PercentDiscount createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new PercentDiscount(parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PercentDiscount[] newArray(int i10) {
                    return new PercentDiscount[i10];
                }
            }

            public PercentDiscount(double d10) {
                super(d10, null);
                this.value = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PercentDiscount) && Double.compare(this.value, ((PercentDiscount) other).value) == 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeDouble(this.value);
            }

            @Override // Ok.Coupon.e
            public double getValue() {
                return this.value;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            public String toString() {
                return "PercentDiscount(value=" + this.value + ')';
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOk/a$e$d;", "LOk/a$e;", "", "value", "<init>", "(D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getValue", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ok.a$e$d, reason: from toString */
        public static final /* data */ class PriceDiscount extends e {
            public static final Parcelable.Creator<PriceDiscount> CREATOR = new C0427a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double value;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ok.a$e$d$a, reason: collision with other inner class name */
            public static final class C0427a implements Parcelable.Creator<PriceDiscount> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PriceDiscount createFromParcel(Parcel parcel) {
                    Intrinsics.j(parcel, "parcel");
                    return new PriceDiscount(parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PriceDiscount[] newArray(int i10) {
                    return new PriceDiscount[i10];
                }
            }

            public PriceDiscount(double d10) {
                super(d10, null);
                this.value = d10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PriceDiscount) && Double.compare(this.value, ((PriceDiscount) other).value) == 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.j(dest, "dest");
                dest.writeDouble(this.value);
            }

            @Override // Ok.Coupon.e
            public double getValue() {
                return this.value;
            }

            public int hashCode() {
                return Double.hashCode(this.value);
            }

            public String toString() {
                return "PriceDiscount(value=" + this.value + ')';
            }
        }

        public /* synthetic */ e(double d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10);
        }

        private e(double d10) {
            this.value = d10;
        }

        public double getValue() {
            return this.value;
        }
    }

    public Coupon(long j10, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, String title, String description, List<String> tags, String str3, d hatColor, EnumC0417a borderColor, boolean z14, boolean z15, String str4, String str5, String str6, boolean z16, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, CouponCategory bVar, String str7, boolean z17, boolean z18, String str8, c earnCondition, e reward, boolean z19) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(earnCondition, "earnCondition");
        Intrinsics.j(reward, "reward");
        this.offerId = j10;
        this.isSuggested = z10;
        this.isHidden = z11;
        this.couponInclusionGroupTag = str;
        this.couponExpirationGroupTag = str2;
        this.isClipped = z12;
        this.isSpecialOffer = z13;
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.hatText = str3;
        this.hatColor = hatColor;
        this.borderColor = borderColor;
        this.isMeijerBuck = z14;
        this.isShowLargeImage = z15;
        this.imageURL = str4;
        this.largeImageURL = str5;
        this.termsAndConditions = str6;
        this.isManufacturerCoupon = z16;
        this.redemptionStartDate = localDateTime;
        this.redemptionEndDate = localDateTime2;
        this.redemptionDate = localDateTime3;
        this.category = bVar;
        this.categoryName = str7;
        this.isAddedToShoppingList = z17;
        this.isHideBundleTag = z18;
        this.validThrough = str8;
        this.earnCondition = earnCondition;
        this.reward = reward;
        this.isSpecialBuyCouponType = z19;
    }

    public static /* synthetic */ Coupon e(Coupon coupon, long j10, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, String str3, String str4, List list, String str5, d dVar, EnumC0417a enumC0417a, boolean z14, boolean z15, String str6, String str7, String str8, boolean z16, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, CouponCategory bVar, String str9, boolean z17, boolean z18, String str10, c cVar, e eVar, boolean z19, int i10, Object obj) {
        boolean z20;
        e eVar2;
        long j11 = (i10 & 1) != 0 ? coupon.offerId : j10;
        boolean z21 = (i10 & 2) != 0 ? coupon.isSuggested : z10;
        boolean z22 = (i10 & 4) != 0 ? coupon.isHidden : z11;
        String str11 = (i10 & 8) != 0 ? coupon.couponInclusionGroupTag : str;
        String str12 = (i10 & 16) != 0 ? coupon.couponExpirationGroupTag : str2;
        boolean z23 = (i10 & 32) != 0 ? coupon.isClipped : z12;
        boolean z24 = (i10 & 64) != 0 ? coupon.isSpecialOffer : z13;
        String str13 = (i10 & 128) != 0 ? coupon.title : str3;
        String str14 = (i10 & 256) != 0 ? coupon.description : str4;
        List list2 = (i10 & 512) != 0 ? coupon.tags : list;
        String str15 = (i10 & 1024) != 0 ? coupon.hatText : str5;
        d dVar2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? coupon.hatColor : dVar;
        EnumC0417a enumC0417a2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? coupon.borderColor : enumC0417a;
        long j12 = j11;
        boolean z25 = (i10 & 8192) != 0 ? coupon.isMeijerBuck : z14;
        boolean z26 = (i10 & 16384) != 0 ? coupon.isShowLargeImage : z15;
        String str16 = (i10 & 32768) != 0 ? coupon.imageURL : str6;
        String str17 = (i10 & 65536) != 0 ? coupon.largeImageURL : str7;
        String str18 = (i10 & 131072) != 0 ? coupon.termsAndConditions : str8;
        boolean z27 = (i10 & 262144) != 0 ? coupon.isManufacturerCoupon : z16;
        LocalDateTime localDateTime4 = (i10 & 524288) != 0 ? coupon.redemptionStartDate : localDateTime;
        LocalDateTime localDateTime5 = (i10 & 1048576) != 0 ? coupon.redemptionEndDate : localDateTime2;
        LocalDateTime localDateTime6 = (i10 & 2097152) != 0 ? coupon.redemptionDate : localDateTime3;
        CouponCategory bVar2 = (i10 & 4194304) != 0 ? coupon.category : bVar;
        String str19 = (i10 & 8388608) != 0 ? coupon.categoryName : str9;
        boolean z28 = (i10 & 16777216) != 0 ? coupon.isAddedToShoppingList : z17;
        boolean z29 = (i10 & 33554432) != 0 ? coupon.isHideBundleTag : z18;
        String str20 = (i10 & 67108864) != 0 ? coupon.validThrough : str10;
        c cVar2 = (i10 & 134217728) != 0 ? coupon.earnCondition : cVar;
        e eVar3 = (i10 & 268435456) != 0 ? coupon.reward : eVar;
        if ((i10 & 536870912) != 0) {
            eVar2 = eVar3;
            z20 = coupon.isSpecialBuyCouponType;
        } else {
            z20 = z19;
            eVar2 = eVar3;
        }
        return coupon.d(j12, z21, z22, str11, str12, z23, z24, str13, str14, list2, str15, dVar2, enumC0417a2, z25, z26, str16, str17, str18, z27, localDateTime4, localDateTime5, localDateTime6, bVar2, str19, z28, z29, str20, cVar2, eVar2, z20);
    }

    public final Coupon d(long offerId, boolean isSuggested, boolean isHidden, String couponInclusionGroupTag, String couponExpirationGroupTag, boolean isClipped, boolean isSpecialOffer, String title, String description, List<String> tags, String hatText, d hatColor, EnumC0417a borderColor, boolean isMeijerBuck, boolean isShowLargeImage, String imageURL, String largeImageURL, String termsAndConditions, boolean isManufacturerCoupon, LocalDateTime redemptionStartDate, LocalDateTime redemptionEndDate, LocalDateTime redemptionDate, CouponCategory category, String categoryName, boolean isAddedToShoppingList, boolean isHideBundleTag, String validThrough, c earnCondition, e reward, boolean isSpecialBuyCouponType) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(hatColor, "hatColor");
        Intrinsics.j(borderColor, "borderColor");
        Intrinsics.j(earnCondition, "earnCondition");
        Intrinsics.j(reward, "reward");
        return new Coupon(offerId, isSuggested, isHidden, couponInclusionGroupTag, couponExpirationGroupTag, isClipped, isSpecialOffer, title, description, tags, hatText, hatColor, borderColor, isMeijerBuck, isShowLargeImage, imageURL, largeImageURL, termsAndConditions, isManufacturerCoupon, redemptionStartDate, redemptionEndDate, redemptionDate, category, categoryName, isAddedToShoppingList, isHideBundleTag, validThrough, earnCondition, reward, isSpecialBuyCouponType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coupon)) {
            return false;
        }
        Coupon coupon = (Coupon) other;
        return this.offerId == coupon.offerId && this.isSuggested == coupon.isSuggested && this.isHidden == coupon.isHidden && Intrinsics.e(this.couponInclusionGroupTag, coupon.couponInclusionGroupTag) && Intrinsics.e(this.couponExpirationGroupTag, coupon.couponExpirationGroupTag) && this.isClipped == coupon.isClipped && this.isSpecialOffer == coupon.isSpecialOffer && Intrinsics.e(this.title, coupon.title) && Intrinsics.e(this.description, coupon.description) && Intrinsics.e(this.tags, coupon.tags) && Intrinsics.e(this.hatText, coupon.hatText) && this.hatColor == coupon.hatColor && this.borderColor == coupon.borderColor && this.isMeijerBuck == coupon.isMeijerBuck && this.isShowLargeImage == coupon.isShowLargeImage && Intrinsics.e(this.imageURL, coupon.imageURL) && Intrinsics.e(this.largeImageURL, coupon.largeImageURL) && Intrinsics.e(this.termsAndConditions, coupon.termsAndConditions) && this.isManufacturerCoupon == coupon.isManufacturerCoupon && Intrinsics.e(this.redemptionStartDate, coupon.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, coupon.redemptionEndDate) && Intrinsics.e(this.redemptionDate, coupon.redemptionDate) && Intrinsics.e(this.category, coupon.category) && Intrinsics.e(this.categoryName, coupon.categoryName) && this.isAddedToShoppingList == coupon.isAddedToShoppingList && this.isHideBundleTag == coupon.isHideBundleTag && Intrinsics.e(this.validThrough, coupon.validThrough) && Intrinsics.e(this.earnCondition, coupon.earnCondition) && Intrinsics.e(this.reward, coupon.reward) && this.isSpecialBuyCouponType == coupon.isSpecialBuyCouponType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.offerId);
        dest.writeInt(this.isSuggested ? 1 : 0);
        dest.writeInt(this.isHidden ? 1 : 0);
        dest.writeString(this.couponInclusionGroupTag);
        dest.writeString(this.couponExpirationGroupTag);
        dest.writeInt(this.isClipped ? 1 : 0);
        dest.writeInt(this.isSpecialOffer ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeStringList(this.tags);
        dest.writeString(this.hatText);
        dest.writeString(this.hatColor.name());
        dest.writeString(this.borderColor.name());
        dest.writeInt(this.isMeijerBuck ? 1 : 0);
        dest.writeInt(this.isShowLargeImage ? 1 : 0);
        dest.writeString(this.imageURL);
        dest.writeString(this.largeImageURL);
        dest.writeString(this.termsAndConditions);
        dest.writeInt(this.isManufacturerCoupon ? 1 : 0);
        dest.writeSerializable(this.redemptionStartDate);
        dest.writeSerializable(this.redemptionEndDate);
        dest.writeSerializable(this.redemptionDate);
        CouponCategory bVar = this.category;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.categoryName);
        dest.writeInt(this.isAddedToShoppingList ? 1 : 0);
        dest.writeInt(this.isHideBundleTag ? 1 : 0);
        dest.writeString(this.validThrough);
        dest.writeParcelable(this.earnCondition, flags);
        dest.writeParcelable(this.reward, flags);
        dest.writeInt(this.isSpecialBuyCouponType ? 1 : 0);
    }

    /* renamed from: A, reason: from getter */
    public final boolean getIsManufacturerCoupon() {
        return this.isManufacturerCoupon;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getIsMeijerBuck() {
        return this.isMeijerBuck;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsShowLargeImage() {
        return this.isShowLargeImage;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getIsSpecialBuyCouponType() {
        return this.isSpecialBuyCouponType;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getIsSpecialOffer() {
        return this.isSpecialOffer;
    }

    public final void G(boolean z10) {
        this.isAddedToShoppingList = z10;
    }

    public final void I(boolean z10) {
        this.isClipped = z10;
    }

    public final void J(boolean z10) {
        this.isHidden = z10;
    }

    @Override // Ok.c
    /* renamed from: Z0, reason: from getter */
    public long getOfferId() {
        return this.offerId;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public final boolean c() {
        return this.isSpecialOffer;
    }

    /* renamed from: f, reason: from getter */
    public final CouponCategory getCategory() {
        return this.category;
    }

    /* renamed from: g, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Override // Ok.f
    public String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.offerId) * 31) + Boolean.hashCode(this.isSuggested)) * 31) + Boolean.hashCode(this.isHidden)) * 31;
        String str = this.couponInclusionGroupTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.couponExpirationGroupTag;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isClipped)) * 31) + Boolean.hashCode(this.isSpecialOffer)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.tags.hashCode()) * 31;
        String str3 = this.hatText;
        int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.hatColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + Boolean.hashCode(this.isMeijerBuck)) * 31) + Boolean.hashCode(this.isShowLargeImage)) * 31;
        String str4 = this.imageURL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.largeImageURL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.termsAndConditions;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Boolean.hashCode(this.isManufacturerCoupon)) * 31;
        LocalDateTime localDateTime = this.redemptionStartDate;
        int iHashCode8 = (iHashCode7 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.redemptionEndDate;
        int iHashCode9 = (iHashCode8 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        LocalDateTime localDateTime3 = this.redemptionDate;
        int iHashCode10 = (iHashCode9 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
        CouponCategory bVar = this.category;
        int iHashCode11 = (iHashCode10 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str7 = this.categoryName;
        int iHashCode12 = (((((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + Boolean.hashCode(this.isAddedToShoppingList)) * 31) + Boolean.hashCode(this.isHideBundleTag)) * 31;
        String str8 = this.validThrough;
        return ((((((iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.earnCondition.hashCode()) * 31) + this.reward.hashCode()) * 31) + Boolean.hashCode(this.isSpecialBuyCouponType);
    }

    /* renamed from: i, reason: from getter */
    public final c getEarnCondition() {
        return this.earnCondition;
    }

    /* renamed from: j, reason: from getter */
    public final String getHatText() {
        return this.hatText;
    }

    /* renamed from: k, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: n, reason: from getter */
    public final LocalDateTime getRedemptionDate() {
        return this.redemptionDate;
    }

    /* renamed from: o, reason: from getter */
    public final LocalDateTime getRedemptionEndDate() {
        return this.redemptionEndDate;
    }

    /* renamed from: q, reason: from getter */
    public final LocalDateTime getRedemptionStartDate() {
        return this.redemptionStartDate;
    }

    /* renamed from: r, reason: from getter */
    public final e getReward() {
        return this.reward;
    }

    public final String s() {
        String str = (String) CollectionsKt.u0(this.tags);
        return str == null ? "" : str;
    }

    /* renamed from: t, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public String toString() {
        return "Coupon(offerId=" + this.offerId + ", isSuggested=" + this.isSuggested + ", isHidden=" + this.isHidden + ", couponInclusionGroupTag=" + this.couponInclusionGroupTag + ", couponExpirationGroupTag=" + this.couponExpirationGroupTag + ", isClipped=" + this.isClipped + ", isSpecialOffer=" + this.isSpecialOffer + ", title=" + this.title + ", description=" + this.description + ", tags=" + this.tags + ", hatText=" + this.hatText + ", hatColor=" + this.hatColor + ", borderColor=" + this.borderColor + ", isMeijerBuck=" + this.isMeijerBuck + ", isShowLargeImage=" + this.isShowLargeImage + ", imageURL=" + this.imageURL + ", largeImageURL=" + this.largeImageURL + ", termsAndConditions=" + this.termsAndConditions + ", isManufacturerCoupon=" + this.isManufacturerCoupon + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", redemptionDate=" + this.redemptionDate + ", category=" + this.category + ", categoryName=" + this.categoryName + ", isAddedToShoppingList=" + this.isAddedToShoppingList + ", isHideBundleTag=" + this.isHideBundleTag + ", validThrough=" + this.validThrough + ", earnCondition=" + this.earnCondition + ", reward=" + this.reward + ", isSpecialBuyCouponType=" + this.isSpecialBuyCouponType + ')';
    }

    /* renamed from: v, reason: from getter */
    public final String getValidThrough() {
        return this.validThrough;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsAddedToShoppingList() {
        return this.isAddedToShoppingList;
    }

    public final boolean x() {
        return this.isClipped;
    }

    public final boolean y() {
        return this.isHidden;
    }

    public /* synthetic */ Coupon(long j10, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, String str3, String str4, List list, String str5, d dVar, EnumC0417a enumC0417a, boolean z14, boolean z15, String str6, String str7, String str8, boolean z16, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, CouponCategory bVar, String str9, boolean z17, boolean z18, String str10, c cVar, e eVar, boolean z19, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, (i10 & 128) != 0 ? "" : str3, (i10 & 256) != 0 ? "" : str4, (i10 & 512) != 0 ? CollectionsKt.e("") : list, (i10 & 1024) != 0 ? null : str5, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? d.f24021a : dVar, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? EnumC0417a.f24012a : enumC0417a, (i10 & 8192) != 0 ? false : z14, (i10 & 16384) != 0 ? false : z15, (32768 & i10) != 0 ? null : str6, (65536 & i10) != 0 ? null : str7, (131072 & i10) != 0 ? null : str8, (262144 & i10) != 0 ? false : z16, (524288 & i10) != 0 ? null : localDateTime, (1048576 & i10) != 0 ? null : localDateTime2, (2097152 & i10) != 0 ? null : localDateTime3, (4194304 & i10) != 0 ? null : bVar, (8388608 & i10) != 0 ? null : str9, (16777216 & i10) != 0 ? false : z17, (33554432 & i10) != 0 ? false : z18, (67108864 & i10) != 0 ? null : str10, (134217728 & i10) != 0 ? c.b.f24019b : cVar, (268435456 & i10) != 0 ? e.b.f24028b : eVar, (i10 & 536870912) != 0 ? false : z19);
    }
}
