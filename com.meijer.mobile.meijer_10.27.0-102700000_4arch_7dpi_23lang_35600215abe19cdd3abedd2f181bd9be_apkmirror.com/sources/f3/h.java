package f3;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import d3.C13466a;
import d3.P;
import d3.r;
import f3.InterfaceC13839d;
import f3.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements InterfaceC13839d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f130659a;

    /* renamed from: b, reason: collision with root package name */
    private final List<o> f130660b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13839d f130661c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13839d f130662d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC13839d f130663e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC13839d f130664f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC13839d f130665g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC13839d f130666h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC13839d f130667i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC13839d f130668j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC13839d f130669k;

    public static final class a implements InterfaceC13839d.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f130670a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC13839d.a f130671b;

        /* renamed from: c, reason: collision with root package name */
        private o f130672c;

        public a(Context context) {
            this(context, new i.b());
        }

        public a(Context context, InterfaceC13839d.a aVar) {
            this.f130670a = context.getApplicationContext();
            this.f130671b = (InterfaceC13839d.a) C13466a.e(aVar);
        }

        @Override // f3.InterfaceC13839d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a() {
            h hVar = new h(this.f130670a, this.f130671b.a());
            o oVar = this.f130672c;
            if (oVar != null) {
                hVar.e(oVar);
            }
            return hVar;
        }
    }

    private void n(InterfaceC13839d interfaceC13839d) {
        for (int i10 = 0; i10 < this.f130660b.size(); i10++) {
            interfaceC13839d.e(this.f130660b.get(i10));
        }
    }

    private InterfaceC13839d o() {
        if (this.f130663e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f130659a);
            this.f130663e = assetDataSource;
            n(assetDataSource);
        }
        return this.f130663e;
    }

    private InterfaceC13839d p() {
        if (this.f130664f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f130659a);
            this.f130664f = contentDataSource;
            n(contentDataSource);
        }
        return this.f130664f;
    }

    private InterfaceC13839d q() {
        if (this.f130667i == null) {
            C13838c c13838c = new C13838c();
            this.f130667i = c13838c;
            n(c13838c);
        }
        return this.f130667i;
    }

    private InterfaceC13839d r() {
        if (this.f130662d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f130662d = fileDataSource;
            n(fileDataSource);
        }
        return this.f130662d;
    }

    private InterfaceC13839d s() {
        if (this.f130668j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f130659a);
            this.f130668j = rawResourceDataSource;
            n(rawResourceDataSource);
        }
        return this.f130668j;
    }

    private InterfaceC13839d t() {
        if (this.f130665g == null) {
            try {
                InterfaceC13839d interfaceC13839d = (InterfaceC13839d) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f130665g = interfaceC13839d;
                n(interfaceC13839d);
            } catch (ClassNotFoundException unused) {
                r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f130665g == null) {
                this.f130665g = this.f130661c;
            }
        }
        return this.f130665g;
    }

    private InterfaceC13839d u() {
        if (this.f130666h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f130666h = udpDataSource;
            n(udpDataSource);
        }
        return this.f130666h;
    }

    private void v(InterfaceC13839d interfaceC13839d, o oVar) {
        if (interfaceC13839d != null) {
            interfaceC13839d.e(oVar);
        }
    }

    @Override // f3.InterfaceC13839d
    public Map<String, List<String>> c() {
        InterfaceC13839d interfaceC13839d = this.f130669k;
        return interfaceC13839d == null ? Collections.EMPTY_MAP : interfaceC13839d.c();
    }

    @Override // f3.InterfaceC13839d
    public void close() throws IOException {
        InterfaceC13839d interfaceC13839d = this.f130669k;
        if (interfaceC13839d != null) {
            try {
                interfaceC13839d.close();
            } finally {
                this.f130669k = null;
            }
        }
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        InterfaceC13839d interfaceC13839d = this.f130669k;
        if (interfaceC13839d == null) {
            return null;
        }
        return interfaceC13839d.getUri();
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        C13466a.g(this.f130669k == null);
        String scheme = gVar.f130638a.getScheme();
        if (P.F0(gVar.f130638a)) {
            String path = gVar.f130638a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f130669k = r();
            } else {
                this.f130669k = o();
            }
        } else if ("asset".equals(scheme)) {
            this.f130669k = o();
        } else if ("content".equals(scheme)) {
            this.f130669k = p();
        } else if ("rtmp".equals(scheme)) {
            this.f130669k = t();
        } else if ("udp".equals(scheme)) {
            this.f130669k = u();
        } else if ("data".equals(scheme)) {
            this.f130669k = q();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f130669k = s();
        } else {
            this.f130669k = this.f130661c;
        }
        return this.f130669k.h(gVar);
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((InterfaceC13839d) C13466a.e(this.f130669k)).read(bArr, i10, i11);
    }

    public h(Context context, InterfaceC13839d interfaceC13839d) {
        this.f130659a = context.getApplicationContext();
        this.f130661c = (InterfaceC13839d) C13466a.e(interfaceC13839d);
    }

    @Override // f3.InterfaceC13839d
    public void e(o oVar) {
        C13466a.e(oVar);
        this.f130661c.e(oVar);
        this.f130660b.add(oVar);
        v(this.f130662d, oVar);
        v(this.f130663e, oVar);
        v(this.f130664f, oVar);
        v(this.f130665g, oVar);
        v(this.f130666h, oVar);
        v(this.f130667i, oVar);
        v(this.f130668j, oVar);
    }
}
