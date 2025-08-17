package Z6;

import Z6.a;
import java.io.File;

/* loaded from: classes4.dex */
public class d implements a.InterfaceC0903a {

    /* renamed from: a, reason: collision with root package name */
    private final long f42403a;

    /* renamed from: b, reason: collision with root package name */
    private final a f42404b;

    public interface a {
        File a();
    }

    @Override // Z6.a.InterfaceC0903a
    public Z6.a build() {
        File fileA = this.f42404b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f42403a);
        }
        return null;
    }

    public d(a aVar, long j10) {
        this.f42403a = j10;
        this.f42404b = aVar;
    }
}
