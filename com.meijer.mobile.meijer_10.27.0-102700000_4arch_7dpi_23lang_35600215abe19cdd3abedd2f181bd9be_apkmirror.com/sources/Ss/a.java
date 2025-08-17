package Ss;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LSs/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "value", "Landroid/content/Context;", "a", "()Landroid/content/Context;", "appContext", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34693a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Context appContext;

    public final Context a() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        Intrinsics.y("appContext");
        return null;
    }

    public final void b(Context context) {
        Intrinsics.j(context, "context");
        appContext = context.getApplicationContext();
    }

    private a() {
    }
}
