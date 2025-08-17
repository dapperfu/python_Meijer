package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class H implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Kind f138609a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.f138609a;
        if (obj instanceof H) {
            obj = ((H) obj).f138609a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138609a.hashCode();
    }

    @Override // j$.nio.file.J
    public final /* synthetic */ String name() {
        return this.f138609a.name();
    }

    @Override // j$.nio.file.J
    public final /* synthetic */ Class type() {
        return this.f138609a.type();
    }
}
