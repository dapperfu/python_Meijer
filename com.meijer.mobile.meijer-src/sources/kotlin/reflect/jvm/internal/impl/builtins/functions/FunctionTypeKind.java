package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public abstract class FunctionTypeKind {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f144380a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144381b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144382c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassId f144383d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f144384e;

    public static final class Function extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final Function f144385f = new Function();

        private Function() {
            super(StandardNames.f144191A, "Function", false, null, true);
        }
    }

    public static final class KFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final KFunction f144386f = new KFunction();

        private KFunction() {
            super(StandardNames.f144224x, "KFunction", true, null, false);
        }
    }

    public static final class KSuspendFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final KSuspendFunction f144387f = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.f144224x, "KSuspendFunction", true, null, false);
        }
    }

    public static final class SuspendFunction extends FunctionTypeKind {

        /* renamed from: f, reason: collision with root package name */
        public static final SuspendFunction f144388f = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.f144219s, "SuspendFunction", false, null, true);
        }
    }

    public FunctionTypeKind(FqName packageFqName, String classNamePrefix, boolean z10, ClassId classId, boolean z11) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(classNamePrefix, "classNamePrefix");
        this.f144380a = packageFqName;
        this.f144381b = classNamePrefix;
        this.f144382c = z10;
        this.f144383d = classId;
        this.f144384e = z11;
    }

    public final String a() {
        return this.f144381b;
    }

    public final FqName b() {
        return this.f144380a;
    }

    public final Name c(int i10) {
        Name nameO = Name.o(this.f144381b + i10);
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    public String toString() {
        return this.f144380a + '.' + this.f144381b + 'N';
    }
}
