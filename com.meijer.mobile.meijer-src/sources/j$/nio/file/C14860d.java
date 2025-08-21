package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14860d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileStore f139235a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.f139235a;
        if (obj instanceof C14860d) {
            obj = ((C14860d) obj).f139235a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139235a.hashCode();
    }

    public C14860d(FileStore fileStore) {
        this.f139235a = fileStore;
    }
}
