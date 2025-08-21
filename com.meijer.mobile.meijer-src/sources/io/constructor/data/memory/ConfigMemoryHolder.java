package io.constructor.data.memory;

import Cu.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RL\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00160\u00102\u001a\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00160\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/constructor/data/memory/ConfigMemoryHolder;", "", "()V", "autocompleteResultCount", "", "", "", "getAutocompleteResultCount", "()Ljava/util/Map;", "setAutocompleteResultCount", "(Ljava/util/Map;)V", "backingString", "defaultAnalyticsTags", "getDefaultAnalyticsTags", "setDefaultAnalyticsTags", "segments", "", "getSegments", "()Ljava/util/List;", "setSegments", "(Ljava/util/List;)V", "value", "Lkotlin/Pair;", "testCellParams", "getTestCellParams", "setTestCellParams", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigMemoryHolder {
    private Map<String, Integer> autocompleteResultCount;
    private Map<String, String> defaultAnalyticsTags;
    private String userId;
    private String backingString = "";
    private List<String> segments = CollectionsKt.m();

    public final Map<String, Integer> getAutocompleteResultCount() {
        return this.autocompleteResultCount;
    }

    public final Map<String, String> getDefaultAnalyticsTags() {
        return this.defaultAnalyticsTags;
    }

    public final List<String> getSegments() {
        return this.segments;
    }

    public final List<Pair<String, String>> getTestCellParams() {
        ArrayList arrayList = new ArrayList();
        String str = this.backingString;
        if (str.length() > 0) {
            Iterator it = StringsKt.b1(str, new String[]{";"}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                List listB1 = StringsKt.b1((String) it.next(), new String[]{"="}, false, 0, 6, null);
                arrayList.add(TuplesKt.a(String.valueOf(a.a((String) listB1.get(0))), a.a((String) listB1.get(1))));
            }
        }
        return arrayList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setAutocompleteResultCount(Map<String, Integer> map) {
        this.autocompleteResultCount = map;
    }

    public final void setDefaultAnalyticsTags(Map<String, String> map) {
        this.defaultAnalyticsTags = map;
    }

    public final void setSegments(List<String> list) {
        Intrinsics.j(list, "<set-?>");
        this.segments = list;
    }

    public final void setTestCellParams(List<Pair<String, String>> value) {
        String str;
        Intrinsics.j(value, "value");
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((Pair) obj) != null) {
                arrayList.add(obj);
            }
        }
        String str2 = "";
        int i10 = 0;
        for (Object obj2 : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            Pair pair = (Pair) obj2;
            if (i10 == 0) {
                Intrinsics.g(pair);
                str = a.b((String) pair.c()) + "=" + a.b((String) pair.d());
            } else {
                Intrinsics.g(pair);
                str = ";" + a.b((String) pair.c()) + "=" + a.b((String) pair.d());
            }
            str2 = ((Object) str2) + str;
            i10 = i11;
        }
        this.backingString = str2;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }
}
