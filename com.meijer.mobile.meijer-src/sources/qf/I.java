package qf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
class I implements N {

    /* renamed from: a, reason: collision with root package name */
    private final File f158305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158306b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158307c;

    private byte[] c() throws IOException {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamI = i();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamI == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamI != null) {
                            inputStreamI.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamI.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamI.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // qf.N
    public String b() {
        return this.f158307c;
    }

    @Override // qf.N
    public InputStream i() {
        if (this.f158305a.exists() && this.f158305a.isFile()) {
            try {
                return new FileInputStream(this.f158305a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    I(String str, String str2, File file) {
        this.f158306b = str;
        this.f158307c = str2;
        this.f158305a = file;
    }

    @Override // qf.N
    public AbstractC17251F.d.b a() throws IOException {
        byte[] bArrC = c();
        if (bArrC != null) {
            return AbstractC17251F.d.b.a().b(bArrC).c(this.f158306b).a();
        }
        return null;
    }
}
