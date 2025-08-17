package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes13.dex */
public class AnnotatedImpl implements Annotated {

    /* renamed from: a, reason: collision with root package name */
    private final Annotations f143667a;

    private static /* synthetic */ void e0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public AnnotatedImpl(Annotations annotations) {
        if (annotations == null) {
            e0(0);
        }
        this.f143667a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f143667a;
        if (annotations == null) {
            e0(1);
        }
        return annotations;
    }
}
