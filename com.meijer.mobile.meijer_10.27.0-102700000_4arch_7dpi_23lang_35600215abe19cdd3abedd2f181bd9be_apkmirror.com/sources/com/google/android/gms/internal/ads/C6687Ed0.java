package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.Ed0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6687Ed0 extends AbstractC9939xd0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7300Wf0<Integer> f66489a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7300Wf0<Integer> f66490b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6653Dd0 f66491c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f66492d;

    C6687Ed0(InterfaceC7300Wf0<Integer> interfaceC7300Wf0, InterfaceC7300Wf0<Integer> interfaceC7300Wf02, InterfaceC6653Dd0 interfaceC6653Dd0) {
        this.f66489a = interfaceC7300Wf0;
        this.f66490b = interfaceC7300Wf02;
        this.f66491c = interfaceC6653Dd0;
    }

    static /* synthetic */ Integer b() {
        return -1;
    }

    static /* synthetic */ Integer c() {
        return -1;
    }

    C6687Ed0() {
        this(new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.zd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return C6687Ed0.b();
            }
        }, new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Ad0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return C6687Ed0.c();
            }
        }, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(this.f66492d);
    }

    public HttpURLConnection h() throws IOException {
        C10046yd0.b(((Integer) this.f66489a.zza()).intValue(), ((Integer) this.f66490b.zza()).intValue());
        InterfaceC6653Dd0 interfaceC6653Dd0 = this.f66491c;
        interfaceC6653Dd0.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC6653Dd0.zza();
        this.f66492d = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection i(InterfaceC6653Dd0 interfaceC6653Dd0, final int i10, final int i11) throws IOException {
        this.f66489a = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Bd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.f66490b = new InterfaceC7300Wf0() { // from class: com.google.android.gms.internal.ads.Cd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.f66491c = interfaceC6653Dd0;
        return h();
    }

    public static void j(HttpURLConnection httpURLConnection) {
        C10046yd0.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
