package Z4;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"LZ4/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LZ4/h;", "a", "(Landroid/content/Context;)LZ4/h;", "imageLoader", "", "c", "(LZ4/h;)V", "b", "LZ4/h;", "LZ4/i;", "LZ4/i;", "imageLoaderFactory", "coil-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f42283a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static h imageLoader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static i imageLoaderFactory;

    private final synchronized h b(Context context) {
        h hVarA;
        try {
            h hVar = imageLoader;
            if (hVar != null) {
                return hVar;
            }
            i iVar = imageLoaderFactory;
            if (iVar == null || (hVarA = iVar.a()) == null) {
                Object applicationContext = context.getApplicationContext();
                i iVar2 = applicationContext instanceof i ? (i) applicationContext : null;
                hVarA = iVar2 != null ? iVar2.a() : j.a(context);
            }
            imageLoaderFactory = null;
            imageLoader = hVarA;
            return hVarA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JvmStatic
    public static final h a(Context context) {
        h hVar = imageLoader;
        return hVar == null ? f42283a.b(context) : hVar;
    }

    @JvmStatic
    public static final synchronized void c(h imageLoader2) {
        imageLoaderFactory = null;
        imageLoader = imageLoader2;
    }

    private a() {
    }
}
