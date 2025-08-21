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
    private static final G7 f71330g = new Sx0("eof ");

    /* renamed from: a, reason: collision with root package name */
    protected D7 f71331a;

    /* renamed from: b, reason: collision with root package name */
    protected Ux0 f71332b;

    /* renamed from: c, reason: collision with root package name */
    G7 f71333c = null;

    /* renamed from: d, reason: collision with root package name */
    long f71334d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f71335e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final List f71336f = new ArrayList();

    public void close() throws IOException {
    }

    static {
        AbstractC7650ay0.b(Tx0.class);
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final G7 next() {
        G7 g7A;
        G7 g72 = this.f71333c;
        if (g72 != null && g72 != f71330g) {
            this.f71333c = null;
            return g72;
        }
        Ux0 ux0 = this.f71332b;
        if (ux0 == null || this.f71334d >= this.f71335e) {
            this.f71333c = f71330g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (ux0) {
                this.f71332b.f(this.f71334d);
                g7A = this.f71331a.a(this.f71332b, this);
                this.f71334d = this.f71332b.zzb();
            }
            return g7A;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List d() {
        return (this.f71332b == null || this.f71333c == f71330g) ? this.f71336f : new Zx0(this.f71336f, this);
    }

    public final void g(Ux0 ux0, long j10, D7 d72) throws IOException {
        this.f71332b = ux0;
        this.f71334d = ux0.zzb();
        ux0.f(ux0.zzb() + j10);
        this.f71335e = ux0.zzb();
        this.f71331a = d72;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        G7 g72 = this.f71333c;
        if (g72 == f71330g) {
            return false;
        }
        if (g72 != null) {
            return true;
        }
        try {
            this.f71333c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f71333c = f71330g;
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
        for (int i10 = 0; i10 < this.f71336f.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((G7) this.f71336f.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
