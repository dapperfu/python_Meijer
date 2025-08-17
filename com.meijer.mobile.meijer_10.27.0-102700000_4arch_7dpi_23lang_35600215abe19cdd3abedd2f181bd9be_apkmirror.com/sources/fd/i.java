package fd;

import android.os.Looper;
import android.os.Message;
import xd.HandlerC18038f;

/* loaded from: classes4.dex */
final class i extends HandlerC18038f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C13876c f130971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C13876c c13876c, Looper looper) {
        super(looper);
        this.f130971b = c13876c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13876c.g(this.f130971b, message);
    }
}
