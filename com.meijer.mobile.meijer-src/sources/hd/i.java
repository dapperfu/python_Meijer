package hd;

import android.os.Looper;
import android.os.Message;
import zd.HandlerC18475f;

/* loaded from: classes4.dex */
final class i extends HandlerC18475f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14506c f135317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C14506c c14506c, Looper looper) {
        super(looper);
        this.f135317b = c14506c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14506c.g(this.f135317b, message);
    }
}
