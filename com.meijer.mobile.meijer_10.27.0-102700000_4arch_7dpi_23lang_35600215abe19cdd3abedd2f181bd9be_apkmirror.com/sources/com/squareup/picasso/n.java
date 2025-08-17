package com.squareup.picasso;

import android.content.Context;
import hu.C14571b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class n implements Downloader {

    /* renamed from: a, reason: collision with root package name */
    private final hu.i f126546a;

    public n(Context context) {
        this(v.d(context));
    }

    public n(File file) {
        this(file, v.a(file));
    }

    private static hu.i a() {
        hu.i iVar = new hu.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.c(15000L, timeUnit);
        iVar.d(20000L, timeUnit);
        iVar.e(20000L, timeUnit);
        return iVar;
    }

    public n(File file, long j10) {
        this(a());
        try {
            this.f126546a.b(new C14571b(file, j10));
        } catch (IOException unused) {
        }
    }

    public n(hu.i iVar) {
        this.f126546a = iVar;
    }
}
