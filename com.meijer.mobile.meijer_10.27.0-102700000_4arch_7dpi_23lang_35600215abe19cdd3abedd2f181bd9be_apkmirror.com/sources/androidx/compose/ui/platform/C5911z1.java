package androidx.compose.ui.platform;

import Z.AbstractC5519q;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16706n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/z1;", "", "Lr1/n;", "semanticsNode", "LZ/q;", "Landroidx/compose/ui/platform/A1;", "currentSemanticsNodes", "<init>", "(Lr1/n;LZ/q;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "b", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "LZ/L;", "LZ/L;", "()LZ/L;", "children", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5911z1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SemanticsConfiguration unmergedConfig;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z.L children;

    /* renamed from: a, reason: from getter */
    public final Z.L getChildren() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public C5911z1(C16706n c16706n, AbstractC5519q<A1> abstractC5519q) {
        this.unmergedConfig = c16706n.getUnmergedConfig();
        this.children = new Z.L(c16706n.t().size());
        List<C16706n> listT = c16706n.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            C16706n c16706n2 = listT.get(i10);
            if (abstractC5519q.a(c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                this.children.g(c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            }
        }
    }
}
