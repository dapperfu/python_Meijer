package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    /* renamed from: s3, reason: collision with root package name */
    public static final Companion f144596s3 = Companion.f144597a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144597a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final Annotations f144598b = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            public Void a(FqName fqName) {
                Intrinsics.j(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public /* bridge */ /* synthetic */ AnnotationDescriptor i(FqName fqName) {
                return (AnnotationDescriptor) a(fqName);
            }

            @Override // java.lang.Iterable
            public Iterator<AnnotationDescriptor> iterator() {
                return CollectionsKt.m().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean p3(FqName fqName) {
                return Annotations.DefaultImpls.b(this, fqName);
            }
        };

        public final Annotations a(List<? extends AnnotationDescriptor> annotations) {
            Intrinsics.j(annotations, "annotations");
            return annotations.isEmpty() ? f144598b : new AnnotationsImpl(annotations);
        }

        public final Annotations b() {
            return f144598b;
        }

        private Companion() {
        }
    }

    @SourceDebugExtension
    public static final class DefaultImpls {
        public static AnnotationDescriptor a(Annotations annotations, FqName fqName) {
            AnnotationDescriptor next;
            Intrinsics.j(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(next.e(), fqName)) {
                    break;
                }
            }
            return next;
        }

        public static boolean b(Annotations annotations, FqName fqName) {
            Intrinsics.j(fqName, "fqName");
            return annotations.i(fqName) != null;
        }
    }

    AnnotationDescriptor i(FqName fqName);

    boolean isEmpty();

    boolean p3(FqName fqName);
}
