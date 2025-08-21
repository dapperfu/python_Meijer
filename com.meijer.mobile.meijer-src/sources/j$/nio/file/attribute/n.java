package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements FileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f139222a;

    public final /* synthetic */ boolean equals(Object obj) {
        o oVar = this.f139222a;
        if (obj instanceof n) {
            obj = ((n) obj).f139222a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139222a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f139222a.name();
    }
}
