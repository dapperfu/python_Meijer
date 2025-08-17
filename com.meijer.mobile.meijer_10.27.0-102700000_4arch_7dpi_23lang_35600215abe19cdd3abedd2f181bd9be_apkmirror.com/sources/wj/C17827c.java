package wj;

import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.r;
import gi.InterfaceC14266f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwj/c;", "Lgi/f;", "<init>", "()V", "", "actionValue", "", "contextData", "", "b", "(Ljava/lang/String;Ljava/util/Map;)V", "stateValue", "a", "extraData", "c", "(Ljava/util/Map;)V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wj.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17827c implements InterfaceC14266f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String str, Map map, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        B.s(str, MapsKt.v(map, TuplesKt.a("ECID", str2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(String str, Map map, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        B.t(str, MapsKt.v(map, TuplesKt.a("ECID", str2)));
    }

    @Override // gi.InterfaceC14266f
    public void a(final String stateValue, final Map<String, String> contextData) {
        Intrinsics.j(stateValue, "stateValue");
        Intrinsics.j(contextData, "contextData");
        r.d(new InterfaceC6418a() { // from class: wj.b
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                C17827c.g(stateValue, contextData, (String) obj);
            }
        });
    }

    @Override // gi.InterfaceC14266f
    public void b(final String actionValue, final Map<String, String> contextData) {
        Intrinsics.j(actionValue, "actionValue");
        Intrinsics.j(contextData, "contextData");
        r.d(new InterfaceC6418a() { // from class: wj.a
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                C17827c.f(actionValue, contextData, (String) obj);
            }
        });
    }

    @Override // gi.InterfaceC14266f
    public void c(Map<String, String> extraData) {
        Intrinsics.j(extraData, "extraData");
        B.c(extraData);
    }
}
