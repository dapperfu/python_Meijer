package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup.ControlDeserializer;
import com.scandit.datacapture.core.ui.control.Control;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f126157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f126158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f126159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f126160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f126161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        super(4);
        this.f126157a = arrayList;
        this.f126158b = list;
        this.f126159c = arrayList2;
        this.f126160d = linkedHashMap;
        this.f126161e = linkedHashMap2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Control control = (Control) obj;
        ControlDeserializer.ControlAction action = (ControlDeserializer.ControlAction) obj2;
        Anchor anchor = (Anchor) obj3;
        PointWithUnit offset = (PointWithUnit) obj4;
        Intrinsics.j(control, "control");
        Intrinsics.j(action, "action");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        if (action == ControlDeserializer.ControlAction.ADD) {
            this.f126157a.add(control);
        } else {
            this.f126158b.remove(control);
            this.f126159c.add(control);
        }
        this.f126160d.put(control, anchor);
        this.f126161e.put(control, offset);
        return Unit.f142422a;
    }
}
