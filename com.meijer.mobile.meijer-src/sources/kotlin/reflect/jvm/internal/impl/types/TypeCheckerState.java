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
/* loaded from: classes14.dex */
public class TypeCheckerState {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f147649a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f147650b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f147651c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147652d;

    /* renamed from: e, reason: collision with root package name */
    private final TypeSystemContext f147653e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractTypePreparator f147654f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractTypeRefiner f147655g;

    /* renamed from: h, reason: collision with root package name */
    private int f147656h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f147657i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayDeque<RigidTypeMarker> f147658j;

    /* renamed from: k, reason: collision with root package name */
    private Set<RigidTypeMarker> f147659k;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* renamed from: a, reason: collision with root package name */
            private boolean f147660a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void a(Function0<Boolean> block) {
                Intrinsics.j(block, "block");
                if (this.f147660a) {
                    return;
                }
                this.f147660a = block.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f147660a;
            }
        }

        void a(Function0<Boolean> function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f147661a = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f147662b = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final LowerCapturedTypePolicy f147663c = new LowerCapturedTypePolicy("SKIP_LOWER", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ LowerCapturedTypePolicy[] f147664d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f147665e;

        private static final /* synthetic */ LowerCapturedTypePolicy[] a() {
            return new LowerCapturedTypePolicy[]{f147661a, f147662b, f147663c};
        }

        static {
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArrA = a();
            f147664d = lowerCapturedTypePolicyArrA;
            f147665e = EnumEntriesKt.a(lowerCapturedTypePolicyArrA);
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) f147664d.clone();
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
            public static final LowerIfFlexible f147666a = new LowerIfFlexible();

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
            public static final None f147667a = new None();

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
            public static final UpperIfFlexible f147668a = new UpperIfFlexible();

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
        this.f147657i = true;
        if (this.f147658j == null) {
            this.f147658j = new ArrayDeque<>(4);
        }
        if (this.f147659k == null) {
            this.f147659k = SmartSet.f148085c.a();
        }
    }

    public TypeCheckerState(boolean z10, boolean z11, boolean z12, boolean z13, TypeSystemContext typeSystemContext, AbstractTypePreparator kotlinTypePreparator, AbstractTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(typeSystemContext, "typeSystemContext");
        Intrinsics.j(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f147649a = z10;
        this.f147650b = z11;
        this.f147651c = z12;
        this.f147652d = z13;
        this.f147653e = typeSystemContext;
        this.f147654f = kotlinTypePreparator;
        this.f147655g = kotlinTypeRefiner;
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
        ArrayDeque<RigidTypeMarker> arrayDeque = this.f147658j;
        Intrinsics.g(arrayDeque);
        arrayDeque.clear();
        Set<RigidTypeMarker> set = this.f147659k;
        Intrinsics.g(set);
        set.clear();
        this.f147657i = false;
    }

    public LowerCapturedTypePolicy g(RigidTypeMarker subType, CapturedTypeMarker superType) {
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return LowerCapturedTypePolicy.f147662b;
    }

    public final ArrayDeque<RigidTypeMarker> h() {
        return this.f147658j;
    }

    public final Set<RigidTypeMarker> i() {
        return this.f147659k;
    }

    public final TypeSystemContext j() {
        return this.f147653e;
    }

    public final boolean l(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f147652d && this.f147653e.S(type);
    }

    public final boolean m() {
        return this.f147651c;
    }

    public final boolean n() {
        return this.f147649a;
    }

    public final boolean o() {
        return this.f147650b;
    }

    public final KotlinTypeMarker p(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f147654f.a(type);
    }

    public final KotlinTypeMarker q(KotlinTypeMarker type) {
        Intrinsics.j(type, "type");
        return this.f147655g.a(type);
    }

    public boolean r(Function1<? super ForkPointContext, Unit> block) {
        Intrinsics.j(block, "block");
        ForkPointContext.Default r02 = new ForkPointContext.Default();
        block.invoke(r02);
        return r02.b();
    }
}
