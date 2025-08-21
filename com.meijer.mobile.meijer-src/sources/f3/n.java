package f3;

import android.net.Uri;
import d3.C13599a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements InterfaceC13949d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13949d f131537a;

    /* renamed from: b, reason: collision with root package name */
    private long f131538b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f131539c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f131540d = Collections.EMPTY_MAP;

    @Override // f3.InterfaceC13949d
    public Map<String, List<String>> c() {
        return this.f131537a.c();
    }

    @Override // f3.InterfaceC13949d
    public void close() throws IOException {
        this.f131537a.close();
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f131537a.getUri();
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        this.f131539c = gVar.f131472a;
        this.f131540d = Collections.EMPTY_MAP;
        try {
            return this.f131537a.h(gVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f131539c = uri;
            }
            this.f131540d = c();
        }
    }

    public long n() {
        return this.f131538b;
    }

    public Uri o() {
        return this.f131539c;
    }

    public Map<String, List<String>> p() {
        return this.f131540d;
    }

    public void q() {
        this.f131538b = 0L;
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f131537a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f131538b += i12;
        }
        return i12;
    }

    public n(InterfaceC13949d interfaceC13949d) {
        this.f131537a = (InterfaceC13949d) C13599a.e(interfaceC13949d);
    }

    @Override // f3.InterfaceC13949d
    public void e(o oVar) {
        C13599a.e(oVar);
        this.f131537a.e(oVar);
    }
}
