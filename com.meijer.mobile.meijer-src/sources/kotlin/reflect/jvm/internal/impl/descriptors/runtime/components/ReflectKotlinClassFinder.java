package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f144950a;

    /* renamed from: b, reason: collision with root package name */
    private final BuiltInsResourceLoader f144951b;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        Intrinsics.j(classLoader, "classLoader");
        this.f144950a = classLoader;
        this.f144951b = new BuiltInsResourceLoader();
    }

    private final KotlinClassFinder.Result d(String str) {
        ReflectKotlinClass reflectKotlinClassA;
        Class<?> clsA = ReflectJavaClassFinderKt.a(this.f144950a, str);
        if (clsA == null || (reflectKotlinClassA = ReflectKotlinClass.f144947c.a(clsA)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassA, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result a(ClassId classId, MetadataVersion metadataVersion) {
        Intrinsics.j(classId, "classId");
        Intrinsics.j(metadataVersion, "metadataVersion");
        return d(ReflectKotlinClassFinderKt.b(classId));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public InputStream b(FqName packageFqName) {
        Intrinsics.j(packageFqName, "packageFqName");
        if (packageFqName.h(StandardNames.f144226z)) {
            return this.f144951b.a(BuiltInSerializerProtocol.f147358r.r(packageFqName));
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result c(JavaClass javaClass, MetadataVersion metadataVersion) {
        String strA;
        Intrinsics.j(javaClass, "javaClass");
        Intrinsics.j(metadataVersion, "metadataVersion");
        FqName fqNameE = javaClass.e();
        if (fqNameE == null || (strA = fqNameE.a()) == null) {
            return null;
        }
        return d(strA);
    }
}
