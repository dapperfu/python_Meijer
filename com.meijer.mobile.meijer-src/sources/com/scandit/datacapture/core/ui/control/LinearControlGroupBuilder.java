package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Defaults;", "defaults", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Defaults;)V", "(Landroid/content/Context;)V", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "orientation", "setOrientation", "(Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;)Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "spacing", "setSpacing", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "controls", "setControls", "(Ljava/util/List;)Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "build", "()Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "com/scandit/datacapture/core/ui/control/h", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LinearControlGroupBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f126990a;

    /* renamed from: b, reason: collision with root package name */
    private LinearControlGroupOrientation f126991b;

    /* renamed from: c, reason: collision with root package name */
    private FloatWithUnit f126992c;

    /* renamed from: d, reason: collision with root package name */
    private List f126993d;

    public LinearControlGroupBuilder(Context context, LinearControlGroup.Defaults defaults) {
        Intrinsics.j(context, "context");
        Intrinsics.j(defaults, "defaults");
        this.f126990a = context;
        this.f126991b = defaults.getOrientation();
        this.f126992c = defaults.getSpacing();
        this.f126993d = defaults.getControls();
    }

    public final LinearControlGroup build() {
        return LinearControlGroup.INSTANCE._fromBuilderProperties(this.f126990a, this.f126991b, this.f126992c, this.f126993d);
    }

    public final LinearControlGroupBuilder setControls(List<? extends Control> controls) {
        Intrinsics.j(controls, "controls");
        ArrayList arrayList = new ArrayList();
        for (Control control : controls) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Control) it.next()).getClass().isInstance(control)) {
                        break;
                    }
                }
            }
            arrayList.add(control);
        }
        this.f126993d = arrayList;
        return this;
    }

    public final LinearControlGroupBuilder setOrientation(LinearControlGroupOrientation orientation) {
        Intrinsics.j(orientation, "orientation");
        this.f126991b = orientation;
        return this;
    }

    public final LinearControlGroupBuilder setSpacing(FloatWithUnit spacing) {
        Intrinsics.j(spacing, "spacing");
        this.f126992c = spacing;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearControlGroupBuilder(Context context) {
        this(context, h.f127027a);
        Intrinsics.j(context, "context");
    }
}
