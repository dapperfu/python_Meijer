package com.squareup.picasso;

import android.net.NetworkInfo;
import java.io.IOException;

/* loaded from: classes11.dex */
class m extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Downloader f126544a;

    /* renamed from: b, reason: collision with root package name */
    private final t f126545b;

    static class a extends IOException {
    }

    @Override // com.squareup.picasso.r
    public boolean a(q qVar) {
        throw null;
    }

    @Override // com.squareup.picasso.r
    int b() {
        return 2;
    }

    @Override // com.squareup.picasso.r
    boolean d() {
        return true;
    }

    @Override // com.squareup.picasso.r
    boolean c(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public m(Downloader downloader, t tVar) {
        this.f126544a = downloader;
        this.f126545b = tVar;
    }
}
