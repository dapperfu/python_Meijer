package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import bw.e;
import cw.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/platform/d;", "", "<init>", "()V", "Lokhttp3/internal/platform/c;", "a", "()Lokhttp3/internal/platform/c;", "", "c", "()Z", "isAndroid", "Landroid/content/Context;", "value", "b", "()Landroid/content/Context;", "d", "(Landroid/content/Context;)V", "applicationContext", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f154386a = new d();

    public final boolean c() {
        return true;
    }

    public final c a() {
        g.f126784a.b();
        c cVarA = a.INSTANCE.a();
        if (cVarA == null) {
            cVarA = b.INSTANCE.a();
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public final Context b() {
        Object objE = c.INSTANCE.e();
        e eVar = objE instanceof e ? (e) objE : null;
        if (eVar != null) {
            return eVar.getApplicationContext();
        }
        return null;
    }

    public final void d(Context context) {
        Object objE = c.INSTANCE.e();
        e eVar = objE instanceof e ? (e) objE : null;
        if (eVar != null) {
            eVar.setApplicationContext(context);
        }
    }

    private d() {
    }
}
