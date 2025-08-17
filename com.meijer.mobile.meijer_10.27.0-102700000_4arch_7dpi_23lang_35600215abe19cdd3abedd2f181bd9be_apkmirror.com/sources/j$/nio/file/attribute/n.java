package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements FileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f138633a;

    public final /* synthetic */ boolean equals(Object obj) {
        o oVar = this.f138633a;
        if (obj instanceof n) {
            obj = ((n) obj).f138633a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f138633a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f138633a.name();
    }
}
