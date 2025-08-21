package r1;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function;", "", "T", "Lr1/a;", "parentValue", "childValue", "a", "(Lr1/a;Lr1/a;)Lr1/a;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends Lambda implements Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>> {

    /* renamed from: f, reason: collision with root package name */
    public static final r f159187f = new r();

    public r() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityAction<Function<? extends Boolean>> invoke(AccessibilityAction<Function<? extends Boolean>> accessibilityAction, AccessibilityAction<Function<? extends Boolean>> accessibilityAction2) {
        String label;
        Function functionA;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (functionA = accessibilityAction.a()) == null) {
            functionA = accessibilityAction2.a();
        }
        return new AccessibilityAction<>(label, functionA);
    }
}
