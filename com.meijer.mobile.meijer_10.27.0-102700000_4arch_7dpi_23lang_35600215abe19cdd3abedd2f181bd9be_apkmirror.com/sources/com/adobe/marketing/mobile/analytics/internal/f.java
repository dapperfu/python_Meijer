package com.adobe.marketing.mobile.analytics.internal;

import androidx.recyclerview.widget.RecyclerView;
import f6.C13845a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/f;", "", "a", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007JC\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/f$a;", "", "<init>", "()V", "", "idType", "d", "(Ljava/lang/String;)Ljava/lang/String;", "c", "Lcom/adobe/marketing/mobile/analytics/internal/g;", "state", "", "data", "vars", "a", "(Lcom/adobe/marketing/mobile/analytics/internal/g;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "", "", "visitorIDs", "b", "(Ljava/util/List;)Ljava/lang/String;", "", "REQUEST_STRINGBUILDER_CAPACITY", "I", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.analytics.internal.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(List<? extends Map<String, ? extends Object>> visitorIDs) {
            if (visitorIDs == null) {
                return null;
            }
            HashMap map = new HashMap();
            for (Map<String, ? extends Object> map2 : visitorIDs) {
                String strO = C13845a.o(map2, "ID_TYPE", null);
                if (strO != null) {
                    String strD = d(strO);
                    String strO2 = C13845a.o(map2, "ID", null);
                    Intrinsics.i(strO2, "optString(visitorID, Ana…ntity.VisitorID.ID, null)");
                    map.put(strD, strO2);
                    map.put(c(strO), String.valueOf(C13845a.m(map2, "STATE", 0)));
                }
            }
            HashMap map3 = new HashMap();
            h hVarJ = i.j(map);
            Intrinsics.i(hVarJ, "translateContextData(visitorIdMap)");
            map3.put("cid", hVarJ);
            StringBuilder sb2 = new StringBuilder(RecyclerView.m.FLAG_MOVED);
            i.i(map3, sb2);
            return sb2.toString();
        }

        private Companion() {
        }

        private final String c(String idType) {
            return idType + ".as";
        }

        private final String d(String idType) {
            return idType + ".id";
        }

        public final String a(g state, Map<String, String> data, Map<String, String> vars) {
            Intrinsics.j(state, "state");
            HashMap map = vars == null ? new HashMap() : new HashMap(vars);
            if (data != null) {
                Iterator<Map.Entry<String, String>> it = data.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    if (key == null) {
                        it.remove();
                    } else if (StringsKt.W(key, "&&", false, 2, null)) {
                        String strSubstring = key.substring(2);
                        Intrinsics.i(strSubstring, "this as java.lang.String).substring(startIndex)");
                        map.put(strSubstring, value);
                        it.remove();
                    }
                }
            }
            h hVarJ = i.j(data);
            Intrinsics.i(hVarJ, "translateContextData(data)");
            map.put("c", hVarJ);
            StringBuilder sb2 = new StringBuilder(RecyclerView.m.FLAG_MOVED);
            sb2.append("ndh=1");
            if (state.y() && state.getSerializedVisitorIDsList() != null) {
                sb2.append(state.getSerializedVisitorIDsList());
            }
            i.i(map, sb2);
            String string = sb2.toString();
            Intrinsics.i(string, "requestString.toString()");
            return string;
        }
    }
}
