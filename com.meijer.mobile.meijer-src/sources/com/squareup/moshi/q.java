package com.squareup.moshi;

import gw.InterfaceC14417f;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes12.dex */
public abstract class q implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    String f127345e;

    /* renamed from: f, reason: collision with root package name */
    boolean f127346f;

    /* renamed from: g, reason: collision with root package name */
    boolean f127347g;

    /* renamed from: h, reason: collision with root package name */
    boolean f127348h;

    /* renamed from: a, reason: collision with root package name */
    int f127341a = 0;

    /* renamed from: b, reason: collision with root package name */
    int[] f127342b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f127343c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f127344d = new int[32];

    /* renamed from: i, reason: collision with root package name */
    int f127349i = -1;

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

    public static q p(InterfaceC14417f interfaceC14417f) {
        return new n(interfaceC14417f);
    }

    final void A(int i10) {
        this.f127342b[this.f127341a - 1] = i10;
    }

    public final void D(boolean z10) {
        this.f127346f = z10;
    }

    public final void H(boolean z10) {
        this.f127347g = z10;
    }

    final boolean c() {
        int i10 = this.f127341a;
        int[] iArr = this.f127342b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f127342b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f127343c;
        this.f127343c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f127344d;
        this.f127344d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof p)) {
            return true;
        }
        p pVar = (p) this;
        Object[] objArr = pVar.f127339j;
        pVar.f127339j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public final String getPath() {
        return l.a(this.f127341a, this.f127342b, this.f127343c, this.f127344d);
    }

    public final String h() {
        String str = this.f127345e;
        return str != null ? str : "";
    }

    public final boolean i() {
        return this.f127347g;
    }

    public final boolean j() {
        return this.f127346f;
    }

    final int u() {
        int i10 = this.f127341a;
        if (i10 != 0) {
            return this.f127342b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    final void z(int i10) {
        int[] iArr = this.f127342b;
        int i11 = this.f127341a;
        this.f127341a = i11 + 1;
        iArr[i11] = i10;
    }

    q() {
    }

    public void B(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f127345e = str;
    }

    public final void w() throws IOException {
        int iU = u();
        if (iU != 5 && iU != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f127348h = true;
    }
}
