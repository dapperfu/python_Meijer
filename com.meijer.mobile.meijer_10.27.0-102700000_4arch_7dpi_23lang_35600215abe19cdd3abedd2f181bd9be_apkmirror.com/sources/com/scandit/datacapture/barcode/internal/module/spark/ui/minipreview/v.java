package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13208a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class v extends FunctionReferenceImpl implements Function0 {
    public v(Object obj) {
        super(0, obj, w.class, "onLongPressStarted", "onLongPressStarted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w wVar = (w) this.receiver;
        wVar.getClass();
        Rect rect = new Rect();
        wVar.f123222b.getGlobalVisibleRect(rect);
        MotionEvent motionEvent = wVar.f123230j;
        if (motionEvent != null && rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            wVar.f123223c.invoke(EnumC13208a.f123047g);
            wVar.f123233m = true;
        }
        return Unit.f142422a;
    }
}
