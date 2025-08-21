package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f144983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaArrayAnnotationArgument(Name name, Object[] values) {
        super(name, null);
        Intrinsics.j(values, "values");
        this.f144983c = values;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    public List<ReflectJavaAnnotationArgument> getElements() {
        Object[] objArr = this.f144983c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f144980b;
            Intrinsics.g(obj);
            arrayList.add(factory.a(obj, null));
        }
        return arrayList;
    }
}
