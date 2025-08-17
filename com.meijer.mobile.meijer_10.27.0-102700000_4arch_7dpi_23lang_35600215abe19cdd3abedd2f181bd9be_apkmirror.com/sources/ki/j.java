package ki;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R@\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lki/j;", "LIi/g;", "", "", "Lki/b;", "Lcom/meijer/mobile/android_acres_library/atomic_providers/accordion/StepProvider;", "selectedIndex", "initialScope", "<init>", "(ILki/b;)V", "c", "I", "getSelectedIndex", "()I", "d", "Lki/b;", "s", "()Lki/b;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "Lkotlin/ExtensionFunctionType;", "e", "Lkotlin/jvm/functions/Function2;", "j", "()Lkotlin/jvm/functions/Function2;", "scopeFactory", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j extends Ii.g<Integer, Object, b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int selectedIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b initialScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<b, Integer, b> scopeFactory;

    public j(int i10, b initialScope) {
        Intrinsics.j(initialScope, "initialScope");
        this.selectedIndex = i10;
        this.initialScope = initialScope;
        this.scopeFactory = new Function2() { // from class: ki.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.t(this.f142004a, (b) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(j jVar, b bVar, int i10) {
        Intrinsics.j(bVar, "<this>");
        return new b(i10 == jVar.selectedIndex, bVar.getSingleSelection(), i10, bVar.getLocalThemeScope(), bVar.getTemplate());
    }

    @Override // Ii.g
    public Function2<b, Integer, b> j() {
        return this.scopeFactory;
    }

    @Override // Ii.i
    /* renamed from: s, reason: from getter */
    public b getInitialScope() {
        return this.initialScope;
    }
}
