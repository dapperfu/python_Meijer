package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.view.MotionEvent;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13341a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function0 {
    public g(Object obj) {
        super(0, obj, h.class, "onLongPressStarted", "onLongPressStarted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h hVar = (h) this.receiver;
        Pair pair = hVar.f124056m;
        View view = pair != null ? (View) pair.d() : null;
        Pair pair2 = hVar.f124056m;
        MotionEvent motionEvent = pair2 != null ? (MotionEvent) pair2.c() : null;
        if (view != null && motionEvent != null) {
            float width = view.getWidth() / 2;
            float x10 = motionEvent.getX() - width;
            float y10 = motionEvent.getY() - width;
            if ((y10 * y10) + (x10 * x10) <= r1 * r1) {
                hVar.f124060q.invoke(EnumC13341a.f124001i);
                hVar.f124049f = true;
            }
        }
        hVar.f124060q.invoke(EnumC13341a.f123999g);
        hVar.f124048e = true;
        return Unit.f143329a;
    }
}
