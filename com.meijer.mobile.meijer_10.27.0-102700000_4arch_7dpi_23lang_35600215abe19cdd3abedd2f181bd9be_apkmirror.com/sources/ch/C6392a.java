package ch;

import com.squareup.picasso.Downloader;
import okhttp3.OkHttpClient;
import okhttp3.b;
import okhttp3.d;

/* renamed from: ch.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6392a implements Downloader {

    /* renamed from: a, reason: collision with root package name */
    private final d.a f61783a;

    /* renamed from: b, reason: collision with root package name */
    private final b f61784b;

    public C6392a(OkHttpClient okHttpClient) {
        this.f61783a = okHttpClient;
        this.f61784b = okHttpClient.getCache();
    }
}
