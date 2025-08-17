package an;

import Qo.l;
import com.fullstory.FS;
import com.fullstory.FSPage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mk.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQo/l;", "Lcom/fullstory/FSPage;", "a", "(LQo/l;)Lcom/fullstory/FSPage;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: an.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5611a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: an.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0949a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f150120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f150121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FSPage a(l lVar) {
        String str;
        Map mapK;
        Intrinsics.j(lVar, "<this>");
        boolean z10 = lVar instanceof l.BrowseCollection;
        if (z10) {
            str = "Collections";
        } else if (lVar instanceof l.Coupon) {
            str = "Coupon";
        } else if (lVar instanceof l.Reward) {
            str = "Reward";
        } else if (lVar instanceof l.Department) {
            str = "Departments";
        } else if (lVar instanceof l.Favorites) {
            str = "Favorites";
        } else if (lVar instanceof l.ShoppingList) {
            str = "ShoppingList";
        } else if (lVar instanceof l.Search) {
            str = "Search";
        } else if (lVar instanceof l.Recommendations) {
            str = "";
        } else {
            if (!(lVar instanceof l.Personalized)) {
                throw new NoWhenBranchMatchedException();
            }
            int i10 = C0949a.$EnumSwitchMapping$0[((l.Personalized) lVar).getCategory().ordinal()];
            if (i10 == 1) {
                str = "Favorites on Sale";
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Buy Again";
            }
        }
        boolean z11 = lVar instanceof l.Department;
        String str2 = null;
        String strS = z11 ? StringsKt.S(((l.Department) lVar).getDepartment().getLevel(), "L", "T", false, 4, null) : null;
        if (z10) {
            l.BrowseCollection browseCollection = (l.BrowseCollection) lVar;
            mapK = MapsKt.o(TuplesKt.a("collection", browseCollection.getCollection().getName()), TuplesKt.a("collectionId", browseCollection.getCollection().getCollectionId()));
        } else if (lVar instanceof l.Coupon) {
            mapK = MapsKt.g(TuplesKt.a("couponId", Long.valueOf(((l.Coupon) lVar).getCoupon().getOfferId())));
        } else if (lVar instanceof l.Reward) {
            mapK = MapsKt.k();
        } else if (z11) {
            l.Department department = (l.Department) lVar;
            mapK = MapsKt.o(TuplesKt.a("tier", department.getDepartment().getName()), TuplesKt.a("departmentId", department.getDepartment().getId()));
        } else if (lVar instanceof l.Recommendations) {
            mapK = MapsKt.k();
        } else if (lVar instanceof l.Search) {
            mapK = MapsKt.g(TuplesKt.a("query", ((l.Search) lVar).getTerm()));
        } else {
            if (!(lVar instanceof l.Favorites) && !(lVar instanceof l.ShoppingList) && !(lVar instanceof l.Personalized)) {
                throw new NoWhenBranchMatchedException();
            }
            mapK = MapsKt.k();
        }
        if (StringsKt.r0(str)) {
            str = null;
        }
        if (strS != null && !StringsKt.r0(strS)) {
            str2 = strS;
        }
        FSPage fSPagePage = FS.page(CollectionsKt.B0(CollectionsKt.r("PLP", str, str2), " | ", null, null, 0, null, null, 62, null), mapK);
        Intrinsics.i(fSPagePage, "page(...)");
        return fSPagePage;
    }
}
