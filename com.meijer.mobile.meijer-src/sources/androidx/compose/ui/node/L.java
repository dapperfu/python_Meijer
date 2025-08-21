package androidx.compose.ui.node;

import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "b", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/Owner;", "LH1/d;", "a", "LH1/d;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final H1.d f51414a = H1.f.b(1.0f, 0.0f, 2, null);

    public static final Owner b(LayoutNode layoutNode) {
        Owner owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        C14920a.c("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
