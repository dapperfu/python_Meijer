package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* loaded from: classes14.dex */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    boolean N();

    JavaType getReturnType();

    List<JavaValueParameter> h();

    JavaAnnotationArgument p();
}
