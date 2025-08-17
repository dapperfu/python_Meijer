package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public interface DescriptorRendererOptions {
    void a(boolean z10);

    void b(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void c(boolean z10);

    boolean d();

    void e(boolean z10);

    void f(boolean z10);

    void g(RenderingFormat renderingFormat);

    void h(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    Set<FqName> i();

    boolean j();

    AnnotationArgumentsRenderingPolicy k();

    void l(Set<FqName> set);

    void m(Set<? extends DescriptorRendererModifier> set);

    void n(boolean z10);

    void o(ClassifierNamePolicy classifierNamePolicy);

    void p(boolean z10);

    void q(boolean z10);

    void setDebugMode(boolean z10);

    public static final class DefaultImpls {
        public static boolean a(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.k().b();
        }

        public static boolean b(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.k().e();
        }
    }
}
