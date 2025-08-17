package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes13.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final FULLY_QUALIFIED f145982a = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String a(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            Intrinsics.j(classifier, "classifier");
            Intrinsics.j(renderer, "renderer");
            if (classifier instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifier).getName();
                Intrinsics.i(name, "getName(...)");
                return renderer.S(name, false);
            }
            FqNameUnsafe fqNameUnsafeM = DescriptorUtils.m(classifier);
            Intrinsics.i(fqNameUnsafeM, "getFqName(...)");
            return renderer.R(fqNameUnsafeM);
        }

        private FULLY_QUALIFIED() {
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final SHORT f145983a = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String a(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            Intrinsics.j(classifier, "classifier");
            Intrinsics.j(renderer, "renderer");
            if (classifier instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifier).getName();
                Intrinsics.i(name, "getName(...)");
                return renderer.S(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof ClassDescriptor);
            return RenderingUtilsKt.c(CollectionsKt.U(arrayList));
        }

        private SHORT() {
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final SOURCE_CODE_QUALIFIED f145984a = new SOURCE_CODE_QUALIFIED();

        private final String c(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                return b((ClassifierDescriptor) declarationDescriptor);
            }
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return RenderingUtilsKt.a(((PackageFragmentDescriptor) declarationDescriptor).e().i());
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String a(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            Intrinsics.j(classifier, "classifier");
            Intrinsics.j(renderer, "renderer");
            return b(classifier);
        }

        private SOURCE_CODE_QUALIFIED() {
        }

        private final String b(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            Intrinsics.i(name, "getName(...)");
            String strB = RenderingUtilsKt.b(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return strB;
            }
            DeclarationDescriptor declarationDescriptorB = classifierDescriptor.b();
            Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
            String strC = c(declarationDescriptorB);
            if (strC != null && !Intrinsics.e(strC, "")) {
                return strC + '.' + strB;
            }
            return strB;
        }
    }

    String a(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer);
}
