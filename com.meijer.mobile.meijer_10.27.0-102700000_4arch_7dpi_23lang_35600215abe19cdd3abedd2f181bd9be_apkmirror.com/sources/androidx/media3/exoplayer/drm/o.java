package androidx.media3.exoplayer.drm;

import Ce.M;
import a3.C5569i;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.drm.m;
import d3.C13466a;
import d3.P;
import f3.InterfaceC13839d;
import f3.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13839d.a f56130a;

    /* renamed from: b, reason: collision with root package name */
    private final String f56131b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56132c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f56133d;

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] b(UUID uuid, m.d dVar) throws MediaDrmCallbackException {
        return j.a(this.f56130a.a(), dVar.b() + "&signedRequest=" + P.G(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public o(String str, boolean z10, InterfaceC13839d.a aVar) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        C13466a.a(z11);
        this.f56130a = aVar;
        this.f56131b = str;
        this.f56132c = z10;
        this.f56133d = new HashMap();
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] a(UUID uuid, m.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f56132c || TextUtils.isEmpty(strB)) {
            strB = this.f56131b;
        }
        if (!TextUtils.isEmpty(strB)) {
            HashMap map = new HashMap();
            UUID uuid2 = C5569i.f43836e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (C5569i.f43834c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f56133d) {
                map.putAll(this.f56133d);
            }
            return j.a(this.f56130a.a(), strB, aVar.a(), map);
        }
        g.b bVar = new g.b();
        Uri uri = Uri.EMPTY;
        throw new MediaDrmCallbackException(bVar.h(uri).a(), uri, M.n(), 0L, new IllegalStateException("No license URL"));
    }

    public void c(String str, String str2) {
        C13466a.e(str);
        C13466a.e(str2);
        synchronized (this.f56133d) {
            this.f56133d.put(str, str2);
        }
    }
}
