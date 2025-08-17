package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public abstract class FunctionTypeKind {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f143473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f143474b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f143475c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassId f143476d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f143477e;

    public static final class Function extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final Function f143478f = new Function();

        private Function() {
            super(StandardNames.f143284A, "Function", false, null, true);
        }
    }

    public static final class KFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final KFunction f143479f = new KFunction();

        private KFunction() {
            super(StandardNames.f143317x, "KFunction", true, null, false);
        }
    }

    public static final class KSuspendFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final KSuspendFunction f143480f = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.f143317x, "KSuspendFunction", true, null, false);
        }
    }

    public static final class SuspendFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final SuspendFunction f143481f = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.f143312s, "SuspendFunction", false, null, true);
        }
    }

    public FunctionTypeKind(FqName packageFqName, String classNamePrefix, boolean z10, ClassId classId, boolean z11) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(classNamePrefix, "classNamePrefix");
        this.f143473a = packageFqName;
        this.f143474b = classNamePrefix;
        this.f143475c = z10;
        this.f143476d = classId;
        this.f143477e = z11;
    }

    public final String a() {
        return this.f143474b;
    }

    public final FqName b() {
        return this.f143473a;
    }

    public final Name c(int i10) {
        Name nameO = Name.o(this.f143474b + i10);
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    public String toString() {
        return this.f143473a + '.' + this.f143474b + 'N';
    }
}
