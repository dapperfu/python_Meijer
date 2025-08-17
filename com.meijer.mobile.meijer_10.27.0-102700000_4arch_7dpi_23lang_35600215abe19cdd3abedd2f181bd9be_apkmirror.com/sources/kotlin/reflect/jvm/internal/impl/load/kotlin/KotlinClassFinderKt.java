package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes13.dex */
public final class KotlinClassFinderKt {
    public static final KotlinJvmBinaryClass a(KotlinClassFinder kotlinClassFinder, JavaClass javaClass, MetadataVersion metadataVersion) {
        Intrinsics.j(kotlinClassFinder, "<this>");
        Intrinsics.j(javaClass, "javaClass");
        Intrinsics.j(metadataVersion, "metadataVersion");
        KotlinClassFinder.Result resultC = kotlinClassFinder.c(javaClass, metadataVersion);
        if (resultC != null) {
            return resultC.a();
        }
        return null;
    }

    public static final KotlinJvmBinaryClass b(KotlinClassFinder kotlinClassFinder, ClassId classId, MetadataVersion metadataVersion) {
        Intrinsics.j(kotlinClassFinder, "<this>");
        Intrinsics.j(classId, "classId");
        Intrinsics.j(metadataVersion, "metadataVersion");
        KotlinClassFinder.Result resultA = kotlinClassFinder.a(classId, metadataVersion);
        if (resultA != null) {
            return resultA.a();
        }
        return null;
    }
}
