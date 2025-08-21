package Oo;

import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.l;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yk.C18325a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\n\u001a\u00020\t*\u001c\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQo/l;", "", "a", "(LQo/l;)Ljava/lang/String;", "", "LQo/a;", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "", "c", "(Ljava/util/Map;)Z", "displayName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {
    public static final boolean c(Map<FilterFacet, List<FilterFacetOption>> map) {
        String lowerCase;
        if (map == null || map.size() > 2) {
            return false;
        }
        for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : map.entrySet()) {
            String displayName = entry.getKey().getDisplayName();
            String lowerCase2 = null;
            if (displayName != null) {
                lowerCase = displayName.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!Intrinsics.e(lowerCase, "price")) {
                String displayName2 = entry.getKey().getDisplayName();
                if (displayName2 != null) {
                    lowerCase2 = displayName2.toLowerCase(Locale.ROOT);
                    Intrinsics.i(lowerCase2, "toLowerCase(...)");
                }
                if (!Intrinsics.e(lowerCase2, "brand")) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String a(l lVar) {
        String lowerCase;
        Intrinsics.j(lVar, "<this>");
        if (!(lVar instanceof l.k)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Map<FilterFacet, List<FilterFacetOption>> mapF3 = ((l.k) lVar).F3();
        if (mapF3 != null) {
            if (!c(mapF3)) {
                return null;
            }
            int i10 = 0;
            for (Object obj : mapF3.entrySet()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb3 = new StringBuilder();
                int i12 = 0;
                for (Object obj2 : (Iterable) entry.getValue()) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.w();
                    }
                    String value = ((FilterFacetOption) obj2).getValue();
                    String displayName = ((FilterFacet) entry.getKey()).getDisplayName();
                    if (displayName != null) {
                        lowerCase = displayName.toLowerCase(Locale.ROOT);
                        Intrinsics.i(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (Intrinsics.e(lowerCase, "price")) {
                        value = value != null ? StringsKt.Q(value, "\"", "", false, 4, null) : null;
                        if (value != null && StringsKt.d0(value, "-inf-5", false, 2, null)) {
                            value = "0-5";
                        }
                    }
                    sb3.append(value);
                    if (C18325a.a((List) entry.getValue(), i12)) {
                        sb3.append(",");
                    }
                    i12 = i13;
                }
                sb2.append('(' + b(((FilterFacet) entry.getKey()).getDisplayName()) + ",in," + ((Object) sb3) + ')');
                if (C18325a.b(mapF3, i10)) {
                    sb2.append(",");
                }
                i10 = i11;
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private static final String b(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return Intrinsics.e(lowerCase, "price") ? "price_Id" : Intrinsics.e(lowerCase, "brand") ? "brand" : "";
    }
}
