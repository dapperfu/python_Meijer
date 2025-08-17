package Tr;

import Ok.Coupon;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LTr/B;", "", "LTr/B$a;", "type", "LOk/a;", "coupon", "<init>", "(LTr/B$a;LOk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTr/B$a;", "b", "()LTr/B$a;", "LOk/a;", "()LOk/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tr.B, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class CouponsListChange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coupon coupon;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LTr/B$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tr.B$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35394a = new a("CLIP", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f35395b = new a("UNCLIP", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f35396c = new a("DISMISS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f35397d = new a("ADD_TO_LIST", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f35398e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f35399f;

        static {
            a[] aVarArrA = a();
            f35398e = aVarArrA;
            f35399f = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f35394a, f35395b, f35396c, f35397d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35398e.clone();
        }

        private a(String str, int i10) {
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponsListChange)) {
            return false;
        }
        CouponsListChange couponsListChange = (CouponsListChange) other;
        return this.type == couponsListChange.type && Intrinsics.e(this.coupon, couponsListChange.coupon);
    }

    public CouponsListChange(a type, Coupon coupon) {
        Intrinsics.j(type, "type");
        this.type = type;
        this.coupon = coupon;
    }

    /* renamed from: a, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: b, reason: from getter */
    public final a getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Coupon coupon = this.coupon;
        return iHashCode + (coupon == null ? 0 : coupon.hashCode());
    }

    public String toString() {
        return "CouponsListChange(type=" + this.type + ", coupon=" + this.coupon + ')';
    }
}
