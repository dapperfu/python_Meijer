package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public class Tx0 implements Iterator, Closeable, I7 {

    /* renamed from: g, reason: collision with root package name */
    private static final G7 f70490g = new Sx0("eof ");

    /* renamed from: a, reason: collision with root package name */
    protected D7 f70491a;

    /* renamed from: b, reason: collision with root package name */
    protected Ux0 f70492b;

    /* renamed from: c, reason: collision with root package name */
    G7 f70493c = null;

    /* renamed from: d, reason: collision with root package name */
    long f70494d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f70495e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final List f70496f = new ArrayList();

    public void close() throws IOException {
    }

    static {
        AbstractC7525ay0.b(Tx0.class);
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final G7 next() {
        G7 g7A;
        G7 g72 = this.f70493c;
        if (g72 != null && g72 != f70490g) {
            this.f70493c = null;
            return g72;
        }
        Ux0 ux0 = this.f70492b;
        if (ux0 == null || this.f70494d >= this.f70495e) {
            this.f70493c = f70490g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (ux0) {
                this.f70492b.f(this.f70494d);
                g7A = this.f70491a.a(this.f70492b, this);
                this.f70494d = this.f70492b.zzb();
            }
            return g7A;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List d() {
        return (this.f70492b == null || this.f70493c == f70490g) ? this.f70496f : new Zx0(this.f70496f, this);
    }

    public final void g(Ux0 ux0, long j10, D7 d72) throws IOException {
        this.f70492b = ux0;
        this.f70494d = ux0.zzb();
        ux0.f(ux0.zzb() + j10);
        this.f70495e = ux0.zzb();
        this.f70491a = d72;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        G7 g72 = this.f70493c;
        if (g72 == f70490g) {
            return false;
        }
        if (g72 != null) {
            return true;
        }
        try {
            this.f70493c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f70493c = f70490g;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f70496f.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((G7) this.f70496f.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
