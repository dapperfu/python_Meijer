package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeCombinedModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "outer", "inner", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "c", "()Landroidx/compose/ui/Modifier;", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier, FSComposeCombinedModifier {
    private final Modifier inner;
    private final Modifier outer;

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeCombinedModifier
    public final FSComposeModifier _fsGetInner() {
        Modifier modifier = this.inner;
        if (modifier instanceof FSComposeModifier) {
            return modifier;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeCombinedModifier
    public final FSComposeModifier _fsGetOuter() {
        Modifier modifier = this.outer;
        if (modifier instanceof FSComposeModifier) {
            return modifier;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Landroidx/compose/ui/Modifier$b;", "element", "a", "(Ljava/lang/String;Landroidx/compose/ui/Modifier$b;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<String, Modifier.b, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f50511f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, Modifier.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(Function1<? super Modifier.b, Boolean> predicate) {
        return this.outer.all(predicate) && this.inner.all(predicate);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(Function1<? super Modifier.b, Boolean> predicate) {
        return this.outer.any(predicate) || this.inner.any(predicate);
    }

    /* renamed from: b, reason: from getter */
    public final Modifier getInner() {
        return this.inner;
    }

    /* renamed from: c, reason: from getter */
    public final Modifier getOuter() {
        return this.outer;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) other;
        return Intrinsics.e(this.outer, combinedModifier.outer) && Intrinsics.e(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R initial, Function2<? super R, ? super Modifier.b, ? extends R> operation) {
        return (R) this.inner.foldIn(this.outer.foldIn(initial, operation), operation);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", a.f50511f)) + ']';
    }

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }
}
