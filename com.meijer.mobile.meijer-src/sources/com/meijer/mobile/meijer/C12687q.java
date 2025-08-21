package com.meijer.mobile.meijer;

import Co.Category;
import Co.Department;
import Hc.a;
import Qo.l;
import gi.C14377e;
import gi.C14381i;
import gi.EnumC14378f;
import gi.GoogleAdData;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u0004\u0018\u00010\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001b\u001a\u0004\u0018\u00010\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\t2\n\u0010\u001f\u001a\u00060\tj\u0002`\u001e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/q;", "", "<init>", "()V", "Lgi/f;", "gamAds", "LQo/l$d;", "productQuery", "", "", "tiers", "", "isEnabled", "shopperId", "", "adSlotPosition", "Lgi/d;", "b", "(Lgi/f;LQo/l$d;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/Integer;)Lgi/d;", "", "LQo/l$i;", "f", "(Ljava/util/List;LQo/l$i;ZLjava/lang/String;Ljava/lang/Integer;)Lgi/d;", "LQo/l$a;", "a", "(Lgi/f;LQo/l$a;ZLjava/lang/String;Ljava/lang/Integer;)Lgi/d;", "LQo/l$f;", "e", "(Ljava/util/List;LQo/l$f;ZLjava/lang/String;Ljava/lang/Integer;)Lgi/d;", "pageType", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "LCo/a;", "categories", "d", "(Lgi/f;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lgi/d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12687q {

    /* renamed from: a, reason: collision with root package name */
    public static final C12687q f113757a = new C12687q();

    public static /* synthetic */ GoogleAdData c(C12687q c12687q, EnumC14378f enumC14378f, l.Department department, Map map, boolean z10, String str, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = MapsKt.k();
        }
        Map map2 = map;
        if ((i10 & 32) != 0) {
            num = null;
        }
        return c12687q.b(enumC14378f, department, map2, z10, str, num);
    }

    public final GoogleAdData a(EnumC14378f gamAds, l.BrowseCollection productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Department collection;
        Intrinsics.j(gamAds, "gamAds");
        String name = (productQuery == null || (collection = productQuery.getCollection()) == null) ? null : collection.getName();
        if (name == null || StringsKt.s0(name) || productQuery == null) {
            return null;
        }
        C14377e c14377e = C14377e.f134254a;
        a.C0201a c0201aG = new a.C0201a().g("Collection_Name", productQuery.getCollection().getCollectionId());
        Intrinsics.i(c0201aG, "addCustomTargeting(...)");
        return c14377e.a(gamAds, "CollectionsPage", isEnabled, c0201aG, shopperId, adSlotPosition);
    }

    public final GoogleAdData b(EnumC14378f gamAds, l.Department productQuery, Map<String, String> tiers, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Intrinsics.j(gamAds, "gamAds");
        a.C0201a c0201a = new a.C0201a();
        if (tiers != null) {
            for (Map.Entry<String, String> entry : tiers.entrySet()) {
                c0201a.g(entry.getKey(), entry.getValue());
            }
        }
        if (productQuery == null) {
            return null;
        }
        C14377e c14377e = C14377e.f134254a;
        String lowerCase = StringsKt.N1(productQuery.getDepartment().getId(), 2).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        String str = String.format("browse-%s", Arrays.copyOf(new Object[]{lowerCase}, 1));
        Intrinsics.i(str, "format(...)");
        return c14377e.a(gamAds, str, isEnabled, c0201a, shopperId, adSlotPosition);
    }

    public final GoogleAdData d(EnumC14378f gamAds, String pageType, String code, List<Category> categories, boolean isEnabled, String shopperId) {
        Intrinsics.j(gamAds, "gamAds");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(code, "code");
        List<Category> list = categories;
        if (list == null || list.isEmpty()) {
            return null;
        }
        a.C0201a c0201a = new a.C0201a();
        c0201a.g("sku", code);
        for (Category category : categories) {
            String lowerCase = StringsKt.w1(category.getCode(), "-", null, 2, null).toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            c0201a.g("category_" + lowerCase, category.getName());
        }
        return C14377e.b(C14377e.f134254a, gamAds, pageType, isEnabled, c0201a, shopperId, null, 32, null);
    }

    public final GoogleAdData e(List<? extends EnumC14378f> gamAds, l.Personalized productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        nk.d category;
        Intrinsics.j(gamAds, "gamAds");
        String strName = (productQuery == null || (category = productQuery.getCategory()) == null) ? null : category.name();
        if (strName == null || StringsKt.s0(strName) || productQuery == null) {
            return null;
        }
        a.C0201a c0201a = new a.C0201a();
        String lowerCase = productQuery.getCategory().name().toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        a.C0201a c0201aG = c0201a.g("personalized_type", lowerCase);
        Intrinsics.i(c0201aG, "addCustomTargeting(...)");
        return C14381i.c(gamAds, "personalized_collections", isEnabled, c0201aG, shopperId, adSlotPosition);
    }

    public final GoogleAdData f(List<? extends EnumC14378f> gamAds, l.Search productQuery, boolean isEnabled, String shopperId, Integer adSlotPosition) {
        Intrinsics.j(gamAds, "gamAds");
        String term = productQuery != null ? productQuery.getTerm() : null;
        if (term == null || StringsKt.s0(term) || productQuery == null) {
            return null;
        }
        a.C0201a c0201aG = new a.C0201a().g("search_query", productQuery.getTerm());
        Intrinsics.i(c0201aG, "addCustomTargeting(...)");
        return C14381i.c(gamAds, "search", isEnabled, c0201aG, shopperId, adSlotPosition);
    }

    private C12687q() {
    }
}
