package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.B;
import androidx.compose.ui.node.Y;
import kotlin.C17708Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u0.n0;
import u0.q0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/Y;", "Lu0/n0;", "Lu0/q0;", "serviceAdapter", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "textFieldSelectionManager", "<init>", "(Lu0/q0;Landroidx/compose/foundation/text/B;Lw0/Q;)V", "n", "()Lu0/n0;", "node", "", "o", "(Lu0/n0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lu0/q0;", "getServiceAdapter", "()Lu0/q0;", "c", "Landroidx/compose/foundation/text/B;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/B;", "d", "Lw0/Q;", "getTextFieldSelectionManager", "()Lw0/Q;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends Y<n0> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q0 serviceAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final B legacyTextFieldState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C17708Q textFieldSelectionManager;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) other;
        return Intrinsics.e(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && Intrinsics.e(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && Intrinsics.e(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public n0 b() {
        return new n0(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(n0 node) {
        node.M2(this.serviceAdapter);
        node.L2(this.legacyTextFieldState);
        node.N2(this.textFieldSelectionManager);
    }

    public LegacyAdaptingPlatformTextInputModifier(q0 q0Var, B b10, C17708Q c17708q) {
        this.serviceAdapter = q0Var;
        this.legacyTextFieldState = b10;
        this.textFieldSelectionManager = c17708q;
    }
}
