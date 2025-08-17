package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes13.dex */
public class TypeCheckerState {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146742a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146743b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f146744c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f146745d;

    /* renamed from: e, reason: collision with root package name */
    private final TypeSystemContext f146746e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractTypePreparator f146747f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractTypeRefiner f146748g;

    /* renamed from: h, reason: collision with root package name */
    private int f146749h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f146750i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayDeque<RigidTypeMarker> f146751j;

    /* renamed from: k, reason: collision with root package name */
    private Set<RigidTypeMarker> f146752k;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* renamed from: a, reason: collision with root package name */
            private boolean f146753a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void a(Function0<Boolean> block) {
                Intrinsics.j(block, "block");
                if (this.f146753a) {
                    return;
                }
                this.f146753a = block.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f146753a;
            }
        }

        void a(Function0<Boolean> function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f146754a = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f146755b = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f146756c = new LowerCapturedTypePolicy("SKIP_LOWER", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ LowerCapturedTypePolicy[] f146757d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f146758e;

        private static final /* synthetic */ LowerCapturedTypePolicy[] a() {
            return new LowerCapturedTypePolicy[]{f146754a, f146755b, f146756c};
        }

        static {
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArrA = a();
            f146757d = lowerCapturedTypePolicyArrA;
            f146758e = EnumEntriesKt.a(lowerCapturedTypePolicyArrA);
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) f146757d.clone();
        }

        private LowerCapturedTypePolicy(String str, int i10) {
        }
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        @SourceDebugExtension
        public static final class LowerIfFlexible extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final LowerIfFlexible f146759a = new LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.j(state, "state");
                Intrinsics.j(type, "type");
                return state.j().A0(type);
            }
        }

        public static final class None extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final None f146760a = new None();

            private None() {
                super(null);
            }

            public Void b(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.j(state, "state");
                Intrinsics.j(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public /* bridge */ /* synthetic */ RigidTypeMarker a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (RigidTypeMarker) b(typeCheckerState, kotlinTypeMarker);
            }
        }

        @SourceDebugExtension
        public static final class UpperIfFlexible extends SupertypesPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final UpperIfFlexible f146761a = new UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            public RigidTypeMarker a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.j(state, "state");
                Intrinsics.j(type, "type");
                return state.j().C(type);
            }
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract RigidTypeMarker a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }
    }

    public Boolean c(KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z10) {
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return null;
    }

    public boolean f(KotlinTypeMarker subType, KotlinTypeMarker superType) {
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return true;
    }

    public final void k() {
        this.f146750i = true;
        if (this.f146751j == null) {
            this.f146751j = new ArrayDeque<>(4);
        }
        if (this.f146752k == null) {
            this.f146752k = SmartSet.f147178c.a();
        }
    }

    public TypeCheckerState(boolean z10, boolean z11, boolean z12, boolean z13, TypeSystemContext typeSystemContext, AbstractTypePreparator kotlinTypePreparator, AbstractTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(typeSystemContext, "typeSystemContext");
        Intrinsics.j(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f146742a = z10;
        this.f146743b = z11;
        this.f146744c = z12;
        this.f146745d = z13;
        this.f146746e = typeSystemContext;
        this.f146747f = kotlinTypePreparator;
        this.f146748g = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return typeCheckerState.c(kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    public final void e() {
        ArrayDeque<RigidTypeMarker> arrayDeque = this.f146751j;
        Intrinsics.g(arrayDeque);
        arrayDeque.clear();
        Set<RigidTypeMarker> set = this.f146752k;
        Intrinsics.g(set);
        set.clear();
        this.f146750i = false;
    }

    public LowerCapturedTypePolicy g(RigidTypeMarker subType, CapturedTypeMarker superType) {
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return LowerCapturedTypePolicy.f146755b;
    }

    public final ArrayDeque<RigidTypeMarker> h() {
        return this.f146751j;
    }

    public final Set<RigidTypeMarker> i() {
        return this.f146752k;
    }

    public final TypeSystemContext j() {
        return this.f146746e;
    }

    public final boolean l(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f146745d && this.f146746e.S(type);
    }

    public final boolean m() {
        return this.f146744c;
    }

    public final boolean n() {
        return this.f146742a;
    }

    public final boolean o() {
        return this.f146743b;
    }

    public final KotlinTypeMarker p(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f146747f.a(type);
    }

    public final KotlinTypeMarker q(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f146748g.a(type);
    }

    public boolean r(Function1<? super ForkPointContext, Unit> block) {
        Intrinsics.j(block, "block");
        ForkPointContext.Default r02 = new ForkPointContext.Default();
        block.invoke(r02);
        return r02.b();
    }
}
