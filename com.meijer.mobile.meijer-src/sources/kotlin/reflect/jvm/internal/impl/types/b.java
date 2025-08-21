package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeCheckerState f147716a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f147717b;

    /* renamed from: c, reason: collision with root package name */
    private final RigidTypeMarker f147718c;

    /* renamed from: d, reason: collision with root package name */
    private final RigidTypeMarker f147719d;

    public b(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f147716a = typeCheckerState;
        this.f147717b = typeSystemContext;
        this.f147718c = rigidTypeMarker;
        this.f147719d = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.y(this.f147716a, this.f147717b, this.f147718c, this.f147719d));
    }
}
