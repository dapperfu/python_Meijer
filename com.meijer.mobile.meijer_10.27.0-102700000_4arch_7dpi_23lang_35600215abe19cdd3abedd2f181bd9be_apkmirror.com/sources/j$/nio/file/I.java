package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements WatchEvent.Kind {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f138610a;

    public final /* synthetic */ boolean equals(Object obj) {
        J j10 = this.f138610a;
        if (obj instanceof I) {
            obj = ((I) obj).f138610a;
        }
        return j10.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138610a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.f138610a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.f138610a.type();
    }
}
