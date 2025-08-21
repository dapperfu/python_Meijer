package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes14.dex */
public interface SourceElement {

    /* renamed from: a, reason: collision with root package name */
    public static final SourceElement f144554a = new a();

    static class a implements SourceElement {
        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile b() {
            SourceFile sourceFile = SourceFile.f144555a;
            if (sourceFile == null) {
                d(0);
            }
            return sourceFile;
        }

        public String toString() {
            return "NO_SOURCE";
        }

        a() {
        }
    }

    SourceFile b();
}
