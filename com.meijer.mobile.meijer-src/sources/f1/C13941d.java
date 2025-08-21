package f1;

import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.C0;
import androidx.compose.ui.node.InterfaceC5956j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf1/a;", "connection", "Lf1/b;", "dispatcher", "Landroidx/compose/ui/node/j;", "c", "(Lf1/a;Lf1/b;)Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/B0;", "T", "b", "(Landroidx/compose/ui/node/B0;)Landroidx/compose/ui/node/B0;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13941d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/B0;", "T", "it", "", "a", "(Landroidx/compose/ui/node/B0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f1.d$a */
    static final class a<T> extends Lambda implements Function1<T, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<T> f131450f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<T> objectRef) {
            super(1);
            this.f131450f = objectRef;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(B0 b02) {
            boolean z10;
            if (b02.getNode().getIsAttached()) {
                this.f131450f.f143742a = b02;
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends B0> T b(T t10) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0.d(t10, new a(objectRef));
        return (T) objectRef.f143742a;
    }

    public static final InterfaceC5956j c(InterfaceC13938a interfaceC13938a, C13939b c13939b) {
        return new C13940c(interfaceC13938a, c13939b);
    }
}
