package androidx.compose.foundation;

import androidx.compose.ui.node.Y;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13428B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/e;", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "<init>", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "n", "()Landroidx/compose/foundation/e;", "node", "o", "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lh0/l;", "c", "Ld0/B;", "d", "Z", "e", "Ljava/lang/String;", "f", "Landroidx/compose/ui/semantics/Role;", "g", "Lkotlin/jvm/functions/Function0;", "h", "i", "j", "k", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedClickableElement extends Y<e> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0.l interactionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13428B indicationNodeFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String onClickLabel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Role role;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String onLongClickLabel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onLongClick;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onDoubleClick;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean hapticFeedbackEnabled;

    public /* synthetic */ CombinedClickableElement(h0.l lVar, InterfaceC13428B interfaceC13428B, boolean z10, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, interfaceC13428B, z10, str, role, function0, str2, function02, function03, z11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || CombinedClickableElement.class != other.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) other;
        return Intrinsics.e(this.interactionSource, combinedClickableElement.interactionSource) && Intrinsics.e(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.enabled == combinedClickableElement.enabled && Intrinsics.e(this.onClickLabel, combinedClickableElement.onClickLabel) && Intrinsics.e(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && Intrinsics.e(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
    }

    private CombinedClickableElement(h0.l lVar, InterfaceC13428B interfaceC13428B, boolean z10, String str, Role role, Function0<Unit> function0, String str2, Function0<Unit> function02, Function0<Unit> function03, boolean z11) {
        this.interactionSource = lVar;
        this.indicationNodeFactory = interfaceC13428B;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
        this.onDoubleClick = function03;
        this.hapticFeedbackEnabled = z11;
    }

    public int hashCode() {
        h0.l lVar = this.interactionSource;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        InterfaceC13428B interfaceC13428B = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC13428B != null ? interfaceC13428B.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        int iN = (((iHashCode3 + (role != null ? Role.n(role.getValue()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iN + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function02 = this.onDoubleClick;
        return ((iHashCode5 + (function02 != null ? function02.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e b() {
        return new e(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(e node) {
        node.t3(this.hapticFeedbackEnabled);
        node.u3(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }
}
