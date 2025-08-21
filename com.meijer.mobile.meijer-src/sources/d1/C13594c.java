package d1;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\f\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Ld1/c;", "Ld1/b;", "Ld1/a;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lkotlin/jvm/functions/Function1;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()I", "(I)V", "inputMode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13594c implements InterfaceC13593b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<C13592a, Boolean> onRequestInputModeChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 inputMode;

    public /* synthetic */ C13594c(int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13594c(int i10, Function1<? super C13592a, Boolean> function1) {
        this.onRequestInputModeChange = function1;
        this.inputMode = t1.e(C13592a.c(i10), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d1.InterfaceC13593b
    public int a() {
        return ((C13592a) this.inputMode.getValue()).getValue();
    }

    public void b(int i10) {
        this.inputMode.setValue(C13592a.c(i10));
    }
}
