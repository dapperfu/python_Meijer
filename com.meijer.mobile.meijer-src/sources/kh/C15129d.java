package kh;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import nh.C15943a;

/* renamed from: kh.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C15129d implements InterfaceC15130e {

    /* renamed from: a, reason: collision with root package name */
    protected C15129d f141850a;

    @Override // kh.InterfaceC15130e
    public C15943a a() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.a() : new C15943a(zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE, zzbz.UNKNOWN_CONTENT_TYPE);
    }

    @Override // kh.InterfaceC15130e
    public String b() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.b() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // kh.InterfaceC15130e
    public String c() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.c() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // kh.InterfaceC15130e
    public String d() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.d() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    public void e(C15129d c15129d) {
        this.f141850a = c15129d;
    }

    @Override // kh.InterfaceC15130e
    public String getLocale() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.getLocale() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // kh.InterfaceC15130e
    public String getOSName() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.getOSName() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    @Override // kh.InterfaceC15130e
    public String getOSVersion() {
        C15129d c15129d = this.f141850a;
        return c15129d != null ? c15129d.getOSVersion() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    C15129d() {
    }
}
