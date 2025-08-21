package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Modifier f139200a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.f139200a;
        if (obj instanceof K) {
            obj = ((K) obj).f139200a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139200a.hashCode();
    }
}
