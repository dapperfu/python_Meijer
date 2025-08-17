package Lc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
final class p implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f18014a;

    p(u uVar) {
        this.f18014a = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u uVar = this.f18014a;
        if (uVar.f18030h == null) {
            return false;
        }
        uVar.f18030h.d(motionEvent);
        return false;
    }
}
