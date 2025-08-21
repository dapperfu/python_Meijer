package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import r1.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001aR0\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\n\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "parentValue", "childValue", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lr1/u;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "value", "", "d", "(Lr1/u;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "<set-?>", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, T, T> mergePolicy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isImportantForAccessibility;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function2<T, T, T> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52628f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(T t10, T t11) {
            return t10 == null ? t11 : t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.name = str;
        this.mergePolicy = function2;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    public final T c(T parentValue, T childValue) {
        return this.mergePolicy.invoke(parentValue, childValue);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public final void d(u thisRef, KProperty<?> property, T value) {
        thisRef.a(this, value);
    }

    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f52628f : function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z10;
    }

    public SemanticsPropertyKey(String str, boolean z10, Function2<? super T, ? super T, ? extends T> function2) {
        this(str, function2);
        this.isImportantForAccessibility = z10;
    }
}
