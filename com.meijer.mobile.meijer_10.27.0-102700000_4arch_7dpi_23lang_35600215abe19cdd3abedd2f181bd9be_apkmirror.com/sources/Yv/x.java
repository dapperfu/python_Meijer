package Yv;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"LYv/x;", "", "", "streamId", "", "LYv/c;", "requestHeaders", "", "c", "(ILjava/util/List;)Z", "responseHeaders", "last", "d", "(ILjava/util/List;Z)Z", "Lkw/g;", "source", "byteCount", "b", "(ILkw/g;IZ)Z", "LYv/a;", "errorCode", "", "a", "(ILYv/a;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f42010a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final x f42009b = new Companion.C0890a();

    void a(int streamId, a errorCode);

    boolean b(int streamId, InterfaceC15330g source, int byteCount, boolean last) throws IOException;

    boolean c(int streamId, List<c> requestHeaders);

    boolean d(int streamId, List<c> responseHeaders, boolean last);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LYv/x$a;", "", "<init>", "()V", "LYv/x;", "CANCEL", "LYv/x;", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.x$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42010a = new Companion();

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LYv/x$a$a;", "LYv/x;", "<init>", "()V", "", "streamId", "", "LYv/c;", "requestHeaders", "", "c", "(ILjava/util/List;)Z", "responseHeaders", "last", "d", "(ILjava/util/List;Z)Z", "Lkw/g;", "source", "byteCount", "b", "(ILkw/g;IZ)Z", "LYv/a;", "errorCode", "", "a", "(ILYv/a;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: Yv.x$a$a, reason: collision with other inner class name */
        private static final class C0890a implements x {
            @Override // Yv.x
            public void a(int streamId, a errorCode) {
                Intrinsics.j(errorCode, "errorCode");
            }

            @Override // Yv.x
            public boolean c(int streamId, List<c> requestHeaders) {
                Intrinsics.j(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // Yv.x
            public boolean d(int streamId, List<c> responseHeaders, boolean last) {
                Intrinsics.j(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // Yv.x
            public boolean b(int streamId, InterfaceC15330g source, int byteCount, boolean last) throws IOException {
                Intrinsics.j(source, "source");
                source.skip(byteCount);
                return true;
            }
        }

        private Companion() {
        }
    }
}
