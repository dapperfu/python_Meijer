package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements FileAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f139219a;

    public final /* synthetic */ boolean equals(Object obj) {
        k kVar = this.f139219a;
        if (obj instanceof j) {
            obj = ((j) obj).f139219a;
        }
        return kVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139219a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f139219a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f139219a.value();
    }
}
