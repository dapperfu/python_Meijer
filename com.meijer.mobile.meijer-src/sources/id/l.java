package id;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import com.fullstory.FS;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes4.dex */
final class l extends yd.j {

    /* renamed from: b, reason: collision with root package name */
    private final Context f137545b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C14723f f137546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C14723f c14723f, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f137546c = c14723f;
        this.f137545b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            FS.log_w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C14723f c14723f = this.f137546c;
        int iG = c14723f.g(this.f137545b);
        if (c14723f.j(iG)) {
            this.f137546c.o(this.f137545b, iG);
        }
    }
}
