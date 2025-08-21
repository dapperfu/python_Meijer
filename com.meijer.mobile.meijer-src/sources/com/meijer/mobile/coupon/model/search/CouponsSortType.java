package com.meijer.mobile.coupon.model.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "l", "trackingName", "Companion", "a", "RELEVANCE", "NEWEST", "EXPIRING", "VALUE", "CATEGORY_RELEVANCE", "CATEGORY_NEWEST", "CATEGORY_EXPIRING", "CATEGORY_VALUE", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CouponsSortType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CouponsSortType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String displayName;

    @g(name = "BySuggested")
    public static final CouponsSortType RELEVANCE = new CouponsSortType("RELEVANCE", 0, "Relevance");

    @g(name = "ByNewest")
    public static final CouponsSortType NEWEST = new CouponsSortType("NEWEST", 1, "Newest");

    @g(name = "ByExpiring")
    public static final CouponsSortType EXPIRING = new CouponsSortType("EXPIRING", 2, "Expiring");

    @g(name = "ByHighestValue")
    public static final CouponsSortType VALUE = new CouponsSortType("VALUE", 3, "Value");

    @g(name = "ByDepartmentSuggested")
    public static final CouponsSortType CATEGORY_RELEVANCE = new CouponsSortType("CATEGORY_RELEVANCE", 4, "Relevance Category");

    @g(name = "ByDepartmentNewest")
    public static final CouponsSortType CATEGORY_NEWEST = new CouponsSortType("CATEGORY_NEWEST", 5, "Newest Category");

    @g(name = "ByDepartmentExpiring")
    public static final CouponsSortType CATEGORY_EXPIRING = new CouponsSortType("CATEGORY_EXPIRING", 6, "Expiring Category");

    @g(name = "ByDepartmentHighestValue")
    public static final CouponsSortType CATEGORY_VALUE = new CouponsSortType("CATEGORY_VALUE", 7, "Highest Value Category");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/coupon/model/search/CouponsSortType$a;", "", "<init>", "()V", "", "name", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "a", "(Ljava/lang/String;)Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.coupon.model.search.CouponsSortType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CouponsSortType a(String name) {
            CouponsSortType next;
            Iterator<CouponsSortType> it = CouponsSortType.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (StringsKt.H(next.getDisplayName(), name, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            return next;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CouponsSortType.values().length];
            try {
                iArr[CouponsSortType.NEWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CouponsSortType.CATEGORY_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CouponsSortType.EXPIRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CouponsSortType.CATEGORY_EXPIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CouponsSortType.VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CouponsSortType.CATEGORY_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CouponsSortType.RELEVANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CouponsSortType.CATEGORY_RELEVANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CouponsSortType[] a() {
        return new CouponsSortType[]{RELEVANCE, NEWEST, EXPIRING, VALUE, CATEGORY_RELEVANCE, CATEGORY_NEWEST, CATEGORY_EXPIRING, CATEGORY_VALUE};
    }

    public static EnumEntries<CouponsSortType> e() {
        return $ENTRIES;
    }

    static {
        CouponsSortType[] couponsSortTypeArrA = a();
        $VALUES = couponsSortTypeArrA;
        $ENTRIES = EnumEntriesKt.a(couponsSortTypeArrA);
        INSTANCE = new Companion(null);
    }

    public static CouponsSortType valueOf(String str) {
        return (CouponsSortType) Enum.valueOf(CouponsSortType.class, str);
    }

    public static CouponsSortType[] values() {
        return (CouponsSortType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final String l() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return NEWEST.displayName;
            case 3:
            case 4:
                return EXPIRING.displayName;
            case 5:
            case 6:
                return VALUE.displayName;
            case 7:
            case 8:
                return RELEVANCE.displayName;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private CouponsSortType(String str, int i10, String str2) {
        this.displayName = str2;
    }
}
