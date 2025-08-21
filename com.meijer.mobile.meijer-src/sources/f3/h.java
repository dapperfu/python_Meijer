package f3;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import d3.C13599a;
import d3.P;
import d3.r;
import f3.InterfaceC13949d;
import f3.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements InterfaceC13949d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f131493a;

    /* renamed from: b, reason: collision with root package name */
    private final List<o> f131494b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13949d f131495c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13949d f131496d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC13949d f131497e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC13949d f131498f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC13949d f131499g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC13949d f131500h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC13949d f131501i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC13949d f131502j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC13949d f131503k;

    public static final class a implements InterfaceC13949d.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f131504a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC13949d.a f131505b;

        /* renamed from: c, reason: collision with root package name */
        private o f131506c;

        public a(Context context) {
            this(context, new i.b());
        }

        public a(Context context, InterfaceC13949d.a aVar) {
            this.f131504a = context.getApplicationContext();
            this.f131505b = (InterfaceC13949d.a) C13599a.e(aVar);
        }

        @Override // f3.InterfaceC13949d.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a() {
            h hVar = new h(this.f131504a, this.f131505b.a());
            o oVar = this.f131506c;
            if (oVar != null) {
                hVar.e(oVar);
            }
            return hVar;
        }
    }

    private void n(InterfaceC13949d interfaceC13949d) {
        for (int i10 = 0; i10 < this.f131494b.size(); i10++) {
            interfaceC13949d.e(this.f131494b.get(i10));
        }
    }

    private InterfaceC13949d o() {
        if (this.f131497e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f131493a);
            this.f131497e = assetDataSource;
            n(assetDataSource);
        }
        return this.f131497e;
    }

    private InterfaceC13949d p() {
        if (this.f131498f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f131493a);
            this.f131498f = contentDataSource;
            n(contentDataSource);
        }
        return this.f131498f;
    }

    private InterfaceC13949d q() {
        if (this.f131501i == null) {
            C13948c c13948c = new C13948c();
            this.f131501i = c13948c;
            n(c13948c);
        }
        return this.f131501i;
    }

    private InterfaceC13949d r() {
        if (this.f131496d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f131496d = fileDataSource;
            n(fileDataSource);
        }
        return this.f131496d;
    }

    private InterfaceC13949d s() {
        if (this.f131502j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f131493a);
            this.f131502j = rawResourceDataSource;
            n(rawResourceDataSource);
        }
        return this.f131502j;
    }

    private InterfaceC13949d t() {
        if (this.f131499g == null) {
            try {
                InterfaceC13949d interfaceC13949d = (InterfaceC13949d) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f131499g = interfaceC13949d;
                n(interfaceC13949d);
            } catch (ClassNotFoundException unused) {
                r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f131499g == null) {
                this.f131499g = this.f131495c;
            }
        }
        return this.f131499g;
    }

    private InterfaceC13949d u() {
        if (this.f131500h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f131500h = udpDataSource;
            n(udpDataSource);
        }
        return this.f131500h;
    }

    private void v(InterfaceC13949d interfaceC13949d, o oVar) {
        if (interfaceC13949d != null) {
            interfaceC13949d.e(oVar);
        }
    }

    @Override // f3.InterfaceC13949d
    public Map<String, List<String>> c() {
        InterfaceC13949d interfaceC13949d = this.f131503k;
        return interfaceC13949d == null ? Collections.EMPTY_MAP : interfaceC13949d.c();
    }

    @Override // f3.InterfaceC13949d
    public void close() throws IOException {
        InterfaceC13949d interfaceC13949d = this.f131503k;
        if (interfaceC13949d != null) {
            try {
                interfaceC13949d.close();
            } finally {
                this.f131503k = null;
            }
        }
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        InterfaceC13949d interfaceC13949d = this.f131503k;
        if (interfaceC13949d == null) {
            return null;
        }
        return interfaceC13949d.getUri();
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        C13599a.g(this.f131503k == null);
        String scheme = gVar.f131472a.getScheme();
        if (P.F0(gVar.f131472a)) {
            String path = gVar.f131472a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f131503k = r();
            } else {
                this.f131503k = o();
            }
        } else if ("asset".equals(scheme)) {
            this.f131503k = o();
        } else if ("content".equals(scheme)) {
            this.f131503k = p();
        } else if ("rtmp".equals(scheme)) {
            this.f131503k = t();
        } else if ("udp".equals(scheme)) {
            this.f131503k = u();
        } else if ("data".equals(scheme)) {
            this.f131503k = q();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f131503k = s();
        } else {
            this.f131503k = this.f131495c;
        }
        return this.f131503k.h(gVar);
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((InterfaceC13949d) C13599a.e(this.f131503k)).read(bArr, i10, i11);
    }

    public h(Context context, InterfaceC13949d interfaceC13949d) {
        this.f131493a = context.getApplicationContext();
        this.f131495c = (InterfaceC13949d) C13599a.e(interfaceC13949d);
    }

    @Override // f3.InterfaceC13949d
    public void e(o oVar) {
        C13599a.e(oVar);
        this.f131495c.e(oVar);
        this.f131494b.add(oVar);
        v(this.f131496d, oVar);
        v(this.f131497e, oVar);
        v(this.f131498f, oVar);
        v(this.f131499g, oVar);
        v(this.f131500h, oVar);
        v(this.f131501i, oVar);
        v(this.f131502j, oVar);
    }
}
