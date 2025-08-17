package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;

/* loaded from: classes13.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    Collection<Name> B();

    Collection<JavaMethod> C();

    Sequence<JavaClassifierType> D();

    boolean K();

    LightClassOriginKind L();

    Collection<JavaClassifierType> a();

    FqName e();

    Collection<JavaConstructor> j();

    JavaClass l();

    Collection<JavaRecordComponent> m();

    boolean o();

    boolean q();

    boolean r();

    boolean w();

    Collection<JavaField> y();

    boolean z();
}
