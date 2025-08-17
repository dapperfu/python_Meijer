package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public interface JavaAnnotationOwner extends JavaElement {
    boolean E();

    Collection<JavaAnnotation> getAnnotations();

    JavaAnnotation i(FqName fqName);
}
