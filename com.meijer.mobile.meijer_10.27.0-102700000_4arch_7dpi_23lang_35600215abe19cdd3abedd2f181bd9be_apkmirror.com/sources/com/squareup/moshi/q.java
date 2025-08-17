package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import kw.InterfaceC15329f;

/* loaded from: classes11.dex */
public abstract class q implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    String f126393e;

    /* renamed from: f, reason: collision with root package name */
    boolean f126394f;

    /* renamed from: g, reason: collision with root package name */
    boolean f126395g;

    /* renamed from: h, reason: collision with root package name */
    boolean f126396h;

    /* renamed from: a, reason: collision with root package name */
    int f126389a = 0;

    /* renamed from: b, reason: collision with root package name */
    int[] f126390b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f126391c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f126392d = new int[32];

    /* renamed from: i, reason: collision with root package name */
    int f126397i = -1;

    public abstract q J(double d10) throws IOException;

    public abstract q K(long j10) throws IOException;

    public abstract q O(Number number) throws IOException;

    public abstract q R(String str) throws IOException;

    public abstract q T(boolean z10) throws IOException;

    public abstract q a() throws IOException;

    public abstract q b() throws IOException;

    public abstract q d() throws IOException;

    public abstract q g() throws IOException;

    public abstract q l(String str) throws IOException;

    public abstract q m() throws IOException;

    public static q p(InterfaceC15329f interfaceC15329f) {
        return new n(interfaceC15329f);
    }

    final void A(int i10) {
        this.f126390b[this.f126389a - 1] = i10;
    }

    public final void D(boolean z10) {
        this.f126394f = z10;
    }

    public final void H(boolean z10) {
        this.f126395g = z10;
    }

    final boolean c() {
        int i10 = this.f126389a;
        int[] iArr = this.f126390b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f126390b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f126391c;
        this.f126391c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f126392d;
        this.f126392d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof p)) {
            return true;
        }
        p pVar = (p) this;
        Object[] objArr = pVar.f126387j;
        pVar.f126387j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public final String getPath() {
        return l.a(this.f126389a, this.f126390b, this.f126391c, this.f126392d);
    }

    public final String h() {
        String str = this.f126393e;
        return str != null ? str : "";
    }

    public final boolean i() {
        return this.f126395g;
    }

    public final boolean j() {
        return this.f126394f;
    }

    final int u() {
        int i10 = this.f126389a;
        if (i10 != 0) {
            return this.f126390b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    final void z(int i10) {
        int[] iArr = this.f126390b;
        int i11 = this.f126389a;
        this.f126389a = i11 + 1;
        iArr[i11] = i10;
    }

    q() {
    }

    public void B(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f126393e = str;
    }

    public final void w() throws IOException {
        int iU = u();
        if (iU != 5 && iU != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f126396h = true;
    }
}
