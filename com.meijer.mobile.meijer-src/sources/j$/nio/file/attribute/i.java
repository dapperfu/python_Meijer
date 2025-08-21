package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttribute f139218a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f139218a;
        if (obj instanceof i) {
            obj = ((i) obj).f139218a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139218a.hashCode();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ String name() {
        return this.f139218a.name();
    }

    @Override // j$.nio.file.attribute.k
    public final /* synthetic */ Object value() {
        return this.f139218a.value();
    }
}
