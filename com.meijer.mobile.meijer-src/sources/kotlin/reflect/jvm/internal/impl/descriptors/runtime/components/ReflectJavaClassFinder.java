package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f144946a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public Set<String> c(FqName packageFqName) {
        Intrinsics.j(packageFqName, "packageFqName");
        return null;
    }

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        Intrinsics.j(classLoader, "classLoader");
        this.f144946a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaClass a(JavaClassFinder.Request request) {
        Intrinsics.j(request, "request");
        ClassId classIdA = request.a();
        FqName fqNameF = classIdA.f();
        String strP = StringsKt.P(classIdA.g().a(), '.', '$', false, 4, null);
        if (!fqNameF.c()) {
            strP = fqNameF.a() + '.' + strP;
        }
        Class<?> clsA = ReflectJavaClassFinderKt.a(this.f144946a, strP);
        if (clsA != null) {
            return new ReflectJavaClass(clsA);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaPackage b(FqName fqName, boolean z10) {
        Intrinsics.j(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }
}
