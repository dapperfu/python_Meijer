package b7;

import b7.InterfaceC6336a;
import java.io.File;

/* loaded from: classes4.dex */
public class d implements InterfaceC6336a.InterfaceC1192a {

    /* renamed from: a, reason: collision with root package name */
    private final long f60070a;

    /* renamed from: b, reason: collision with root package name */
    private final a f60071b;

    public interface a {
        File a();
    }

    @Override // b7.InterfaceC6336a.InterfaceC1192a
    public InterfaceC6336a build() {
        File fileA = this.f60071b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f60070a);
        }
        return null;
    }

    public d(a aVar, long j10) {
        this.f60070a = j10;
        this.f60071b = aVar;
    }
}
