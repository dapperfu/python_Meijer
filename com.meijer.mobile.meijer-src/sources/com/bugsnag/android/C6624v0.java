package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/* renamed from: com.bugsnag.android.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6624v0 extends C6626w0 {

    /* renamed from: l, reason: collision with root package name */
    private final O0 f64414l;

    /* renamed from: m, reason: collision with root package name */
    private final Writer f64415m;

    /* renamed from: com.bugsnag.android.v0$a */
    public interface a {
        void toStream(C6624v0 c6624v0) throws IOException;
    }

    public C6624v0(Writer writer) {
        super(writer);
        B(false);
        this.f64415m = writer;
        this.f64414l = new O0();
    }

    public void b0(File file) throws Throwable {
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
                C6615q0.b(bufferedReader, this.f64415m);
                C6615q0.a(bufferedReader);
                this.f64415m.flush();
            } catch (Throwable th3) {
                th2 = th3;
                C6615q0.a(bufferedReader);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bufferedReader = null;
        }
    }

    public void e0(Object obj) throws Throwable {
        if (obj instanceof File) {
            b0((File) obj);
        } else {
            h0(obj, false);
        }
    }

    public void h0(Object obj, boolean z10) throws IOException {
        if (obj instanceof a) {
            ((a) obj).toStream(this);
        } else {
            this.f64414l.f(obj, this, z10);
        }
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 H(long j10) throws IOException {
        return super.H(j10);
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 J(Boolean bool) throws IOException {
        return super.J(bool);
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 K(Number number) throws IOException {
        return super.K(number);
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 O(String str) throws IOException {
        return super.O(str);
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 R(boolean z10) throws IOException {
        return super.R(z10);
    }

    @Override // com.bugsnag.android.C6626w0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public C6624v0 l(String str) throws IOException {
        super.l(str);
        return this;
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 c() throws IOException {
        return super.c();
    }

    @Override // com.bugsnag.android.C6626w0, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 d() throws IOException {
        return super.d();
    }

    @Override // com.bugsnag.android.C6626w0, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 h() throws IOException {
        return super.h();
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 i() throws IOException {
        return super.i();
    }

    @Override // com.bugsnag.android.C6626w0
    public /* bridge */ /* synthetic */ C6626w0 p() throws IOException {
        return super.p();
    }

    C6624v0(C6624v0 c6624v0, O0 o02) {
        super(c6624v0.f64415m);
        B(c6624v0.j());
        this.f64415m = c6624v0.f64415m;
        this.f64414l = o02;
    }
}
