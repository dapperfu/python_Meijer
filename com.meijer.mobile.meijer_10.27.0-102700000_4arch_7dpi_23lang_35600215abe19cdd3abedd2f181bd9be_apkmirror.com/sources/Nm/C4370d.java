package Nm;

import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"LNm/d;", "Landroidx/lifecycle/f;", "Lkotlin/Function0;", "", "onCreateBlock", "onResumeBlock", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "a", "Lkotlin/jvm/functions/Function0;", "getOnCreateBlock", "()Lkotlin/jvm/functions/Function0;", "b", "getOnResumeBlock", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nm.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4370d implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onCreateBlock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onResumeBlock;

    public C4370d(Function0<Unit> onCreateBlock, Function0<Unit> onResumeBlock) {
        Intrinsics.j(onCreateBlock, "onCreateBlock");
        Intrinsics.j(onResumeBlock, "onResumeBlock");
        this.onCreateBlock = onCreateBlock;
        this.onResumeBlock = onResumeBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f142422a;
    }

    @Override // androidx.view.InterfaceC6015f
    public void onCreate(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        this.onCreateBlock.invoke();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        this.onResumeBlock.invoke();
    }

    public /* synthetic */ C4370d(Function0 function0, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: Nm.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4370d.c();
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: Nm.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4370d.d();
            }
        } : function02);
    }
}
