package L5;

import android.app.Activity;
import android.view.View;
import androidx.view.C6019i0;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LL5/c;", "", "<init>", "()V", "Landroid/app/Activity;", "activityToAttach", "", "a", "(Landroid/app/Activity;)V", "activityToDetach", "b", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    public final void a(Activity activityToAttach) {
        Intrinsics.j(activityToAttach, "activityToAttach");
        View decorView = activityToAttach.getWindow().getDecorView();
        Intrinsics.i(decorView, "activityToAttach.window.decorView");
        if (C6019i0.a(decorView) != null) {
            return;
        }
        b bVar = new b();
        bVar.e();
        bVar.b(decorView);
    }

    public final void b(Activity activityToDetach) {
        Intrinsics.j(activityToDetach, "activityToDetach");
        View decorView = activityToDetach.getWindow().getDecorView();
        Intrinsics.i(decorView, "activityToDetach.window.decorView");
        InterfaceC6030s interfaceC6030sA = C6019i0.a(decorView);
        if (interfaceC6030sA instanceof b) {
            b bVar = (b) interfaceC6030sA;
            bVar.c(decorView);
            bVar.f();
        }
    }
}
