package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class H implements J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Kind f139198a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.f139198a;
        if (obj instanceof H) {
            obj = ((H) obj).f139198a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139198a.hashCode();
    }

    @Override // j$.nio.file.J
    public final /* synthetic */ String name() {
        return this.f139198a.name();
    }

    @Override // j$.nio.file.J
    public final /* synthetic */ Class type() {
        return this.f139198a.type();
    }
}
