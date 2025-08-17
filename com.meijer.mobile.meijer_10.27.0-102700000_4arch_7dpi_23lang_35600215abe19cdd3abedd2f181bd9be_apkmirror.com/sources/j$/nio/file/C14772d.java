package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14772d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileStore f138646a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.f138646a;
        if (obj instanceof C14772d) {
            obj = ((C14772d) obj).f138646a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138646a.hashCode();
    }

    public C14772d(FileStore fileStore) {
        this.f138646a = fileStore;
    }
}
