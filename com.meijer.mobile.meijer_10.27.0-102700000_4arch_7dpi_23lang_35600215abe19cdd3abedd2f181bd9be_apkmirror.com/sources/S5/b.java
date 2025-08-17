package S5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes4.dex */
class b implements R5.c {

    /* renamed from: a, reason: collision with root package name */
    private final File f33239a;

    /* renamed from: b, reason: collision with root package name */
    private final R5.b f33240b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f33241c;

    @Override // R5.c
    public InputStream getData() {
        try {
            return new FileInputStream(this.f33239a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // R5.c
    public Map<String, String> k() {
        return this.f33241c;
    }

    public b(File file, R5.b bVar, Map<String, String> map) {
        this.f33239a = file;
        this.f33240b = bVar;
        this.f33241c = map;
    }
}
