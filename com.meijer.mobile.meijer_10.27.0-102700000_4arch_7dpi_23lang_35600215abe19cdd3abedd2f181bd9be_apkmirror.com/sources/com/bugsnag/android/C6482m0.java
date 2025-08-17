package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/* renamed from: com.bugsnag.android.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6482m0 extends C6484n0 {

    /* renamed from: l, reason: collision with root package name */
    private final D0 f63491l;

    /* renamed from: m, reason: collision with root package name */
    private final Writer f63492m;

    /* renamed from: com.bugsnag.android.m0$a */
    public interface a {
        void toStream(C6482m0 c6482m0) throws IOException;
    }

    public C6482m0(Writer writer) {
        super(writer);
        B(false);
        this.f63492m = writer;
        this.f63491l = new D0();
    }

    public void e0(Object obj) throws IOException {
        h0(obj, false);
    }

    public void c0(File file) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        if (file == null || file.length() <= 0) {
            return;
        }
        super.flush();
        b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                C6472h0.b(bufferedReader, this.f63492m);
                C6472h0.a(bufferedReader);
                this.f63492m.flush();
            } catch (Throwable th3) {
                th2 = th3;
                C6472h0.a(bufferedReader);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bufferedReader = null;
        }
    }

    public void h0(Object obj, boolean z10) throws IOException {
        if (obj instanceof a) {
            ((a) obj).toStream(this);
        } else {
            this.f63491l.f(obj, this, z10);
        }
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 H(long j10) throws IOException {
        return super.H(j10);
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 J(Boolean bool) throws IOException {
        return super.J(bool);
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 K(Number number) throws IOException {
        return super.K(number);
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 O(String str) throws IOException {
        return super.O(str);
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 R(boolean z10) throws IOException {
        return super.R(z10);
    }

    @Override // com.bugsnag.android.C6484n0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C6482m0 l(String str) throws IOException {
        super.l(str);
        return this;
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 c() throws IOException {
        return super.c();
    }

    @Override // com.bugsnag.android.C6484n0, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 d() throws IOException {
        return super.d();
    }

    @Override // com.bugsnag.android.C6484n0, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 h() throws IOException {
        return super.h();
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 i() throws IOException {
        return super.i();
    }

    @Override // com.bugsnag.android.C6484n0
    public /* bridge */ /* synthetic */ C6484n0 p() throws IOException {
        return super.p();
    }

    C6482m0(C6482m0 c6482m0, D0 d02) {
        super(c6482m0.f63492m);
        B(c6482m0.j());
        this.f63492m = c6482m0.f63492m;
        this.f63491l = d02;
    }
}
