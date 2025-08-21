package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    Collection<JavaClass> G(Function1<? super Name, Boolean> function1);

    FqName e();

    Collection<JavaPackage> v();
}
