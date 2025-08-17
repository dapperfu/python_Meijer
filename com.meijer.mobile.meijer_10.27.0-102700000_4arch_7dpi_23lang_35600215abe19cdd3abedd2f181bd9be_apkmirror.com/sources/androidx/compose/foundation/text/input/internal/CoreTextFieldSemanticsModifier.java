package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.B;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.C17708Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u0.C17188g;
import z1.InterfaceC18354E;
import z1.TextFieldValue;
import z1.TransformedText;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b\f\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/Y;", "Lu0/g;", "Lz1/U;", "transformedText", "Lz1/M;", "value", "Landroidx/compose/foundation/text/B;", "state", "", "readOnly", "enabled", "isPassword", "Lz1/E;", "offsetMapping", "Lw0/Q;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/y;", "focusRequester", "<init>", "(Lz1/U;Lz1/M;Landroidx/compose/foundation/text/B;ZZZLz1/E;Lw0/Q;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/y;)V", "n", "()Lu0/g;", "node", "", "o", "(Lu0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lz1/U;", "getTransformedText", "()Lz1/U;", "c", "Lz1/M;", "getValue", "()Lz1/M;", "d", "Landroidx/compose/foundation/text/B;", "getState", "()Landroidx/compose/foundation/text/B;", "e", "Z", "getReadOnly", "()Z", "f", "getEnabled", "g", "h", "Lz1/E;", "getOffsetMapping", "()Lz1/E;", "i", "Lw0/Q;", "getManager", "()Lw0/Q;", "j", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "k", "Landroidx/compose/ui/focus/y;", "getFocusRequester", "()Landroidx/compose/ui/focus/y;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends Y<C17188g> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextFieldValue value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final B state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean readOnly;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPassword;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC18354E offsetMapping;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final C17708Q manager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImeOptions imeOptions;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final y focusRequester;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) other;
        return Intrinsics.e(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && Intrinsics.e(this.value, coreTextFieldSemanticsModifier.value) && Intrinsics.e(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && Intrinsics.e(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && Intrinsics.e(this.manager, coreTextFieldSemanticsModifier.manager) && Intrinsics.e(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && Intrinsics.e(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C17188g getNode() {
        return new C17188g(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(C17188g node) {
        node.a3(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, B b10, boolean z10, boolean z11, boolean z12, InterfaceC18354E interfaceC18354E, C17708Q c17708q, ImeOptions imeOptions, y yVar) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = b10;
        this.readOnly = z10;
        this.enabled = z11;
        this.isPassword = z12;
        this.offsetMapping = interfaceC18354E;
        this.manager = c17708q;
        this.imeOptions = imeOptions;
        this.focusRequester = yVar;
    }
}
