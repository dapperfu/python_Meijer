package x3;

import a3.InterfaceC5654k;
import java.io.IOException;

/* renamed from: x3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18078q extends InterfaceC5654k {
    int a(int i10) throws IOException;

    boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void d();

    boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long g();

    long getLength();

    long getPosition();

    void i(int i10) throws IOException;

    int j(byte[] bArr, int i10, int i11) throws IOException;

    void k(int i10) throws IOException;

    boolean l(int i10, boolean z10) throws IOException;

    void m(byte[] bArr, int i10, int i11) throws IOException;

    @Override // a3.InterfaceC5654k
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
