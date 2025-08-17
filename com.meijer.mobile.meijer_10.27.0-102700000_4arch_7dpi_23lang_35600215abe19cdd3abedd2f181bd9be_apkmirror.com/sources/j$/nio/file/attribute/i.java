package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttribute f138629a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f138629a;
        if (obj instanceof i) {
            obj = ((i) obj).f138629a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138629a.hashCode();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ String name() {
        return this.f138629a.name();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ Object value() {
        return this.f138629a.value();
    }
}
