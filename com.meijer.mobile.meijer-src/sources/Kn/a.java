package Kn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LKn/a;", "", "<init>", "()V", "", "firstFilter", "filterBy", "", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "", "", "Ljava/util/Map;", "analyticsFilterProductList", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "c", "Ljava/lang/StringBuilder;", "productFilterByResultString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17577a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Map<String, List<String>> analyticsFilterProductList = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static StringBuilder productFilterByResultString = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public static final int f17580d = 8;

    public final String a() {
        productFilterByResultString = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : analyticsFilterProductList.entrySet()) {
            List<String> value = entry.getValue();
            if (value != null) {
                for (String str : value) {
                    StringBuilder sb2 = productFilterByResultString;
                    sb2.append(entry.getKey());
                    sb2.append(":");
                    if (!Intrinsics.e(entry.getKey(), "price")) {
                        productFilterByResultString.append(str);
                    } else if (StringsKt.d0(str, "and less", false, 2, null)) {
                        StringBuilder sb3 = productFilterByResultString;
                        sb3.append("0 to ");
                        sb3.append(StringsKt.Q(StringsKt.Q(str, "$", "", false, 4, null), "and less", "", false, 4, null));
                    } else {
                        productFilterByResultString.append(StringsKt.Q(StringsKt.Q(str, "$", "", false, 4, null), "-", "to", false, 4, null));
                    }
                    productFilterByResultString.append("|");
                }
            }
        }
        analyticsFilterProductList = new LinkedHashMap();
        String string = productFilterByResultString.toString();
        Intrinsics.i(string, "toString(...)");
        return StringsKt.M0(string, "|");
    }

    public final void b(String firstFilter, String filterBy) {
        List<String> list;
        Intrinsics.j(firstFilter, "firstFilter");
        ArrayList arrayList = new ArrayList();
        if (filterBy != null) {
            Map<String, List<String>> map = analyticsFilterProductList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> value = entry.getValue();
                if (value != null && value.contains(filterBy)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map<String, List<String>> map2 = analyticsFilterProductList;
            if (linkedHashMap.isEmpty()) {
                if (analyticsFilterProductList.containsKey(firstFilter)) {
                    List<String> list2 = analyticsFilterProductList.get(firstFilter);
                    if (list2 != null) {
                        list2.add(filterBy);
                    }
                } else {
                    arrayList.add(filterBy);
                    analyticsFilterProductList.put(firstFilter, arrayList);
                }
                list = analyticsFilterProductList.get(firstFilter);
            } else {
                List<String> list3 = analyticsFilterProductList.get(firstFilter);
                if (list3 != null) {
                    list3.remove(filterBy);
                }
                list = analyticsFilterProductList.get(firstFilter);
            }
            map2.put(firstFilter, list);
        }
    }

    private a() {
    }
}
