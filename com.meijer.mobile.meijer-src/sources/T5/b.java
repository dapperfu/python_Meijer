package T5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes4.dex */
class b implements S5.c {

    /* renamed from: a, reason: collision with root package name */
    private final File f35909a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.b f35910b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f35911c;

    @Override // S5.c
    public InputStream getData() {
        try {
            return new FileInputStream(this.f35909a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // S5.c
    public Map<String, String> k() {
        return this.f35911c;
    }

    public b(File file, S5.b bVar, Map<String, String> map) {
        this.f35909a = file;
        this.f35910b = bVar;
        this.f35911c = map;
    }
}
