package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class ClassicTypeCheckerStateKt {
    public static final TypeCheckerState a(boolean z10, boolean z11, ClassicTypeSystemContext typeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(typeSystemContext, "typeSystemContext");
        Intrinsics.j(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z10, z11, false, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ TypeCheckerState b(boolean z10, boolean z11, ClassicTypeSystemContext classicTypeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            classicTypeSystemContext = SimpleClassicTypeSystemContext.f146839a;
        }
        if ((i10 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.f146817a;
        }
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = KotlinTypeRefiner.Default.f146818a;
        }
        return a(z10, z11, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
