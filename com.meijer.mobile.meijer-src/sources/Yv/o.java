package Yv;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"LYv/o;", "LYv/j;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "h", "Ljava/lang/Class;", "i", "j", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends j {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Class<?> paramClass;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LYv/o$a;", "", "<init>", "()V", "", "packageName", "LYv/n;", "a", "(Ljava/lang/String;)LYv/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ n b(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.a(str);
        }

        public final n a(String packageName) throws ClassNotFoundException {
            Intrinsics.j(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.h(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.h(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.g(cls3);
                return new o(cls, cls2, cls3);
            } catch (Exception e10) {
                g gVar = g.f43312a;
                String name = OkHttpClient.class.getName();
                Intrinsics.i(name, "getName(...)");
                gVar.a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.j(sslSocketClass, "sslSocketClass");
        Intrinsics.j(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.j(paramClass, "paramClass");
        this.sslSocketFactoryClass = sslSocketFactoryClass;
        this.paramClass = paramClass;
    }
}
