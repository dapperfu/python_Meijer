package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements FocusGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f126105a;

    public c(TapToFocus owner) {
        Intrinsics.j(owner, "owner");
        this.f126105a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGestureListener
    public final void onFocusGesture(FocusGesture focusGesture, PointWithUnit point) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.j(focusGesture, "focusGesture");
        Intrinsics.j(point, "point");
        TapToFocus tapToFocus = (TapToFocus) this.f126105a.get();
        if (tapToFocus == null || (copyOnWriteArraySet = tapToFocus.f126096b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((FocusGestureListener) it.next()).onFocusGesture(focusGesture, point);
        }
    }
}
