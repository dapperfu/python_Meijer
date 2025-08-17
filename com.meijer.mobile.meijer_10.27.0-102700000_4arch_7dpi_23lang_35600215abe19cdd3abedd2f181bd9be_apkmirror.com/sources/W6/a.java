package W6;

import java.io.File;

/* loaded from: classes4.dex */
class a {
    public File b(String str) {
        return new File(str);
    }

    a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public long c(File file) {
        return file.length();
    }
}
