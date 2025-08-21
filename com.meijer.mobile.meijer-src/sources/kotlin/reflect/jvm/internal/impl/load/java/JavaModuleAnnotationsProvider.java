package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes14.dex */
public interface JavaModuleAnnotationsProvider {
    List<JavaAnnotation> a(ClassId classId);
}
