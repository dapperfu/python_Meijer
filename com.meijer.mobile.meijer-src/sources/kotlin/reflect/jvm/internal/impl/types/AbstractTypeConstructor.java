package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* renamed from: b, reason: collision with root package name */
    private final NotNullLazyValue<b> f147579b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f147580c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements TypeConstructor {

        /* renamed from: a, reason: collision with root package name */
        private final KotlinTypeRefiner f147581a;

        /* renamed from: b, reason: collision with root package name */
        private final Lazy f147582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractTypeConstructor f147583c;

        public a(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f147583c = abstractTypeConstructor;
            this.f147581a = kotlinTypeRefiner;
            this.f147582b = LazyKt.a(LazyThreadSafetyMode.f143287b, new j(this, abstractTypeConstructor));
        }

        private final List<KotlinType> g() {
            return (List) this.f147582b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List i(a aVar, AbstractTypeConstructor abstractTypeConstructor) {
            return KotlinTypeRefinerKt.b(aVar.f147581a, abstractTypeConstructor.a());
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f147583c.b(kotlinTypeRefiner);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public ClassifierDescriptor d() {
            return this.f147583c.d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return this.f147583c.e();
        }

        public boolean equals(Object obj) {
            return this.f147583c.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.f147583c.getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f147583c.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns l() {
            KotlinBuiltIns kotlinBuiltInsL = this.f147583c.l();
            Intrinsics.i(kotlinBuiltInsL, "getBuiltIns(...)");
            return kotlinBuiltInsL;
        }

        public String toString() {
            return this.f147583c.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<KotlinType> a() {
            return g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection<KotlinType> f147584a;

        /* renamed from: b, reason: collision with root package name */
        private List<? extends KotlinType> f147585b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends KotlinType> allSupertypes) {
            Intrinsics.j(allSupertypes, "allSupertypes");
            this.f147584a = allSupertypes;
            this.f147585b = CollectionsKt.e(ErrorUtils.f147897a.l());
        }

        public final Collection<KotlinType> a() {
            return this.f147584a;
        }

        public final List<KotlinType> b() {
            return this.f147585b;
        }

        public final void c(List<? extends KotlinType> list) {
            Intrinsics.j(list, "<set-?>");
            this.f147585b = list;
        }
    }

    protected abstract Collection<KotlinType> r();

    protected KotlinType s() {
        return null;
    }

    protected abstract SupertypeLoopChecker v();

    protected List<KotlinType> x(List<KotlinType> supertypes) {
        Intrinsics.j(supertypes, "supertypes");
        return supertypes;
    }

    protected void y(KotlinType type) {
        Intrinsics.j(type, "type");
    }

    protected void z(KotlinType type) {
        Intrinsics.j(type, "type");
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        Intrinsics.j(storageManager, "storageManager");
        this.f147579b = storageManager.f(new c(this), d.f147765a, new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(AbstractTypeConstructor abstractTypeConstructor) {
        return new b(abstractTypeConstructor.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(CollectionsKt.e(ErrorUtils.f147897a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(AbstractTypeConstructor abstractTypeConstructor, b supertypes) {
        Intrinsics.j(supertypes, "supertypes");
        List listA = abstractTypeConstructor.v().a(abstractTypeConstructor, supertypes.a(), new f(abstractTypeConstructor), new g(abstractTypeConstructor));
        if (listA.isEmpty()) {
            KotlinType kotlinTypeS = abstractTypeConstructor.s();
            List listE = kotlinTypeS != null ? CollectionsKt.e(kotlinTypeS) : null;
            if (listE == null) {
                listE = CollectionsKt.m();
            }
            listA = listE;
        }
        if (abstractTypeConstructor.u()) {
            abstractTypeConstructor.v().a(abstractTypeConstructor, listA, new h(abstractTypeConstructor), new i(abstractTypeConstructor));
        }
        List<KotlinType> listJ1 = listA instanceof List ? (List) listA : null;
        if (listJ1 == null) {
            listJ1 = CollectionsKt.j1(listA);
        }
        supertypes.c(abstractTypeConstructor.x(listJ1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        Intrinsics.j(it, "it");
        return abstractTypeConstructor.q(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        Intrinsics.j(it, "it");
        abstractTypeConstructor.z(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        Intrinsics.j(it, "it");
        return abstractTypeConstructor.q(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        Intrinsics.j(it, "it");
        abstractTypeConstructor.y(it);
        return Unit.f143329a;
    }

    private final Collection<KotlinType> q(TypeConstructor typeConstructor, boolean z10) {
        List listP0;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (listP0 = CollectionsKt.P0(abstractTypeConstructor.f147579b.invoke().a(), abstractTypeConstructor.t(z10))) != null) {
            return listP0;
        }
        Collection<KotlinType> collectionA = typeConstructor.a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected boolean u() {
        return this.f147580c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public List<KotlinType> a() {
        return this.f147579b.invoke().b();
    }

    protected Collection<KotlinType> t(boolean z10) {
        return CollectionsKt.m();
    }
}
