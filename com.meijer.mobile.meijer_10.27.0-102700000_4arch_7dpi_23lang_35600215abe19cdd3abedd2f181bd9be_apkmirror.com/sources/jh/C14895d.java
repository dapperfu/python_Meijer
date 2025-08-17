package jh;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import mh.C15620a;

/* renamed from: jh.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C14895d implements InterfaceC14896e {

    /* renamed from: a, reason: collision with root package name */
    protected C14895d f139595a;

    @Override // jh.InterfaceC14896e
    public C15620a a() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.a() : new C15620a(zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE);
    }

    @Override // jh.InterfaceC14896e
    public String b() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.b() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // jh.InterfaceC14896e
    public String c() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.c() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // jh.InterfaceC14896e
    public String d() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.d() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    public void e(C14895d c14895d) {
        this.f139595a = c14895d;
    }

    @Override // jh.InterfaceC14896e
    public String getLocale() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.getLocale() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // jh.InterfaceC14896e
    public String getOSName() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.getOSName() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // jh.InterfaceC14896e
    public String getOSVersion() {
        C14895d c14895d = this.f139595a;
        return c14895d != null ? c14895d.getOSVersion() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    C14895d() {
    }
}
