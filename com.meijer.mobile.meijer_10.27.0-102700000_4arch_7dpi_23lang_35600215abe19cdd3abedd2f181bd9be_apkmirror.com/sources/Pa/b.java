package Pa;

import android.content.Context;
import com.google.firebase.messaging.S;
import da.C13500b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import za.C18412h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"LPa/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/firebase/messaging/S;", "remoteMessage", "", "b", "(Landroid/content/Context;Lcom/google/firebase/messaging/S;)Z", "", "Ljava/lang/String;", "getMESSAGE_FILTER", "()Ljava/lang/String;", "setMESSAGE_FILTER", "(Ljava/lang/String;)V", "MESSAGE_FILTER", "c", "getV2_MESSAGE_FILTER", "setV2_MESSAGE_FILTER", "V2_MESSAGE_FILTER", "emarsys-firebase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25055a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String MESSAGE_FILTER = "ems_msg";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static String V2_MESSAGE_FILTER = "ems.version";

    @JvmStatic
    public static final boolean b(final Context context, final S remoteMessage) {
        Intrinsics.j(context, "context");
        Intrinsics.j(remoteMessage, "remoteMessage");
        l9.b concurrentHandlerHolder = C13500b.b().getConcurrentHandlerHolder();
        Map<String, String> mapB = remoteMessage.B();
        Intrinsics.i(mapB, "getData(...)");
        boolean zK = C18412h.k(mapB);
        if (zK) {
            concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: Pa.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(context, remoteMessage);
                }
            });
        }
        return zK;
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Context context, S s10) {
        Map<String, String> mapB = s10.B();
        Intrinsics.i(mapB, "getData(...)");
        C18412h.i(context, mapB, C13500b.b().D(), C13500b.b().I(), C13500b.b().q(), C13500b.b().k());
    }
}
