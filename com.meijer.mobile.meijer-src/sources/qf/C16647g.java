package qf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import tf.AbstractC17251F;

/* renamed from: qf.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16647g implements N {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f158354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158355b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158356c;

    private boolean d() {
        byte[] bArr = this.f158354a;
        return bArr == null || bArr.length == 0;
    }

    @Override // qf.N
    public String b() {
        return this.f158356c;
    }

    C16647g(String str, String str2, byte[] bArr) {
        this.f158355b = str;
        this.f158356c = str2;
        this.f158354a = bArr;
    }

    private byte[] c() throws IOException {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f158354a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // qf.N
    public AbstractC17251F.d.b a() throws IOException {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return AbstractC17251F.d.b.a().b(bArrC).c(this.f158355b).a();
    }

    @Override // qf.N
    public InputStream i() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f158354a);
    }
}
