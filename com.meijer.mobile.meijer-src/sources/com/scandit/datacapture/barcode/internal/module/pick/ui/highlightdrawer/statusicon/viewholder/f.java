package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder;

import android.view.MotionEvent;
import android.view.View;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function1;

/* loaded from: classes12.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public long f123668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f123669b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (((Boolean) this.f123669b.f123684m.invoke(new Point(motionEvent.getX() + view.getX(), motionEvent.getY() + view.getY()), Integer.valueOf(this.f123669b.f123682k.f123634a))).booleanValue()) {
                    this.f123668a = System.currentTimeMillis();
                    return true;
                }
            } else if (action == 1 && System.currentTimeMillis() - this.f123668a < 200) {
                view.performClick();
                h hVar = this.f123669b;
                Function1 function1 = hVar.f123685n;
                if (function1 != null) {
                    function1.invoke(hVar.f123673b);
                }
                return true;
            }
        }
        return false;
    }

    public f(h hVar) {
        this.f123669b = hVar;
    }
}
