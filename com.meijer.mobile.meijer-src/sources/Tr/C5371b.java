package Tr;

import Pk.Coupon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0011J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#¨\u0006%"}, d2 = {"LTr/b;", "", "<init>", "()V", "LPk/a;", "coupon", "", "d", "(LPk/a;)I", "", "tag", "", "siblingTags", "", "g", "(Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljava/lang/String;)V", "LTr/B;", "couponsListChange", "a", "(LTr/B;)V", "b", "", "e", "()Z", "f", "(Ljava/lang/String;)Z", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "couponsChanged", "", "LTr/b$a;", "Ljava/util/Map;", "registeredFragments", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Tr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5371b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<CouponsListChange> couponsChanged = new ArrayList();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, a> registeredFragments = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LTr/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tr.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36755a = new a("REGISTERED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f36756b = new a("CLEAR", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f36757c = new a("FORCE_REFRESH", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f36758d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f36759e;

        static {
            a[] aVarArrA = a();
            f36758d = aVarArrA;
            f36759e = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f36755a, f36756b, f36757c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36758d.clone();
        }

        private a(String str, int i10) {
        }
    }

    private final int d(Coupon coupon) {
        Integer next;
        Iterator<Integer> it = CollectionsKt.n(this.couponsChanged).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Coupon coupon2 = this.couponsChanged.get(next.intValue()).getCoupon();
            if (coupon2 != null && coupon2.getOfferId() == coupon.getOfferId()) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void a(CouponsListChange couponsListChange) {
        Intrinsics.j(couponsListChange, "couponsListChange");
        Coupon coupon = couponsListChange.getCoupon();
        Intrinsics.g(coupon);
        int iD = d(coupon);
        if (iD > -1) {
            this.couponsChanged.set(iD, couponsListChange);
        } else {
            this.couponsChanged.add(couponsListChange);
        }
    }

    public final void b(String tag) {
        Intrinsics.j(tag, "tag");
        this.registeredFragments.put(tag, a.f36756b);
        Iterator<a> it = this.registeredFragments.values().iterator();
        while (it.hasNext()) {
            if (it.next() == a.f36755a) {
                return;
            }
        }
        this.couponsChanged.clear();
        Iterator<T> it2 = this.registeredFragments.keySet().iterator();
        while (it2.hasNext()) {
            this.registeredFragments.put((String) it2.next(), a.f36755a);
        }
    }

    public final List<CouponsListChange> c() {
        return this.couponsChanged;
    }

    public final boolean e() {
        return !this.couponsChanged.isEmpty();
    }

    public final boolean f(String tag) {
        Intrinsics.j(tag, "tag");
        if (this.registeredFragments.get(tag) != a.f36757c) {
            return false;
        }
        this.registeredFragments.put(tag, a.f36755a);
        return true;
    }

    public final void g(String tag, List<String> siblingTags) {
        Intrinsics.j(tag, "tag");
        Intrinsics.j(siblingTags, "siblingTags");
        if (!siblingTags.isEmpty()) {
            for (String str : this.registeredFragments.keySet()) {
                if (!CollectionsKt.h0(siblingTags, str)) {
                    a aVar = this.registeredFragments.get(str);
                    a aVar2 = a.f36757c;
                    if (aVar != aVar2) {
                        this.registeredFragments.put(str, aVar2);
                    }
                }
            }
        }
        this.registeredFragments.put(tag, a.f36755a);
        this.couponsChanged.clear();
    }

    public final void h(String tag) {
        Intrinsics.j(tag, "tag");
        this.registeredFragments.remove(tag);
    }
}
