package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements FileAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f138630a;

    public final /* synthetic */ boolean equals(Object obj) {
        k kVar = this.f138630a;
        if (obj instanceof j) {
            obj = ((j) obj).f138630a;
        }
        return kVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138630a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f138630a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f138630a.value();
    }
}
