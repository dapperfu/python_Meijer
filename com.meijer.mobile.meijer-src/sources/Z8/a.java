package Z8;

import android.os.HandlerThread;
import java.util.UUID;
import kotlin.Metadata;
import n9.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZ8/a;", "", "<init>", "()V", "Ln9/b;", "a", "()Ln9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43644a = new a();

    public final n9.b a() {
        HandlerThread handlerThread = new HandlerThread("CoreSDKHandlerThread-" + UUID.randomUUID());
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("NetworkHandlerThread-" + UUID.randomUUID());
        handlerThread2.start();
        HandlerThread handlerThread3 = new HandlerThread("NetworkHandlerThread-" + UUID.randomUUID());
        handlerThread3.start();
        return new n9.b(new c(new b(handlerThread)), new c(new b(handlerThread2)), new c(new b(handlerThread3)));
    }

    private a() {
    }
}
