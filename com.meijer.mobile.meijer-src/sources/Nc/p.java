package Nc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
final class p implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f20834a;

    p(u uVar) {
        this.f20834a = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u uVar = this.f20834a;
        if (uVar.f20850h == null) {
            return false;
        }
        uVar.f20850h.d(motionEvent);
        return false;
    }
}
