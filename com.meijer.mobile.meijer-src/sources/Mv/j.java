package Mv;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"LMv/j;", "", "Lokhttp3/HttpUrl;", "url", "", "LMv/i;", "cookies", "", "b", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "a", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f20482a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final j f20481b = new Companion.C0360a();

    List<i> a(HttpUrl url);

    void b(HttpUrl url, List<i> cookies);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LMv/j$a;", "", "<init>", "()V", "LMv/j;", "NO_COOKIES", "LMv/j;", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Mv.j$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f20482a = new Companion();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LMv/j$a$a;", "LMv/j;", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "LMv/i;", "cookies", "", "b", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "a", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: Mv.j$a$a, reason: collision with other inner class name */
        private static final class C0360a implements j {
            @Override // Mv.j
            public void b(HttpUrl url, List<i> cookies) {
                Intrinsics.j(url, "url");
                Intrinsics.j(cookies, "cookies");
            }

            @Override // Mv.j
            public List<i> a(HttpUrl url) {
                Intrinsics.j(url, "url");
                return CollectionsKt.m();
            }
        }

        private Companion() {
        }
    }
}
