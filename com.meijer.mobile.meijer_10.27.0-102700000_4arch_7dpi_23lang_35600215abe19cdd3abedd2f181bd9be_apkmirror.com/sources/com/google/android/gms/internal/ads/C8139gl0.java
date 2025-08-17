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
public final class C8139gl0 implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74377a;

    /* renamed from: b, reason: collision with root package name */
    private final List f74378b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9305rh0 f74379c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9305rh0 f74380d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9305rh0 f74381e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9305rh0 f74382f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC9305rh0 f74383g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC9305rh0 f74384h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC9305rh0 f74385i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9305rh0 f74386j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC9305rh0 f74387k;

    private final void i(InterfaceC9305rh0 interfaceC9305rh0) {
        for (int i10 = 0; i10 < this.f74378b.size(); i10++) {
            interfaceC9305rh0.d((Pu0) this.f74378b.get(i10));
        }
    }

    private final InterfaceC9305rh0 h() {
        if (this.f74381e == null) {
            C9511td0 c9511td0 = new C9511td0(this.f74377a);
            this.f74381e = c9511td0;
            i(c9511td0);
        }
        return this.f74381e;
    }

    private static final void j(InterfaceC9305rh0 interfaceC9305rh0, Pu0 pu0) {
        if (interfaceC9305rh0 != null) {
            interfaceC9305rh0.d(pu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        InterfaceC9305rh0 interfaceC9305rh0;
        C8086gC.f(this.f74387k == null);
        String scheme = c8030fk0.f74151a.getScheme();
        Uri uri = c8030fk0.f74151a;
        int i10 = OV.f69091a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = c8030fk0.f74151a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f74380d == null) {
                    C8894np0 c8894np0 = new C8894np0();
                    this.f74380d = c8894np0;
                    i(c8894np0);
                }
                this.f74387k = this.f74380d;
            } else {
                this.f74387k = h();
            }
        } else if ("asset".equals(scheme)) {
            this.f74387k = h();
        } else if ("content".equals(scheme)) {
            if (this.f74382f == null) {
                C7098Qf0 c7098Qf0 = new C7098Qf0(this.f74377a);
                this.f74382f = c7098Qf0;
                i(c7098Qf0);
            }
            this.f74387k = this.f74382f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f74383g == null) {
                try {
                    InterfaceC9305rh0 interfaceC9305rh02 = (InterfaceC9305rh0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f74383g = interfaceC9305rh02;
                    i(interfaceC9305rh02);
                } catch (ClassNotFoundException unused) {
                    C9917xL.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f74383g == null) {
                    this.f74383g = this.f74379c;
                }
            }
            this.f74387k = this.f74383g;
        } else if ("udp".equals(scheme)) {
            if (this.f74384h == null) {
                Nv0 nv0 = new Nv0(2000);
                this.f74384h = nv0;
                i(nv0);
            }
            this.f74387k = this.f74384h;
        } else if ("data".equals(scheme)) {
            if (this.f74385i == null) {
                C9090pg0 c9090pg0 = new C9090pg0();
                this.f74385i = c9090pg0;
                i(c9090pg0);
            }
            this.f74387k = this.f74385i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f74386j == null) {
                    Pt0 pt0 = new Pt0(this.f74377a);
                    this.f74386j = pt0;
                    i(pt0);
                }
                interfaceC9305rh0 = this.f74386j;
            } else {
                interfaceC9305rh0 = this.f74379c;
            }
            this.f74387k = interfaceC9305rh0;
        }
        return this.f74387k.a(c8030fk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        InterfaceC9305rh0 interfaceC9305rh0 = this.f74387k;
        interfaceC9305rh0.getClass();
        return interfaceC9305rh0.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        InterfaceC9305rh0 interfaceC9305rh0 = this.f74387k;
        if (interfaceC9305rh0 == null) {
            return null;
        }
        return interfaceC9305rh0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        InterfaceC9305rh0 interfaceC9305rh0 = this.f74387k;
        if (interfaceC9305rh0 != null) {
            try {
                interfaceC9305rh0.zzd();
            } finally {
                this.f74387k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final Map zze() {
        InterfaceC9305rh0 interfaceC9305rh0 = this.f74387k;
        return interfaceC9305rh0 == null ? Collections.EMPTY_MAP : interfaceC9305rh0.zze();
    }

    public C8139gl0(Context context, InterfaceC9305rh0 interfaceC9305rh0) {
        this.f74377a = context.getApplicationContext();
        this.f74379c = interfaceC9305rh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        this.f74379c.d(pu0);
        this.f74378b.add(pu0);
        j(this.f74380d, pu0);
        j(this.f74381e, pu0);
        j(this.f74382f, pu0);
        j(this.f74383g, pu0);
        j(this.f74384h, pu0);
        j(this.f74385i, pu0);
        j(this.f74386j, pu0);
    }
}
