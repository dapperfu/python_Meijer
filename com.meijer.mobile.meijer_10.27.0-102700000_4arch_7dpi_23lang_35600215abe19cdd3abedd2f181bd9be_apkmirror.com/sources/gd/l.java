package gd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import com.fullstory.FS;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes4.dex */
final class l extends wd.j {

    /* renamed from: b, reason: collision with root package name */
    private final Context f133329b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C14247f f133330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C14247f c14247f, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f133330c = c14247f;
        this.f133329b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            FS.log_w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C14247f c14247f = this.f133330c;
        int iG = c14247f.g(this.f133329b);
        if (c14247f.j(iG)) {
            this.f133330c.o(this.f133329b, iG);
        }
    }
}
