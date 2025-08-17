package com.scandit.datacapture.barcode.internal.module.ui;

import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f123335a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f123336b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f123337c;

    /* renamed from: d, reason: collision with root package name */
    public Object f123338d;

    public i(Function1 selectedItemForTouchLocation, Function3 shouldAcceptItemForTouch, Function1 onTouchConfirmed) {
        Intrinsics.j(selectedItemForTouchLocation, "selectedItemForTouchLocation");
        Intrinsics.j(shouldAcceptItemForTouch, "shouldAcceptItemForTouch");
        Intrinsics.j(onTouchConfirmed, "onTouchConfirmed");
        this.f123335a = selectedItemForTouchLocation;
        this.f123336b = shouldAcceptItemForTouch;
        this.f123337c = onTouchConfirmed;
    }

    public final boolean a(MotionEvent event) {
        Object obj;
        Object objInvoke;
        Intrinsics.j(event, "event");
        Point point = new Point(event.getX(), event.getY());
        if (event.getAction() == 0 && (objInvoke = this.f123335a.invoke(point)) != null) {
            this.f123338d = objInvoke;
            return true;
        }
        if (event.getAction() != 1 || (obj = this.f123338d) == null) {
            return false;
        }
        this.f123338d = null;
        if (((Boolean) this.f123336b.invoke(obj, this.f123335a.invoke(point), point)).booleanValue()) {
            this.f123337c.invoke(obj);
            return true;
        }
        return false;
    }
}
