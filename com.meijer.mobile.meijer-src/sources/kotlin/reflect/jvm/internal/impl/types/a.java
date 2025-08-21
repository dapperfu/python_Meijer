package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes14.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f147712a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeCheckerState f147713b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeSystemContext f147714c;

    /* renamed from: d, reason: collision with root package name */
    private final RigidTypeMarker f147715d;

    public a(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        this.f147712a = collection;
        this.f147713b = typeCheckerState;
        this.f147714c = typeSystemContext;
        this.f147715d = rigidTypeMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeChecker.x(this.f147712a, this.f147713b, this.f147714c, this.f147715d, (TypeCheckerState.ForkPointContext) obj);
    }
}
