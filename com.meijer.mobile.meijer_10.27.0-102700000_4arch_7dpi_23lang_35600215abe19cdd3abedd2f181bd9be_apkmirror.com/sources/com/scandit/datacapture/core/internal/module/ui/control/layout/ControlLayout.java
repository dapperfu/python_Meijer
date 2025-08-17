package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.control.Control;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ControlLayout extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f125193c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final c f125194a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f125195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlLayout(Context context, d positioner) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(positioner, "positioner");
        this.f125194a = positioner;
        this.f125195b = new LinkedHashMap();
        setImportantForAccessibility(2);
    }

    public final Collection a() {
        return this.f125195b.values();
    }

    public final Map b() {
        return MapsKt.A(this.f125195b);
    }

    public final void c() {
        Iterator it = CollectionsKt.m1(this.f125195b.values()).iterator();
        while (it.hasNext()) {
            a((Control) it.next());
        }
        this.f125195b.clear();
    }

    public final void a(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        if (!control.get_isControlGroup()) {
            a(control.getClass());
        } else {
            Iterator<T> it = control.get_childControls().iterator();
            while (it.hasNext()) {
                a(((Control) it.next()).getClass());
            }
        }
        Control control2 = (Control) this.f125195b.remove(anchor);
        if (control2 != null) {
            control2._onRemoveControl();
            ViewExtensionsKt.runOnMainThread(this, new b(this, control2.get_view()));
        }
        this.f125195b.put(anchor, control);
        ViewExtensionsKt.runOnMainThread(this, new a(control, this, anchor, offset));
    }

    public final void a(Control control) {
        Intrinsics.j(control, "control");
        LinkedHashMap linkedHashMap = this.f125195b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.e((Control) entry.getValue(), control)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            Control control2 = (Control) this.f125195b.remove((Anchor) it.next());
            if (control2 != null) {
                control2._onRemoveControl();
                ViewExtensionsKt.runOnMainThread(this, new b(this, control2.get_view()));
            }
        }
        Collection collectionValues = this.f125195b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Control) obj).get_isControlGroup()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Control) it2.next())._removeChildControl(control);
        }
    }

    private final void a(Class cls) {
        LinkedHashMap linkedHashMap = this.f125195b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.e(((Control) entry.getValue()).getClass(), cls)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            Control control = (Control) this.f125195b.remove((Anchor) it.next());
            if (control != null) {
                control._onRemoveControl();
                ViewExtensionsKt.runOnMainThread(this, new b(this, control.get_view()));
            }
        }
        Collection collectionValues = this.f125195b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Control) obj).get_isControlGroup()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Control) it2.next())._removeChildControl(cls);
        }
    }
}
