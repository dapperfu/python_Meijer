package we;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public final class g implements InterfaceC17814b {

    /* renamed from: a, reason: collision with root package name */
    private final l f166044a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f166045b = new Handler(Looper.getMainLooper());

    @Override // we.InterfaceC17814b
    public final AbstractC5232j<AbstractC17813a> a() {
        return this.f166044a.a();
    }

    g(l lVar) {
        this.f166044a = lVar;
    }

    @Override // we.InterfaceC17814b
    public final AbstractC5232j<Void> b(Activity activity, AbstractC17813a abstractC17813a) {
        if (abstractC17813a.b()) {
            return C5235m.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", abstractC17813a.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C5233k c5233k = new C5233k();
        intent.putExtra("result_receiver", new f(this, this.f166045b, c5233k));
        activity.startActivity(intent);
        return c5233k.a();
    }
}
