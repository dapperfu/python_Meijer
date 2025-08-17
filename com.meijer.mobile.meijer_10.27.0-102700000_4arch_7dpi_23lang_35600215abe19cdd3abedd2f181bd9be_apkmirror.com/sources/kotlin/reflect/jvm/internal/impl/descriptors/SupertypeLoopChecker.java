package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes13.dex */
public interface SupertypeLoopChecker {
    Collection<KotlinType> a(TypeConstructor typeConstructor, Collection<? extends KotlinType> collection, Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, Function1<? super KotlinType, Unit> function12);

    public static final class EMPTY implements SupertypeLoopChecker {

        /* renamed from: a, reason: collision with root package name */
        public static final EMPTY f143649a = new EMPTY();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public Collection<KotlinType> a(TypeConstructor currentTypeConstructor, Collection<? extends KotlinType> superTypes, Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> neighbors, Function1<? super KotlinType, Unit> reportLoop) {
            Intrinsics.j(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.j(superTypes, "superTypes");
            Intrinsics.j(neighbors, "neighbors");
            Intrinsics.j(reportLoop, "reportLoop");
            return superTypes;
        }

        private EMPTY() {
        }
    }
}
