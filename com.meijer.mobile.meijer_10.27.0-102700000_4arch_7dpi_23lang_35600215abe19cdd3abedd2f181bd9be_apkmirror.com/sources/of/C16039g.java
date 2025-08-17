package of;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import rf.AbstractC16777F;

/* renamed from: of.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C16039g implements N {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f153502a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f153504c;

    private boolean d() {
        byte[] bArr = this.f153502a;
        return bArr == null || bArr.length == 0;
    }

    @Override // of.N
    public String b() {
        return this.f153504c;
    }

    C16039g(String str, String str2, byte[] bArr) {
        this.f153503b = str;
        this.f153504c = str2;
        this.f153502a = bArr;
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
                    gZIPOutputStream.write(this.f153502a);
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

    @Override // of.N
    public AbstractC16777F.d.b a() throws IOException {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return AbstractC16777F.d.b.a().b(bArrC).c(this.f153503b).a();
    }

    @Override // of.N
    public InputStream i() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f153502a);
    }
}
