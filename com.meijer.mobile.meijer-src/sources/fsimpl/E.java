package fsimpl;

import com.fullstory.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes15.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private final File f132623a;

    /* renamed from: b, reason: collision with root package name */
    private final File f132624b;

    /* renamed from: c, reason: collision with root package name */
    private final File f132625c;

    /* renamed from: d, reason: collision with root package name */
    private final File f132626d;

    public E(File file) throws IOException {
        if (file.isFile()) {
            throw new IOException("Cache directory is a file, can't proceed");
        }
        File file2 = new File(file, Log.TAG);
        this.f132626d = file2;
        File file3 = new File(file2, "trash");
        this.f132624b = file3;
        File file4 = new File(file2, "tmp");
        this.f132623a = file4;
        File file5 = new File(file2, "upload");
        this.f132625c = file5;
        fG.a(file2, null);
        fG.a(file3, null);
        if (file4.exists()) {
            fG.b(file4, file3);
        }
        fG.a(file4, file3);
        fG.a(file5, file3);
    }

    public File a() {
        return this.f132623a;
    }

    public File a(String str) {
        return File.createTempFile("temp", "." + str, this.f132623a);
    }

    public void a(File file) throws IOException {
        fG.b(file, this.f132624b);
    }

    public File b() {
        return this.f132624b;
    }

    public File c() {
        return this.f132625c;
    }
}
