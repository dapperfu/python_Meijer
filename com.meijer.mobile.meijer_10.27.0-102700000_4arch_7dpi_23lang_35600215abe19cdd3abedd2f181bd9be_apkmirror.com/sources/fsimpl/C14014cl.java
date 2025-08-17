package fsimpl;

import android.content.Context;
import com.fullstory.FSRuntimeConfigEditor;
import java.util.List;
import java.util.function.Supplier;

/* renamed from: fsimpl.cl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14014cl implements FSRuntimeConfigEditor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14013ck f131986a;

    /* renamed from: b, reason: collision with root package name */
    private final String f131987b = FSRuntimeConfigEditor.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private final C14019cq f131988c = C14013ck.f131931b.b();

    public C14014cl(C14013ck c14013ck) {
        this.f131986a = c14013ck;
    }

    private Comparable a(Comparable comparable, Comparable comparable2) {
        if (comparable2 == null || comparable == null || comparable2.compareTo(comparable) != 0) {
            return comparable2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a() {
        return String.format("%s.reset()", fK.a(this, this.f131987b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(boolean z10) {
        return String.format("%s.previewMode(%b)", fK.a(this, this.f131987b), Boolean.valueOf(z10));
    }

    List a(Context context) {
        return this.f131988c.a(context);
    }

    @Override // com.fullstory.FSRuntimeConfigEditor
    public FSRuntimeConfigEditor previewMode(final boolean z10) {
        fK.a(new Supplier() { // from class: fsimpl.cl$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.a(z10);
            }
        });
        this.f131988c.a((Boolean) a(Boolean.valueOf(this.f131986a.f131949R), Boolean.valueOf(z10)));
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
        this.f131988c.a();
        return this;
    }
}
