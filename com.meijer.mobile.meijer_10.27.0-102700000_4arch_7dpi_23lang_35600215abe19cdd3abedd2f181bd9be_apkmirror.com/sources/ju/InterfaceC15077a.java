package ju;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kw.I;
import kw.w;

/* renamed from: ju.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15077a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC15077a f141060a = new C2233a();

    boolean a(File file) throws IOException;

    I b(File file) throws FileNotFoundException;

    I c(File file) throws FileNotFoundException;

    void d(File file, File file2) throws IOException;

    void e(File file) throws IOException;

    /* renamed from: ju.a$a, reason: collision with other inner class name */
    static class C2233a implements InterfaceC15077a {
        C2233a() {
        }

        @Override // ju.InterfaceC15077a
        public boolean a(File file) throws IOException {
            return file.exists();
        }

        @Override // ju.InterfaceC15077a
        public I b(File file) throws FileNotFoundException {
            try {
                return w.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return w.a(file);
            }
        }

        @Override // ju.InterfaceC15077a
        public I c(File file) throws FileNotFoundException {
            try {
                return w.e(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return w.e(file);
            }
        }

        @Override // ju.InterfaceC15077a
        public void d(File file, File file2) throws IOException {
            e(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // ju.InterfaceC15077a
        public void e(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }
}
