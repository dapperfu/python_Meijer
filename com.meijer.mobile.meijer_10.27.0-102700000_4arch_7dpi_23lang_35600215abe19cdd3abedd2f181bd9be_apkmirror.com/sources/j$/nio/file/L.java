package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes3.dex */
public final /* synthetic */ class L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchKey f138612a;

    public /* synthetic */ L(WatchKey watchKey) {
        this.f138612a = watchKey;
    }

    public static /* synthetic */ L a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new L(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.f138612a;
        if (obj instanceof L) {
            obj = ((L) obj).f138612a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138612a.hashCode();
    }
}
