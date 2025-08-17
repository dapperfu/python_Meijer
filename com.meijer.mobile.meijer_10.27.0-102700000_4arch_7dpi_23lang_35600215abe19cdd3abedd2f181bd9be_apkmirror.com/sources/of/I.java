package of;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
class I implements N {

    /* renamed from: a, reason: collision with root package name */
    private final File f153453a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153454b;

    /* renamed from: c, reason: collision with root package name */
    private final String f153455c;

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

    @Override // of.N
    public String b() {
        return this.f153455c;
    }

    @Override // of.N
    public InputStream i() {
        if (this.f153453a.exists() && this.f153453a.isFile()) {
            try {
                return new FileInputStream(this.f153453a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    I(String str, String str2, File file) {
        this.f153454b = str;
        this.f153455c = str2;
        this.f153453a = file;
    }

    @Override // of.N
    public AbstractC16777F.d.b a() throws IOException {
        byte[] bArrC = c();
        if (bArrC != null) {
            return AbstractC16777F.d.b.a().b(bArrC).c(this.f153454b).a();
        }
        return null;
    }
}
