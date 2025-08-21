package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8264gl0 implements InterfaceC9430rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75217a;

    /* renamed from: b, reason: collision with root package name */
    private final List f75218b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9430rh0 f75219c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9430rh0 f75220d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9430rh0 f75221e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9430rh0 f75222f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC9430rh0 f75223g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC9430rh0 f75224h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC9430rh0 f75225i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9430rh0 f75226j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC9430rh0 f75227k;

    private final void i(InterfaceC9430rh0 interfaceC9430rh0) {
        for (int i10 = 0; i10 < this.f75218b.size(); i10++) {
            interfaceC9430rh0.d((Pu0) this.f75218b.get(i10));
        }
    }

    private final InterfaceC9430rh0 h() {
        if (this.f75221e == null) {
            C9636td0 c9636td0 = new C9636td0(this.f75217a);
            this.f75221e = c9636td0;
            i(c9636td0);
        }
        return this.f75221e;
    }

    private static final void j(InterfaceC9430rh0 interfaceC9430rh0, Pu0 pu0) {
        if (interfaceC9430rh0 != null) {
            interfaceC9430rh0.d(pu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        InterfaceC9430rh0 interfaceC9430rh0;
        C8211gC.f(this.f75227k == null);
        String scheme = c8155fk0.f74991a.getScheme();
        Uri uri = c8155fk0.f74991a;
        int i10 = OV.f69931a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = c8155fk0.f74991a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f75220d == null) {
                    C9019np0 c9019np0 = new C9019np0();
                    this.f75220d = c9019np0;
                    i(c9019np0);
                }
                this.f75227k = this.f75220d;
            } else {
                this.f75227k = h();
            }
        } else if ("asset".equals(scheme)) {
            this.f75227k = h();
        } else if ("content".equals(scheme)) {
            if (this.f75222f == null) {
                C7223Qf0 c7223Qf0 = new C7223Qf0(this.f75217a);
                this.f75222f = c7223Qf0;
                i(c7223Qf0);
            }
            this.f75227k = this.f75222f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f75223g == null) {
                try {
                    InterfaceC9430rh0 interfaceC9430rh02 = (InterfaceC9430rh0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f75223g = interfaceC9430rh02;
                    i(interfaceC9430rh02);
                } catch (ClassNotFoundException unused) {
                    C10042xL.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f75223g == null) {
                    this.f75223g = this.f75219c;
                }
            }
            this.f75227k = this.f75223g;
        } else if ("udp".equals(scheme)) {
            if (this.f75224h == null) {
                Nv0 nv0 = new Nv0(2000);
                this.f75224h = nv0;
                i(nv0);
            }
            this.f75227k = this.f75224h;
        } else if ("data".equals(scheme)) {
            if (this.f75225i == null) {
                C9215pg0 c9215pg0 = new C9215pg0();
                this.f75225i = c9215pg0;
                i(c9215pg0);
            }
            this.f75227k = this.f75225i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f75226j == null) {
                    Pt0 pt0 = new Pt0(this.f75217a);
                    this.f75226j = pt0;
                    i(pt0);
                }
                interfaceC9430rh0 = this.f75226j;
            } else {
                interfaceC9430rh0 = this.f75219c;
            }
            this.f75227k = interfaceC9430rh0;
        }
        return this.f75227k.a(c8155fk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        InterfaceC9430rh0 interfaceC9430rh0 = this.f75227k;
        interfaceC9430rh0.getClass();
        return interfaceC9430rh0.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        InterfaceC9430rh0 interfaceC9430rh0 = this.f75227k;
        if (interfaceC9430rh0 == null) {
            return null;
        }
        return interfaceC9430rh0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        InterfaceC9430rh0 interfaceC9430rh0 = this.f75227k;
        if (interfaceC9430rh0 != null) {
            try {
                interfaceC9430rh0.zzd();
            } finally {
                this.f75227k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        InterfaceC9430rh0 interfaceC9430rh0 = this.f75227k;
        return interfaceC9430rh0 == null ? Collections.EMPTY_MAP : interfaceC9430rh0.zze();
    }

    public C8264gl0(Context context, InterfaceC9430rh0 interfaceC9430rh0) {
        this.f75217a = context.getApplicationContext();
        this.f75219c = interfaceC9430rh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        this.f75219c.d(pu0);
        this.f75218b.add(pu0);
        j(this.f75220d, pu0);
        j(this.f75221e, pu0);
        j(this.f75222f, pu0);
        j(this.f75223g, pu0);
        j(this.f75224h, pu0);
        j(this.f75225i, pu0);
        j(this.f75226j, pu0);
    }
}
