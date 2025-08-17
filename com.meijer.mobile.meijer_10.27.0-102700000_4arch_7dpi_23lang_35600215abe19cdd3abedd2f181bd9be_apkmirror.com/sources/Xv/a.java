package Xv;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"LXv/a;", "", "Lkw/g;", "source", "<init>", "(Lkw/g;)V", "", "b", "()Ljava/lang/String;", "Lokhttp3/Headers;", "a", "()Lokhttp3/Headers;", "Lkw/g;", "getSource", "()Lkw/g;", "", "J", "headerLimit", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long headerLimit;

    public a(InterfaceC15330g source) {
        Intrinsics.j(source, "source");
        this.source = source;
        this.headerLimit = 262144L;
    }

    public final Headers a() throws IOException {
        Headers.a aVar = new Headers.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.f();
            }
            aVar.c(strB);
        }
    }

    public final String b() throws IOException {
        String strY0 = this.source.y0(this.headerLimit);
        this.headerLimit -= strY0.length();
        return strY0;
    }
}
