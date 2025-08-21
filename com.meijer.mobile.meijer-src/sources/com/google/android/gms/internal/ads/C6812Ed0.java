package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.Ed0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6812Ed0 extends AbstractC10064xd0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7425Wf0<Integer> f67329a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7425Wf0<Integer> f67330b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6778Dd0 f67331c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f67332d;

    C6812Ed0(InterfaceC7425Wf0<Integer> interfaceC7425Wf0, InterfaceC7425Wf0<Integer> interfaceC7425Wf02, InterfaceC6778Dd0 interfaceC6778Dd0) {
        this.f67329a = interfaceC7425Wf0;
        this.f67330b = interfaceC7425Wf02;
        this.f67331c = interfaceC6778Dd0;
    }

    static /* synthetic */ Integer b() {
        return -1;
    }

    static /* synthetic */ Integer c() {
        return -1;
    }

    C6812Ed0() {
        this(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.zd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return C6812Ed0.b();
            }
        }, new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Ad0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return C6812Ed0.c();
            }
        }, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(this.f67332d);
    }

    public HttpURLConnection h() throws IOException {
        C10171yd0.b(((Integer) this.f67329a.zza()).intValue(), ((Integer) this.f67330b.zza()).intValue());
        InterfaceC6778Dd0 interfaceC6778Dd0 = this.f67331c;
        interfaceC6778Dd0.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC6778Dd0.zza();
        this.f67332d = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection i(InterfaceC6778Dd0 interfaceC6778Dd0, final int i10, final int i11) throws IOException {
        this.f67329a = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Bd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.f67330b = new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Cd0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.f67331c = interfaceC6778Dd0;
        return h();
    }

    public static void j(HttpURLConnection httpURLConnection) {
        C10171yd0.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
