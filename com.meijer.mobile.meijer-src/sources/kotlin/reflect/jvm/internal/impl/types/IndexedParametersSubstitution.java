package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* renamed from: c, reason: collision with root package name */
    private final TypeParameterDescriptor[] f147613c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeProjection[] f147614d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f147615e;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i10 & 4) != 0 ? false : z10);
    }

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z10) {
        Intrinsics.j(parameters, "parameters");
        Intrinsics.j(arguments, "arguments");
        this.f147613c = parameters;
        this.f147614d = arguments;
        this.f147615e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.f147615e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType key) {
        Intrinsics.j(key, "key");
        ClassifierDescriptor classifierDescriptorD = key.K0().d();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorD instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorD : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f147613c;
        if (index >= typeParameterDescriptorArr.length || !Intrinsics.e(typeParameterDescriptorArr[index].i(), typeParameterDescriptor.i())) {
            return null;
        }
        return this.f147614d[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean f() {
        return this.f147614d.length == 0;
    }

    public final TypeProjection[] i() {
        return this.f147614d;
    }

    public final TypeParameterDescriptor[] j() {
        return this.f147613c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(List<? extends TypeParameterDescriptor> parameters, List<? extends TypeProjection> argumentsList) {
        this((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) argumentsList.toArray(new TypeProjection[0]), false, 4, null);
        Intrinsics.j(parameters, "parameters");
        Intrinsics.j(argumentsList, "argumentsList");
    }
}
