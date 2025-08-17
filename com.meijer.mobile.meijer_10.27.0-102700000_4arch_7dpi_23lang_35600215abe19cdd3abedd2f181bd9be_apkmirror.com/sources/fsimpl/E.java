package fsimpl;

import com.fullstory.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes14.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private final File f131373a;

    /* renamed from: b, reason: collision with root package name */
    private final File f131374b;

    /* renamed from: c, reason: collision with root package name */
    private final File f131375c;

    /* renamed from: d, reason: collision with root package name */
    private final File f131376d;

    public E(File file) throws IOException {
        if (file.isFile()) {
            throw new IOException("Cache directory is a file, can't proceed");
        }
        File file2 = new File(file, Log.TAG);
        this.f131376d = file2;
        File file3 = new File(file2, "trash");
        this.f131374b = file3;
        File file4 = new File(file2, "tmp");
        this.f131373a = file4;
        File file5 = new File(file2, "upload");
        this.f131375c = file5;
        fG.a(file2, null);
        fG.a(file3, null);
        if (file4.exists()) {
            fG.b(file4, file3);
        }
        fG.a(file4, file3);
        fG.a(file5, file3);
    }

    public File a() {
        return this.f131373a;
    }

    public File a(String str) {
        return File.createTempFile("temp", "." + str, this.f131373a);
    }

    public void a(File file) throws IOException {
        fG.b(file, this.f131374b);
    }

    public File b() {
        return this.f131374b;
    }

    public File c() {
        return this.f131375c;
    }
}
