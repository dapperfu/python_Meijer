package com.scandit.datacapture.barcode.internal.module.ui;

import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f124287a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f124288b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f124289c;

    /* renamed from: d, reason: collision with root package name */
    public Object f124290d;

    public i(Function1 selectedItemForTouchLocation, Function3 shouldAcceptItemForTouch, Function1 onTouchConfirmed) {
        Intrinsics.j(selectedItemForTouchLocation, "selectedItemForTouchLocation");
        Intrinsics.j(shouldAcceptItemForTouch, "shouldAcceptItemForTouch");
        Intrinsics.j(onTouchConfirmed, "onTouchConfirmed");
        this.f124287a = selectedItemForTouchLocation;
        this.f124288b = shouldAcceptItemForTouch;
        this.f124289c = onTouchConfirmed;
    }

    public final boolean a(MotionEvent event) {
        Object obj;
        Object objInvoke;
        Intrinsics.j(event, "event");
        Point point = new Point(event.getX(), event.getY());
        if (event.getAction() == 0 && (objInvoke = this.f124287a.invoke(point)) != null) {
            this.f124290d = objInvoke;
            return true;
        }
        if (event.getAction() != 1 || (obj = this.f124290d) == null) {
            return false;
        }
        this.f124290d = null;
        if (((Boolean) this.f124288b.invoke(obj, this.f124287a.invoke(point), point)).booleanValue()) {
            this.f124289c.invoke(obj);
            return true;
        }
        return false;
    }
}
