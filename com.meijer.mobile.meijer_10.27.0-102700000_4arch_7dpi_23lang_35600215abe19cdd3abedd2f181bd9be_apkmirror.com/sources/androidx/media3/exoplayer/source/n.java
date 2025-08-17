package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import f3.InterfaceC13839d;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class n implements InterfaceC13839d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13839d f56906a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56907b;

    /* renamed from: c, reason: collision with root package name */
    private final a f56908c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f56909d;

    /* renamed from: e, reason: collision with root package name */
    private int f56910e;

    public interface a {
        void a(d3.D d10);
    }

    private boolean n() throws IOException {
        if (this.f56906a.read(this.f56909d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f56909d[0] & l3.f92484c) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f56906a.read(bArr, i12, i11);
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
            this.f56908c.a(new d3.D(bArr, i10));
        }
        return true;
    }

    @Override // f3.InterfaceC13839d
    public Map<String, List<String>> c() {
        return this.f56906a.c();
    }

    @Override // f3.InterfaceC13839d
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        return this.f56906a.getUri();
    }

    @Override // f3.InterfaceC13839d
    public long h(f3.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f56910e == 0) {
            if (!n()) {
                return -1;
            }
            this.f56910e = this.f56907b;
        }
        int i12 = this.f56906a.read(bArr, i10, Math.min(this.f56910e, i11));
        if (i12 != -1) {
            this.f56910e -= i12;
        }
        return i12;
    }

    public n(InterfaceC13839d interfaceC13839d, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        this.f56906a = interfaceC13839d;
        this.f56907b = i10;
        this.f56908c = aVar;
        this.f56909d = new byte[1];
        this.f56910e = i10;
    }

    @Override // f3.InterfaceC13839d
    public void e(f3.o oVar) {
        C13466a.e(oVar);
        this.f56906a.e(oVar);
    }
}
