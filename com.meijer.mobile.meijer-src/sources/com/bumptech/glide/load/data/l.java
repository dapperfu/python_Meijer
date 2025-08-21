package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f64626a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f64627b;

    /* renamed from: c, reason: collision with root package name */
    private T f64628c;

    protected abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f64628c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public X6.a d() {
        return X6.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f64626a, this.f64627b);
            this.f64628c = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                FS.log_d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public l(ContentResolver contentResolver, Uri uri) {
        this.f64627b = contentResolver;
        this.f64626a = uri;
    }
}
