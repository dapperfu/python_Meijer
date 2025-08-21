package fsimpl;

import android.content.Context;
import com.fullstory.FSRuntimeConfigEditor;
import java.util.List;
import java.util.function.Supplier;

/* renamed from: fsimpl.cl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14139cl implements FSRuntimeConfigEditor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14138ck f133236a;

    /* renamed from: b, reason: collision with root package name */
    private final String f133237b = FSRuntimeConfigEditor.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private final C14144cq f133238c = C14138ck.f133181b.b();

    public C14139cl(C14138ck c14138ck) {
        this.f133236a = c14138ck;
    }

    private Comparable a(Comparable comparable, Comparable comparable2) {
        if (comparable2 == null || comparable == null || comparable2.compareTo(comparable) != 0) {
            return comparable2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a() {
        return String.format("%s.reset()", fK.a(this, this.f133237b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(boolean z10) {
        return String.format("%s.previewMode(%b)", fK.a(this, this.f133237b), Boolean.valueOf(z10));
    }

    List a(Context context) {
        return this.f133238c.a(context);
    }

    @Override // com.fullstory.FSRuntimeConfigEditor
    public FSRuntimeConfigEditor previewMode(final boolean z10) {
        fK.a(new Supplier() { // from class: fsimpl.cl$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.a(z10);
            }
        });
        this.f133238c.a((Boolean) a(Boolean.valueOf(this.f133236a.f133199R), Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.fullstory.FSRuntimeConfigEditor
    public FSRuntimeConfigEditor reset() {
        fK.a(new Supplier() { // from class: fsimpl.cl$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.a();
            }
        });
        this.f133238c.a();
        return this;
    }
}
