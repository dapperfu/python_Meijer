package androidx.compose.ui.semantics;

import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r1.C16810d;
import r1.u;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/Y;", "Lr1/d;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Lkotlin/Function1;", "Lr1/u;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "k", "()Lr1/d;", "node", "n", "(Lr1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends Y<C16810d> implements SemanticsModifier {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<u, Unit> properties;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearAndSetSemanticsElement) && Intrinsics.e(this.properties, ((ClearAndSetSemanticsElement) other).properties);
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.v(false);
        semanticsConfiguration.u(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C16810d b() {
        return new C16810d(false, true, this.properties);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(C16810d node) {
        node.L2(this.properties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(Function1<? super u, Unit> function1) {
        this.properties = function1;
    }
}
