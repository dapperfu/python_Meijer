package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Modifier f138611a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.f138611a;
        if (obj instanceof K) {
            obj = ((K) obj).f138611a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138611a.hashCode();
    }
}
