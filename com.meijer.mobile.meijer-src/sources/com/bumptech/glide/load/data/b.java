package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f64602a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f64603b;

    /* renamed from: c, reason: collision with root package name */
    private T f64604c;

    protected abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f64604c;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public X6.a d() {
        return X6.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f64603b, this.f64602a);
            this.f64604c = tF;
            aVar.f(tF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                FS.log_d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public b(AssetManager assetManager, String str) {
        this.f64603b = assetManager;
        this.f64602a = str;
    }
}
