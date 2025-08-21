package e;

import g.AbstractC14276c;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le/a;", "I", "", "<init>", "()V", "input", "Landroidx/core/app/d;", "options", "", "a", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "Lg/c;", "Lg/c;", "getLauncher", "()Lg/c;", "b", "(Lg/c;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13733a<I> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC14276c<I> launcher;

    public final void a(I input, androidx.core.app.d options) {
        Unit unit;
        AbstractC14276c<I> abstractC14276c = this.launcher;
        if (abstractC14276c != null) {
            abstractC14276c.b(input, options);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(AbstractC14276c<I> abstractC14276c) {
        this.launcher = abstractC14276c;
    }

    public final void c() {
        Unit unit;
        AbstractC14276c<I> abstractC14276c = this.launcher;
        if (abstractC14276c != null) {
            abstractC14276c.c();
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
