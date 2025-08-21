package com.google.android.gms.internal.pal;

import com.fullstory.FS;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.pal.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10852i6 extends AbstractC10736b6 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC11107y6 f84009a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC11107y6 f84010b;

    /* renamed from: c, reason: collision with root package name */
    private HttpURLConnection f84011c;

    /* renamed from: d, reason: collision with root package name */
    private C10787e6 f84012d;

    C10852i6() {
        C10820g6 c10820g6 = new InterfaceC11107y6() { // from class: com.google.android.gms.internal.pal.g6
            @Override // com.google.android.gms.internal.pal.InterfaceC11107y6
            public final Object zza() {
                return -1;
            }
        };
        C10836h6 c10836h6 = new InterfaceC11107y6() { // from class: com.google.android.gms.internal.pal.h6
            @Override // com.google.android.gms.internal.pal.InterfaceC11107y6
            public final Object zza() {
                return -1;
            }
        };
        this.f84009a = c10820g6;
        this.f84010b = c10836h6;
        this.f84012d = null;
    }

    public final URLConnection b(URL url, int i10) throws IOException {
        final int i11 = 26624;
        this.f84009a = new InterfaceC11107y6(i11) { // from class: com.google.android.gms.internal.pal.d6
            @Override // com.google.android.gms.internal.pal.InterfaceC11107y6
            public final Object zza() {
                return 26624;
            }
        };
        this.f84012d = new C10787e6(url);
        C10753c6.b(((Integer) this.f84009a.zza()).intValue(), -1);
        C10787e6 c10787e6 = this.f84012d;
        c10787e6.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) FS.urlconnection_wrapInstance(c10787e6.f83939a.openConnection());
        this.f84011c = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f84011c;
        C10753c6.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
