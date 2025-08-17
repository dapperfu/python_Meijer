package xj;

import com.fullstory.FS;
import gi.InterfaceC14266f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxj/i;", "Lgi/f;", "<init>", "()V", "", "actionValue", "", "contextData", "", "b", "(Ljava/lang/String;Ljava/util/Map;)V", "stateValue", "a", "extraData", "c", "(Ljava/util/Map;)V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i implements InterfaceC14266f {
    @Override // gi.InterfaceC14266f
    public void a(String stateValue, Map<String, String> contextData) {
        Intrinsics.j(stateValue, "stateValue");
        Intrinsics.j(contextData, "contextData");
        FS.event(stateValue, contextData);
    }

    @Override // gi.InterfaceC14266f
    public void b(String actionValue, Map<String, String> contextData) {
        Intrinsics.j(actionValue, "actionValue");
        Intrinsics.j(contextData, "contextData");
        FS.event(actionValue, contextData);
    }

    @Override // gi.InterfaceC14266f
    public void c(Map<String, String> extraData) {
        Intrinsics.j(extraData, "extraData");
        uw.a.INSTANCE.s("Excluding PII data from FullStory event logging.", new Object[0]);
    }
}
