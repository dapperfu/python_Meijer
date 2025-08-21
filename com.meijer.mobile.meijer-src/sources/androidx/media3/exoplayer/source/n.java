package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import f3.InterfaceC13949d;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class n implements InterfaceC13949d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13949d f57130a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57131b;

    /* renamed from: c, reason: collision with root package name */
    private final a f57132c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f57133d;

    /* renamed from: e, reason: collision with root package name */
    private int f57134e;

    public interface a {
        void a(d3.D d10);
    }

    private boolean n() throws IOException {
        if (this.f57130a.read(this.f57133d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f57133d[0] & l3.f93323c) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f57130a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f57132c.a(new d3.D(bArr, i10));
        }
        return true;
    }

    @Override // f3.InterfaceC13949d
    public Map<String, List<String>> c() {
        return this.f57130a.c();
    }

    @Override // f3.InterfaceC13949d
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f57130a.getUri();
    }

    @Override // f3.InterfaceC13949d
    public long h(f3.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f57134e == 0) {
            if (!n()) {
                return -1;
            }
            this.f57134e = this.f57131b;
        }
        int i12 = this.f57130a.read(bArr, i10, Math.min(this.f57134e, i11));
        if (i12 != -1) {
            this.f57134e -= i12;
        }
        return i12;
    }

    public n(InterfaceC13949d interfaceC13949d, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        this.f57130a = interfaceC13949d;
        this.f57131b = i10;
        this.f57132c = aVar;
        this.f57133d = new byte[1];
        this.f57134e = i10;
    }

    @Override // f3.InterfaceC13949d
    public void e(f3.o oVar) {
        C13599a.e(oVar);
        this.f57130a.e(oVar);
    }
}
