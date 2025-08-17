package com.radiusnetworks.flybuy.api.network;

import com.fullstory.FS;
import iw.a;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes11.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static Retrofit f119952a;

    public static void a(String baseUrl, File cacheDir) {
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(cacheDir, "cacheDir");
        com.radiusnetworks.flybuy.api.network.common.d dVar = new com.radiusnetworks.flybuy.api.network.common.d(baseUrl, cacheDir);
        Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderB = builder.d(30000L, timeUnit).V(30000L, timeUnit).j(true).b(dVar.f119922b);
        builderB.addNetworkInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.d()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.a()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.b()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.c()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.e());
        if (dVar.f119921a) {
            iw.a aVar = new iw.a();
            aVar.e(a.b.f138531d);
            builderB.addInterceptor(aVar);
        }
        Retrofit retrofitBuild = builderAddConverterFactory.client(builderB.a()).build();
        Intrinsics.i(retrofitBuild, "build(...)");
        f119952a = retrofitBuild;
    }
}
