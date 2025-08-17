package com.meijer.mobile.meijer;

import Co.Category;
import Co.Department;
import Fc.a;
import Qo.l;
import fi.C13904e;
import fi.C13908i;
import fi.EnumC13905f;
import fi.GoogleAdData;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u0004\u0018\u00010\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001b\u001a\u0004\u0018\u00010\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t2\n\u0010\u001f\u001a\u00060\tj\u0002`\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/q;", "", "<init>", "()V", "Lfi/f;", "gamAds", "LQo/l$d;", "productQuery", "", "", "tiers", "", "isEnabled", "shopperId", "", "adSlotPosition", "Lfi/d;", "b", "(Lfi/f;LQo/l$d;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/Integer;)Lfi/d;", "", "LQo/l$i;", "f", "(Ljava/util/List;LQo/l$i;ZLjava/lang/String;Ljava/lang/Integer;)Lfi/d;", "LQo/l$a;", "a", "(Lfi/f;LQo/l$a;ZLjava/lang/String;Ljava/lang/Integer;)Lfi/d;", "LQo/l$f;", "e", "(Ljava/util/List;LQo/l$f;ZLjava/lang/String;Ljava/lang/Integer;)Lfi/d;", "pageType", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "LCo/a;", "categories", "d", "(Lfi/f;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lfi/d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12561q {

    /* renamed from: a, reason: collision with root package name */
    public static final C12561q f112905a = new C12561q();

    public static /* synthetic */ GoogleAdData c(C12561q c12561q, EnumC13905f enumC13905f, l.Department department, Map map, boolean z10, String str, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = MapsKt.k();
        }
        Map map2 = map;
        if ((i10 & 32) != 0) {
            num = null;
        }
        return c12561q.b(enumC13905f, department, map2, z10, str, num);
    }

    public final GoogleAdData a(EnumC13905f gamAds, l.BrowseCollection productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Department collection;
        Intrinsics.j(gamAds, "gamAds");
        String name = (productQuery == null || (collection = productQuery.getCollection()) == null) ? null : collection.getName();
        if (name == null || StringsKt.r0(name) || productQuery == null) {
            return null;
        }
        C13904e c13904e = C13904e.f131155a;
        a.C0145a c0145aG = new a.C0145a().g("Collection_Name", productQuery.getCollection().getCollectionId());
        Intrinsics.i(c0145aG, "addCustomTargeting(...)");
        return c13904e.a(gamAds, "CollectionsPage", isEnabled, c0145aG, shopperId, adSlotPosition);
    }

    public final GoogleAdData b(EnumC13905f gamAds, l.Department productQuery, Map<String, String> tiers, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Intrinsics.j(gamAds, "gamAds");
        a.C0145a c0145a = new a.C0145a();
        if (tiers != null) {
            for (Map.Entry<String, String> entry : tiers.entrySet()) {
                c0145a.g(entry.getKey(), entry.getValue());
            }
        }
        if (productQuery == null) {
            return null;
        }
        C13904e c13904e = C13904e.f131155a;
        String lowerCase = StringsKt.J1(productQuery.getDepartment().getId(), 2).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        String str = String.format("browse-%s", Arrays.copyOf(new Object[]{lowerCase}, 1));
        Intrinsics.i(str, "format(...)");
        return c13904e.a(gamAds, str, isEnabled, c0145a, shopperId, adSlotPosition);
    }

    public final GoogleAdData d(EnumC13905f gamAds, String pageType, String code, List<Category> categories, boolean isEnabled, String shopperId) {
        Intrinsics.j(gamAds, "gamAds");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(code, "code");
        List<Category> list = categories;
        if (list == null || list.isEmpty()) {
            return null;
        }
        a.C0145a c0145a = new a.C0145a();
        c0145a.g("sku", code);
        for (Category category : categories) {
            String lowerCase = StringsKt.s1(category.getCode(), "-", null, 2, null).toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            c0145a.g("category_" + lowerCase, category.getName());
        }
        return C13904e.b(C13904e.f131155a, gamAds, pageType, isEnabled, c0145a, shopperId, null, 32, null);
    }

    public final GoogleAdData e(List<? extends EnumC13905f> gamAds, l.Personalized productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        mk.d category;
        Intrinsics.j(gamAds, "gamAds");
        String strName = (productQuery == null || (category = productQuery.getCategory()) == null) ? null : category.name();
        if (strName == null || StringsKt.r0(strName) || productQuery == null) {
            return null;
        }
        a.C0145a c0145a = new a.C0145a();
        String lowerCase = productQuery.getCategory().name().toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        a.C0145a c0145aG = c0145a.g("personalized_type", lowerCase);
        Intrinsics.i(c0145aG, "addCustomTargeting(...)");
        return C13908i.c(gamAds, "personalized_collections", isEnabled, c0145aG, shopperId, adSlotPosition);
    }

    public final GoogleAdData f(List<? extends EnumC13905f> gamAds, l.Search productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Intrinsics.j(gamAds, "gamAds");
        String term = productQuery != null ? productQuery.getTerm() : null;
        if (term == null || StringsKt.r0(term) || productQuery == null) {
            return null;
        }
        a.C0145a c0145aG = new a.C0145a().g("search_query", productQuery.getTerm());
        Intrinsics.i(c0145aG, "addCustomTargeting(...)");
        return C13908i.c(gamAds, "search", isEnabled, c0145aG, shopperId, adSlotPosition);
    }

    private C12561q() {
    }
}
