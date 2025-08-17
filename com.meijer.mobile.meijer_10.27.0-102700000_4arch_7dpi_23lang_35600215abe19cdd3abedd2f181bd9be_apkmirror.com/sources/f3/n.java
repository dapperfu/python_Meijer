package f3;

import android.net.Uri;
import d3.C13466a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements InterfaceC13839d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13839d f130703a;

    /* renamed from: b, reason: collision with root package name */
    private long f130704b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f130705c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f130706d = Collections.EMPTY_MAP;

    @Override // f3.InterfaceC13839d
    public Map<String, List<String>> c() {
        return this.f130703a.c();
    }

    @Override // f3.InterfaceC13839d
    public void close() throws IOException {
        this.f130703a.close();
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        return this.f130703a.getUri();
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        this.f130705c = gVar.f130638a;
        this.f130706d = Collections.EMPTY_MAP;
        try {
            return this.f130703a.h(gVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f130705c = uri;
            }
            this.f130706d = c();
        }
    }

    public long n() {
        return this.f130704b;
    }

    public Uri o() {
        return this.f130705c;
    }

    public Map<String, List<String>> p() {
        return this.f130706d;
    }

    public void q() {
        this.f130704b = 0L;
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f130703a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f130704b += i12;
        }
        return i12;
    }

    public n(InterfaceC13839d interfaceC13839d) {
        this.f130703a = (InterfaceC13839d) C13466a.e(interfaceC13839d);
    }

    @Override // f3.InterfaceC13839d
    public void e(o oVar) {
        C13466a.e(oVar);
        this.f130703a.e(oVar);
    }
}
