package com.google.android.gms.internal.pal;

import com.fullstory.FS;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.pal.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10727i6 extends AbstractC10611b6 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC10982y6 f83169a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10982y6 f83170b;

    /* renamed from: c, reason: collision with root package name */
    private HttpURLConnection f83171c;

    /* renamed from: d, reason: collision with root package name */
    private C10662e6 f83172d;

    C10727i6() {
        C10695g6 c10695g6 = new InterfaceC10982y6() { // from class: com.google.android.gms.internal.pal.g6
            @Override // com.google.android.gms.internal.pal.InterfaceC10982y6
            public final Object zza() {
                return -1;
            }
        };
        C10711h6 c10711h6 = new InterfaceC10982y6() { // from class: com.google.android.gms.internal.pal.h6
            @Override // com.google.android.gms.internal.pal.InterfaceC10982y6
            public final Object zza() {
                return -1;
            }
        };
        this.f83169a = c10695g6;
        this.f83170b = c10711h6;
        this.f83172d = null;
    }

    public final URLConnection b(URL url, int i10) throws IOException {
        final int i11 = 26624;
        this.f83169a = new InterfaceC10982y6(i11) { // from class: com.google.android.gms.internal.pal.d6
            @Override // com.google.android.gms.internal.pal.InterfaceC10982y6
            public final Object zza() {
                return 26624;
            }
        };
        this.f83172d = new C10662e6(url);
        C10628c6.b(((Integer) this.f83169a.zza()).intValue(), -1);
        C10662e6 c10662e6 = this.f83172d;
        c10662e6.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) FS.urlconnection_wrapInstance(c10662e6.f83099a.openConnection());
        this.f83171c = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f83171c;
        C10628c6.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
