package ye;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class g implements InterfaceC18307b {

    /* renamed from: a, reason: collision with root package name */
    private final l f171366a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f171367b = new Handler(Looper.getMainLooper());

    @Override // ye.InterfaceC18307b
    public final AbstractC5516j<AbstractC18306a> b() {
        return this.f171366a.a();
    }

    g(l lVar) {
        this.f171366a = lVar;
    }

    @Override // ye.InterfaceC18307b
    public final AbstractC5516j<Void> a(Activity activity, AbstractC18306a abstractC18306a) {
        if (abstractC18306a.b()) {
            return C5519m.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", abstractC18306a.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C5517k c5517k = new C5517k();
        intent.putExtra("result_receiver", new f(this, this.f171367b, c5517k));
        activity.startActivity(intent);
        return c5517k.a();
    }
}
