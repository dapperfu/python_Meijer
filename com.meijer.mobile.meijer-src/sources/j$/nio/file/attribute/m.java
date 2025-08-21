package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttributeView f139221a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.f139221a;
        if (obj instanceof m) {
            obj = ((m) obj).f139221a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f139221a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.f139221a.name();
    }
}
