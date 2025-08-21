package androidx.compose.material.ripple;

import B0.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/a;", "", "<init>", "()V", "LB0/d;", "indicationInstance", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "", "d", "(LB0/d;Landroidx/compose/material/ripple/RippleHostView;)V", "b", "(LB0/d;)Landroidx/compose/material/ripple/RippleHostView;", "a", "(Landroidx/compose/material/ripple/RippleHostView;)LB0/d;", "c", "(LB0/d;)V", "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<d, RippleHostView> indicationToHostMap = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<RippleHostView, d> hostToIndicationMap = new LinkedHashMap();

    public final d a(RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }

    public final RippleHostView b(d indicationInstance) {
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void c(d indicationInstance) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(indicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void d(d indicationInstance, RippleHostView rippleHostView) {
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }
}
